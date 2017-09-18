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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ComplementInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ComplementInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="COMMANDE_ELECTRONIQUE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="COMMANDE_ELECTRONIQUE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="FACTURATION_ELECTRONIQUE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="FACTURATION_ELECTRONIQUE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="PAIEMENT_ELECTRONIQUE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="PAIEMENT_ELECTRONIQUE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="RENS_COMPLEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROCEDURES_RECOURS_PRECISIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADRESSES_COMPLEMENTAIRES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ADRESSE" type="{}Adresse" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ComplementInformation", propOrder = {
    "commandeelectroniqueoui",
    "commandeelectroniquenon",
    "facturationelectroniqueoui",
    "facturationelectroniquenon",
    "paiementelectroniqueoui",
    "paiementelectroniquenon",
    "renscomplement",
    "proceduresrecoursprecisions",
    "adressescomplementaires"
})
public class ComplementInformation {

    @XmlElement(name = "COMMANDE_ELECTRONIQUE_OUI")
    protected Object commandeelectroniqueoui;
    @XmlElement(name = "COMMANDE_ELECTRONIQUE_NON")
    protected Object commandeelectroniquenon;
    @XmlElement(name = "FACTURATION_ELECTRONIQUE_OUI")
    protected Object facturationelectroniqueoui;
    @XmlElement(name = "FACTURATION_ELECTRONIQUE_NON")
    protected Object facturationelectroniquenon;
    @XmlElement(name = "PAIEMENT_ELECTRONIQUE_OUI")
    protected Object paiementelectroniqueoui;
    @XmlElement(name = "PAIEMENT_ELECTRONIQUE_NON")
    protected Object paiementelectroniquenon;
    @XmlElement(name = "RENS_COMPLEMENT")
    protected String renscomplement;
    @XmlElement(name = "PROCEDURES_RECOURS_PRECISIONS")
    protected String proceduresrecoursprecisions;
    @XmlElement(name = "ADRESSES_COMPLEMENTAIRES")
    protected ComplementInformation.ADRESSESCOMPLEMENTAIRES adressescomplementaires;

    /**
     * Obtient la valeur de la propriété commandeelectroniqueoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOMMANDEELECTRONIQUEOUI() {
        return commandeelectroniqueoui;
    }

    /**
     * Définit la valeur de la propriété commandeelectroniqueoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOMMANDEELECTRONIQUEOUI(Object value) {
        this.commandeelectroniqueoui = value;
    }

    /**
     * Obtient la valeur de la propriété commandeelectroniquenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOMMANDEELECTRONIQUENON() {
        return commandeelectroniquenon;
    }

    /**
     * Définit la valeur de la propriété commandeelectroniquenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOMMANDEELECTRONIQUENON(Object value) {
        this.commandeelectroniquenon = value;
    }

    /**
     * Obtient la valeur de la propriété facturationelectroniqueoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFACTURATIONELECTRONIQUEOUI() {
        return facturationelectroniqueoui;
    }

    /**
     * Définit la valeur de la propriété facturationelectroniqueoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFACTURATIONELECTRONIQUEOUI(Object value) {
        this.facturationelectroniqueoui = value;
    }

    /**
     * Obtient la valeur de la propriété facturationelectroniquenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFACTURATIONELECTRONIQUENON() {
        return facturationelectroniquenon;
    }

    /**
     * Définit la valeur de la propriété facturationelectroniquenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFACTURATIONELECTRONIQUENON(Object value) {
        this.facturationelectroniquenon = value;
    }

    /**
     * Obtient la valeur de la propriété paiementelectroniqueoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPAIEMENTELECTRONIQUEOUI() {
        return paiementelectroniqueoui;
    }

    /**
     * Définit la valeur de la propriété paiementelectroniqueoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPAIEMENTELECTRONIQUEOUI(Object value) {
        this.paiementelectroniqueoui = value;
    }

    /**
     * Obtient la valeur de la propriété paiementelectroniquenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPAIEMENTELECTRONIQUENON() {
        return paiementelectroniquenon;
    }

    /**
     * Définit la valeur de la propriété paiementelectroniquenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPAIEMENTELECTRONIQUENON(Object value) {
        this.paiementelectroniquenon = value;
    }

    /**
     * Obtient la valeur de la propriété renscomplement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRENSCOMPLEMENT() {
        return renscomplement;
    }

    /**
     * Définit la valeur de la propriété renscomplement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRENSCOMPLEMENT(String value) {
        this.renscomplement = value;
    }

    /**
     * Obtient la valeur de la propriété proceduresrecoursprecisions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCEDURESRECOURSPRECISIONS() {
        return proceduresrecoursprecisions;
    }

    /**
     * Définit la valeur de la propriété proceduresrecoursprecisions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCEDURESRECOURSPRECISIONS(String value) {
        this.proceduresrecoursprecisions = value;
    }

    /**
     * Obtient la valeur de la propriété adressescomplementaires.
     * 
     * @return
     *     possible object is
     *     {@link ComplementInformation.ADRESSESCOMPLEMENTAIRES }
     *     
     */
    public ComplementInformation.ADRESSESCOMPLEMENTAIRES getADRESSESCOMPLEMENTAIRES() {
        return adressescomplementaires;
    }

    /**
     * Définit la valeur de la propriété adressescomplementaires.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementInformation.ADRESSESCOMPLEMENTAIRES }
     *     
     */
    public void setADRESSESCOMPLEMENTAIRES(ComplementInformation.ADRESSESCOMPLEMENTAIRES value) {
        this.adressescomplementaires = value;
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
     *         &lt;element name="ADRESSE" type="{}Adresse" maxOccurs="unbounded"/&gt;
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
        "adresse"
    })
    public static class ADRESSESCOMPLEMENTAIRES {

        @XmlElement(name = "ADRESSE", required = true)
        protected List<Adresse> adresse;

        /**
         * Gets the value of the adresse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adresse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getADRESSE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Adresse }
         * 
         * 
         */
        public List<Adresse> getADRESSE() {
            if (adresse == null) {
                adresse = new ArrayList<Adresse>();
            }
            return this.adresse;
        }

    }

}
