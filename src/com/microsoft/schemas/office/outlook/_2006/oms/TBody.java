
package com.microsoft.schemas.office.outlook._2006.oms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Specify a type for the body part of slide definition.
 *             
 * 
 * <p>Java class for tBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="par" type="{http://schemas.microsoft.com/office/Outlook/2006/OMS}tPar" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBody", propOrder = {
    "par"
})
public class TBody {

    @XmlElement(required = true)
    protected List<TPar> par;

    /**
     * Gets the value of the par property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the par property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPar }
     * 
     * 
     */
    public List<TPar> getPar() {
        if (par == null) {
            par = new ArrayList<TPar>();
        }
        return this.par;
    }

}
