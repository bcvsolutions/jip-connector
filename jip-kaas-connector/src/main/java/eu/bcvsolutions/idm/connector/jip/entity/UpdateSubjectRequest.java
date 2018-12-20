
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
 *         &lt;element name="name" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType" minOccurs="0"/>
 *         &lt;element name="typInstituce" type="{http://userportal.novell.com/ws/WS-LA-1.0}wsAdvocateCzptypinstituceAdvocateType" minOccurs="0"/>
 *         &lt;element name="contactAddress" minOccurs="0">
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
 *         &lt;element name="contactAddressPostalCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}notRequiredPostalCodeType" minOccurs="0"/>
 *         &lt;element name="contactAddressPoBoxCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}poBoxType" minOccurs="0"/>
 *         &lt;element name="deliveryAddress" minOccurs="0">
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
 *         &lt;element name="deliveryAddressPostalCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}notRequiredPostalCodeType" minOccurs="0"/>
 *         &lt;element name="deliveryAddressPoBoxCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}poBoxType" minOccurs="0"/>
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
 *         &lt;element name="prijataPusobnostOhlasovny" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="predanaPusobnostOhlasovny" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="prijataPusobnostVolby" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="predanaPusobnostVolby" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="prijataPusobnostIsui" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="predanaPusobnostIsui" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="prijataPusobnostAdmin" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="prijataPusobnostPuma" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="predanaPusobnostPuma" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="poplatek1kn" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek2kn" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek1knmapy" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek1or" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek2or" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek1zr" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek2zr" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek1rt" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek2rt" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek1crr" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek2crr" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek1skd" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek2skd" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek1maisoh" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek2maisoh" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek1isir" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek2isir" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek1zakreg" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="poplatek2zakreg" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekType" minOccurs="0"/>
 *         &lt;element name="misto" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType" minOccurs="0"/>
 *         &lt;element name="spisovaSluzba" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanType" minOccurs="0"/>
 *         &lt;element name="spisovaSluzbaUrl" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType" minOccurs="0"/>
 *         &lt;element name="cestaFormulare" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringType" minOccurs="0"/>
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
@XmlRootElement(name = "UpdateSubjectRequest", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class UpdateSubjectRequest {

    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String name;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String typInstituce;
    @XmlElementRef(name = "contactAddress", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.ContactAddress> contactAddress;
    @XmlElementRef(name = "contactAddressPostalCode", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactAddressPostalCode;
    @XmlElementRef(name = "contactAddressPoBoxCode", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactAddressPoBoxCode;
    @XmlElementRef(name = "deliveryAddress", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.DeliveryAddress> deliveryAddress;
    @XmlElementRef(name = "deliveryAddressPostalCode", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryAddressPostalCode;
    @XmlElementRef(name = "deliveryAddressPoBoxCode", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryAddressPoBoxCode;
    @XmlElementRef(name = "email", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.Email> email;
    @XmlElementRef(name = "telephoneNumber", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.TelephoneNumber> telephoneNumber;
    @XmlElementRef(name = "prijataPusobnostOhlasovny", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.PrijataPusobnostOhlasovny> prijataPusobnostOhlasovny;
    @XmlElementRef(name = "predanaPusobnostOhlasovny", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.PredanaPusobnostOhlasovny> predanaPusobnostOhlasovny;
    @XmlElementRef(name = "prijataPusobnostVolby", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.PrijataPusobnostVolby> prijataPusobnostVolby;
    @XmlElementRef(name = "predanaPusobnostVolby", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.PredanaPusobnostVolby> predanaPusobnostVolby;
    @XmlElementRef(name = "prijataPusobnostIsui", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.PrijataPusobnostIsui> prijataPusobnostIsui;
    @XmlElementRef(name = "predanaPusobnostIsui", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.PredanaPusobnostIsui> predanaPusobnostIsui;
    @XmlElementRef(name = "prijataPusobnostAdmin", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.PrijataPusobnostAdmin> prijataPusobnostAdmin;
    @XmlElementRef(name = "prijataPusobnostPuma", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.PrijataPusobnostPuma> prijataPusobnostPuma;
    @XmlElementRef(name = "predanaPusobnostPuma", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateSubjectRequest.PredanaPusobnostPuma> predanaPusobnostPuma;
    @XmlElementRef(name = "poplatek1kn", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek1Kn;
    @XmlElementRef(name = "poplatek2kn", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek2Kn;
    @XmlElementRef(name = "poplatek1knmapy", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek1Knmapy;
    @XmlElementRef(name = "poplatek1or", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek1Or;
    @XmlElementRef(name = "poplatek2or", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek2Or;
    @XmlElementRef(name = "poplatek1zr", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek1Zr;
    @XmlElementRef(name = "poplatek2zr", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek2Zr;
    @XmlElementRef(name = "poplatek1rt", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek1Rt;
    @XmlElementRef(name = "poplatek2rt", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek2Rt;
    @XmlElementRef(name = "poplatek1crr", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek1Crr;
    @XmlElementRef(name = "poplatek2crr", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek2Crr;
    @XmlElementRef(name = "poplatek1skd", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek1Skd;
    @XmlElementRef(name = "poplatek2skd", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek2Skd;
    @XmlElementRef(name = "poplatek1maisoh", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek1Maisoh;
    @XmlElementRef(name = "poplatek2maisoh", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek2Maisoh;
    @XmlElementRef(name = "poplatek1isir", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek1Isir;
    @XmlElementRef(name = "poplatek2isir", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek2Isir;
    @XmlElementRef(name = "poplatek1zakreg", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek1Zakreg;
    @XmlElementRef(name = "poplatek2zakreg", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poplatek2Zakreg;
    @XmlElementRef(name = "misto", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> misto;
    @XmlElementRef(name = "spisovaSluzba", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spisovaSluzba;
    @XmlElementRef(name = "spisovaSluzbaUrl", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spisovaSluzbaUrl;
    @XmlElementRef(name = "cestaFormulare", namespace = "http://userportal.novell.com/ws/WS-LA-1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cestaFormulare;
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
     * Gets the value of the typInstituce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypInstituce() {
        return typInstituce;
    }

    /**
     * Sets the value of the typInstituce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypInstituce(String value) {
        this.typInstituce = value;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.ContactAddress }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.ContactAddress> getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.ContactAddress }{@code >}
     *     
     */
    public void setContactAddress(JAXBElement<UpdateSubjectRequest.ContactAddress> value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the contactAddressPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactAddressPostalCode() {
        return contactAddressPostalCode;
    }

    /**
     * Sets the value of the contactAddressPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactAddressPostalCode(JAXBElement<String> value) {
        this.contactAddressPostalCode = value;
    }

    /**
     * Gets the value of the contactAddressPoBoxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactAddressPoBoxCode() {
        return contactAddressPoBoxCode;
    }

    /**
     * Sets the value of the contactAddressPoBoxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactAddressPoBoxCode(JAXBElement<String> value) {
        this.contactAddressPoBoxCode = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.DeliveryAddress }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.DeliveryAddress> getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.DeliveryAddress }{@code >}
     *     
     */
    public void setDeliveryAddress(JAXBElement<UpdateSubjectRequest.DeliveryAddress> value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryAddressPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryAddressPostalCode() {
        return deliveryAddressPostalCode;
    }

    /**
     * Sets the value of the deliveryAddressPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryAddressPostalCode(JAXBElement<String> value) {
        this.deliveryAddressPostalCode = value;
    }

    /**
     * Gets the value of the deliveryAddressPoBoxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryAddressPoBoxCode() {
        return deliveryAddressPoBoxCode;
    }

    /**
     * Sets the value of the deliveryAddressPoBoxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryAddressPoBoxCode(JAXBElement<String> value) {
        this.deliveryAddressPoBoxCode = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.Email }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.Email> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.Email }{@code >}
     *     
     */
    public void setEmail(JAXBElement<UpdateSubjectRequest.Email> value) {
        this.email = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.TelephoneNumber }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.TelephoneNumber> getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.TelephoneNumber }{@code >}
     *     
     */
    public void setTelephoneNumber(JAXBElement<UpdateSubjectRequest.TelephoneNumber> value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the prijataPusobnostOhlasovny property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PrijataPusobnostOhlasovny }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.PrijataPusobnostOhlasovny> getPrijataPusobnostOhlasovny() {
        return prijataPusobnostOhlasovny;
    }

    /**
     * Sets the value of the prijataPusobnostOhlasovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PrijataPusobnostOhlasovny }{@code >}
     *     
     */
    public void setPrijataPusobnostOhlasovny(JAXBElement<UpdateSubjectRequest.PrijataPusobnostOhlasovny> value) {
        this.prijataPusobnostOhlasovny = value;
    }

    /**
     * Gets the value of the predanaPusobnostOhlasovny property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PredanaPusobnostOhlasovny }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.PredanaPusobnostOhlasovny> getPredanaPusobnostOhlasovny() {
        return predanaPusobnostOhlasovny;
    }

    /**
     * Sets the value of the predanaPusobnostOhlasovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PredanaPusobnostOhlasovny }{@code >}
     *     
     */
    public void setPredanaPusobnostOhlasovny(JAXBElement<UpdateSubjectRequest.PredanaPusobnostOhlasovny> value) {
        this.predanaPusobnostOhlasovny = value;
    }

    /**
     * Gets the value of the prijataPusobnostVolby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PrijataPusobnostVolby }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.PrijataPusobnostVolby> getPrijataPusobnostVolby() {
        return prijataPusobnostVolby;
    }

    /**
     * Sets the value of the prijataPusobnostVolby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PrijataPusobnostVolby }{@code >}
     *     
     */
    public void setPrijataPusobnostVolby(JAXBElement<UpdateSubjectRequest.PrijataPusobnostVolby> value) {
        this.prijataPusobnostVolby = value;
    }

    /**
     * Gets the value of the predanaPusobnostVolby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PredanaPusobnostVolby }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.PredanaPusobnostVolby> getPredanaPusobnostVolby() {
        return predanaPusobnostVolby;
    }

    /**
     * Sets the value of the predanaPusobnostVolby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PredanaPusobnostVolby }{@code >}
     *     
     */
    public void setPredanaPusobnostVolby(JAXBElement<UpdateSubjectRequest.PredanaPusobnostVolby> value) {
        this.predanaPusobnostVolby = value;
    }

    /**
     * Gets the value of the prijataPusobnostIsui property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PrijataPusobnostIsui }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.PrijataPusobnostIsui> getPrijataPusobnostIsui() {
        return prijataPusobnostIsui;
    }

    /**
     * Sets the value of the prijataPusobnostIsui property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PrijataPusobnostIsui }{@code >}
     *     
     */
    public void setPrijataPusobnostIsui(JAXBElement<UpdateSubjectRequest.PrijataPusobnostIsui> value) {
        this.prijataPusobnostIsui = value;
    }

    /**
     * Gets the value of the predanaPusobnostIsui property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PredanaPusobnostIsui }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.PredanaPusobnostIsui> getPredanaPusobnostIsui() {
        return predanaPusobnostIsui;
    }

    /**
     * Sets the value of the predanaPusobnostIsui property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PredanaPusobnostIsui }{@code >}
     *     
     */
    public void setPredanaPusobnostIsui(JAXBElement<UpdateSubjectRequest.PredanaPusobnostIsui> value) {
        this.predanaPusobnostIsui = value;
    }

    /**
     * Gets the value of the prijataPusobnostAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PrijataPusobnostAdmin }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.PrijataPusobnostAdmin> getPrijataPusobnostAdmin() {
        return prijataPusobnostAdmin;
    }

    /**
     * Sets the value of the prijataPusobnostAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PrijataPusobnostAdmin }{@code >}
     *     
     */
    public void setPrijataPusobnostAdmin(JAXBElement<UpdateSubjectRequest.PrijataPusobnostAdmin> value) {
        this.prijataPusobnostAdmin = value;
    }

    /**
     * Gets the value of the prijataPusobnostPuma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PrijataPusobnostPuma }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.PrijataPusobnostPuma> getPrijataPusobnostPuma() {
        return prijataPusobnostPuma;
    }

    /**
     * Sets the value of the prijataPusobnostPuma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PrijataPusobnostPuma }{@code >}
     *     
     */
    public void setPrijataPusobnostPuma(JAXBElement<UpdateSubjectRequest.PrijataPusobnostPuma> value) {
        this.prijataPusobnostPuma = value;
    }

    /**
     * Gets the value of the predanaPusobnostPuma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PredanaPusobnostPuma }{@code >}
     *     
     */
    public JAXBElement<UpdateSubjectRequest.PredanaPusobnostPuma> getPredanaPusobnostPuma() {
        return predanaPusobnostPuma;
    }

    /**
     * Sets the value of the predanaPusobnostPuma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSubjectRequest.PredanaPusobnostPuma }{@code >}
     *     
     */
    public void setPredanaPusobnostPuma(JAXBElement<UpdateSubjectRequest.PredanaPusobnostPuma> value) {
        this.predanaPusobnostPuma = value;
    }

    /**
     * Gets the value of the poplatek1Kn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek1Kn() {
        return poplatek1Kn;
    }

    /**
     * Sets the value of the poplatek1Kn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek1Kn(JAXBElement<String> value) {
        this.poplatek1Kn = value;
    }

    /**
     * Gets the value of the poplatek2Kn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek2Kn() {
        return poplatek2Kn;
    }

    /**
     * Sets the value of the poplatek2Kn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek2Kn(JAXBElement<String> value) {
        this.poplatek2Kn = value;
    }

    /**
     * Gets the value of the poplatek1Knmapy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek1Knmapy() {
        return poplatek1Knmapy;
    }

    /**
     * Sets the value of the poplatek1Knmapy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek1Knmapy(JAXBElement<String> value) {
        this.poplatek1Knmapy = value;
    }

    /**
     * Gets the value of the poplatek1Or property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek1Or() {
        return poplatek1Or;
    }

    /**
     * Sets the value of the poplatek1Or property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek1Or(JAXBElement<String> value) {
        this.poplatek1Or = value;
    }

    /**
     * Gets the value of the poplatek2Or property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek2Or() {
        return poplatek2Or;
    }

    /**
     * Sets the value of the poplatek2Or property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek2Or(JAXBElement<String> value) {
        this.poplatek2Or = value;
    }

    /**
     * Gets the value of the poplatek1Zr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek1Zr() {
        return poplatek1Zr;
    }

    /**
     * Sets the value of the poplatek1Zr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek1Zr(JAXBElement<String> value) {
        this.poplatek1Zr = value;
    }

    /**
     * Gets the value of the poplatek2Zr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek2Zr() {
        return poplatek2Zr;
    }

    /**
     * Sets the value of the poplatek2Zr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek2Zr(JAXBElement<String> value) {
        this.poplatek2Zr = value;
    }

    /**
     * Gets the value of the poplatek1Rt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek1Rt() {
        return poplatek1Rt;
    }

    /**
     * Sets the value of the poplatek1Rt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek1Rt(JAXBElement<String> value) {
        this.poplatek1Rt = value;
    }

    /**
     * Gets the value of the poplatek2Rt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek2Rt() {
        return poplatek2Rt;
    }

    /**
     * Sets the value of the poplatek2Rt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek2Rt(JAXBElement<String> value) {
        this.poplatek2Rt = value;
    }

    /**
     * Gets the value of the poplatek1Crr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek1Crr() {
        return poplatek1Crr;
    }

    /**
     * Sets the value of the poplatek1Crr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek1Crr(JAXBElement<String> value) {
        this.poplatek1Crr = value;
    }

    /**
     * Gets the value of the poplatek2Crr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek2Crr() {
        return poplatek2Crr;
    }

    /**
     * Sets the value of the poplatek2Crr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek2Crr(JAXBElement<String> value) {
        this.poplatek2Crr = value;
    }

    /**
     * Gets the value of the poplatek1Skd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek1Skd() {
        return poplatek1Skd;
    }

    /**
     * Sets the value of the poplatek1Skd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek1Skd(JAXBElement<String> value) {
        this.poplatek1Skd = value;
    }

    /**
     * Gets the value of the poplatek2Skd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek2Skd() {
        return poplatek2Skd;
    }

    /**
     * Sets the value of the poplatek2Skd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek2Skd(JAXBElement<String> value) {
        this.poplatek2Skd = value;
    }

    /**
     * Gets the value of the poplatek1Maisoh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek1Maisoh() {
        return poplatek1Maisoh;
    }

    /**
     * Sets the value of the poplatek1Maisoh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek1Maisoh(JAXBElement<String> value) {
        this.poplatek1Maisoh = value;
    }

    /**
     * Gets the value of the poplatek2Maisoh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek2Maisoh() {
        return poplatek2Maisoh;
    }

    /**
     * Sets the value of the poplatek2Maisoh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek2Maisoh(JAXBElement<String> value) {
        this.poplatek2Maisoh = value;
    }

    /**
     * Gets the value of the poplatek1Isir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek1Isir() {
        return poplatek1Isir;
    }

    /**
     * Sets the value of the poplatek1Isir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek1Isir(JAXBElement<String> value) {
        this.poplatek1Isir = value;
    }

    /**
     * Gets the value of the poplatek2Isir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek2Isir() {
        return poplatek2Isir;
    }

    /**
     * Sets the value of the poplatek2Isir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek2Isir(JAXBElement<String> value) {
        this.poplatek2Isir = value;
    }

    /**
     * Gets the value of the poplatek1Zakreg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek1Zakreg() {
        return poplatek1Zakreg;
    }

    /**
     * Sets the value of the poplatek1Zakreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek1Zakreg(JAXBElement<String> value) {
        this.poplatek1Zakreg = value;
    }

    /**
     * Gets the value of the poplatek2Zakreg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoplatek2Zakreg() {
        return poplatek2Zakreg;
    }

    /**
     * Sets the value of the poplatek2Zakreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoplatek2Zakreg(JAXBElement<String> value) {
        this.poplatek2Zakreg = value;
    }

    /**
     * Gets the value of the misto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMisto() {
        return misto;
    }

    /**
     * Sets the value of the misto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMisto(JAXBElement<String> value) {
        this.misto = value;
    }

    /**
     * Gets the value of the spisovaSluzba property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpisovaSluzba() {
        return spisovaSluzba;
    }

    /**
     * Sets the value of the spisovaSluzba property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpisovaSluzba(JAXBElement<String> value) {
        this.spisovaSluzba = value;
    }

    /**
     * Gets the value of the spisovaSluzbaUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpisovaSluzbaUrl() {
        return spisovaSluzbaUrl;
    }

    /**
     * Sets the value of the spisovaSluzbaUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpisovaSluzbaUrl(JAXBElement<String> value) {
        this.spisovaSluzbaUrl = value;
    }

    /**
     * Gets the value of the cestaFormulare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCestaFormulare() {
        return cestaFormulare;
    }

    /**
     * Sets the value of the cestaFormulare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCestaFormulare(JAXBElement<String> value) {
        this.cestaFormulare = value;
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
    public static class ContactAddress {

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
    public static class DeliveryAddress {

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
        protected List<UpdateSubjectRequest.Email.Item> item;

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
         * {@link UpdateSubjectRequest.Email.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.Email.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.Email.Item>();
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
     *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class PredanaPusobnostIsui {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateSubjectRequest.PredanaPusobnostIsui.Item> item;

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
         * {@link UpdateSubjectRequest.PredanaPusobnostIsui.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.PredanaPusobnostIsui.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.PredanaPusobnostIsui.Item>();
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
         *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String subject;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String contract;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String reason;

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract(String value) {
                this.contract = value;
            }

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
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
     *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class PredanaPusobnostOhlasovny {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateSubjectRequest.PredanaPusobnostOhlasovny.Item> item;

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
         * {@link UpdateSubjectRequest.PredanaPusobnostOhlasovny.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.PredanaPusobnostOhlasovny.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.PredanaPusobnostOhlasovny.Item>();
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
         *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String subject;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String contract;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String reason;

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract(String value) {
                this.contract = value;
            }

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
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
     *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class PredanaPusobnostPuma {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateSubjectRequest.PredanaPusobnostPuma.Item> item;

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
         * {@link UpdateSubjectRequest.PredanaPusobnostPuma.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.PredanaPusobnostPuma.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.PredanaPusobnostPuma.Item>();
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
         *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String subject;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String contract;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String reason;

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract(String value) {
                this.contract = value;
            }

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
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
     *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class PredanaPusobnostVolby {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateSubjectRequest.PredanaPusobnostVolby.Item> item;

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
         * {@link UpdateSubjectRequest.PredanaPusobnostVolby.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.PredanaPusobnostVolby.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.PredanaPusobnostVolby.Item>();
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
         *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String subject;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String contract;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String reason;

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract(String value) {
                this.contract = value;
            }

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
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
     *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class PrijataPusobnostAdmin {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateSubjectRequest.PrijataPusobnostAdmin.Item> item;

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
         * {@link UpdateSubjectRequest.PrijataPusobnostAdmin.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.PrijataPusobnostAdmin.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.PrijataPusobnostAdmin.Item>();
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
         *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String subject;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String contract;

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract(String value) {
                this.contract = value;
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
     *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class PrijataPusobnostIsui {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateSubjectRequest.PrijataPusobnostIsui.Item> item;

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
         * {@link UpdateSubjectRequest.PrijataPusobnostIsui.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.PrijataPusobnostIsui.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.PrijataPusobnostIsui.Item>();
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
         *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String subject;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String contract;

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract(String value) {
                this.contract = value;
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
     *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class PrijataPusobnostOhlasovny {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateSubjectRequest.PrijataPusobnostOhlasovny.Item> item;

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
         * {@link UpdateSubjectRequest.PrijataPusobnostOhlasovny.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.PrijataPusobnostOhlasovny.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.PrijataPusobnostOhlasovny.Item>();
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
         *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String subject;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String contract;

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract(String value) {
                this.contract = value;
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
     *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class PrijataPusobnostPuma {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateSubjectRequest.PrijataPusobnostPuma.Item> item;

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
         * {@link UpdateSubjectRequest.PrijataPusobnostPuma.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.PrijataPusobnostPuma.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.PrijataPusobnostPuma.Item>();
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
         *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String subject;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String contract;

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract(String value) {
                this.contract = value;
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
     *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class PrijataPusobnostVolby {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<UpdateSubjectRequest.PrijataPusobnostVolby.Item> item;

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
         * {@link UpdateSubjectRequest.PrijataPusobnostVolby.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.PrijataPusobnostVolby.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.PrijataPusobnostVolby.Item>();
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
         *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String subject;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String contract;

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract(String value) {
                this.contract = value;
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
        protected List<UpdateSubjectRequest.TelephoneNumber.Item> item;

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
         * {@link UpdateSubjectRequest.TelephoneNumber.Item }
         * 
         * 
         */
        public List<UpdateSubjectRequest.TelephoneNumber.Item> getItem() {
            if (item == null) {
                item = new ArrayList<UpdateSubjectRequest.TelephoneNumber.Item>();
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
