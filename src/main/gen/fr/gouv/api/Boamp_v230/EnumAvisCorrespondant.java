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
 * <p>Classe Java pour EnumAvisCorrespondant complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumAvisCorrespondant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AVIS_PERIODIQUE_INDICATIF" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="SYSTEME_QUALIFICATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumAvisCorrespondant", propOrder = {
    "avisperiodiqueindicatif",
    "systemequalification"
})
public class EnumAvisCorrespondant {

    @XmlElement(name = "AVIS_PERIODIQUE_INDICATIF")
    protected Object avisperiodiqueindicatif;
    @XmlElement(name = "SYSTEME_QUALIFICATION")
    protected Object systemequalification;

    /**
     * Obtient la valeur de la propriété avisperiodiqueindicatif.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAVISPERIODIQUEINDICATIF() {
        return avisperiodiqueindicatif;
    }

    /**
     * Définit la valeur de la propriété avisperiodiqueindicatif.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAVISPERIODIQUEINDICATIF(Object value) {
        this.avisperiodiqueindicatif = value;
    }

    /**
     * Obtient la valeur de la propriété systemequalification.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSYSTEMEQUALIFICATION() {
        return systemequalification;
    }

    /**
     * Définit la valeur de la propriété systemequalification.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSYSTEMEQUALIFICATION(Object value) {
        this.systemequalification = value;
    }

}
