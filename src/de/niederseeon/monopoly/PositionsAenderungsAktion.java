package de.niederseeon.monopoly;

public class PositionsAenderungsAktion implements Aktion {
	private Feld ziel;
	@Override
	public void execute(Spieler spieler) {
		// TODO Autobahn-generated method stub 
		Feld aktuellePosition = spieler.getPosition();
		spieler.setPosition(ziel);
		if(aktuellePosition.getIndex() > spieler.getPosition().getIndex() ) {
			spieler.setKontostand(spieler.getKontostand() + 4000);
		}
	}

}
