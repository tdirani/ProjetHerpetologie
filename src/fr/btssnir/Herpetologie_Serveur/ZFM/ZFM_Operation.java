package fr.btssnir.Herpetologie_Serveur.ZFM;

public class ZFM_Operation {

	private int MS_REFRESH = 500;
	private byte adresse;
	private String portCom;
	private boolean lectureEnCours;

	public int getMS_REFRESH() {
		return this.MS_REFRESH;
	}

	public void setMS_REFRESH(int MS_REFRESH) {
		this.MS_REFRESH = MS_REFRESH;
	}

	public byte getAdresse() {
		return this.adresse;
	}

	public void setAdresse(byte adresse) {
		this.adresse = adresse;
	}

	public String getPortCom() {
		return this.portCom;
	}

	public void setPortCom(String portCom) {
		this.portCom = portCom;
	}

	public boolean isLectureEnCours() {
		return this.lectureEnCours;
	}

	public void setLectureEnCours(boolean lectureEnCours) {
		this.lectureEnCours = lectureEnCours;
	}

	public boolean couperLecture() {
		// TODO - implement ZFM_Operation.couperLecture
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param template1
	 * @param template2
	 * @param template3
	 * @param template4
	 */
	public int deploiementEmpreinte(String template1, String template2, String template3, String template4) {
		// TODO - implement ZFM_Operation.deploiementEmpreinte
		throw new UnsupportedOperationException();
	}

	public boolean lancerLecture() {
		// TODO - implement ZFM_Operation.lancerLecture
		throw new UnsupportedOperationException();
	}

	public int recupCRC16() {
		// TODO - implement ZFM_Operation.recupCRC16
		throw new UnsupportedOperationException();
	}

	public int resetZFM() {
		// TODO - implement ZFM_Operation.resetZFM
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPage
	 */
	public boolean supprimerEmpreinte(int idPage) {
		// TODO - implement ZFM_Operation.supprimerEmpreinte
		throw new UnsupportedOperationException();
	}

	public int trouverPremierEmplacementLibre() {
		// TODO - implement ZFM_Operation.trouverPremierEmplacementLibre
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param crc16
	 */
	public boolean validiteCapteur(int crc16) {
		// TODO - implement ZFM_Operation.validiteCapteur
		throw new UnsupportedOperationException();
	}

}