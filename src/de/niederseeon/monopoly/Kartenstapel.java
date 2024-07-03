package de.niederseeon.monopoly;

import java.util.List;

public class Kartenstapel {
	public static List<Gemeinschaftskarte>gemeinschaftskarten;

	public Kartenstapel() {
		
	}
	public static void addKarte(Gemeinschaftskarte karte) {
		gemeinschaftskarten.add(karte);
	
	}
	public static Gemeinschaftskarte zieheKarte() {
		int anzahlKarten = gemeinschaftskarten.size();
		return gemeinschaftskarten.get(0);
		
	}
}
