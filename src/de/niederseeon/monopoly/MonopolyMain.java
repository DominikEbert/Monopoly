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
		
		Immobilie turmstrasse = new Immobilie();
		
		erstelleTurmstrasse(turmstrasse);
			
		
		
		
		System.out.println(badstrasse.getName());
		
		
	}

	private static void erstelleTurmstrasse(Immobilie turmstrasse) {
		// Turmstraße Daten *******************************************
			turmstrasse.setName("Turmstraße");
		
			turmstrasse.setKaufpreis(1200);
			turmstrasse.setMietpreis(80);
			turmstrasse.setHypothekenwert(600);
			
			turmstrasse.setMietpreisHaus1(400);
			turmstrasse.setMietpreisHaus2(1200);
			turmstrasse.setMietpreisHaus3(3600);
			turmstrasse.setMietpreisHaus4(6400);
			turmstrasse.setMietpreisHotel(9000);
			
			turmstrasse.setPreisHaus1(1000);
			turmstrasse.setPreisHaus2(1000);
			turmstrasse.setPreisHaus3(1000);
			turmstrasse.setPreisHaus4(1000);
			turmstrasse.setPreisHotel(1000);
	}
	private static void erstelleSchillerstrasse(Immobilie schillerstrasse) {
		// Schillerstraße Daten *******************************************
			schillerstrasse.setName("Schillerstraße");
		
			schillerstrasse.setKaufpreis(5200);
			schillerstrasse.setMietpreis(480);
			schillerstrasse.setHypothekenwert(2600);
			
			schillerstrasse.setMietpreisHaus1(2200);
			schillerstrasse.setMietpreisHaus2(6600);
			schillerstrasse.setMietpreisHaus3(16000);
			schillerstrasse.setMietpreisHaus4(19500);
			schillerstrasse.setMietpreisHotel(23000);
			
			schillerstrasse.setPreisHaus1(3000);
			schillerstrasse.setPreisHaus2(3000);
			schillerstrasse.setPreisHaus3(3000);
			schillerstrasse.setPreisHaus4(3000);
			schillerstrasse.setPreisHotel(3000);
	}
}
