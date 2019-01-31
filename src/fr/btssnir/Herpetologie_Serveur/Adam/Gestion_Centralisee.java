package fr.btssnir.Herpetologie_Serveur.Adam;

import fr.btssnir.Herpetologie_Serveur.BDD.Gestion_Acces;
import fr.btssnir.Herpetologie_Serveur.ObjetsBDD.*;
import fr.btssnir.Herpetologie_Serveur.TCP.TCP_Serveur;

import java.util.ArrayList;

public class Gestion_Centralisee {

	private ArrayList<Capteur> alCapteurs;
	private ArrayList<Utilisateur> alUtilisateurs;
	private ArrayList<Porte> alPortes;
	private ArrayList<Zone> alZones;
	private ArrayList<Groupe> alGroupe;
	private ArrayList<Droit> alDroits;
	private LiaisonAdam liaisonAdam;
	private Gestion_Acces connecteur;
	private TCP_Serveur tcp;

	public ArrayList<Capteur> getAlCapteurs() {
		return this.alCapteurs;
	}

	public void setAlCapteurs(ArrayList<Capteur> alCapteurs) {
		this.alCapteurs = alCapteurs;
	}

	public ArrayList<Utilisateur> getAlUtilisateurs() {
		return this.alUtilisateurs;
	}

	public void setAlUtilisateurs(ArrayList<Utilisateur> alUtilisateurs) {
		this.alUtilisateurs = alUtilisateurs;
	}

	public ArrayList<Porte> getAlPortes() {
		return this.alPortes;
	}

	public void setAlPortes(ArrayList<Porte> alPortes) {
		this.alPortes = alPortes;
	}

	public ArrayList<Zone> getAlZones() {
		return this.alZones;
	}

	public void setAlZones(ArrayList<Zone> alZones) {
		this.alZones = alZones;
	}

	public ArrayList<Groupe> getAlGroupe() {
		return this.alGroupe;
	}

	public void setAlGroupe(ArrayList<Groupe> alGroupe) {
		this.alGroupe = alGroupe;
	}

	public ArrayList<Droit> getAlDroits() {
		return this.alDroits;
	}

	public void setAlDroits(ArrayList<Droit> alDroits) {
		this.alDroits = alDroits;
	}

	public LiaisonAdam getLiaisonAdam() {
		return this.liaisonAdam;
	}

	public void setLiaisonAdam(LiaisonAdam liaisonAdam) {
		this.liaisonAdam = liaisonAdam;
	}

	public Gestion_Acces getConnecteur() {
		return this.connecteur;
	}

	public void setConnecteur(Gestion_Acces connecteur) {
		this.connecteur = connecteur;
	}

	public ArrayList<Template> triTemplates() {
		// TODO - implement Gestion_Centralisee.triTemplates
		throw new UnsupportedOperationException();
	}

	public ArrayList<Capteur> listerCapteurs() {
		// TODO - implement Gestion_Centralisee.listerCapteurs
		throw new UnsupportedOperationException();
	}

	public boolean activerPorte() {
		// TODO - implement Gestion_Centralisee.activerPorte
		throw new UnsupportedOperationException();
	}

	public ArrayList<Zone> listerZones() {
		// TODO - implement Gestion_Centralisee.listerZones
		throw new UnsupportedOperationException();
	}

	public boolean activerGroupe() {
		// TODO - implement Gestion_Centralisee.activerGroupe
		throw new UnsupportedOperationException();
	}

	public ArrayList<Groupe> listerGroupes() {
		// TODO - implement Gestion_Centralisee.listerGroupes
		throw new UnsupportedOperationException();
	}

	public ArrayList<Droit> listerDroits() {
		// TODO - implement Gestion_Centralisee.listerDroits
		throw new UnsupportedOperationException();
	}

	public boolean activerDroits() {
		// TODO - implement Gestion_Centralisee.activerDroits
		throw new UnsupportedOperationException();
	}

}