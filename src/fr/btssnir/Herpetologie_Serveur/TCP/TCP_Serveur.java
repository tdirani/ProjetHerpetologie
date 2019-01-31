package fr.btssnir.Herpetologie_Serveur.TCP;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCP_Serveur {

	private int port;
	private InetAddress serveur;
	private Socket socket;
	private boolean marche = false;
	private boolean connection = false;
	private BufferedReader in;
	private PrintStream out;

	/**
	 *
	 */

	//maybe besoin de socket, dependant du constructeur
	public boolean connection() {
		// TODO - implement TCP_Serveur.connection
		throw new UnsupportedOperationException();
	}

	public boolean deconnection() {
		// TODO - implement TCP_Serveur.deconnection
		throw new UnsupportedOperationException();
	}

	public void requete() {
		// TODO - implement TCP_Serveur.requete
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param message
	 */
	public void envoiMessage(String message) {
		// TODO - implement TCP_Serveur.envoiMessage
		throw new UnsupportedOperationException();
	}

}