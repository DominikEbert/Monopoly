package de.niederseeon.monopoly;

public class Feld {
	private int index;
	private Immobilie immobilie;

	private boolean istGemeinschaftsfeld;
	private boolean istEreignisfeld;
	private Aktion aktion;
	public Feld() {
		super();
	}

	public Feld(int index, boolean istGemeinschaftsfeld, boolean istEreignisfeld) {
		super();
		this.index = index;
		this.istGemeinschaftsfeld = istGemeinschaftsfeld;
		this.istEreignisfeld = istEreignisfeld;
	}

	public Feld(int index, Immobilie immobilie) {
		super();
		this.index = index;
		this.immobilie = immobilie;
	}
	
	public Feld(int index, Aktion aktion) {
		super();
		this.index = index;
		this.aktion = aktion;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Immobilie getImmobilie() {
		return immobilie;
	}

	public void setImmobilie(Immobilie immobilie) {
		this.immobilie = immobilie;
	}

	public void fuehreAktionDurch() {
		if (istGemeinschaftsfeld) {
			Karte gk = Kartenstapel.zieheKarte();
		} else {
			
		}
	}

	@Override
	public String toString() {
		if(getImmobilie()!=null) {
			// TODO Auto-generated method stub
			return getImmobilie() + " hat den Index " + index;
			
		}
		if(getAktion()!=null) {
			// TODO Auto-generated method stub
			return getAktion() + " hat den Index " + index;
			
		}
		if(istGemeinschaftsfeld) {
			return "Feld " + index + " ist ein Gemeinschaftsfeld";
		}
		if(istEreignisfeld) {
			return "Feld " + index + " ist ein Ereignisfeld";
		}
		return "Feld " + index + " ist nicht definiert";
	}

	public boolean isIstGemeinschaftsfeld() {
		return istGemeinschaftsfeld;
	}

	public void setIstGemeinschaftsfeld(boolean istGemeinschaftsfeld) {
		this.istGemeinschaftsfeld = istGemeinschaftsfeld;
	}

	public boolean isIstEreignisfeld() {
		return istEreignisfeld;
	}

	public void setIstEreignisfeld(boolean istEreignisfeld) {
		this.istEreignisfeld = istEreignisfeld;
	}

	public Aktion getAktion() {
		return aktion;
	}

	public void setAktion(Aktion aktion) {
		this.aktion = aktion;
	}
	
}
