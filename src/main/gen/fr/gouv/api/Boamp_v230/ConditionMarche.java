//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConditionMarche complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionMarche"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CAUTIONNEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FINANCEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FORME_JURIDIQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="PARTICIPATION_ELECTRONIQUE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="PARTICIPATION_ELECTRONIQUE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="AUTRES_CONDITIONS_PART_OUI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="AUTRES_CONDITIONS_PART_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="UNITE_MONETAIRE_EUR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FRANCAIS_SEUL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LANGUES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LANGUE" type="{}EnumLangue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionMarche", propOrder = {
    "cautionnement",
    "financement",
    "formejuridique",
    "participationelectroniqueoui",
    "participationelectroniquenon",
    "autresconditionspartoui",
    "autresconditionspartnon",
    "unitemonetaireeur",
    "francaisseul",
    "langues"
})
public class ConditionMarche {

    @XmlElement(name = "CAUTIONNEMENT")
    protected String cautionnement;
    @XmlElement(name = "FINANCEMENT")
    protected String financement;
    @XmlElement(name = "FORME_JURIDIQUE")
    protected String formejuridique;
    @XmlElement(name = "PARTICIPATION_ELECTRONIQUE_OUI")
    protected Object participationelectroniqueoui;
    @XmlElement(name = "PARTICIPATION_ELECTRONIQUE_NON")
    protected Object participationelectroniquenon;
    @XmlElement(name = "AUTRES_CONDITIONS_PART_OUI")
    protected String autresconditionspartoui;
    @XmlElement(name = "AUTRES_CONDITIONS_PART_NON")
    protected Object autresconditionspartnon;
    @XmlElement(name = "UNITE_MONETAIRE_EUR")
    protected Object unitemonetaireeur;
    @XmlElement(name = "FRANCAIS_SEUL")
    protected Object francaisseul;
    @XmlElement(name = "LANGUES")
    protected ConditionMarche.LANGUES langues;

    /**
     * Obtient la valeur de la propriété cautionnement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAUTIONNEMENT() {
        return cautionnement;
    }

    /**
     * Définit la valeur de la propriété cautionnement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAUTIONNEMENT(String value) {
        this.cautionnement = value;
    }

    /**
     * Obtient la valeur de la propriété financement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINANCEMENT() {
        return financement;
    }

    /**
     * Définit la valeur de la propriété financement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINANCEMENT(String value) {
        this.financement = value;
    }

    /**
     * Obtient la valeur de la propriété formejuridique.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMEJURIDIQUE() {
        return formejuridique;
    }

    /**
     * Définit la valeur de la propriété formejuridique.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMEJURIDIQUE(String value) {
        this.formejuridique = value;
    }

    /**
     * Obtient la valeur de la propriété participationelectroniqueoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPARTICIPATIONELECTRONIQUEOUI() {
        return participationelectroniqueoui;
    }

    /**
     * Définit la valeur de la propriété participationelectroniqueoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPARTICIPATIONELECTRONIQUEOUI(Object value) {
        this.participationelectroniqueoui = value;
    }

    /**
     * Obtient la valeur de la propriété participationelectroniquenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPARTICIPATIONELECTRONIQUENON() {
        return participationelectroniquenon;
    }

    /**
     * Définit la valeur de la propriété participationelectroniquenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPARTICIPATIONELECTRONIQUENON(Object value) {
        this.participationelectroniquenon = value;
    }

    /**
     * Obtient la valeur de la propriété autresconditionspartoui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTRESCONDITIONSPARTOUI() {
        return autresconditionspartoui;
    }

    /**
     * Définit la valeur de la propriété autresconditionspartoui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTRESCONDITIONSPARTOUI(String value) {
        this.autresconditionspartoui = value;
    }

    /**
     * Obtient la valeur de la propriété autresconditionspartnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAUTRESCONDITIONSPARTNON() {
        return autresconditionspartnon;
    }

    /**
     * Définit la valeur de la propriété autresconditionspartnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAUTRESCONDITIONSPARTNON(Object value) {
        this.autresconditionspartnon = value;
    }

    /**
     * Obtient la valeur de la propriété unitemonetaireeur.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUNITEMONETAIREEUR() {
        return unitemonetaireeur;
    }

    /**
     * Définit la valeur de la propriété unitemonetaireeur.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUNITEMONETAIREEUR(Object value) {
        this.unitemonetaireeur = value;
    }

    /**
     * Obtient la valeur de la propriété francaisseul.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFRANCAISSEUL() {
        return francaisseul;
    }

    /**
     * Définit la valeur de la propriété francaisseul.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFRANCAISSEUL(Object value) {
        this.francaisseul = value;
    }

    /**
     * Obtient la valeur de la propriété langues.
     * 
     * @return
     *     possible object is
     *     {@link ConditionMarche.LANGUES }
     *     
     */
    public ConditionMarche.LANGUES getLANGUES() {
        return langues;
    }

    /**
     * Définit la valeur de la propriété langues.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionMarche.LANGUES }
     *     
     */
    public void setLANGUES(ConditionMarche.LANGUES value) {
        this.langues = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="LANGUE" type="{}EnumLangue" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "langue",
        "autres"
    })
    public static class LANGUES {

        @XmlElement(name = "LANGUE")
        @XmlSchemaType(name = "token")
        protected List<EnumLangue> langue;
        @XmlElement(name = "AUTRES")
        protected String autres;

        /**
         * Gets the value of the langue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the langue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLANGUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EnumLangue }
         * 
         * 
         */
        public List<EnumLangue> getLANGUE() {
            if (langue == null) {
                langue = new ArrayList<EnumLangue>();
            }
            return this.langue;
        }

        /**
         * Obtient la valeur de la propriété autres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTRES() {
            return autres;
        }

        /**
         * Définit la valeur de la propriété autres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTRES(String value) {
            this.autres = value;
        }

    }

}
