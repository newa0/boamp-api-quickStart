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
 * <p>Classe Java pour Renseignement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Renseignement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="REF_PP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ETUDES_MO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INDEMNISATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECOMPENSES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIMES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAIEMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAUREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RENS_COMPLEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONDITIONS_ET_MODE_PAIEMENT_OBTENIR_DOCUMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_LIMITE_OBTENTION_DOCUMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIX_DOCUMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERS_OUVERTURE_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_OUVERTURE_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIEU_OUVERTURE_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MARCHE_PERIODIQUE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CALENDRIER_PROCHAINS_AVIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FONDS_COMMUNAUTAIRES_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FONDS_COMMUNAUTAIRES_NON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CRITERES_EVALUATION_DES_PROJETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DECISION_JURY_CONTRAIGNANTE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MEMBRE_JURY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HTTP_DOCUMENTS_MARCHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES_INFOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Renseignement", propOrder = {
    "refppAndETUDESMOAndINDEMNISATION"
})
public class Renseignement {

    @XmlElementRefs({
        @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRIX_DOCUMENTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LIEU_OUVERTURE_OFFRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FONDS_COMMUNAUTAIRES_NON", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ETUDES_MO", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CALENDRIER_PROCHAINS_AVIS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "REF", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_OUVERTURE_OFFRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CRITERES_EVALUATION_DES_PROJETS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PERS_OUVERTURE_OFFRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LAUREAT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DECISION_JURY_CONTRAIGNANTE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CONDITIONS_ET_MODE_PAIEMENT_OBTENIR_DOCUMENTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MARCHE_PERIODIQUE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES_INFOS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PAIEMENTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "REF_PP", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRIMES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MEMBRE_JURY", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_LIMITE_OBTENTION_DOCUMENTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INDEMNISATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HTTP_DOCUMENTS_MARCHE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RENS_COMPLEMENT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RECOMPENSES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FONDS_COMMUNAUTAIRES_OUI", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> refppAndETUDESMOAndINDEMNISATION;

    /**
     * Gets the value of the refppAndETUDESMOAndINDEMNISATION property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refppAndETUDESMOAndINDEMNISATION property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREFPPAndETUDESMOAndINDEMNISATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getREFPPAndETUDESMOAndINDEMNISATION() {
        if (refppAndETUDESMOAndINDEMNISATION == null) {
            refppAndETUDESMOAndINDEMNISATION = new ArrayList<JAXBElement<?>>();
        }
        return this.refppAndETUDESMOAndINDEMNISATION;
    }

}
