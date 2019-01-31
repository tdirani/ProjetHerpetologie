package fr.btssnir.Herpetologie_Serveur.ObjetsBDD;

public class Zone {

	private boolean zonActiver;
	private int zonId;
	private String zonNom;

	public boolean isZonActiver() {
		return this.zonActiver;
	}

	public void setZonActiver(boolean zonActiver) {
		this.zonActiver = zonActiver;
	}

	public int getZonId() {
		return this.zonId;
	}

	public void setZonId(int zonId) {
		this.zonId = zonId;
	}

	public String getZonNom() {
		return this.zonNom;
	}

	public void setZonNom(String zonNom) {
		this.zonNom = zonNom;
	}

	public Zone() {
		// TODO - implement Zone.Zone
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param zonActiver
	 * @param zonId
	 * @param zonNom
	 */
	public Zone(boolean zonActiver, int zonId, String zonNom) {
		// TODO - implement Zone.Zone
		throw new UnsupportedOperationException();
	}

}