package fr.btssnir.Herpetologie_Serveur.ObjetsBDD;

import fr.btssnir.Herpetologie_Serveur.ZFM.CRC16;

import java.util.ArrayList;

public class Capteur {

	private boolean capActiver;
	private String capAddress;
	private int capId;
	private CRC16 capIdCRC16;
	private Porte capIdPorte;
	private int capIpRpi;
	private String capCom;
	private ArrayList<Template> capTemplates;

	public boolean isCapActiver() {
		return this.capActiver;
	}

	public void setCapActiver(boolean capActiver) {
		this.capActiver = capActiver;
	}

	public String getCapAddress() {
		return this.capAddress;
	}

	public void setCapAddress(String capAddress) {
		this.capAddress = capAddress;
	}

	public int getCapId() {
		return this.capId;
	}

	public void setCapId(int capId) {
		this.capId = capId;
	}

	public CRC16 getCapIdCRC16() {
		return this.capIdCRC16;
	}

	public void setCapIdCRC16(CRC16 capIdCRC16) {
		this.capIdCRC16 = capIdCRC16;
	}

	public Porte getCapIdPorte() {
		return this.capIdPorte;
	}

	public void setCapIdPorte(Porte capIdPorte) {
		this.capIdPorte = capIdPorte;
	}

	public int getCapIpRpi() {
		return this.capIpRpi;
	}

	public void setCapIpRpi(int capIpRpi) {
		this.capIpRpi = capIpRpi;
	}

	public String getCapCom() {
		return this.capCom;
	}

	public void setCapCom(String capCom) {
		this.capCom = capCom;
	}

	public ArrayList<Template> getCapTemplates() {
		return this.capTemplates;
	}

	public void setCapTemplates(ArrayList<Template> capTemplates) {
		this.capTemplates = capTemplates;
	}

	public Capteur() {
		// TODO - implement Capteur.Capteur
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param capActiver
	 * @param capCom
	 * @param capIdCRC16
	 * @param capIprpi
	 * @param capIdPorte
	 * @param capId
	 */
	public Capteur(boolean capActiver, String capCom, CRC16 capIdCRC16, int capIprpi, Porte capIdPorte, int capId) {
		// TODO - implement Capteur.Capteur
		throw new UnsupportedOperationException();
	}

}