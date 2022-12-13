package Model;

import java.util.ArrayList;

public class Produkt {

    private int menge;
    private String name;
    private final int produktID;
    private int preis;
    private String allergene;
    private ArrayList<Bewertung> bewertung;
    private ArrayList<Ernaehrungsform> ernaehrungsformen;

    public Produkt(int menge, String name, int produktID, int preis, String allergene, ArrayList<Bewertung> bewertung, ArrayList<Ernaehrungsform> ernaehrungsformen) {
        this.menge = menge;
        this.name = name;
        this.produktID = produktID;
        this.preis = preis;
        this.allergene = allergene;
        this.bewertung = bewertung;
        this.ernaehrungsformen = ernaehrungsformen;
    }

    public int getProduktID() {
        return produktID;
    }

    public String getAllergene() {
        return allergene;
    }

    public void setAllergene(String allergene) {
        this.allergene = allergene;
    }

    public void selectErnaehrungsform(Ernaehrungsform ernaehrungsform) {
        this.ernaehrungsformen.add(ernaehrungsform);
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public ArrayList<Ernaehrungsform> getErnaehrungsformen() {
        return ernaehrungsformen;
    }

    public ArrayList<Bewertung> getBewertung() {
        return bewertung;
    }

}
