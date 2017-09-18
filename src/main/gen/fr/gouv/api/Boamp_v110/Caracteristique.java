//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Caracteristique complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Caracteristique"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UNIQUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="estVariant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VARIANTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QUANTITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OPTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CALENDRIER_OPTIONS_MOIS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CALENDRIER_OPTIONS_JOURS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NB_RECONDUCTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_RECONDUCTIONS_MIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_RECONDUCTIONS_MAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CALENDRIER_MOIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CALENDRIER_JOURS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DIRECTIVE_2004_17" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DIRECTIVE_2004_18" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CALENDRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DIV_EN_LOTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_UN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_PLUSIEURS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_TOUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VARIANTE_LOTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ESTIMATION_VALEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ESTIMATION_VALEUR_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ESTIMATION_VALEUR_MAXI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES_INFOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AVIS_PERIODIQUE_INDICATIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SYSTEME_QUALIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Caracteristique", propOrder = {
    "titreAndUNIQUEAndEstVariant"
})
public class Caracteristique {

    @XmlElementRefs({
        @XmlElementRef(name = "OPTIONS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CALENDRIER_OPTIONS_JOURS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DIRECTIVE_2004_18", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OFFRE_UN", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VARIANTE_LOTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ESTIMATION_VALEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VARIANTE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "estVariant", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AVIS_PERIODIQUE_INDICATIF", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SYSTEME_QUALIFICATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ESTIMATION_VALEUR_MINI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ESTIMATION_VALEUR_MAXI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES_INFOS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_RECONDUCTIONS_MIN", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_RECONDUCTIONS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OFFRE_PLUSIEURS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UNIQUE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CALENDRIER_OPTIONS_MOIS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_RECONDUCTIONS_MAX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QUANTITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DIRECTIVE_2004_17", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CALENDRIER_JOURS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AMP", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CALENDRIER", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DIV_EN_LOTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CALENDRIER_MOIS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OFFRE_TOUS", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> titreAndUNIQUEAndEstVariant;

    /**
     * Gets the value of the titreAndUNIQUEAndEstVariant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titreAndUNIQUEAndEstVariant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITREAndUNIQUEAndEstVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTITREAndUNIQUEAndEstVariant() {
        if (titreAndUNIQUEAndEstVariant == null) {
            titreAndUNIQUEAndEstVariant = new ArrayList<JAXBElement<?>>();
        }
        return this.titreAndUNIQUEAndEstVariant;
    }

}
