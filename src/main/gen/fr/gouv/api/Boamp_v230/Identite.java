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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Identite complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Identite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DENOMINATION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODE_IDENT_NATIONAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CORRESPONDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONTACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADJUDICATEUR_NUTS" type="{}typeNUTS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identite", propOrder = {
    "denomination",
    "codeidentnational",
    "correspondant",
    "contact",
    "adjudicateurnuts"
})
@XmlSeeAlso({
    Contact.class
})
public class Identite {

    @XmlElement(name = "DENOMINATION", required = true)
    protected String denomination;
    @XmlElement(name = "CODE_IDENT_NATIONAL")
    protected String codeidentnational;
    @XmlElement(name = "CORRESPONDANT")
    protected String correspondant;
    @XmlElement(name = "CONTACT")
    protected String contact;
    @XmlElement(name = "ADJUDICATEUR_NUTS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String adjudicateurnuts;

    /**
     * Obtient la valeur de la propriété denomination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENOMINATION() {
        return denomination;
    }

    /**
     * Définit la valeur de la propriété denomination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENOMINATION(String value) {
        this.denomination = value;
    }

    /**
     * Obtient la valeur de la propriété codeidentnational.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEIDENTNATIONAL() {
        return codeidentnational;
    }

    /**
     * Définit la valeur de la propriété codeidentnational.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEIDENTNATIONAL(String value) {
        this.codeidentnational = value;
    }

    /**
     * Obtient la valeur de la propriété correspondant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORRESPONDANT() {
        return correspondant;
    }

    /**
     * Définit la valeur de la propriété correspondant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORRESPONDANT(String value) {
        this.correspondant = value;
    }

    /**
     * Obtient la valeur de la propriété contact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTACT() {
        return contact;
    }

    /**
     * Définit la valeur de la propriété contact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTACT(String value) {
        this.contact = value;
    }

    /**
     * Obtient la valeur de la propriété adjudicateurnuts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADJUDICATEURNUTS() {
        return adjudicateurnuts;
    }

    /**
     * Définit la valeur de la propriété adjudicateurnuts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADJUDICATEURNUTS(String value) {
        this.adjudicateurnuts = value;
    }

}
