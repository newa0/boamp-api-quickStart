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
 * <p>Classe Java pour Lot2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Lot2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUM_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOMENCLATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FOURNITURES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERVICES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRAVAUX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INFRUCTUEUX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SANS_SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="E_Q" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POSTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIME_ENVIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIME_ATT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES_RENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT_MINI_ANNUEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT_MAXI_ANNUEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANCHE_CONDITIONNELLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANCHE_FERME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_MOINS" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_PLUS" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES_INFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOUS_TRAITANCE" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_ATT_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_OFFRES_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_PARTICIPANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_PARTICIPANTS_ETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_ATT_MARCHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT_HT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT_INDEFINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION_VALEUR_S_TRAITEES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIME_ATTRIBUEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lot2", propOrder = {
    "titreAndNUMLOTAndNOMENCLATURE"
})
public class Lot2 {

    @XmlElementRefs({
        @XmlElementRef(name = "FOURNITURES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OFFRE_MOINS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MONTANT_INDEFINI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MONTANT_HT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_PARTICIPANTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_ATT_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FAX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRIME_ENVIS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TRANCHE_FERME", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PAYS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "E_Q", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TRANCHE_CONDITIONNELLE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES_INFO", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_OFFRES_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SANS_SUITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NOMENCLATURE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TRAVAUX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MONTANT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OFFRE_PLUS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SERVICES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CP", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRIME_ATT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_ATT_MARCHE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MONTANT_MINI_ANNUEL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MEL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DESCRIPTION_VALEUR_S_TRAITEES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TEL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MONTANT_MAXI_ANNUEL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VILLE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_PARTICIPANTS_ETR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NUM_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DESC", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ADRESSE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "POSTE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INFRUCTUEUX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NOM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_OFFRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES_RENS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SOUS_TRAITANCE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRIME_ATTRIBUEE", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> titreAndNUMLOTAndNOMENCLATURE;

    /**
     * Gets the value of the titreAndNUMLOTAndNOMENCLATURE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titreAndNUMLOTAndNOMENCLATURE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITREAndNUMLOTAndNOMENCLATURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Valeur }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Valeur }{@code >}
     * {@link JAXBElement }{@code <}{@link Valeur }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Valeur }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTITREAndNUMLOTAndNOMENCLATURE() {
        if (titreAndNUMLOTAndNOMENCLATURE == null) {
            titreAndNUMLOTAndNOMENCLATURE = new ArrayList<JAXBElement<?>>();
        }
        return this.titreAndNUMLOTAndNOMENCLATURE;
    }

}
