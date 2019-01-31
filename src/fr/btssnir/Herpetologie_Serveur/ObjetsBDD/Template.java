package fr.btssnir.Herpetologie_Serveur.ObjetsBDD;

public class Template {

	/**
	 * Etat d'un capteur
	 */
	private boolean temActiver;
	/**
	 * ID du capteur
	 */
	private int temId;
	private Utilisateur temUser;
	private String temTemplate_1;
	private String temTemplate_2;
	private String temTemplate_3;
	private String temTemplate_4;

	public boolean isTemActiver() {
		return this.temActiver;
	}

	public void setTemActiver(boolean temActiver) {
		this.temActiver = temActiver;
	}

	public int getTemId() {
		return this.temId;
	}

	public void setTemId(int temId) {
		this.temId = temId;
	}

	public Utilisateur getTemUser() {
		return this.temUser;
	}

	public void setTemUser(Utilisateur temUser) {
		this.temUser = temUser;
	}

	public String getTemTemplate_1() {
		return this.temTemplate_1;
	}

	public void setTemTemplate_1(String temTemplate_1) {
		this.temTemplate_1 = temTemplate_1;
	}

	public String getTemTemplate_2() {
		return this.temTemplate_2;
	}

	public void setTemTemplate_2(String temTemplate_2) {
		this.temTemplate_2 = temTemplate_2;
	}

	public String getTemTemplate_3() {
		return this.temTemplate_3;
	}

	public void setTemTemplate_3(String temTemplate_3) {
		this.temTemplate_3 = temTemplate_3;
	}

	public String getTemTemplate_4() {
		return this.temTemplate_4;
	}

	public void setTemTemplate_4(String temTemplate_4) {
		this.temTemplate_4 = temTemplate_4;
	}

	public Template() {
		// TODO - implement Template.Template
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param temId
	 * @param temUser
	 * @param temTemplate_1
	 * @param temTemplate_2
	 * @param temTemplate_3
	 * @param temTemplate_4
	 * @param temActiver
	 */
	public Template(int temId, Utilisateur temUser, String temTemplate_1, String temTemplate_2, String temTemplate_3, String temTemplate_4, boolean temActiver) {
		// TODO - implement Template.Template
		throw new UnsupportedOperationException();
	}

}