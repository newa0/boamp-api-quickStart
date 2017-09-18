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
 * <p>Classe Java pour ConditionQualification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionQualification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="CONDITIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="METHODE_VERIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionQualification", propOrder = {
    "conditions",
    "methodeverification"
})
public class ConditionQualification {

    @XmlElement(name = "CONDITIONS")
    protected String conditions;
    @XmlElement(name = "METHODE_VERIFICATION")
    protected String methodeverification;

    /**
     * Obtient la valeur de la propriété conditions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONDITIONS() {
        return conditions;
    }

    /**
     * Définit la valeur de la propriété conditions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONDITIONS(String value) {
        this.conditions = value;
    }

    /**
     * Obtient la valeur de la propriété methodeverification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMETHODEVERIFICATION() {
        return methodeverification;
    }

    /**
     * Définit la valeur de la propriété methodeverification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMETHODEVERIFICATION(String value) {
        this.methodeverification = value;
    }

}
