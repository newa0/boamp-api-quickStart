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
 * <p>Classe Java pour EnumOrganisme complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumOrganisme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="INSTITUTION_EUROPEENNE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ETAT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="REGION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DEPARTEMENT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="COMMUNE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="EPN" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="EPT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="AUTRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumOrganisme", propOrder = {
    "institutioneuropeenne",
    "etat",
    "region",
    "departement",
    "commune",
    "epn",
    "ept",
    "autre"
})
public class EnumOrganisme {

    @XmlElement(name = "INSTITUTION_EUROPEENNE")
    protected Object institutioneuropeenne;
    @XmlElement(name = "ETAT")
    protected Object etat;
    @XmlElement(name = "REGION")
    protected Object region;
    @XmlElement(name = "DEPARTEMENT")
    protected Object departement;
    @XmlElement(name = "COMMUNE")
    protected Object commune;
    @XmlElement(name = "EPN")
    protected Object epn;
    @XmlElement(name = "EPT")
    protected Object ept;
    @XmlElement(name = "AUTRE")
    protected String autre;

    /**
     * Obtient la valeur de la propriété institutioneuropeenne.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINSTITUTIONEUROPEENNE() {
        return institutioneuropeenne;
    }

    /**
     * Définit la valeur de la propriété institutioneuropeenne.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINSTITUTIONEUROPEENNE(Object value) {
        this.institutioneuropeenne = value;
    }

    /**
     * Obtient la valeur de la propriété etat.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getETAT() {
        return etat;
    }

    /**
     * Définit la valeur de la propriété etat.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setETAT(Object value) {
        this.etat = value;
    }

    /**
     * Obtient la valeur de la propriété region.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREGION() {
        return region;
    }

    /**
     * Définit la valeur de la propriété region.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREGION(Object value) {
        this.region = value;
    }

    /**
     * Obtient la valeur de la propriété departement.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDEPARTEMENT() {
        return departement;
    }

    /**
     * Définit la valeur de la propriété departement.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDEPARTEMENT(Object value) {
        this.departement = value;
    }

    /**
     * Obtient la valeur de la propriété commune.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOMMUNE() {
        return commune;
    }

    /**
     * Définit la valeur de la propriété commune.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOMMUNE(Object value) {
        this.commune = value;
    }

    /**
     * Obtient la valeur de la propriété epn.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEPN() {
        return epn;
    }

    /**
     * Définit la valeur de la propriété epn.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEPN(Object value) {
        this.epn = value;
    }

    /**
     * Obtient la valeur de la propriété ept.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEPT() {
        return ept;
    }

    /**
     * Définit la valeur de la propriété ept.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEPT(Object value) {
        this.ept = value;
    }

    /**
     * Obtient la valeur de la propriété autre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTRE() {
        return autre;
    }

    /**
     * Définit la valeur de la propriété autre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTRE(String value) {
        this.autre = value;
    }

}
