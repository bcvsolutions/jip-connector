
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
 *                   &lt;element name="isPrimaryPerson" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *                   &lt;element name="firstname" type="{http://userportal.novell.com/ws/WS-LA-1.0}firstnameTypeResponse" minOccurs="0"/>
 *                   &lt;element name="surname" type="{http://userportal.novell.com/ws/WS-LA-1.0}surnameTypeResponse" minOccurs="0"/>
 *                   &lt;element name="loginDisabled" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *                   &lt;element name="userAllRole" type="{http://userportal.novell.com/ws/WS-LA-1.0}userAllRoleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="verejnaOsoba" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *                   &lt;element name="osobaKrizovehoRizeni" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *                   &lt;element name="casPosledniZmeny" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="object-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "GetUserListResponse", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class GetUserListResponse {

    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected List<GetUserListResponse.Row> row;
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
     * {@link GetUserListResponse.Row }
     * 
     * 
     */
    public List<GetUserListResponse.Row> getRow() {
        if (row == null) {
            row = new ArrayList<GetUserListResponse.Row>();
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
     *         &lt;element name="isPrimaryPerson" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
     *         &lt;element name="firstname" type="{http://userportal.novell.com/ws/WS-LA-1.0}firstnameTypeResponse" minOccurs="0"/>
     *         &lt;element name="surname" type="{http://userportal.novell.com/ws/WS-LA-1.0}surnameTypeResponse" minOccurs="0"/>
     *         &lt;element name="loginDisabled" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
     *         &lt;element name="userAllRole" type="{http://userportal.novell.com/ws/WS-LA-1.0}userAllRoleTypeResponse" minOccurs="0"/>
     *         &lt;element name="verejnaOsoba" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
     *         &lt;element name="osobaKrizovehoRizeni" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
     *         &lt;element name="casPosledniZmeny" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
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
    public static class Row {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected StringBooleanTypeResponse isPrimaryPerson;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String firstname;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String surname;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected StringBooleanTypeResponse loginDisabled;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected UserAllRoleTypeResponse userAllRole;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected StringBooleanTypeResponse verejnaOsoba;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected StringBooleanTypeResponse osobaKrizovehoRizeni;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String casPosledniZmeny;
        @XmlAttribute(name = "path")
        protected String path;
        @XmlAttribute(name = "object-id")
        protected String objectId;
        @XmlAttribute(name = "username")
        protected String username;

        /**
         * Gets the value of the isPrimaryPerson property.
         * 
         * @return
         *     possible object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public StringBooleanTypeResponse getIsPrimaryPerson() {
            return isPrimaryPerson;
        }

        /**
         * Sets the value of the isPrimaryPerson property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public void setIsPrimaryPerson(StringBooleanTypeResponse value) {
            this.isPrimaryPerson = value;
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
         * Gets the value of the loginDisabled property.
         * 
         * @return
         *     possible object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public StringBooleanTypeResponse getLoginDisabled() {
            return loginDisabled;
        }

        /**
         * Sets the value of the loginDisabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public void setLoginDisabled(StringBooleanTypeResponse value) {
            this.loginDisabled = value;
        }

        /**
         * Gets the value of the userAllRole property.
         * 
         * @return
         *     possible object is
         *     {@link UserAllRoleTypeResponse }
         *     
         */
        public UserAllRoleTypeResponse getUserAllRole() {
            return userAllRole;
        }

        /**
         * Sets the value of the userAllRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserAllRoleTypeResponse }
         *     
         */
        public void setUserAllRole(UserAllRoleTypeResponse value) {
            this.userAllRole = value;
        }

        /**
         * Gets the value of the verejnaOsoba property.
         * 
         * @return
         *     possible object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public StringBooleanTypeResponse getVerejnaOsoba() {
            return verejnaOsoba;
        }

        /**
         * Sets the value of the verejnaOsoba property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public void setVerejnaOsoba(StringBooleanTypeResponse value) {
            this.verejnaOsoba = value;
        }

        /**
         * Gets the value of the osobaKrizovehoRizeni property.
         * 
         * @return
         *     possible object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public StringBooleanTypeResponse getOsobaKrizovehoRizeni() {
            return osobaKrizovehoRizeni;
        }

        /**
         * Sets the value of the osobaKrizovehoRizeni property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public void setOsobaKrizovehoRizeni(StringBooleanTypeResponse value) {
            this.osobaKrizovehoRizeni = value;
        }

        /**
         * Gets the value of the casPosledniZmeny property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCasPosledniZmeny() {
            return casPosledniZmeny;
        }

        /**
         * Sets the value of the casPosledniZmeny property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCasPosledniZmeny(String value) {
            this.casPosledniZmeny = value;
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

    }

}
