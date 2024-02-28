package de.niederseeon.monopoly;

import java.util.Scanner;

public class MonopolyMain {

	public static void main(String[] args) {
		
		Spieler spieler1 = new Spieler("Johannes");
		
		final Wuerfelergebnis ergebnisS1 = spieler1.wuerfeln();
		System.out.println(spieler1.getName() + " hat gewürfelt.");
		System.out.println("Erster Würfel: " + ergebnisS1.getErgebnisWuerfel1());
		System.out.println("Zweiter Würfel: " + ergebnisS1.getErgebnisWuerfel2());
		System.out.println(ergebnisS1.istPasch());
		int gesamtergebnis1 = ergebnisS1.getErgebnisWuerfel1() + ergebnisS1.getErgebnisWuerfel2();
		System.out.println("Ergebnis: " + gesamtergebnis1);
		
		Spieler spieler2 = new Spieler("Enis");
		final Wuerfelergebnis ergebnisS2 = spieler2.wuerfeln();
		System.out.println(spieler2.getName() + " hat gewürfelt.");
		int gesamtergebnis2 = ergebnisS2.getErgebnisWuerfel1() + ergebnisS2.getErgebnisWuerfel2();
		System.out.println("Gesamtergebnis von Wurf 1: " + gesamtergebnis2);
		if (ergebnisS2.istPasch()) {
			System.out.println(spieler2.getName() + " hat einen Pasch gewürfelt.");
		}
		Immobilie strasse = new Immobilie();
		
		Immobilie badstrasse = new Immobilie();
		badstrasse.setName("badstrasse");
		
		
		System.out.println(badstrasse.getName());
		
		
	}
}
