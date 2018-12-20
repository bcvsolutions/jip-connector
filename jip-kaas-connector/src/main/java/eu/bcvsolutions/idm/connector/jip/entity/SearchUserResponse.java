
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
 *                   &lt;element name="isPrimaryPerson" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *                   &lt;element name="titulPred" type="{http://userportal.novell.com/ws/WS-LA-1.0}titleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="firstname" type="{http://userportal.novell.com/ws/WS-LA-1.0}firstnameTypeResponse" minOccurs="0"/>
 *                   &lt;element name="surname" type="{http://userportal.novell.com/ws/WS-LA-1.0}surnameTypeResponse" minOccurs="0"/>
 *                   &lt;element name="titulZa" type="{http://userportal.novell.com/ws/WS-LA-1.0}titleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="photo" type="{http://userportal.novell.com/ws/WS-LA-1.0}userPhotoTypeResponse" minOccurs="0"/>
 *                   &lt;element name="loginDisabled" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
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
 *                   &lt;element name="telephoneNumber" minOccurs="0">
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
 *                                       &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="crisisTelephoneNumber" minOccurs="0">
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
 *                                       &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="clientCertificate" minOccurs="0">
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
 *                                       &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="issuer" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="userAllRole" type="{http://userportal.novell.com/ws/WS-LA-1.0}userAllRoleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="role" type="{http://userportal.novell.com/ws/WS-LA-1.0}userRoleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="roleCzechPoint" type="{http://userportal.novell.com/ws/WS-LA-1.0}czpRoleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="roleCzpAtOffice" type="{http://userportal.novell.com/ws/WS-LA-1.0}czpOfficeRoleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="roleVirtuos" type="{http://userportal.novell.com/ws/WS-LA-1.0}virtuosRoleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="roleCentralniNakup" type="{http://userportal.novell.com/ws/WS-LA-1.0}iscnkpRoleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="roleIsuiObce" type="{http://userportal.novell.com/ws/WS-LA-1.0}isuiObecRoleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="roleIsuiStavebniUrady" type="{http://userportal.novell.com/ws/WS-LA-1.0}isuiStUradyRoleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="aisRole" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ovmPersonType" type="{http://userportal.novell.com/ws/WS-LA-1.0}ovmPersonTypeResponse" minOccurs="0"/>
 *                   &lt;element name="function" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="url" minOccurs="0">
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
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="predchoziZamestnavatel" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="uvolnenZeZamestnani" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *                   &lt;element name="verejnaOsoba" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *                   &lt;element name="osobaKrizovehoRizeni" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *                   &lt;element name="poznamka" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="cisloJednaci" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="agendy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ohlasovatel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="isds" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="platnostOd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="platnostDo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="cinnostniRole" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="agenda" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="platnostOd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="platnostDo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlRootElement(name = "SearchUserResponse", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class SearchUserResponse {

    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected List<SearchUserResponse.Row> row;
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
     * {@link SearchUserResponse.Row }
     * 
     * 
     */
    public List<SearchUserResponse.Row> getRow() {
        if (row == null) {
            row = new ArrayList<SearchUserResponse.Row>();
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
     *         &lt;element name="titulPred" type="{http://userportal.novell.com/ws/WS-LA-1.0}titleTypeResponse" minOccurs="0"/>
     *         &lt;element name="firstname" type="{http://userportal.novell.com/ws/WS-LA-1.0}firstnameTypeResponse" minOccurs="0"/>
     *         &lt;element name="surname" type="{http://userportal.novell.com/ws/WS-LA-1.0}surnameTypeResponse" minOccurs="0"/>
     *         &lt;element name="titulZa" type="{http://userportal.novell.com/ws/WS-LA-1.0}titleTypeResponse" minOccurs="0"/>
     *         &lt;element name="photo" type="{http://userportal.novell.com/ws/WS-LA-1.0}userPhotoTypeResponse" minOccurs="0"/>
     *         &lt;element name="loginDisabled" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
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
     *                             &lt;element name="type">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *                             &lt;element name="type">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *                             &lt;element name="type">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="userAllRole" type="{http://userportal.novell.com/ws/WS-LA-1.0}userAllRoleTypeResponse" minOccurs="0"/>
     *         &lt;element name="role" type="{http://userportal.novell.com/ws/WS-LA-1.0}userRoleTypeResponse" minOccurs="0"/>
     *         &lt;element name="roleCzechPoint" type="{http://userportal.novell.com/ws/WS-LA-1.0}czpRoleTypeResponse" minOccurs="0"/>
     *         &lt;element name="roleCzpAtOffice" type="{http://userportal.novell.com/ws/WS-LA-1.0}czpOfficeRoleTypeResponse" minOccurs="0"/>
     *         &lt;element name="roleVirtuos" type="{http://userportal.novell.com/ws/WS-LA-1.0}virtuosRoleTypeResponse" minOccurs="0"/>
     *         &lt;element name="roleCentralniNakup" type="{http://userportal.novell.com/ws/WS-LA-1.0}iscnkpRoleTypeResponse" minOccurs="0"/>
     *         &lt;element name="roleIsuiObce" type="{http://userportal.novell.com/ws/WS-LA-1.0}isuiObecRoleTypeResponse" minOccurs="0"/>
     *         &lt;element name="roleIsuiStavebniUrady" type="{http://userportal.novell.com/ws/WS-LA-1.0}isuiStUradyRoleTypeResponse" minOccurs="0"/>
     *         &lt;element name="aisRole" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ovmPersonType" type="{http://userportal.novell.com/ws/WS-LA-1.0}ovmPersonTypeResponse" minOccurs="0"/>
     *         &lt;element name="function" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
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
     *                             &lt;element name="type">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="predchoziZamestnavatel" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
     *         &lt;element name="uvolnenZeZamestnani" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
     *         &lt;element name="verejnaOsoba" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
     *         &lt;element name="osobaKrizovehoRizeni" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
     *         &lt;element name="poznamka" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
     *         &lt;element name="cisloJednaci" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
     *         &lt;element name="agendy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ohlasovatel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="isds" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="platnostOd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="platnostDo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
     *                           &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="platnostOd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="platnostDo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        protected String titulPred;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String firstname;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String surname;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String titulZa;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected byte[] photo;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected StringBooleanTypeResponse loginDisabled;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchUserResponse.Row.Address address;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchUserResponse.Row.Email email;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchUserResponse.Row.TelephoneNumber telephoneNumber;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchUserResponse.Row.CrisisTelephoneNumber crisisTelephoneNumber;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchUserResponse.Row.ClientCertificate clientCertificate;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected UserAllRoleTypeResponse userAllRole;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected UserRoleTypeResponse role;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected CzpRoleTypeResponse roleCzechPoint;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected CzpOfficeRoleTypeResponse roleCzpAtOffice;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected VirtuosRoleTypeResponse roleVirtuos;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected IscnkpRoleTypeResponse roleCentralniNakup;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected IsuiObecRoleTypeResponse roleIsuiObce;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected IsuiStUradyRoleTypeResponse roleIsuiStavebniUrady;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchUserResponse.Row.AisRole aisRole;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected OvmPersonTypeResponse ovmPersonType;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String function;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchUserResponse.Row.Url url;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String predchoziZamestnavatel;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected StringBooleanTypeResponse uvolnenZeZamestnani;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected StringBooleanTypeResponse verejnaOsoba;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected StringBooleanTypeResponse osobaKrizovehoRizeni;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String poznamka;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String cisloJednaci;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchUserResponse.Row.Agendy agendy;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchUserResponse.Row.CinnostniRole cinnostniRole;
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
         * Gets the value of the titulPred property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitulPred() {
            return titulPred;
        }

        /**
         * Sets the value of the titulPred property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitulPred(String value) {
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
         *     {@link String }
         *     
         */
        public String getTitulZa() {
            return titulZa;
        }

        /**
         * Sets the value of the titulZa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitulZa(String value) {
            this.titulZa = value;
        }

        /**
         * Gets the value of the photo property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getPhoto() {
            return photo;
        }

        /**
         * Sets the value of the photo property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setPhoto(byte[] value) {
            this.photo = value;
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
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link SearchUserResponse.Row.Address }
         *     
         */
        public SearchUserResponse.Row.Address getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchUserResponse.Row.Address }
         *     
         */
        public void setAddress(SearchUserResponse.Row.Address value) {
            this.address = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link SearchUserResponse.Row.Email }
         *     
         */
        public SearchUserResponse.Row.Email getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchUserResponse.Row.Email }
         *     
         */
        public void setEmail(SearchUserResponse.Row.Email value) {
            this.email = value;
        }

        /**
         * Gets the value of the telephoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link SearchUserResponse.Row.TelephoneNumber }
         *     
         */
        public SearchUserResponse.Row.TelephoneNumber getTelephoneNumber() {
            return telephoneNumber;
        }

        /**
         * Sets the value of the telephoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchUserResponse.Row.TelephoneNumber }
         *     
         */
        public void setTelephoneNumber(SearchUserResponse.Row.TelephoneNumber value) {
            this.telephoneNumber = value;
        }

        /**
         * Gets the value of the crisisTelephoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link SearchUserResponse.Row.CrisisTelephoneNumber }
         *     
         */
        public SearchUserResponse.Row.CrisisTelephoneNumber getCrisisTelephoneNumber() {
            return crisisTelephoneNumber;
        }

        /**
         * Sets the value of the crisisTelephoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchUserResponse.Row.CrisisTelephoneNumber }
         *     
         */
        public void setCrisisTelephoneNumber(SearchUserResponse.Row.CrisisTelephoneNumber value) {
            this.crisisTelephoneNumber = value;
        }

        /**
         * Gets the value of the clientCertificate property.
         * 
         * @return
         *     possible object is
         *     {@link SearchUserResponse.Row.ClientCertificate }
         *     
         */
        public SearchUserResponse.Row.ClientCertificate getClientCertificate() {
            return clientCertificate;
        }

        /**
         * Sets the value of the clientCertificate property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchUserResponse.Row.ClientCertificate }
         *     
         */
        public void setClientCertificate(SearchUserResponse.Row.ClientCertificate value) {
            this.clientCertificate = value;
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
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link UserRoleTypeResponse }
         *     
         */
        public UserRoleTypeResponse getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserRoleTypeResponse }
         *     
         */
        public void setRole(UserRoleTypeResponse value) {
            this.role = value;
        }

        /**
         * Gets the value of the roleCzechPoint property.
         * 
         * @return
         *     possible object is
         *     {@link CzpRoleTypeResponse }
         *     
         */
        public CzpRoleTypeResponse getRoleCzechPoint() {
            return roleCzechPoint;
        }

        /**
         * Sets the value of the roleCzechPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link CzpRoleTypeResponse }
         *     
         */
        public void setRoleCzechPoint(CzpRoleTypeResponse value) {
            this.roleCzechPoint = value;
        }

        /**
         * Gets the value of the roleCzpAtOffice property.
         * 
         * @return
         *     possible object is
         *     {@link CzpOfficeRoleTypeResponse }
         *     
         */
        public CzpOfficeRoleTypeResponse getRoleCzpAtOffice() {
            return roleCzpAtOffice;
        }

        /**
         * Sets the value of the roleCzpAtOffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link CzpOfficeRoleTypeResponse }
         *     
         */
        public void setRoleCzpAtOffice(CzpOfficeRoleTypeResponse value) {
            this.roleCzpAtOffice = value;
        }

        /**
         * Gets the value of the roleVirtuos property.
         * 
         * @return
         *     possible object is
         *     {@link VirtuosRoleTypeResponse }
         *     
         */
        public VirtuosRoleTypeResponse getRoleVirtuos() {
            return roleVirtuos;
        }

        /**
         * Sets the value of the roleVirtuos property.
         * 
         * @param value
         *     allowed object is
         *     {@link VirtuosRoleTypeResponse }
         *     
         */
        public void setRoleVirtuos(VirtuosRoleTypeResponse value) {
            this.roleVirtuos = value;
        }

        /**
         * Gets the value of the roleCentralniNakup property.
         * 
         * @return
         *     possible object is
         *     {@link IscnkpRoleTypeResponse }
         *     
         */
        public IscnkpRoleTypeResponse getRoleCentralniNakup() {
            return roleCentralniNakup;
        }

        /**
         * Sets the value of the roleCentralniNakup property.
         * 
         * @param value
         *     allowed object is
         *     {@link IscnkpRoleTypeResponse }
         *     
         */
        public void setRoleCentralniNakup(IscnkpRoleTypeResponse value) {
            this.roleCentralniNakup = value;
        }

        /**
         * Gets the value of the roleIsuiObce property.
         * 
         * @return
         *     possible object is
         *     {@link IsuiObecRoleTypeResponse }
         *     
         */
        public IsuiObecRoleTypeResponse getRoleIsuiObce() {
            return roleIsuiObce;
        }

        /**
         * Sets the value of the roleIsuiObce property.
         * 
         * @param value
         *     allowed object is
         *     {@link IsuiObecRoleTypeResponse }
         *     
         */
        public void setRoleIsuiObce(IsuiObecRoleTypeResponse value) {
            this.roleIsuiObce = value;
        }

        /**
         * Gets the value of the roleIsuiStavebniUrady property.
         * 
         * @return
         *     possible object is
         *     {@link IsuiStUradyRoleTypeResponse }
         *     
         */
        public IsuiStUradyRoleTypeResponse getRoleIsuiStavebniUrady() {
            return roleIsuiStavebniUrady;
        }

        /**
         * Sets the value of the roleIsuiStavebniUrady property.
         * 
         * @param value
         *     allowed object is
         *     {@link IsuiStUradyRoleTypeResponse }
         *     
         */
        public void setRoleIsuiStavebniUrady(IsuiStUradyRoleTypeResponse value) {
            this.roleIsuiStavebniUrady = value;
        }

        /**
         * Gets the value of the aisRole property.
         * 
         * @return
         *     possible object is
         *     {@link SearchUserResponse.Row.AisRole }
         *     
         */
        public SearchUserResponse.Row.AisRole getAisRole() {
            return aisRole;
        }

        /**
         * Sets the value of the aisRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchUserResponse.Row.AisRole }
         *     
         */
        public void setAisRole(SearchUserResponse.Row.AisRole value) {
            this.aisRole = value;
        }

        /**
         * Gets the value of the ovmPersonType property.
         * 
         * @return
         *     possible object is
         *     {@link OvmPersonTypeResponse }
         *     
         */
        public OvmPersonTypeResponse getOvmPersonType() {
            return ovmPersonType;
        }

        /**
         * Sets the value of the ovmPersonType property.
         * 
         * @param value
         *     allowed object is
         *     {@link OvmPersonTypeResponse }
         *     
         */
        public void setOvmPersonType(OvmPersonTypeResponse value) {
            this.ovmPersonType = value;
        }

        /**
         * Gets the value of the function property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFunction() {
            return function;
        }

        /**
         * Sets the value of the function property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFunction(String value) {
            this.function = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link SearchUserResponse.Row.Url }
         *     
         */
        public SearchUserResponse.Row.Url getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchUserResponse.Row.Url }
         *     
         */
        public void setUrl(SearchUserResponse.Row.Url value) {
            this.url = value;
        }

        /**
         * Gets the value of the predchoziZamestnavatel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPredchoziZamestnavatel() {
            return predchoziZamestnavatel;
        }

        /**
         * Sets the value of the predchoziZamestnavatel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPredchoziZamestnavatel(String value) {
            this.predchoziZamestnavatel = value;
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
         * Gets the value of the poznamka property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPoznamka() {
            return poznamka;
        }

        /**
         * Sets the value of the poznamka property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPoznamka(String value) {
            this.poznamka = value;
        }

        /**
         * Gets the value of the cisloJednaci property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCisloJednaci() {
            return cisloJednaci;
        }

        /**
         * Sets the value of the cisloJednaci property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCisloJednaci(String value) {
            this.cisloJednaci = value;
        }

        /**
         * Gets the value of the agendy property.
         * 
         * @return
         *     possible object is
         *     {@link SearchUserResponse.Row.Agendy }
         *     
         */
        public SearchUserResponse.Row.Agendy getAgendy() {
            return agendy;
        }

        /**
         * Sets the value of the agendy property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchUserResponse.Row.Agendy }
         *     
         */
        public void setAgendy(SearchUserResponse.Row.Agendy value) {
            this.agendy = value;
        }

        /**
         * Gets the value of the cinnostniRole property.
         * 
         * @return
         *     possible object is
         *     {@link SearchUserResponse.Row.CinnostniRole }
         *     
         */
        public SearchUserResponse.Row.CinnostniRole getCinnostniRole() {
            return cinnostniRole;
        }

        /**
         * Sets the value of the cinnostniRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchUserResponse.Row.CinnostniRole }
         *     
         */
        public void setCinnostniRole(SearchUserResponse.Row.CinnostniRole value) {
            this.cinnostniRole = value;
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
         *                 &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ohlasovatel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="isds" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="platnostOd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="platnostDo" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Agendy {

            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
            protected List<SearchUserResponse.Row.Agendy.Item> item;

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
             * {@link SearchUserResponse.Row.Agendy.Item }
             * 
             * 
             */
            public List<SearchUserResponse.Row.Agendy.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchUserResponse.Row.Agendy.Item>();
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
             *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ohlasovatel" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="isds" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="platnostOd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="platnostDo" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                @XmlAttribute(name = "text")
                protected String text;
                @XmlAttribute(name = "ohlasovatel")
                protected String ohlasovatel;
                @XmlAttribute(name = "isds")
                protected String isds;
                @XmlAttribute(name = "platnostOd")
                protected String platnostOd;
                @XmlAttribute(name = "platnostDo")
                protected String platnostDo;

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

                /**
                 * Gets the value of the ohlasovatel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOhlasovatel() {
                    return ohlasovatel;
                }

                /**
                 * Sets the value of the ohlasovatel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOhlasovatel(String value) {
                    this.ohlasovatel = value;
                }

                /**
                 * Gets the value of the isds property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsds() {
                    return isds;
                }

                /**
                 * Sets the value of the isds property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsds(String value) {
                    this.isds = value;
                }

                /**
                 * Gets the value of the platnostOd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlatnostOd() {
                    return platnostOd;
                }

                /**
                 * Sets the value of the platnostOd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlatnostOd(String value) {
                    this.platnostOd = value;
                }

                /**
                 * Gets the value of the platnostDo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlatnostDo() {
                    return platnostDo;
                }

                /**
                 * Sets the value of the platnostDo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlatnostDo(String value) {
                    this.platnostDo = value;
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
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class AisRole {

            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
            protected List<SearchUserResponse.Row.AisRole.Item> item;

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
             * {@link SearchUserResponse.Row.AisRole.Item }
             * 
             * 
             */
            public List<SearchUserResponse.Row.AisRole.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchUserResponse.Row.AisRole.Item>();
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
            public static class Item {

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
         *                 &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="platnostOd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="platnostDo" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            protected List<SearchUserResponse.Row.CinnostniRole.Item> item;

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
             * {@link SearchUserResponse.Row.CinnostniRole.Item }
             * 
             * 
             */
            public List<SearchUserResponse.Row.CinnostniRole.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchUserResponse.Row.CinnostniRole.Item>();
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
             *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="platnostOd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="platnostDo" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                @XmlAttribute(name = "text")
                protected String text;
                @XmlAttribute(name = "platnostOd")
                protected String platnostOd;
                @XmlAttribute(name = "platnostDo")
                protected String platnostDo;

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

                /**
                 * Gets the value of the platnostOd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlatnostOd() {
                    return platnostOd;
                }

                /**
                 * Sets the value of the platnostOd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlatnostOd(String value) {
                    this.platnostOd = value;
                }

                /**
                 * Gets the value of the platnostDo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlatnostDo() {
                    return platnostDo;
                }

                /**
                 * Sets the value of the platnostDo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlatnostDo(String value) {
                    this.platnostDo = value;
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
         *                   &lt;element name="type">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            protected List<SearchUserResponse.Row.ClientCertificate.Item> item;

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
             * {@link SearchUserResponse.Row.ClientCertificate.Item }
             * 
             * 
             */
            public List<SearchUserResponse.Row.ClientCertificate.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchUserResponse.Row.ClientCertificate.Item>();
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
                protected SearchUserResponse.Row.ClientCertificate.Item.Type type;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String number;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String issuer;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchUserResponse.Row.ClientCertificate.Item.Type }
                 *     
                 */
                public SearchUserResponse.Row.ClientCertificate.Item.Type getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchUserResponse.Row.ClientCertificate.Item.Type }
                 *     
                 */
                public void setType(SearchUserResponse.Row.ClientCertificate.Item.Type value) {
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
            protected List<SearchUserResponse.Row.CrisisTelephoneNumber.Item> item;

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
             * {@link SearchUserResponse.Row.CrisisTelephoneNumber.Item }
             * 
             * 
             */
            public List<SearchUserResponse.Row.CrisisTelephoneNumber.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchUserResponse.Row.CrisisTelephoneNumber.Item>();
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
                protected SearchUserResponse.Row.CrisisTelephoneNumber.Item.Type type;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String number;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchUserResponse.Row.CrisisTelephoneNumber.Item.Type }
                 *     
                 */
                public SearchUserResponse.Row.CrisisTelephoneNumber.Item.Type getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchUserResponse.Row.CrisisTelephoneNumber.Item.Type }
                 *     
                 */
                public void setType(SearchUserResponse.Row.CrisisTelephoneNumber.Item.Type value) {
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
            protected List<SearchUserResponse.Row.Email.Item> item;

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
             * {@link SearchUserResponse.Row.Email.Item }
             * 
             * 
             */
            public List<SearchUserResponse.Row.Email.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchUserResponse.Row.Email.Item>();
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
                protected SearchUserResponse.Row.Email.Item.Type type;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String email;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
                protected String description;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchUserResponse.Row.Email.Item.Type }
                 *     
                 */
                public SearchUserResponse.Row.Email.Item.Type getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchUserResponse.Row.Email.Item.Type }
                 *     
                 */
                public void setType(SearchUserResponse.Row.Email.Item.Type value) {
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
            protected List<SearchUserResponse.Row.TelephoneNumber.Item> item;

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
             * {@link SearchUserResponse.Row.TelephoneNumber.Item }
             * 
             * 
             */
            public List<SearchUserResponse.Row.TelephoneNumber.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchUserResponse.Row.TelephoneNumber.Item>();
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
                protected SearchUserResponse.Row.TelephoneNumber.Item.Type type;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String number;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchUserResponse.Row.TelephoneNumber.Item.Type }
                 *     
                 */
                public SearchUserResponse.Row.TelephoneNumber.Item.Type getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchUserResponse.Row.TelephoneNumber.Item.Type }
                 *     
                 */
                public void setType(SearchUserResponse.Row.TelephoneNumber.Item.Type value) {
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
            protected List<SearchUserResponse.Row.Url.Item> item;

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
             * {@link SearchUserResponse.Row.Url.Item }
             * 
             * 
             */
            public List<SearchUserResponse.Row.Url.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchUserResponse.Row.Url.Item>();
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
                protected SearchUserResponse.Row.Url.Item.Type type;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String url;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
                protected String description;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchUserResponse.Row.Url.Item.Type }
                 *     
                 */
                public SearchUserResponse.Row.Url.Item.Type getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchUserResponse.Row.Url.Item.Type }
                 *     
                 */
                public void setType(SearchUserResponse.Row.Url.Item.Type value) {
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
