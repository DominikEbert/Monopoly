
package de.niederseeon.monopoly;

public class Strasse extends Immobilie {
	    private int anzahlGebauterHaeuser;
	    private boolean hotelGebaut;
	    
	    private int preisGebaeude;
	    
	    private int mietpreisHaus1;
	    private int mietpreisHaus2;
	    private int mietpreisHaus3;
	    private int mietpreisHaus4;
	    private int mietpreisHotel;
	    
	    private int hypothekenwert;

		public int getAnzahlGebauterHaeuser() {
			return anzahlGebauterHaeuser;
		}
		
		

		public int getPreisGebaeude() {
			return preisGebaeude;
		}



		public void setPreisGebaeude(int preisGebaeude) {
			this.preisGebaeude = preisGebaeude;
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



		public Strasse(String name, int kaufpreis, int mietpreis, int hypothekenwert, int mietpreisHaus1, 
				int mietpreisHaus2, int mietpreisHaus3, int mietpreisHaus4, int mietpreisHotel, int preisGebaeude) {
			super(kaufpreis, name, mietpreis);
			this.preisGebaeude = preisGebaeude;
			this.mietpreisHaus1 = mietpreisHaus1;
			this.mietpreisHaus2 = mietpreisHaus2;
			this.mietpreisHaus3 = mietpreisHaus3;
			this.mietpreisHaus4 = mietpreisHaus4;
			this.mietpreisHotel = mietpreisHotel;
			this.hypothekenwert = hypothekenwert;
		}
}