package fr.btssnir.Herpetologie_Serveur.ObjetsBDD;

import java.util.ArrayList;

public class Groupe {

	private boolean grpActiver;
	private int grpId;
	private String grpNomgroupe;
	private ArrayList<Droit> grpLien;

	public boolean isGrpActiver() {
		return this.grpActiver;
	}

	public void setGrpActiver(boolean grpActiver) {
		this.grpActiver = grpActiver;
	}

	public int getGrpId() {
		return this.grpId;
	}

	public void setGrpId(int grpId) {
		this.grpId = grpId;
	}

	public String getGrpNomgroupe() {
		return this.grpNomgroupe;
	}

	public void setGrpNomgroupe(String grpNomgroupe) {
		this.grpNomgroupe = grpNomgroupe;
	}

	public ArrayList<Droit> getGrpLien() {
		return this.grpLien;
	}

	public void setGrpLien(ArrayList<Droit> grpLien) {
		this.grpLien = grpLien;
	}

	public Groupe() {
		// TODO - implement Groupe.Groupe
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param grpActiver
	 * @param grpId
	 * @param grpNomgroupe
	 */
	public Groupe(boolean grpActiver, int grpId, String grpNomgroupe) {
		// TODO - implement Groupe.Groupe
		throw new UnsupportedOperationException();
	}

}