//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour AccordCadre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AccordCadre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="PLUSIEURS_OPERATEURS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UN_SEUL_OPERATEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_PARTICIPANTS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NB_MAX_PARTICIPANTS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_AN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_MOIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SUP_QUATRE_ANS_JUSTIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *                 &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VALEUR_MIN" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *                 &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VALEUR_MAX" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *                 &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FREQUENCE_ET_VALEUR_DES_MARCHES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OUI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccordCadre", propOrder = {

})
public class AccordCadre {

    @XmlElement(name = "PLUSIEURS_OPERATEURS")
    protected String plusieursoperateurs;
    @XmlElement(name = "UN_SEUL_OPERATEUR")
    protected String unseuloperateur;
    @XmlElement(name = "NB_PARTICIPANTS")
    protected BigDecimal nbparticipants;
    @XmlElement(name = "NB_MAX_PARTICIPANTS")
    protected BigDecimal nbmaxparticipants;
    @XmlElement(name = "DUREE_AN")
    protected BigInteger dureean;
    @XmlElement(name = "DUREE_MOIS")
    protected BigDecimal dureemois;
    @XmlElement(name = "SUP_QUATRE_ANS_JUSTIFICATION")
    protected String supquatreansjustification;
    @XmlElement(name = "VALEUR")
    protected AccordCadre.VALEUR valeur;
    @XmlElement(name = "VALEUR_MIN")
    protected AccordCadre.VALEURMIN valeurmin;
    @XmlElement(name = "VALEUR_MAX")
    protected AccordCadre.VALEURMAX valeurmax;
    @XmlElement(name = "FREQUENCE_ET_VALEUR_DES_MARCHES")
    protected String frequenceetvaleurdesmarches;
    @XmlElement(name = "OUI")
    protected Object oui;
    @XmlElement(name = "NON")
    protected Object non;

    /**
     * Obtient la valeur de la propriété plusieursoperateurs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLUSIEURSOPERATEURS() {
        return plusieursoperateurs;
    }

    /**
     * Définit la valeur de la propriété plusieursoperateurs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLUSIEURSOPERATEURS(String value) {
        this.plusieursoperateurs = value;
    }

    /**
     * Obtient la valeur de la propriété unseuloperateur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNSEULOPERATEUR() {
        return unseuloperateur;
    }

    /**
     * Définit la valeur de la propriété unseuloperateur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNSEULOPERATEUR(String value) {
        this.unseuloperateur = value;
    }

    /**
     * Obtient la valeur de la propriété nbparticipants.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNBPARTICIPANTS() {
        return nbparticipants;
    }

    /**
     * Définit la valeur de la propriété nbparticipants.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNBPARTICIPANTS(BigDecimal value) {
        this.nbparticipants = value;
    }

    /**
     * Obtient la valeur de la propriété nbmaxparticipants.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNBMAXPARTICIPANTS() {
        return nbmaxparticipants;
    }

    /**
     * Définit la valeur de la propriété nbmaxparticipants.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNBMAXPARTICIPANTS(BigDecimal value) {
        this.nbmaxparticipants = value;
    }

    /**
     * Obtient la valeur de la propriété dureean.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDUREEAN() {
        return dureean;
    }

    /**
     * Définit la valeur de la propriété dureean.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDUREEAN(BigInteger value) {
        this.dureean = value;
    }

    /**
     * Obtient la valeur de la propriété dureemois.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDUREEMOIS() {
        return dureemois;
    }

    /**
     * Définit la valeur de la propriété dureemois.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDUREEMOIS(BigDecimal value) {
        this.dureemois = value;
    }

    /**
     * Obtient la valeur de la propriété supquatreansjustification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPQUATREANSJUSTIFICATION() {
        return supquatreansjustification;
    }

    /**
     * Définit la valeur de la propriété supquatreansjustification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPQUATREANSJUSTIFICATION(String value) {
        this.supquatreansjustification = value;
    }

    /**
     * Obtient la valeur de la propriété valeur.
     * 
     * @return
     *     possible object is
     *     {@link AccordCadre.VALEUR }
     *     
     */
    public AccordCadre.VALEUR getVALEUR() {
        return valeur;
    }

    /**
     * Définit la valeur de la propriété valeur.
     * 
     * @param value
     *     allowed object is
     *     {@link AccordCadre.VALEUR }
     *     
     */
    public void setVALEUR(AccordCadre.VALEUR value) {
        this.valeur = value;
    }

    /**
     * Obtient la valeur de la propriété valeurmin.
     * 
     * @return
     *     possible object is
     *     {@link AccordCadre.VALEURMIN }
     *     
     */
    public AccordCadre.VALEURMIN getVALEURMIN() {
        return valeurmin;
    }

    /**
     * Définit la valeur de la propriété valeurmin.
     * 
     * @param value
     *     allowed object is
     *     {@link AccordCadre.VALEURMIN }
     *     
     */
    public void setVALEURMIN(AccordCadre.VALEURMIN value) {
        this.valeurmin = value;
    }

    /**
     * Obtient la valeur de la propriété valeurmax.
     * 
     * @return
     *     possible object is
     *     {@link AccordCadre.VALEURMAX }
     *     
     */
    public AccordCadre.VALEURMAX getVALEURMAX() {
        return valeurmax;
    }

    /**
     * Définit la valeur de la propriété valeurmax.
     * 
     * @param value
     *     allowed object is
     *     {@link AccordCadre.VALEURMAX }
     *     
     */
    public void setVALEURMAX(AccordCadre.VALEURMAX value) {
        this.valeurmax = value;
    }

    /**
     * Obtient la valeur de la propriété frequenceetvaleurdesmarches.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREQUENCEETVALEURDESMARCHES() {
        return frequenceetvaleurdesmarches;
    }

    /**
     * Définit la valeur de la propriété frequenceetvaleurdesmarches.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREQUENCEETVALEURDESMARCHES(String value) {
        this.frequenceetvaleurdesmarches = value;
    }

    /**
     * Obtient la valeur de la propriété oui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOUI() {
        return oui;
    }

    /**
     * Définit la valeur de la propriété oui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOUI(Object value) {
        this.oui = value;
    }

    /**
     * Obtient la valeur de la propriété non.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNON() {
        return non;
    }

    /**
     * Définit la valeur de la propriété non.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNON(Object value) {
        this.non = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
     *       &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class VALEUR {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "DEVISE", required = true)
        protected String devise;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété devise.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEVISE() {
            return devise;
        }

        /**
         * Définit la valeur de la propriété devise.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEVISE(String value) {
            this.devise = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
     *       &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class VALEURMAX {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "DEVISE", required = true)
        protected String devise;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété devise.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEVISE() {
            return devise;
        }

        /**
         * Définit la valeur de la propriété devise.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEVISE(String value) {
            this.devise = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
     *       &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class VALEURMIN {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "DEVISE", required = true)
        protected String devise;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété devise.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEVISE() {
            return devise;
        }

        /**
         * Définit la valeur de la propriété devise.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEVISE(String value) {
            this.devise = value;
        }

    }

}
