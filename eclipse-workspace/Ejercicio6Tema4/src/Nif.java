import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Nif {
	private String dni;

	public Nif() {

	}

	public Nif(String dni) {
		// this.dni = dni + letraNif(dni);
		// this.dni = dni + Integer.parseInt(letraNif(dni));
		// this.dni = dni + letraNif(dni);
		this.dni = dni;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String leer() {
		Scanner scan = new Scanner(System.in);
		int x;

		System.out.println("Introduzca tu DNI sin ninguna letra: ");
		dni = scan.nextLine();

		x = Integer.parseInt(getDni());

		while (dni.length() != 8) {
			System.out.println("Introduzca tu DNI corrctamente(sin ninguna letra y con 8 digitos): ");
			dni = scan.nextLine();

			x = Integer.parseInt(getDni());
		}

		return this.dni;
	}

	private String letraNif(String dni) {
		int resto = 0, x;
		String letra;

		x = Integer.parseInt(getDni());

		resto = x % 23;

		letra = resto + "";

		switch (letra) {
		case "0":
			letra = "T";
			break;
		case "1":
			letra = "R";
			break;
		case "2":
			letra = "W";
			break;
		case "3":
			letra = "A";
			break;
		case "4":
			letra = "G";
			break;
		case "5":
			letra = "M";
			break;
		case "6":
			letra = "Y";
			break;
		case "7":
			letra = "F";
			break;
		case "8":
			letra = "P";
			break;
		case "9":
			letra = "D";
			break;
		case "10":
			letra = "X";
			break;
		case "11":
			letra = "B";
			break;
		case "12":
			letra = "N";
			break;
		case "13":
			letra = "J";
			break;
		case "14":
			letra = "Z";
			break;
		case "15":
			letra = "S";
			break;
		case "16":
			letra = "Q";
			break;
		case "17":
			letra = "V";
			break;
		case "18":
			letra = "H";
			break;
		case "19":
			letra = "L";
			break;
		case "20":
			letra = "C";
			break;
		case "21":
			letra = "K";
			break;
		case "22":
			letra = "E";
			break;
		}

		return letra;
	}

	public String toString() {
		String texto = "";

		// texto = Integer.parseString(dni);

		// texto = dni + "-" + letraNif(dni);
		texto = "El DNI completo es: " + getDni() + "-" + letraNif(dni);

		return texto;
	}
}