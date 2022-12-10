package Model;

public class Kunde extends Benutzer {

	public Kunde() {
		super(benutzerID, benutzername, email, passwort, mitarbeiter, bewertung, produkt);
	}

	public void bewerteProdukt(Produkt Produkt, int Sterne, Kommentar Kommentar) {

	}

	public void produktReservieren(Produkt Produkt) {

	}

	public Produkt getReservierteProdukte() {
		return null;
	}

}
