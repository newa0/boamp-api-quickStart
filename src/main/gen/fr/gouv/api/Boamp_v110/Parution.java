//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Parution complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Parution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ANNONCE" type="{}Annonce"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nompublication" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dateparution" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numparution" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parution", propOrder = {
    "annonce"
})
public class Parution {

    @XmlElement(name = "ANNONCE", required = true)
    protected Annonce annonce;
    @XmlAttribute(name = "nompublication", required = true)
    protected String nompublication;
    @XmlAttribute(name = "dateparution", required = true)
    protected String dateparution;
    @XmlAttribute(name = "numparution", required = true)
    protected String numparution;

    /**
     * Obtient la valeur de la propriété annonce.
     * 
     * @return
     *     possible object is
     *     {@link Annonce }
     *     
     */
    public Annonce getANNONCE() {
        return annonce;
    }

    /**
     * Définit la valeur de la propriété annonce.
     * 
     * @param value
     *     allowed object is
     *     {@link Annonce }
     *     
     */
    public void setANNONCE(Annonce value) {
        this.annonce = value;
    }

    /**
     * Obtient la valeur de la propriété nompublication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNompublication() {
        return nompublication;
    }

    /**
     * Définit la valeur de la propriété nompublication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNompublication(String value) {
        this.nompublication = value;
    }

    /**
     * Obtient la valeur de la propriété dateparution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateparution() {
        return dateparution;
    }

    /**
     * Définit la valeur de la propriété dateparution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateparution(String value) {
        this.dateparution = value;
    }

    /**
     * Obtient la valeur de la propriété numparution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumparution() {
        return numparution;
    }

    /**
     * Définit la valeur de la propriété numparution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumparution(String value) {
        this.numparution = value;
    }

}
