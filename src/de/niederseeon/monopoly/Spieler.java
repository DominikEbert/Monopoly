package de.niederseeon.monopoly;
import java.util.List;

public class Spieler {

    private String name;
    private int kontostand;

    private Feld position;

    private boolean imGefaengnis;

    private int rundenImGefaengnis;

    private List<Immobilie> immobilien;



    public Spieler(String name) {
        this.name = name;
    }
    
    public Wuerfelergebnis wuerfeln() {
    	Wuerfelergebnis we = new Wuerfelergebnis();
    	System.out.println("Ergebnis: " + we.getGesamtergebnis());
    	return we;
    }


    public void ziehe(int anzahlFelder) {

    }

    public boolean kannImmobilieKaufen(Immobilie immobilie) {
        return true;
    }


    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public Feld getPosition() {
        return position;
    }

    public void setPosition(Feld position) {
        this.position = position;
    }

    public boolean isImGefaengnis() {
        return imGefaengnis;
    }

    public void setImGefaengnis(boolean imGefaengnis) {
        this.imGefaengnis = imGefaengnis;
    }

    public int getRundenImGefaengnis() {
        return rundenImGefaengnis;
    }

    public void setRundenImGefaengnis(int rundenImGefaengnis) {
        this.rundenImGefaengnis = rundenImGefaengnis;
    }

    public List<Immobilie> getImmobilien() {
        return immobilien;
    }

    public void setImmobilien(List<Immobilie> immobilien) {
        this.immobilien = immobilien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		String toString = name + " steht auf Feld " + position + " und hat einen Kontostand von " + kontostand;
		return toString;
	}
    
    
}
