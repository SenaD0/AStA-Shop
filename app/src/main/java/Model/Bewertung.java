package Model;

public class Bewertung {

	private int anzahlSterne;
	private int bewertungID;
	private Produkt produkt;
	private Benutzer benutzer;
	private String kommentar;

	public Bewertung(int anzahlSterne, int bewertungID, Produkt produkt, Benutzer benutzer, String kommentar) {
		this.anzahlSterne = anzahlSterne;
		this.bewertungID = bewertungID;
		this.produkt = produkt;
		this.benutzer = benutzer;
		this.kommentar = kommentar;
	}
	public Bewertung(int anzahlSterne, int bewertungID, Produkt produkt, Benutzer benutzer) {
		this.anzahlSterne = anzahlSterne;
		this.bewertungID = bewertungID;
		this.produkt = produkt;
		this.benutzer = benutzer;
		this.kommentar = "";
	}

	public int getBewertungID() {
		return bewertungID;
	}

	public void setSterne(int anzahlSterne) {
		this.anzahlSterne = anzahlSterne;
	}

	public int getSterne() {
		return anzahlSterne;
	}

	public String getKommentar() {
		return kommentar;
	}

}
