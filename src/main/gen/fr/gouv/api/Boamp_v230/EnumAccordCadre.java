//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumAccordCadre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumAccordCadre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="PLUSIEURS_OPERATEURS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UN_SEUL_OPERATEUR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NB_MAX_PARTICIPANTS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SUP_QUATRE_ANS_JUSTIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumAccordCadre", propOrder = {

})
public class EnumAccordCadre {

    @XmlElement(name = "PLUSIEURS_OPERATEURS")
    protected Object plusieursoperateurs;
    @XmlElement(name = "UN_SEUL_OPERATEUR")
    protected Object unseuloperateur;
    @XmlElement(name = "NB_MAX_PARTICIPANTS")
    protected BigDecimal nbmaxparticipants;
    @XmlElement(name = "SUP_QUATRE_ANS_JUSTIFICATION")
    protected String supquatreansjustification;

    /**
     * Obtient la valeur de la propriété plusieursoperateurs.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPLUSIEURSOPERATEURS() {
        return plusieursoperateurs;
    }

    /**
     * Définit la valeur de la propriété plusieursoperateurs.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPLUSIEURSOPERATEURS(Object value) {
        this.plusieursoperateurs = value;
    }

    /**
     * Obtient la valeur de la propriété unseuloperateur.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUNSEULOPERATEUR() {
        return unseuloperateur;
    }

    /**
     * Définit la valeur de la propriété unseuloperateur.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUNSEULOPERATEUR(Object value) {
        this.unseuloperateur = value;
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

}
