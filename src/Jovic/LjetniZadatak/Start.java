package Jovic.LjetniZadatak;

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

	private void izlistajOsobe() {
		
	}
	
	public static void main(String[] args) {
		new Start();
	}
	

}

