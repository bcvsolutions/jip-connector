
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
 *         &lt;element name="name" type="{http://userportal.novell.com/ws/WS-LA-1.0}officeNameType"/>
 *         &lt;element name="location" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType" minOccurs="0"/>
 *         &lt;element name="objectCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType" minOccurs="0"/>
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
 *         &lt;element name="officeHours" minOccurs="0">
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
 *         &lt;element name="zruseno" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "CreateOfficeRequest", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class CreateOfficeRequest {

    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
    protected String name;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String location;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String objectCode;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateOfficeRequest.Address address;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateOfficeRequest.OfficeHours officeHours;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateOfficeRequest.TelephoneNumber telephoneNumber;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CreateOfficeRequest.Email email;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String zruseno;
    @XmlAttribute(name = "path")
    protected String path;

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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the objectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectCode() {
        return objectCode;
    }

    /**
     * Sets the value of the objectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectCode(String value) {
        this.objectCode = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOfficeRequest.Address }
     *     
     */
    public CreateOfficeRequest.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOfficeRequest.Address }
     *     
     */
    public void setAddress(CreateOfficeRequest.Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the officeHours property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOfficeRequest.OfficeHours }
     *     
     */
    public CreateOfficeRequest.OfficeHours getOfficeHours() {
        return officeHours;
    }

    /**
     * Sets the value of the officeHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOfficeRequest.OfficeHours }
     *     
     */
    public void setOfficeHours(CreateOfficeRequest.OfficeHours value) {
        this.officeHours = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOfficeRequest.TelephoneNumber }
     *     
     */
    public CreateOfficeRequest.TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOfficeRequest.TelephoneNumber }
     *     
     */
    public void setTelephoneNumber(CreateOfficeRequest.TelephoneNumber value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOfficeRequest.Email }
     *     
     */
    public CreateOfficeRequest.Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOfficeRequest.Email }
     *     
     */
    public void setEmail(CreateOfficeRequest.Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the zruseno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZruseno() {
        return zruseno;
    }

    /**
     * Sets the value of the zruseno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZruseno(String value) {
        this.zruseno = value;
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
        protected List<CreateOfficeRequest.Email.Item> item;

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
         * {@link CreateOfficeRequest.Email.Item }
         * 
         * 
         */
        public List<CreateOfficeRequest.Email.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateOfficeRequest.Email.Item>();
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
    public static class OfficeHours {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<CreateOfficeRequest.OfficeHours.Item> item;

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
         * {@link CreateOfficeRequest.OfficeHours.Item }
         * 
         * 
         */
        public List<CreateOfficeRequest.OfficeHours.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateOfficeRequest.OfficeHours.Item>();
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
        protected List<CreateOfficeRequest.TelephoneNumber.Item> item;

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
         * {@link CreateOfficeRequest.TelephoneNumber.Item }
         * 
         * 
         */
        public List<CreateOfficeRequest.TelephoneNumber.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateOfficeRequest.TelephoneNumber.Item>();
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

}
