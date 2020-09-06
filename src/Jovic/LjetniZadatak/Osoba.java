package Jovic.LjetniZadatak;

public class Osoba {
	
	private int sifra;
	private String ime;
	private String prezime;
	private String OIB;
	private String mobitel;
	
	
	public Osoba() {

	}
	
	
	
	
	public Osoba(int sifra, String ime, String prezime, String oIB, String mobitel) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		OIB = oIB;
		this.mobitel = mobitel;
	}




	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getOIB() {
		return OIB;
	}
	public void setOIB(String oIB) {
		OIB = oIB;
	}
	public String getMobitel() {
		return mobitel;
	}
	public void setMobitel(String mobitel) {
		this.mobitel = mobitel;
	}
	
	
	
	
	

}
