package com.x.api.strategies;

import fr.gouv.api.Boamp_v230.EnumCodePays;

public class Strategy2 {

	public Strategy2() {
		super();
	}

	public void execute(fr.gouv.api.Boamp_v010.Annonce avis) {
		System.out.println(avis.getNomTitulaire());
	}

	public void execute(fr.gouv.api.Boamp_v110.Annonce avis) {
		System.out.println(avis.getGESTION().getRAPPEL().getDEPORIGIN());
	}

	public void execute(fr.gouv.api.Boamp_v230.Annonce avis) {
		// GESTION
		avis.getGESTION().getREFERENCE().getIDWEB();
		avis.getGESTION().getREFERENCE().getTYPEAVIS().getFAMILLE(); // .... 5 litéraux
		avis.getGESTION().getREFERENCE().getTYPEAVIS().getPERIMETRE(); // . 10 litéraux
		avis.getGESTION().getREFERENCE().getTYPEAVIS().getNATURE(); // .... 30 litéraux
		avis.getGESTION().getREFERENCE().getTYPEAVIS().getSTATUT(); // ..... 4 litéraux

		// bonne pratique !
		EnumCodePays pays = avis.getDONNEES().getIDENTITE().getPAYS();
		pays.value(); // une énum

		avis.getGESTION().getMARCHE().getIDMARCHE();
		avis.getGESTION().getMARCHE().getIDCONSULTATION();
		avis.getGESTION().getMARCHE().getURLCONSULTATION();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCE().getIDWEB();

		// Mauvaise pratique !
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCE().getTYPEAVIS().getFAMILLE(); // .... 5 litéraux
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCE().getTYPEAVIS().getPERIMETRE(); // . 10 litéraux
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCE().getTYPEAVIS().getNATURE(); // .... 30 litéraux
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCE().getTYPEAVIS().getSTATUT(); // ..... 4 litéraux
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCE().getDATEENVOI();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONPAPIER().get(0).getTYPEEDITION();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONPAPIER().get(0).getNUMPARUTION();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONPAPIER().get(0).getNUMANNONCE();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONPAPIER().get(0).getDATEPUBLICATION();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONPAPIER().get(0).getDATEFINDIFFUSION();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONELECTRONIQUE().getDATEPUBLICATION();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONELECTRONIQUE().getDATEFINDIFFUSION();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONJOUE().getANNEE();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONJOUE().getNUMPARUTION();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONJOUE().getNUMANNONCE();
		avis.getGESTION().getMARCHE().getANNONCEANTERIEUR().get(0).getREFERENCEPUBLICATION().get(0).getPUBLICATIONJOUE().getDATEPUBLICATION();
		avis.getGESTION().getNOMHTML();
		avis.getGESTION().getINDEXATION().getDATEPUBLICATION();
		avis.getGESTION().getINDEXATION().getDATELIMITEREPONSE();
		avis.getGESTION().getINDEXATION().getDATEFINDIFFUSION();
		avis.getGESTION().getINDEXATION().getCLASSES();
		avis.getGESTION().getINDEXATION().getCLASSES().getCLASSE().get(0).getCODE();
		avis.getGESTION().getINDEXATION().getCLASSES().getCLASSE().get(0).getLIBELLE();
		avis.getGESTION().getINDEXATION().getDESCRIPTEURS().getDESCRIPTEUR().get(0).getCODE();
		avis.getGESTION().getINDEXATION().getDESCRIPTEURS().getDESCRIPTEUR().get(0).getLIBELLE();
		avis.getGESTION().getINDEXATION().getCRITERESSOCIAUXENV();// .... 2 litéraux
		avis.getGESTION().getINDEXATION().getDEPPUBLICATION();
		avis.getGESTION().getINDEXATION().getDEPPRESTATION();
		avis.getGESTION().getINDEXATION().getDESCRIPTEURS();

		// DONNEES
		avis.getDONNEES().getIDENTITE().getDENOMINATION();
		avis.getDONNEES().getIDENTITE().getCODEIDENTNATIONAL();
		avis.getDONNEES().getIDENTITE().getCORRESPONDANT();
		avis.getDONNEES().getIDENTITE().getCONTACT();
		avis.getDONNEES().getIDENTITE().getADJUDICATEURNUTS();
		avis.getDONNEES().getIDENTITE().getADRESSE();
		avis.getDONNEES().getIDENTITE().getCP();
		avis.getDONNEES().getIDENTITE().getVILLE();
		avis.getDONNEES().getIDENTITE().getPAYS();
		avis.getDONNEES().getIDENTITE().getTEL();
		avis.getDONNEES().getIDENTITE().getPOSTE();
		avis.getDONNEES().getIDENTITE().getFAX();
		avis.getDONNEES().getIDENTITE().getMEL();
		avis.getDONNEES().getIDENTITE().getURL();
		avis.getDONNEES().getIDENTITE().getAGITPOURAUTRECOMPTEOUI(); // boolean
		avis.getDONNEES().getIDENTITE().getAGITPOURAUTRECOMPTENON(); // boolean
		avis.getDONNEES().getIDENTITE().getLOICOMPTEAUTREPAYS(); // ???
		avis.getDONNEES().getIDENTITE().getORGANISMEACHETEURCENTRALOUI();// boolean
		avis.getDONNEES().getIDENTITE().getORGANISMEACHETEURCENTRALNON();// boolean
		avis.getDONNEES().getTYPEORGANISME();// .... 8 litéraux
		avis.getDONNEES().getTYPEPOUVOIRADJUDICATEUR();// .... 7 litéraux
		avis.getDONNEES().getACTIVITEPRINCIPALE().getPOUVOIRADJUDICATEUR().getDEFOrACTSERVADMPUBOrSANTE(); // INUTILISABLE
		avis.getDONNEES().getOBJET().get(0).getTITREMARCHE();
		avis.getDONNEES().getOBJET().get(0).getREFMARCHE();
		avis.getDONNEES().getOBJET().get(0).getTYPEMARCHE().getTRAVAUX().getEXECUTION();
		avis.getDONNEES().getOBJET().get(0).getTYPEMARCHE().getTRAVAUX().getCONCEPTREALISATION();
		avis.getDONNEES().getOBJET().get(0).getTYPEMARCHE().getTRAVAUX().getEXECUTIONOUVRAGE();
		avis.getDONNEES().getOBJET().get(0).getTYPEMARCHE().getFOURNITURES().getACHAT();
		avis.getDONNEES().getOBJET().get(0).getTYPEMARCHE().getFOURNITURES().getLOC();
		avis.getDONNEES().getOBJET().get(0).getTYPEMARCHE().getFOURNITURES().getCREDITBAIL();
		avis.getDONNEES().getOBJET().get(0).getTYPEMARCHE().getFOURNITURES().getLOCVENTE();
		avis.getDONNEES().getOBJET().get(0).getTYPEMARCHE().getFOURNITURES().getPLUSIEURSFORMES();
		avis.getDONNEES().getOBJET().get(0).getTYPEMARCHE().getSERVICE();
		avis.getDONNEES().getOBJET().get(0).getOBJETCOMPLET();

		// *********************************** GESTION DES BOOLEANS _OUI _NON **********************************
		Boolean commandeElectronique = null;
		boolean oui = avis.getDONNEES().getRENSEIGNEMENTSCOMPLEMENTAIRES().getCOMMANDEELECTRONIQUEOUI() != null;
		boolean non = avis.getDONNEES().getRENSEIGNEMENTSCOMPLEMENTAIRES().getCOMMANDEELECTRONIQUENON() != null;

		if (!oui && !non) {
			System.out.println("L'annonce ne présice pas le type de commande");
		}
		else if (oui)
			commandeElectronique = true;
		else if (non)
			commandeElectronique = false;

		if (commandeElectronique)
			System.out.println("L'annonce est passée par une commende électronique");
		else
			System.out.println("L'annonce n'est pas passée par une commende électronique");
		// ******************************************************************************************
	}
}
