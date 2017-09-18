//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.gouv.api.Boamp_v230 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ANNONCE_QNAME = new QName("", "ANNONCE");
    private final static QName _EnumEntiteAdjudicatricePRODTRANSDISTRIBGAZ_QNAME = new QName("", "PROD_TRANS_DISTRIB_GAZ");
    private final static QName _EnumEntiteAdjudicatriceELECTRICITE_QNAME = new QName("", "ELECTRICITE");
    private final static QName _EnumEntiteAdjudicatricePROSPEXTRACTPETROLEGAZ_QNAME = new QName("", "PROSP_EXTRACT_PETROLE_GAZ");
    private final static QName _EnumEntiteAdjudicatricePROSPEXTRACTCHARBONCOMB_QNAME = new QName("", "PROSP_EXTRACT_CHARBON_COMB");
    private final static QName _EnumEntiteAdjudicatriceEAU_QNAME = new QName("", "EAU");
    private final static QName _EnumEntiteAdjudicatriceSERPOST_QNAME = new QName("", "SER_POST");
    private final static QName _EnumEntiteAdjudicatriceSERCHEMINFER_QNAME = new QName("", "SER_CHEMIN_FER");
    private final static QName _EnumEntiteAdjudicatriceSERCHEMINFERTRAMBUS_QNAME = new QName("", "SER_CHEMIN_FER_TRAM_BUS");
    private final static QName _EnumEntiteAdjudicatriceACTPORT_QNAME = new QName("", "ACT_PORT");
    private final static QName _EnumEntiteAdjudicatriceACTAEROPORT_QNAME = new QName("", "ACT_AEROPORT");
    private final static QName _EnumEntiteAdjudicatriceAUTRE_QNAME = new QName("", "AUTRE");
    private final static QName _EnumAdjudicationDEF_QNAME = new QName("", "DEF");
    private final static QName _EnumAdjudicationACTSERVADMPUB_QNAME = new QName("", "ACT_SERV_ADM_PUB");
    private final static QName _EnumAdjudicationSANTE_QNAME = new QName("", "SANTE");
    private final static QName _EnumAdjudicationENVIRONNEMENT_QNAME = new QName("", "ENVIRONNEMENT");
    private final static QName _EnumAdjudicationORDRESECPUB_QNAME = new QName("", "ORDRE_SEC_PUB");
    private final static QName _EnumAdjudicationAFFECOFIN_QNAME = new QName("", "AFF_ECO_FIN");
    private final static QName _EnumAdjudicationEDUCATION_QNAME = new QName("", "EDUCATION");
    private final static QName _EnumAdjudicationLOGDEVCOL_QNAME = new QName("", "LOG_DEV_COL");
    private final static QName _EnumAdjudicationPROTECTIONSOCIALE_QNAME = new QName("", "PROTECTION_SOCIALE");
    private final static QName _EnumAdjudicationLOISCULTREL_QNAME = new QName("", "LOIS_CULT_REL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.gouv.api.Boamp_v230
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CritereAttribution }
     * 
     */
    public CritereAttribution createCritereAttribution() {
        return new CritereAttribution();
    }

    /**
     * Create an instance of {@link CritereAttribution.CRITERESPONDERES }
     * 
     */
    public CritereAttribution.CRITERESPONDERES createCritereAttributionCRITERESPONDERES() {
        return new CritereAttribution.CRITERESPONDERES();
    }

    /**
     * Create an instance of {@link CritereAttribution.CRITERESPRIORITES }
     * 
     */
    public CritereAttribution.CRITERESPRIORITES createCritereAttributionCRITERESPRIORITES() {
        return new CritereAttribution.CRITERESPRIORITES();
    }

    /**
     * Create an instance of {@link EnumNature }
     * 
     */
    public EnumNature createEnumNature() {
        return new EnumNature();
    }

    /**
     * Create an instance of {@link EnumTypeProcedure }
     * 
     */
    public EnumTypeProcedure createEnumTypeProcedure() {
        return new EnumTypeProcedure();
    }

    /**
     * Create an instance of {@link ConditionParticipation }
     * 
     */
    public ConditionParticipation createConditionParticipation() {
        return new ConditionParticipation();
    }

    /**
     * Create an instance of {@link ConditionMarche }
     * 
     */
    public ConditionMarche createConditionMarche() {
        return new ConditionMarche();
    }

    /**
     * Create an instance of {@link PubAnterieure }
     * 
     */
    public PubAnterieure createPubAnterieure() {
        return new PubAnterieure();
    }

    /**
     * Create an instance of {@link PubAnterieure.REFERENCEPUBLICATION }
     * 
     */
    public PubAnterieure.REFERENCEPUBLICATION createPubAnterieureREFERENCEPUBLICATION() {
        return new PubAnterieure.REFERENCEPUBLICATION();
    }

    /**
     * Create an instance of {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE }
     * 
     */
    public PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE createPubAnterieureREFERENCEPUBLICATIONPUBLICATIONJOUE() {
        return new PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE();
    }

    /**
     * Create an instance of {@link Attribution }
     * 
     */
    public Attribution createAttribution() {
        return new Attribution();
    }

    /**
     * Create an instance of {@link Attribution.DECISION }
     * 
     */
    public Attribution.DECISION createAttributionDECISION() {
        return new Attribution.DECISION();
    }

    /**
     * Create an instance of {@link Renseignement }
     * 
     */
    public Renseignement createRenseignement() {
        return new Renseignement();
    }

    /**
     * Create an instance of {@link Renseignement.SOUSTRAITANCEOUI }
     * 
     */
    public Renseignement.SOUSTRAITANCEOUI createRenseignementSOUSTRAITANCEOUI() {
        return new Renseignement.SOUSTRAITANCEOUI();
    }

    /**
     * Create an instance of {@link AnnonceAnterieure }
     * 
     */
    public AnnonceAnterieure createAnnonceAnterieure() {
        return new AnnonceAnterieure();
    }

    /**
     * Create an instance of {@link AnnonceAnterieure.REFERENCEPUBLICATION }
     * 
     */
    public AnnonceAnterieure.REFERENCEPUBLICATION createAnnonceAnterieureREFERENCEPUBLICATION() {
        return new AnnonceAnterieure.REFERENCEPUBLICATION();
    }

    /**
     * Create an instance of {@link Rectification }
     * 
     */
    public Rectification createRectification() {
        return new Rectification();
    }

    /**
     * Create an instance of {@link Rectification.CPV }
     * 
     */
    public Rectification.CPV createRectificationCPV() {
        return new Rectification.CPV();
    }

    /**
     * Create an instance of {@link ComplementInformation }
     * 
     */
    public ComplementInformation createComplementInformation() {
        return new ComplementInformation();
    }

    /**
     * Create an instance of {@link ConditionAdministrative }
     * 
     */
    public ConditionAdministrative createConditionAdministrative() {
        return new ConditionAdministrative();
    }

    /**
     * Create an instance of {@link ReferencePublication }
     * 
     */
    public ReferencePublication createReferencePublication() {
        return new ReferencePublication();
    }

    /**
     * Create an instance of {@link Procedure }
     * 
     */
    public Procedure createProcedure() {
        return new Procedure();
    }

    /**
     * Create an instance of {@link Criteres }
     * 
     */
    public Criteres createCriteres() {
        return new Criteres();
    }

    /**
     * Create an instance of {@link Criteres.CRITERESCOUT }
     * 
     */
    public Criteres.CRITERESCOUT createCriteresCRITERESCOUT() {
        return new Criteres.CRITERESCOUT();
    }

    /**
     * Create an instance of {@link Criteres.CRITERESQUALITE }
     * 
     */
    public Criteres.CRITERESQUALITE createCriteresCRITERESQUALITE() {
        return new Criteres.CRITERESQUALITE();
    }

    /**
     * Create an instance of {@link Caracteristiques }
     * 
     */
    public Caracteristiques createCaracteristiques() {
        return new Caracteristiques();
    }

    /**
     * Create an instance of {@link Caracteristiques.TABLE }
     * 
     */
    public Caracteristiques.TABLE createCaracteristiquesTABLE() {
        return new Caracteristiques.TABLE();
    }

    /**
     * Create an instance of {@link AccordCadre }
     * 
     */
    public AccordCadre createAccordCadre() {
        return new AccordCadre();
    }

    /**
     * Create an instance of {@link MarcheType }
     * 
     */
    public MarcheType createMarcheType() {
        return new MarcheType();
    }

    /**
     * Create an instance of {@link ObjetArticle }
     * 
     */
    public ObjetArticle createObjetArticle() {
        return new ObjetArticle();
    }

    /**
     * Create an instance of {@link Indexation }
     * 
     */
    public Indexation createIndexation() {
        return new Indexation();
    }

    /**
     * Create an instance of {@link Marche }
     * 
     */
    public Marche createMarche() {
        return new Marche();
    }

    /**
     * Create an instance of {@link Marche.ANNONCEANTERIEUR }
     * 
     */
    public Marche.ANNONCEANTERIEUR createMarcheANNONCEANTERIEUR() {
        return new Marche.ANNONCEANTERIEUR();
    }

    /**
     * Create an instance of {@link Annonce }
     * 
     */
    public Annonce createAnnonce() {
        return new Annonce();
    }

    /**
     * Create an instance of {@link Gestion }
     * 
     */
    public Gestion createGestion() {
        return new Gestion();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link Donnees }
     * 
     */
    public Donnees createDonnees() {
        return new Donnees();
    }

    /**
     * Create an instance of {@link Identite }
     * 
     */
    public Identite createIdentite() {
        return new Identite();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link DetailContact }
     * 
     */
    public DetailContact createDetailContact() {
        return new DetailContact();
    }

    /**
     * Create an instance of {@link EnumDomaine }
     * 
     */
    public EnumDomaine createEnumDomaine() {
        return new EnumDomaine();
    }

    /**
     * Create an instance of {@link EnumAvisImplique }
     * 
     */
    public EnumAvisImplique createEnumAvisImplique() {
        return new EnumAvisImplique();
    }

    /**
     * Create an instance of {@link EnumAvisCorrespondant }
     * 
     */
    public EnumAvisCorrespondant createEnumAvisCorrespondant() {
        return new EnumAvisCorrespondant();
    }

    /**
     * Create an instance of {@link Lieu }
     * 
     */
    public Lieu createLieu() {
        return new Lieu();
    }

    /**
     * Create an instance of {@link Delegation }
     * 
     */
    public Delegation createDelegation() {
        return new Delegation();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link Reconduction }
     * 
     */
    public Reconduction createReconduction() {
        return new Reconduction();
    }

    /**
     * Create an instance of {@link Delai }
     * 
     */
    public Delai createDelai() {
        return new Delai();
    }

    /**
     * Create an instance of {@link Lot }
     * 
     */
    public Lot createLot() {
        return new Lot();
    }

    /**
     * Create an instance of {@link Duree }
     * 
     */
    public Duree createDuree() {
        return new Duree();
    }

    /**
     * Create an instance of {@link NbrCandidat }
     * 
     */
    public NbrCandidat createNbrCandidat() {
        return new NbrCandidat();
    }

    /**
     * Create an instance of {@link PublicationPapier }
     * 
     */
    public PublicationPapier createPublicationPapier() {
        return new PublicationPapier();
    }

    /**
     * Create an instance of {@link Modification }
     * 
     */
    public Modification createModification() {
        return new Modification();
    }

    /**
     * Create an instance of {@link Titulaire }
     * 
     */
    public Titulaire createTitulaire() {
        return new Titulaire();
    }

    /**
     * Create an instance of {@link ConditionDelai }
     * 
     */
    public ConditionDelai createConditionDelai() {
        return new ConditionDelai();
    }

    /**
     * Create an instance of {@link Annulation }
     * 
     */
    public Annulation createAnnulation() {
        return new Annulation();
    }

    /**
     * Create an instance of {@link Rectificatif }
     * 
     */
    public Rectificatif createRectificatif() {
        return new Rectificatif();
    }

    /**
     * Create an instance of {@link ConditionQualification }
     * 
     */
    public ConditionQualification createConditionQualification() {
        return new ConditionQualification();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link Avis }
     * 
     */
    public Avis createAvis() {
        return new Avis();
    }

    /**
     * Create an instance of {@link Valeur }
     * 
     */
    public Valeur createValeur() {
        return new Valeur();
    }

    /**
     * Create an instance of {@link CodeLib }
     * 
     */
    public CodeLib createCodeLib() {
        return new CodeLib();
    }

    /**
     * Create an instance of {@link AnnexeD1 }
     * 
     */
    public AnnexeD1 createAnnexeD1() {
        return new AnnexeD1();
    }

    /**
     * Create an instance of {@link AnnexeD2 }
     * 
     */
    public AnnexeD2 createAnnexeD2() {
        return new AnnexeD2();
    }

    /**
     * Create an instance of {@link AnnexeD3 }
     * 
     */
    public AnnexeD3 createAnnexeD3() {
        return new AnnexeD3();
    }

    /**
     * Create an instance of {@link AnnexeD4 }
     * 
     */
    public AnnexeD4 createAnnexeD4() {
        return new AnnexeD4();
    }

    /**
     * Create an instance of {@link TypeOuiNon }
     * 
     */
    public TypeOuiNon createTypeOuiNon() {
        return new TypeOuiNon();
    }

    /**
     * Create an instance of {@link EnumAdjudication }
     * 
     */
    public EnumAdjudication createEnumAdjudication() {
        return new EnumAdjudication();
    }

    /**
     * Create an instance of {@link EnumEntiteAdjudicatrice }
     * 
     */
    public EnumEntiteAdjudicatrice createEnumEntiteAdjudicatrice() {
        return new EnumEntiteAdjudicatrice();
    }

    /**
     * Create an instance of {@link EnumCritereSociauxEtEnvironementaux }
     * 
     */
    public EnumCritereSociauxEtEnvironementaux createEnumCritereSociauxEtEnvironementaux() {
        return new EnumCritereSociauxEtEnvironementaux();
    }

    /**
     * Create an instance of {@link EnumNatureAdresse }
     * 
     */
    public EnumNatureAdresse createEnumNatureAdresse() {
        return new EnumNatureAdresse();
    }

    /**
     * Create an instance of {@link EnumOrganisme }
     * 
     */
    public EnumOrganisme createEnumOrganisme() {
        return new EnumOrganisme();
    }

    /**
     * Create an instance of {@link EnumPouvoirAdjudicateur }
     * 
     */
    public EnumPouvoirAdjudicateur createEnumPouvoirAdjudicateur() {
        return new EnumPouvoirAdjudicateur();
    }

    /**
     * Create an instance of {@link EnumFamille }
     * 
     */
    public EnumFamille createEnumFamille() {
        return new EnumFamille();
    }

    /**
     * Create an instance of {@link EnumPerimetre }
     * 
     */
    public EnumPerimetre createEnumPerimetre() {
        return new EnumPerimetre();
    }

    /**
     * Create an instance of {@link EnumStatut }
     * 
     */
    public EnumStatut createEnumStatut() {
        return new EnumStatut();
    }

    /**
     * Create an instance of {@link Cpv }
     * 
     */
    public Cpv createCpv() {
        return new Cpv();
    }

    /**
     * Create an instance of {@link DureeSystemQualification }
     * 
     */
    public DureeSystemQualification createDureeSystemQualification() {
        return new DureeSystemQualification();
    }

    /**
     * Create an instance of {@link DureeValiditeOffre }
     * 
     */
    public DureeValiditeOffre createDureeValiditeOffre() {
        return new DureeValiditeOffre();
    }

    /**
     * Create an instance of {@link Candidature }
     * 
     */
    public Candidature createCandidature() {
        return new Candidature();
    }

    /**
     * Create an instance of {@link AvisImplique }
     * 
     */
    public AvisImplique createAvisImplique() {
        return new AvisImplique();
    }

    /**
     * Create an instance of {@link EnumAccordCadre }
     * 
     */
    public EnumAccordCadre createEnumAccordCadre() {
        return new EnumAccordCadre();
    }

    /**
     * Create an instance of {@link DIVENLOTSType }
     * 
     */
    public DIVENLOTSType createDIVENLOTSType() {
        return new DIVENLOTSType();
    }

    /**
     * Create an instance of {@link EnumActivitePrincipale }
     * 
     */
    public EnumActivitePrincipale createEnumActivitePrincipale() {
        return new EnumActivitePrincipale();
    }

    /**
     * Create an instance of {@link ReferenceAnterieure }
     * 
     */
    public ReferenceAnterieure createReferenceAnterieure() {
        return new ReferenceAnterieure();
    }

    /**
     * Create an instance of {@link CritereAttribution.CRITERESPONDERES.CRITERE }
     * 
     */
    public CritereAttribution.CRITERESPONDERES.CRITERE createCritereAttributionCRITERESPONDERESCRITERE() {
        return new CritereAttribution.CRITERESPONDERES.CRITERE();
    }

    /**
     * Create an instance of {@link CritereAttribution.CRITERESPRIORITES.CRITERE }
     * 
     */
    public CritereAttribution.CRITERESPRIORITES.CRITERE createCritereAttributionCRITERESPRIORITESCRITERE() {
        return new CritereAttribution.CRITERESPRIORITES.CRITERE();
    }

    /**
     * Create an instance of {@link EnumNature.PREINFORMATION }
     * 
     */
    public EnumNature.PREINFORMATION createEnumNaturePREINFORMATION() {
        return new EnumNature.PREINFORMATION();
    }

    /**
     * Create an instance of {@link EnumNature.APPELOFFRE }
     * 
     */
    public EnumNature.APPELOFFRE createEnumNatureAPPELOFFRE() {
        return new EnumNature.APPELOFFRE();
    }

    /**
     * Create an instance of {@link EnumNature.ATTRIBUTION }
     * 
     */
    public EnumNature.ATTRIBUTION createEnumNatureATTRIBUTION() {
        return new EnumNature.ATTRIBUTION();
    }

    /**
     * Create an instance of {@link EnumNature.QUALIFICATION }
     * 
     */
    public EnumNature.QUALIFICATION createEnumNatureQUALIFICATION() {
        return new EnumNature.QUALIFICATION();
    }

    /**
     * Create an instance of {@link EnumNature.PERIODIQUE }
     * 
     */
    public EnumNature.PERIODIQUE createEnumNaturePERIODIQUE() {
        return new EnumNature.PERIODIQUE();
    }

    /**
     * Create an instance of {@link EnumTypeProcedure.OUVERT }
     * 
     */
    public EnumTypeProcedure.OUVERT createEnumTypeProcedureOUVERT() {
        return new EnumTypeProcedure.OUVERT();
    }

    /**
     * Create an instance of {@link EnumTypeProcedure.RESTREINT }
     * 
     */
    public EnumTypeProcedure.RESTREINT createEnumTypeProcedureRESTREINT() {
        return new EnumTypeProcedure.RESTREINT();
    }

    /**
     * Create an instance of {@link EnumTypeProcedure.NEGOCIE }
     * 
     */
    public EnumTypeProcedure.NEGOCIE createEnumTypeProcedureNEGOCIE() {
        return new EnumTypeProcedure.NEGOCIE();
    }

    /**
     * Create an instance of {@link ConditionParticipation.MARCHERESERVEOUI }
     * 
     */
    public ConditionParticipation.MARCHERESERVEOUI createConditionParticipationMARCHERESERVEOUI() {
        return new ConditionParticipation.MARCHERESERVEOUI();
    }

    /**
     * Create an instance of {@link ConditionParticipation.JUSTIFICATIFSCANDIDAT }
     * 
     */
    public ConditionParticipation.JUSTIFICATIFSCANDIDAT createConditionParticipationJUSTIFICATIFSCANDIDAT() {
        return new ConditionParticipation.JUSTIFICATIFSCANDIDAT();
    }

    /**
     * Create an instance of {@link ConditionMarche.LANGUES }
     * 
     */
    public ConditionMarche.LANGUES createConditionMarcheLANGUES() {
        return new ConditionMarche.LANGUES();
    }

    /**
     * Create an instance of {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONPAPIER }
     * 
     */
    public PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONPAPIER createPubAnterieureREFERENCEPUBLICATIONPUBLICATIONPAPIER() {
        return new PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONPAPIER();
    }

    /**
     * Create an instance of {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE }
     * 
     */
    public PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE createPubAnterieureREFERENCEPUBLICATIONPUBLICATIONELECTRONIQUE() {
        return new PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE();
    }

    /**
     * Create an instance of {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE.NATURE }
     * 
     */
    public PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE.NATURE createPubAnterieureREFERENCEPUBLICATIONPUBLICATIONJOUENATURE() {
        return new PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE.NATURE();
    }

    /**
     * Create an instance of {@link Attribution.JUSTIFICATIONPASCONCURRENCE }
     * 
     */
    public Attribution.JUSTIFICATIONPASCONCURRENCE createAttributionJUSTIFICATIONPASCONCURRENCE() {
        return new Attribution.JUSTIFICATIONPASCONCURRENCE();
    }

    /**
     * Create an instance of {@link Attribution.DECISION.PUBLICATIONJOUE }
     * 
     */
    public Attribution.DECISION.PUBLICATIONJOUE createAttributionDECISIONPUBLICATIONJOUE() {
        return new Attribution.DECISION.PUBLICATIONJOUE();
    }

    /**
     * Create an instance of {@link Renseignement.PRIXACHATOPPORTUNITE }
     * 
     */
    public Renseignement.PRIXACHATOPPORTUNITE createRenseignementPRIXACHATOPPORTUNITE() {
        return new Renseignement.PRIXACHATOPPORTUNITE();
    }

    /**
     * Create an instance of {@link Renseignement.PAYSORIGINE }
     * 
     */
    public Renseignement.PAYSORIGINE createRenseignementPAYSORIGINE() {
        return new Renseignement.PAYSORIGINE();
    }

    /**
     * Create an instance of {@link Renseignement.SOUSTRAITANCEOUI.VALEUR }
     * 
     */
    public Renseignement.SOUSTRAITANCEOUI.VALEUR createRenseignementSOUSTRAITANCEOUIVALEUR() {
        return new Renseignement.SOUSTRAITANCEOUI.VALEUR();
    }

    /**
     * Create an instance of {@link Renseignement.SOUSTRAITANCEOUI.PARTSSTRAITPROCCONC }
     * 
     */
    public Renseignement.SOUSTRAITANCEOUI.PARTSSTRAITPROCCONC createRenseignementSOUSTRAITANCEOUIPARTSSTRAITPROCCONC() {
        return new Renseignement.SOUSTRAITANCEOUI.PARTSSTRAITPROCCONC();
    }

    /**
     * Create an instance of {@link AnnonceAnterieure.REFERENCEPUBLICATION.PUBLICATIONPAPIER }
     * 
     */
    public AnnonceAnterieure.REFERENCEPUBLICATION.PUBLICATIONPAPIER createAnnonceAnterieureREFERENCEPUBLICATIONPUBLICATIONPAPIER() {
        return new AnnonceAnterieure.REFERENCEPUBLICATION.PUBLICATIONPAPIER();
    }

    /**
     * Create an instance of {@link AnnonceAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE }
     * 
     */
    public AnnonceAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE createAnnonceAnterieureREFERENCEPUBLICATIONPUBLICATIONELECTRONIQUE() {
        return new AnnonceAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE();
    }

    /**
     * Create an instance of {@link AnnonceAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE }
     * 
     */
    public AnnonceAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE createAnnonceAnterieureREFERENCEPUBLICATIONPUBLICATIONJOUE() {
        return new AnnonceAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE();
    }

    /**
     * Create an instance of {@link Rectification.TEXTE }
     * 
     */
    public Rectification.TEXTE createRectificationTEXTE() {
        return new Rectification.TEXTE();
    }

    /**
     * Create an instance of {@link Rectification.DATE }
     * 
     */
    public Rectification.DATE createRectificationDATE() {
        return new Rectification.DATE();
    }

    /**
     * Create an instance of {@link Rectification.CPV.INIT }
     * 
     */
    public Rectification.CPV.INIT createRectificationCPVINIT() {
        return new Rectification.CPV.INIT();
    }

    /**
     * Create an instance of {@link Rectification.CPV.LIRE }
     * 
     */
    public Rectification.CPV.LIRE createRectificationCPVLIRE() {
        return new Rectification.CPV.LIRE();
    }

    /**
     * Create an instance of {@link ComplementInformation.ADRESSESCOMPLEMENTAIRES }
     * 
     */
    public ComplementInformation.ADRESSESCOMPLEMENTAIRES createComplementInformationADRESSESCOMPLEMENTAIRES() {
        return new ComplementInformation.ADRESSESCOMPLEMENTAIRES();
    }

    /**
     * Create an instance of {@link ConditionAdministrative.DOCUMENTPAYANTOUI }
     * 
     */
    public ConditionAdministrative.DOCUMENTPAYANTOUI createConditionAdministrativeDOCUMENTPAYANTOUI() {
        return new ConditionAdministrative.DOCUMENTPAYANTOUI();
    }

    /**
     * Create an instance of {@link ReferencePublication.PUBLICATIONELECTRONIQUE }
     * 
     */
    public ReferencePublication.PUBLICATIONELECTRONIQUE createReferencePublicationPUBLICATIONELECTRONIQUE() {
        return new ReferencePublication.PUBLICATIONELECTRONIQUE();
    }

    /**
     * Create an instance of {@link ReferencePublication.PUBLICATIONJOUE }
     * 
     */
    public ReferencePublication.PUBLICATIONJOUE createReferencePublicationPUBLICATIONJOUE() {
        return new ReferencePublication.PUBLICATIONJOUE();
    }

    /**
     * Create an instance of {@link Procedure.MARCHEPERIODIQUEOUI }
     * 
     */
    public Procedure.MARCHEPERIODIQUEOUI createProcedureMARCHEPERIODIQUEOUI() {
        return new Procedure.MARCHEPERIODIQUEOUI();
    }

    /**
     * Create an instance of {@link Criteres.CRITERESPRIX }
     * 
     */
    public Criteres.CRITERESPRIX createCriteresCRITERESPRIX() {
        return new Criteres.CRITERESPRIX();
    }

    /**
     * Create an instance of {@link Criteres.CRITERESCOUT.CRITERE }
     * 
     */
    public Criteres.CRITERESCOUT.CRITERE createCriteresCRITERESCOUTCRITERE() {
        return new Criteres.CRITERESCOUT.CRITERE();
    }

    /**
     * Create an instance of {@link Criteres.CRITERESQUALITE.CRITERE }
     * 
     */
    public Criteres.CRITERESQUALITE.CRITERE createCriteresCRITERESQUALITECRITERE() {
        return new Criteres.CRITERESQUALITE.CRITERE();
    }

    /**
     * Create an instance of {@link Caracteristiques.TABLE.TR }
     * 
     */
    public Caracteristiques.TABLE.TR createCaracteristiquesTABLETR() {
        return new Caracteristiques.TABLE.TR();
    }

    /**
     * Create an instance of {@link AccordCadre.VALEUR }
     * 
     */
    public AccordCadre.VALEUR createAccordCadreVALEUR() {
        return new AccordCadre.VALEUR();
    }

    /**
     * Create an instance of {@link AccordCadre.VALEURMIN }
     * 
     */
    public AccordCadre.VALEURMIN createAccordCadreVALEURMIN() {
        return new AccordCadre.VALEURMIN();
    }

    /**
     * Create an instance of {@link AccordCadre.VALEURMAX }
     * 
     */
    public AccordCadre.VALEURMAX createAccordCadreVALEURMAX() {
        return new AccordCadre.VALEURMAX();
    }

    /**
     * Create an instance of {@link MarcheType.TRAVAUX }
     * 
     */
    public MarcheType.TRAVAUX createMarcheTypeTRAVAUX() {
        return new MarcheType.TRAVAUX();
    }

    /**
     * Create an instance of {@link MarcheType.FOURNITURES }
     * 
     */
    public MarcheType.FOURNITURES createMarcheTypeFOURNITURES() {
        return new MarcheType.FOURNITURES();
    }

    /**
     * Create an instance of {@link ObjetArticle.LOTS }
     * 
     */
    public ObjetArticle.LOTS createObjetArticleLOTS() {
        return new ObjetArticle.LOTS();
    }

    /**
     * Create an instance of {@link Indexation.CLASSES }
     * 
     */
    public Indexation.CLASSES createIndexationCLASSES() {
        return new Indexation.CLASSES();
    }

    /**
     * Create an instance of {@link Indexation.DESCRIPTEURS }
     * 
     */
    public Indexation.DESCRIPTEURS createIndexationDESCRIPTEURS() {
        return new Indexation.DESCRIPTEURS();
    }

    /**
     * Create an instance of {@link Marche.ANNONCEANTERIEUR.REFERENCE }
     * 
     */
    public Marche.ANNONCEANTERIEUR.REFERENCE createMarcheANNONCEANTERIEURREFERENCE() {
        return new Marche.ANNONCEANTERIEUR.REFERENCE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Annonce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANNONCE")
    public JAXBElement<Annonce> createANNONCE(Annonce value) {
        return new JAXBElement<Annonce>(_ANNONCE_QNAME, Annonce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PROD_TRANS_DISTRIB_GAZ", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<Object> createEnumEntiteAdjudicatricePRODTRANSDISTRIBGAZ(Object value) {
        return new JAXBElement<Object>(_EnumEntiteAdjudicatricePRODTRANSDISTRIBGAZ_QNAME, Object.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ELECTRICITE", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<Object> createEnumEntiteAdjudicatriceELECTRICITE(Object value) {
        return new JAXBElement<Object>(_EnumEntiteAdjudicatriceELECTRICITE_QNAME, Object.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PROSP_EXTRACT_PETROLE_GAZ", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<Object> createEnumEntiteAdjudicatricePROSPEXTRACTPETROLEGAZ(Object value) {
        return new JAXBElement<Object>(_EnumEntiteAdjudicatricePROSPEXTRACTPETROLEGAZ_QNAME, Object.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PROSP_EXTRACT_CHARBON_COMB", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<Object> createEnumEntiteAdjudicatricePROSPEXTRACTCHARBONCOMB(Object value) {
        return new JAXBElement<Object>(_EnumEntiteAdjudicatricePROSPEXTRACTCHARBONCOMB_QNAME, Object.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EAU", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<Object> createEnumEntiteAdjudicatriceEAU(Object value) {
        return new JAXBElement<Object>(_EnumEntiteAdjudicatriceEAU_QNAME, Object.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SER_POST", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<Object> createEnumEntiteAdjudicatriceSERPOST(Object value) {
        return new JAXBElement<Object>(_EnumEntiteAdjudicatriceSERPOST_QNAME, Object.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SER_CHEMIN_FER", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<Object> createEnumEntiteAdjudicatriceSERCHEMINFER(Object value) {
        return new JAXBElement<Object>(_EnumEntiteAdjudicatriceSERCHEMINFER_QNAME, Object.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SER_CHEMIN_FER_TRAM_BUS", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<Object> createEnumEntiteAdjudicatriceSERCHEMINFERTRAMBUS(Object value) {
        return new JAXBElement<Object>(_EnumEntiteAdjudicatriceSERCHEMINFERTRAMBUS_QNAME, Object.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACT_PORT", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<Object> createEnumEntiteAdjudicatriceACTPORT(Object value) {
        return new JAXBElement<Object>(_EnumEntiteAdjudicatriceACTPORT_QNAME, Object.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACT_AEROPORT", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<Object> createEnumEntiteAdjudicatriceACTAEROPORT(Object value) {
        return new JAXBElement<Object>(_EnumEntiteAdjudicatriceACTAEROPORT_QNAME, Object.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AUTRE", scope = EnumEntiteAdjudicatrice.class)
    public JAXBElement<String> createEnumEntiteAdjudicatriceAUTRE(String value) {
        return new JAXBElement<String>(_EnumEntiteAdjudicatriceAUTRE_QNAME, String.class, EnumEntiteAdjudicatrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEF", scope = EnumAdjudication.class)
    public JAXBElement<Object> createEnumAdjudicationDEF(Object value) {
        return new JAXBElement<Object>(_EnumAdjudicationDEF_QNAME, Object.class, EnumAdjudication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACT_SERV_ADM_PUB", scope = EnumAdjudication.class)
    public JAXBElement<Object> createEnumAdjudicationACTSERVADMPUB(Object value) {
        return new JAXBElement<Object>(_EnumAdjudicationACTSERVADMPUB_QNAME, Object.class, EnumAdjudication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SANTE", scope = EnumAdjudication.class)
    public JAXBElement<Object> createEnumAdjudicationSANTE(Object value) {
        return new JAXBElement<Object>(_EnumAdjudicationSANTE_QNAME, Object.class, EnumAdjudication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ENVIRONNEMENT", scope = EnumAdjudication.class)
    public JAXBElement<Object> createEnumAdjudicationENVIRONNEMENT(Object value) {
        return new JAXBElement<Object>(_EnumAdjudicationENVIRONNEMENT_QNAME, Object.class, EnumAdjudication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ORDRE_SEC_PUB", scope = EnumAdjudication.class)
    public JAXBElement<Object> createEnumAdjudicationORDRESECPUB(Object value) {
        return new JAXBElement<Object>(_EnumAdjudicationORDRESECPUB_QNAME, Object.class, EnumAdjudication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AFF_ECO_FIN", scope = EnumAdjudication.class)
    public JAXBElement<Object> createEnumAdjudicationAFFECOFIN(Object value) {
        return new JAXBElement<Object>(_EnumAdjudicationAFFECOFIN_QNAME, Object.class, EnumAdjudication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EDUCATION", scope = EnumAdjudication.class)
    public JAXBElement<Object> createEnumAdjudicationEDUCATION(Object value) {
        return new JAXBElement<Object>(_EnumAdjudicationEDUCATION_QNAME, Object.class, EnumAdjudication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOG_DEV_COL", scope = EnumAdjudication.class)
    public JAXBElement<Object> createEnumAdjudicationLOGDEVCOL(Object value) {
        return new JAXBElement<Object>(_EnumAdjudicationLOGDEVCOL_QNAME, Object.class, EnumAdjudication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PROTECTION_SOCIALE", scope = EnumAdjudication.class)
    public JAXBElement<Object> createEnumAdjudicationPROTECTIONSOCIALE(Object value) {
        return new JAXBElement<Object>(_EnumAdjudicationPROTECTIONSOCIALE_QNAME, Object.class, EnumAdjudication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOIS_CULT_REL", scope = EnumAdjudication.class)
    public JAXBElement<Object> createEnumAdjudicationLOISCULTREL(Object value) {
        return new JAXBElement<Object>(_EnumAdjudicationLOISCULTREL_QNAME, Object.class, EnumAdjudication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AUTRE", scope = EnumAdjudication.class)
    public JAXBElement<String> createEnumAdjudicationAUTRE(String value) {
        return new JAXBElement<String>(_EnumEntiteAdjudicatriceAUTRE_QNAME, String.class, EnumAdjudication.class, value);
    }

}
