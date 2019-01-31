package fr.btssnir.Herpetologie_Serveur.ObjetsBDD;

import java.sql.Date;

public class Droit {

	private boolean droActiver;
	private Date droDated;
	private Date droDatef;
	private int droId;
	private Zone droIdzone;
	private String droNomdroit;
	private boolean droTInfini;

	public boolean isDroActiver() {
		return this.droActiver;
	}

	public void setDroActiver(boolean droActiver) {
		this.droActiver = droActiver;
	}

	public Date getDroDated() {
		return this.droDated;
	}

	public void setDroDated(Date droDated) {
		this.droDated = droDated;
	}

	public Date getDroDatef() {
		return this.droDatef;
	}

	public void setDroDatef(Date droDatef) {
		this.droDatef = droDatef;
	}

	public int getDroId() {
		return this.droId;
	}

	public void setDroId(int droId) {
		this.droId = droId;
	}

	public Zone getDroIdzone() {
		return this.droIdzone;
	}

	public void setDroIdzone(Zone droIdzone) {
		this.droIdzone = droIdzone;
	}

	public String getDroNomdroit() {
		return this.droNomdroit;
	}

	public void setDroNomdroit(String droNomdroit) {
		this.droNomdroit = droNomdroit;
	}

	public boolean isDroTInfini() {
		return this.droTInfini;
	}

	public void setDroTInfini(boolean droTInfini) {
		this.droTInfini = droTInfini;
	}

	public Droit() {
		// TODO - implement Droit.Droit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param droActiver
	 * @param droDated
	 * @param droDatef
	 * @param droId
	 * @param droIdzone
	 * @param droNomdroit
	 * @param droTinfini
	 */
	public Droit(boolean droActiver, Date droDated, Date droDatef, int droId, Zone droIdzone, String droNomdroit, boolean droTinfini) {
		// TODO - implement Droit.Droit
		throw new UnsupportedOperationException();
	}

}