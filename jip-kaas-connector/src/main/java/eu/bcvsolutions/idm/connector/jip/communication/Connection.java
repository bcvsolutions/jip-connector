package eu.bcvsolutions.idm.connector.jip.communication;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.identityconnectors.common.logging.Log;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.exceptions.ConnectionFailedException;
import org.identityconnectors.framework.common.exceptions.ConnectorException;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.AttributeBuilder;
import org.identityconnectors.framework.common.objects.Uid;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import eu.bcvsolutions.idm.connector.jip.JipConfiguration;
import eu.bcvsolutions.idm.connector.jip.JipConnector;
import eu.bcvsolutions.idm.connector.jip.entity.CreateUserRequest;
import eu.bcvsolutions.idm.connector.jip.entity.CreateUserResponse;
import eu.bcvsolutions.idm.connector.jip.entity.CzpOfficeRoleType;
import eu.bcvsolutions.idm.connector.jip.entity.CzpRoleType;
import eu.bcvsolutions.idm.connector.jip.entity.ErrorResponse;
import eu.bcvsolutions.idm.connector.jip.entity.GetSubjectRequest;
import eu.bcvsolutions.idm.connector.jip.entity.GetSubjectResponse;
import eu.bcvsolutions.idm.connector.jip.entity.GetUserListRequest;
import eu.bcvsolutions.idm.connector.jip.entity.GetUserListResponse;
import eu.bcvsolutions.idm.connector.jip.entity.GetUserRequest;
import eu.bcvsolutions.idm.connector.jip.entity.GetUserResponse;
import eu.bcvsolutions.idm.connector.jip.entity.ObjectFactory;
import eu.bcvsolutions.idm.connector.jip.entity.UpdateUserRequest;
import eu.bcvsolutions.idm.connector.jip.entity.UpdateUserResponse;
import eu.bcvsolutions.idm.connector.jip.entity.UserRoleType;
import eu.bcvsolutions.idm.connector.jip.entity.VirtuosRoleType;

/**
 * @author Roman Kučera
 */
public class Connection {

	private static final Log LOG = Log.getLog(Connection.class);

	private JipConfiguration configuration;

	public Connection(JipConfiguration configuration) {
		this.configuration = configuration;
	}

	/**
	 * Getting general info about subject and roles from system
	 * @return
	 */
	public GetSubjectResponse getSubject() {
		GetSubjectRequest subjectRequest = new GetSubjectRequest();

		try {
			HttpResponse<String> response = post(configuration.getHost() + "call/" + configuration.getSubject(), getXMLBody(subjectRequest));
			if (response.getStatus() != 200) {
				throw new ConnectionFailedException("Can't connect to system, return code " + response.getStatus());
			}
			return (GetSubjectResponse) getObject(response.getBody(), new GetSubjectResponse());
		} catch (JAXBException e) {
			LOG.error("Error during getting subject {0}", e.toString());
		}
		return null;
	}

	/**
	 * Get list of users from system
	 * @param page
	 * @return
	 */
	public GetUserListResponse getUsers(BigInteger page) {
		GetUserListRequest request = new GetUserListRequest();
		request.setStart(page);

		try {
			HttpResponse<String> response = post(configuration.getHost() + "call/" + configuration.getSubject(), getXMLBody(request));
			if (response.getStatus() != 200) {
				throw new ConnectionFailedException("Can't connect to system, return code " + response.getStatus());
			}
			return (GetUserListResponse) getObject(response.getBody(), new GetUserListResponse());
		} catch (JAXBException e) {
			LOG.error("Error during getting users {0}", e.toString());
		}
		return null;
	}

	/**
	 * Get info about one user
	 * @param objectId
	 * @return
	 */
	public GetUserResponse getUser(String objectId) {
		GetUserRequest request = new GetUserRequest();
		request.setObjectId(objectId);

		try {
			HttpResponse<String> response = post(configuration.getHost() + "call/" + configuration.getSubject(), getXMLBody(request));
			if (response.getStatus() != 200) {
				throw new ConnectionFailedException("Can't connect to system, return code " + response.getStatus());
			}
			return (GetUserResponse) getObject(response.getBody(), new GetUserResponse());
		} catch (JAXBException e) {
			LOG.error("Error during getting user {0}, error: {1}", objectId, e.toString());
		}
		return null;
	}

	/**
	 * It will create user with specific attributes
	 * @param createAttributes
	 * @return
	 */
	public CreateUserResponse createUser(Set<Attribute> createAttributes) {
		List<String> cinnostniRole = new ArrayList<>();
		ObjectFactory factory = new ObjectFactory();
		CreateUserRequest request = new CreateUserRequest();
		createAttributes.forEach(attribute -> {
			if (attribute.getName().equals(JipConnector.TITULY_PRED)) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setTitulPred(String.valueOf(attribute.getValue().get(0)));
				return;
			}
			if (attribute.getName().equals(JipConnector.FIRSTNAME)) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setFirstname(String.valueOf(attribute.getValue().get(0)));
				return;
			}
			if (attribute.getName().equals(JipConnector.SURNAME)) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setSurname(String.valueOf(attribute.getValue().get(0)));
				return;
			}
			if (attribute.getName().equals(JipConnector.PASSWORD)) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setPassword(getPassword((GuardedString) attribute.getValue().get(0)));
				return;
			}
			if (attribute.getName().equals(JipConnector.EMAIL)) {
				if (isEmpty(attribute)) {
					return;
				}
				CreateUserRequest.Email.Item emailItem = new CreateUserRequest.Email.Item();
				emailItem.setType("1");
				emailItem.setEmail(String.valueOf(attribute.getValue().get(0)));

				CreateUserRequest.Email email = factory.createCreateUserRequestEmail();
				email.getItem().add(emailItem);
				request.setEmail(email);
				return;
			}
			if (attribute.getName().equals(JipConnector.TITULY_ZA)) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setTitulZa(String.valueOf(attribute.getValue().get(0)));
				return;
			}
			if (attribute.getName().equals("__NAME__")) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setUsername(String.valueOf(attribute.getValue().get(0)));
				request.setObjectId(String.valueOf(attribute.getValue().get(0)));
				return;
			}
			if (attribute.getName().equals(JipConnector.LOGIN_DISABLED)) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setLoginDisabled(String.valueOf(attribute.getValue().get(0)));
				return;
			}
			if (attribute.getName().equals(JipConnector.OSOBA_KRIZ_RIZENI)) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setOsobaKrizovehoRizeni(String.valueOf(attribute.getValue().get(0)).toUpperCase());
				return;
			}
			// roles
			if (attribute.getName().equals(JipConnector.CINNOSTI_ROLE)) {
				attribute.getValue().forEach(role -> cinnostniRole.add(String.valueOf(role)));
			}
			if (attribute.getName().equals(JipConnector.ROLE)) {
				UserRoleType roleObject = new UserRoleType();
				attribute.getValue().forEach(o -> roleObject.getItem().add(String.valueOf(o)));
				request.setRole(roleObject);
			}
			if (attribute.getName().equals(JipConnector.CZPROLE)) {
				CzpRoleType roleObject = new CzpRoleType();
				attribute.getValue().forEach(o -> roleObject.getItem().add(String.valueOf(o)));
				request.setRoleCzechPoint(roleObject);
			}
			if (attribute.getName().equals(JipConnector.CZP_AT_OFFICE_ROLE)) {
				CzpOfficeRoleType roleObject = new CzpOfficeRoleType();
				attribute.getValue().forEach(o -> roleObject.getItem().add(String.valueOf(o)));
				request.setRoleCzpAtOffice(roleObject);
			}
			if (attribute.getName().equals(JipConnector.VIRTUOS_ROLE)) {
				VirtuosRoleType roleObject = new VirtuosRoleType();
				attribute.getValue().forEach(o -> roleObject.getItem().add(String.valueOf(o)));
				request.setRoleVirtuos(roleObject);
			}
			if (attribute.getName().equals(JipConnector.AIS_ROLE)) {
				CreateUserRequest.AisRole roleObject = new CreateUserRequest.AisRole();
				attribute.getValue().forEach(o -> roleObject.getItem().add(String.valueOf(o)));
				request.setAisRole(roleObject);
			}
		});

		HttpResponse<String> response = null;
		try {
			response = post(configuration.getHost() + "call/" + configuration.getSubject(), getXMLBody(request));
			if (response.getStatus() != 200) {
				throw new ConnectionFailedException("Can't connect to system, return code " + response.getStatus());
			}
			CreateUserResponse createResponse = (CreateUserResponse) getObject(response.getBody(), new CreateUserResponse());
			if (!cinnostniRole.isEmpty()) {
				Set<Attribute> replaceAttributes = new HashSet<>();
				replaceAttributes.add(AttributeBuilder.build(JipConnector.CINNOSTI_ROLE, cinnostniRole));
				updateUser(new Uid(createResponse.getObjectId()), replaceAttributes);
			}
			return createResponse;
		} catch (JAXBException e) {
			try {
				ErrorResponse errorResponse = (ErrorResponse) getObject(response.getBody(), new ErrorResponse());
				throw new ConnectorException(errorResponse.getCode() + " - " + errorResponse.getMessage());
			} catch (JAXBException e1) {
				LOG.error("Error during create user {0}", e.toString());
			}
			LOG.error("Error during create user {0}", e.toString());
		}
		return null;
	}

	/**
	 * Update user's specific attributes
	 * @param uid
	 * @param replaceAttributes
	 * @return
	 */
	public UpdateUserResponse updateUser(Uid uid, final Set<Attribute> replaceAttributes) {
		ObjectFactory factory = new ObjectFactory();
		UpdateUserRequest request = new UpdateUserRequest();
		request.setObjectId(uid.getUidValue());
		request.setUsername(uid.getUidValue());
		replaceAttributes.forEach(attribute -> {
			if (attribute.getName().equals(JipConnector.TITULY_PRED)) {
				if (isEmpty(attribute)) {
					return;
				}
				JAXBElement<String> titulPred = factory.createUpdateUserRequestTitulPred(String.valueOf(attribute.getValue().get(0)));
				request.setTitulPred(titulPred);
				return;
			}
			if (attribute.getName().equals(JipConnector.FIRSTNAME)) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setFirstname(String.valueOf(attribute.getValue().get(0)));
				return;
			}
			if (attribute.getName().equals(JipConnector.SURNAME)) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setSurname(String.valueOf(attribute.getValue().get(0)));
				return;
			}
			if (attribute.getName().equals(JipConnector.PASSWORD)) {
				if (isEmpty(attribute)) {
					return;
				}
				request.setPassword(getPassword((GuardedString) attribute.getValue().get(0)));
				return;
			}
			if (attribute.getName().equals(JipConnector.EMAIL)) {
				if (isEmpty(attribute)) {
					return;
				}
				UpdateUserRequest.Email emailObject = new UpdateUserRequest.Email();
				UpdateUserRequest.Email.Item emailItem = new UpdateUserRequest.Email.Item();
				emailItem.setType("1");
				emailItem.setEmail(String.valueOf(attribute.getValue().get(0)));
				emailObject.getItem().add(emailItem);

				JAXBElement<UpdateUserRequest.Email> email = factory.createUpdateUserRequestEmail(emailObject);
				request.setEmail(email);
				return;
			}
			if (attribute.getName().equals(JipConnector.TITULY_ZA)) {
				if (isEmpty(attribute)) {
					return;
				}
				JAXBElement<String> titulyZa = factory.createUpdateUserRequestTitulZa(String.valueOf(attribute.getValue().get(0)));
				request.setTitulZa(titulyZa);
				return;
			}
			if (attribute.getName().equals(JipConnector.LOGIN_DISABLED)) {
				if (isEmpty(attribute)) {
					return;
				}
				JAXBElement<String> disabled = factory.createUpdateUserRequestLoginDisabled(String.valueOf(attribute.getValue().get(0)));
				request.setLoginDisabled(disabled);
				return;
			}
			if (attribute.getName().equals(JipConnector.OSOBA_KRIZ_RIZENI)) {
				if (isEmpty(attribute)) {
					return;
				}
				JAXBElement<String> osobaKrizRizeni = factory.createUpdateUserRequestOsobaKrizovehoRizeni(String.valueOf(attribute.getValue().get(0)).toUpperCase());
				request.setOsobaKrizovehoRizeni(osobaKrizRizeni);
				return;
			}
			// roles
			if (attribute.getName().equals(JipConnector.CINNOSTI_ROLE)) {
				UpdateUserRequest.CinnostniRole roleObject = new UpdateUserRequest.CinnostniRole();
				attribute.getValue().forEach(o -> {
					String[] data = String.valueOf(o).split("_");
					UpdateUserRequest.CinnostniRole.Item roleItem = new UpdateUserRequest.CinnostniRole.Item();
					roleItem.setValue(data[0]);
					roleItem.setAgenda(data[1]);
					roleObject.getItem().add(roleItem);
				});

				JAXBElement<UpdateUserRequest.CinnostniRole> role = factory.createUpdateUserRequestCinnostniRole(roleObject);
				request.setCinnostniRole(role);
			}
			if (attribute.getName().equals(JipConnector.ROLE)) {
				UserRoleType roleObject = new UserRoleType();
				attribute.getValue().forEach(o -> roleObject.getItem().add(String.valueOf(o)));
				JAXBElement<UserRoleType> role = factory.createUpdateUserRequestRole(roleObject);
				request.setRole(role);
			}
			if (attribute.getName().equals(JipConnector.CZPROLE)) {
				CzpRoleType roleObject = new CzpRoleType();
				attribute.getValue().forEach(o -> roleObject.getItem().add(String.valueOf(o)));
				JAXBElement<CzpRoleType> role = factory.createUpdateUserRequestRoleCzechPoint(roleObject);
				request.setRoleCzechPoint(role);
			}
			if (attribute.getName().equals(JipConnector.CZP_AT_OFFICE_ROLE)) {
				CzpOfficeRoleType roleObject = new CzpOfficeRoleType();
				attribute.getValue().forEach(o -> roleObject.getItem().add(String.valueOf(o)));
				JAXBElement<CzpOfficeRoleType> role = factory.createUpdateUserRequestRoleCzpAtOffice(roleObject);
				request.setRoleCzpAtOffice(role);
			}
			if (attribute.getName().equals(JipConnector.VIRTUOS_ROLE)) {
				VirtuosRoleType roleObject = new VirtuosRoleType();
				attribute.getValue().forEach(o -> roleObject.getItem().add(String.valueOf(o)));
				JAXBElement<VirtuosRoleType> role = factory.createUpdateUserRequestRoleVirtuos(roleObject);
				request.setRoleVirtuos(role);
			}
			if (attribute.getName().equals(JipConnector.AIS_ROLE)) {
				UpdateUserRequest.AisRole roleObject = new UpdateUserRequest.AisRole();
				attribute.getValue().forEach(o -> roleObject.getItem().add(String.valueOf(o)));
				JAXBElement<UpdateUserRequest.AisRole> role = factory.createUpdateUserRequestAisRole(roleObject);
				request.setAisRole(role);
			}
		});
		HttpResponse<String> response = null;
		try {
			response = post(configuration.getHost() + "call/" + configuration.getSubject(), getXMLBody(request));
			if (response.getStatus() != 200) {
				throw new ConnectionFailedException("Can't connect to system, return code " + response.getStatus());
			}
			return (UpdateUserResponse) getObject(response.getBody(), new UpdateUserResponse());
		} catch (JAXBException e) {
			try {
				ErrorResponse errorResponse = (ErrorResponse) getObject(response.getBody(), new ErrorResponse());
				throw new ConnectorException(errorResponse.getCode() + " - " + errorResponse.getMessage());
			} catch (JAXBException e1) {
				LOG.error("Error during update user {0}", e.toString());
			}
			LOG.error("Error during update user {0}", e.toString());
		}
		return null;
	}

	private boolean isEmpty(Attribute attribute) {
		return attribute.getValue() == null || attribute.getValue().isEmpty();
	}

	/**
	 * Parse XML string into object
	 * @param xml
	 * @param response
	 * @return
	 * @throws JAXBException
	 */
	private Object getObject(String xml, Object response) throws JAXBException {
		InputStream inputStream = new ByteArrayInputStream(xml.getBytes());

		JAXBContext jaxbContext = JAXBContext.newInstance(response.getClass());
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return unmarshaller.unmarshal(inputStream);
	}

	/**
	 * Parse object into XML string
	 * @param request
	 * @return
	 * @throws JAXBException
	 */
	private String getXMLBody(Object request) throws JAXBException {
		OutputStream stream = new ByteArrayOutputStream();

		JAXBContext jaxbContext = JAXBContext.newInstance(request.getClass());
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(request, stream);
		return stream.toString();
	}

	/**
	 * Wrapped method for POST call to end system
	 * @param url
	 * @param body
	 * @return
	 */
	private HttpResponse<String> post(String url, String body) {
		try {
			String credentials = configuration.getUsername() + ":" + getPassword(configuration.getPassword());
			byte[] credentialsBytes = credentials.getBytes("UTF-8");
			credentials = "";
			String credentialEncoded = DatatypeConverter.printBase64Binary(credentialsBytes);
			credentialsBytes = null;

			HttpResponse<String> response = Unirest.post(url)
					.header("authorization", "Basic " + credentialEncoded)
					.header("content-type", "text/xml")
					.body(body)
					.asString();
			credentialEncoded = "";
			return response;
		} catch (UnirestException | UnsupportedEncodingException e) {
			throw new ConnectionFailedException("Connection failed " + e.getMessage());
		}
	}

	/**
	 * Get password as plain string
	 * @param password
	 * @return
	 */
	private String getPassword(GuardedString password) {
		GuardedStringAccessor accessor = new GuardedStringAccessor();
		password.access(accessor);
		char[] result = accessor.getArray();
		return new String(result);
	}
}
