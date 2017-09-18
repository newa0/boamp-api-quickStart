//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Renseignement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Renseignement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE_ATTRIBUTION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="NB_OFFRE_RECU" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NB_OFFRE_RECU_PME" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NB_OFFRE_RECU_UE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NB_OFFRE_RECU_NON_UE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NB_OFFRE_RECU_ELECT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="GROUPEMENT_ECONOMIQUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT_INDEFINI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ESTIMATION_INITIALE" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT_MINI" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="MONTANT_MAXI" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="NB_ANNEE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NB_MOIS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TRANCHE_CONDITIONNELLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TRANCHE_FERME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_BASSE" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_ELEVEE" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="REDEVANCE_VALEUR" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="AVANTAGE_VALEUR" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="INFO_VALEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="SOUSTRAITANCE_OUI"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="VALEUR" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *                             &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="PROPORTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                     &lt;element name="INCONNUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                     &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element name="SS_TRAIT_PROC_CONC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                     &lt;element name="PART_SS_TRAIT_PROC_CONC" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence minOccurs="0"&gt;
 *                               &lt;element name="PROPORTION_MIN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                               &lt;element name="PROPORTION_MAX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="SOUSTRAITANCE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PRIX_ACHAT_OPPORTUNITE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *                 &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NB_MARCHE_ATTRIBUE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PAYS_ORIGINE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="ORIGINE_COMMUNAUTAIRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                     &lt;element name="ORIGINE_NON_COMMUNAUTAIRE" type="{}EnumCodePays" maxOccurs="10" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="VARIANTES_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="VARIANTES_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="OFFRE_BASSE_NON_RETENUE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="OFFRE_BASSE_NON_RETENUE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CONCOURS_NB_PARTICIPANT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CONCOURS_NB_PARTICIPANT_ETR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CONCOURS_PRIME" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="COUT_OPPORTUNITE" type="{}Valeur" minOccurs="0"/&gt;
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
    "dateattribution",
    "nboffrerecu",
    "nboffrerecupme",
    "nboffrerecuue",
    "nboffrerecunonue",
    "nboffrerecuelect",
    "groupementeconomique",
    "montantindefini",
    "estimationinitiale",
    "montant",
    "montantmini",
    "montantmaxi",
    "nbannee",
    "nbmois",
    "trancheconditionnelle",
    "trancheferme",
    "offrebasse",
    "offreelevee",
    "redevancevaleur",
    "avantagevaleur",
    "infovaleur",
    "soustraitanceoui",
    "soustraitancenon",
    "prixachatopportunite",
    "nbmarcheattribue",
    "paysorigine",
    "variantesoui",
    "variantesnon",
    "offrebassenonretenueoui",
    "offrebassenonretenuenon",
    "concoursnbparticipant",
    "concoursnbparticipantetr",
    "concoursprime",
    "coutopportunite"
})
public class Renseignement {

    @XmlElement(name = "DATE_ATTRIBUTION")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateattribution;
    @XmlElement(name = "NB_OFFRE_RECU")
    protected BigInteger nboffrerecu;
    @XmlElement(name = "NB_OFFRE_RECU_PME")
    protected BigInteger nboffrerecupme;
    @XmlElement(name = "NB_OFFRE_RECU_UE")
    protected BigInteger nboffrerecuue;
    @XmlElement(name = "NB_OFFRE_RECU_NON_UE")
    protected BigInteger nboffrerecunonue;
    @XmlElement(name = "NB_OFFRE_RECU_ELECT")
    protected BigInteger nboffrerecuelect;
    @XmlElement(name = "GROUPEMENT_ECONOMIQUE")
    protected Object groupementeconomique;
    @XmlElement(name = "MONTANT_INDEFINI")
    protected Object montantindefini;
    @XmlElement(name = "ESTIMATION_INITIALE")
    protected Valeur estimationinitiale;
    @XmlElement(name = "MONTANT")
    protected Valeur montant;
    @XmlElement(name = "MONTANT_MINI")
    protected Valeur montantmini;
    @XmlElement(name = "MONTANT_MAXI")
    protected Valeur montantmaxi;
    @XmlElement(name = "NB_ANNEE")
    protected BigInteger nbannee;
    @XmlElement(name = "NB_MOIS")
    protected BigInteger nbmois;
    @XmlElement(name = "TRANCHE_CONDITIONNELLE")
    protected Object trancheconditionnelle;
    @XmlElement(name = "TRANCHE_FERME")
    protected String trancheferme;
    @XmlElement(name = "OFFRE_BASSE")
    protected Valeur offrebasse;
    @XmlElement(name = "OFFRE_ELEVEE")
    protected Valeur offreelevee;
    @XmlElement(name = "REDEVANCE_VALEUR")
    protected Valeur redevancevaleur;
    @XmlElement(name = "AVANTAGE_VALEUR")
    protected Valeur avantagevaleur;
    @XmlElement(name = "INFO_VALEUR")
    protected String infovaleur;
    @XmlElement(name = "SOUSTRAITANCE_OUI")
    protected Renseignement.SOUSTRAITANCEOUI soustraitanceoui;
    @XmlElement(name = "SOUSTRAITANCE_NON")
    protected Object soustraitancenon;
    @XmlElement(name = "PRIX_ACHAT_OPPORTUNITE")
    protected Renseignement.PRIXACHATOPPORTUNITE prixachatopportunite;
    @XmlElement(name = "NB_MARCHE_ATTRIBUE")
    protected BigInteger nbmarcheattribue;
    @XmlElement(name = "PAYS_ORIGINE")
    protected Renseignement.PAYSORIGINE paysorigine;
    @XmlElement(name = "VARIANTES_OUI")
    protected Object variantesoui;
    @XmlElement(name = "VARIANTES_NON")
    protected Object variantesnon;
    @XmlElement(name = "OFFRE_BASSE_NON_RETENUE_OUI")
    protected Object offrebassenonretenueoui;
    @XmlElement(name = "OFFRE_BASSE_NON_RETENUE_NON")
    protected Object offrebassenonretenuenon;
    @XmlElement(name = "CONCOURS_NB_PARTICIPANT")
    protected BigDecimal concoursnbparticipant;
    @XmlElement(name = "CONCOURS_NB_PARTICIPANT_ETR")
    protected BigDecimal concoursnbparticipantetr;
    @XmlElement(name = "CONCOURS_PRIME")
    protected Valeur concoursprime;
    @XmlElement(name = "COUT_OPPORTUNITE")
    protected Valeur coutopportunite;

    /**
     * Obtient la valeur de la propriété dateattribution.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEATTRIBUTION() {
        return dateattribution;
    }

    /**
     * Définit la valeur de la propriété dateattribution.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEATTRIBUTION(XMLGregorianCalendar value) {
        this.dateattribution = value;
    }

    /**
     * Obtient la valeur de la propriété nboffrerecu.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBOFFRERECU() {
        return nboffrerecu;
    }

    /**
     * Définit la valeur de la propriété nboffrerecu.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBOFFRERECU(BigInteger value) {
        this.nboffrerecu = value;
    }

    /**
     * Obtient la valeur de la propriété nboffrerecupme.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBOFFRERECUPME() {
        return nboffrerecupme;
    }

    /**
     * Définit la valeur de la propriété nboffrerecupme.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBOFFRERECUPME(BigInteger value) {
        this.nboffrerecupme = value;
    }

    /**
     * Obtient la valeur de la propriété nboffrerecuue.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBOFFRERECUUE() {
        return nboffrerecuue;
    }

    /**
     * Définit la valeur de la propriété nboffrerecuue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBOFFRERECUUE(BigInteger value) {
        this.nboffrerecuue = value;
    }

    /**
     * Obtient la valeur de la propriété nboffrerecunonue.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBOFFRERECUNONUE() {
        return nboffrerecunonue;
    }

    /**
     * Définit la valeur de la propriété nboffrerecunonue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBOFFRERECUNONUE(BigInteger value) {
        this.nboffrerecunonue = value;
    }

    /**
     * Obtient la valeur de la propriété nboffrerecuelect.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBOFFRERECUELECT() {
        return nboffrerecuelect;
    }

    /**
     * Définit la valeur de la propriété nboffrerecuelect.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBOFFRERECUELECT(BigInteger value) {
        this.nboffrerecuelect = value;
    }

    /**
     * Obtient la valeur de la propriété groupementeconomique.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGROUPEMENTECONOMIQUE() {
        return groupementeconomique;
    }

    /**
     * Définit la valeur de la propriété groupementeconomique.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGROUPEMENTECONOMIQUE(Object value) {
        this.groupementeconomique = value;
    }

    /**
     * Obtient la valeur de la propriété montantindefini.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMONTANTINDEFINI() {
        return montantindefini;
    }

    /**
     * Définit la valeur de la propriété montantindefini.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMONTANTINDEFINI(Object value) {
        this.montantindefini = value;
    }

    /**
     * Obtient la valeur de la propriété estimationinitiale.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getESTIMATIONINITIALE() {
        return estimationinitiale;
    }

    /**
     * Définit la valeur de la propriété estimationinitiale.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setESTIMATIONINITIALE(Valeur value) {
        this.estimationinitiale = value;
    }

    /**
     * Obtient la valeur de la propriété montant.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getMONTANT() {
        return montant;
    }

    /**
     * Définit la valeur de la propriété montant.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setMONTANT(Valeur value) {
        this.montant = value;
    }

    /**
     * Obtient la valeur de la propriété montantmini.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getMONTANTMINI() {
        return montantmini;
    }

    /**
     * Définit la valeur de la propriété montantmini.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setMONTANTMINI(Valeur value) {
        this.montantmini = value;
    }

    /**
     * Obtient la valeur de la propriété montantmaxi.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getMONTANTMAXI() {
        return montantmaxi;
    }

    /**
     * Définit la valeur de la propriété montantmaxi.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setMONTANTMAXI(Valeur value) {
        this.montantmaxi = value;
    }

    /**
     * Obtient la valeur de la propriété nbannee.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBANNEE() {
        return nbannee;
    }

    /**
     * Définit la valeur de la propriété nbannee.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBANNEE(BigInteger value) {
        this.nbannee = value;
    }

    /**
     * Obtient la valeur de la propriété nbmois.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBMOIS() {
        return nbmois;
    }

    /**
     * Définit la valeur de la propriété nbmois.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBMOIS(BigInteger value) {
        this.nbmois = value;
    }

    /**
     * Obtient la valeur de la propriété trancheconditionnelle.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTRANCHECONDITIONNELLE() {
        return trancheconditionnelle;
    }

    /**
     * Définit la valeur de la propriété trancheconditionnelle.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTRANCHECONDITIONNELLE(Object value) {
        this.trancheconditionnelle = value;
    }

    /**
     * Obtient la valeur de la propriété trancheferme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANCHEFERME() {
        return trancheferme;
    }

    /**
     * Définit la valeur de la propriété trancheferme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANCHEFERME(String value) {
        this.trancheferme = value;
    }

    /**
     * Obtient la valeur de la propriété offrebasse.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getOFFREBASSE() {
        return offrebasse;
    }

    /**
     * Définit la valeur de la propriété offrebasse.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setOFFREBASSE(Valeur value) {
        this.offrebasse = value;
    }

    /**
     * Obtient la valeur de la propriété offreelevee.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getOFFREELEVEE() {
        return offreelevee;
    }

    /**
     * Définit la valeur de la propriété offreelevee.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setOFFREELEVEE(Valeur value) {
        this.offreelevee = value;
    }

    /**
     * Obtient la valeur de la propriété redevancevaleur.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getREDEVANCEVALEUR() {
        return redevancevaleur;
    }

    /**
     * Définit la valeur de la propriété redevancevaleur.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setREDEVANCEVALEUR(Valeur value) {
        this.redevancevaleur = value;
    }

    /**
     * Obtient la valeur de la propriété avantagevaleur.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getAVANTAGEVALEUR() {
        return avantagevaleur;
    }

    /**
     * Définit la valeur de la propriété avantagevaleur.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setAVANTAGEVALEUR(Valeur value) {
        this.avantagevaleur = value;
    }

    /**
     * Obtient la valeur de la propriété infovaleur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFOVALEUR() {
        return infovaleur;
    }

    /**
     * Définit la valeur de la propriété infovaleur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFOVALEUR(String value) {
        this.infovaleur = value;
    }

    /**
     * Obtient la valeur de la propriété soustraitanceoui.
     * 
     * @return
     *     possible object is
     *     {@link Renseignement.SOUSTRAITANCEOUI }
     *     
     */
    public Renseignement.SOUSTRAITANCEOUI getSOUSTRAITANCEOUI() {
        return soustraitanceoui;
    }

    /**
     * Définit la valeur de la propriété soustraitanceoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Renseignement.SOUSTRAITANCEOUI }
     *     
     */
    public void setSOUSTRAITANCEOUI(Renseignement.SOUSTRAITANCEOUI value) {
        this.soustraitanceoui = value;
    }

    /**
     * Obtient la valeur de la propriété soustraitancenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSOUSTRAITANCENON() {
        return soustraitancenon;
    }

    /**
     * Définit la valeur de la propriété soustraitancenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSOUSTRAITANCENON(Object value) {
        this.soustraitancenon = value;
    }

    /**
     * Obtient la valeur de la propriété prixachatopportunite.
     * 
     * @return
     *     possible object is
     *     {@link Renseignement.PRIXACHATOPPORTUNITE }
     *     
     */
    public Renseignement.PRIXACHATOPPORTUNITE getPRIXACHATOPPORTUNITE() {
        return prixachatopportunite;
    }

    /**
     * Définit la valeur de la propriété prixachatopportunite.
     * 
     * @param value
     *     allowed object is
     *     {@link Renseignement.PRIXACHATOPPORTUNITE }
     *     
     */
    public void setPRIXACHATOPPORTUNITE(Renseignement.PRIXACHATOPPORTUNITE value) {
        this.prixachatopportunite = value;
    }

    /**
     * Obtient la valeur de la propriété nbmarcheattribue.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBMARCHEATTRIBUE() {
        return nbmarcheattribue;
    }

    /**
     * Définit la valeur de la propriété nbmarcheattribue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBMARCHEATTRIBUE(BigInteger value) {
        this.nbmarcheattribue = value;
    }

    /**
     * Obtient la valeur de la propriété paysorigine.
     * 
     * @return
     *     possible object is
     *     {@link Renseignement.PAYSORIGINE }
     *     
     */
    public Renseignement.PAYSORIGINE getPAYSORIGINE() {
        return paysorigine;
    }

    /**
     * Définit la valeur de la propriété paysorigine.
     * 
     * @param value
     *     allowed object is
     *     {@link Renseignement.PAYSORIGINE }
     *     
     */
    public void setPAYSORIGINE(Renseignement.PAYSORIGINE value) {
        this.paysorigine = value;
    }

    /**
     * Obtient la valeur de la propriété variantesoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVARIANTESOUI() {
        return variantesoui;
    }

    /**
     * Définit la valeur de la propriété variantesoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVARIANTESOUI(Object value) {
        this.variantesoui = value;
    }

    /**
     * Obtient la valeur de la propriété variantesnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVARIANTESNON() {
        return variantesnon;
    }

    /**
     * Définit la valeur de la propriété variantesnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVARIANTESNON(Object value) {
        this.variantesnon = value;
    }

    /**
     * Obtient la valeur de la propriété offrebassenonretenueoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOFFREBASSENONRETENUEOUI() {
        return offrebassenonretenueoui;
    }

    /**
     * Définit la valeur de la propriété offrebassenonretenueoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOFFREBASSENONRETENUEOUI(Object value) {
        this.offrebassenonretenueoui = value;
    }

    /**
     * Obtient la valeur de la propriété offrebassenonretenuenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOFFREBASSENONRETENUENON() {
        return offrebassenonretenuenon;
    }

    /**
     * Définit la valeur de la propriété offrebassenonretenuenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOFFREBASSENONRETENUENON(Object value) {
        this.offrebassenonretenuenon = value;
    }

    /**
     * Obtient la valeur de la propriété concoursnbparticipant.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCONCOURSNBPARTICIPANT() {
        return concoursnbparticipant;
    }

    /**
     * Définit la valeur de la propriété concoursnbparticipant.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCONCOURSNBPARTICIPANT(BigDecimal value) {
        this.concoursnbparticipant = value;
    }

    /**
     * Obtient la valeur de la propriété concoursnbparticipantetr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCONCOURSNBPARTICIPANTETR() {
        return concoursnbparticipantetr;
    }

    /**
     * Définit la valeur de la propriété concoursnbparticipantetr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCONCOURSNBPARTICIPANTETR(BigDecimal value) {
        this.concoursnbparticipantetr = value;
    }

    /**
     * Obtient la valeur de la propriété concoursprime.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getCONCOURSPRIME() {
        return concoursprime;
    }

    /**
     * Définit la valeur de la propriété concoursprime.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setCONCOURSPRIME(Valeur value) {
        this.concoursprime = value;
    }

    /**
     * Obtient la valeur de la propriété coutopportunite.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getCOUTOPPORTUNITE() {
        return coutopportunite;
    }

    /**
     * Définit la valeur de la propriété coutopportunite.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setCOUTOPPORTUNITE(Valeur value) {
        this.coutopportunite = value;
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
     *       &lt;choice&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="ORIGINE_COMMUNAUTAIRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *           &lt;element name="ORIGINE_NON_COMMUNAUTAIRE" type="{}EnumCodePays" maxOccurs="10" minOccurs="0"/&gt;
     *         &lt;/sequence&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originecommunautaire",
        "originenoncommunautaire"
    })
    public static class PAYSORIGINE {

        @XmlElement(name = "ORIGINE_COMMUNAUTAIRE")
        protected Object originecommunautaire;
        @XmlElement(name = "ORIGINE_NON_COMMUNAUTAIRE")
        @XmlSchemaType(name = "token")
        protected List<EnumCodePays> originenoncommunautaire;

        /**
         * Obtient la valeur de la propriété originecommunautaire.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getORIGINECOMMUNAUTAIRE() {
            return originecommunautaire;
        }

        /**
         * Définit la valeur de la propriété originecommunautaire.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setORIGINECOMMUNAUTAIRE(Object value) {
            this.originecommunautaire = value;
        }

        /**
         * Gets the value of the originenoncommunautaire property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originenoncommunautaire property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORIGINENONCOMMUNAUTAIRE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EnumCodePays }
         * 
         * 
         */
        public List<EnumCodePays> getORIGINENONCOMMUNAUTAIRE() {
            if (originenoncommunautaire == null) {
                originenoncommunautaire = new ArrayList<EnumCodePays>();
            }
            return this.originenoncommunautaire;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
     *       &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class PRIXACHATOPPORTUNITE {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "DEVISE", required = true)
        protected String devise;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété devise.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEVISE() {
            return devise;
        }

        /**
         * Définit la valeur de la propriété devise.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEVISE(String value) {
            this.devise = value;
        }

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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="VALEUR" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
     *                 &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PROPORTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="INCONNUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SS_TRAIT_PROC_CONC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PART_SS_TRAIT_PROC_CONC" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence minOccurs="0"&gt;
     *                   &lt;element name="PROPORTION_MIN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="PROPORTION_MAX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "valeur",
        "proportion",
        "inconnue",
        "description",
        "sstraitprocconc",
        "partsstraitprocconc"
    })
    public static class SOUSTRAITANCEOUI {

        @XmlElement(name = "VALEUR")
        protected Renseignement.SOUSTRAITANCEOUI.VALEUR valeur;
        @XmlElement(name = "PROPORTION")
        protected BigDecimal proportion;
        @XmlElement(name = "INCONNUE")
        protected Object inconnue;
        @XmlElement(name = "DESCRIPTION")
        protected String description;
        @XmlElement(name = "SS_TRAIT_PROC_CONC")
        protected Object sstraitprocconc;
        @XmlElement(name = "PART_SS_TRAIT_PROC_CONC")
        protected Renseignement.SOUSTRAITANCEOUI.PARTSSTRAITPROCCONC partsstraitprocconc;

        /**
         * Obtient la valeur de la propriété valeur.
         * 
         * @return
         *     possible object is
         *     {@link Renseignement.SOUSTRAITANCEOUI.VALEUR }
         *     
         */
        public Renseignement.SOUSTRAITANCEOUI.VALEUR getVALEUR() {
            return valeur;
        }

        /**
         * Définit la valeur de la propriété valeur.
         * 
         * @param value
         *     allowed object is
         *     {@link Renseignement.SOUSTRAITANCEOUI.VALEUR }
         *     
         */
        public void setVALEUR(Renseignement.SOUSTRAITANCEOUI.VALEUR value) {
            this.valeur = value;
        }

        /**
         * Obtient la valeur de la propriété proportion.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPROPORTION() {
            return proportion;
        }

        /**
         * Définit la valeur de la propriété proportion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPROPORTION(BigDecimal value) {
            this.proportion = value;
        }

        /**
         * Obtient la valeur de la propriété inconnue.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getINCONNUE() {
            return inconnue;
        }

        /**
         * Définit la valeur de la propriété inconnue.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setINCONNUE(Object value) {
            this.inconnue = value;
        }

        /**
         * Obtient la valeur de la propriété description.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Définit la valeur de la propriété description.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

        /**
         * Obtient la valeur de la propriété sstraitprocconc.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSSTRAITPROCCONC() {
            return sstraitprocconc;
        }

        /**
         * Définit la valeur de la propriété sstraitprocconc.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSSTRAITPROCCONC(Object value) {
            this.sstraitprocconc = value;
        }

        /**
         * Obtient la valeur de la propriété partsstraitprocconc.
         * 
         * @return
         *     possible object is
         *     {@link Renseignement.SOUSTRAITANCEOUI.PARTSSTRAITPROCCONC }
         *     
         */
        public Renseignement.SOUSTRAITANCEOUI.PARTSSTRAITPROCCONC getPARTSSTRAITPROCCONC() {
            return partsstraitprocconc;
        }

        /**
         * Définit la valeur de la propriété partsstraitprocconc.
         * 
         * @param value
         *     allowed object is
         *     {@link Renseignement.SOUSTRAITANCEOUI.PARTSSTRAITPROCCONC }
         *     
         */
        public void setPARTSSTRAITPROCCONC(Renseignement.SOUSTRAITANCEOUI.PARTSSTRAITPROCCONC value) {
            this.partsstraitprocconc = value;
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
         *       &lt;sequence minOccurs="0"&gt;
         *         &lt;element name="PROPORTION_MIN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="PROPORTION_MAX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "proportionmin",
            "proportionmax"
        })
        public static class PARTSSTRAITPROCCONC {

            @XmlElement(name = "PROPORTION_MIN")
            protected Object proportionmin;
            @XmlElement(name = "PROPORTION_MAX")
            protected Object proportionmax;

            /**
             * Obtient la valeur de la propriété proportionmin.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPROPORTIONMIN() {
                return proportionmin;
            }

            /**
             * Définit la valeur de la propriété proportionmin.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPROPORTIONMIN(Object value) {
                this.proportionmin = value;
            }

            /**
             * Obtient la valeur de la propriété proportionmax.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPROPORTIONMAX() {
                return proportionmax;
            }

            /**
             * Définit la valeur de la propriété proportionmax.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPROPORTIONMAX(Object value) {
                this.proportionmax = value;
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
         *       &lt;attribute name="DEVISE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class VALEUR {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "DEVISE", required = true)
            protected String devise;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété devise.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEVISE() {
                return devise;
            }

            /**
             * Définit la valeur de la propriété devise.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEVISE(String value) {
                this.devise = value;
            }

        }

    }

}
