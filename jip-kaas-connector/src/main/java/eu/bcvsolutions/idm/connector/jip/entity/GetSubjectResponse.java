
package eu.bcvsolutions.idm.connector.jip.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="isdsBox" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *         &lt;element name="isdsUpperId" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *         &lt;element name="isIsdsBoxPublic" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTrueTypeResponse" minOccurs="0"/>
 *         &lt;element name="isIsdsBoxDisabled" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *         &lt;element name="name" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *         &lt;element name="enablePrimaryPeople" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *         &lt;element name="ico" type="{http://userportal.novell.com/ws/WS-LA-1.0}icoTypeResponse" minOccurs="0"/>
 *         &lt;element name="dic" type="{http://userportal.novell.com/ws/WS-LA-1.0}dicTypeResponse" minOccurs="0"/>
 *         &lt;element name="datumVzniku" type="{http://userportal.novell.com/ws/WS-LA-1.0}dateTypeResponse" minOccurs="0"/>
 *         &lt;element name="datumZaniku" type="{http://userportal.novell.com/ws/WS-LA-1.0}dateTypeResponse" minOccurs="0"/>
 *         &lt;element name="preruseniPozastaveniOd" type="{http://userportal.novell.com/ws/WS-LA-1.0}dateTypeResponse" minOccurs="0"/>
 *         &lt;element name="preruseniPozastaveniDo" type="{http://userportal.novell.com/ws/WS-LA-1.0}dateTypeResponse" minOccurs="0"/>
 *         &lt;element name="preruseniPozastaveni" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *         &lt;element name="rovmCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}rovmCodeTypeResponse" minOccurs="0"/>
 *         &lt;element name="rovmPusobnostOd" type="{http://userportal.novell.com/ws/WS-LA-1.0}dateTypeResponse" minOccurs="0"/>
 *         &lt;element name="rovmPusobnostDo" type="{http://userportal.novell.com/ws/WS-LA-1.0}dateTypeResponse" minOccurs="0"/>
 *         &lt;element name="rovmPozastaveniOd" type="{http://userportal.novell.com/ws/WS-LA-1.0}dateTypeResponse" minOccurs="0"/>
 *         &lt;element name="rovmPozastaveniDo" type="{http://userportal.novell.com/ws/WS-LA-1.0}dateTypeResponse" minOccurs="0"/>
 *         &lt;element name="rovmPreruseniOd" type="{http://userportal.novell.com/ws/WS-LA-1.0}dateTypeResponse" minOccurs="0"/>
 *         &lt;element name="rovmPreruseniDo" type="{http://userportal.novell.com/ws/WS-LA-1.0}dateTypeResponse" minOccurs="0"/>
 *         &lt;element name="rovmKategorie" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rovmKategorieItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="deletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="categorizationFrom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="categorizationTo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pravniForma" type="{http://userportal.novell.com/ws/WS-LA-1.0}pravniFormaTypeResponse" minOccurs="0"/>
 *         &lt;element name="typInstituce" type="{http://userportal.novell.com/ws/WS-LA-1.0}czptypinstituceTypeResponse" minOccurs="0"/>
 *         &lt;element name="gpsPosition" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
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
 *         &lt;element name="contactAddressPostalCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}notRequiredPostalCodeTypeResponse" minOccurs="0"/>
 *         &lt;element name="contactAddressPoBoxCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}poBoxTypeResponse" minOccurs="0"/>
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
 *         &lt;element name="deliveryAddressPostalCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}notRequiredPostalCodeTypeResponse" minOccurs="0"/>
 *         &lt;element name="deliveryAddressPoBoxCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}poBoxTypeResponse" minOccurs="0"/>
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
 *         &lt;element name="role" type="{http://userportal.novell.com/ws/WS-LA-1.0}subjectRoleTypeResponse" minOccurs="0"/>
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
 *         &lt;element name="predanaPusobnostAdmin" minOccurs="0">
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
 *         &lt;element name="poplatek1kn" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek2kn" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek1knmapy" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek1or" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek2or" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek1zr" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek2zr" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek1rt" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek2rt" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek1crr" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek2crr" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek1skd" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek2skd" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek1maisoh" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek2maisoh" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek1isir" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek2isir" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek1zakreg" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="poplatek2zakreg" type="{http://userportal.novell.com/ws/WS-LA-1.0}poplatekTypeResponse" minOccurs="0"/>
 *         &lt;element name="misto" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *         &lt;element name="typOrganizace" type="{http://userportal.novell.com/ws/WS-LA-1.0}epIdTypTypeResponse" minOccurs="0"/>
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
 *         &lt;element name="duvodZalozeni" type="{http://userportal.novell.com/ws/WS-LA-1.0}descriptionTypeResponse" minOccurs="0"/>
 *         &lt;element name="subjectCode" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *         &lt;element name="spisovaSluzba" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *         &lt;element name="spisovaSluzbaUrl" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *         &lt;element name="cestaFormulare" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
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
 *         &lt;element name="isdsBoxState" type="{http://userportal.novell.com/ws/WS-LA-1.0}isdsBoxStateTypeResponse" minOccurs="0"/>
 *         &lt;element name="isOVM" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringBooleanTypeResponse" minOccurs="0"/>
 *         &lt;element name="zruseno" type="{http://userportal.novell.com/ws/WS-LA-1.0}disablingTypeResponse" minOccurs="0"/>
 *         &lt;element name="isdsBoxChangeTime" type="{http://userportal.novell.com/ws/WS-LA-1.0}zuluTimeTypeResponse" minOccurs="0"/>
 *         &lt;element name="casZruseni" type="{http://userportal.novell.com/ws/WS-LA-1.0}zuluTimeTypeResponse" minOccurs="0"/>
 *         &lt;element name="isdsFormProcessingTime" type="{http://userportal.novell.com/ws/WS-LA-1.0}zuluTimeTypeResponse" minOccurs="0"/>
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
@XmlRootElement(name = "GetSubjectResponse", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class GetSubjectResponse {

    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String isdsBox;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String isdsUpperId;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected StringBooleanTrueTypeResponse isIsdsBoxPublic;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected StringBooleanTypeResponse isIsdsBoxDisabled;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String name;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected StringBooleanTypeResponse enablePrimaryPeople;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String ico;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String dic;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String datumVzniku;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String datumZaniku;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String preruseniPozastaveniOd;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String preruseniPozastaveniDo;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected StringBooleanTypeResponse preruseniPozastaveni;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String rovmCode;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String rovmPusobnostOd;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String rovmPusobnostDo;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String rovmPozastaveniOd;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String rovmPozastaveniDo;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String rovmPreruseniOd;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String rovmPreruseniDo;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.RovmKategorie rovmKategorie;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected PravniFormaTypeResponse pravniForma;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected CzptypinstituceTypeResponse typInstituce;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String gpsPosition;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.ContactAddress contactAddress;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String contactAddressPostalCode;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String contactAddressPoBoxCode;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.DeliveryAddress deliveryAddress;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String deliveryAddressPostalCode;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String deliveryAddressPoBoxCode;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.Email email;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.TelephoneNumber telephoneNumber;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected SubjectRoleTypeResponse role;
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
    protected GetSubjectResponse.AisRole aisRole;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.PrijataPusobnostOhlasovny prijataPusobnostOhlasovny;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.PredanaPusobnostOhlasovny predanaPusobnostOhlasovny;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.PrijataPusobnostVolby prijataPusobnostVolby;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.PredanaPusobnostVolby predanaPusobnostVolby;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.PrijataPusobnostIsui prijataPusobnostIsui;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.PredanaPusobnostIsui predanaPusobnostIsui;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.PrijataPusobnostAdmin prijataPusobnostAdmin;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.PredanaPusobnostAdmin predanaPusobnostAdmin;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.PrijataPusobnostPuma prijataPusobnostPuma;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.PredanaPusobnostPuma predanaPusobnostPuma;
    @XmlElement(name = "poplatek1kn", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek1Kn;
    @XmlElement(name = "poplatek2kn", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek2Kn;
    @XmlElement(name = "poplatek1knmapy", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek1Knmapy;
    @XmlElement(name = "poplatek1or", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek1Or;
    @XmlElement(name = "poplatek2or", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek2Or;
    @XmlElement(name = "poplatek1zr", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek1Zr;
    @XmlElement(name = "poplatek2zr", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek2Zr;
    @XmlElement(name = "poplatek1rt", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek1Rt;
    @XmlElement(name = "poplatek2rt", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek2Rt;
    @XmlElement(name = "poplatek1crr", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek1Crr;
    @XmlElement(name = "poplatek2crr", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek2Crr;
    @XmlElement(name = "poplatek1skd", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek1Skd;
    @XmlElement(name = "poplatek2skd", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek2Skd;
    @XmlElement(name = "poplatek1maisoh", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek1Maisoh;
    @XmlElement(name = "poplatek2maisoh", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek2Maisoh;
    @XmlElement(name = "poplatek1isir", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek1Isir;
    @XmlElement(name = "poplatek2isir", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek2Isir;
    @XmlElement(name = "poplatek1zakreg", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek1Zakreg;
    @XmlElement(name = "poplatek2zakreg", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String poplatek2Zakreg;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String misto;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected EpIdTypTypeResponse typOrganizace;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.BankAccount bankAccount;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String duvodZalozeni;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String subjectCode;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected StringBooleanTypeResponse spisovaSluzba;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String spisovaSluzbaUrl;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String cestaFormulare;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.Url url;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected IsdsBoxStateTypeResponse isdsBoxState;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected StringBooleanTypeResponse isOVM;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected DisablingTypeResponse zruseno;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String isdsBoxChangeTime;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String casZruseni;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String isdsFormProcessingTime;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.Agendy agendy;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected GetSubjectResponse.CinnostniRole cinnostniRole;
    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected String casPosledniZmeny;

    /**
     * Gets the value of the isdsBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdsBox() {
        return isdsBox;
    }

    /**
     * Sets the value of the isdsBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdsBox(String value) {
        this.isdsBox = value;
    }

    /**
     * Gets the value of the isdsUpperId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdsUpperId() {
        return isdsUpperId;
    }

    /**
     * Sets the value of the isdsUpperId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdsUpperId(String value) {
        this.isdsUpperId = value;
    }

    /**
     * Gets the value of the isIsdsBoxPublic property.
     * 
     * @return
     *     possible object is
     *     {@link StringBooleanTrueTypeResponse }
     *     
     */
    public StringBooleanTrueTypeResponse getIsIsdsBoxPublic() {
        return isIsdsBoxPublic;
    }

    /**
     * Sets the value of the isIsdsBoxPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringBooleanTrueTypeResponse }
     *     
     */
    public void setIsIsdsBoxPublic(StringBooleanTrueTypeResponse value) {
        this.isIsdsBoxPublic = value;
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
     * Gets the value of the enablePrimaryPeople property.
     * 
     * @return
     *     possible object is
     *     {@link StringBooleanTypeResponse }
     *     
     */
    public StringBooleanTypeResponse getEnablePrimaryPeople() {
        return enablePrimaryPeople;
    }

    /**
     * Sets the value of the enablePrimaryPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringBooleanTypeResponse }
     *     
     */
    public void setEnablePrimaryPeople(StringBooleanTypeResponse value) {
        this.enablePrimaryPeople = value;
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
     * Gets the value of the datumVzniku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumVzniku() {
        return datumVzniku;
    }

    /**
     * Sets the value of the datumVzniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumVzniku(String value) {
        this.datumVzniku = value;
    }

    /**
     * Gets the value of the datumZaniku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumZaniku() {
        return datumZaniku;
    }

    /**
     * Sets the value of the datumZaniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumZaniku(String value) {
        this.datumZaniku = value;
    }

    /**
     * Gets the value of the preruseniPozastaveniOd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreruseniPozastaveniOd() {
        return preruseniPozastaveniOd;
    }

    /**
     * Sets the value of the preruseniPozastaveniOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreruseniPozastaveniOd(String value) {
        this.preruseniPozastaveniOd = value;
    }

    /**
     * Gets the value of the preruseniPozastaveniDo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreruseniPozastaveniDo() {
        return preruseniPozastaveniDo;
    }

    /**
     * Sets the value of the preruseniPozastaveniDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreruseniPozastaveniDo(String value) {
        this.preruseniPozastaveniDo = value;
    }

    /**
     * Gets the value of the preruseniPozastaveni property.
     * 
     * @return
     *     possible object is
     *     {@link StringBooleanTypeResponse }
     *     
     */
    public StringBooleanTypeResponse getPreruseniPozastaveni() {
        return preruseniPozastaveni;
    }

    /**
     * Sets the value of the preruseniPozastaveni property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringBooleanTypeResponse }
     *     
     */
    public void setPreruseniPozastaveni(StringBooleanTypeResponse value) {
        this.preruseniPozastaveni = value;
    }

    /**
     * Gets the value of the rovmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRovmCode() {
        return rovmCode;
    }

    /**
     * Sets the value of the rovmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRovmCode(String value) {
        this.rovmCode = value;
    }

    /**
     * Gets the value of the rovmPusobnostOd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRovmPusobnostOd() {
        return rovmPusobnostOd;
    }

    /**
     * Sets the value of the rovmPusobnostOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRovmPusobnostOd(String value) {
        this.rovmPusobnostOd = value;
    }

    /**
     * Gets the value of the rovmPusobnostDo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRovmPusobnostDo() {
        return rovmPusobnostDo;
    }

    /**
     * Sets the value of the rovmPusobnostDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRovmPusobnostDo(String value) {
        this.rovmPusobnostDo = value;
    }

    /**
     * Gets the value of the rovmPozastaveniOd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRovmPozastaveniOd() {
        return rovmPozastaveniOd;
    }

    /**
     * Sets the value of the rovmPozastaveniOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRovmPozastaveniOd(String value) {
        this.rovmPozastaveniOd = value;
    }

    /**
     * Gets the value of the rovmPozastaveniDo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRovmPozastaveniDo() {
        return rovmPozastaveniDo;
    }

    /**
     * Sets the value of the rovmPozastaveniDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRovmPozastaveniDo(String value) {
        this.rovmPozastaveniDo = value;
    }

    /**
     * Gets the value of the rovmPreruseniOd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRovmPreruseniOd() {
        return rovmPreruseniOd;
    }

    /**
     * Sets the value of the rovmPreruseniOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRovmPreruseniOd(String value) {
        this.rovmPreruseniOd = value;
    }

    /**
     * Gets the value of the rovmPreruseniDo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRovmPreruseniDo() {
        return rovmPreruseniDo;
    }

    /**
     * Sets the value of the rovmPreruseniDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRovmPreruseniDo(String value) {
        this.rovmPreruseniDo = value;
    }

    /**
     * Gets the value of the rovmKategorie property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.RovmKategorie }
     *     
     */
    public GetSubjectResponse.RovmKategorie getRovmKategorie() {
        return rovmKategorie;
    }

    /**
     * Sets the value of the rovmKategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.RovmKategorie }
     *     
     */
    public void setRovmKategorie(GetSubjectResponse.RovmKategorie value) {
        this.rovmKategorie = value;
    }

    /**
     * Gets the value of the pravniForma property.
     * 
     * @return
     *     possible object is
     *     {@link PravniFormaTypeResponse }
     *     
     */
    public PravniFormaTypeResponse getPravniForma() {
        return pravniForma;
    }

    /**
     * Sets the value of the pravniForma property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniFormaTypeResponse }
     *     
     */
    public void setPravniForma(PravniFormaTypeResponse value) {
        this.pravniForma = value;
    }

    /**
     * Gets the value of the typInstituce property.
     * 
     * @return
     *     possible object is
     *     {@link CzptypinstituceTypeResponse }
     *     
     */
    public CzptypinstituceTypeResponse getTypInstituce() {
        return typInstituce;
    }

    /**
     * Sets the value of the typInstituce property.
     * 
     * @param value
     *     allowed object is
     *     {@link CzptypinstituceTypeResponse }
     *     
     */
    public void setTypInstituce(CzptypinstituceTypeResponse value) {
        this.typInstituce = value;
    }

    /**
     * Gets the value of the gpsPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsPosition() {
        return gpsPosition;
    }

    /**
     * Sets the value of the gpsPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsPosition(String value) {
        this.gpsPosition = value;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.ContactAddress }
     *     
     */
    public GetSubjectResponse.ContactAddress getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.ContactAddress }
     *     
     */
    public void setContactAddress(GetSubjectResponse.ContactAddress value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the contactAddressPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddressPostalCode() {
        return contactAddressPostalCode;
    }

    /**
     * Sets the value of the contactAddressPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddressPostalCode(String value) {
        this.contactAddressPostalCode = value;
    }

    /**
     * Gets the value of the contactAddressPoBoxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddressPoBoxCode() {
        return contactAddressPoBoxCode;
    }

    /**
     * Sets the value of the contactAddressPoBoxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddressPoBoxCode(String value) {
        this.contactAddressPoBoxCode = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.DeliveryAddress }
     *     
     */
    public GetSubjectResponse.DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.DeliveryAddress }
     *     
     */
    public void setDeliveryAddress(GetSubjectResponse.DeliveryAddress value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryAddressPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAddressPostalCode() {
        return deliveryAddressPostalCode;
    }

    /**
     * Sets the value of the deliveryAddressPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAddressPostalCode(String value) {
        this.deliveryAddressPostalCode = value;
    }

    /**
     * Gets the value of the deliveryAddressPoBoxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAddressPoBoxCode() {
        return deliveryAddressPoBoxCode;
    }

    /**
     * Sets the value of the deliveryAddressPoBoxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAddressPoBoxCode(String value) {
        this.deliveryAddressPoBoxCode = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.Email }
     *     
     */
    public GetSubjectResponse.Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.Email }
     *     
     */
    public void setEmail(GetSubjectResponse.Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.TelephoneNumber }
     *     
     */
    public GetSubjectResponse.TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.TelephoneNumber }
     *     
     */
    public void setTelephoneNumber(GetSubjectResponse.TelephoneNumber value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectRoleTypeResponse }
     *     
     */
    public SubjectRoleTypeResponse getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectRoleTypeResponse }
     *     
     */
    public void setRole(SubjectRoleTypeResponse value) {
        this.role = value;
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
     *     {@link GetSubjectResponse.AisRole }
     *     
     */
    public GetSubjectResponse.AisRole getAisRole() {
        return aisRole;
    }

    /**
     * Sets the value of the aisRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.AisRole }
     *     
     */
    public void setAisRole(GetSubjectResponse.AisRole value) {
        this.aisRole = value;
    }

    /**
     * Gets the value of the prijataPusobnostOhlasovny property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.PrijataPusobnostOhlasovny }
     *     
     */
    public GetSubjectResponse.PrijataPusobnostOhlasovny getPrijataPusobnostOhlasovny() {
        return prijataPusobnostOhlasovny;
    }

    /**
     * Sets the value of the prijataPusobnostOhlasovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.PrijataPusobnostOhlasovny }
     *     
     */
    public void setPrijataPusobnostOhlasovny(GetSubjectResponse.PrijataPusobnostOhlasovny value) {
        this.prijataPusobnostOhlasovny = value;
    }

    /**
     * Gets the value of the predanaPusobnostOhlasovny property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.PredanaPusobnostOhlasovny }
     *     
     */
    public GetSubjectResponse.PredanaPusobnostOhlasovny getPredanaPusobnostOhlasovny() {
        return predanaPusobnostOhlasovny;
    }

    /**
     * Sets the value of the predanaPusobnostOhlasovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.PredanaPusobnostOhlasovny }
     *     
     */
    public void setPredanaPusobnostOhlasovny(GetSubjectResponse.PredanaPusobnostOhlasovny value) {
        this.predanaPusobnostOhlasovny = value;
    }

    /**
     * Gets the value of the prijataPusobnostVolby property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.PrijataPusobnostVolby }
     *     
     */
    public GetSubjectResponse.PrijataPusobnostVolby getPrijataPusobnostVolby() {
        return prijataPusobnostVolby;
    }

    /**
     * Sets the value of the prijataPusobnostVolby property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.PrijataPusobnostVolby }
     *     
     */
    public void setPrijataPusobnostVolby(GetSubjectResponse.PrijataPusobnostVolby value) {
        this.prijataPusobnostVolby = value;
    }

    /**
     * Gets the value of the predanaPusobnostVolby property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.PredanaPusobnostVolby }
     *     
     */
    public GetSubjectResponse.PredanaPusobnostVolby getPredanaPusobnostVolby() {
        return predanaPusobnostVolby;
    }

    /**
     * Sets the value of the predanaPusobnostVolby property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.PredanaPusobnostVolby }
     *     
     */
    public void setPredanaPusobnostVolby(GetSubjectResponse.PredanaPusobnostVolby value) {
        this.predanaPusobnostVolby = value;
    }

    /**
     * Gets the value of the prijataPusobnostIsui property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.PrijataPusobnostIsui }
     *     
     */
    public GetSubjectResponse.PrijataPusobnostIsui getPrijataPusobnostIsui() {
        return prijataPusobnostIsui;
    }

    /**
     * Sets the value of the prijataPusobnostIsui property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.PrijataPusobnostIsui }
     *     
     */
    public void setPrijataPusobnostIsui(GetSubjectResponse.PrijataPusobnostIsui value) {
        this.prijataPusobnostIsui = value;
    }

    /**
     * Gets the value of the predanaPusobnostIsui property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.PredanaPusobnostIsui }
     *     
     */
    public GetSubjectResponse.PredanaPusobnostIsui getPredanaPusobnostIsui() {
        return predanaPusobnostIsui;
    }

    /**
     * Sets the value of the predanaPusobnostIsui property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.PredanaPusobnostIsui }
     *     
     */
    public void setPredanaPusobnostIsui(GetSubjectResponse.PredanaPusobnostIsui value) {
        this.predanaPusobnostIsui = value;
    }

    /**
     * Gets the value of the prijataPusobnostAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.PrijataPusobnostAdmin }
     *     
     */
    public GetSubjectResponse.PrijataPusobnostAdmin getPrijataPusobnostAdmin() {
        return prijataPusobnostAdmin;
    }

    /**
     * Sets the value of the prijataPusobnostAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.PrijataPusobnostAdmin }
     *     
     */
    public void setPrijataPusobnostAdmin(GetSubjectResponse.PrijataPusobnostAdmin value) {
        this.prijataPusobnostAdmin = value;
    }

    /**
     * Gets the value of the predanaPusobnostAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.PredanaPusobnostAdmin }
     *     
     */
    public GetSubjectResponse.PredanaPusobnostAdmin getPredanaPusobnostAdmin() {
        return predanaPusobnostAdmin;
    }

    /**
     * Sets the value of the predanaPusobnostAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.PredanaPusobnostAdmin }
     *     
     */
    public void setPredanaPusobnostAdmin(GetSubjectResponse.PredanaPusobnostAdmin value) {
        this.predanaPusobnostAdmin = value;
    }

    /**
     * Gets the value of the prijataPusobnostPuma property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.PrijataPusobnostPuma }
     *     
     */
    public GetSubjectResponse.PrijataPusobnostPuma getPrijataPusobnostPuma() {
        return prijataPusobnostPuma;
    }

    /**
     * Sets the value of the prijataPusobnostPuma property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.PrijataPusobnostPuma }
     *     
     */
    public void setPrijataPusobnostPuma(GetSubjectResponse.PrijataPusobnostPuma value) {
        this.prijataPusobnostPuma = value;
    }

    /**
     * Gets the value of the predanaPusobnostPuma property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.PredanaPusobnostPuma }
     *     
     */
    public GetSubjectResponse.PredanaPusobnostPuma getPredanaPusobnostPuma() {
        return predanaPusobnostPuma;
    }

    /**
     * Sets the value of the predanaPusobnostPuma property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.PredanaPusobnostPuma }
     *     
     */
    public void setPredanaPusobnostPuma(GetSubjectResponse.PredanaPusobnostPuma value) {
        this.predanaPusobnostPuma = value;
    }

    /**
     * Gets the value of the poplatek1Kn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek1Kn() {
        return poplatek1Kn;
    }

    /**
     * Sets the value of the poplatek1Kn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek1Kn(String value) {
        this.poplatek1Kn = value;
    }

    /**
     * Gets the value of the poplatek2Kn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek2Kn() {
        return poplatek2Kn;
    }

    /**
     * Sets the value of the poplatek2Kn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek2Kn(String value) {
        this.poplatek2Kn = value;
    }

    /**
     * Gets the value of the poplatek1Knmapy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek1Knmapy() {
        return poplatek1Knmapy;
    }

    /**
     * Sets the value of the poplatek1Knmapy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek1Knmapy(String value) {
        this.poplatek1Knmapy = value;
    }

    /**
     * Gets the value of the poplatek1Or property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek1Or() {
        return poplatek1Or;
    }

    /**
     * Sets the value of the poplatek1Or property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek1Or(String value) {
        this.poplatek1Or = value;
    }

    /**
     * Gets the value of the poplatek2Or property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek2Or() {
        return poplatek2Or;
    }

    /**
     * Sets the value of the poplatek2Or property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek2Or(String value) {
        this.poplatek2Or = value;
    }

    /**
     * Gets the value of the poplatek1Zr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek1Zr() {
        return poplatek1Zr;
    }

    /**
     * Sets the value of the poplatek1Zr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek1Zr(String value) {
        this.poplatek1Zr = value;
    }

    /**
     * Gets the value of the poplatek2Zr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek2Zr() {
        return poplatek2Zr;
    }

    /**
     * Sets the value of the poplatek2Zr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek2Zr(String value) {
        this.poplatek2Zr = value;
    }

    /**
     * Gets the value of the poplatek1Rt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek1Rt() {
        return poplatek1Rt;
    }

    /**
     * Sets the value of the poplatek1Rt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek1Rt(String value) {
        this.poplatek1Rt = value;
    }

    /**
     * Gets the value of the poplatek2Rt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek2Rt() {
        return poplatek2Rt;
    }

    /**
     * Sets the value of the poplatek2Rt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek2Rt(String value) {
        this.poplatek2Rt = value;
    }

    /**
     * Gets the value of the poplatek1Crr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek1Crr() {
        return poplatek1Crr;
    }

    /**
     * Sets the value of the poplatek1Crr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek1Crr(String value) {
        this.poplatek1Crr = value;
    }

    /**
     * Gets the value of the poplatek2Crr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek2Crr() {
        return poplatek2Crr;
    }

    /**
     * Sets the value of the poplatek2Crr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek2Crr(String value) {
        this.poplatek2Crr = value;
    }

    /**
     * Gets the value of the poplatek1Skd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek1Skd() {
        return poplatek1Skd;
    }

    /**
     * Sets the value of the poplatek1Skd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek1Skd(String value) {
        this.poplatek1Skd = value;
    }

    /**
     * Gets the value of the poplatek2Skd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek2Skd() {
        return poplatek2Skd;
    }

    /**
     * Sets the value of the poplatek2Skd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek2Skd(String value) {
        this.poplatek2Skd = value;
    }

    /**
     * Gets the value of the poplatek1Maisoh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek1Maisoh() {
        return poplatek1Maisoh;
    }

    /**
     * Sets the value of the poplatek1Maisoh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek1Maisoh(String value) {
        this.poplatek1Maisoh = value;
    }

    /**
     * Gets the value of the poplatek2Maisoh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek2Maisoh() {
        return poplatek2Maisoh;
    }

    /**
     * Sets the value of the poplatek2Maisoh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek2Maisoh(String value) {
        this.poplatek2Maisoh = value;
    }

    /**
     * Gets the value of the poplatek1Isir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek1Isir() {
        return poplatek1Isir;
    }

    /**
     * Sets the value of the poplatek1Isir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek1Isir(String value) {
        this.poplatek1Isir = value;
    }

    /**
     * Gets the value of the poplatek2Isir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek2Isir() {
        return poplatek2Isir;
    }

    /**
     * Sets the value of the poplatek2Isir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek2Isir(String value) {
        this.poplatek2Isir = value;
    }

    /**
     * Gets the value of the poplatek1Zakreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek1Zakreg() {
        return poplatek1Zakreg;
    }

    /**
     * Sets the value of the poplatek1Zakreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek1Zakreg(String value) {
        this.poplatek1Zakreg = value;
    }

    /**
     * Gets the value of the poplatek2Zakreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoplatek2Zakreg() {
        return poplatek2Zakreg;
    }

    /**
     * Sets the value of the poplatek2Zakreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoplatek2Zakreg(String value) {
        this.poplatek2Zakreg = value;
    }

    /**
     * Gets the value of the misto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMisto() {
        return misto;
    }

    /**
     * Sets the value of the misto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMisto(String value) {
        this.misto = value;
    }

    /**
     * Gets the value of the typOrganizace property.
     * 
     * @return
     *     possible object is
     *     {@link EpIdTypTypeResponse }
     *     
     */
    public EpIdTypTypeResponse getTypOrganizace() {
        return typOrganizace;
    }

    /**
     * Sets the value of the typOrganizace property.
     * 
     * @param value
     *     allowed object is
     *     {@link EpIdTypTypeResponse }
     *     
     */
    public void setTypOrganizace(EpIdTypTypeResponse value) {
        this.typOrganizace = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.BankAccount }
     *     
     */
    public GetSubjectResponse.BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.BankAccount }
     *     
     */
    public void setBankAccount(GetSubjectResponse.BankAccount value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the duvodZalozeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuvodZalozeni() {
        return duvodZalozeni;
    }

    /**
     * Sets the value of the duvodZalozeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuvodZalozeni(String value) {
        this.duvodZalozeni = value;
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
     * Gets the value of the spisovaSluzba property.
     * 
     * @return
     *     possible object is
     *     {@link StringBooleanTypeResponse }
     *     
     */
    public StringBooleanTypeResponse getSpisovaSluzba() {
        return spisovaSluzba;
    }

    /**
     * Sets the value of the spisovaSluzba property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringBooleanTypeResponse }
     *     
     */
    public void setSpisovaSluzba(StringBooleanTypeResponse value) {
        this.spisovaSluzba = value;
    }

    /**
     * Gets the value of the spisovaSluzbaUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpisovaSluzbaUrl() {
        return spisovaSluzbaUrl;
    }

    /**
     * Sets the value of the spisovaSluzbaUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpisovaSluzbaUrl(String value) {
        this.spisovaSluzbaUrl = value;
    }

    /**
     * Gets the value of the cestaFormulare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCestaFormulare() {
        return cestaFormulare;
    }

    /**
     * Sets the value of the cestaFormulare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCestaFormulare(String value) {
        this.cestaFormulare = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.Url }
     *     
     */
    public GetSubjectResponse.Url getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.Url }
     *     
     */
    public void setUrl(GetSubjectResponse.Url value) {
        this.url = value;
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
     * Gets the value of the isOVM property.
     * 
     * @return
     *     possible object is
     *     {@link StringBooleanTypeResponse }
     *     
     */
    public StringBooleanTypeResponse getIsOVM() {
        return isOVM;
    }

    /**
     * Sets the value of the isOVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringBooleanTypeResponse }
     *     
     */
    public void setIsOVM(StringBooleanTypeResponse value) {
        this.isOVM = value;
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
     * Gets the value of the isdsFormProcessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdsFormProcessingTime() {
        return isdsFormProcessingTime;
    }

    /**
     * Sets the value of the isdsFormProcessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdsFormProcessingTime(String value) {
        this.isdsFormProcessingTime = value;
    }

    /**
     * Gets the value of the agendy property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.Agendy }
     *     
     */
    public GetSubjectResponse.Agendy getAgendy() {
        return agendy;
    }

    /**
     * Sets the value of the agendy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.Agendy }
     *     
     */
    public void setAgendy(GetSubjectResponse.Agendy value) {
        this.agendy = value;
    }

    /**
     * Gets the value of the cinnostniRole property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectResponse.CinnostniRole }
     *     
     */
    public GetSubjectResponse.CinnostniRole getCinnostniRole() {
        return cinnostniRole;
    }

    /**
     * Sets the value of the cinnostniRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectResponse.CinnostniRole }
     *     
     */
    public void setCinnostniRole(GetSubjectResponse.CinnostniRole value) {
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
        protected List<GetSubjectResponse.Agendy.Item> item;

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
         * {@link GetSubjectResponse.Agendy.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.Agendy.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.Agendy.Item>();
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
        protected List<GetSubjectResponse.AisRole.Item> item;

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
         * {@link GetSubjectResponse.AisRole.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.AisRole.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.AisRole.Item>();
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
        protected List<GetSubjectResponse.BankAccount.Item> item;

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
         * {@link GetSubjectResponse.BankAccount.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.BankAccount.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.BankAccount.Item>();
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
        protected List<GetSubjectResponse.CinnostniRole.Item> item;

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
         * {@link GetSubjectResponse.CinnostniRole.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.CinnostniRole.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.CinnostniRole.Item>();
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
        protected List<GetSubjectResponse.Email.Item> item;

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
         * {@link GetSubjectResponse.Email.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.Email.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.Email.Item>();
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
            protected GetSubjectResponse.Email.Item.Type type;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String email;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
            protected String description;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link GetSubjectResponse.Email.Item.Type }
             *     
             */
            public GetSubjectResponse.Email.Item.Type getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetSubjectResponse.Email.Item.Type }
             *     
             */
            public void setType(GetSubjectResponse.Email.Item.Type value) {
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
    public static class PredanaPusobnostAdmin {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<GetSubjectResponse.PredanaPusobnostAdmin.Item> item;

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
         * {@link GetSubjectResponse.PredanaPusobnostAdmin.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.PredanaPusobnostAdmin.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.PredanaPusobnostAdmin.Item>();
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
    public static class PredanaPusobnostIsui {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<GetSubjectResponse.PredanaPusobnostIsui.Item> item;

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
         * {@link GetSubjectResponse.PredanaPusobnostIsui.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.PredanaPusobnostIsui.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.PredanaPusobnostIsui.Item>();
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
        protected List<GetSubjectResponse.PredanaPusobnostOhlasovny.Item> item;

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
         * {@link GetSubjectResponse.PredanaPusobnostOhlasovny.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.PredanaPusobnostOhlasovny.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.PredanaPusobnostOhlasovny.Item>();
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
        protected List<GetSubjectResponse.PredanaPusobnostPuma.Item> item;

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
         * {@link GetSubjectResponse.PredanaPusobnostPuma.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.PredanaPusobnostPuma.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.PredanaPusobnostPuma.Item>();
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
        protected List<GetSubjectResponse.PredanaPusobnostVolby.Item> item;

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
         * {@link GetSubjectResponse.PredanaPusobnostVolby.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.PredanaPusobnostVolby.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.PredanaPusobnostVolby.Item>();
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
        protected List<GetSubjectResponse.PrijataPusobnostAdmin.Item> item;

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
         * {@link GetSubjectResponse.PrijataPusobnostAdmin.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.PrijataPusobnostAdmin.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.PrijataPusobnostAdmin.Item>();
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
        protected List<GetSubjectResponse.PrijataPusobnostIsui.Item> item;

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
         * {@link GetSubjectResponse.PrijataPusobnostIsui.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.PrijataPusobnostIsui.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.PrijataPusobnostIsui.Item>();
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
        protected List<GetSubjectResponse.PrijataPusobnostOhlasovny.Item> item;

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
         * {@link GetSubjectResponse.PrijataPusobnostOhlasovny.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.PrijataPusobnostOhlasovny.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.PrijataPusobnostOhlasovny.Item>();
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
        protected List<GetSubjectResponse.PrijataPusobnostPuma.Item> item;

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
         * {@link GetSubjectResponse.PrijataPusobnostPuma.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.PrijataPusobnostPuma.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.PrijataPusobnostPuma.Item>();
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
        protected List<GetSubjectResponse.PrijataPusobnostVolby.Item> item;

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
         * {@link GetSubjectResponse.PrijataPusobnostVolby.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.PrijataPusobnostVolby.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.PrijataPusobnostVolby.Item>();
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
     *         &lt;element name="rovmKategorieItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="deletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="categorizationFrom" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="categorizationTo" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "rovmKategorieItem"
    })
    public static class RovmKategorie {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected List<GetSubjectResponse.RovmKategorie.RovmKategorieItem> rovmKategorieItem;

        /**
         * Gets the value of the rovmKategorieItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rovmKategorieItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRovmKategorieItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetSubjectResponse.RovmKategorie.RovmKategorieItem }
         * 
         * 
         */
        public List<GetSubjectResponse.RovmKategorie.RovmKategorieItem> getRovmKategorieItem() {
            if (rovmKategorieItem == null) {
                rovmKategorieItem = new ArrayList<GetSubjectResponse.RovmKategorie.RovmKategorieItem>();
            }
            return this.rovmKategorieItem;
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
         *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="deletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="categorizationFrom" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="categorizationTo" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class RovmKategorieItem {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "code", required = true)
            protected String code;
            @XmlAttribute(name = "creationDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar creationDate;
            @XmlAttribute(name = "deletionDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar deletionDate;
            @XmlAttribute(name = "categorizationFrom")
            protected String categorizationFrom;
            @XmlAttribute(name = "categorizationTo")
            protected String categorizationTo;

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
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the creationDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreationDate() {
                return creationDate;
            }

            /**
             * Sets the value of the creationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreationDate(XMLGregorianCalendar value) {
                this.creationDate = value;
            }

            /**
             * Gets the value of the deletionDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDeletionDate() {
                return deletionDate;
            }

            /**
             * Sets the value of the deletionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDeletionDate(XMLGregorianCalendar value) {
                this.deletionDate = value;
            }

            /**
             * Gets the value of the categorizationFrom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategorizationFrom() {
                return categorizationFrom;
            }

            /**
             * Sets the value of the categorizationFrom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategorizationFrom(String value) {
                this.categorizationFrom = value;
            }

            /**
             * Gets the value of the categorizationTo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategorizationTo() {
                return categorizationTo;
            }

            /**
             * Sets the value of the categorizationTo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategorizationTo(String value) {
                this.categorizationTo = value;
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
        protected List<GetSubjectResponse.TelephoneNumber.Item> item;

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
         * {@link GetSubjectResponse.TelephoneNumber.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.TelephoneNumber.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.TelephoneNumber.Item>();
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
            protected GetSubjectResponse.TelephoneNumber.Item.Type type;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String number;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link GetSubjectResponse.TelephoneNumber.Item.Type }
             *     
             */
            public GetSubjectResponse.TelephoneNumber.Item.Type getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetSubjectResponse.TelephoneNumber.Item.Type }
             *     
             */
            public void setType(GetSubjectResponse.TelephoneNumber.Item.Type value) {
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
        protected List<GetSubjectResponse.Url.Item> item;

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
         * {@link GetSubjectResponse.Url.Item }
         * 
         * 
         */
        public List<GetSubjectResponse.Url.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetSubjectResponse.Url.Item>();
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
            protected GetSubjectResponse.Url.Item.Type type;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0", required = true)
            protected String url;
            @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
            protected String description;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link GetSubjectResponse.Url.Item.Type }
             *     
             */
            public GetSubjectResponse.Url.Item.Type getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetSubjectResponse.Url.Item.Type }
             *     
             */
            public void setType(GetSubjectResponse.Url.Item.Type value) {
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
