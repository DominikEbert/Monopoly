package de.niederseeon.monopoly;

import java.util.LinkedList;
import java.util.List;

public class Kartenstapel {
	public static List<Karte>gemeinschaftskarten = new LinkedList();

	public Kartenstapel() {
		
	}
	public static void addKarte(Karte karte) {
		gemeinschaftskarten.add(karte);
	
	}
	public static Karte zieheKarte() {
		int anzahlKarten = gemeinschaftskarten.size();
		return gemeinschaftskarten.get(0);
		
	}
}
