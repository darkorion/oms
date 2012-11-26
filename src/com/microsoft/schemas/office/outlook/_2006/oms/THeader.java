
package com.microsoft.schemas.office.outlook._2006.oms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Specify a type for the header part of the message data.
 *             
 * 
 * <p>Java class for tHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meta" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tMeta" minOccurs="0"/>
 *         &lt;element name="layout" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tLayout"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tHeader", propOrder = {
    "meta",
    "layout"
})
public class THeader {

    protected TMeta meta;
    @XmlElement(required = true)
    protected TLayout layout;

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link TMeta }
     *     
     */
    public TMeta getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMeta }
     *     
     */
    public void setMeta(TMeta value) {
        this.meta = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link TLayout }
     *     
     */
    public TLayout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLayout }
     *     
     */
    public void setLayout(TLayout value) {
        this.layout = value;
    }

}
