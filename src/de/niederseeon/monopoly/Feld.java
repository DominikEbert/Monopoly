package de.niederseeon.monopoly;

public class Feld {
	private int index;
	private Immobilie immobilie;

	private boolean istGemeinschaftsfeld;

	public Feld() {
		super();
	}

	public Feld(int index, boolean istGemeinschaftsfeld) {
		super();
		this.index = index;
		this.istGemeinschaftsfeld = istGemeinschaftsfeld;
	}

	public Feld(int index, Immobilie immobilie) {
		super();
		this.index = index;
		this.immobilie = immobilie;
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

		} else {
			
		}
	}
}
