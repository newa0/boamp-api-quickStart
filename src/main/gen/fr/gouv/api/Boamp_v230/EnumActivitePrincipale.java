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
 * <p>Classe Java pour EnumActivitePrincipale complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumActivitePrincipale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="POUVOIR_ADJUDICATEUR" type="{}EnumAdjudication"/&gt;
 *         &lt;element name="ENTITE_ADJUDICATRICE" type="{}EnumEntiteAdjudicatrice"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumActivitePrincipale", propOrder = {
    "pouvoiradjudicateur",
    "entiteadjudicatrice"
})
public class EnumActivitePrincipale {

    @XmlElement(name = "POUVOIR_ADJUDICATEUR")
    protected EnumAdjudication pouvoiradjudicateur;
    @XmlElement(name = "ENTITE_ADJUDICATRICE")
    protected EnumEntiteAdjudicatrice entiteadjudicatrice;

    /**
     * Obtient la valeur de la propriété pouvoiradjudicateur.
     * 
     * @return
     *     possible object is
     *     {@link EnumAdjudication }
     *     
     */
    public EnumAdjudication getPOUVOIRADJUDICATEUR() {
        return pouvoiradjudicateur;
    }

    /**
     * Définit la valeur de la propriété pouvoiradjudicateur.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAdjudication }
     *     
     */
    public void setPOUVOIRADJUDICATEUR(EnumAdjudication value) {
        this.pouvoiradjudicateur = value;
    }

    /**
     * Obtient la valeur de la propriété entiteadjudicatrice.
     * 
     * @return
     *     possible object is
     *     {@link EnumEntiteAdjudicatrice }
     *     
     */
    public EnumEntiteAdjudicatrice getENTITEADJUDICATRICE() {
        return entiteadjudicatrice;
    }

    /**
     * Définit la valeur de la propriété entiteadjudicatrice.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumEntiteAdjudicatrice }
     *     
     */
    public void setENTITEADJUDICATRICE(EnumEntiteAdjudicatrice value) {
        this.entiteadjudicatrice = value;
    }

}
