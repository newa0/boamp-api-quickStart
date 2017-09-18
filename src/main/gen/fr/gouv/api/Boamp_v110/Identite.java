//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Identite complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Identite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODE_IDENT_NATIONAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POSTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_INFORMATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_PARTICIPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_SOUMISSION_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_SOUMISSION_DEMANDES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_SOUMISSION_PROJETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_POUVOIR_ADJUDICATEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONTACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AGIT_POUR_AUTRE_COMPTE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identite", propOrder = {
    "titreAndNOMAndCODEIDENTNATIONAL"
})
public class Identite {

    @XmlElementRefs({
        @XmlElementRef(name = "URL_INFORMATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL_SOUMISSION_OFFRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NOM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FAX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CODE_IDENT_NATIONAL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "POSTE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AGIT_POUR_AUTRE_COMPTE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ADRESSE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MEL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CP", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL_SOUMISSION_DEMANDES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TEL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL_PARTICIPATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL_POUVOIR_ADJUDICATEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VILLE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PAYS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL_PROFIL_ACHETEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL_SOUMISSION_PROJETS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CONTACT", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> titreAndNOMAndCODEIDENTNATIONAL;

    /**
     * Gets the value of the titreAndNOMAndCODEIDENTNATIONAL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titreAndNOMAndCODEIDENTNATIONAL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITREAndNOMAndCODEIDENTNATIONAL().add(newItem);
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getTITREAndNOMAndCODEIDENTNATIONAL() {
        if (titreAndNOMAndCODEIDENTNATIONAL == null) {
            titreAndNOMAndCODEIDENTNATIONAL = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.titreAndNOMAndCODEIDENTNATIONAL;
    }

}
