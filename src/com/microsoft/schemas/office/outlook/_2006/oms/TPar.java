
package com.microsoft.schemas.office.outlook._2006.oms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Specify a type for elements of a slide.
 *             
 * 
 * <p>Java class for tPar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="img" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tImg" minOccurs="0"/>
 *         &lt;element name="text" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tText" minOccurs="0"/>
 *         &lt;element name="audio" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tAudio" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dur" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPar", propOrder = {
    "img",
    "text",
    "audio"
})
public class TPar {

    protected TImg img;
    protected TText text;
    protected TAudio audio;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long dur;

    /**
     * Gets the value of the img property.
     * 
     * @return
     *     possible object is
     *     {@link TImg }
     *     
     */
    public TImg getImg() {
        return img;
    }

    /**
     * Sets the value of the img property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImg }
     *     
     */
    public void setImg(TImg value) {
        this.img = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TText }
     *     
     */
    public TText getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TText }
     *     
     */
    public void setText(TText value) {
        this.text = value;
    }

    /**
     * Gets the value of the audio property.
     * 
     * @return
     *     possible object is
     *     {@link TAudio }
     *     
     */
    public TAudio getAudio() {
        return audio;
    }

    /**
     * Sets the value of the audio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAudio }
     *     
     */
    public void setAudio(TAudio value) {
        this.audio = value;
    }

    /**
     * Gets the value of the dur property.
     * 
     */
    public long getDur() {
        return dur;
    }

    /**
     * Sets the value of the dur property.
     * 
     */
    public void setDur(long value) {
        this.dur = value;
    }

}
