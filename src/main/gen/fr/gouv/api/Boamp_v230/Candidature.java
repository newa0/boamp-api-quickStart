//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Candidature complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Candidature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NB_MAX_OFFRE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NB_MIN_OFFRE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NB_OFFRE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIMITATION_CANDIDATS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="CANDIDATS_DEJA_SELECTIONNES_OUI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="CANDIDATS_DEJA_SELECTIONNES_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="REDUCTION_PROGRESSIVE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="REDUCTION_PROGRESSIVE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="NOMS_PARTICIPANTS_SELECTIONNES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Candidature", propOrder = {
    "nbmaxoffre",
    "nbminoffre",
    "nboffre",
    "limitationcandidats",
    "candidatsdejaselectionnesoui",
    "candidatsdejaselectionnesnon",
    "reductionprogressiveoui",
    "reductionprogressivenon",
    "nomsparticipantsselectionnes"
})
public class Candidature {

    @XmlElement(name = "NB_MAX_OFFRE")
    protected BigInteger nbmaxoffre;
    @XmlElement(name = "NB_MIN_OFFRE")
    protected BigInteger nbminoffre;
    @XmlElement(name = "NB_OFFRE")
    protected BigInteger nboffre;
    @XmlElement(name = "LIMITATION_CANDIDATS")
    protected String limitationcandidats;
    @XmlElement(name = "CANDIDATS_DEJA_SELECTIONNES_OUI")
    protected String candidatsdejaselectionnesoui;
    @XmlElement(name = "CANDIDATS_DEJA_SELECTIONNES_NON")
    protected Object candidatsdejaselectionnesnon;
    @XmlElement(name = "REDUCTION_PROGRESSIVE_OUI")
    protected Object reductionprogressiveoui;
    @XmlElement(name = "REDUCTION_PROGRESSIVE_NON")
    protected Object reductionprogressivenon;
    @XmlElement(name = "NOMS_PARTICIPANTS_SELECTIONNES")
    protected List<String> nomsparticipantsselectionnes;

    /**
     * Obtient la valeur de la propriété nbmaxoffre.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBMAXOFFRE() {
        return nbmaxoffre;
    }

    /**
     * Définit la valeur de la propriété nbmaxoffre.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBMAXOFFRE(BigInteger value) {
        this.nbmaxoffre = value;
    }

    /**
     * Obtient la valeur de la propriété nbminoffre.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBMINOFFRE() {
        return nbminoffre;
    }

    /**
     * Définit la valeur de la propriété nbminoffre.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBMINOFFRE(BigInteger value) {
        this.nbminoffre = value;
    }

    /**
     * Obtient la valeur de la propriété nboffre.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBOFFRE() {
        return nboffre;
    }

    /**
     * Définit la valeur de la propriété nboffre.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBOFFRE(BigInteger value) {
        this.nboffre = value;
    }

    /**
     * Obtient la valeur de la propriété limitationcandidats.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIMITATIONCANDIDATS() {
        return limitationcandidats;
    }

    /**
     * Définit la valeur de la propriété limitationcandidats.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIMITATIONCANDIDATS(String value) {
        this.limitationcandidats = value;
    }

    /**
     * Obtient la valeur de la propriété candidatsdejaselectionnesoui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANDIDATSDEJASELECTIONNESOUI() {
        return candidatsdejaselectionnesoui;
    }

    /**
     * Définit la valeur de la propriété candidatsdejaselectionnesoui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANDIDATSDEJASELECTIONNESOUI(String value) {
        this.candidatsdejaselectionnesoui = value;
    }

    /**
     * Obtient la valeur de la propriété candidatsdejaselectionnesnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCANDIDATSDEJASELECTIONNESNON() {
        return candidatsdejaselectionnesnon;
    }

    /**
     * Définit la valeur de la propriété candidatsdejaselectionnesnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCANDIDATSDEJASELECTIONNESNON(Object value) {
        this.candidatsdejaselectionnesnon = value;
    }

    /**
     * Obtient la valeur de la propriété reductionprogressiveoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREDUCTIONPROGRESSIVEOUI() {
        return reductionprogressiveoui;
    }

    /**
     * Définit la valeur de la propriété reductionprogressiveoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREDUCTIONPROGRESSIVEOUI(Object value) {
        this.reductionprogressiveoui = value;
    }

    /**
     * Obtient la valeur de la propriété reductionprogressivenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREDUCTIONPROGRESSIVENON() {
        return reductionprogressivenon;
    }

    /**
     * Définit la valeur de la propriété reductionprogressivenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREDUCTIONPROGRESSIVENON(Object value) {
        this.reductionprogressivenon = value;
    }

    /**
     * Gets the value of the nomsparticipantsselectionnes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nomsparticipantsselectionnes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNOMSPARTICIPANTSSELECTIONNES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNOMSPARTICIPANTSSELECTIONNES() {
        if (nomsparticipantsselectionnes == null) {
            nomsparticipantsselectionnes = new ArrayList<String>();
        }
        return this.nomsparticipantsselectionnes;
    }

}
