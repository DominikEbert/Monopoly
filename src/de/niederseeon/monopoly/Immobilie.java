package de.niederseeon.monopoly;

/**
 * Klasse Immobilie. Eigentlich keine Immobilie im klassischen Sinn, sondern ein
 * kaufbares Feld, z.B Straßen, Bahnhöfe,...
 */
public class Immobilie {
	
	private int kaufpreis;
	private Spieler besitzer;
    private String name;
    private int mietpreis;
    private Feld postition;
    
    
    	
    	
	/**
	 * Konstruktor für Immobilien.
	 */
	public Immobilie() {

	}




	public int getKaufpreis() {
		return kaufpreis;
	}




	public void setKaufpreis(int kaufpreis) {
		this.kaufpreis = kaufpreis;
	}




	public Spieler getBesitzer() {
		return besitzer;
	}




	public void setBesitzer(Spieler besitzer) {
		this.besitzer = besitzer;
	}





	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getMietpreis() {
		return mietpreis;
	}




	public void setMietpreis(int mietpreis) {
		this.mietpreis = mietpreis;
	}


	public Feld getPostition() {
		return postition;
	}




	public void setPostition(Feld postition) {
		this.postition = postition;
	}




	public Immobilie(int kaufpreis, String name, int mietpreis) {
		super();
		this.kaufpreis = kaufpreis;
		this.name = name;
		this.mietpreis = mietpreis;
	}





	
	
	
}
