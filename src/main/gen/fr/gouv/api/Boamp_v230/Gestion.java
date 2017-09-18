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
 * <p>Classe Java pour Gestion complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Gestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REFERENCE" type="{}Reference"/&gt;
 *         &lt;element name="MARCHE" type="{}Marche" minOccurs="0"/&gt;
 *         &lt;element name="NOM_HTML" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="INDEXATION" type="{}Indexation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gestion", propOrder = {
    "reference",
    "marche",
    "nomhtml",
    "indexation"
})
public class Gestion {

    @XmlElement(name = "REFERENCE", required = true)
    protected Reference reference;
    @XmlElement(name = "MARCHE")
    protected Marche marche;
    @XmlElement(name = "NOM_HTML", required = true)
    protected String nomhtml;
    @XmlElement(name = "INDEXATION", required = true)
    protected Indexation indexation;

    /**
     * Obtient la valeur de la propriété reference.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getREFERENCE() {
        return reference;
    }

    /**
     * Définit la valeur de la propriété reference.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setREFERENCE(Reference value) {
        this.reference = value;
    }

    /**
     * Obtient la valeur de la propriété marche.
     * 
     * @return
     *     possible object is
     *     {@link Marche }
     *     
     */
    public Marche getMARCHE() {
        return marche;
    }

    /**
     * Définit la valeur de la propriété marche.
     * 
     * @param value
     *     allowed object is
     *     {@link Marche }
     *     
     */
    public void setMARCHE(Marche value) {
        this.marche = value;
    }

    /**
     * Obtient la valeur de la propriété nomhtml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMHTML() {
        return nomhtml;
    }

    /**
     * Définit la valeur de la propriété nomhtml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMHTML(String value) {
        this.nomhtml = value;
    }

    /**
     * Obtient la valeur de la propriété indexation.
     * 
     * @return
     *     possible object is
     *     {@link Indexation }
     *     
     */
    public Indexation getINDEXATION() {
        return indexation;
    }

    /**
     * Définit la valeur de la propriété indexation.
     * 
     * @param value
     *     allowed object is
     *     {@link Indexation }
     *     
     */
    public void setINDEXATION(Indexation value) {
        this.indexation = value;
    }

}
