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
 * <p>Classe Java pour Annexe1 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Annexe1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECHERCHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URGENCE_IMPERIEUSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MARCHE_COMPLEMENTAIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PREST_SIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MARCHES_PLUSIEURS_LAUREATS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MATIERES_PREMIERES_BOURSES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFFRES_IRREGULIERES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACHAT_OPPORTUNITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MARCHE_BASE_ACCORD_CADRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROC_OUVERTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROC_RESTREINTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MISE_EN_CONCURRENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TECHNIQUES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ARTISTIQUES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROT_DROITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CESSATION_ACTIVITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIQUIDATEURS_FAILLITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annexe1", propOrder = {
    "titreAndRECHERCHEAndURGENCEIMPERIEUSE"
})
public class Annexe1 {

    @XmlElementRefs({
        @XmlElementRef(name = "PROC_RESTREINTE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RECHERCHE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TECHNIQUES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ARTISTIQUES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MARCHE_BASE_ACCORD_CADRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACHAT_OPPORTUNITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CESSATION_ACTIVITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PROC_OUVERTE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MISE_EN_CONCURRENCE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PREST_SIM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LIQUIDATEURS_FAILLITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PROT_DROITS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MARCHES_PLUSIEURS_LAUREATS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URGENCE_IMPERIEUSE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OFFRES_IRREGULIERES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MATIERES_PREMIERES_BOURSES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MARCHE_COMPLEMENTAIRE", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> titreAndRECHERCHEAndURGENCEIMPERIEUSE;

    /**
     * Gets the value of the titreAndRECHERCHEAndURGENCEIMPERIEUSE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titreAndRECHERCHEAndURGENCEIMPERIEUSE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITREAndRECHERCHEAndURGENCEIMPERIEUSE().add(newItem);
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
    public List<JAXBElement<String>> getTITREAndRECHERCHEAndURGENCEIMPERIEUSE() {
        if (titreAndRECHERCHEAndURGENCEIMPERIEUSE == null) {
            titreAndRECHERCHEAndURGENCEIMPERIEUSE = new ArrayList<JAXBElement<String>>();
        }
        return this.titreAndRECHERCHEAndURGENCEIMPERIEUSE;
    }

}
