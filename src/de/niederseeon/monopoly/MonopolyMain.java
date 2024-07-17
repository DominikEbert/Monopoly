package de.niederseeon.monopoly;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MonopolyMain {

	public static void main(String[] args) {

		initialisiereSpielfeld();
	}
	
	private static void initialisiereSpielfeld()
	{
		Strasse strasse = new Strasse("Keine Straße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Bahnhof bahnhof = new Bahnhof("Kein Bahnhof");
		
		Feld losfeld = new Feld(0, false, false);
		
		Strasse badstrasse = new Strasse("Badstraße", 1200, 40, 600, 200, 600, 1800, 3200, 5000, 1000);
		Feld bs = new Feld(1, badstrasse);
		Strasse turmstrasse = new Strasse("Turmstraße", 1200, 40, 600, 200, 600, 1800, 3200, 5000, 1000);
		Feld ts = new Feld(3, turmstrasse);
		
		Strasse chausseestrasse = new Strasse("Chauseestraße", 2000, 120, 600, 200, 600, 1800, 3200, 5000, 1000);
		Feld cs = new Feld(6, chausseestrasse);
		Strasse elisenstrasse = new Strasse("Elisenstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld es = new Feld(8, elisenstrasse);
		Strasse poststrasse = new Strasse("Poststraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld ps = new Feld(9, poststrasse);

		Strasse seestrasse = new Strasse("Seestraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld ss = new Feld(11, seestrasse);
		Strasse hafenstrasse = new Strasse("Hafenstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld hs = new Feld(13, hafenstrasse);
		Strasse neuestrasse = new Strasse("Neuestraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld ns = new Feld(14, neuestrasse);

		Strasse muenchnerstrasse = new Strasse("Münchnerstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld ms = new Feld(16, muenchnerstrasse);
		Strasse wienerstrasse = new Strasse("Wienerstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld ws = new Feld(18, wienerstrasse);
		Strasse berlinerstrasse = new Strasse("Berlinerstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld be = new Feld(19, berlinerstrasse);

		Strasse theaterstrasse = new Strasse("Theaterstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld th = new Feld(21, theaterstrasse);
		Strasse museumstrasse = new Strasse("Museumstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld mu = new Feld(23, museumstrasse);
		Strasse opernplatz = new Strasse("Opernplatz", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld op = new Feld(24, opernplatz);

		Strasse lessingstrasse = new Strasse("Lessingstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld ls = new Feld(26, lessingstrasse);
		Strasse schillerstrasse = new Strasse("Schillerstraße", 5200, 480, 2600, 2200, 6600, 16000, 19500, 23000, 3000);
		Feld sc = new Feld(27, schillerstrasse);
		Strasse goethestrasse = new Strasse("Goethestraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld gs = new Feld(29, goethestrasse);

		Strasse rathausplatz = new Strasse("Rathausplatz", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld rp = new Feld(31, rathausplatz);
		Strasse hauptstrasse = new Strasse("Hauptstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld ha = new Feld(32, hauptstrasse);
		Strasse bahnhofstrasse = new Strasse("Bahnhofstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld ba = new Feld(34, bahnhofstrasse);

		Strasse parkstrasse = new Strasse("Parkstraße", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld pa = new Feld(37, parkstrasse);
		Strasse schlossallee = new Strasse("Schlossallee", 20, 20, 20, 20, 20, 20, 20, 20, 20);
		Feld sa = new Feld(39, schlossallee);

		Bahnhof nordbahnhof = new Bahnhof("Nordbahnhof");
		Feld nb = new Feld(25, nordbahnhof);
		Bahnhof suedbahnhof = new Bahnhof("Südbahnhof");
		Feld sb = new Feld(5, suedbahnhof);
		Bahnhof westbahnhof = new Bahnhof("Westbahnhof");
		Feld wb = new Feld(15, westbahnhof);
		Bahnhof hauptbahnhof = new Bahnhof("Hauptbahnhof");
		Feld hb = new Feld(35, hauptbahnhof);
		
		Map <Integer, Feld> felder = new TreeMap<Integer, Feld>();
		felder.put(0, losfeld);
		felder.put(1, bs);
		felder.put(2, new Feld(2, true, false));
		felder.put(3, ts);
		felder.put(4, new Feld(4, new KontostandAenderungsAktion(-1200)));
		felder.put(6, cs);
		felder.put(7, new Feld(7, false, true));
		felder.put(8, es);
		felder.put(9, ps);
		Feld gefaengnis = new Feld(10, false, false);
		felder.put(10, gefaengnis);
		felder.put(11, ss);
		Werk eWerk = new Werk();
		felder.put(12, new Feld(12, eWerk));
		felder.put(13, hs);
		felder.put(14, ns);
		felder.put(16, ms);
		felder.put(17, new Feld(17, true, false));
		felder.put(18, ws);
		felder.put(19, be);
		felder.put(20, new Feld(20, false, false));
		felder.put(21, ts);
		felder.put(22, new Feld(22, false, true));
		felder.put(23, ms);
		felder.put(24, op);
		felder.put(26, ls);
		felder.put(27, sc);
		Werk wWerk = new Werk();
		felder.put(28, new Feld(28, wWerk));
		felder.put(29, gs);
		felder.put(30, new Feld(30, new PositionsAenderungsAktion(gefaengnis, false)));
		felder.put(31, rp);
		felder.put(32, ha);
		felder.put(33, new Feld(33, true, false));
		felder.put(34, ba);
		felder.put(36, new Feld(36, false, true));
		felder.put(37, pa);
		felder.put(38, new Feld(38, new KontostandAenderungsAktion(-2000)));
		felder.put(39, sa);
		felder.put(25, nb);
		felder.put(15, wb);
		felder.put(5, sb);
		felder.put(35, hb);
		
		
//		Feld gm1 = new Feld(2, true);
		
		
		PositionsAenderungsAktion gehezurbadstrasse = new PositionsAenderungsAktion(bs, true);

		LinkedList<Aktion> aktionen = new LinkedList<Aktion>();
		aktionen.add(gehezurbadstrasse);

//		Gemeinschaftskarte gzb = new Gemeinschaftskarte();
//		gzb.setText("Gehe zurück zur Badstraße! Gehe nicht über los! Ziehe keine 4000$ ein!");
//		Kartenstapel.addKarte(gzb);
//		gzb.setAktionen(aktionen);
		
		MonopolyMain main = new MonopolyMain();
		Spieler spieler1 = new Spieler("Johannes");
		spieler1.setPosition(losfeld);
		spieler1.setKontostand(10000);
		
		for(int i = 0; i < 3; i++) {
			final Wuerfelergebnis ergebnisS1 = spieler1.wuerfeln();
			spieler1.setPosition(felder.get(spieler1.getPosition().getIndex()+(ergebnisS1.getGesamtergebnis())));
			System.out.println(spieler1);
		}
		

	}
}
