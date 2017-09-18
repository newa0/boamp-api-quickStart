package com.x.api.strategies;

public interface Strategy {

	public void execute(fr.gouv.api.Boamp_v010.Annonce avis);

	public void execute(fr.gouv.api.Boamp_v110.Annonce avis);

	public void execute(fr.gouv.api.Boamp_v230.Annonce avis);
}
