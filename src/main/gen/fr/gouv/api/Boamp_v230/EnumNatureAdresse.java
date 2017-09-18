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
 * <p>Classe Java pour EnumNatureAdresse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumNatureAdresse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AGIT_POUR_AUTRE_COMPTE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ADMIN_TECH" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ADMIN" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="TECH" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="RENSEIGNEMENTS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DOCUMENTS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ENVOYER_OFFRES" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="INSTANCE_RECOURS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ORGANE_MEDIATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="RENS_RECOURS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumNatureAdresse", propOrder = {
    "agitpourautrecompteoui",
    "admintech",
    "admin",
    "tech",
    "renseignements",
    "documents",
    "envoyeroffres",
    "instancerecours",
    "organemediation",
    "rensrecours"
})
public class EnumNatureAdresse {

    @XmlElement(name = "AGIT_POUR_AUTRE_COMPTE_OUI")
    protected Object agitpourautrecompteoui;
    @XmlElement(name = "ADMIN_TECH")
    protected Object admintech;
    @XmlElement(name = "ADMIN")
    protected Object admin;
    @XmlElement(name = "TECH")
    protected Object tech;
    @XmlElement(name = "RENSEIGNEMENTS")
    protected Object renseignements;
    @XmlElement(name = "DOCUMENTS")
    protected Object documents;
    @XmlElement(name = "ENVOYER_OFFRES")
    protected Object envoyeroffres;
    @XmlElement(name = "INSTANCE_RECOURS")
    protected Object instancerecours;
    @XmlElement(name = "ORGANE_MEDIATION")
    protected Object organemediation;
    @XmlElement(name = "RENS_RECOURS")
    protected Object rensrecours;

    /**
     * Obtient la valeur de la propriété agitpourautrecompteoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAGITPOURAUTRECOMPTEOUI() {
        return agitpourautrecompteoui;
    }

    /**
     * Définit la valeur de la propriété agitpourautrecompteoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAGITPOURAUTRECOMPTEOUI(Object value) {
        this.agitpourautrecompteoui = value;
    }

    /**
     * Obtient la valeur de la propriété admintech.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getADMINTECH() {
        return admintech;
    }

    /**
     * Définit la valeur de la propriété admintech.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setADMINTECH(Object value) {
        this.admintech = value;
    }

    /**
     * Obtient la valeur de la propriété admin.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getADMIN() {
        return admin;
    }

    /**
     * Définit la valeur de la propriété admin.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setADMIN(Object value) {
        this.admin = value;
    }

    /**
     * Obtient la valeur de la propriété tech.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTECH() {
        return tech;
    }

    /**
     * Définit la valeur de la propriété tech.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTECH(Object value) {
        this.tech = value;
    }

    /**
     * Obtient la valeur de la propriété renseignements.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRENSEIGNEMENTS() {
        return renseignements;
    }

    /**
     * Définit la valeur de la propriété renseignements.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRENSEIGNEMENTS(Object value) {
        this.renseignements = value;
    }

    /**
     * Obtient la valeur de la propriété documents.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDOCUMENTS() {
        return documents;
    }

    /**
     * Définit la valeur de la propriété documents.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDOCUMENTS(Object value) {
        this.documents = value;
    }

    /**
     * Obtient la valeur de la propriété envoyeroffres.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENVOYEROFFRES() {
        return envoyeroffres;
    }

    /**
     * Définit la valeur de la propriété envoyeroffres.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENVOYEROFFRES(Object value) {
        this.envoyeroffres = value;
    }

    /**
     * Obtient la valeur de la propriété instancerecours.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINSTANCERECOURS() {
        return instancerecours;
    }

    /**
     * Définit la valeur de la propriété instancerecours.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINSTANCERECOURS(Object value) {
        this.instancerecours = value;
    }

    /**
     * Obtient la valeur de la propriété organemediation.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getORGANEMEDIATION() {
        return organemediation;
    }

    /**
     * Définit la valeur de la propriété organemediation.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setORGANEMEDIATION(Object value) {
        this.organemediation = value;
    }

    /**
     * Obtient la valeur de la propriété rensrecours.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRENSRECOURS() {
        return rensrecours;
    }

    /**
     * Définit la valeur de la propriété rensrecours.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRENSRECOURS(Object value) {
        this.rensrecours = value;
    }

}
