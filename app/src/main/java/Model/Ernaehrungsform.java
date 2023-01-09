package Model;

import java.util.ArrayList;

public class Ernaehrungsform {

    public enum Ernaehrung {
        VEGETARISCH,
        VEGAN,
        HALAL,
        KOSCHER
    }

    private Ernaehrung name;
    private ArrayList<Produkt> produkt;

    public Ernaehrungsform(Ernaehrung name, ArrayList<Produkt> produkt) {
        this.name = name;
        this.produkt = produkt;
    }

    public Ernaehrung getName() {
        return name;
    }

    public void setName(Ernaehrung name) {
        this.name = name;
    }
    public void addProdukt(Produkt produkt) {
        this.produkt.add(produkt);
    }


}
