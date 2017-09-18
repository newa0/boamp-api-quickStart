//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NbrCandidat complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NbrCandidat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NB_MAX_OFFRE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NB_MIN_OFFRE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NB_OFFRE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIMITATION_CANDIDATS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NbrCandidat", propOrder = {
    "nbmaxoffre",
    "nbminoffre",
    "nboffre",
    "limitationcandidats"
})
public class NbrCandidat {

    @XmlElement(name = "NB_MAX_OFFRE")
    protected BigInteger nbmaxoffre;
    @XmlElement(name = "NB_MIN_OFFRE")
    protected BigInteger nbminoffre;
    @XmlElement(name = "NB_OFFRE")
    protected BigInteger nboffre;
    @XmlElement(name = "LIMITATION_CANDIDATS")
    protected String limitationcandidats;

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

}
