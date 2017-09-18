//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumStatut complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumStatut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="INITIAL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="RECTIFICATIF" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ANNULATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="MODIFICATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumStatut", propOrder = {
    "initial",
    "rectificatif",
    "annulation",
    "modification"
})
public class EnumStatut {

    @XmlElement(name = "INITIAL")
    protected Object initial;
    @XmlElement(name = "RECTIFICATIF")
    protected Object rectificatif;
    @XmlElement(name = "ANNULATION")
    protected Object annulation;
    @XmlElement(name = "MODIFICATION")
    protected Object modification;

    /**
     * Obtient la valeur de la propriété initial.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINITIAL() {
        return initial;
    }

    /**
     * Définit la valeur de la propriété initial.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINITIAL(Object value) {
        this.initial = value;
    }

    /**
     * Obtient la valeur de la propriété rectificatif.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRECTIFICATIF() {
        return rectificatif;
    }

    /**
     * Définit la valeur de la propriété rectificatif.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRECTIFICATIF(Object value) {
        this.rectificatif = value;
    }

    /**
     * Obtient la valeur de la propriété annulation.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getANNULATION() {
        return annulation;
    }

    /**
     * Définit la valeur de la propriété annulation.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setANNULATION(Object value) {
        this.annulation = value;
    }

    /**
     * Obtient la valeur de la propriété modification.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMODIFICATION() {
        return modification;
    }

    /**
     * Définit la valeur de la propriété modification.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMODIFICATION(Object value) {
        this.modification = value;
    }

}
