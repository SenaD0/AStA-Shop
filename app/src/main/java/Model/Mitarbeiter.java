package Model;

import java.util.ArrayList;

public class Mitarbeiter extends Benutzer {

    public Mitarbeiter(int benutzerID, String benutzername, String email, String passwort, boolean mitarbeiter, ArrayList<Bewertung> bewertung, ArrayList<Produkt> produkt) {
        super(benutzerID, benutzername, email, passwort, mitarbeiter, bewertung, produkt);
    }

    public void setMitarbeiter(Benutzer benutzer) {
        benutzer.setMitarbeiter(true);
    }

    public void addProdukt(String name, int menge, int preis, String allergene) {

    }

    public void bewertungloeschen(Bewertung bewertung) {

    }

}
