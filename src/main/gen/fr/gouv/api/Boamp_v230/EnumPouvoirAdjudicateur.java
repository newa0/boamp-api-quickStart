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
 * <p>Classe Java pour EnumPouvoirAdjudicateur complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumPouvoirAdjudicateur"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="MIN_AUTORITE_NATIONALE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="AGENCE_NATIONAL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="AUTOTRITE_REGIONAL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="AGENCE_REGIONAL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ORG_DROIT_PUBLIC" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="INSTITUTION_EUROPEENNE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
@XmlType(name = "EnumPouvoirAdjudicateur", propOrder = {
    "minautoritenationale",
    "agencenational",
    "autotriteregional",
    "agenceregional",
    "orgdroitpublic",
    "institutioneuropeenne",
    "autre"
})
public class EnumPouvoirAdjudicateur {

    @XmlElement(name = "MIN_AUTORITE_NATIONALE")
    protected Object minautoritenationale;
    @XmlElement(name = "AGENCE_NATIONAL")
    protected Object agencenational;
    @XmlElement(name = "AUTOTRITE_REGIONAL")
    protected Object autotriteregional;
    @XmlElement(name = "AGENCE_REGIONAL")
    protected Object agenceregional;
    @XmlElement(name = "ORG_DROIT_PUBLIC")
    protected Object orgdroitpublic;
    @XmlElement(name = "INSTITUTION_EUROPEENNE")
    protected Object institutioneuropeenne;
    @XmlElement(name = "AUTRE")
    protected String autre;

    /**
     * Obtient la valeur de la propriété minautoritenationale.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMINAUTORITENATIONALE() {
        return minautoritenationale;
    }

    /**
     * Définit la valeur de la propriété minautoritenationale.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMINAUTORITENATIONALE(Object value) {
        this.minautoritenationale = value;
    }

    /**
     * Obtient la valeur de la propriété agencenational.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAGENCENATIONAL() {
        return agencenational;
    }

    /**
     * Définit la valeur de la propriété agencenational.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAGENCENATIONAL(Object value) {
        this.agencenational = value;
    }

    /**
     * Obtient la valeur de la propriété autotriteregional.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAUTOTRITEREGIONAL() {
        return autotriteregional;
    }

    /**
     * Définit la valeur de la propriété autotriteregional.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAUTOTRITEREGIONAL(Object value) {
        this.autotriteregional = value;
    }

    /**
     * Obtient la valeur de la propriété agenceregional.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAGENCEREGIONAL() {
        return agenceregional;
    }

    /**
     * Définit la valeur de la propriété agenceregional.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAGENCEREGIONAL(Object value) {
        this.agenceregional = value;
    }

    /**
     * Obtient la valeur de la propriété orgdroitpublic.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getORGDROITPUBLIC() {
        return orgdroitpublic;
    }

    /**
     * Définit la valeur de la propriété orgdroitpublic.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setORGDROITPUBLIC(Object value) {
        this.orgdroitpublic = value;
    }

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
