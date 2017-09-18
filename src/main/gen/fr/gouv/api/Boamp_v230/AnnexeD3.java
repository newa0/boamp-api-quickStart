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
 * <p>Classe Java pour AnnexeD3 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnnexeD3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element name="INFRUCTUEUX_RESTREINTE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *               &lt;element name="INFRUCTUEUX_DIALOGUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *               &lt;element name="INFRUCTUEUX_NEGOCIEE_SS_PUB" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element name="AUTRE_SERVICE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="RECHERCHE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="OFFRES_IRREGULIERES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element name="RAISONS_TECHNIQUES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *               &lt;element name="PROPRIETE_INTELLECTUELLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element name="DELAIS_INCOMPATIBLES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="URGENCE_IMPERIEUSE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="MARCHE_COMPLEMENTAIRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="PRESTATIONS_IDENTIQUES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="MATIERES_PREMIERES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element name="CESSATION_ACTIVITE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *               &lt;element name="LIQUIDATEURS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element name="SERVICE_MARTIME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element name="HORS_SCOPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;element name="SERVICES_LISTES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *           &lt;/choice&gt;
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
@XmlType(name = "AnnexeD3", propOrder = {
    "infructueuxrestreinte",
    "infructueuxdialogue",
    "infructueuxnegocieesspub",
    "autreservice",
    "recherche",
    "offresirregulieres",
    "raisonstechniques",
    "proprieteintellectuelle",
    "delaisincompatibles",
    "urgenceimperieuse",
    "marchecomplementaire",
    "prestationsidentiques",
    "matierespremieres",
    "cessationactivite",
    "liquidateurs",
    "servicemartime",
    "horsscope",
    "serviceslistes",
    "explication"
})
public class AnnexeD3 {

    @XmlElement(name = "INFRUCTUEUX_RESTREINTE")
    protected Object infructueuxrestreinte;
    @XmlElement(name = "INFRUCTUEUX_DIALOGUE")
    protected Object infructueuxdialogue;
    @XmlElement(name = "INFRUCTUEUX_NEGOCIEE_SS_PUB")
    protected Object infructueuxnegocieesspub;
    @XmlElement(name = "AUTRE_SERVICE")
    protected Object autreservice;
    @XmlElement(name = "RECHERCHE")
    protected Object recherche;
    @XmlElement(name = "OFFRES_IRREGULIERES")
    protected Object offresirregulieres;
    @XmlElement(name = "RAISONS_TECHNIQUES")
    protected Object raisonstechniques;
    @XmlElement(name = "PROPRIETE_INTELLECTUELLE")
    protected Object proprieteintellectuelle;
    @XmlElement(name = "DELAIS_INCOMPATIBLES")
    protected Object delaisincompatibles;
    @XmlElement(name = "URGENCE_IMPERIEUSE")
    protected Object urgenceimperieuse;
    @XmlElement(name = "MARCHE_COMPLEMENTAIRE")
    protected Object marchecomplementaire;
    @XmlElement(name = "PRESTATIONS_IDENTIQUES")
    protected Object prestationsidentiques;
    @XmlElement(name = "MATIERES_PREMIERES")
    protected Object matierespremieres;
    @XmlElement(name = "CESSATION_ACTIVITE")
    protected Object cessationactivite;
    @XmlElement(name = "LIQUIDATEURS")
    protected Object liquidateurs;
    @XmlElement(name = "SERVICE_MARTIME")
    protected Object servicemartime;
    @XmlElement(name = "HORS_SCOPE")
    protected Object horsscope;
    @XmlElement(name = "SERVICES_LISTES")
    protected Object serviceslistes;
    @XmlElement(name = "EXPLICATION")
    protected Object explication;

    /**
     * Obtient la valeur de la propriété infructueuxrestreinte.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINFRUCTUEUXRESTREINTE() {
        return infructueuxrestreinte;
    }

    /**
     * Définit la valeur de la propriété infructueuxrestreinte.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINFRUCTUEUXRESTREINTE(Object value) {
        this.infructueuxrestreinte = value;
    }

    /**
     * Obtient la valeur de la propriété infructueuxdialogue.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINFRUCTUEUXDIALOGUE() {
        return infructueuxdialogue;
    }

    /**
     * Définit la valeur de la propriété infructueuxdialogue.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINFRUCTUEUXDIALOGUE(Object value) {
        this.infructueuxdialogue = value;
    }

    /**
     * Obtient la valeur de la propriété infructueuxnegocieesspub.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINFRUCTUEUXNEGOCIEESSPUB() {
        return infructueuxnegocieesspub;
    }

    /**
     * Définit la valeur de la propriété infructueuxnegocieesspub.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINFRUCTUEUXNEGOCIEESSPUB(Object value) {
        this.infructueuxnegocieesspub = value;
    }

    /**
     * Obtient la valeur de la propriété autreservice.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAUTRESERVICE() {
        return autreservice;
    }

    /**
     * Définit la valeur de la propriété autreservice.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAUTRESERVICE(Object value) {
        this.autreservice = value;
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
     * Obtient la valeur de la propriété offresirregulieres.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOFFRESIRREGULIERES() {
        return offresirregulieres;
    }

    /**
     * Définit la valeur de la propriété offresirregulieres.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOFFRESIRREGULIERES(Object value) {
        this.offresirregulieres = value;
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
     * Obtient la valeur de la propriété delaisincompatibles.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDELAISINCOMPATIBLES() {
        return delaisincompatibles;
    }

    /**
     * Définit la valeur de la propriété delaisincompatibles.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDELAISINCOMPATIBLES(Object value) {
        this.delaisincompatibles = value;
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
     * Obtient la valeur de la propriété servicemartime.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSERVICEMARTIME() {
        return servicemartime;
    }

    /**
     * Définit la valeur de la propriété servicemartime.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSERVICEMARTIME(Object value) {
        this.servicemartime = value;
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
     * Obtient la valeur de la propriété serviceslistes.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSERVICESLISTES() {
        return serviceslistes;
    }

    /**
     * Définit la valeur de la propriété serviceslistes.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSERVICESLISTES(Object value) {
        this.serviceslistes = value;
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
