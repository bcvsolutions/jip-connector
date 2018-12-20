
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
 *                   &lt;element name="name" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                   &lt;element name="contactAddress" minOccurs="0">
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
 *                   &lt;element name="deliveryAddress" minOccurs="0">
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
 *                   &lt;element name="ico" type="{http://userportal.novell.com/ws/WS-LA-1.0}icoTypeResponse" minOccurs="0"/>
 *                   &lt;element name="dic" type="{http://userportal.novell.com/ws/WS-LA-1.0}dicTypeResponse" minOccurs="0"/>
 *                   &lt;element name="typOrganizace" type="{http://userportal.novell.com/ws/WS-LA-1.0}epIdTypOrganizationTypeResponse" minOccurs="0"/>
 *                   &lt;element name="bankAccount" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="officesHours" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="day">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="subjectCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
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
 *                   &lt;element name="roleCentralniNakup" type="{http://userportal.novell.com/ws/WS-LA-1.0}iscnkpRoleTypeResponse" minOccurs="0"/>
 *                   &lt;element name="zruseno" type="{http://userportal.novell.com/ws/WS-LA-1.0}disablingTypeResponse" minOccurs="0"/>
 *                   &lt;element name="casZruseni" type="{http://userportal.novell.com/ws/WS-LA-1.0}zuluTimeTypeResponse" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="object-path" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "SearchOrganizationResponse", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class SearchOrganizationResponse {

    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected List<SearchOrganizationResponse.Row> row;
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
     * {@link SearchOrganizationResponse.Row }
     * 
     * 
     */
    public List<SearchOrganizationResponse.Row> getRow() {
        if (row == null) {
            row = new ArrayList<SearchOrganizationResponse.Row>();
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
     *         &lt;element name="contactAddress" minOccurs="0">
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
     *         &lt;element name="deliveryAddress" minOccurs="0">
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
     *         &lt;element name="ico" type="{http://userportal.novell.com/ws/WS-LA-1.0}icoTypeResponse" minOccurs="0"/>
     *         &lt;element name="dic" type="{http://userportal.novell.com/ws/WS-LA-1.0}dicTypeResponse" minOccurs="0"/>
     *         &lt;element name="typOrganizace" type="{http://userportal.novell.com/ws/WS-LA-1.0}epIdTypOrganizationTypeResponse" minOccurs="0"/>
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
     *                             &lt;element name="day">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="subjectCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
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
     *         &lt;element name="roleCentralniNakup" type="{http://userportal.novell.com/ws/WS-LA-1.0}iscnkpRoleTypeResponse" minOccurs="0"/>
     *         &lt;element name="zruseno" type="{http://userportal.novell.com/ws/WS-LA-1.0}disablingTypeResponse" minOccurs="0"/>
     *         &lt;element name="casZruseni" type="{http://userportal.novell.com/ws/WS-LA-1.0}zuluTimeTypeResponse" minOccurs="0"/>
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
    public static class Row {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String name;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchOrganizationResponse.Row.ContactAddress contactAddress;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchOrganizationResponse.Row.DeliveryAddress deliveryAddress;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchOrganizationResponse.Row.Email email;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchOrganizationResponse.Row.TelephoneNumber telephoneNumber;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String ico;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String dic;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected EpIdTypOrganizationTypeResponse typOrganizace;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchOrganizationResponse.Row.BankAccount bankAccount;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchOrganizationResponse.Row.OfficesHours officesHours;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String subjectCode;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected SearchOrganizationResponse.Row.Url url;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected IscnkpRoleTypeResponse roleCentralniNakup;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected DisablingTypeResponse zruseno;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String casZruseni;
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
         * Gets the value of the contactAddress property.
         * 
         * @return
         *     possible object is
         *     {@link SearchOrganizationResponse.Row.ContactAddress }
         *     
         */
        public SearchOrganizationResponse.Row.ContactAddress getContactAddress() {
            return contactAddress;
        }

        /**
         * Sets the value of the contactAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchOrganizationResponse.Row.ContactAddress }
         *     
         */
        public void setContactAddress(SearchOrganizationResponse.Row.ContactAddress value) {
            this.contactAddress = value;
        }

        /**
         * Gets the value of the deliveryAddress property.
         * 
         * @return
         *     possible object is
         *     {@link SearchOrganizationResponse.Row.DeliveryAddress }
         *     
         */
        public SearchOrganizationResponse.Row.DeliveryAddress getDeliveryAddress() {
            return deliveryAddress;
        }

        /**
         * Sets the value of the deliveryAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchOrganizationResponse.Row.DeliveryAddress }
         *     
         */
        public void setDeliveryAddress(SearchOrganizationResponse.Row.DeliveryAddress value) {
            this.deliveryAddress = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link SearchOrganizationResponse.Row.Email }
         *     
         */
        public SearchOrganizationResponse.Row.Email getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchOrganizationResponse.Row.Email }
         *     
         */
        public void setEmail(SearchOrganizationResponse.Row.Email value) {
            this.email = value;
        }

        /**
         * Gets the value of the telephoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link SearchOrganizationResponse.Row.TelephoneNumber }
         *     
         */
        public SearchOrganizationResponse.Row.TelephoneNumber getTelephoneNumber() {
            return telephoneNumber;
        }

        /**
         * Sets the value of the telephoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchOrganizationResponse.Row.TelephoneNumber }
         *     
         */
        public void setTelephoneNumber(SearchOrganizationResponse.Row.TelephoneNumber value) {
            this.telephoneNumber = value;
        }

        /**
         * Gets the value of the ico property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIco() {
            return ico;
        }

        /**
         * Sets the value of the ico property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIco(String value) {
            this.ico = value;
        }

        /**
         * Gets the value of the dic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDic() {
            return dic;
        }

        /**
         * Sets the value of the dic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDic(String value) {
            this.dic = value;
        }

        /**
         * Gets the value of the typOrganizace property.
         * 
         * @return
         *     possible object is
         *     {@link EpIdTypOrganizationTypeResponse }
         *     
         */
        public EpIdTypOrganizationTypeResponse getTypOrganizace() {
            return typOrganizace;
        }

        /**
         * Sets the value of the typOrganizace property.
         * 
         * @param value
         *     allowed object is
         *     {@link EpIdTypOrganizationTypeResponse }
         *     
         */
        public void setTypOrganizace(EpIdTypOrganizationTypeResponse value) {
            this.typOrganizace = value;
        }

        /**
         * Gets the value of the bankAccount property.
         * 
         * @return
         *     possible object is
         *     {@link SearchOrganizationResponse.Row.BankAccount }
         *     
         */
        public SearchOrganizationResponse.Row.BankAccount getBankAccount() {
            return bankAccount;
        }

        /**
         * Sets the value of the bankAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchOrganizationResponse.Row.BankAccount }
         *     
         */
        public void setBankAccount(SearchOrganizationResponse.Row.BankAccount value) {
            this.bankAccount = value;
        }

        /**
         * Gets the value of the officesHours property.
         * 
         * @return
         *     possible object is
         *     {@link SearchOrganizationResponse.Row.OfficesHours }
         *     
         */
        public SearchOrganizationResponse.Row.OfficesHours getOfficesHours() {
            return officesHours;
        }

        /**
         * Sets the value of the officesHours property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchOrganizationResponse.Row.OfficesHours }
         *     
         */
        public void setOfficesHours(SearchOrganizationResponse.Row.OfficesHours value) {
            this.officesHours = value;
        }

        /**
         * Gets the value of the subjectCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubjectCode() {
            return subjectCode;
        }

        /**
         * Sets the value of the subjectCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubjectCode(String value) {
            this.subjectCode = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link SearchOrganizationResponse.Row.Url }
         *     
         */
        public SearchOrganizationResponse.Row.Url getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchOrganizationResponse.Row.Url }
         *     
         */
        public void setUrl(SearchOrganizationResponse.Row.Url value) {
            this.url = value;
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
         * Gets the value of the zruseno property.
         * 
         * @return
         *     possible object is
         *     {@link DisablingTypeResponse }
         *     
         */
        public DisablingTypeResponse getZruseno() {
            return zruseno;
        }

        /**
         * Sets the value of the zruseno property.
         * 
         * @param value
         *     allowed object is
         *     {@link DisablingTypeResponse }
         *     
         */
        public void setZruseno(DisablingTypeResponse value) {
            this.zruseno = value;
        }

        /**
         * Gets the value of the casZruseni property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCasZruseni() {
            return casZruseni;
        }

        /**
         * Sets the value of the casZruseni property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCasZruseni(String value) {
            this.casZruseni = value;
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
            protected List<SearchOrganizationResponse.Row.BankAccount.Item> item;

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
             * {@link SearchOrganizationResponse.Row.BankAccount.Item }
             * 
             * 
             */
            public List<SearchOrganizationResponse.Row.BankAccount.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchOrganizationResponse.Row.BankAccount.Item>();
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
        public static class ContactAddress {

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
        public static class DeliveryAddress {

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
            protected List<SearchOrganizationResponse.Row.Email.Item> item;

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
             * {@link SearchOrganizationResponse.Row.Email.Item }
             * 
             * 
             */
            public List<SearchOrganizationResponse.Row.Email.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchOrganizationResponse.Row.Email.Item>();
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
                protected SearchOrganizationResponse.Row.Email.Item.Type type;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String email;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
                protected String description;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchOrganizationResponse.Row.Email.Item.Type }
                 *     
                 */
                public SearchOrganizationResponse.Row.Email.Item.Type getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchOrganizationResponse.Row.Email.Item.Type }
                 *     
                 */
                public void setType(SearchOrganizationResponse.Row.Email.Item.Type value) {
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
         *                   &lt;element name="day">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            protected List<SearchOrganizationResponse.Row.OfficesHours.Item> item;

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
             * {@link SearchOrganizationResponse.Row.OfficesHours.Item }
             * 
             * 
             */
            public List<SearchOrganizationResponse.Row.OfficesHours.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchOrganizationResponse.Row.OfficesHours.Item>();
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
             *         &lt;element name="day">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                protected SearchOrganizationResponse.Row.OfficesHours.Item.Day day;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String from;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String to;

                /**
                 * Gets the value of the day property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchOrganizationResponse.Row.OfficesHours.Item.Day }
                 *     
                 */
                public SearchOrganizationResponse.Row.OfficesHours.Item.Day getDay() {
                    return day;
                }

                /**
                 * Sets the value of the day property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchOrganizationResponse.Row.OfficesHours.Item.Day }
                 *     
                 */
                public void setDay(SearchOrganizationResponse.Row.OfficesHours.Item.Day value) {
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
                public static class Day {

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
            protected List<SearchOrganizationResponse.Row.TelephoneNumber.Item> item;

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
             * {@link SearchOrganizationResponse.Row.TelephoneNumber.Item }
             * 
             * 
             */
            public List<SearchOrganizationResponse.Row.TelephoneNumber.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchOrganizationResponse.Row.TelephoneNumber.Item>();
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
                protected SearchOrganizationResponse.Row.TelephoneNumber.Item.Type type;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String number;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchOrganizationResponse.Row.TelephoneNumber.Item.Type }
                 *     
                 */
                public SearchOrganizationResponse.Row.TelephoneNumber.Item.Type getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchOrganizationResponse.Row.TelephoneNumber.Item.Type }
                 *     
                 */
                public void setType(SearchOrganizationResponse.Row.TelephoneNumber.Item.Type value) {
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
            protected List<SearchOrganizationResponse.Row.Url.Item> item;

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
             * {@link SearchOrganizationResponse.Row.Url.Item }
             * 
             * 
             */
            public List<SearchOrganizationResponse.Row.Url.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<SearchOrganizationResponse.Row.Url.Item>();
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
                protected SearchOrganizationResponse.Row.Url.Item.Type type;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
                protected String url;
                @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
                protected String description;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchOrganizationResponse.Row.Url.Item.Type }
                 *     
                 */
                public SearchOrganizationResponse.Row.Url.Item.Type getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchOrganizationResponse.Row.Url.Item.Type }
                 *     
                 */
                public void setType(SearchOrganizationResponse.Row.Url.Item.Type value) {
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
