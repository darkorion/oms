
package com.microsoft.schemas.office.outlook._2006.oms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Specify a type for the slide definition.
 *             
 * 
 * <p>Java class for tMmsSlides complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMmsSlides">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="head" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tHeader" minOccurs="0"/>
 *         &lt;element name="body" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tBody"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMmsSlides", propOrder = {
    "head",
    "body"
})
public class TMmsSlides {

    protected THeader head;
    @XmlElement(required = true)
    protected TBody body;

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link THeader }
     *     
     */
    public THeader getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link THeader }
     *     
     */
    public void setHead(THeader value) {
        this.head = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link TBody }
     *     
     */
    public TBody getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBody }
     *     
     */
    public void setBody(TBody value) {
        this.body = value;
    }

}
