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
 * <p>Classe Java pour EnumNature complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumNature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PRE-INFORMATION"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice minOccurs="0"&gt;
 *                   &lt;element name="STANDARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="PERIODIQUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="QUALIFICATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CONCESSION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="REDUCTION_DELAI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="MISE_EN_CONCURRENCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="APPEL_OFFRE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice minOccurs="0"&gt;
 *                   &lt;element name="STANDARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CONCOURS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="PERIODIQUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="QUALIFICATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="SAD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CONCESSION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CONCESSIONNAIRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INTENTION_CONCLURE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ATTRIBUTION"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice minOccurs="0"&gt;
 *                   &lt;element name="STANDARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CONCOURS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CONCESSION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="STANDARD_INFRUCTUEUX_SANS_SUITE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SOUS-TRAITANCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="MODIFICATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="QUALIFICATION"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice minOccurs="0"&gt;
 *                   &lt;element name="STANDARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="MISE_EN_CONCURRENCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RECTIFICATIF" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="PERIODIQUE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice minOccurs="0"&gt;
 *                   &lt;element name="STANDARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="REDUCTION_DELAI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="MISE_EN_CONCURRENCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "EnumNature", propOrder = {
    "preinformation",
    "profilacheteur",
    "appeloffre",
    "intentionconclure",
    "attribution",
    "soustraitance",
    "modification",
    "qualification",
    "rectificatif",
    "periodique",
    "autre"
})
public class EnumNature {

    @XmlElement(name = "PRE-INFORMATION")
    protected EnumNature.PREINFORMATION preinformation;
    @XmlElement(name = "PROFIL_ACHETEUR")
    protected Object profilacheteur;
    @XmlElement(name = "APPEL_OFFRE")
    protected EnumNature.APPELOFFRE appeloffre;
    @XmlElement(name = "INTENTION_CONCLURE")
    protected Object intentionconclure;
    @XmlElement(name = "ATTRIBUTION")
    protected EnumNature.ATTRIBUTION attribution;
    @XmlElement(name = "SOUS-TRAITANCE")
    protected Object soustraitance;
    @XmlElement(name = "MODIFICATION")
    protected Object modification;
    @XmlElement(name = "QUALIFICATION")
    protected EnumNature.QUALIFICATION qualification;
    @XmlElement(name = "RECTIFICATIF")
    protected Object rectificatif;
    @XmlElement(name = "PERIODIQUE")
    protected EnumNature.PERIODIQUE periodique;
    @XmlElement(name = "AUTRE")
    protected String autre;

    /**
     * Obtient la valeur de la propriété preinformation.
     * 
     * @return
     *     possible object is
     *     {@link EnumNature.PREINFORMATION }
     *     
     */
    public EnumNature.PREINFORMATION getPREINFORMATION() {
        return preinformation;
    }

    /**
     * Définit la valeur de la propriété preinformation.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNature.PREINFORMATION }
     *     
     */
    public void setPREINFORMATION(EnumNature.PREINFORMATION value) {
        this.preinformation = value;
    }

    /**
     * Obtient la valeur de la propriété profilacheteur.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPROFILACHETEUR() {
        return profilacheteur;
    }

    /**
     * Définit la valeur de la propriété profilacheteur.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPROFILACHETEUR(Object value) {
        this.profilacheteur = value;
    }

    /**
     * Obtient la valeur de la propriété appeloffre.
     * 
     * @return
     *     possible object is
     *     {@link EnumNature.APPELOFFRE }
     *     
     */
    public EnumNature.APPELOFFRE getAPPELOFFRE() {
        return appeloffre;
    }

    /**
     * Définit la valeur de la propriété appeloffre.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNature.APPELOFFRE }
     *     
     */
    public void setAPPELOFFRE(EnumNature.APPELOFFRE value) {
        this.appeloffre = value;
    }

    /**
     * Obtient la valeur de la propriété intentionconclure.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINTENTIONCONCLURE() {
        return intentionconclure;
    }

    /**
     * Définit la valeur de la propriété intentionconclure.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINTENTIONCONCLURE(Object value) {
        this.intentionconclure = value;
    }

    /**
     * Obtient la valeur de la propriété attribution.
     * 
     * @return
     *     possible object is
     *     {@link EnumNature.ATTRIBUTION }
     *     
     */
    public EnumNature.ATTRIBUTION getATTRIBUTION() {
        return attribution;
    }

    /**
     * Définit la valeur de la propriété attribution.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNature.ATTRIBUTION }
     *     
     */
    public void setATTRIBUTION(EnumNature.ATTRIBUTION value) {
        this.attribution = value;
    }

    /**
     * Obtient la valeur de la propriété soustraitance.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSOUSTRAITANCE() {
        return soustraitance;
    }

    /**
     * Définit la valeur de la propriété soustraitance.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSOUSTRAITANCE(Object value) {
        this.soustraitance = value;
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

    /**
     * Obtient la valeur de la propriété qualification.
     * 
     * @return
     *     possible object is
     *     {@link EnumNature.QUALIFICATION }
     *     
     */
    public EnumNature.QUALIFICATION getQUALIFICATION() {
        return qualification;
    }

    /**
     * Définit la valeur de la propriété qualification.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNature.QUALIFICATION }
     *     
     */
    public void setQUALIFICATION(EnumNature.QUALIFICATION value) {
        this.qualification = value;
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
     * Obtient la valeur de la propriété periodique.
     * 
     * @return
     *     possible object is
     *     {@link EnumNature.PERIODIQUE }
     *     
     */
    public EnumNature.PERIODIQUE getPERIODIQUE() {
        return periodique;
    }

    /**
     * Définit la valeur de la propriété periodique.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNature.PERIODIQUE }
     *     
     */
    public void setPERIODIQUE(EnumNature.PERIODIQUE value) {
        this.periodique = value;
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;element name="STANDARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CONCOURS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PERIODIQUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="QUALIFICATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="SAD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CONCESSION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CONCESSIONNAIRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "standard",
        "concours",
        "periodique",
        "qualification",
        "sad",
        "concession",
        "concessionnaire"
    })
    public static class APPELOFFRE {

        @XmlElement(name = "STANDARD")
        protected Object standard;
        @XmlElement(name = "CONCOURS")
        protected Object concours;
        @XmlElement(name = "PERIODIQUE")
        protected Object periodique;
        @XmlElement(name = "QUALIFICATION")
        protected Object qualification;
        @XmlElement(name = "SAD")
        protected Object sad;
        @XmlElement(name = "CONCESSION")
        protected Object concession;
        @XmlElement(name = "CONCESSIONNAIRE")
        protected Object concessionnaire;

        /**
         * Obtient la valeur de la propriété standard.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTANDARD() {
            return standard;
        }

        /**
         * Définit la valeur de la propriété standard.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTANDARD(Object value) {
            this.standard = value;
        }

        /**
         * Obtient la valeur de la propriété concours.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCONCOURS() {
            return concours;
        }

        /**
         * Définit la valeur de la propriété concours.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCONCOURS(Object value) {
            this.concours = value;
        }

        /**
         * Obtient la valeur de la propriété periodique.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPERIODIQUE() {
            return periodique;
        }

        /**
         * Définit la valeur de la propriété periodique.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPERIODIQUE(Object value) {
            this.periodique = value;
        }

        /**
         * Obtient la valeur de la propriété qualification.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getQUALIFICATION() {
            return qualification;
        }

        /**
         * Définit la valeur de la propriété qualification.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setQUALIFICATION(Object value) {
            this.qualification = value;
        }

        /**
         * Obtient la valeur de la propriété sad.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSAD() {
            return sad;
        }

        /**
         * Définit la valeur de la propriété sad.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSAD(Object value) {
            this.sad = value;
        }

        /**
         * Obtient la valeur de la propriété concession.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCONCESSION() {
            return concession;
        }

        /**
         * Définit la valeur de la propriété concession.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCONCESSION(Object value) {
            this.concession = value;
        }

        /**
         * Obtient la valeur de la propriété concessionnaire.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCONCESSIONNAIRE() {
            return concessionnaire;
        }

        /**
         * Définit la valeur de la propriété concessionnaire.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCONCESSIONNAIRE(Object value) {
            this.concessionnaire = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;element name="STANDARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CONCOURS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CONCESSION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="STANDARD_INFRUCTUEUX_SANS_SUITE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "standard",
        "concours",
        "concession",
        "standardinfructueuxsanssuite"
    })
    public static class ATTRIBUTION {

        @XmlElement(name = "STANDARD")
        protected Object standard;
        @XmlElement(name = "CONCOURS")
        protected Object concours;
        @XmlElement(name = "CONCESSION")
        protected Object concession;
        @XmlElement(name = "STANDARD_INFRUCTUEUX_SANS_SUITE")
        protected Object standardinfructueuxsanssuite;

        /**
         * Obtient la valeur de la propriété standard.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTANDARD() {
            return standard;
        }

        /**
         * Définit la valeur de la propriété standard.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTANDARD(Object value) {
            this.standard = value;
        }

        /**
         * Obtient la valeur de la propriété concours.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCONCOURS() {
            return concours;
        }

        /**
         * Définit la valeur de la propriété concours.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCONCOURS(Object value) {
            this.concours = value;
        }

        /**
         * Obtient la valeur de la propriété concession.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCONCESSION() {
            return concession;
        }

        /**
         * Définit la valeur de la propriété concession.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCONCESSION(Object value) {
            this.concession = value;
        }

        /**
         * Obtient la valeur de la propriété standardinfructueuxsanssuite.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTANDARDINFRUCTUEUXSANSSUITE() {
            return standardinfructueuxsanssuite;
        }

        /**
         * Définit la valeur de la propriété standardinfructueuxsanssuite.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTANDARDINFRUCTUEUXSANSSUITE(Object value) {
            this.standardinfructueuxsanssuite = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;element name="STANDARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="REDUCTION_DELAI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="MISE_EN_CONCURRENCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "standard",
        "reductiondelai",
        "miseenconcurrence",
        "profilacheteur"
    })
    public static class PERIODIQUE {

        @XmlElement(name = "STANDARD")
        protected Object standard;
        @XmlElement(name = "REDUCTION_DELAI")
        protected Object reductiondelai;
        @XmlElement(name = "MISE_EN_CONCURRENCE")
        protected Object miseenconcurrence;
        @XmlElement(name = "PROFIL_ACHETEUR")
        protected Object profilacheteur;

        /**
         * Obtient la valeur de la propriété standard.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTANDARD() {
            return standard;
        }

        /**
         * Définit la valeur de la propriété standard.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTANDARD(Object value) {
            this.standard = value;
        }

        /**
         * Obtient la valeur de la propriété reductiondelai.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getREDUCTIONDELAI() {
            return reductiondelai;
        }

        /**
         * Définit la valeur de la propriété reductiondelai.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setREDUCTIONDELAI(Object value) {
            this.reductiondelai = value;
        }

        /**
         * Obtient la valeur de la propriété miseenconcurrence.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMISEENCONCURRENCE() {
            return miseenconcurrence;
        }

        /**
         * Définit la valeur de la propriété miseenconcurrence.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMISEENCONCURRENCE(Object value) {
            this.miseenconcurrence = value;
        }

        /**
         * Obtient la valeur de la propriété profilacheteur.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPROFILACHETEUR() {
            return profilacheteur;
        }

        /**
         * Définit la valeur de la propriété profilacheteur.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPROFILACHETEUR(Object value) {
            this.profilacheteur = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;element name="STANDARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PERIODIQUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="QUALIFICATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CONCESSION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="REDUCTION_DELAI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="MISE_EN_CONCURRENCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "standard",
        "periodique",
        "qualification",
        "concession",
        "reductiondelai",
        "miseenconcurrence",
        "profilacheteur"
    })
    public static class PREINFORMATION {

        @XmlElement(name = "STANDARD")
        protected Object standard;
        @XmlElement(name = "PERIODIQUE")
        protected Object periodique;
        @XmlElement(name = "QUALIFICATION")
        protected Object qualification;
        @XmlElement(name = "CONCESSION")
        protected Object concession;
        @XmlElement(name = "REDUCTION_DELAI")
        protected Object reductiondelai;
        @XmlElement(name = "MISE_EN_CONCURRENCE")
        protected Object miseenconcurrence;
        @XmlElement(name = "PROFIL_ACHETEUR")
        protected Object profilacheteur;

        /**
         * Obtient la valeur de la propriété standard.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTANDARD() {
            return standard;
        }

        /**
         * Définit la valeur de la propriété standard.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTANDARD(Object value) {
            this.standard = value;
        }

        /**
         * Obtient la valeur de la propriété periodique.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPERIODIQUE() {
            return periodique;
        }

        /**
         * Définit la valeur de la propriété periodique.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPERIODIQUE(Object value) {
            this.periodique = value;
        }

        /**
         * Obtient la valeur de la propriété qualification.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getQUALIFICATION() {
            return qualification;
        }

        /**
         * Définit la valeur de la propriété qualification.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setQUALIFICATION(Object value) {
            this.qualification = value;
        }

        /**
         * Obtient la valeur de la propriété concession.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCONCESSION() {
            return concession;
        }

        /**
         * Définit la valeur de la propriété concession.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCONCESSION(Object value) {
            this.concession = value;
        }

        /**
         * Obtient la valeur de la propriété reductiondelai.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getREDUCTIONDELAI() {
            return reductiondelai;
        }

        /**
         * Définit la valeur de la propriété reductiondelai.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setREDUCTIONDELAI(Object value) {
            this.reductiondelai = value;
        }

        /**
         * Obtient la valeur de la propriété miseenconcurrence.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMISEENCONCURRENCE() {
            return miseenconcurrence;
        }

        /**
         * Définit la valeur de la propriété miseenconcurrence.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMISEENCONCURRENCE(Object value) {
            this.miseenconcurrence = value;
        }

        /**
         * Obtient la valeur de la propriété profilacheteur.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPROFILACHETEUR() {
            return profilacheteur;
        }

        /**
         * Définit la valeur de la propriété profilacheteur.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPROFILACHETEUR(Object value) {
            this.profilacheteur = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;element name="STANDARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="MISE_EN_CONCURRENCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "standard",
        "miseenconcurrence"
    })
    public static class QUALIFICATION {

        @XmlElement(name = "STANDARD")
        protected Object standard;
        @XmlElement(name = "MISE_EN_CONCURRENCE")
        protected Object miseenconcurrence;

        /**
         * Obtient la valeur de la propriété standard.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTANDARD() {
            return standard;
        }

        /**
         * Définit la valeur de la propriété standard.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTANDARD(Object value) {
            this.standard = value;
        }

        /**
         * Obtient la valeur de la propriété miseenconcurrence.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMISEENCONCURRENCE() {
            return miseenconcurrence;
        }

        /**
         * Définit la valeur de la propriété miseenconcurrence.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMISEENCONCURRENCE(Object value) {
            this.miseenconcurrence = value;
        }

    }

}
