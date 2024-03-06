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

        Spieler spieler2 = new Spieler("Enis");
        final Wuerfelergebnis ergebnisS2 = spieler1.wuerfeln();
        System.out.println(spieler2.getName() + " hat gewürfelt.");
        int gesamtergebnis = ergebnisS2.getErgebnisWuerfel1() + ergebnisS2.getErgebnisWuerfel2();
        System.out.println("Gesamtergebnis: " + gesamtergebnis);
        if(ergebnisS2.istPasch()) {
            System.out.println(spieler2.getName() + " hat einen Pasch gewürfelt.");
        }
        Immobilie strasse = new Immobilie();
    }
    
    private static Immobilie erstelleStrasse() {
        Immobilie chaussestrasse = new Immobilie();
        chaussestrasse.setName("Chaussestrasse");
        chaussestrasse.setKaufpreis(2000);
        chaussestrasse.setMietpreis(120);
        System.out.println(chaussestrasse.getName());
        return chaussestrasse;
    }
}
