
package com.microsoft.schemas.office.outlook._2006.oms;

import javax.xml.bind.annotation.*;


/**
 * 
 *                 Specify a type for the message data being transferred to the Web service.
 *             
 * 
 * <p>Java class for tXmsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tXmsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tUser" minOccurs="0"/>
 *         &lt;element name="xmsHead" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tXmsHeader" minOccurs="0"/>
 *         &lt;element name="xmsBody" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tXmsBody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="client" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement( name = "xmsData" )
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tXmsData", propOrder = {
    "user",
    "xmsHead",
    "xmsBody"
})
public class TXmsData {

    protected TUser user;
    protected TXmsHeader xmsHead;
    @XmlElement(required = true)
    protected TXmsBody xmsBody;
    @XmlAttribute
    protected String client;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link TUser }
     *     
     */
    public TUser getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUser }
     *     
     */
    public void setUser(TUser value) {
        this.user = value;
    }

    /**
     * Gets the value of the xmsHead property.
     * 
     * @return
     *     possible object is
     *     {@link TXmsHeader }
     *     
     */
    public TXmsHeader getXmsHead() {
        return xmsHead;
    }

    /**
     * Sets the value of the xmsHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link TXmsHeader }
     *     
     */
    public void setXmsHead(TXmsHeader value) {
        this.xmsHead = value;
    }

    /**
     * Gets the value of the xmsBody property.
     * 
     * @return
     *     possible object is
     *     {@link TXmsBody }
     *     
     */
    public TXmsBody getXmsBody() {
        return xmsBody;
    }

    /**
     * Sets the value of the xmsBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link TXmsBody }
     *     
     */
    public void setXmsBody(TXmsBody value) {
        this.xmsBody = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

}
