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
 * <p>Classe Java pour AnnexeD2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnnexeD2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="INFRUCTUEUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="RECHERCHE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element name="RAISONS_TECHNIQUES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *               &lt;element name="RAISONS_ARTISTIQUES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *               &lt;element name="PROPRIETE_INTELLECTUELLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element name="URGENCE_IMPERIEUSE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="MARCHE_COMPLEMENTAIRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="PRESTATIONS_IDENTIQUES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="LAUREATS_CONCOURS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="MATIERES_PREMIERES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element name="CESSATION_ACTIVITE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *               &lt;element name="LIQUIDATEURS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element name="ACHAT_OPPORTUNITE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="HORS_SCOPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="EXPLICATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnexeD2", propOrder = {
    "infructueux",
    "recherche",
    "raisonstechniques",
    "raisonsartistiques",
    "proprieteintellectuelle",
    "urgenceimperieuse",
    "marchecomplementaire",
    "prestationsidentiques",
    "laureatsconcours",
    "matierespremieres",
    "cessationactivite",
    "liquidateurs",
    "achatopportunite",
    "horsscope",
    "explication"
})
public class AnnexeD2 {

    @XmlElement(name = "INFRUCTUEUX")
    protected Object infructueux;
    @XmlElement(name = "RECHERCHE")
    protected Object recherche;
    @XmlElement(name = "RAISONS_TECHNIQUES")
    protected Object raisonstechniques;
    @XmlElement(name = "RAISONS_ARTISTIQUES")
    protected Object raisonsartistiques;
    @XmlElement(name = "PROPRIETE_INTELLECTUELLE")
    protected Object proprieteintellectuelle;
    @XmlElement(name = "URGENCE_IMPERIEUSE")
    protected Object urgenceimperieuse;
    @XmlElement(name = "MARCHE_COMPLEMENTAIRE")
    protected Object marchecomplementaire;
    @XmlElement(name = "PRESTATIONS_IDENTIQUES")
    protected Object prestationsidentiques;
    @XmlElement(name = "LAUREATS_CONCOURS")
    protected Object laureatsconcours;
    @XmlElement(name = "MATIERES_PREMIERES")
    protected Object matierespremieres;
    @XmlElement(name = "CESSATION_ACTIVITE")
    protected Object cessationactivite;
    @XmlElement(name = "LIQUIDATEURS")
    protected Object liquidateurs;
    @XmlElement(name = "ACHAT_OPPORTUNITE")
    protected Object achatopportunite;
    @XmlElement(name = "HORS_SCOPE")
    protected Object horsscope;
    @XmlElement(name = "EXPLICATION")
    protected Object explication;

    /**
     * Obtient la valeur de la propriété infructueux.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINFRUCTUEUX() {
        return infructueux;
    }

    /**
     * Définit la valeur de la propriété infructueux.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINFRUCTUEUX(Object value) {
        this.infructueux = value;
    }

    /**
     * Obtient la valeur de la propriété recherche.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRECHERCHE() {
        return recherche;
    }

    /**
     * Définit la valeur de la propriété recherche.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRECHERCHE(Object value) {
        this.recherche = value;
    }

    /**
     * Obtient la valeur de la propriété raisonstechniques.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRAISONSTECHNIQUES() {
        return raisonstechniques;
    }

    /**
     * Définit la valeur de la propriété raisonstechniques.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRAISONSTECHNIQUES(Object value) {
        this.raisonstechniques = value;
    }

    /**
     * Obtient la valeur de la propriété raisonsartistiques.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRAISONSARTISTIQUES() {
        return raisonsartistiques;
    }

    /**
     * Définit la valeur de la propriété raisonsartistiques.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRAISONSARTISTIQUES(Object value) {
        this.raisonsartistiques = value;
    }

    /**
     * Obtient la valeur de la propriété proprieteintellectuelle.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPROPRIETEINTELLECTUELLE() {
        return proprieteintellectuelle;
    }

    /**
     * Définit la valeur de la propriété proprieteintellectuelle.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPROPRIETEINTELLECTUELLE(Object value) {
        this.proprieteintellectuelle = value;
    }

    /**
     * Obtient la valeur de la propriété urgenceimperieuse.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getURGENCEIMPERIEUSE() {
        return urgenceimperieuse;
    }

    /**
     * Définit la valeur de la propriété urgenceimperieuse.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setURGENCEIMPERIEUSE(Object value) {
        this.urgenceimperieuse = value;
    }

    /**
     * Obtient la valeur de la propriété marchecomplementaire.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMARCHECOMPLEMENTAIRE() {
        return marchecomplementaire;
    }

    /**
     * Définit la valeur de la propriété marchecomplementaire.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMARCHECOMPLEMENTAIRE(Object value) {
        this.marchecomplementaire = value;
    }

    /**
     * Obtient la valeur de la propriété prestationsidentiques.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPRESTATIONSIDENTIQUES() {
        return prestationsidentiques;
    }

    /**
     * Définit la valeur de la propriété prestationsidentiques.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPRESTATIONSIDENTIQUES(Object value) {
        this.prestationsidentiques = value;
    }

    /**
     * Obtient la valeur de la propriété laureatsconcours.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLAUREATSCONCOURS() {
        return laureatsconcours;
    }

    /**
     * Définit la valeur de la propriété laureatsconcours.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLAUREATSCONCOURS(Object value) {
        this.laureatsconcours = value;
    }

    /**
     * Obtient la valeur de la propriété matierespremieres.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMATIERESPREMIERES() {
        return matierespremieres;
    }

    /**
     * Définit la valeur de la propriété matierespremieres.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMATIERESPREMIERES(Object value) {
        this.matierespremieres = value;
    }

    /**
     * Obtient la valeur de la propriété cessationactivite.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCESSATIONACTIVITE() {
        return cessationactivite;
    }

    /**
     * Définit la valeur de la propriété cessationactivite.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCESSATIONACTIVITE(Object value) {
        this.cessationactivite = value;
    }

    /**
     * Obtient la valeur de la propriété liquidateurs.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLIQUIDATEURS() {
        return liquidateurs;
    }

    /**
     * Définit la valeur de la propriété liquidateurs.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLIQUIDATEURS(Object value) {
        this.liquidateurs = value;
    }

    /**
     * Obtient la valeur de la propriété achatopportunite.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getACHATOPPORTUNITE() {
        return achatopportunite;
    }

    /**
     * Définit la valeur de la propriété achatopportunite.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setACHATOPPORTUNITE(Object value) {
        this.achatopportunite = value;
    }

    /**
     * Obtient la valeur de la propriété horsscope.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHORSSCOPE() {
        return horsscope;
    }

    /**
     * Définit la valeur de la propriété horsscope.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHORSSCOPE(Object value) {
        this.horsscope = value;
    }

    /**
     * Obtient la valeur de la propriété explication.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEXPLICATION() {
        return explication;
    }

    /**
     * Définit la valeur de la propriété explication.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEXPLICATION(Object value) {
        this.explication = value;
    }

}
