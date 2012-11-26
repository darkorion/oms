
package com.microsoft.schemas.office.outlook._2006.oms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Specify a type for the body part of the message data.
 *             
 * 
 * <p>Java class for tXmsBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tXmsBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mmsSlides" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tMmsSlides" minOccurs="0"/>
 *         &lt;element name="content" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tContent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="format" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tXmsBody", propOrder = {
    "mmsSlides",
    "content"
})
public class TXmsBody {

    protected TMmsSlides mmsSlides;
    @XmlElement(required = true)
    protected List<TContent> content;
    @XmlAttribute(required = true)
    protected String format;

    /**
     * Gets the value of the mmsSlides property.
     * 
     * @return
     *     possible object is
     *     {@link TMmsSlides }
     *     
     */
    public TMmsSlides getMmsSlides() {
        return mmsSlides;
    }

    /**
     * Sets the value of the mmsSlides property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMmsSlides }
     *     
     */
    public void setMmsSlides(TMmsSlides value) {
        this.mmsSlides = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TContent }
     * 
     * 
     */
    public List<TContent> getContent() {
        if (content == null) {
            content = new ArrayList<TContent>();
        }
        return this.content;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
