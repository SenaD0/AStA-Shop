package Model;

import java.util.ArrayList;

public class Mitarbeiter extends Benutzer {
    int id = 0; //da wir keine Datenbank führen

    public Mitarbeiter(int benutzerID, String benutzername, String email, String passwort, boolean mitarbeiter, ArrayList<Bewertung> bewertung, ArrayList<Produkt> produkt) {
        super(benutzerID, benutzername, email, passwort, mitarbeiter, bewertung, produkt);
    }

    public void setMitarbeiter(Benutzer benutzer) {
        benutzer.setMitarbeiter(true);
    }

    public void addProdukt(String name, int menge, int preis, String allergene, ArrayList<Ernaehrungsform.Ernaehrung> ernaehrungsformen) {
        id++;
        new Produkt(menge, name, id, preis, allergene, new ArrayList<>(), ernaehrungsformen);
    }

    public void bewertungloeschen(Bewertung bewertung) {

    }

}
