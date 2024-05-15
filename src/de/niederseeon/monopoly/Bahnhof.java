package de.niederseeon.monopoly;

public class Bahnhof extends Immobilie {
	
	private static int mietpreis2Bhf = 200;
	private static int mietpreis3Bhf = 500;
	private static int mietpreis4Bhf = 1000;
	
	
	public int getMietpreis2Bhf() {
		return mietpreis2Bhf;
	}
//	public void setMietpreis2Bhf(int mietpreis2Bhf) {
//		this.mietpreis2Bhf = mietpreis2Bhf;
//	}
	public int getMietpreis3Bhf() {
		return mietpreis3Bhf;
	}
//	public void setMietpreis3Bhf(int mietpreis3Bhf) {
//		this.mietpreis3Bhf = mietpreis3Bhf;
//	}
	public int getMietpreis4Bhf() {
		return mietpreis4Bhf;
	}
//	public void setMietpreis4Bhf(int mietpreis4Bhf) {
//		this.mietpreis4Bhf = mietpreis4Bhf;
//	}
	public Bahnhof(String name) {
		super(2500, name, 100);
	}
	
}
