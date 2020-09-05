package Jovic.LjetniZadatak;



import java.util.List;

import javax.swing.JOptionPane;

public class Start {

	public Start() {
		izbornik();
		Baza.zatvoriVezu();
	}

	private void izbornik() {
		System.out.println("1. Izlistaj sve osobe iz baze");
		System.out.println("2. Unesi novu osobu");
		System.out.println("3. Promjeni osobu");
		System.out.println("4. Obrisi osobu");
		System.out.println("5. Izlaz iz programa");
		izvedi();
		
	}

	private void izvedi() {
		switch (Pomocno.ucitajBroj("Odaberite broj za zeljenu akciju")) {
		case 1:
			izlistajOsobe();
			izbornik();
			break;
		case 2:
			CRUDOsoba.create(new Osoba(1, Pomocno.ucitajString("Unesi ime"),
					Pomocno.ucitajString("Unesi prezime"),
					Pomocno.ucitajString("Unesi OIB"),
					Pomocno.ucitajString("Unesi mobitel")));
			izbornik();
			break;
		case 3:
			promjeniOsobu();
			izbornik();
		default:
				
		}
		
		
	}

	private void promjeniOsobu() {
		Osoba osoba = odaberiOsobu("Unesi redni broj osobe koju želite promjeniti");
		if(osoba == null) {
			JOptionPane.showMessageDialog(null, "Neispravan redni broj");
		return;
		}
		osoba.setIme(Pomocno.ucitajString("Promjeni ime", osoba.getIme()));
		osoba.setPrezime(Pomocno.ucitajString("Promjeni prezime", osoba.getPrezime()));
		osoba.setOib(Pomocno.ucitajString("Promjeni OIB", osoba.getOib()));
		osoba.setMobitel(Pomocno.ucitajString("Promjeni mobitel", osoba.getMobitel()));
		
	}

	private Osoba odaberiOsobu(String poruka) {
		izlistajOsobe();
		izlistajOsobe();
		int redniBroj=Pomocno.ucitajBroj(poruka);
		return CRUDOsoba.getOsoba(redniBroj);
		
	}

	private void izlistajOsobe() {
		List<Osoba> osobe = CRUDOsoba.read();
		String redniBroj;
		for(int i = 0; i <osobe.size();i++) {
			redniBroj=Pomocno.VodecePraznine(osobe.size()) + (i + 1);
			redniBroj=redniBroj.substring(redniBroj.length()-Pomocno.brojZnamenki(osobe.size()));
			System.out.println(redniBroj + ". " + osobe.get(i));
		}
			
		
	}
	
	public static void main(String[] args) {
		new Start();
	}
	

}

