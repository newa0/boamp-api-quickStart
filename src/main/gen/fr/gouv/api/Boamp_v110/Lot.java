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
 * <p>Classe Java pour Lot complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Lot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_MOINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_PLUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUM_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INTITULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOMENC_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OBJETS_COMPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FOURNITURE_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERVICES_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRAVAUX_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPV_OBJET_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPV_COMPL_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESC_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VOLUME_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXEC_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIVR_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COUT_ESTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COUT_ESTIME_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COUT_ESTIME_MAXI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_JOURS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_MOIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_DEBUT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DATE_FIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INFOS_COMPLEMENTAIRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INFRUCTUEUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SANS_SUITE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lot", propOrder = {
    "titreAndNOMAndADRESSE"
})
public class Lot {

    @XmlElementRefs({
        @XmlElementRef(name = "INFOS_COMPLEMENTAIRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EXEC_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SERVICES_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MONTANT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "COUT_ESTIME", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OFFRE_PLUS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NOM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LIVR_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_DEBUT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SANS_SUITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "COUT_ESTIME_MAXI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_FIN", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CPV_COMPL_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NOMENC_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OFFRE_MOINS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INTITULE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ADRESSE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CPV_OBJET_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VOLUME_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VILLE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "COUT_ESTIME_MINI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DESC_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OBJETS_COMPL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INFRUCTUEUX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TRAVAUX_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NUM_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CP", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DUREE_JOURS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FOURNITURE_LOT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DUREE_MOIS", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> titreAndNOMAndADRESSE;

    /**
     * Gets the value of the titreAndNOMAndADRESSE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titreAndNOMAndADRESSE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITREAndNOMAndADRESSE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
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
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTITREAndNOMAndADRESSE() {
        if (titreAndNOMAndADRESSE == null) {
            titreAndNOMAndADRESSE = new ArrayList<JAXBElement<?>>();
        }
        return this.titreAndNOMAndADRESSE;
    }

}
