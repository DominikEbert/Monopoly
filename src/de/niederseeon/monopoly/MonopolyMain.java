<<<<<<< HEAD
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
		Strasse strasse = new Strasse("Keine Straße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Bahnhof bahnhof = new Bahnhof();
		
//		
		Strasse badstrasse = new Strasse("Badstraße", 1200, 40, 600, 200, 600, 1800, 3200, 5000, 1000);
		Strasse turmstrasse = new Strasse("Turmstraße", 1200, 40, 600, 200, 600, 1800, 3200, 5000, 1000);
		
		Strasse chausseestrasse = new Strasse("Chauseestraße", 2000, 120, 600, 200, 600, 1800, 3200, 5000, 1000);
		Strasse elisenstrasse = new Strasse("Elisenstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse poststrasse = new Strasse("Poststraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		
		Strasse seestrasse = new Strasse("Seestraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse hafenstrasse = new Strasse("Hafenstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse neuestrasse = new Strasse("Neuestraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		
		Strasse muenchnerstrasse = new Strasse("Münchnerstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse wienerstrasse = new Strasse("Wienerstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse berlinerstrasse = new Strasse("Berlinerstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		
		Strasse theaterstrasse = new Strasse("Theaterstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse museumstrasse = new Strasse("Museumstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse opernplatz = new Strasse("Opernplatz", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		
		Strasse lessingstrasse = new Strasse("Lessingstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse schillerstrasse = new Strasse("Schillerstraße", 5200, 480, 2600, 2200, 6600, 16000, 19500, 23000, 3000);
		Strasse goethestrasse = new Strasse("Goethestraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		
		Strasse rathausplatz = new Strasse("Rathausplatz", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse hauptstrasse= new Strasse("Hauptstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse bahnhofstrasse = new Strasse("Bahnhofstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		
		Strasse parkstrasse = new Strasse("Parkstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Strasse schlossallee = new Strasse("Schlossallee", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		
		Bahnhof nordbahnhof = new Bahnhof();
		Bahnhof suedbahnhof = new Bahnhof();
		Bahnhof westbahnhof = new Bahnhof();
		Bahnhof ostbahnhof = new Bahnhof();
		
		
		
		

//		Strasse turmstrasse = erstelleTurmstrasse();
//		erstelleSchillerstrasse(schillerstrasse);
		
		
	}
	
//	private static Strasse new Strasse(String name, int kaufpreis, int mietpreis, int hypothekenwert, int mietpreisHaus1, 
//			int mietpreisHaus2, int mietpreisHaus3, int mietpreisHaus4, int mietpreisHotel, int preisGebaeude ) {
//		// Turmstraße Daten *******************************************
//		Strasse strasse = new Strasse();
//			strasse.setName(name);
//		
//			strasse.setKaufpreis(kaufpreis);
//			strasse.setMietpreis(mietpreis);
//			strasse.setHypothekenwert(hypothekenwert);
//			
//			strasse.setMietpreisHaus1(mietpreisHaus1);
//			strasse.setMietpreisHaus2(mietpreisHaus2);
//			strasse.setMietpreisHaus3(mietpreisHaus3);
//			strasse.setMietpreisHaus4(mietpreisHaus4);
//			strasse.setMietpreisHotel(mietpreisHotel);
//			
//			strasse.setPreisGebaeude(preisGebaeude);
//			return strasse;
//	}
//
//	private static Strasse erstelleTurmstrasse() {
//		// Turmstraße Daten *******************************************
//		Strasse turmstrasse = new Strasse();
//			turmstrasse.setName("Turmstraße");
//		
//			turmstrasse.setKaufpreis(1200);
//			turmstrasse.setMietpreis(80);
//			turmstrasse.setHypothekenwert(600);
//			
//			turmstrasse.setMietpreisHaus1(400);
//			turmstrasse.setMietpreisHaus2(1200);
//			turmstrasse.setMietpreisHaus3(3600);
//			turmstrasse.setMietpreisHaus4(6400);
//			turmstrasse.setMietpreisHotel(9000);
//			
//			turmstrasse.setPreisHaus1(1000);
//			turmstrasse.setPreisHaus2(1000);
//			turmstrasse.setPreisHaus3(1000);
//			turmstrasse.setPreisHaus4(1000);
//			turmstrasse.setPreisHotel(1000);
//			return turmstrasse;
//	}
//	
//	
//	
//	private static void erstelleSchillerstrasse(Strasse schillerstrasse) {
//		// Schillerstraße Daten *******************************************
//			schillerstrasse.setName("Schillerstraße");
//		
//			schillerstrasse.setKaufpreis(5200);
//			schillerstrasse.setMietpreis(480);
//			schillerstrasse.setHypothekenwert(2600);
//			
//			schillerstrasse.setMietpreisHaus1(2200);
//			schillerstrasse.setMietpreisHaus2(6600);
//			schillerstrasse.setMietpreisHaus3(16000);
//			schillerstrasse.setMietpreisHaus4(19500);
//			schillerstrasse.setMietpreisHotel(23000);
//			
//			schillerstrasse.setPreisHaus1(3000);
//			schillerstrasse.setPreisHaus2(3000);
//			schillerstrasse.setPreisHaus3(3000);
//			schillerstrasse.setPreisHaus4(3000);
//			schillerstrasse.setPreisHotel(3000);
//	}
}
=======
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
		badstrasse.setKaufpreis(1200);
		
		
		System.out.println(badstrasse.getName());
		
		
	}
}
>>>>>>> branch 'master' of https://github.com/DominikEbert/Monopoly.git
