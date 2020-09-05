package Jovic.LjetniZadatak;

public class Osoba {
	
	private int sifra;
	private String ime;
	private String prezime;
	private String oib;
	private String mobitel;
	
	
	
	public Osoba(int sifra, String ime, String prezime, String oib, String mobitel) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.oib = oib;
		this.mobitel = mobitel;
	}

	public Osoba() {
		
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

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}

	public String getMobitel() {
		return mobitel;
	}

	public void setMobitel(String mobitel) {
		this.mobitel = mobitel;
	}
	
	

}
