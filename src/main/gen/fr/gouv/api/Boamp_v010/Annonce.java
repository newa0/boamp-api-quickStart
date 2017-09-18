//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:36 AM CEST 
//


package fr.gouv.api.Boamp_v010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Annonce complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Annonce"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lien" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="r2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="r3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="r4" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numeroBulletin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typeBulletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroAnnonce" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="numeroAnnonceOriginal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateLimiteValidite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateParution" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typeLibelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomHtml" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripteurs" type="{}Descripteurs"/&gt;
 *         &lt;element name="classeActivites" type="{}ClasseActivites"/&gt;
 *         &lt;element name="departementEmetteur" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="departementExecution" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="typeProcedureId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typeProcedureLibelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lieuDonneurOrdre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="organisme" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomTitulaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="avisInfructueux" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="resume" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annonce", propOrder = {
    "lien",
    "id",
    "r2",
    "r3",
    "r4",
    "numeroBulletin",
    "typeBulletin",
    "numeroAnnonce",
    "numeroAnnonceOriginal",
    "dateLimiteValidite",
    "dateParution",
    "typeId",
    "typeLibelle",
    "nomHtml",
    "descripteurs",
    "classeActivites",
    "departementEmetteur",
    "departementExecution",
    "typeProcedureId",
    "typeProcedureLibelle",
    "lieuDonneurOrdre",
    "organisme",
    "nomTitulaire",
    "avisInfructueux",
    "resume"
})
public class Annonce {

    protected String lien;
    protected long id;
    @XmlElement(required = true)
    protected String r2;
    @XmlElement(required = true)
    protected String r3;
    protected int r4;
    protected int numeroBulletin;
    @XmlElement(required = true)
    protected String typeBulletin;
    @XmlElement(required = true)
    protected Object numeroAnnonce;
    @XmlElement(required = true)
    protected String numeroAnnonceOriginal;
    protected int dateLimiteValidite;
    protected int dateParution;
    protected int typeId;
    @XmlElement(required = true)
    protected String typeLibelle;
    @XmlElement(required = true)
    protected String nomHtml;
    @XmlElement(required = true)
    protected Descripteurs descripteurs;
    @XmlElement(required = true)
    protected ClasseActivites classeActivites;
    @XmlElement(required = true)
    protected String departementEmetteur;
    @XmlElement(required = true)
    protected String departementExecution;
    protected int typeProcedureId;
    @XmlElement(required = true)
    protected String typeProcedureLibelle;
    @XmlElement(required = true)
    protected String lieuDonneurOrdre;
    @XmlElement(required = true)
    protected String organisme;
    protected String nomTitulaire;
    protected Boolean avisInfructueux;
    @XmlElement(required = true)
    protected String resume;

    /**
     * Obtient la valeur de la propriété lien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLien() {
        return lien;
    }

    /**
     * Définit la valeur de la propriété lien.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLien(String value) {
        this.lien = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété r2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR2() {
        return r2;
    }

    /**
     * Définit la valeur de la propriété r2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR2(String value) {
        this.r2 = value;
    }

    /**
     * Obtient la valeur de la propriété r3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR3() {
        return r3;
    }

    /**
     * Définit la valeur de la propriété r3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR3(String value) {
        this.r3 = value;
    }

    /**
     * Obtient la valeur de la propriété r4.
     * 
     */
    public int getR4() {
        return r4;
    }

    /**
     * Définit la valeur de la propriété r4.
     * 
     */
    public void setR4(int value) {
        this.r4 = value;
    }

    /**
     * Obtient la valeur de la propriété numeroBulletin.
     * 
     */
    public int getNumeroBulletin() {
        return numeroBulletin;
    }

    /**
     * Définit la valeur de la propriété numeroBulletin.
     * 
     */
    public void setNumeroBulletin(int value) {
        this.numeroBulletin = value;
    }

    /**
     * Obtient la valeur de la propriété typeBulletin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeBulletin() {
        return typeBulletin;
    }

    /**
     * Définit la valeur de la propriété typeBulletin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeBulletin(String value) {
        this.typeBulletin = value;
    }

    /**
     * Obtient la valeur de la propriété numeroAnnonce.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNumeroAnnonce() {
        return numeroAnnonce;
    }

    /**
     * Définit la valeur de la propriété numeroAnnonce.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNumeroAnnonce(Object value) {
        this.numeroAnnonce = value;
    }

    /**
     * Obtient la valeur de la propriété numeroAnnonceOriginal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAnnonceOriginal() {
        return numeroAnnonceOriginal;
    }

    /**
     * Définit la valeur de la propriété numeroAnnonceOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAnnonceOriginal(String value) {
        this.numeroAnnonceOriginal = value;
    }

    /**
     * Obtient la valeur de la propriété dateLimiteValidite.
     * 
     */
    public int getDateLimiteValidite() {
        return dateLimiteValidite;
    }

    /**
     * Définit la valeur de la propriété dateLimiteValidite.
     * 
     */
    public void setDateLimiteValidite(int value) {
        this.dateLimiteValidite = value;
    }

    /**
     * Obtient la valeur de la propriété dateParution.
     * 
     */
    public int getDateParution() {
        return dateParution;
    }

    /**
     * Définit la valeur de la propriété dateParution.
     * 
     */
    public void setDateParution(int value) {
        this.dateParution = value;
    }

    /**
     * Obtient la valeur de la propriété typeId.
     * 
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * Définit la valeur de la propriété typeId.
     * 
     */
    public void setTypeId(int value) {
        this.typeId = value;
    }

    /**
     * Obtient la valeur de la propriété typeLibelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLibelle() {
        return typeLibelle;
    }

    /**
     * Définit la valeur de la propriété typeLibelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLibelle(String value) {
        this.typeLibelle = value;
    }

    /**
     * Obtient la valeur de la propriété nomHtml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomHtml() {
        return nomHtml;
    }

    /**
     * Définit la valeur de la propriété nomHtml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomHtml(String value) {
        this.nomHtml = value;
    }

    /**
     * Obtient la valeur de la propriété descripteurs.
     * 
     * @return
     *     possible object is
     *     {@link Descripteurs }
     *     
     */
    public Descripteurs getDescripteurs() {
        return descripteurs;
    }

    /**
     * Définit la valeur de la propriété descripteurs.
     * 
     * @param value
     *     allowed object is
     *     {@link Descripteurs }
     *     
     */
    public void setDescripteurs(Descripteurs value) {
        this.descripteurs = value;
    }

    /**
     * Obtient la valeur de la propriété classeActivites.
     * 
     * @return
     *     possible object is
     *     {@link ClasseActivites }
     *     
     */
    public ClasseActivites getClasseActivites() {
        return classeActivites;
    }

    /**
     * Définit la valeur de la propriété classeActivites.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseActivites }
     *     
     */
    public void setClasseActivites(ClasseActivites value) {
        this.classeActivites = value;
    }

    /**
     * Obtient la valeur de la propriété departementEmetteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartementEmetteur() {
        return departementEmetteur;
    }

    /**
     * Définit la valeur de la propriété departementEmetteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartementEmetteur(String value) {
        this.departementEmetteur = value;
    }

    /**
     * Obtient la valeur de la propriété departementExecution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartementExecution() {
        return departementExecution;
    }

    /**
     * Définit la valeur de la propriété departementExecution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartementExecution(String value) {
        this.departementExecution = value;
    }

    /**
     * Obtient la valeur de la propriété typeProcedureId.
     * 
     */
    public int getTypeProcedureId() {
        return typeProcedureId;
    }

    /**
     * Définit la valeur de la propriété typeProcedureId.
     * 
     */
    public void setTypeProcedureId(int value) {
        this.typeProcedureId = value;
    }

    /**
     * Obtient la valeur de la propriété typeProcedureLibelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeProcedureLibelle() {
        return typeProcedureLibelle;
    }

    /**
     * Définit la valeur de la propriété typeProcedureLibelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeProcedureLibelle(String value) {
        this.typeProcedureLibelle = value;
    }

    /**
     * Obtient la valeur de la propriété lieuDonneurOrdre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieuDonneurOrdre() {
        return lieuDonneurOrdre;
    }

    /**
     * Définit la valeur de la propriété lieuDonneurOrdre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieuDonneurOrdre(String value) {
        this.lieuDonneurOrdre = value;
    }

    /**
     * Obtient la valeur de la propriété organisme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisme() {
        return organisme;
    }

    /**
     * Définit la valeur de la propriété organisme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisme(String value) {
        this.organisme = value;
    }

    /**
     * Obtient la valeur de la propriété nomTitulaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTitulaire() {
        return nomTitulaire;
    }

    /**
     * Définit la valeur de la propriété nomTitulaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTitulaire(String value) {
        this.nomTitulaire = value;
    }

    /**
     * Obtient la valeur de la propriété avisInfructueux.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvisInfructueux() {
        return avisInfructueux;
    }

    /**
     * Définit la valeur de la propriété avisInfructueux.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvisInfructueux(Boolean value) {
        this.avisInfructueux = value;
    }

    /**
     * Obtient la valeur de la propriété resume.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResume() {
        return resume;
    }

    /**
     * Définit la valeur de la propriété resume.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResume(String value) {
        this.resume = value;
    }

}
