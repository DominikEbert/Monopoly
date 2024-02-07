package de.niederseeon.monopoly;
public class Wuerfelergebnis {

    private int ergebnisWuerfel1;

    private int ergebnisWuerfel2;
    public Wuerfelergebnis() {
        ergebnisWuerfel1 = (int) Math.round(Math.random() * 5 + 1);
        ergebnisWuerfel2 = (int) Math.round(Math.random() * 5 + 1);
    }

    public Wuerfelergebnis(int zahl1, int zahl2) {
        this.ergebnisWuerfel1 = zahl1;
        this.ergebnisWuerfel2 = zahl2;

    }


    public int getErgebnisWuerfel1() {
        return ergebnisWuerfel1;
    }

    public void setErgebnisWuerfel1(int ergebnisWuerfel1) {
        this.ergebnisWuerfel1 = ergebnisWuerfel1;
    }

    public int getErgebnisWuerfel2() {
        return ergebnisWuerfel2;
    }

    public void setErgebnisWuerfel2(int ergebnisWuerfel2) {
        this.ergebnisWuerfel2 = ergebnisWuerfel2;
    }

    public boolean istPasch() {
        return ergebnisWuerfel1 == ergebnisWuerfel2;
    }
}
