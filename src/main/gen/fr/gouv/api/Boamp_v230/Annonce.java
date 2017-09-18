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
 * <p>Classe Java pour Annonce complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Annonce"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GESTION" type="{}Gestion"/&gt;
 *         &lt;element name="DONNEES" type="{}Donnees"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annonce", propOrder = {
    "gestion",
    "donnees"
})
public class Annonce {

    @XmlElement(name = "GESTION", required = true)
    protected Gestion gestion;
    @XmlElement(name = "DONNEES", required = true)
    protected Donnees donnees;

    /**
     * Obtient la valeur de la propriété gestion.
     * 
     * @return
     *     possible object is
     *     {@link Gestion }
     *     
     */
    public Gestion getGESTION() {
        return gestion;
    }

    /**
     * Définit la valeur de la propriété gestion.
     * 
     * @param value
     *     allowed object is
     *     {@link Gestion }
     *     
     */
    public void setGESTION(Gestion value) {
        this.gestion = value;
    }

    /**
     * Obtient la valeur de la propriété donnees.
     * 
     * @return
     *     possible object is
     *     {@link Donnees }
     *     
     */
    public Donnees getDONNEES() {
        return donnees;
    }

    /**
     * Définit la valeur de la propriété donnees.
     * 
     * @param value
     *     allowed object is
     *     {@link Donnees }
     *     
     */
    public void setDONNEES(Donnees value) {
        this.donnees = value;
    }

}
