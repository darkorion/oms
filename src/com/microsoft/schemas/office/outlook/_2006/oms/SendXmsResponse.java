
package com.microsoft.schemas.office.outlook._2006.oms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="SendXmsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sendXmsResult"
})
@XmlRootElement(name = "SendXmsResponse")
public class SendXmsResponse {

    @XmlElement(name = "SendXmsResult")
    protected String sendXmsResult;

    /**
     * Gets the value of the sendXmsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendXmsResult() {
        return sendXmsResult;
    }

    /**
     * Sets the value of the sendXmsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendXmsResult(String value) {
        this.sendXmsResult = value;
    }

}
