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
 * <p>Classe Java pour MarcheType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MarcheType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TRAVAUX" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all minOccurs="0"&gt;
 *                   &lt;element name="EXECUTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CONCEPT_REALISATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="EXECUTION_OUVRAGE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FOURNITURES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all minOccurs="0"&gt;
 *                   &lt;element name="ACHAT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CREDIT_BAIL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="LOC_VENTE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSIEURS_FORMES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SERVICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarcheType", propOrder = {

})
public class MarcheType {

    @XmlElement(name = "TRAVAUX")
    protected MarcheType.TRAVAUX travaux;
    @XmlElement(name = "FOURNITURES")
    protected MarcheType.FOURNITURES fournitures;
    @XmlElement(name = "SERVICE")
    protected String service;

    /**
     * Obtient la valeur de la propriété travaux.
     * 
     * @return
     *     possible object is
     *     {@link MarcheType.TRAVAUX }
     *     
     */
    public MarcheType.TRAVAUX getTRAVAUX() {
        return travaux;
    }

    /**
     * Définit la valeur de la propriété travaux.
     * 
     * @param value
     *     allowed object is
     *     {@link MarcheType.TRAVAUX }
     *     
     */
    public void setTRAVAUX(MarcheType.TRAVAUX value) {
        this.travaux = value;
    }

    /**
     * Obtient la valeur de la propriété fournitures.
     * 
     * @return
     *     possible object is
     *     {@link MarcheType.FOURNITURES }
     *     
     */
    public MarcheType.FOURNITURES getFOURNITURES() {
        return fournitures;
    }

    /**
     * Définit la valeur de la propriété fournitures.
     * 
     * @param value
     *     allowed object is
     *     {@link MarcheType.FOURNITURES }
     *     
     */
    public void setFOURNITURES(MarcheType.FOURNITURES value) {
        this.fournitures = value;
    }

    /**
     * Obtient la valeur de la propriété service.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICE() {
        return service;
    }

    /**
     * Définit la valeur de la propriété service.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICE(String value) {
        this.service = value;
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
     *       &lt;all minOccurs="0"&gt;
     *         &lt;element name="ACHAT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CREDIT_BAIL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LOC_VENTE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PLUSIEURS_FORMES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class FOURNITURES {

        @XmlElement(name = "ACHAT")
        protected Object achat;
        @XmlElement(name = "LOC")
        protected Object loc;
        @XmlElement(name = "CREDIT_BAIL")
        protected Object creditbail;
        @XmlElement(name = "LOC_VENTE")
        protected Object locvente;
        @XmlElement(name = "PLUSIEURS_FORMES")
        protected Object plusieursformes;

        /**
         * Obtient la valeur de la propriété achat.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getACHAT() {
            return achat;
        }

        /**
         * Définit la valeur de la propriété achat.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setACHAT(Object value) {
            this.achat = value;
        }

        /**
         * Obtient la valeur de la propriété loc.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLOC() {
            return loc;
        }

        /**
         * Définit la valeur de la propriété loc.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLOC(Object value) {
            this.loc = value;
        }

        /**
         * Obtient la valeur de la propriété creditbail.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCREDITBAIL() {
            return creditbail;
        }

        /**
         * Définit la valeur de la propriété creditbail.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCREDITBAIL(Object value) {
            this.creditbail = value;
        }

        /**
         * Obtient la valeur de la propriété locvente.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLOCVENTE() {
            return locvente;
        }

        /**
         * Définit la valeur de la propriété locvente.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLOCVENTE(Object value) {
            this.locvente = value;
        }

        /**
         * Obtient la valeur de la propriété plusieursformes.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPLUSIEURSFORMES() {
            return plusieursformes;
        }

        /**
         * Définit la valeur de la propriété plusieursformes.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPLUSIEURSFORMES(Object value) {
            this.plusieursformes = value;
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
     *       &lt;all minOccurs="0"&gt;
     *         &lt;element name="EXECUTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CONCEPT_REALISATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="EXECUTION_OUVRAGE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class TRAVAUX {

        @XmlElement(name = "EXECUTION")
        protected Object execution;
        @XmlElement(name = "CONCEPT_REALISATION")
        protected Object conceptrealisation;
        @XmlElement(name = "EXECUTION_OUVRAGE")
        protected Object executionouvrage;

        /**
         * Obtient la valeur de la propriété execution.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEXECUTION() {
            return execution;
        }

        /**
         * Définit la valeur de la propriété execution.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEXECUTION(Object value) {
            this.execution = value;
        }

        /**
         * Obtient la valeur de la propriété conceptrealisation.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCONCEPTREALISATION() {
            return conceptrealisation;
        }

        /**
         * Définit la valeur de la propriété conceptrealisation.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCONCEPTREALISATION(Object value) {
            this.conceptrealisation = value;
        }

        /**
         * Obtient la valeur de la propriété executionouvrage.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEXECUTIONOUVRAGE() {
            return executionouvrage;
        }

        /**
         * Définit la valeur de la propriété executionouvrage.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEXECUTIONOUVRAGE(Object value) {
            this.executionouvrage = value;
        }

    }

}
