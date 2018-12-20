
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
 *       &lt;sequence>
 *         &lt;element name="row" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="firstname" type="{http://userportal.novell.com/ws/WS-LA-1.0}firstnameTypeResponse" minOccurs="0"/>
 *                   &lt;element name="surname" type="{http://userportal.novell.com/ws/WS-LA-1.0}surnameTypeResponse" minOccurs="0"/>
 *                   &lt;element name="email" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="type">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="uvolnenZeZamestnani" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="object-path" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "GetOrganizationUserListResponse", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class GetOrganizationUserListResponse {

    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected List<GetOrganizationUserListResponse.Row> row;
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
     * {@link GetOrganizationUserListResponse.Row }
     * 
     * 
     */
    public List<GetOrganizationUserListResponse.Row> getRow() {
        if (row == null) {
            row = new ArrayList<GetOrganizationUserListResponse.Row>();
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
     *         &lt;element name="firstname" type="{http://userportal.novell.com/ws/WS-LA-1.0}firstnameTypeResponse" minOccurs="0"/>
     *         &lt;element name="surname" type="{http://userportal.novell.com/ws/WS-LA-1.0}surnameTypeResponse" minOccurs="0"/>
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
     *                             &lt;element name="type">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="uvolnenZeZamestnani" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="object-path" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        protected String firstname;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String surname;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected GetOrganizationUserListResponse.Row.Email email;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected StringBooleanTypeResponse uvolnenZeZamestnani;
        @XmlAttribute(name = "path")
        protected String path;
        @XmlAttribute(name = "object-path")
        protected String objectPath;
        @XmlAttribute(name = "object-id")
        protected String objectId;

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
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link GetOrganizationUserListResponse.Row.Email }
         *     
         */
        public GetOrganizationUserListResponse.Row.Email getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetOrganizationUserListResponse.Row.Email }
         *     
         */
        public void setEmail(GetOrganizationUserListResponse.Row.Email value) {
            this.email = value;
        }

        /**
         * Gets the value of the uvolnenZeZamestnani property.
         * 
         * @return
         *     possible object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public StringBooleanTypeResponse getUvolnenZeZamestnani() {
            return uvolnenZeZamestnani;
        }

        /**
         * Sets the value of the uvolnenZeZamestnani property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringBooleanTypeResponse }
         *     
         */
        public void setUvolnenZeZamestnani(StringBooleanTypeResponse value) {
            this.uvolnenZeZamestnani = value;
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
         *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="type">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            protected List<GetOrganizationUserListResponse.Row.Email.Item> item;

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
             * {@link GetOrganizationUserListResponse.Row.Email.Item }
             * 
             * 
             */
            public List<GetOrganizationUserListResponse.Row.Email.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<GetOrganizationUserListResponse.Row.Email.Item>();
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
             *         &lt;element name="type">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                protected GetOrganizationUserListResponse.Row.Email.Item.Type type;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String email;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
                protected String description;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetOrganizationUserListResponse.Row.Email.Item.Type }
                 *     
                 */
                public GetOrganizationUserListResponse.Row.Email.Item.Type getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetOrganizationUserListResponse.Row.Email.Item.Type }
                 *     
                 */
                public void setType(GetOrganizationUserListResponse.Row.Email.Item.Type value) {
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class Type {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "text")
                    protected String text;

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
                     * Gets the value of the text property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                }

            }

        }

    }

}
