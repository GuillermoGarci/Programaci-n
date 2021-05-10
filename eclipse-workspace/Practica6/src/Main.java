import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			NetLogger.crearEstructuraDirectorios();
			NetLogger.registrarAccesoUsuario();
			System.out.println("\nFin del programa");
		} catch (IOException e) {
			String mensaje = e.getMessage();
			NetLogger.escribirEnErrLog(mensaje);
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Fin del programa");
		}
	}
}