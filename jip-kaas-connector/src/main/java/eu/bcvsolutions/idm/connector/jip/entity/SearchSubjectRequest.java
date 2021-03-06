
package eu.bcvsolutions.idm.connector.jip.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="subtree-search" type="{http://userportal.novell.com/ws/WS-LA-1.0}SubtreeSearch" />
 *       &lt;attribute name="search-criterium" use="required" type="{http://userportal.novell.com/ws/WS-LA-1.0}SearchCriterium" />
 *       &lt;attribute name="search-value" type="{http://userportal.novell.com/ws/WS-LA-1.0}SearchValue" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SearchSubjectRequest", namespace = "http://userportal.novell.com/ws/WS-LA-1.0")
public class SearchSubjectRequest {

    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute(name = "start")
    protected BigInteger start;
    @XmlAttribute(name = "subtree-search")
    protected Boolean subtreeSearch;
    @XmlAttribute(name = "search-criterium", required = true)
    protected String searchCriterium;
    @XmlAttribute(name = "search-value")
    protected String searchValue;

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
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Gets the value of the subtreeSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubtreeSearch() {
        return subtreeSearch;
    }

    /**
     * Sets the value of the subtreeSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubtreeSearch(Boolean value) {
        this.subtreeSearch = value;
    }

    /**
     * Gets the value of the searchCriterium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCriterium() {
        return searchCriterium;
    }

    /**
     * Sets the value of the searchCriterium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCriterium(String value) {
        this.searchCriterium = value;
    }

    /**
     * Gets the value of the searchValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchValue() {
        return searchValue;
    }

    /**
     * Sets the value of the searchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchValue(String value) {
        this.searchValue = value;
    }

}
