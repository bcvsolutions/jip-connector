
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
 *                   &lt;element name="ico" type="{http://userportal.novell.com/ws/WS-LA-1.0}icoTypeResponse" minOccurs="0"/>
 *                   &lt;element name="typInstituce" type="{http://userportal.novell.com/ws/WS-LA-1.0}czptypinstituceTypeResponse" minOccurs="0"/>
 *                   &lt;element name="kraj" type="{http://userportal.novell.com/ws/WS-LA-1.0}krajTypeResponse" minOccurs="0"/>
 *                   &lt;element name="casPosledniZmeny" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "GetSubjectListResponse", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class GetSubjectListResponse {

    @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
    protected List<GetSubjectListResponse.Row> row;
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
     * {@link GetSubjectListResponse.Row }
     * 
     * 
     */
    public List<GetSubjectListResponse.Row> getRow() {
        if (row == null) {
            row = new ArrayList<GetSubjectListResponse.Row>();
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
     *         &lt;element name="ico" type="{http://userportal.novell.com/ws/WS-LA-1.0}icoTypeResponse" minOccurs="0"/>
     *         &lt;element name="typInstituce" type="{http://userportal.novell.com/ws/WS-LA-1.0}czptypinstituceTypeResponse" minOccurs="0"/>
     *         &lt;element name="kraj" type="{http://userportal.novell.com/ws/WS-LA-1.0}krajTypeResponse" minOccurs="0"/>
     *         &lt;element name="casPosledniZmeny" type="{http://userportal.novell.com/ws/WS-LA-1.0}stringTypeResponse" minOccurs="0"/>
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
    public static class Row {

        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String name;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String ico;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected CzptypinstituceTypeResponse typInstituce;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected KrajTypeResponse kraj;
        @XmlElement(namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
        protected String casPosledniZmeny;
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
         * Gets the value of the kraj property.
         * 
         * @return
         *     possible object is
         *     {@link KrajTypeResponse }
         *     
         */
        public KrajTypeResponse getKraj() {
            return kraj;
        }

        /**
         * Sets the value of the kraj property.
         * 
         * @param value
         *     allowed object is
         *     {@link KrajTypeResponse }
         *     
         */
        public void setKraj(KrajTypeResponse value) {
            this.kraj = value;
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

    }

}
