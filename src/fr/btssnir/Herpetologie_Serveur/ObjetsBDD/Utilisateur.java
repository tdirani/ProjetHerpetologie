package fr.btssnir.Herpetologie_Serveur.ObjetsBDD;

public class Utilisateur {

	private boolean useActiver;
	private String useEmail;
	private int useId;
	private String useNom;
	private String usePrenom;
	private String useTelephone;

	public boolean isUseActiver() {
		return this.useActiver;
	}

	public void setUseActiver(boolean useActiver) {
		this.useActiver = useActiver;
	}

	public String getUseEmail() {
		return this.useEmail;
	}

	public void setUseEmail(String useEmail) {
		this.useEmail = useEmail;
	}

	public int getUseId() {
		return this.useId;
	}

	public void setUseId(int useId) {
		this.useId = useId;
	}

	public String getUseNom() {
		return this.useNom;
	}

	public void setUseNom(String useNom) {
		this.useNom = useNom;
	}

	public String getUsePrenom() {
		return this.usePrenom;
	}

	public void setUsePrenom(String usePrenom) {
		this.usePrenom = usePrenom;
	}

	public String getUseTelephone() {
		return this.useTelephone;
	}

	public void setUseTelephone(String useTelephone) {
		this.useTelephone = useTelephone;
	}

	public Utilisateur() {
		// TODO - implement Utilisateur.Utilisateur
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param useActiver
	 * @param useEmail
	 * @param useId
	 * @param useNom
	 * @param usePrenom
	 * @param useTelephone
	 */
	public Utilisateur(boolean useActiver, String useEmail, int useId, String useNom, String usePrenom, String useTelephone) {
		// TODO - implement Utilisateur.Utilisateur
		throw new UnsupportedOperationException();
	}

}