package fr.btssnir.Herpetologie_Serveur.ObjetsBDD;

public class Porte {

	/**
	 * Etat de la porte
	 */
	private boolean porActiver;
	private String porAddress;
	private int porId;
	private Zone porZone;

	public boolean isPorActiver() {
		return this.porActiver;
	}

	public void setPorActiver(boolean porActiver) {
		this.porActiver = porActiver;
	}

	public String getPorAddress() {
		return this.porAddress;
	}

	public void setPorAddress(String porAddress) {
		this.porAddress = porAddress;
	}

	public int getPorId() {
		return this.porId;
	}

	public void setPorId(int porId) {
		this.porId = porId;
	}

	public Zone getPorZone() {
		return this.porZone;
	}

	public void setPorZone(Zone porZone) {
		this.porZone = porZone;
	}

	public Porte() {
		// TODO - implement Porte.Porte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param porAddress
	 * @param porActiver
	 * @param porZone
	 * @param porId
	 */
	public Porte(String porAddress, boolean porActiver, Zone porZone, int porId) {
		// TODO - implement Porte.Porte
		throw new UnsupportedOperationException();
	}

}