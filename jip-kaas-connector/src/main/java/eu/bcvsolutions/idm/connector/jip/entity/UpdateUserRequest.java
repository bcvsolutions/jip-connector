
package eu.bcvsolutions.idm.connector.jip.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="titulPred" type="{http://userportal.novell.com/ws/WS-LA-1.0}titleType" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://userportal.novell.com/ws/WS-LA-1.0}firstnameType" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://userportal.novell.com/ws/WS-LA-1.0}surnameType" minOccurs="0"/>
 *         &lt;element name="titulZa" type="{http://userportal.novell.com/ws/WS-LA-1.0}titleType" minOccurs="0"/>
 *         &lt;element name="password" type="{http://userportal.novell.com/ws/WS-LA-1.0}userPasswordType" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://userportal.novell.com/ws/WS-LA-1.0}userPhotoType" minOccurs="0"/>
 *         &lt;element name="loginDisabled" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanType" minOccurs="0"/>
 *         &lt;element name="address" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addressCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="metropolitanDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cityPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pragueDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="buildingType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             &lt;enumeration value="2"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="email" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="telephoneNumber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="crisisTelephoneNumber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clientCertificate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="issuer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="role" type="{http://userportal.novell.com/ws/WS-LA-1.0}userRoleType" minOccurs="0"/>
 *         &lt;element name="roleCzechPoint" type="{http://userportal.novell.com/ws/WS-LA-1.0}czpRoleType" minOccurs="0"/>
 *         &lt;element name="roleCzpAtOffice" type="{http://userportal.novell.com/ws/WS-LA-1.0}czpOfficeRoleType" minOccurs="0"/>
 *         &lt;element name="roleVirtuos" type="{http://userportal.novell.com/ws/WS-LA-1.0}virtuosRoleType" minOccurs="0"/>
 *         &lt;element name="roleCentralniNakup" type="{http://userportal.novell.com/ws/WS-LA-1.0}iscnkpRoleType" minOccurs="0"/>
 *         &lt;element name="roleIsuiObce" type="{http://userportal.novell.com/ws/WS-LA-1.0}isuiObecRoleType" minOccurs="0"/>
 *         &lt;element name="roleIsuiStavebniUrady" type="{http://userportal.novell.com/ws/WS-LA-1.0}isuiStUradyRoleType" minOccurs="0"/>
 *         &lt;element name="aisRole" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ovmPersonType" type="{http://userportal.novell.com/ws/WS-LA-1.0}ovmPersonType" minOccurs="0"/>
 *         &lt;element name="function" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType" minOccurs="0"/>
 *         &lt;element name="url" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="predchoziZamestnavatel" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType" minOccurs="0"/>
 *         &lt;element name="uvolnenZeZamestnani" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanType" minOccurs="0"/>
 *         &lt;element name="verejnaOsoba" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanType" minOccurs="0"/>
 *         &lt;element name="osobaKrizovehoRizeni" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanType" minOccurs="0"/>
 *         &lt;element name="poznamka" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType" minOccurs="0"/>
 *         &lt;element name="cisloJednaci" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType" minOccurs="0"/>
 *         &lt;element name="cinnostniRole" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="agenda" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="object-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "UpdateUserRequest", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class UpdateUserRequest {

    @XmlElementRef(name = "titulPred", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titulPred;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String firstname;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String surname;
    @XmlElementRef(name = "titulZa", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titulZa;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String password;
    @XmlElementRef(name = "photo", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> photo;
    @XmlElementRef(name = "loginDisabled", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginDisabled;
    @XmlElementRef(name = "address", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateUserRequest.Address> address;
    @XmlElementRef(name = "email", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateUserRequest.Email> email;
    @XmlElementRef(name = "telephoneNumber", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateUserRequest.TelephoneNumber> telephoneNumber;
    @XmlElementRef(name = "crisisTelephoneNumber", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateUserRequest.CrisisTelephoneNumber> crisisTelephoneNumber;
    @XmlElementRef(name = "clientCertificate", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateUserRequest.ClientCertificate> clientCertificate;
    @XmlElementRef(name = "role", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UserRoleType> role;
    @XmlElementRef(name = "roleCzechPoint", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<CzpRoleType> roleCzechPoint;
    @XmlElementRef(name = "roleCzpAtOffice", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<CzpOfficeRoleType> roleCzpAtOffice;
    @XmlElementRef(name = "roleVirtuos", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<VirtuosRoleType> roleVirtuos;
    @XmlElementRef(name = "roleCentralniNakup", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<IscnkpRoleType> roleCentralniNakup;
    @XmlElementRef(name = "roleIsuiObce", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<IsuiObecRoleType> roleIsuiObce;
    @XmlElementRef(name = "roleIsuiStavebniUrady", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<IsuiStUradyRoleType> roleIsuiStavebniUrady;
    @XmlElementRef(name = "aisRole", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateUserRequest.AisRole> aisRole;
    @XmlElementRef(name = "ovmPersonType", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ovmPersonType;
    @XmlElementRef(name = "function", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> function;
    @XmlElementRef(name = "url", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateUserRequest.Url> url;
    @XmlElementRef(name = "predchoziZamestnavatel", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> predchoziZamestnavatel;
    @XmlElementRef(name = "uvolnenZeZamestnani", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uvolnenZeZamestnani;
    @XmlElementRef(name = "verejnaOsoba", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verejnaOsoba;
    @XmlElementRef(name = "osobaKrizovehoRizeni", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> osobaKrizovehoRizeni;
    @XmlElementRef(name = "poznamka", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poznamka;
    @XmlElementRef(name = "cisloJednaci", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cisloJednaci;
    @XmlElementRef(name = "cinnostniRole", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateUserRequest.CinnostniRole> cinnostniRole;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute(name = "object-id")
    protected String objectId;
    @XmlAttribute(name = "username")
    protected String username;

    /**
     * Gets the value of the titulPred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitulPred() {
        return titulPred;
    }

    /**
     * Sets the value of the titulPred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitulPred(JAXBElement<String> value) {
        this.titulPred = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the titulZa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitulZa() {
        return titulZa;
    }

    /**
     * Sets the value of the titulZa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitulZa(JAXBElement<String> value) {
        this.titulZa = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPhoto(JAXBElement<byte[]> value) {
        this.photo = value;
    }

    /**
     * Gets the value of the loginDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginDisabled() {
        return loginDisabled;
    }

    /**
     * Sets the value of the loginDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginDisabled(JAXBElement<String> value) {
        this.loginDisabled = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.Address }{@code >}
     *     
     */
    public JAXBElement<UpdateUserRequest.Address> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.Address }{@code >}
     *     
     */
    public void setAddress(JAXBElement<UpdateUserRequest.Address> value) {
        this.address = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.Email }{@code >}
     *     
     */
    public JAXBElement<UpdateUserRequest.Email> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.Email }{@code >}
     *     
     */
    public void setEmail(JAXBElement<UpdateUserRequest.Email> value) {
        this.email = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.TelephoneNumber }{@code >}
     *     
     */
    public JAXBElement<UpdateUserRequest.TelephoneNumber> getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.TelephoneNumber }{@code >}
     *     
     */
    public void setTelephoneNumber(JAXBElement<UpdateUserRequest.TelephoneNumber> value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the crisisTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.CrisisTelephoneNumber }{@code >}
     *     
     */
    public JAXBElement<UpdateUserRequest.CrisisTelephoneNumber> getCrisisTelephoneNumber() {
        return crisisTelephoneNumber;
    }

    /**
     * Sets the value of the crisisTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.CrisisTelephoneNumber }{@code >}
     *     
     */
    public void setCrisisTelephoneNumber(JAXBElement<UpdateUserRequest.CrisisTelephoneNumber> value) {
        this.crisisTelephoneNumber = value;
    }

    /**
     * Gets the value of the clientCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.ClientCertificate }{@code >}
     *     
     */
    public JAXBElement<UpdateUserRequest.ClientCertificate> getClientCertificate() {
        return clientCertificate;
    }

    /**
     * Sets the value of the clientCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.ClientCertificate }{@code >}
     *     
     */
    public void setClientCertificate(JAXBElement<UpdateUserRequest.ClientCertificate> value) {
        this.clientCertificate = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserRoleType }{@code >}
     *     
     */
    public JAXBElement<UserRoleType> getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserRoleType }{@code >}
     *     
     */
    public void setRole(JAXBElement<UserRoleType> value) {
        this.role = value;
    }

    /**
     * Gets the value of the roleCzechPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CzpRoleType }{@code >}
     *     
     */
    public JAXBElement<CzpRoleType> getRoleCzechPoint() {
        return roleCzechPoint;
    }

    /**
     * Sets the value of the roleCzechPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CzpRoleType }{@code >}
     *     
     */
    public void setRoleCzechPoint(JAXBElement<CzpRoleType> value) {
        this.roleCzechPoint = value;
    }

    /**
     * Gets the value of the roleCzpAtOffice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CzpOfficeRoleType }{@code >}
     *     
     */
    public JAXBElement<CzpOfficeRoleType> getRoleCzpAtOffice() {
        return roleCzpAtOffice;
    }

    /**
     * Sets the value of the roleCzpAtOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CzpOfficeRoleType }{@code >}
     *     
     */
    public void setRoleCzpAtOffice(JAXBElement<CzpOfficeRoleType> value) {
        this.roleCzpAtOffice = value;
    }

    /**
     * Gets the value of the roleVirtuos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VirtuosRoleType }{@code >}
     *     
     */
    public JAXBElement<VirtuosRoleType> getRoleVirtuos() {
        return roleVirtuos;
    }

    /**
     * Sets the value of the roleVirtuos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VirtuosRoleType }{@code >}
     *     
     */
    public void setRoleVirtuos(JAXBElement<VirtuosRoleType> value) {
        this.roleVirtuos = value;
    }

    /**
     * Gets the value of the roleCentralniNakup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IscnkpRoleType }{@code >}
     *     
     */
    public JAXBElement<IscnkpRoleType> getRoleCentralniNakup() {
        return roleCentralniNakup;
    }

    /**
     * Sets the value of the roleCentralniNakup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IscnkpRoleType }{@code >}
     *     
     */
    public void setRoleCentralniNakup(JAXBElement<IscnkpRoleType> value) {
        this.roleCentralniNakup = value;
    }

    /**
     * Gets the value of the roleIsuiObce property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IsuiObecRoleType }{@code >}
     *     
     */
    public JAXBElement<IsuiObecRoleType> getRoleIsuiObce() {
        return roleIsuiObce;
    }

    /**
     * Sets the value of the roleIsuiObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IsuiObecRoleType }{@code >}
     *     
     */
    public void setRoleIsuiObce(JAXBElement<IsuiObecRoleType> value) {
        this.roleIsuiObce = value;
    }

    /**
     * Gets the value of the roleIsuiStavebniUrady property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IsuiStUradyRoleType }{@code >}
     *     
     */
    public JAXBElement<IsuiStUradyRoleType> getRoleIsuiStavebniUrady() {
        return roleIsuiStavebniUrady;
    }

    /**
     * Sets the value of the roleIsuiStavebniUrady property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IsuiStUradyRoleType }{@code >}
     *     
     */
    public void setRoleIsuiStavebniUrady(JAXBElement<IsuiStUradyRoleType> value) {
        this.roleIsuiStavebniUrady = value;
    }

    /**
     * Gets the value of the aisRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.AisRole }{@code >}
     *     
     */
    public JAXBElement<UpdateUserRequest.AisRole> getAisRole() {
        return aisRole;
    }

    /**
     * Sets the value of the aisRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.AisRole }{@code >}
     *     
     */
    public void setAisRole(JAXBElement<UpdateUserRequest.AisRole> value) {
        this.aisRole = value;
    }

    /**
     * Gets the value of the ovmPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOvmPersonType() {
        return ovmPersonType;
    }

    /**
     * Sets the value of the ovmPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOvmPersonType(JAXBElement<String> value) {
        this.ovmPersonType = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunction(JAXBElement<String> value) {
        this.function = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.Url }{@code >}
     *     
     */
    public JAXBElement<UpdateUserRequest.Url> getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.Url }{@code >}
     *     
     */
    public void setUrl(JAXBElement<UpdateUserRequest.Url> value) {
        this.url = value;
    }

    /**
     * Gets the value of the predchoziZamestnavatel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPredchoziZamestnavatel() {
        return predchoziZamestnavatel;
    }

    /**
     * Sets the value of the predchoziZamestnavatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPredchoziZamestnavatel(JAXBElement<String> value) {
        this.predchoziZamestnavatel = value;
    }

    /**
     * Gets the value of the uvolnenZeZamestnani property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUvolnenZeZamestnani() {
        return uvolnenZeZamestnani;
    }

    /**
     * Sets the value of the uvolnenZeZamestnani property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUvolnenZeZamestnani(JAXBElement<String> value) {
        this.uvolnenZeZamestnani = value;
    }

    /**
     * Gets the value of the verejnaOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerejnaOsoba() {
        return verejnaOsoba;
    }

    /**
     * Sets the value of the verejnaOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerejnaOsoba(JAXBElement<String> value) {
        this.verejnaOsoba = value;
    }

    /**
     * Gets the value of the osobaKrizovehoRizeni property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOsobaKrizovehoRizeni() {
        return osobaKrizovehoRizeni;
    }

    /**
     * Sets the value of the osobaKrizovehoRizeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOsobaKrizovehoRizeni(JAXBElement<String> value) {
        this.osobaKrizovehoRizeni = value;
    }

    /**
     * Gets the value of the poznamka property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoznamka() {
        return poznamka;
    }

    /**
     * Sets the value of the poznamka property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoznamka(JAXBElement<String> value) {
        this.poznamka = value;
    }

    /**
     * Gets the value of the cisloJednaci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCisloJednaci() {
        return cisloJednaci;
    }

    /**
     * Sets the value of the cisloJednaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCisloJednaci(JAXBElement<String> value) {
        this.cisloJednaci = value;
    }

    /**
     * Gets the value of the cinnostniRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.CinnostniRole }{@code >}
     *     
     */
    public JAXBElement<UpdateUserRequest.CinnostniRole> getCinnostniRole() {
        return cinnostniRole;
    }

    /**
     * Sets the value of the cinnostniRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateUserRequest.CinnostniRole }{@code >}
     *     
     */
    public void setCinnostniRole(JAXBElement<UpdateUserRequest.CinnostniRole> value) {
        this.cinnostniRole = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="addressCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="metropolitanDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cityPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pragueDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="buildingType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                   &lt;enumeration value="2"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addressCode",
        "street",
        "cityCode",
        "city",
        "region",
        "postalCode",
        "metropolitanDistrict",
        "cityPart",
        "houseNumber",
        "sequenceNumber",
        "pragueDistrict",
        "buildingType"
    })
    public static class Address {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected Long addressCode;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String street;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected Long cityCode;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String city;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String region;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String postalCode;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String metropolitanDistrict;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String cityPart;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected Long houseNumber;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String sequenceNumber;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String pragueDistrict;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String buildingType;

        /**
         * Gets the value of the addressCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAddressCode() {
            return addressCode;
        }

        /**
         * Sets the value of the addressCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAddressCode(Long value) {
            this.addressCode = value;
        }

        /**
         * Gets the value of the street property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreet() {
            return street;
        }

        /**
         * Sets the value of the street property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreet(String value) {
            this.street = value;
        }

        /**
         * Gets the value of the cityCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCityCode() {
            return cityCode;
        }

        /**
         * Sets the value of the cityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCityCode(Long value) {
            this.cityCode = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the region property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegion() {
            return region;
        }

        /**
         * Sets the value of the region property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegion(String value) {
            this.region = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostalCode(String value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the metropolitanDistrict property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetropolitanDistrict() {
            return metropolitanDistrict;
        }

        /**
         * Sets the value of the metropolitanDistrict property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetropolitanDistrict(String value) {
            this.metropolitanDistrict = value;
        }

        /**
         * Gets the value of the cityPart property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityPart() {
            return cityPart;
        }

        /**
         * Sets the value of the cityPart property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityPart(String value) {
            this.cityPart = value;
        }

        /**
         * Gets the value of the houseNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getHouseNumber() {
            return houseNumber;
        }

        /**
         * Sets the value of the houseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHouseNumber(Long value) {
            this.houseNumber = value;
        }

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequenceNumber(String value) {
            this.sequenceNumber = value;
        }

        /**
         * Gets the value of the pragueDistrict property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPragueDistrict() {
            return pragueDistrict;
        }

        /**
         * Sets the value of the pragueDistrict property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPragueDistrict(String value) {
            this.pragueDistrict = value;
        }

        /**
         * Gets the value of the buildingType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuildingType() {
            return buildingType;
        }

        /**
         * Sets the value of the buildingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuildingType(String value) {
            this.buildingType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class AisRole {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<String> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItem() {
            if (item == null) {
                item = new ArrayList<String>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="agenda" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class CinnostniRole {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateUserRequest.CinnostniRole.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateUserRequest.CinnostniRole.Item }
         * 
         * 
         */
        public List<UpdateUserRequest.CinnostniRole.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateUserRequest.CinnostniRole.Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="agenda" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Item {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "agenda")
            protected String agenda;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the agenda property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgenda() {
                return agenda;
            }

            /**
             * Sets the value of the agenda property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgenda(String value) {
                this.agenda = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="issuer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ClientCertificate {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateUserRequest.ClientCertificate.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateUserRequest.ClientCertificate.Item }
         * 
         * 
         */
        public List<UpdateUserRequest.ClientCertificate.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateUserRequest.ClientCertificate.Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="issuer" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Item {

            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String type;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String number;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String issuer;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the issuer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssuer() {
                return issuer;
            }

            /**
             * Sets the value of the issuer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuer(String value) {
                this.issuer = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class CrisisTelephoneNumber {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateUserRequest.CrisisTelephoneNumber.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateUserRequest.CrisisTelephoneNumber.Item }
         * 
         * 
         */
        public List<UpdateUserRequest.CrisisTelephoneNumber.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateUserRequest.CrisisTelephoneNumber.Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Item {

            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String type;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String number;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Email {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateUserRequest.Email.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateUserRequest.Email.Item }
         * 
         * 
         */
        public List<UpdateUserRequest.Email.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateUserRequest.Email.Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Item {

            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String type;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String email;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
            protected String description;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TelephoneNumber {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateUserRequest.TelephoneNumber.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateUserRequest.TelephoneNumber.Item }
         * 
         * 
         */
        public List<UpdateUserRequest.TelephoneNumber.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateUserRequest.TelephoneNumber.Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Item {

            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String type;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String number;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Url {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateUserRequest.Url.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateUserRequest.Url.Item }
         * 
         * 
         */
        public List<UpdateUserRequest.Url.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateUserRequest.Url.Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Item {

            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String type;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String url;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
            protected String description;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the url property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * Sets the value of the url property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

        }

    }

}
