import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NetLogger {
	static Scanner scan = new Scanner(System.in);

	private static String getTimeStamp() {
		DateFormat formatoFecha = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
		Calendar cal = Calendar.getInstance();
		String fecha = formatoFecha.format(cal.getTime());

		return fecha;
	}
	
	public static void registrarAccesoUsuario() throws IOException {
				String respuesta;
				String usuario;
				int toret;
				usuario = System.getProperty("user.name");
				respuesta = JOptionPane.showInputDialog("El usuario actual es " + usuario + "\n¿Prefieres cambiar de usuario?");

				respuesta = respuesta.toLowerCase();
				
				do {
					if (respuesta.contentEquals("si")) {
						
						usuario = JOptionPane.showInputDialog("¿Como se llama el usuario al cúal quieres cambiar?");
						
						toret = 2;
					} else if(respuesta.contentEquals("no")) {
						toret = 2;
					} else {
						toret = 0;
						
						respuesta = JOptionPane.showInputDialog("Error! Tienes que responder con un si o no\nEl usuario actual es " + usuario + "\n¿Quieres cambiar de usuario?");

						respuesta = respuesta.toLowerCase();
					}
				} while (toret != 2);

				JOptionPane.showMessageDialog(null, "La hora a la que se ejecuta la aplicación es a las " + getTimeStamp());

				String ruta = ".\\root\\actividad\\" + usuario + ".log";

				File e = new File(ruta);
				
				if(!e.exists()) {
					e.createNewFile();
				}
				
				BufferedReader mibufferR = new BufferedReader(new FileReader(ruta));
				FileWriter escrituraUsuario = new FileWriter(e.getAbsoluteFile(), true);
				BufferedWriter mibufferW = new BufferedWriter(new FileWriter(e.getAbsoluteFile(), true));
				
				String linea = "";
				int cont = 0;
				
				while (linea != null) {
					linea = mibufferR.readLine();
					cont++;
				}
				
				mibufferR.close();
				
				if(cont != 1) {
					mibufferW.write("\n");
				}
				
				mibufferW.write("Has ejecutado la aplicación a las " + getTimeStamp());

				escrituraUsuario.close();
				mibufferW.close();
				
				escribirNetStatLog(".\\root\\net\\netstat_" + getNumeroUltimoNetStatLog() + ".log");
			}

	public static int getNumeroUltimoNetStatLog() {
		File carpetaNet = new File(".\\root\\net");
		File[] lista = carpetaNet.listFiles();
		int numActual, numMayor = 0;
		String cadena;
		
		for(int i = 0; i < lista.length; i++) {
			cadena = lista[i].getName();
			
			cadena = cadena.substring(8, cadena.indexOf("."));
			numActual = Integer.parseInt(cadena);   
			
			if(numActual > numMayor) {
				numMayor = numActual;
			}
			
		}
		
		if(lista.length == 0) {
			numMayor = 1;
		}

		return numMayor;
	}

	public static void crearEstructuraDirectorios() throws IOException {
		File directorioGeneral = new File(".\\root");

		if (!directorioGeneral.exists()) {
			directorioGeneral.mkdir();
		} 

		File carpetaNet = new File(".\\root\\net");

		if (!carpetaNet.exists()) {
			carpetaNet.mkdir();
		}
		
		File carpetaActividad = new File(".\\root\\actividad");
		
		if (!carpetaActividad.exists()) {
			carpetaActividad.mkdir();
		} 
	}

	public static void escribirNetStatLog(String nombreFichero) throws IOException {
		File ficheroNetStat = new File(nombreFichero);
		
		if(!ficheroNetStat.exists()) {
			ficheroNetStat.createNewFile();
		}
		
		FileReader ficheroR = new FileReader(ficheroNetStat);

		Runtime builder = Runtime.getRuntime();
		ArrayList<String> lista = new ArrayList<String>();

		String cmd = "netstat /a";

		try {
			Process out = builder.exec(cmd);

			BufferedReader bf = new BufferedReader(new InputStreamReader(out.getInputStream()));
			int lineasNetStat = 0;

			String linea;
			while ((linea = bf.readLine()) != null) {
				lista.add(linea);
				lineasNetStat++;
				System.out.println(linea);
			}

			bf.close();
			out.destroy();

			BufferedReader mibufferR = new BufferedReader(ficheroR);
			int lineasFichero = 0;

			while ((linea = mibufferR.readLine()) != null) {
				lineasFichero++;
			}
			
			mibufferR.close();

			BufferedWriter mibufferW = new BufferedWriter(new FileWriter(nombreFichero, true));
			int lineasTotales = lineasFichero + lineasNetStat;

			if (lineasTotales <= 200) {
				
				if(lineasFichero != 0) {
					mibufferW.write("\n");
				}
				
				mibufferW.write("Esta ecribiendo en el NetStat a las " + getTimeStamp());
				
				for (String lineas : lista) {
					mibufferW.write(lineas);
					mibufferW.write("\n");
				}
				
				mibufferW.flush();
				mibufferW.close();
			} else if (lineasTotales > 200) {
				int lineaActual = 0;
				
				mibufferW.write("\n");
				mibufferW.write("Esta ecribiendo en el NetStat a las " + getTimeStamp());
				
				for (int i = lineasFichero; i < 200; i++) {
					mibufferW.write(lista.get(lineaActual));
					mibufferW.write("\n");
					lineasFichero++;
					lineaActual++;
				}

				mibufferW.flush();
				mibufferW.close();

				int x = getNumeroUltimoNetStatLog();
				x++;
				
				BufferedWriter mibufferW2 = new BufferedWriter(new FileWriter(".\\root\\net\\netstat_" + x + ".log", true));

				for (int i = lineaActual; i < lineasNetStat; i++) {
					mibufferW2.write(lista.get(i));
					mibufferW2.write("\n");
				}

				mibufferW2.close();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void escribirEnErrLog(String mensaje) throws IOException {
		String ruta = ".\\root\\actividad\\err.log";
		File ficheroError = new File(ruta);
		
		if(!ficheroError.exists()) {
			ficheroError.createNewFile();
		}
		
		BufferedReader mibufferR = new BufferedReader(new FileReader(ruta));
		FileWriter escrituraUsuario = new FileWriter(ficheroError.getAbsoluteFile(), true);
		BufferedWriter mibufferW = new BufferedWriter(new FileWriter(ficheroError.getAbsoluteFile(), true));
		
		String linea = "";
		int cont = 0;
		
		while (linea != null) {
			linea = mibufferR.readLine();
			cont++;
		}
		
		mibufferR.close();
		
		if(cont != 1) {
			mibufferW.write("\n");
		}
		
		mibufferW.write(getTimeStamp() + " " + mensaje);

		escrituraUsuario.close();
		mibufferW.close();
	}
}