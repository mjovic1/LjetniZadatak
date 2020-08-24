package Jovic.LjetniZadatak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Baza {

	private static Connection veza;
	private static final String DSN = "jdbc:mariadb://localhost/autoskola";
	private static final String KORISNIK = "edunova";
	private static final String LOZINKA = "edunova";

	
	public static Connection getVeza() {
	
	if(veza == null) {
	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			veza = DriverManager.getConnection(DSN, KORISNIK, LOZINKA);
		} catch (ClassNotFoundException  | SQLException e) {
			
		}
		
	}
	return veza;
	
	}
	
	public static void zatvoriVezu() {
		try {
			veza.close();
		} catch (Exception e) {
			
		}
	}

}
