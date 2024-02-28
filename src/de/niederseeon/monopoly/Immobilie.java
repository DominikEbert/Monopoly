package de.niederseeon.monopoly;

/**
 * Klasse Immobilie. Eigentlich keine Immobilie im klassischen Sinn, sondern ein
 * kaufbares Feld, z.B Straßen, Bahnhöfe,...
 */
public class Immobilie {
	
		private int kaufpreis;
		
	private Spieler besitzer;
	
    private int anzahlHaeuser;
    private String name;
    private int mietpreis;
    private int anzahlGebauterHaeuser;
    private boolean hotelGebaut;
    private int preisHaus1;
    private int preisHaus2;
    private int preisHaus3;
    private int preisHaus4;
    private int preisHotel;
    
    private int mietpreisHaus1;
    private int mietpreisHaus2;
    private int mietpreisHaus3;
    private int mietpreisHaus4;
    private int mietpreisHotel;
    
    private int hypothekenwert;
    
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




	public int getAnzahlHaeuser() {
		return anzahlHaeuser;
	}




	public void setAnzahlHaeuser(int anzahlHaeuser) {
		this.anzahlHaeuser = anzahlHaeuser;
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




	public int getAnzahlGebauterHaeuser() {
		return anzahlGebauterHaeuser;
	}




	public void setAnzahlGebauterHaeuser(int anzahlGebauterHaeuser) {
		this.anzahlGebauterHaeuser = anzahlGebauterHaeuser;
	}




	public boolean isHotelGebaut() {
		return hotelGebaut;
	}




	public void setHotelGebaut(boolean hotelGebaut) {
		this.hotelGebaut = hotelGebaut;
	}




	public int getPreisHaus1() {
		return preisHaus1;
	}




	public void setPreisHaus1(int preisHaus1) {
		this.preisHaus1 = preisHaus1;
	}




	public int getPreisHaus2() {
		return preisHaus2;
	}




	public void setPreisHaus2(int preisHaus2) {
		this.preisHaus2 = preisHaus2;
	}




	public int getPreisHaus3() {
		return preisHaus3;
	}




	public void setPreisHaus3(int preisHaus3) {
		this.preisHaus3 = preisHaus3;
	}




	public int getPreisHaus4() {
		return preisHaus4;
	}




	public void setPreisHaus4(int preisHaus4) {
		this.preisHaus4 = preisHaus4;
	}




	public int getPreisHotel() {
		return preisHotel;
	}




	public void setPreisHotel(int preisHotel) {
		this.preisHotel = preisHotel;
	}




	public int getMietpreisHaus1() {
		return mietpreisHaus1;
	}




	public void setMietpreisHaus1(int mietpreisHaus1) {
		this.mietpreisHaus1 = mietpreisHaus1;
	}




	public int getMietpreisHaus2() {
		return mietpreisHaus2;
	}




	public void setMietpreisHaus2(int mietpreisHaus2) {
		this.mietpreisHaus2 = mietpreisHaus2;
	}




	public int getMietpreisHaus3() {
		return mietpreisHaus3;
	}




	public void setMietpreisHaus3(int mietpreisHaus3) {
		this.mietpreisHaus3 = mietpreisHaus3;
	}




	public int getMietpreisHaus4() {
		return mietpreisHaus4;
	}




	public void setMietpreisHaus4(int mietpreisHaus4) {
		this.mietpreisHaus4 = mietpreisHaus4;
	}




	public int getMietpreisHotel() {
		return mietpreisHotel;
	}




	public void setMietpreisHotel(int mietpreisHotel) {
		this.mietpreisHotel = mietpreisHotel;
	}




	public int getHypothekenwert() {
		return hypothekenwert;
	}




	public void setHypothekenwert(int hypothekenwert) {
		this.hypothekenwert = hypothekenwert;
	}




	public Feld getPostition() {
		return postition;
	}




	public void setPostition(Feld postition) {
		this.postition = postition;
	}
	
	
	
	
}
