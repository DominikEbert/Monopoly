package de.niederseeon.monopoly;

import java.util.List;

public class Farbgruppe {
	
	
	
	private int kaufpreisGebaeude;
	
	private String farbe;
	
	
	private List<Strasse> strassen;
	
	
	


	public int getKaufpreisGebaeude() {
		return kaufpreisGebaeude;
	}


	public void setKaufpreisGebaeude(int kaufpreisGebaeude) {
		this.kaufpreisGebaeude = kaufpreisGebaeude;
	}


	public String getFarbe() {
		return farbe;
	}


	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}


	public List<Strasse> getStrassen() {
		return strassen;
	}


	public void setStrassen(List<Strasse> strassen) {
		this.strassen = strassen;
	}

}
