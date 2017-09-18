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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ConditionDelai complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionDelai"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="RECEPT_CANDIDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RECEPT_OFFRES" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LIMITE_ENVOI_INVIT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VALIDITE_OFFRE" type="{}DureeValiditeOffre" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_SYSTEME_QUALIFICATION" type="{}DureeSystemQualification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionDelai", propOrder = {
    "receptcandidat",
    "receptoffres",
    "limiteenvoiinvit",
    "validiteoffre",
    "dureesystemequalification"
})
public class ConditionDelai {

    @XmlElement(name = "RECEPT_CANDIDAT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receptcandidat;
    @XmlElement(name = "RECEPT_OFFRES")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receptoffres;
    @XmlElement(name = "LIMITE_ENVOI_INVIT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar limiteenvoiinvit;
    @XmlElement(name = "VALIDITE_OFFRE")
    protected DureeValiditeOffre validiteoffre;
    @XmlElement(name = "DUREE_SYSTEME_QUALIFICATION")
    protected DureeSystemQualification dureesystemequalification;

    /**
     * Obtient la valeur de la propriété receptcandidat.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRECEPTCANDIDAT() {
        return receptcandidat;
    }

    /**
     * Définit la valeur de la propriété receptcandidat.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRECEPTCANDIDAT(XMLGregorianCalendar value) {
        this.receptcandidat = value;
    }

    /**
     * Obtient la valeur de la propriété receptoffres.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRECEPTOFFRES() {
        return receptoffres;
    }

    /**
     * Définit la valeur de la propriété receptoffres.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRECEPTOFFRES(XMLGregorianCalendar value) {
        this.receptoffres = value;
    }

    /**
     * Obtient la valeur de la propriété limiteenvoiinvit.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLIMITEENVOIINVIT() {
        return limiteenvoiinvit;
    }

    /**
     * Définit la valeur de la propriété limiteenvoiinvit.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLIMITEENVOIINVIT(XMLGregorianCalendar value) {
        this.limiteenvoiinvit = value;
    }

    /**
     * Obtient la valeur de la propriété validiteoffre.
     * 
     * @return
     *     possible object is
     *     {@link DureeValiditeOffre }
     *     
     */
    public DureeValiditeOffre getVALIDITEOFFRE() {
        return validiteoffre;
    }

    /**
     * Définit la valeur de la propriété validiteoffre.
     * 
     * @param value
     *     allowed object is
     *     {@link DureeValiditeOffre }
     *     
     */
    public void setVALIDITEOFFRE(DureeValiditeOffre value) {
        this.validiteoffre = value;
    }

    /**
     * Obtient la valeur de la propriété dureesystemequalification.
     * 
     * @return
     *     possible object is
     *     {@link DureeSystemQualification }
     *     
     */
    public DureeSystemQualification getDUREESYSTEMEQUALIFICATION() {
        return dureesystemequalification;
    }

    /**
     * Définit la valeur de la propriété dureesystemequalification.
     * 
     * @param value
     *     allowed object is
     *     {@link DureeSystemQualification }
     *     
     */
    public void setDUREESYSTEMEQUALIFICATION(DureeSystemQualification value) {
        this.dureesystemequalification = value;
    }

}
