package eu.bcvsolutions.idm.connector.jip;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.identityconnectors.common.logging.Log;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.exceptions.ConnectionFailedException;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.AttributeBuilder;
import org.identityconnectors.framework.common.objects.AttributeInfoBuilder;
import org.identityconnectors.framework.common.objects.ConnectorObjectBuilder;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.ObjectClassInfoBuilder;
import org.identityconnectors.framework.common.objects.OperationOptions;
import org.identityconnectors.framework.common.objects.ResultsHandler;
import org.identityconnectors.framework.common.objects.Schema;
import org.identityconnectors.framework.common.objects.SchemaBuilder;
import org.identityconnectors.framework.common.objects.Uid;
import org.identityconnectors.framework.common.objects.filter.AbstractFilterTranslator;
import org.identityconnectors.framework.common.objects.filter.EqualsFilter;
import org.identityconnectors.framework.common.objects.filter.FilterTranslator;
import org.identityconnectors.framework.spi.Configuration;
import org.identityconnectors.framework.spi.Connector;
import org.identityconnectors.framework.spi.ConnectorClass;
import org.identityconnectors.framework.spi.operations.CreateOp;
import org.identityconnectors.framework.spi.operations.SchemaOp;
import org.identityconnectors.framework.spi.operations.SearchOp;
import org.identityconnectors.framework.spi.operations.TestOp;
import org.identityconnectors.framework.spi.operations.UpdateOp;

import eu.bcvsolutions.idm.connector.jip.communication.Connection;
import eu.bcvsolutions.idm.connector.jip.entity.CreateUserResponse;
import eu.bcvsolutions.idm.connector.jip.entity.GetSubjectResponse;
import eu.bcvsolutions.idm.connector.jip.entity.GetUserListResponse;
import eu.bcvsolutions.idm.connector.jip.entity.GetUserResponse;
import eu.bcvsolutions.idm.connector.jip.entity.UpdateUserResponse;

/**
 * This JIP/KAAS connector provides implementations for specific ConnId operations which is supported by JIP
 * @author Roman Kučera
 */
@ConnectorClass(configurationClass = JipConfiguration.class, displayNameKey = "jip.connector.display")
public class JipConnector implements Connector, CreateOp, UpdateOp, SchemaOp, TestOp, SearchOp<String> {

	private static final Log LOG = Log.getLog(JipConnector.class);

	private JipConfiguration configuration;

	private final String ROLE_TYPE = "roleType";
	private final int MAX_ROWS = 500;

	public static final String OBJECT_ID = "object-id";
	public static final String TITULY_PRED = "titulPred";
	public static final String FIRSTNAME = "firstname";
	public static final String SURNAME = "surname";
	public static final String PASSWORD = "__PASSWORD__";
	public static final String EMAIL = "email";
	public static final String TITULY_ZA = "titulZa";
	public static final String LOGIN_DISABLED = "loginDisabled";
	public static final String USERNAME = "username";
	public static final String OSOBA_KRIZ_RIZENI = "osobaKrizovehoRizeni";

	public static final String ROLE = "role";
	public static final String CZPROLE = "roleCzechPoint";
	public static final String CZP_AT_OFFICE_ROLE = "czpAtOfficeRole";
	public static final String VIRTUOS_ROLE = "virtuosRole";
	public static final String AIS_ROLE = "aisRole";
	public static final String CINNOSTI_ROLE = "cinnostniRole";

	@Override
	public JipConfiguration getConfiguration() {
		return configuration;
	}

	@Override
	public void init(final Configuration configuration) {
		this.configuration = (JipConfiguration) configuration;
		LOG.ok("Connector {0} successfully inited", getClass().getName());
	}

	@Override
	public void dispose() {
		// dispose of any resources the this connector uses.
	}

	@Override
	public Uid create(
			final ObjectClass objectClass,
			final Set<Attribute> createAttributes,
			final OperationOptions options) {
		// supported is only __ACCOUNT__
		if (objectClass.getObjectClassValue().equals(configuration.getObject()) &&
				objectClass.getObjectClassValue().equals(ObjectClass.ACCOUNT_NAME)) {

			Connection connection = new Connection(configuration);
			CreateUserResponse createUserResponse = connection.createUser(createAttributes);
			LOG.info("Create finished");
			return new Uid(createUserResponse.getObjectId());
		} else {
			throw new IllegalStateException("Create operation is not supported for " + objectClass.getObjectClassValue());
		}
	}

	@Override
	public Uid update(
			final ObjectClass objectClass,
			final Uid uid,
			final Set<Attribute> replaceAttributes,
			final OperationOptions options) {

		// supported is only __ACCOUNT__
		if (objectClass.getObjectClassValue().equals(configuration.getObject()) &&
				objectClass.getObjectClassValue().equals(ObjectClass.ACCOUNT_NAME)) {

			Connection connection = new Connection(configuration);
			UpdateUserResponse updateUserResponse = connection.updateUser(uid, replaceAttributes);
			LOG.info("Update finished for uid {0}", uid.getUidValue());
			return new Uid(updateUserResponse.getObjectId());
		} else {
			throw new IllegalStateException("Create operation is not supported for " + objectClass.getObjectClassValue());
		}
	}

	/**
	 * Generate schema for __ACCOUNT__ and __GROUP__
	 * @return
	 */
	@Override
	public Schema schema() {
		ObjectClassInfoBuilder accountObjectClassBuilder = new ObjectClassInfoBuilder();
		accountObjectClassBuilder.setType(ObjectClass.ACCOUNT_NAME);
		accountObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(OBJECT_ID, String.class));
		accountObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(TITULY_PRED, String.class));
		accountObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(FIRSTNAME, String.class));
		accountObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(SURNAME, String.class));
		accountObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(TITULY_ZA, String.class));
		accountObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(PASSWORD, GuardedString.class));
		accountObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(LOGIN_DISABLED, String.class));
		accountObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(EMAIL, String.class));
		accountObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(USERNAME, String.class));
		accountObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(OSOBA_KRIZ_RIZENI, Boolean.class));

		accountObjectClassBuilder.addAttributeInfo(
				AttributeInfoBuilder.define(CINNOSTI_ROLE).setMultiValued(true).setType(String.class).build());
		accountObjectClassBuilder.addAttributeInfo(
				AttributeInfoBuilder.define(ROLE).setMultiValued(true).setType(String.class).build());
		accountObjectClassBuilder.addAttributeInfo(
				AttributeInfoBuilder.define(CZPROLE).setMultiValued(true).setType(String.class).build());
		accountObjectClassBuilder.addAttributeInfo(
				AttributeInfoBuilder.define(CZP_AT_OFFICE_ROLE).setMultiValued(true).setType(String.class).build());
		accountObjectClassBuilder.addAttributeInfo(
				AttributeInfoBuilder.define(VIRTUOS_ROLE).setMultiValued(true).setType(String.class).build());
		accountObjectClassBuilder.addAttributeInfo(
				AttributeInfoBuilder.define(AIS_ROLE).setMultiValued(true).setType(String.class).build());

		ObjectClassInfoBuilder groupObjectClassBuilder = new ObjectClassInfoBuilder();
		groupObjectClassBuilder.setType(ObjectClass.GROUP_NAME);
		groupObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build("code", String.class));
		groupObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build("text", String.class));
		groupObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build("agenda", String.class));
		groupObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build("platnostOd", String.class));
		groupObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build("platnostDo", String.class));
		groupObjectClassBuilder.addAttributeInfo(AttributeInfoBuilder.build(ROLE_TYPE, String.class));

		SchemaBuilder schemaBuilder = new SchemaBuilder(JipConnector.class);
		schemaBuilder.defineObjectClass(accountObjectClassBuilder.build());
		schemaBuilder.defineObjectClass(groupObjectClassBuilder.build());
		return schemaBuilder.build();
	}

	@Override
	public void test() {
		Connection connection = new Connection(configuration);
		GetSubjectResponse subject = connection.getSubject();
		if (subject == null) {
			throw new ConnectionFailedException("Can't connect to system");
		}
	}

	@Override
	public FilterTranslator<String> createFilterTranslator(
			final ObjectClass objectClass,
			final OperationOptions options) {
		if (objectClass.is(ObjectClass.ACCOUNT_NAME) || objectClass.is(ObjectClass.GROUP_NAME)) {
			return new AbstractFilterTranslator<String>() {
				@Override
				protected String createEqualsExpression(EqualsFilter filter, boolean not) {
					if (not) {
						throw new UnsupportedOperationException("This type of equals expression is not allow for now.");
					}

					Attribute attr = filter.getAttribute();

					if (attr == null || !attr.is(Uid.NAME)) {
						throw new IllegalArgumentException("Attribute is null or not UID attribute.");
					}

					return ((Uid) attr).getUidValue();
				}
			};
		}
		return null;
	}

	@Override
	public void executeQuery(
			final ObjectClass objectClass,
			final String query,
			final ResultsHandler handler,
			final OperationOptions options) {

		// find one user/group or get all.
		if (query != null) {
			if (configuration.getObject().equals(ObjectClass.ACCOUNT_NAME)) {
				handleUser(objectClass, handler, query);
			} else if (configuration.getObject().equals(ObjectClass.GROUP_NAME)) {
				handleGroups(objectClass, handler, query);
			}
		} else {
			if (objectClass.getObjectClassValue().equals(configuration.getObject()) &&
					objectClass.getObjectClassValue().equals(ObjectClass.ACCOUNT_NAME)) {

				handleUsers(objectClass, handler);
			} else if (objectClass.getObjectClassValue().equals(configuration.getObject()) &&
					objectClass.getObjectClassValue().equals(ObjectClass.GROUP_NAME)) {

				handleGroups(objectClass, handler, null);
			}
		}

	}

	/**
	 * It will adds groups from system to handler
	 * @param objectClass
	 * @param handler
	 * @param code
	 */
	private void handleGroups(ObjectClass objectClass, ResultsHandler handler, String code) {
		Connection connection = new Connection(configuration);
		GetSubjectResponse subject = connection.getSubject();

		if (subject != null) {
			subject.getCinnostniRole().getItem().forEach(item -> {
				ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
				builder.setUid(item.getValue());
				builder.setName(item.getValue());
				builder.setObjectClass(objectClass);
				builder.addAttribute(AttributeBuilder.build("text", item.getText()));
				builder.addAttribute(AttributeBuilder.build("code", item.getValue()));
				builder.addAttribute(AttributeBuilder.build("agenda", item.getAgenda()));
				builder.addAttribute(AttributeBuilder.build("platnostOd", item.getPlatnostOd()));
				builder.addAttribute(AttributeBuilder.build("platnostDo", item.getPlatnostDo()));
				builder.addAttribute(AttributeBuilder.build(ROLE_TYPE, CINNOSTI_ROLE));
				addGroupToHandler(handler, code, item.getValue(), builder);
				LOG.info("{0} fetched.", CINNOSTI_ROLE);
			});
			subject.getAisRole().getItem().forEach(item -> {
				ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
				getConnectorObjectForRole(objectClass, builder, item.getValue(), item.getText(), AIS_ROLE);
				addGroupToHandler(handler, code, item.getValue(), builder);
				LOG.info("{0} fetched.", AIS_ROLE);
			});
			subject.getRole().getItem().forEach(item -> {
				ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
				getConnectorObjectForRole(objectClass, builder, item.getValue(), item.getText(), ROLE);
				addGroupToHandler(handler, code, item.getValue(), builder);
				LOG.info("{0} fetched.", ROLE);
			});
			subject.getRoleCzpAtOffice().getItem().forEach(item -> {
				ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
				getConnectorObjectForRole(objectClass, builder, item.getValue(), item.getText(), CZP_AT_OFFICE_ROLE);
				addGroupToHandler(handler, code, item.getValue(), builder);
				LOG.info("{0} fetched.", CZP_AT_OFFICE_ROLE);
			});
			subject.getRoleVirtuos().getItem().forEach(item -> {
				ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
				getConnectorObjectForRole(objectClass, builder, item.getValue(), item.getText(), VIRTUOS_ROLE);
				addGroupToHandler(handler, code, item.getValue(), builder);
				LOG.info("{0} fetched.", VIRTUOS_ROLE);
			});
//			subject.getRoleCentralniNakup().getItem().forEach(item -> {
//				ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
//				builder.setUid(item.getValue());
//				builder.setName(item.getValue());
//				builder.setObjectClass(objectClass);
//				builder.addAttribute(AttributeBuilder.build("text", item.getText()));
//				builder.addAttribute(AttributeBuilder.build("code", item.getValue()));
//				builder.addAttribute(AttributeBuilder.build(ROLE_TYPE, "centralniNakupRole"));
//				addGroupToHandler(handler, code, item.getValue(), builder);
//			});
//			subject.getRoleIsuiObce().getItem().forEach(item -> {
//				ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
//				builder.setUid(item.getValue());
//				builder.setName(item.getValue());
//				builder.setObjectClass(objectClass);
//				builder.addAttribute(AttributeBuilder.build("text", item.getText()));
//				builder.addAttribute(AttributeBuilder.build("code", item.getValue()));
//				builder.addAttribute(AttributeBuilder.build(ROLE_TYPE, "isuiObceRole"));
//				addGroupToHandler(handler, code, item.getValue(), builder);
//			});
//			subject.getRoleIsuiStavebniUrady().getItem().forEach(item -> {
//				ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
//				builder.setUid(item.getValue());
//				builder.setName(item.getValue());
//				builder.setObjectClass(objectClass);
//				builder.addAttribute(AttributeBuilder.build("text", item.getText()));
//				builder.addAttribute(AttributeBuilder.build("code", item.getValue()));
//				builder.addAttribute(AttributeBuilder.build(ROLE_TYPE, "isuiStavebniUradyRole"));
//				addGroupToHandler(handler, code, item.getValue(), builder);
//			});
		}
	}

	private void getConnectorObjectForRole(ObjectClass objectClass, ConnectorObjectBuilder builder, String code, String text, String type) {
		builder.setUid(code);
		builder.setName(code);
		builder.setObjectClass(objectClass);
		builder.addAttribute(AttributeBuilder.build("text", text));
		builder.addAttribute(AttributeBuilder.build("code", code));
		builder.addAttribute(AttributeBuilder.build(ROLE_TYPE, type));
	}

	private void addGroupToHandler(ResultsHandler handler, String codeToFind, String code, ConnectorObjectBuilder builder) {
		if (codeToFind != null) {
			if (codeToFind.equals(code)) {
				handler.handle(builder.build());
			}
		} else {
			handler.handle(builder.build());
		}
	}

	/**
	 * Found all users
	 * @param objectClass
	 * @param handler
	 */
	private void handleUsers(ObjectClass objectClass, ResultsHandler handler) {
		Connection connection = new Connection(configuration);
		GetUserListResponse users = connection.getUsers(new BigInteger("1"));
		addUserToHandler(objectClass, handler, users);
		if (users.getTotal().intValue() > MAX_ROWS) {
			int numOfPages = users.getTotal().intValue() / MAX_ROWS;
			for (int i = 1; i <= numOfPages; i++) {
				users = connection.getUsers(BigInteger.valueOf((MAX_ROWS * i) + 1));
				addUserToHandler(objectClass, handler, users);
			}
		}
	}

	private void addUserToHandler(ObjectClass objectClass, ResultsHandler handler, GetUserListResponse users) {
		if (users != null) {
			users.getRow().forEach(user -> {
				handleUser(objectClass, handler, user.getObjectId());
			});
		}
	}

	/**
	 * Get info about one user
	 * @param objectClass
	 * @param handler
	 * @param objectId
	 */
	private void handleUser(ObjectClass objectClass, ResultsHandler handler, String objectId) {
		Connection connection = new Connection(configuration);
		GetUserResponse user = connection.getUser(objectId);
		if (user != null) {
			ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
			builder.setUid(objectId);
			builder.setName(objectId);
			builder.setObjectClass(objectClass);
			builder.addAttribute(AttributeBuilder.build(OBJECT_ID, objectId));
			builder.addAttribute(AttributeBuilder.build(FIRSTNAME, user.getFirstname()));
			builder.addAttribute(AttributeBuilder.build(SURNAME, user.getSurname()));

			user.getEmail().getItem().forEach(email -> {
				if (email.getType().getValue().equals("1")) {
					builder.addAttribute(AttributeBuilder.build(EMAIL, email.getEmail()));
				}
			});

			builder.addAttribute(AttributeBuilder.build(TITULY_PRED, user.getTitulPred()));
			builder.addAttribute(AttributeBuilder.build(TITULY_ZA, user.getTitulZa()));
			builder.addAttribute(AttributeBuilder.build(LOGIN_DISABLED, user.getLoginDisabled().getValue()));
			builder.addAttribute(AttributeBuilder.build(OSOBA_KRIZ_RIZENI, Boolean.parseBoolean(user.getOsobaKrizovehoRizeni().getValue())));

			List<String> cinnostniRoleList = new ArrayList<>();
			user.getCinnostniRole().getItem().forEach(role -> {
				cinnostniRoleList.add(role.getValue() + "_" + role.getAgenda());
			});
			if (!cinnostniRoleList.isEmpty()) {
				builder.addAttribute(AttributeBuilder.build(CINNOSTI_ROLE, cinnostniRoleList));
			}

			List<String> roleList = new ArrayList<>();
			user.getRole().getItem().forEach(role -> {
				roleList.add(role.getValue());
			});
			if (!roleList.isEmpty()) {
				builder.addAttribute(AttributeBuilder.build(ROLE, roleList));
			}

			List<String> czpRoleList = new ArrayList<>();
			user.getRoleCzechPoint().getItem().forEach(role -> {
				czpRoleList.add(role.getValue());
			});
			if (!czpRoleList.isEmpty()) {
				builder.addAttribute(AttributeBuilder.build(CZPROLE, czpRoleList));
			}

			List<String> czpAtOfficeRoleList = new ArrayList<>();
			user.getRoleCzpAtOffice().getItem().forEach(role -> {
				czpAtOfficeRoleList.add(role.getValue());
			});
			if (!czpAtOfficeRoleList.isEmpty()) {
				builder.addAttribute(AttributeBuilder.build(CZP_AT_OFFICE_ROLE, czpAtOfficeRoleList));
			}

			List<String> virtuosRoleList = new ArrayList<>();
			user.getRoleVirtuos().getItem().forEach(role -> {
				virtuosRoleList.add(role.getValue());
			});
			if (!virtuosRoleList.isEmpty()) {
				builder.addAttribute(AttributeBuilder.build(VIRTUOS_ROLE, virtuosRoleList));
			}

			List<String> aisRoleList = new ArrayList<>();
			user.getAisRole().getItem().forEach(role -> {
				aisRoleList.add(role.getValue());
			});
			if (!aisRoleList.isEmpty()) {
				builder.addAttribute(AttributeBuilder.build(AIS_ROLE, aisRoleList));
			}

			handler.handle(builder.build());
		}
	}
}
