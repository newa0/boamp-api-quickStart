//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour Objet complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Objet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OBJET_COMPLET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TITRE_MARCHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXECUTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONCEPT_REALIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXECUTION_OUVRAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACHAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREDIT_BAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOC_VENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PLUSIEURS_FORMES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORIE_SERVICES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPV_OBJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPV_COMPLEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ART27CMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIEU_EXEC_LIVR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIEU_EXEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT_PREVISIONNEL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MONTANT_PREVISIONNEL_INFOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIEU_LIVR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODE_NUTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AVIS_IMPLIQUE_MARCHE_PUBLIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AVIS_IMPLIQUE_ACCORD_CADRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AVIS_IMPLIQUE_SAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCORD_CADRE_PLUSIEURS_OPERATEURS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCORD_CADRE_UN_SEUL_OPERATEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_PARTICIPANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_MAX_PARTICIPANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_ACCORD_CADRE_AN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_ACCORD_CADRE_MOIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACCORD_CADRE_SUP_QUATRE_ANS_JUSTIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCORD_CADRE_VALEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCORD_CADRE_VALEUR_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCORD_CADRE_VALEUR_MAXI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FREQUENCE_ET_VALEUR_DES_MARCHES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TEXTE_APPLICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOMAINE_DELEGATION" type="{}DomaineDelegation" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_AN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_MOIS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Objet", propOrder = {
    "titreAndOBJETCOMPLETAndTITREMARCHE"
})
public class Objet {

    @XmlElementRefs({
        @XmlElementRef(name = "PLUSIEURS_FORMES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DOMAINE_DELEGATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DUREE_MOIS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EXECUTION_OUVRAGE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DUREE_ACCORD_CADRE_AN", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACCORD_CADRE_VALEUR_MINI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACCORD_CADRE_PLUSIEURS_OPERATEURS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CATEGORIE_SERVICES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LIEU_EXEC_LIVR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MONTANT_PREVISIONNEL_INFOS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MONTANT_PREVISIONNEL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DUREE_ACCORD_CADRE_MOIS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AVIS_IMPLIQUE_SAD", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TYPE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CPV_COMPLEMENT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACCORD_CADRE_VALEUR_MAXI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AVIS_IMPLIQUE_ACCORD_CADRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AVIS_IMPLIQUE_MARCHE_PUBLIC", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CONCEPT_REALIS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACHAT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DUREE_AN", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LIEU_EXEC", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TITRE_MARCHE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OBJET_COMPLET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FREQUENCE_ET_VALEUR_DES_MARCHES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_PARTICIPANTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EXECUTION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACCORD_CADRE_VALEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LOC", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ART27CMP", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TEXTE_APPLICATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACCORD_CADRE_SUP_QUATRE_ANS_JUSTIFICATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LIEU_LIVR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LOC_VENTE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NB_MAX_PARTICIPANTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CPV_OBJ", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACCORD_CADRE_UN_SEUL_OPERATEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CODE_NUTS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CREDIT_BAIL", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> titreAndOBJETCOMPLETAndTITREMARCHE;

    /**
     * Gets the value of the titreAndOBJETCOMPLETAndTITREMARCHE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titreAndOBJETCOMPLETAndTITREMARCHE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITREAndOBJETCOMPLETAndTITREMARCHE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DomaineDelegation }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Objet.MONTANTPREVISIONNEL }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
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
     * 
     * 
     */
    public List<JAXBElement<?>> getTITREAndOBJETCOMPLETAndTITREMARCHE() {
        if (titreAndOBJETCOMPLETAndTITREMARCHE == null) {
            titreAndOBJETCOMPLETAndTITREMARCHE = new ArrayList<JAXBElement<?>>();
        }
        return this.titreAndOBJETCOMPLETAndTITREMARCHE;
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
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class MONTANTPREVISIONNEL {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "type", required = true)
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
