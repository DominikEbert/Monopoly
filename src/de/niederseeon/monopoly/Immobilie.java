package de.niederseeon.monopoly;

/**
 * Klasse Immobilie. Eigentlich keine Immobilie im klassischen Sinn, sondern ein
 * kaufbares Feld, z.B Straßen, Bahnhöfe,...
 */
public class Immobilie {
	
		private int kaufpreis;
		
	private Spieler besitzer;
	
    private int anzahlHaeuser;
    
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
	public int getFarbgruppe() {
		return farbgruppe;
	}
	public void setFarbgruppe(int farbgruppe) {
		this.farbgruppe = farbgruppe;
	}
	public int getMietpreis() {
		return mietpreis;
	}
	public void setMietpreis(int mietpreis) {
		this.mietpreis = mietpreis;
	}
	public boolean isHotelgebaut() {
		return hotelgebaut;
	}
	public void setHotelgebaut(boolean hotelgebaut) {
		this.hotelgebaut = hotelgebaut;
	}
	public int getPreishaus1() {
		return preishaus1;
	}
	public void setPreishaus1(int preishaus1) {
		this.preishaus1 = preishaus1;
	}
	public int getMietpreishaus1() {
		return mietpreishaus1;
	}
	public void setMietpreishaus1(int mietpreishaus1) {
		this.mietpreishaus1 = mietpreishaus1;
	}
	public int getPreishaus2() {
		return preishaus2;
	}
	public void setPreishaus2(int preishaus2) {
		this.preishaus2 = preishaus2;
	}
	public int getMietpreishaus2() {
		return mietpreishaus2;
	}
	public void setMietpreishaus2(int mietpreishaus2) {
		this.mietpreishaus2 = mietpreishaus2;
	}
	public int getPreishaus3() {
		return preishaus3;
	}
	public void setPreishaus3(int preishaus3) {
		this.preishaus3 = preishaus3;
	}
	public int getMietspreishaus3() {
		return mietspreishaus3;
	}
	public void setMietspreishaus3(int mietspreishaus3) {
		this.mietspreishaus3 = mietspreishaus3;
	}
	public int getPreishotel() {
		return preishotel;
	}
	public void setPreishotel(int preishotel) {
		this.preishotel = preishotel;
	}
	public int getMietpreishotel() {
		return mietpreishotel;
	}
	public void setMietpreishotel(int mietpreishotel) {
		this.mietpreishotel = mietpreishotel;
	}
		private String name;
    	
    	private int farbgruppe;
    	
    	private int mietpreis;
    	
    	private boolean hotelgebaut;
    	
    	private int preishaus1;
    	
    	private int mietpreishaus1;
    	
    	private int preishaus2;
    	
    	private int mietpreishaus2;
    	
    	private int preishaus3;
    	
    	private int mietspreishaus3;
    	
    	private int preishotel;
    	
    	private int mietpreishotel;
    	
    	
    	
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
	
	
}
