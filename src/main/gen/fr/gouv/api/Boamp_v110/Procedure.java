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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour Procedure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Procedure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JUSTIF_URGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AVIS_12MOIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_PREINFO" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DATE_ENVOI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_ENVOI_JOUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_JOUE_AUTRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOTS" type="{}Lot2" minOccurs="0"/&gt;
 *         &lt;element name="DATE_AVIS_PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES_INF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URGENT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR_ESTIMEE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MARCHES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INFRUCTUEUX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SANS_SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="POSTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PRIME_ENVIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PRIME_ATT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SOUS_TRAITANCE" type="{}Valeur" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES_RENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES_INFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MONTANT" type="{}Valeur" minOccurs="0"/&gt;
 *                   &lt;element name="MONTANT_MINI_ANNUEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MONTANT_MAXI_ANNUEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TRANCHE_CONDITIONNELLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TRANCHE_FERME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OFFRE_MOINS" type="{}Valeur" minOccurs="0"/&gt;
 *                   &lt;element name="OFFRE_PLUS" type="{}Valeur" minOccurs="0"/&gt;
 *                   &lt;element name="DATE_ATT_MAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NB_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NB_PARTICIPANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NB_PARTICIPANTS_ETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AMP_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="AMP_NON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CONCLUSION_ACCORD_CADRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MARCHES_SAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ENCHERE_ELECTRONIQUE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="ENCHERE_ELECTRONIQUE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATE_ATT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_PARTICIPANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_PARTICIPANTS_ETR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TITRE_ENVOI_JOUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FONDS_COMMUNAUTAIRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FONDS_COMMUNAUTAIRES_OUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MARCHES_SAD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ENCHERE_ELECTRONIQUE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DATE_ENVOI_JOUE_AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONCLUSION_ACCORD_CADRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{}EnumTypeProcedure" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procedure", propOrder = {
    "titreAndJUSTIFURGENCEAndAVIS12MOIS"
})
public class Procedure {

    @XmlElementRefs({
        @XmlElementRef(name = "CONCLUSION_ACCORD_CADRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_PREINFO", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_ENVOI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES_INF", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AVIS_12MOIS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MARCHES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VALEUR_ESTIMEE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LOTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "JUSTIF_URGENCE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_OFFRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ENCHERE_ELECTRONIQUE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MARCHES_SAD", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URGENT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_PARTICIPANTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FONDS_COMMUNAUTAIRES_OUI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FONDS_COMMUNAUTAIRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_JOUE_AUTRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AMP", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_ATT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_PARTICIPANTS_ETR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TITRE_ENVOI_JOUE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_ENVOI_JOUE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_AVIS_PROFIL_ACHETEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE_ENVOI_JOUE_AUTRES", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> titreAndJUSTIFURGENCEAndAVIS12MOIS;
    @XmlAttribute(name = "type")
    protected EnumTypeProcedure type;

    /**
     * Gets the value of the titreAndJUSTIFURGENCEAndAVIS12MOIS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titreAndJUSTIFURGENCEAndAVIS12MOIS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITREAndJUSTIFURGENCEAndAVIS12MOIS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Procedure.MARCHES }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Procedure.VALEURESTIMEE }{@code >}
     * {@link JAXBElement }{@code <}{@link Lot2 }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTITREAndJUSTIFURGENCEAndAVIS12MOIS() {
        if (titreAndJUSTIFURGENCEAndAVIS12MOIS == null) {
            titreAndJUSTIFURGENCEAndAVIS12MOIS = new ArrayList<JAXBElement<?>>();
        }
        return this.titreAndJUSTIFURGENCEAndAVIS12MOIS;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeProcedure }
     *     
     */
    public EnumTypeProcedure getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeProcedure }
     *     
     */
    public void setType(EnumTypeProcedure value) {
        this.type = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INFRUCTUEUX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SANS_SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="POSTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PRIME_ENVIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PRIME_ATT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SOUS_TRAITANCE" type="{}Valeur" minOccurs="0"/&gt;
     *         &lt;element name="AUTRES_RENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTRES_INFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MONTANT" type="{}Valeur" minOccurs="0"/&gt;
     *         &lt;element name="MONTANT_MINI_ANNUEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MONTANT_MAXI_ANNUEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TRANCHE_CONDITIONNELLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TRANCHE_FERME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OFFRE_MOINS" type="{}Valeur" minOccurs="0"/&gt;
     *         &lt;element name="OFFRE_PLUS" type="{}Valeur" minOccurs="0"/&gt;
     *         &lt;element name="DATE_ATT_MAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NB_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NB_PARTICIPANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NB_PARTICIPANTS_ETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AMP_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="AMP_NON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CONCLUSION_ACCORD_CADRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MARCHES_SAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ENCHERE_ELECTRONIQUE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="ENCHERE_ELECTRONIQUE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "titreAndNOMAndADRESSE"
    })
    public static class MARCHES {

        @XmlElementRefs({
            @XmlElementRef(name = "TEL", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES_RENS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "URL", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ENCHERE_ELECTRONIQUE_OUI", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "POSTE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TRANCHE_CONDITIONNELLE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NB_PARTICIPANTS_ETR", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "OFFRE_MOINS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PRIME_ENVIS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MONTANT_MINI_ANNUEL", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FAX", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DATE_ATT_MAR", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MEL", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CP", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TRANCHE_FERME", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "OFFRE_PLUS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SANS_SUITE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MONTANT_MAXI_ANNUEL", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NOM", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CONCLUSION_ACCORD_CADRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NB_PARTICIPANTS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES_INFO", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PAYS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ADRESSE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SOUS_TRAITANCE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ENCHERE_ELECTRONIQUE_NON", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "INFRUCTUEUX", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AMP_NON", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "VILLE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MONTANT", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AMP_OUI", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PRIME_ATT", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NB_OFFRES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MARCHES_SAD", type = JAXBElement.class, required = false)
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
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Valeur }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
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
         * {@link JAXBElement }{@code <}{@link Valeur }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Valeur }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class VALEURESTIMEE {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "type", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String type;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Définit la valeur de la propriété type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
