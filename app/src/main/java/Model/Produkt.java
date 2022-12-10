package Model;

import java.util.ArrayList;

public class Produkt {

	private int menge;
	private String name;
	private int produktID;
	private int preis;
	private String allergene;
	private ArrayList<Bewertung> bewertung;
	private ArrayList<Ernaehrungsform> ernaehrungsformen;

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

	public void selectZutaten() {

	}

	public Zutaten getZutaten() {
		return null;
	}

	public ArrayList<Ernaehrungsform> getErnährungsformen() {
		return ernaehrungsformen;
	}

	public void getBewertung() {

	}

}
