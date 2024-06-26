package de.niederseeon.monopoly;

import java.util.List;

public class Gemeinschaftskarte {
	private String text;
	private int effekt;
	
	private List<Aktion> aktionen;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getEffekt() {
		return effekt;
	}

	public void setEffekt(int effekt) {
		this.effekt = effekt;
	}

	public List<Aktion> getAktionen() {
		return aktionen;
	}

	public void setAktionen(List<Aktion> aktionen) {
		this.aktionen = aktionen;
	}
	
}
