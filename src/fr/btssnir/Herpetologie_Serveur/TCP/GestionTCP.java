package fr.btssnir.Herpetologie_Serveur.TCP;

import java.util.ArrayList;

/**
 * Thread qui g�re les diff�rentes Connections
 */
public class GestionTCP {

	private ArrayList<TCP_Serveur> lesConnections;

	public ArrayList<TCP_Serveur> getLesConnections() {
		return this.lesConnections;
	}

	public void setLesConnections(ArrayList<TCP_Serveur> lesConnections) {
		this.lesConnections = lesConnections;
	}

	public void Thread() {
		// TODO - implement GestionTCP.Thread
		throw new UnsupportedOperationException();
	}

}