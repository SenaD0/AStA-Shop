package Model;

import java.util.ArrayList;

public class Ernaehrungsform {

    private String name;
    //private ArrayList<Produkt> produkt;

    public Ernaehrungsform(String name) {
        this.name = name;
    }

    public static final Ernaehrungsform VEGETARISCH = new Ernaehrungsform("vegetarisch");
    public static final Ernaehrungsform VEGAN = new Ernaehrungsform("vegan");
    public static final Ernaehrungsform HALAL = new Ernaehrungsform("halal");
    public static final Ernaehrungsform KOSCHER = new Ernaehrungsform("koscher");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
