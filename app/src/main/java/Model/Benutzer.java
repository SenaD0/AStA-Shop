package Model;

import java.util.ArrayList;

public class Benutzer {

    private final int benutzerID;
    private String benutzername;
    private String email;
    private String passwort;
    private boolean mitarbeiter;
    private ArrayList<Bewertung> bewertung;
    private ArrayList<Produkt> produkt; //ist das für Reservierungen?

    public Benutzer(int benutzerID, String benutzername, String email, String passwort, boolean mitarbeiter, ArrayList<Bewertung> bewertung, ArrayList<Produkt> produkt) {
        this.benutzerID = benutzerID;
        this.benutzername = benutzername;
        this.email = email;
        this.passwort = passwort;
        this.mitarbeiter = mitarbeiter;
        this.bewertung = bewertung;
        this.produkt = produkt;
    }


    public int getBenutzerID() {
        return benutzerID;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email) {
        this.email = email;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public boolean getMitarbeiter() {
        return mitarbeiter;
    }
    //neu:
    public void setMitarbeiter(boolean mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public void setBewertung(Bewertung bewertung) {
        this.bewertung.add(bewertung);
    }

}
