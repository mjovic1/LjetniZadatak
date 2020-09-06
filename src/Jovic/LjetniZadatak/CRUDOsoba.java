package Jovic.LjetniZadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDOsoba {

	
	public static List<Osoba> read(){
		List<Osoba> osobe = new ArrayList<Osoba>();
	
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("select * from osoba order by prezime");
			ResultSet rs= izraz.executeQuery();
			while(rs.next()) {
				osobe.add(new Osoba(
						rs.getInt("sifra"),
						rs.getString("ime"),
						rs.getString("prezime"),
						rs.getString("OIB"),
						rs.getString("mobitel")
						));
			}
			rs.close();
			izraz.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return osobe;
	}
	
	public static void create(Osoba osoba) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(" insert into osoba " + " (ime,prezime,OIB,mobitel) " + " values (?, ?, ?, ?) ");
			izraz.setString(1, osoba.getIme());
			izraz.setString(2, osoba.getPrezime());
			izraz.setString(3, osoba.getOIB());
			izraz.setString(4, osoba.getMobitel());
			
			izraz.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}
	
	public static void update(Osoba osoba) {

		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("update osoba set"
					+ " ime=?, "
					+ " prezime=?, "
					+ " OIB=?, "
					+ " mobitel=? "
					+ " where sifra=? ");
			izraz.setString(1, osoba.getIme());
			izraz.setString(2, osoba.getPrezime());
			izraz.setString(3, osoba.getOIB());
			izraz.setString(4, osoba.getMobitel());
			izraz.setInt(5, osoba.getSifra());
			
			izraz.executeUpdate();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public  static void delete(int sifra) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("delete from osoba"
					+ " where sifra=? ");
			
			izraz.setInt(1, sifra);
			izraz.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public static Osoba getOsoba(int redniBroj) {
		int rb=0;
		for(Osoba o : read()) {
			if(++rb==redniBroj) {
				return o;
			}
		}
		return null;
	}
	
}
