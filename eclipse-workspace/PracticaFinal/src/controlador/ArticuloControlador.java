package controlador;

import bbdd.BDConexion;

public class ArticuloControlador {
	protected static BDConexion conexion;
	
	public ArticuloControlador() {
		conexion = new BDConexion();
	}
}