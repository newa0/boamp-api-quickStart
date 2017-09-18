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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Reference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Reference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDWEB" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TYPE_AVIS" type="{}Avis"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", propOrder = {
    "idweb",
    "typeavis"
})
@XmlSeeAlso({
    fr.gouv.api.Boamp_v230.Marche.ANNONCEANTERIEUR.REFERENCE.class,
    ReferenceAnterieure.class
})
public class Reference {

    @XmlElement(name = "IDWEB", required = true)
    protected String idweb;
    @XmlElement(name = "TYPE_AVIS", required = true)
    protected Avis typeavis;

    /**
     * Obtient la valeur de la propriété idweb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDWEB() {
        return idweb;
    }

    /**
     * Définit la valeur de la propriété idweb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDWEB(String value) {
        this.idweb = value;
    }

    /**
     * Obtient la valeur de la propriété typeavis.
     * 
     * @return
     *     possible object is
     *     {@link Avis }
     *     
     */
    public Avis getTYPEAVIS() {
        return typeavis;
    }

    /**
     * Définit la valeur de la propriété typeavis.
     * 
     * @param value
     *     allowed object is
     *     {@link Avis }
     *     
     */
    public void setTYPEAVIS(Avis value) {
        this.typeavis = value;
    }

}
