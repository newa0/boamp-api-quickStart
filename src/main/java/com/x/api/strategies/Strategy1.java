package com.x.api.strategies;

public class Strategy1 implements Strategy {

	public Strategy1() {
		super();
	}

	public void execute(fr.gouv.api.Boamp_v010.Annonce avis) {
		System.out.println(avis.getNomTitulaire());
		System.out.println(avis.toString());
	}

	public void execute(fr.gouv.api.Boamp_v110.Annonce avis) {
		System.out.println(avis.toString());

	}

	public void execute(fr.gouv.api.Boamp_v230.Annonce avis) {
		System.out.println(avis.toString());

	}
}
