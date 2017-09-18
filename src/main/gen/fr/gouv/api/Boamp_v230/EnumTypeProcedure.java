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
 * <p>Classe Java pour EnumTypeProcedure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumTypeProcedure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OUVERT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="ACCELERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESTREINT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="ACCELERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NEGOCIE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="ACCELERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AVEC_PUB_PREALABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="SANS_PUB_PREALABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="SANS_MISE_EN_CONCURRENCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROCEDURE_ADAPTE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DIALOGUE_COMPETITIF" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="PARTENARIAT_INNOVATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CONCOURS_OUVERT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CONCOURS_RESTREINT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ATTRIBUE_SANS_PUB_JOUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ATTRIBUE_AVEC_PUB_JOUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
@XmlType(name = "EnumTypeProcedure", propOrder = {
    "ouvert",
    "restreint",
    "negocie",
    "procedureadapte",
    "dialoguecompetitif",
    "partenariatinnovation",
    "concoursouvert",
    "concoursrestreint",
    "attribuesanspubjoue",
    "attribueavecpubjoue",
    "autre"
})
public class EnumTypeProcedure {

    @XmlElement(name = "OUVERT")
    protected EnumTypeProcedure.OUVERT ouvert;
    @XmlElement(name = "RESTREINT")
    protected EnumTypeProcedure.RESTREINT restreint;
    @XmlElement(name = "NEGOCIE")
    protected EnumTypeProcedure.NEGOCIE negocie;
    @XmlElement(name = "PROCEDURE_ADAPTE")
    protected Object procedureadapte;
    @XmlElement(name = "DIALOGUE_COMPETITIF")
    protected Object dialoguecompetitif;
    @XmlElement(name = "PARTENARIAT_INNOVATION")
    protected Object partenariatinnovation;
    @XmlElement(name = "CONCOURS_OUVERT")
    protected Object concoursouvert;
    @XmlElement(name = "CONCOURS_RESTREINT")
    protected Object concoursrestreint;
    @XmlElement(name = "ATTRIBUE_SANS_PUB_JOUE")
    protected Object attribuesanspubjoue;
    @XmlElement(name = "ATTRIBUE_AVEC_PUB_JOUE")
    protected Object attribueavecpubjoue;
    @XmlElement(name = "AUTRE")
    protected String autre;

    /**
     * Obtient la valeur de la propriété ouvert.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeProcedure.OUVERT }
     *     
     */
    public EnumTypeProcedure.OUVERT getOUVERT() {
        return ouvert;
    }

    /**
     * Définit la valeur de la propriété ouvert.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeProcedure.OUVERT }
     *     
     */
    public void setOUVERT(EnumTypeProcedure.OUVERT value) {
        this.ouvert = value;
    }

    /**
     * Obtient la valeur de la propriété restreint.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeProcedure.RESTREINT }
     *     
     */
    public EnumTypeProcedure.RESTREINT getRESTREINT() {
        return restreint;
    }

    /**
     * Définit la valeur de la propriété restreint.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeProcedure.RESTREINT }
     *     
     */
    public void setRESTREINT(EnumTypeProcedure.RESTREINT value) {
        this.restreint = value;
    }

    /**
     * Obtient la valeur de la propriété negocie.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeProcedure.NEGOCIE }
     *     
     */
    public EnumTypeProcedure.NEGOCIE getNEGOCIE() {
        return negocie;
    }

    /**
     * Définit la valeur de la propriété negocie.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeProcedure.NEGOCIE }
     *     
     */
    public void setNEGOCIE(EnumTypeProcedure.NEGOCIE value) {
        this.negocie = value;
    }

    /**
     * Obtient la valeur de la propriété procedureadapte.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPROCEDUREADAPTE() {
        return procedureadapte;
    }

    /**
     * Définit la valeur de la propriété procedureadapte.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPROCEDUREADAPTE(Object value) {
        this.procedureadapte = value;
    }

    /**
     * Obtient la valeur de la propriété dialoguecompetitif.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIALOGUECOMPETITIF() {
        return dialoguecompetitif;
    }

    /**
     * Définit la valeur de la propriété dialoguecompetitif.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIALOGUECOMPETITIF(Object value) {
        this.dialoguecompetitif = value;
    }

    /**
     * Obtient la valeur de la propriété partenariatinnovation.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPARTENARIATINNOVATION() {
        return partenariatinnovation;
    }

    /**
     * Définit la valeur de la propriété partenariatinnovation.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPARTENARIATINNOVATION(Object value) {
        this.partenariatinnovation = value;
    }

    /**
     * Obtient la valeur de la propriété concoursouvert.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCONCOURSOUVERT() {
        return concoursouvert;
    }

    /**
     * Définit la valeur de la propriété concoursouvert.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCONCOURSOUVERT(Object value) {
        this.concoursouvert = value;
    }

    /**
     * Obtient la valeur de la propriété concoursrestreint.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCONCOURSRESTREINT() {
        return concoursrestreint;
    }

    /**
     * Définit la valeur de la propriété concoursrestreint.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCONCOURSRESTREINT(Object value) {
        this.concoursrestreint = value;
    }

    /**
     * Obtient la valeur de la propriété attribuesanspubjoue.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getATTRIBUESANSPUBJOUE() {
        return attribuesanspubjoue;
    }

    /**
     * Définit la valeur de la propriété attribuesanspubjoue.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setATTRIBUESANSPUBJOUE(Object value) {
        this.attribuesanspubjoue = value;
    }

    /**
     * Obtient la valeur de la propriété attribueavecpubjoue.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getATTRIBUEAVECPUBJOUE() {
        return attribueavecpubjoue;
    }

    /**
     * Définit la valeur de la propriété attribueavecpubjoue.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setATTRIBUEAVECPUBJOUE(Object value) {
        this.attribueavecpubjoue = value;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="ACCELERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AVEC_PUB_PREALABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="SANS_PUB_PREALABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="SANS_MISE_EN_CONCURRENCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accelere",
        "avecpubprealable",
        "sanspubprealable",
        "sansmiseenconcurrence"
    })
    public static class NEGOCIE {

        @XmlElement(name = "ACCELERE")
        protected String accelere;
        @XmlElement(name = "AVEC_PUB_PREALABLE")
        protected Object avecpubprealable;
        @XmlElement(name = "SANS_PUB_PREALABLE")
        protected Object sanspubprealable;
        @XmlElement(name = "SANS_MISE_EN_CONCURRENCE")
        protected Object sansmiseenconcurrence;

        /**
         * Obtient la valeur de la propriété accelere.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCELERE() {
            return accelere;
        }

        /**
         * Définit la valeur de la propriété accelere.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCELERE(String value) {
            this.accelere = value;
        }

        /**
         * Obtient la valeur de la propriété avecpubprealable.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAVECPUBPREALABLE() {
            return avecpubprealable;
        }

        /**
         * Définit la valeur de la propriété avecpubprealable.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAVECPUBPREALABLE(Object value) {
            this.avecpubprealable = value;
        }

        /**
         * Obtient la valeur de la propriété sanspubprealable.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSANSPUBPREALABLE() {
            return sanspubprealable;
        }

        /**
         * Définit la valeur de la propriété sanspubprealable.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSANSPUBPREALABLE(Object value) {
            this.sanspubprealable = value;
        }

        /**
         * Obtient la valeur de la propriété sansmiseenconcurrence.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSANSMISEENCONCURRENCE() {
            return sansmiseenconcurrence;
        }

        /**
         * Définit la valeur de la propriété sansmiseenconcurrence.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSANSMISEENCONCURRENCE(Object value) {
            this.sansmiseenconcurrence = value;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="ACCELERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accelere"
    })
    public static class OUVERT {

        @XmlElement(name = "ACCELERE")
        protected String accelere;

        /**
         * Obtient la valeur de la propriété accelere.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCELERE() {
            return accelere;
        }

        /**
         * Définit la valeur de la propriété accelere.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCELERE(String value) {
            this.accelere = value;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="ACCELERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accelere"
    })
    public static class RESTREINT {

        @XmlElement(name = "ACCELERE")
        protected String accelere;

        /**
         * Obtient la valeur de la propriété accelere.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCELERE() {
            return accelere;
        }

        /**
         * Définit la valeur de la propriété accelere.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCELERE(String value) {
            this.accelere = value;
        }

    }

}
