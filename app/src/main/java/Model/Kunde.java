package Model;

import java.util.ArrayList;

public class Kunde extends Benutzer {

    public Kunde(int benutzerID, String benutzername, String email, String passwort, boolean mitarbeiter, ArrayList<Bewertung> bewertung, ArrayList<Produkt> produkt) {
        super(benutzerID, benutzername, email, passwort, mitarbeiter, bewertung, produkt);
    }

    public void bewerteProdukt(int sterne, int bewertungID, Produkt produkt, String kommentar) {
        setBewertung(new Bewertung(sterne, bewertungID, produkt, this, kommentar));
    }

    public void produktReservieren(Produkt Produkt) {

    }

    public Produkt getReservierteProdukte() {
        return null;
    }

}
