
package eu.bcvsolutions.idm.connector.jip.entity;

import java.math.BigInteger;
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
 *       &lt;sequence>
 *         &lt;element name="row" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="name" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="address" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="addressCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="metropolitanDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cityPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pragueDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="buildingType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;union>
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;enumeration value="2"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/union>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="street" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="houseNumber" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="sequenceNumber" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="town" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="zip" type="{http://userportal.novell.com/ws/WS-LA-1.0}postalCodeTypeResponse" minOccurs="0"/>
 *                   &lt;element name="isdsParent" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="primaryPerson" type="{http://userportal.novell.com/ws/WS-LA-1.0}primaryPersonTypeResponse" minOccurs="0"/>
 *                   &lt;element name="isdsBoxState" type="{http://userportal.novell.com/ws/WS-LA-1.0}isdsBoxStateTypeResponse" minOccurs="0"/>
 *                   &lt;element name="isdsBoxCreateTime" type="{http://userportal.novell.com/ws/WS-LA-1.0}zuluTimeTypeResponse" minOccurs="0"/>
 *                   &lt;element name="isdsBoxChangeTime" type="{http://userportal.novell.com/ws/WS-LA-1.0}zuluTimeTypeResponse" minOccurs="0"/>
 *                   &lt;element name="isIsdsBoxDisabled" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="object-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "row"
})
@XmlRootElement(name = "SearchDataboxResponse", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class SearchDataboxResponse {

    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected List<SearchDataboxResponse.Row> row;
    @XmlAttribute(name = "total")
    protected BigInteger total;

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchDataboxResponse.Row }
     * 
     * 
     */
    public List<SearchDataboxResponse.Row> getRow() {
        if (row == null) {
            row = new ArrayList<SearchDataboxResponse.Row>();
        }
        return this.row;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotal(BigInteger value) {
        this.total = value;
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
     *         &lt;element name="name" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
     *         &lt;element name="address" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="addressCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="metropolitanDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cityPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="street" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
     *         &lt;element name="houseNumber" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
     *         &lt;element name="sequenceNumber" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
     *         &lt;element name="town" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
     *         &lt;element name="zip" type="{http://userportal.novell.com/ws/WS-LA-1.0}postalCodeTypeResponse" minOccurs="0"/>
     *         &lt;element name="isdsParent" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
     *         &lt;element name="primaryPerson" type="{http://userportal.novell.com/ws/WS-LA-1.0}primaryPersonTypeResponse" minOccurs="0"/>
     *         &lt;element name="isdsBoxState" type="{http://userportal.novell.com/ws/WS-LA-1.0}isdsBoxStateTypeResponse" minOccurs="0"/>
     *         &lt;element name="isdsBoxCreateTime" type="{http://userportal.novell.com/ws/WS-LA-1.0}zuluTimeTypeResponse" minOccurs="0"/>
     *         &lt;element name="isdsBoxChangeTime" type="{http://userportal.novell.com/ws/WS-LA-1.0}zuluTimeTypeResponse" minOccurs="0"/>
     *         &lt;element name="isIsdsBoxDisabled" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="object-id" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Row {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String name;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchDataboxResponse.Row.Address address;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String street;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String houseNumber;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String sequenceNumber;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String town;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String zip;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String isdsParent;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String primaryPerson;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected IsdsBoxStateTypeResponse isdsBoxState;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String isdsBoxCreateTime;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String isdsBoxChangeTime;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected StringBooleanTypeResponse isIsdsBoxDisabled;
        @XmlAttribute(name = "path")
        protected String path;
        @XmlAttribute(name = "object-id")
        protected String objectId;

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
         *     {@link SearchDataboxResponse.Row.Address }
         *     
         */
        public SearchDataboxResponse.Row.Address getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchDataboxResponse.Row.Address }
         *     
         */
        public void setAddress(SearchDataboxResponse.Row.Address value) {
            this.address = value;
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
         * Gets the value of the houseNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHouseNumber() {
            return houseNumber;
        }

        /**
         * Sets the value of the houseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHouseNumber(String value) {
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
         * Gets the value of the town property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTown() {
            return town;
        }

        /**
         * Sets the value of the town property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTown(String value) {
            this.town = value;
        }

        /**
         * Gets the value of the zip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZip() {
            return zip;
        }

        /**
         * Sets the value of the zip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZip(String value) {
            this.zip = value;
        }

        /**
         * Gets the value of the isdsParent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsdsParent() {
            return isdsParent;
        }

        /**
         * Sets the value of the isdsParent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsdsParent(String value) {
            this.isdsParent = value;
        }

        /**
         * Gets the value of the primaryPerson property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryPerson() {
            return primaryPerson;
        }

        /**
         * Sets the value of the primaryPerson property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryPerson(String value) {
            this.primaryPerson = value;
        }

        /**
         * Gets the value of the isdsBoxState property.
         * 
         * @return
         *     possible object is
         *     {@link IsdsBoxStateTypeResponse }
         *     
         */
        public IsdsBoxStateTypeResponse getIsdsBoxState() {
            return isdsBoxState;
        }

        /**
         * Sets the value of the isdsBoxState property.
         * 
         * @param value
         *     allowed object is
         *     {@link IsdsBoxStateTypeResponse }
         *     
         */
        public void setIsdsBoxState(IsdsBoxStateTypeResponse value) {
            this.isdsBoxState = value;
        }

        /**
         * Gets the value of the isdsBoxCreateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsdsBoxCreateTime() {
            return isdsBoxCreateTime;
        }

        /**
         * Sets the value of the isdsBoxCreateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsdsBoxCreateTime(String value) {
            this.isdsBoxCreateTime = value;
        }

        /**
         * Gets the value of the isdsBoxChangeTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsdsBoxChangeTime() {
            return isdsBoxChangeTime;
        }

        /**
         * Sets the value of the isdsBoxChangeTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsdsBoxChangeTime(String value) {
            this.isdsBoxChangeTime = value;
        }

        /**
         * Gets the value of the isIsdsBoxDisabled property.
         * 
         * @return
         *     possible object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public StringBooleanTypeResponse getIsIsdsBoxDisabled() {
            return isIsdsBoxDisabled;
        }

        /**
         * Sets the value of the isIsdsBoxDisabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public void setIsIsdsBoxDisabled(StringBooleanTypeResponse value) {
            this.isIsdsBoxDisabled = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="addressCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="metropolitanDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cityPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            protected String addressCode;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
            protected String street;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
            protected String cityCode;
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
            protected String houseNumber;
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
             *     {@link String }
             *     
             */
            public String getAddressCode() {
                return addressCode;
            }

            /**
             * Sets the value of the addressCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressCode(String value) {
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
             *     {@link String }
             *     
             */
            public String getCityCode() {
                return cityCode;
            }

            /**
             * Sets the value of the cityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityCode(String value) {
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
             *     {@link String }
             *     
             */
            public String getHouseNumber() {
                return houseNumber;
            }

            /**
             * Sets the value of the houseNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHouseNumber(String value) {
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

    }

}
