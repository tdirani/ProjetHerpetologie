package fr.btssnir.Herpetologie_Serveur.ZFM;

public class ZFM_Driver {

	private byte adresse;

	public byte getAdresse() {
		return this.adresse;
	}

	public void setAdresse(byte adresse) {
		this.adresse = adresse;
	}

	/**
	 * Confirme la connexion avec le capteur
	 */
	public byte handshake() {
		// TODO - implement ZFM_Driver.handshake
		throw new UnsupportedOperationException();
	}

	/**
	 * Configure l'adresse du capteur
	 * @param adresse
	 */
	public byte setAdder(byte[] adresse) {
		// TODO - implement ZFM_Driver.setAdder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Parametre
	 * @param contenu
	 */
	public byte setSysPara(byte Parametre, byte contenu) {
		// TODO - implement ZFM_Driver.setSysPara
		throw new UnsupportedOperationException();
	}

	/**
	 * retourne les parametres du capteur
	 */
	public byte[] readSysPara() {
		// TODO - implement ZFM_Driver.readSysPara
		throw new UnsupportedOperationException();
	}

	public int templateNum() {
		// TODO - implement ZFM_Driver.templateNum
		throw new UnsupportedOperationException();
	}

	/**
	 * detecting finger and store the detected finger image in ImageBuffer while returning successfull confirmation code; If there is no finger, returned confirmation code would be �can�t detect finger�.
	 */
	public byte genImg() {
		// TODO - implement ZFM_Driver.genImg
		throw new UnsupportedOperationException();
	}

	/**
	 * to upload the image in ImgBuffer to upper computer
	 */
	public byte upImage() {
		// TODO - implement ZFM_Driver.upImage
		throw new UnsupportedOperationException();
	}

	/**
	 * to download image from upper computer to Img_Buffer
	 */
	public byte downImage() {
		// TODO - implement ZFM_Driver.downImage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param bufferID
	 */
	public byte img2Tz(byte bufferID) {
		// TODO - implement ZFM_Driver.img2Tz
		throw new UnsupportedOperationException();
	}

	public byte regModel() {
		// TODO - implement ZFM_Driver.regModel
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param bufferID
	 */
	public byte upChar(byte bufferID) {
		// TODO - implement ZFM_Driver.upChar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param bufferId
	 */
	public byte downChar(byte bufferId) {
		// TODO - implement ZFM_Driver.downChar
		throw new UnsupportedOperationException();
	}

	/**
	 * to store the template of specified buffer (Buffer1/Buffer2) at the designated location of Flash library.
	 * @param bufferID
	 * @param pageID
	 */
	public byte store(byte bufferID, byte[] pageID) {
		// TODO - implement ZFM_Driver.store
		throw new UnsupportedOperationException();
	}

	/**
	 * to load template at the specified location (PageID) of Flash library to template buffer CharBuffer1/CharBuffer2 Input 
	 * @param bufferID
	 * @param pageID
	 */
	public void loadChar(byte bufferID, byte[] pageID) {
		// TODO - implement ZFM_Driver.loadChar
		throw new UnsupportedOperationException();
	}

	/**
	 * to delete a segment (N) of templates of Flash library started from the specified location (or PageID); 
	 * @param pageID
	 * @param nombreDeTemplate
	 */
	public byte deleteChar(byte[] pageID, int nombreDeTemplate) {
		// TODO - implement ZFM_Driver.deleteChar
		throw new UnsupportedOperationException();
	}

	public byte empty() {
		// TODO - implement ZFM_Driver.empty
		throw new UnsupportedOperationException();
	}

	public byte[] match() {
		// TODO - implement ZFM_Driver.match
		throw new UnsupportedOperationException();
	}

	/**
	 * to search the whole finger library for the template that matches the one in CharBuffer1 or CharBuffer2. When found, PageID will be returned. 
	 * @param bufferID
	 * @param startPage
	 * @param pageID
	 */
	public void search(byte bufferID, int startPage, int pageID) {
		// TODO - implement ZFM_Driver.search
		throw new UnsupportedOperationException();
	}

	public byte getRandomCode() {
		// TODO - implement ZFM_Driver.getRandomCode
		throw new UnsupportedOperationException();
	}

	/**
	 * for upper computer to write data to the specified Flash page (refer to 4.1 for more about Note pad)
	 * @param notePageNum
	 * @param dataContent un tableau de 64 byte (byte[64])
	 */
	public byte writeNotepad(int notePageNum, byte[] dataContent) {
		// TODO - implement ZFM_Driver.writeNotepad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pageID
	 */
	public byte[] readNotepad(int pageID) {
		// TODO - implement ZFM_Driver.readNotepad
		throw new UnsupportedOperationException();
	}

}