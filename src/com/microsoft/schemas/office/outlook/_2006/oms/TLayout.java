
package com.microsoft.schemas.office.outlook._2006.oms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Specify a type for the layout definition of a multimedia message.
 *             
 * 
 * <p>Java class for tLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="root-layout" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tRoot-layout"/>
 *         &lt;element name="region" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tRegion" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLayout", propOrder = {
    "rootLayout",
    "region"
})
public class TLayout {

    @XmlElement(name = "root-layout", required = true)
    protected TRootLayout rootLayout;
    @XmlElement(required = true)
    protected List<TRegion> region;

    /**
     * Gets the value of the rootLayout property.
     * 
     * @return
     *     possible object is
     *     {@link TRootLayout }
     *     
     */
    public TRootLayout getRootLayout() {
        return rootLayout;
    }

    /**
     * Sets the value of the rootLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRootLayout }
     *     
     */
    public void setRootLayout(TRootLayout value) {
        this.rootLayout = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRegion }
     * 
     * 
     */
    public List<TRegion> getRegion() {
        if (region == null) {
            region = new ArrayList<TRegion>();
        }
        return this.region;
    }

}
