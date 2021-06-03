package bbdd;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BDConexion {
	private static Connection conexion;
	private static final String PORT = "3306";
	private static final String HOST = "localhost";
	private static final String DATABASE = "tiendaVG1";//tiendaVG
	private static final String URL = "jdbc:mysql://"+ HOST +":"+ PORT +"/"+ DATABASE +"?useServerPrepStmts=true";
	private static final String USER = "root";
	private static final String PASS = "root";//admin
	
	public BDConexion() {
		startConnection();
	}
	
	public void startConnection() {
		//conexion = null;
		//try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Creación y guardado del archivo de propiedades
			Properties escribiendo = new Properties();
			escribiendo.setProperty("username", USER);
			escribiendo.setProperty("password", PASS);
			escribiendo.setProperty("port", PORT);
			escribiendo.setProperty("host", HOST);
			escribiendo.setProperty("database", DATABASE);
			escribiendo.setProperty("url", URL);
			try {
				escribiendo.store(new FileOutputStream("configuracion.props"), "Fichero de configuración.");
			} catch (FileNotFoundException fnfe) {
				System.out.println(fnfe.getMessage());
				escribirErrBD(null, null, null, fnfe);
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
				escribirErrBD(null, null, ioe, null);
			}
			
			// Lectura y cargado de propiedades desde el archivo de propiedades
			Properties leyendo = new Properties();
			try {
				leyendo.load(new FileInputStream("configuracion.props"));
				String user = leyendo.getProperty("username");
				String pass = leyendo.getProperty("password");
				String ruta = leyendo.getProperty("url");
				
				conexion = null;
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conexion = DriverManager.getConnection(ruta, user, pass);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					escribirErrBD(e, null, null, null);
				} catch (ClassNotFoundException ce) {
					System.out.println(ce.getMessage());
					escribirErrBD(null, ce, null, null);
				}
				//System.out.println("Nombre de usuario: " + user);
				//System.out.println("Contraseña: " + pass);
				//System.out.println("Ruta: " + ruta);
			} catch (FileNotFoundException fnfe) {
				System.out.println(fnfe.getMessage());
				escribirErrBD(null, null, null, fnfe);
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
				escribirErrBD(null, null, ioe, null);
			}
		/*} catch (SQLException e) {
			System.out.println(e.getMessage());
			escribirErrBD(e, null, null, null);
		} catch (ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
			escribirErrBD(null, ce, null, null);
		}*/
	}
	
	public static void endConnection() {
		try {
			if (conexion != null) {
				conexion.close();
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			escribirErrBD(ex, null, null, null);
		}
	}
	
	public Connection getConexion() {
		return conexion;
	}

	public static void escribirErrBD(SQLException e, ClassNotFoundException ce, IOException ioe, FileNotFoundException fnfe) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("BD_err.log", true);
			bw = new BufferedWriter(fw);
			//bw.write("\n" + e.getMessage());
			if(!e.equals(null)) {
				bw.write("\n" + e.getMessage());
			} else if(!ce.equals(null)) {
				bw.write("\n" + ce.getMessage());
			} else if(!ioe.equals(null)) {
				bw.write("\n" + ioe.getMessage());
			} else if(!fnfe.equals(null)) {
				bw.write("\n" + fnfe.getMessage());
			}
			bw.flush();
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
}