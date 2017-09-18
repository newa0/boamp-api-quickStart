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
 * <p>Classe Java pour Annulation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Annulation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ANNONCE_ANTERIEUR" type="{}AnnonceAnterieure"/&gt;
 *         &lt;element name="MOTIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annulation", propOrder = {
    "annonceanterieur",
    "motif"
})
public class Annulation {

    @XmlElement(name = "ANNONCE_ANTERIEUR", required = true)
    protected AnnonceAnterieure annonceanterieur;
    @XmlElement(name = "MOTIF")
    protected String motif;

    /**
     * Obtient la valeur de la propriété annonceanterieur.
     * 
     * @return
     *     possible object is
     *     {@link AnnonceAnterieure }
     *     
     */
    public AnnonceAnterieure getANNONCEANTERIEUR() {
        return annonceanterieur;
    }

    /**
     * Définit la valeur de la propriété annonceanterieur.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnonceAnterieure }
     *     
     */
    public void setANNONCEANTERIEUR(AnnonceAnterieure value) {
        this.annonceanterieur = value;
    }

    /**
     * Obtient la valeur de la propriété motif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIF() {
        return motif;
    }

    /**
     * Définit la valeur de la propriété motif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIF(String value) {
        this.motif = value;
    }

}
