
package eu.bcvsolutions.idm.connector.jip.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="name" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType"/>
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
 *         &lt;element name="crisisContactPersonList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="bankAccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="officesHours" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *       &lt;/all>
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="object-path" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "CreateCrisisMgmtRequest", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class CreateCrisisMgmtRequest {

    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
    protected String name;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateCrisisMgmtRequest.Address address;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateCrisisMgmtRequest.CrisisContactPersonList crisisContactPersonList;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateCrisisMgmtRequest.TelephoneNumber telephoneNumber;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateCrisisMgmtRequest.CrisisTelephoneNumber crisisTelephoneNumber;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateCrisisMgmtRequest.BankAccount bankAccount;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateCrisisMgmtRequest.OfficesHours officesHours;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateCrisisMgmtRequest.Url url;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateCrisisMgmtRequest.Email email;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute(name = "object-path")
    protected String objectPath;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCrisisMgmtRequest.Address }
     *     
     */
    public CreateCrisisMgmtRequest.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCrisisMgmtRequest.Address }
     *     
     */
    public void setAddress(CreateCrisisMgmtRequest.Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the crisisContactPersonList property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCrisisMgmtRequest.CrisisContactPersonList }
     *     
     */
    public CreateCrisisMgmtRequest.CrisisContactPersonList getCrisisContactPersonList() {
        return crisisContactPersonList;
    }

    /**
     * Sets the value of the crisisContactPersonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCrisisMgmtRequest.CrisisContactPersonList }
     *     
     */
    public void setCrisisContactPersonList(CreateCrisisMgmtRequest.CrisisContactPersonList value) {
        this.crisisContactPersonList = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCrisisMgmtRequest.TelephoneNumber }
     *     
     */
    public CreateCrisisMgmtRequest.TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCrisisMgmtRequest.TelephoneNumber }
     *     
     */
    public void setTelephoneNumber(CreateCrisisMgmtRequest.TelephoneNumber value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the crisisTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCrisisMgmtRequest.CrisisTelephoneNumber }
     *     
     */
    public CreateCrisisMgmtRequest.CrisisTelephoneNumber getCrisisTelephoneNumber() {
        return crisisTelephoneNumber;
    }

    /**
     * Sets the value of the crisisTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCrisisMgmtRequest.CrisisTelephoneNumber }
     *     
     */
    public void setCrisisTelephoneNumber(CreateCrisisMgmtRequest.CrisisTelephoneNumber value) {
        this.crisisTelephoneNumber = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCrisisMgmtRequest.BankAccount }
     *     
     */
    public CreateCrisisMgmtRequest.BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCrisisMgmtRequest.BankAccount }
     *     
     */
    public void setBankAccount(CreateCrisisMgmtRequest.BankAccount value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the officesHours property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCrisisMgmtRequest.OfficesHours }
     *     
     */
    public CreateCrisisMgmtRequest.OfficesHours getOfficesHours() {
        return officesHours;
    }

    /**
     * Sets the value of the officesHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCrisisMgmtRequest.OfficesHours }
     *     
     */
    public void setOfficesHours(CreateCrisisMgmtRequest.OfficesHours value) {
        this.officesHours = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCrisisMgmtRequest.Url }
     *     
     */
    public CreateCrisisMgmtRequest.Url getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCrisisMgmtRequest.Url }
     *     
     */
    public void setUrl(CreateCrisisMgmtRequest.Url value) {
        this.url = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCrisisMgmtRequest.Email }
     *     
     */
    public CreateCrisisMgmtRequest.Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCrisisMgmtRequest.Email }
     *     
     */
    public void setEmail(CreateCrisisMgmtRequest.Email value) {
        this.email = value;
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
     * Gets the value of the objectPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectPath() {
        return objectPath;
    }

    /**
     * Sets the value of the objectPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectPath(String value) {
        this.objectPath = value;
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
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class BankAccount {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<CreateCrisisMgmtRequest.BankAccount.Item> item;

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
         * {@link CreateCrisisMgmtRequest.BankAccount.Item }
         * 
         * 
         */
        public List<CreateCrisisMgmtRequest.BankAccount.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateCrisisMgmtRequest.BankAccount.Item>();
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
         *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String number;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String bankCode;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
            protected String description;

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
             * Gets the value of the bankCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankCode() {
                return bankCode;
            }

            /**
             * Sets the value of the bankCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankCode(String value) {
                this.bankCode = value;
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
     *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class CrisisContactPersonList {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<CreateCrisisMgmtRequest.CrisisContactPersonList.Item> item;

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
         * {@link CreateCrisisMgmtRequest.CrisisContactPersonList.Item }
         * 
         * 
         */
        public List<CreateCrisisMgmtRequest.CrisisContactPersonList.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateCrisisMgmtRequest.CrisisContactPersonList.Item>();
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
         *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String username;

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
        protected List<CreateCrisisMgmtRequest.CrisisTelephoneNumber.Item> item;

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
         * {@link CreateCrisisMgmtRequest.CrisisTelephoneNumber.Item }
         * 
         * 
         */
        public List<CreateCrisisMgmtRequest.CrisisTelephoneNumber.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateCrisisMgmtRequest.CrisisTelephoneNumber.Item>();
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
        protected List<CreateCrisisMgmtRequest.Email.Item> item;

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
         * {@link CreateCrisisMgmtRequest.Email.Item }
         * 
         * 
         */
        public List<CreateCrisisMgmtRequest.Email.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateCrisisMgmtRequest.Email.Item>();
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
     *                   &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class OfficesHours {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<CreateCrisisMgmtRequest.OfficesHours.Item> item;

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
         * {@link CreateCrisisMgmtRequest.OfficesHours.Item }
         * 
         * 
         */
        public List<CreateCrisisMgmtRequest.OfficesHours.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateCrisisMgmtRequest.OfficesHours.Item>();
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
         *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String day;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String from;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String to;

            /**
             * Gets the value of the day property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDay() {
                return day;
            }

            /**
             * Sets the value of the day property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDay(String value) {
                this.day = value;
            }

            /**
             * Gets the value of the from property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrom() {
                return from;
            }

            /**
             * Sets the value of the from property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrom(String value) {
                this.from = value;
            }

            /**
             * Gets the value of the to property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTo() {
                return to;
            }

            /**
             * Sets the value of the to property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTo(String value) {
                this.to = value;
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
        protected List<CreateCrisisMgmtRequest.TelephoneNumber.Item> item;

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
         * {@link CreateCrisisMgmtRequest.TelephoneNumber.Item }
         * 
         * 
         */
        public List<CreateCrisisMgmtRequest.TelephoneNumber.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateCrisisMgmtRequest.TelephoneNumber.Item>();
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
        protected List<CreateCrisisMgmtRequest.Url.Item> item;

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
         * {@link CreateCrisisMgmtRequest.Url.Item }
         * 
         * 
         */
        public List<CreateCrisisMgmtRequest.Url.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateCrisisMgmtRequest.Url.Item>();
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
