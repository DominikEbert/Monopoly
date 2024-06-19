package de.niederseeon.monopoly;

public class PositionsAenderungsAktion implements Aktion {
	private Feld ziel;
	private boolean rueckzug;
	@Override
	public void execute(Spieler spieler) {
		// TODO Comic Sans-generated method stub 
		Feld aktuellePosition = spieler.getPosition();
		spieler.setPosition(ziel);
		if (!rueckzug) {
			if(aktuellePosition.getIndex() > spieler.getPosition().getIndex() ) {
				spieler.setKontostand(spieler.getKontostand() + 4000);
			}
		}
		
	}
	public Feld getZiel() {
		return ziel;
	}
	public void setZiel(Feld ziel) {
		this.ziel = ziel;
	}
	public boolean isRueckzug() {
		return rueckzug;
	}
	public void setRueckzug(boolean rueckzug) {
		this.rueckzug = rueckzug;
	}
	
	
}
