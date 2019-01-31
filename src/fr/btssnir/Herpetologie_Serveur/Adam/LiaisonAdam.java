package fr.btssnir.Herpetologie_Serveur.Adam;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class LiaisonAdam {

	private int transactionIdentifier = 0;
	public boolean threadMarche = false;
	public boolean sorties;
	private Socket socket;
	private int protocoleIdentifieur;
	private OutputStream output;
	private InputStream input;
	private boolean entrees;
	private SocketAddress adrSocket;
	private int adrMAC;
	private InetAddress adrIpAdam;
	private String adrIP;
	private byte adrEsclave;

	public boolean connexion() {
		// TODO - implement LiaisonAdam.connexion
		throw new UnsupportedOperationException();
	}

	public void deconnexion() {
		// TODO - implement LiaisonAdam.deconnexion
		throw new UnsupportedOperationException();
	}

	public void genererIdentifieurTransaction() {
		// TODO - implement LiaisonAdam.genererIdentifieurTransaction
		throw new UnsupportedOperationException();
	}

	public void lectureEntrees() {
		// TODO - implement LiaisonAdam.lectureEntrees
		throw new UnsupportedOperationException();
	}

	public void lectureSorties() {
		// TODO - implement LiaisonAdam.lectureSorties
		throw new UnsupportedOperationException();
	}

	public void ecritureSortie() {
		// TODO - implement LiaisonAdam.ecritureSortie
		throw new UnsupportedOperationException();
	}

	public boolean encapsulationModbus() {
		// TODO - implement LiaisonAdam.encapsulationModbus
		throw new UnsupportedOperationException();
	}

}