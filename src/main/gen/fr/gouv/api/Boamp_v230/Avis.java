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
 * <p>Classe Java pour Avis complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Avis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FAMILLE" type="{}EnumFamille"/&gt;
 *         &lt;element name="PERIMETRE" type="{}EnumPerimetre"/&gt;
 *         &lt;element name="NATURE" type="{}EnumNature"/&gt;
 *         &lt;element name="STATUT" type="{}EnumStatut" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Avis", propOrder = {
    "famille",
    "perimetre",
    "nature",
    "statut"
})
public class Avis {

    @XmlElement(name = "FAMILLE", required = true)
    protected EnumFamille famille;
    @XmlElement(name = "PERIMETRE", required = true)
    protected EnumPerimetre perimetre;
    @XmlElement(name = "NATURE", required = true)
    protected EnumNature nature;
    @XmlElement(name = "STATUT")
    protected EnumStatut statut;

    /**
     * Obtient la valeur de la propriété famille.
     * 
     * @return
     *     possible object is
     *     {@link EnumFamille }
     *     
     */
    public EnumFamille getFAMILLE() {
        return famille;
    }

    /**
     * Définit la valeur de la propriété famille.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumFamille }
     *     
     */
    public void setFAMILLE(EnumFamille value) {
        this.famille = value;
    }

    /**
     * Obtient la valeur de la propriété perimetre.
     * 
     * @return
     *     possible object is
     *     {@link EnumPerimetre }
     *     
     */
    public EnumPerimetre getPERIMETRE() {
        return perimetre;
    }

    /**
     * Définit la valeur de la propriété perimetre.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPerimetre }
     *     
     */
    public void setPERIMETRE(EnumPerimetre value) {
        this.perimetre = value;
    }

    /**
     * Obtient la valeur de la propriété nature.
     * 
     * @return
     *     possible object is
     *     {@link EnumNature }
     *     
     */
    public EnumNature getNATURE() {
        return nature;
    }

    /**
     * Définit la valeur de la propriété nature.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNature }
     *     
     */
    public void setNATURE(EnumNature value) {
        this.nature = value;
    }

    /**
     * Obtient la valeur de la propriété statut.
     * 
     * @return
     *     possible object is
     *     {@link EnumStatut }
     *     
     */
    public EnumStatut getSTATUT() {
        return statut;
    }

    /**
     * Définit la valeur de la propriété statut.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumStatut }
     *     
     */
    public void setSTATUT(EnumStatut value) {
        this.statut = value;
    }

}
