package de.niederseeon.monopoly;

/**
 * Klasse Immobilie. Eigentlich keine Immobilie im klassischen Sinn, sondern ein
 * kaufbares Feld, z.B Straßen, Bahnhöfe,...
 */
public class Immobilie {
	int kaufpreis;
    Spieler besitzer;
	/**
	 * Konstruktor für Immobilien.
	 */
	public Immobilie() {

	}
	public int getKaufpreis() {
		return kaufpreis;
	}
	public void setKaufpreis(int kaufpreis) {
		this.kaufpreis = kaufpreis;
	}
	public Spieler getBesitzer() {
		return besitzer;
	}
	public void setBesitzer(Spieler besitzer) {
		this.besitzer = besitzer;
	}
}
