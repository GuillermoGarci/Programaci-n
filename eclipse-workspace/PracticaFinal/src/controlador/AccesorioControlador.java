package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import bbdd.BDConexion;
import modelo.Accesorio;

public class AccesorioControlador extends ArticuloControlador{
	private static ArrayList<Accesorio> accesorios;
	
	public AccesorioControlador() {
		accesorios = new ArrayList<Accesorio>();
		try {
			recuperarAccesoriosBD();
		} catch (SQLException e) {
			System.out.println("Problema al recuperar los datos del alumnado.");
		}
	}
	
	private static void recuperarAccesoriosBD() throws SQLException {
		Statement s = conexion.getConexion().createStatement();
		String query = "SELECT * FROM alumnos";
		ResultSet rs = s.executeQuery(query);
		
		while (rs.next()) {
			Accesorio a = new Accesorio(rs.getString(1), rs.getString(2));
			accesorios.add(a);
		}
		
		rs.close();
	}
}