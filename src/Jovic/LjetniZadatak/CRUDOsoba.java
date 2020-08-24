package Jovic.LjetniZadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CRUDOsoba {

	
	public static List<Osoba> read(){
		List<Osoba> osobe = new ArrayList<>();
	
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("select * from osoba order by prezime");
			ResultSet rs= izraz.executeQuery();
			while(rs.next()) {
				osobe.add(new Osoba(
						rs.getInt("sifra"),
						rs.getString("ime"),
						rs.getString("prezime"),
						rs.getString("oib"),
						rs.getString("mobitel")
						));
			}
			rs.close();
			izraz.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return osobe;
	}
	
	public static void create(Osoba osoba) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(" insert into osoba " + " (ime,prezime,oib,mobitel) " + " values (?,?,?,?) ");
			izraz.setString(1, osoba.getIme());
			izraz.setString(1, osoba.getPrezime());
			izraz.setString(1, osoba.getOib());
			izraz.setString(1, osoba.getMobitel());
			
			izraz.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}
	
}
