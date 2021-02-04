import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Persona> lista_personas = new ArrayList<Persona>();
	public static ArrayList<Persona> personas = new ArrayList<Persona>();
	//Persona p = new Persona();
	//public static Persona p;
	//static Fecha f1 = new Fecha();
	
	public static void leerPersonas() {
		Scanner scan = new Scanner(System.in);
		String nombre, ciudad, direccion;
		int d,m,a, codigo_postal, numPersonas = 0;
		
		do {
			System.out.print("Introduce el numero de personas: ");
			numPersonas = scan.nextInt();
		} while(numPersonas < 0);
		
		
		for(int i = 0; i < numPersonas; i++) {
			Persona p = new Persona();
			System.out.print("Introduce un nombre: ");
			//nombre = scan.nextLine();
			p.setNombre(scan.next());
			System.out.println("Introduce una fecha de nacimiento ");
	        System.out.print("Introduce el dia: ");
	        d = scan.nextInt();
	        System.out.print("Introduce el mes: ");
	        m = scan.nextInt();
	        System.out.print("Introduce el año: ");
	        a = scan.nextInt();
	        System.out.println("Introduce una ciudad: ");
	        p.setCiudad(scan.next());
	        //ciudad = scan.next();
			System.out.println("Introduce un codigo postal: ");
			//codigo_postal = scan.nextInt();
			p.setCodigo_postal(scan.nextInt());
			System.out.println("Introduce una direccion: ");
			//direccion = scan.next();
			p.setDireccion(scan.nextLine());
			
			Fecha fechaNacimiento = new Fecha(d, m, a);
			p.setFechaNacimiento(fechaNacimiento);
			//Persona p = new Persona(nombre, f1, ciudad, codigo_postal, direccion);
			//new Persona(nombre, f1, ciudad, codigo_postal, direccion);
			
			lista_personas.add(p);
		}
	}
	
	public static void mostrar() {//ArrayList<Persona> lista_personas
		for(int i = 0; i < lista_personas.size(); i++) {
			System.out.println(lista_personas.get(i).toString());
		}
	}
	
	public static int numeroDePersonas() {
		
		return lista_personas.size();
	}
	
	public static Persona PersonaMayorEdad() {
		Persona mayor = lista_personas.get(0);
		
		for(Persona persona: lista_personas) {
			if(persona.getfechaNacimiento().esMayorQue(mayor.getfechaNacimiento())) {
				mayor = persona;
			}
		}
		return mayor;
	}
	
	public static int cuantasPersonasVivenEn(String ciudad) {
		int cont = 0;
		
		Iterator<Persona> iterador = lista_personas.iterator();
		
		while(iterador.hasNext()) {
			if(ciudad.equals(iterador.next().getCiudad())) {
				cont++;
			}
		}
		//for(Persona persona: lista_personas) {
			
		//}
			
		return cont;
	}
	
	/*public static int personasMayoresDeEdad() {
		int num_mayorDeEdad = 0;
		
		for(int i = 0; i < lista_personas.size(); i++) {
			if(lista_personas.get(i).esMayorDeEdad()) {
				num_mayorDeEdad++;
			}
		}
		
		return num_mayorDeEdad;
	}*/
	
	public static ArrayList<Persona> personasMayoresDeEdad() {
		
		for(int i = 0; i < lista_personas.size(); i++) {
			if(lista_personas.get(i).esMayorDeEdad()) {
				personas.add(lista_personas.get(i));
			}
		}
		
		return personas;
	}
	
	public static void personasMayoresDeEdad1() {
		
		for(Persona persona: lista_personas) {
			if(persona.esMayorDeEdad()) {
				System.out.println(persona.toString());
			}
		}
		
	}
	
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		String opc = "g";

		do {
			Fecha fecha = new Fecha(1,1,2020);
			Persona persona1 = new Persona("Paco", fecha, "Radio", 33443, "Vigo");
			lista_personas.add(persona1);

			System.out.println("\n\tBienvenido a este menú virtual \n");

			System.out.println("\nEste sudoku cuenta con las siguientes opciones: ");
			System.out.println("  0. Salir ");
			System.out.println("  1. Añadir personas.");
			System.out.println("  2. Mostrar los datos de todas las personas.");
			System.out.println("  3. Muestra el número de personas del arayList.");//Numero de personas añadidaa
			System.out.println("  4. Muestra una persona de mayor edad.");//persona de mayor edad
			System.out.println("  5. Muestra el número de personas que viven en una determinada ciudad.");//Cuantas personas viven en la ciudad seleccionada
			System.out.println("  6. Muestra el número de personas que son mayores de edad.");//Personas mayores de edad

			System.out.println("\nIntroduzca una opción para el menú: ");
			opc = scan.next();

			switch (opc) {
			case "1":

				leerPersonas();

				break;

			case "2":

				mostrar();

				break;

			case "3":

				System.out.println("El número de personas que contiene el arrayList es de: " + numeroDePersonas() + " personas");

				break;
				
			case "4":

				System.out.println("La persona de mayor edad es: " + PersonaMayorEdad().toString());

				break;
				
			case "5":
				String ciudad;
				
				System.out.println("Escribe la ciudad que quieras saber cuantas de las personas introducidas viven en ellas: ");
				ciudad = scan.next();
				
				System.out.println("El número de personas que viven en " + ciudad + " son de " + cuantasPersonasVivenEn(ciudad) + " personas");

				break;
				
			case "6":
				
				System.out.println("El número de personas que es mayor de edad son\n " + personasMayoresDeEdad());

				break;

			case "0":
				System.out.println("\n\nVuelva Pronto!!");
				break;

			default:
				System.out.println("ERROR! Ese dato no es válido");
				break;
			}

		} while (!opc.contentEquals("0"));
		scan.close();
	}
	
	public static void main(String[] args) {
		menu();
	}

}
