import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {
	private static ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();
	private static String nombre;

	public Agencia(String nombre) {
		Agencia.nombre = nombre;
	}

	public Agencia(String nombre, ArrayList<Inmueble> inmuebles) {
		Agencia.nombre = nombre;
		Agencia.inmuebles = inmuebles;
	}

	public ArrayList<Inmueble> getInmueble() {
		return inmuebles;
	}

	public void setInmueble(ArrayList<Inmueble> inmuebles) {
		Agencia.inmuebles = inmuebles;
	}

	public static String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		Agencia.nombre = nombre;
	}

	static Scanner scan = new Scanner(System.in);
	
	public static void rellenarPisos() {
		Piso p = new Piso();		

		System.out.print("Introduce el precio del piso: ");	
		p.setPrecio(scan.nextFloat());	
		System.out.print("Introduce los metros cuadrados del piso: ");	
		p.setMetrosCuadrados(scan.nextFloat());	
		System.out.print("Introduce la dirección del piso: ");	
		System.out.print("Introduce el tipo de vía: ");
		scan.nextLine();	
		p.setTipoVia(scan.nextLine());	
		System.out.print("Introduce el nombre: ");
		scan.nextLine();	
		p.setNombre(scan.nextLine());
		System.out.print("Introduce el número: ");	
		p.setNumero(scan.nextInt());
		System.out.print("Introduce el código postal: ");	
		p.setCp(scan.nextInt());
		System.out.print("Introduce el número de habitaciones del piso: ");	
		p.setNumHabitaciones(scan.nextInt());	
		System.out.print("Introduce el número del piso: ");	
		p.setNumeroPiso(scan.nextInt());
		System.out.print("Introduce la letra del piso: ");	
		//p.setLetraPiso(scan.next());
		
		p.setAlquilado(false);
			
		inmuebles.add(p);	
	}
	
	public static void rellenarCasas() {
		Casa c = new Casa();	
		
		System.out.print("Introduce el precio de la casa: ");	
		c.setPrecio(scan.nextFloat());	
		System.out.print("Introduce los metros cuadrados de la casa: ");	
		c.setMetrosCuadrados(scan.nextFloat());	
		System.out.print("Introduce la dirección de la casa: ");	
		System.out.print("Introduce el tipo de vía: ");
		scan.nextLine();	
		c.setTipoVia(scan.nextLine());	
		System.out.print("Introduce el nombre: ");
		scan.nextLine();	
		c.setNombre(scan.nextLine());
		System.out.print("Introduce el número: ");	
		c.setNumero(scan.nextInt());
		System.out.print("Introduce el código postal: ");	
		c.setCp(scan.nextInt());	
		System.out.print("Introduce el número de habitaciones de la casa: ");	
		c.setNumHabitaciones(scan.nextInt());
		
		c.setAlquilado(false);
		
		inmuebles.add(c);	
	}
	
	public static void añadirPisos() {
		String opcInm = "g", opcPoC = "g";	
		int numInm = 0;	

		do {
			System.out.println("\n¿Quieres añadir un inmueble en alquiler o en venta?\n  1. Inmueble de Alquiler\n  2. Inmueble en Venta\n  0. No añadir ningún inmueble");
			System.out.println("\nElige una opción: ");	
			opcInm = scan.next(); 
			switch (opcInm) {	

			case "1":	
				System.out.print("Introduce el numero de inmuebles en alquiler a introducir: ");	
				numInm = scan.nextInt();	
				
				 while (numInm < 0) {	
					 System.out.println("\nEse no es un valor válido");
					 System.out.print("Introduce de nuevo el numero de pisos de alquiler a introducir: ");
					 numInm = scan.nextInt();	
				 }
				 
				 System.out.println("\n¿Quieres añadir un piso o una casa?\n  1. Piso\n  2. Casa\n  0. No añadir ningún inmueble");
				 System.out.println("\nElige una opción: ");	
				 opcPoC = scan.next(); 
				 switch (opcPoC) {
				 case "1":
					 for (int i = 0; i < numInm; i++) {	
						 Piso p = new Piso();		

						 System.out.println("\nPara el Piso en Alquiler " + p.getId() + "(ID)");
						 rellenarPisos();	
						}
					 break;
				case "2":
					for (int i = 0; i < numInm; i++) {	
						Piso p = new Piso();		

						System.out.println("\nPara la casa en Alquiler " + p.getId() + "(ID)");
						rellenarCasas();
					}
					break;
				case "0":
					System.out.println("\nFin del programa para añadir pisos");	
					break;
				default:	
					System.out.println("ERROR! Ese dato no es válido");	
					break;
					}
				break;	

			case "2":	
				System.out.print("Introduce el numero de pisos en venta a introducir: ");	
				numInm = scan.nextInt();	
				
				 while (numInm < 0) {	
					 System.out.println("\nEse no es un valor válido");	
					 System.out.print("Introduce de nuevo el numero de pisos en venta a introducir: ");
					 numInm = scan.nextInt();	
				 }
					 
				System.out.println("\n¿Quieres añadir un piso o una casa?\n  1. Piso\n  2. Casa\n  0. No añadir ningún inmueble");
				System.out.println("\nElige una opción: ");	
				opcPoC = scan.next();
					 
				switch (opcPoC) {
				case "1":
					for (int i = 0; i < numInm; i++) {
						Piso p = new Piso();		

						System.out.println("\nPara el Piso en Venta " + p.getId() + "(ID)");
						rellenarPisos();
					}
					break;
				case "2":
					for (int i = 0; i < numInm; i++) {
						Piso p = new Piso();		

						System.out.println("\nPara la Casa en Venta " + p.getId() + "(ID)");
						rellenarCasas();
					}
					break;
				case "0":
					System.out.println("\nFin del programa para añadir pisos");	
					break;
				default:	
					System.out.println("ERROR! Ese dato no es válido");	
					break;
				}
				break; 
			case "0":	
				System.out.println("\nFin del programa para añadir pisos");	
				break;	

			default:	
				System.out.println("ERROR! Ese dato no es válido");	
				break;	
			}
		} while (!opcInm.contentEquals("0"));	
	}
	
	public static void listarPisosAlquiler() {
		int vez = 0;
		System.out.println("Inmuebles en Alquiler");

		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == true) {
				if(Inmuebles instanceof Piso) {
					if(vez == 0) {
						System.out.println("Pisos en Alquiler\n");
						System.out.println(Inmuebles.toString() + "\n");
						vez = 1;
					} else {
						System.out.println(Inmuebles.toString() + "\n");
					}
				} 
			}
		}
	}
	
	public static void listarCasasAlquiler() {
		int vez = 0;
		
		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == true) {
				if(Inmuebles instanceof Casa) {
					if(vez == 0) {
						System.out.println("Casas en Alquiler\n");
						System.out.println(Inmuebles.toString() + "\n");
						vez = 1;
					} else {
						System.out.println(Inmuebles.toString() + "\n");
					}
				} 
			}
		}
	}
	
	/*public static void listarInmueblesAlquiler() {
		int vez = 0;
		System.out.println("Inmuebles en Alquiler");

		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == true) {
				if(Inmuebles instanceof Piso) {
					if(vez == 0) {
						System.out.println("Pisos en Alquiler\n");
						System.out.println(Inmuebles.toString() + "\n");
						vez = 1;
					} else {
						System.out.println(Inmuebles.toString() + "\n");
					}
				} 
			}
		}
		
		vez = 0;
		
		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == true) {
				if(Inmuebles instanceof Casa) {
					if(vez == 0) {
						System.out.println("Casas en Alquiler\n");
						System.out.println(Inmuebles.toString() + "\n");
						vez = 1;
					} else {
						System.out.println(Inmuebles.toString() + "\n");
					}
				} 
			}
		}
	}*/
	
	public static void listarPisosVenta() {
		int vez = 0;
		System.out.println("Inmuebles en Venta");

		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == false) {
				if(Inmuebles instanceof Piso) {
					if(vez == 0) {
						System.out.println("Pisos en Venta\n");
						System.out.println(Inmuebles.toString() + "\n");
						vez = 1;
					} else {
						System.out.println(Inmuebles.toString() + "\n");
					}
				} 
			}
		}
	}
	
	public static void listarCasasVenta() {
		int vez = 0;
		
		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == false) {
				if(Inmuebles instanceof Casa) {
					if(vez == 0) {
						System.out.println("Casas en Venta\n");
						System.out.println(Inmuebles.toString() + "\n");
						vez = 1;
					} else {
						System.out.println(Inmuebles.toString() + "\n");
					}
				} 
			}
		}
	}
	
	/*public static void listarInmueblesVenta() {
		int vez = 0;
		System.out.println("Inmuebles en Venta");

		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == false) {
				if(Inmuebles instanceof Piso) {
					if(vez == 0) {
						System.out.println("Pisos en Venta\n");
						System.out.println(Inmuebles.toString() + "\n");
						vez = 1;
					} else {
						System.out.println(Inmuebles.toString() + "\n");
					}
				} 
			}
		}
		
		vez = 0;
		
		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == false) {
				if(Inmuebles instanceof Casa) {
					if(vez == 0) {
						System.out.println("Casas en Venta\n");
						System.out.println(Inmuebles.toString() + "\n");
						vez = 1;
					} else {
						System.out.println(Inmuebles.toString() + "\n");
					}
				} 
			}
		}
	}*/

	/*public static void listarInmueblessVenta(ArrayList<Piso> lista_pisos, ArrayList<Casa> lista_casas) {
		int vez = 0;
		System.out.println("Inmuebles en Venta");

		for (Piso lista_Pisos : lista_pisos) {
			if(vez == 0) {
				System.out.println("Pisos en Alquiler\n");
				System.out.println(lista_Pisos.toString() + "\n");
				vez = 1;
			} else {
				System.out.println(lista_Pisos.toString() + "\n");
			}
		}
		
		for (Casa lista_Casas : lista_casas) {
			if(vez == 0) {
				System.out.println("Casas en Alquiler\n");
				System.out.println(lista_Casas.toString() + "\n");
				vez = 1;
			} else {
				System.out.println(lista_Casas.toString() + "\n");
			}
		}
		
		lista_pisos.clear();
		lista_casas.clear();
	}*/
	
	public static void mostrarPisos() {
		String opcInm = "g";

		do {
			System.out.println("¿Como quieres visualizar los inmuebles?\n  1. Visualizar los Inmuebles de Alquiler\n  2. Visualizar los Inmuebles en Venta\n  3. Visualizar todos los Inmuebles\n  0. No visualizar ningún inmueble");
			System.out.println("\nElige una opción: ");
			opcInm = scan.next();
			switch (opcInm) {

			case "1":
				if (inmuebles.size() != 0) {
					listarPisosAlquiler();
					listarCasasAlquiler();
				} else {
					System.out.println("No hay ningún inmueble en alquiler\n");
				}

				break;
			case "2":
				if (inmuebles.size() != 0) {
					/*for (Inmueble Inmuebles : inmuebles) {
						if (Inmuebles.isAlquilado() == false) {
							if(Inmuebles instanceof Piso) {
								lista_pisos.add((Piso) Inmuebles);
							} else {
								lista_casas.add((Casa) Inmuebles);
							}
						}
					}
					listarInmueblessVenta(lista_pisos, lista_casas);*/
					listarPisosVenta();
					listarCasasVenta();
				} else {
					System.out.println("No hay ningún inmueble en venta\n");
				}

				break;
			case "3":
				if (inmuebles.size() != 0) {
					listarPisosAlquiler();
					listarCasasAlquiler();
				} else {
					System.out.println("No hay ningún inmueble en alquiler\n");
				}

				if (inmuebles.size() != 0) {
					listarPisosVenta();
					listarCasasVenta();
				} else {
					System.out.println("No hay ningún inmueble en venta\n");
				}

				break;
			case "0":
				System.out.println("\nFin del programa para listar los inmuebles");
				break;
			default:
				System.out.println("ERROR! Ese dato no es válido");
				break;
			}
		} while (!opcInm.contentEquals("0"));
	}
	
	public static ArrayList<Piso> lista_pisos = new ArrayList<Piso>();
	public static ArrayList<Casa> lista_casas = new ArrayList<Casa>();
	
	public static ArrayList<Inmueble> lista_inmueblesalquiler = new ArrayList<Inmueble>();
	public static ArrayList<Inmueble> lista_inmueblesventa = new ArrayList<Inmueble>();
	
	public static void ordenarPorPrecio(ArrayList<Inmueble> lista_inmueblesalquiler, ArrayList<Inmueble> lista_inmueblesventa) {
		int tamaño, tamañoP, tamañoC; 
		//Inmueble auxA = new Inmueble(); 

		tamaño = lista_inmueblesalquiler.size(); 

		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == true) {
				if(Inmuebles instanceof Piso) {
					lista_pisos.add((Piso) Inmuebles);
				} else {
					lista_casas.add((Casa) Inmuebles);
				}
			}
		}
		
		Piso auxAP = new Piso(); 
		Casa auxAC = new Casa(); 
		tamañoP = lista_pisos.size();
		tamañoC = lista_casas.size();
		
		if (tamaño != 0) { 
			if (tamañoP != 0) { 
				auxAP = lista_pisos.get(0); 
				for (int i = 0; i < tamañoP - 1; i++) { 
					for (int j = 0; j < tamañoP - 1; j++) { 
						if (lista_pisos.get(j).getPrecio() < lista_pisos.get(j + 1).getPrecio()) {
							auxAP = lista_pisos.get(j); 
							lista_pisos.set(j, lista_pisos.get(j + 1));
							lista_pisos.set(j + 1, (Piso) auxAP); 
						}
					}
				}
			} else {
				System.out.println("No hay ningún piso en alquiler entre esos valores");
			}
			
			if (tamañoC != 0) {
				auxAC = lista_casas.get(0); 
				for (int i = 0; i < tamañoC - 1; i++) { 
					for (int j = 0; j < tamañoC - 1; j++) { 
						if (lista_casas.get(j).getPrecio() < lista_casas.get(j + 1).getPrecio()) {
							auxAC = lista_casas.get(j); 
							lista_casas.set(j, lista_casas.get(j + 1));
							lista_casas.set(j + 1, (Casa) auxAC); 
						}
					}
				}
			}

			System.out.println("\nInmuebles en Alquiler");

			if (tamaño != 1) { 
				System.out.println("De mayor a menor precio:\n"); 
			}

			for (int i = 0; i < tamañoP; i++) { 
				System.out.println(lista_pisos.get(i).toString() + "\n"); 
			}
			
			for (int i = 0; i < tamañoC; i++) { 
				System.out.println(lista_casas.get(i).toString() + "\n"); 
			}
		} else {
			System.out.println("No hay ninguna casa en alquiler entre esos valores");
		}

		lista_pisos.clear();
		lista_casas.clear();
		
		//Inmueble auxV = new Inmueble(); 

		tamaño = lista_inmueblesventa.size(); 
		
		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == false) {
				if(Inmuebles instanceof Piso) {
					lista_pisos.add((Piso) Inmuebles);
				} else {
					lista_casas.add((Casa) Inmuebles);
				}
			}
		}
		
		Piso auxVP = new Piso(); 
		Casa auxVC = new Casa(); 
		tamañoP = lista_pisos.size();
		tamañoC = lista_casas.size();
		
		if (tamaño != 0) { 
			if (tamañoP != 0) { 
				auxVP = lista_pisos.get(0); 
				for (int i = 0; i < tamañoP - 1; i++) { 
					for (int j = 0; j < tamañoP - 1; j++) { 
						if (lista_pisos.get(j).getPrecio() < lista_pisos.get(j + 1).getPrecio()) {
							auxVP = lista_pisos.get(j); 
							lista_pisos.set(j, lista_pisos.get(j + 1));
							lista_pisos.set(j + 1, (Piso) auxVP); 
						}
					}
				}
			} else {
				System.out.println("No hay ningún piso en alquiler entre esos valores");
			}
			
			if (tamañoC != 0) {
				auxVC = lista_casas.get(0); 
				for (int i = 0; i < tamañoC - 1; i++) { 
					for (int j = 0; j < tamañoC - 1; j++) { 
						if (lista_casas.get(j).getPrecio() < lista_casas.get(j + 1).getPrecio()) {
							auxVC = lista_casas.get(j); 
							lista_casas.set(j, lista_casas.get(j + 1));
							lista_casas.set(j + 1, (Casa) auxVC); 
						}
					}
				}
			} else {
				System.out.println("No hay ninguna casa en alquiler entre esos valores");
			}

			System.out.println("\nInmuebles en Venta"); 

			if (tamaño != 1) { 
				System.out.println("De mayor a menor precio:\n"); 
			}

			for (int i = 0; i < tamañoP; i++) { 
				System.out.println(lista_pisos.get(i).toString() + "\n"); 
			}
			
			for (int i = 0; i < tamañoC; i++) { 
				System.out.println(lista_casas.get(i).toString() + "\n"); 
			}
		} else { 
			System.out.println("No hay ningún inmueble en venta entre esos valores"); 
		}
		System.out.println("\nFin del programa para listar los pisos por precio"); 
	}

	public static void listarPorPrecio() { 
		float precioMin, precioMax; 

		System.out.println("Introduzca el rango de precios que quieres buscar los pisos"); 
		System.out.println("Introduzca el precio minimo: "); 
		precioMin = scan.nextFloat(); 
		System.out.println("Introduzca el precio maximo: "); 
		precioMax = scan.nextFloat(); 

		while (precioMin > precioMax) { 
			System.out.println("El precio minimo no puede ser mayor que el precio maximo y el precio maximo no puede ser menor que el precio minimo");
			System.out.println("Introduzca el rango de precios que quieres buscar los pisos"); 
			System.out.println("Introduzca el precio minimo: "); 
			precioMin = scan.nextFloat(); 
			System.out.println("Introduzca el precio maximo: "); 
			precioMax = scan.nextFloat(); 
		}

		for (int i = 0; i < inmuebles.size(); i++) { 
			if (inmuebles.get(i).isAlquilado() == true) {
				if (inmuebles.get(i).getPrecio() > precioMin && inmuebles.get(i).getPrecio() < precioMax) {
					lista_inmueblesalquiler.add(inmuebles.get(i)); 
				}
			} else {
				if (inmuebles.get(i).getPrecio() > precioMin && inmuebles.get(i).getPrecio() < precioMax) {
					lista_inmueblesventa.add(inmuebles.get(i)); 
				}
			}
		}

		ordenarPorPrecio(lista_inmueblesalquiler, lista_inmueblesventa); 
		lista_inmueblesalquiler.clear(); 
		lista_inmueblesventa.clear(); 
	}
	
	public static void ordenarPorMetrosCuadrados(ArrayList<Inmueble> lista_inmueblesalquiler, ArrayList<Inmueble> lista_inmueblesventa) {
		int tamaño, tamañoP, tamañoC; 

		tamaño = lista_inmueblesalquiler.size(); 

		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == true) {
				if(Inmuebles instanceof Piso) {
					lista_pisos.add((Piso) Inmuebles);
				} else {
					lista_casas.add((Casa) Inmuebles);
				}
			}
		}
		
		Piso auxAP = new Piso(); 
		Casa auxAC = new Casa(); 
		tamañoP = lista_pisos.size();
		tamañoC = lista_casas.size();
		
		if (tamaño != 0) { 
			if (tamañoP != 0) { 
				auxAP = lista_pisos.get(0); 
				for (int i = 0; i < tamañoP - 1; i++) { 
					for (int j = 0; j < tamañoP - 1; j++) { 
						if (lista_pisos.get(j).getMetrosCuadrados() < lista_pisos.get(j + 1).getMetrosCuadrados()) {
							auxAP = lista_pisos.get(j); 
							lista_pisos.set(j, lista_pisos.get(j + 1));
							lista_pisos.set(j + 1, (Piso) auxAP); 
						}
					}
				}
			} else { 
				System.out.println("No hay ningún piso en alquiler entre esos valores"); 
			}
			
			if (tamañoC != 0) {
				auxAC = lista_casas.get(0); 
				for (int i = 0; i < tamañoC - 1; i++) { 
					for (int j = 0; j < tamañoC - 1; j++) { 
						if (lista_casas.get(j).getMetrosCuadrados() < lista_casas.get(j + 1).getMetrosCuadrados()) {
							auxAC = lista_casas.get(j); 
							lista_casas.set(j, lista_casas.get(j + 1));
							lista_casas.set(j + 1, (Casa) auxAC); 
						}
					}
				}
			} else { 
				System.out.println("No hay ninguna casa en alquiler entre esos valores"); 
			}

			System.out.println("\nInmuebles en Alquiler");

			if (tamaño != 1) { 
				System.out.println("De más a menos metros cuadrados:\n"); 
			}

			for (int i = 0; i < tamañoP; i++) { 
				System.out.println(lista_pisos.get(i).toString() + "\n"); 
			}
			
			for (int i = 0; i < tamañoC; i++) { 
				System.out.println(lista_casas.get(i).toString() + "\n"); 
			}
		} else {
			System.out.println("No hay ningún inmueble en alquiler entre esos valores");
		}

		lista_pisos.clear();
		lista_casas.clear();
		
		tamaño = lista_inmueblesventa.size(); 
		
		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == false) {
				if(Inmuebles instanceof Piso) {
					lista_pisos.add((Piso) Inmuebles);
				} else {
					lista_casas.add((Casa) Inmuebles);
				}
			}
		}
		
		Piso auxVP = new Piso(); 
		Casa auxVC = new Casa(); 
		tamañoP = lista_pisos.size();
		tamañoC = lista_casas.size();
		
		if (tamaño != 0) { 
			if (tamañoP != 0) { 
				auxVP = lista_pisos.get(0); 
				for (int i = 0; i < tamañoP - 1; i++) { 
					for (int j = 0; j < tamañoP - 1; j++) { 
						if (lista_pisos.get(j).getMetrosCuadrados() < lista_pisos.get(j + 1).getMetrosCuadrados()) {
							auxVP = lista_pisos.get(j); 
							lista_pisos.set(j, lista_pisos.get(j + 1));
							lista_pisos.set(j + 1, (Piso) auxVP); 
						}
					}
				}
			} else { 
				System.out.println("No hay ningún piso en venta entre esos valores"); 
			}
			
			if (tamañoC != 0) {
				auxVC = lista_casas.get(0); 
				for (int i = 0; i < tamañoC - 1; i++) { 
					for (int j = 0; j < tamañoC - 1; j++) { 
						if (lista_casas.get(j).getMetrosCuadrados() < lista_casas.get(j + 1).getMetrosCuadrados()) {
							auxVC = lista_casas.get(j); 
							lista_casas.set(j, lista_casas.get(j + 1));
							lista_casas.set(j + 1, (Casa) auxVC); 
						}
					}
				}
			} else { 
				System.out.println("No hay ninguna casa en venta entre esos valores"); 
			}

			System.out.println("\nInmuebles en Venta"); 

			if (tamaño != 1) { 
				System.out.println("De más a menos metros cuadrados:\n"); 
			}

			for (int i = 0; i < tamañoP; i++) { 
				System.out.println(lista_pisos.get(i).toString() + "\n"); 
			}
			
			for (int i = 0; i < tamañoC; i++) { 
				System.out.println(lista_casas.get(i).toString() + "\n"); 
			}
		} else { 
			System.out.println("No hay ningún inmueble en venta entre esos valores"); 
		}

		System.out.println("\nFin del programa para listar los pisos por precio"); 
	}

	public static void listarPorMetrosCuadrados() { 
		float metrosMin, metrosMax; 

		System.out.println("El minimo de metros cuadrados no puede ser mayor que el maximo de metros cuadrados \ny el maximo de metros cuadrados no puede ser menor que el minimo de metros cuadrados");
		System.out.println("\nIntroduzca el rango que quieres buscar los pisos");	
		System.out.println("Introduzca el minimo de metros cuadrados: ");	
		metrosMin = scan.nextFloat();	
		System.out.println("Introduzca el maximo de metros cuadrados: ");	
		metrosMax = scan.nextFloat();

		while (metrosMin > metrosMax) { 
			System.out.println("El minimo de metros cuadrados no puede ser mayor que el maximo de metros cuadrados \ny el maximo de metros cuadrados no puede ser menor que el minimo de metros cuadrados");
			System.out.println("\nIntroduzca el rango que quieres buscar los pisos");	
			System.out.println("Introduzca el minimo de metros cuadrados: ");	
			metrosMin = scan.nextFloat();	
			System.out.println("Introduzca el maximo de metros cuadrados: ");	
			metrosMax = scan.nextFloat();
		}

		for (int i = 0; i < inmuebles.size(); i++) { 
			if (inmuebles.get(i).isAlquilado() == true) {
				if (inmuebles.get(i).getMetrosCuadrados() > metrosMin && inmuebles.get(i).getMetrosCuadrados() < metrosMax) {
					lista_inmueblesalquiler.add(inmuebles.get(i)); 
				}
			} else {
				if (inmuebles.get(i).getMetrosCuadrados() > metrosMin && inmuebles.get(i).getMetrosCuadrados() < metrosMax) {
					lista_inmueblesventa.add(inmuebles.get(i)); 
				}
			}
		}

		ordenarPorMetrosCuadrados(lista_inmueblesalquiler, lista_inmueblesventa); 
		lista_inmueblesalquiler.clear(); 
		lista_inmueblesventa.clear(); 
	}
	
	public static void eliminarPisos() {
		String opcAoV = "g";	
		String opcInm = "g";
		int id;	

		do {
			System.out.println("¿Quieres alquilar o vender un inmueble?\n  1. Inmueble en Alquiler\n  2. Inmueble en Venta\n  0. No alquilar/vender ninguno");
			System.out.println("\nElige una opción: ");	
			opcAoV = scan.next();	
			switch (opcAoV) {	
			case "1":	
				int validoA = 0;	

				do {
					if (inmuebles.size() != 0) {	
						System.out.println("¿Que tipo de inmueble quieres alquilar?");
						System.out.println("  1. Piso\n  2. Casa\n  0. Ninguno(Salir)");
						System.out.println("\nElige una opción: ");	
						opcInm = scan.next();	
						
						lista_pisos.clear();
						lista_casas.clear();
						
						for (Inmueble Inmuebles : inmuebles) {
							if (Inmuebles.isAlquilado() == true) {
								if(Inmuebles instanceof Piso) {
									lista_pisos.add((Piso) Inmuebles);
								} else {
									lista_casas.add((Casa) Inmuebles);
								}
							}
						}

						switch (opcInm) {
						case "1":
							listarPisosAlquiler();	

							System.out.println("¿Que piso quieres alquilar? (Escribe su ID)");	
							System.out.println("Nota: Digite -1 para no alquilar un piso");	
							id = scan.nextInt();	

							if (id != -1) {	
								for (int i = 0; i < lista_pisos.size(); i++) {	
									if (inmuebles.get(i).getId() == id) {	
										inmuebles.remove(i);	
										validoA = 1;	

										System.out.println("El piso ha sido alquilado\n");	
									}
								}

								if (validoA == 0) {	
									System.out.println("Este ID no se corresponde con ningún piso\nEscribelo de nuevo\n");
								}
							} else {	
								validoA = 1;	
							}
							break;
						case "2":
							listarCasasAlquiler();	

							System.out.println("¿Que casa quieres alquilar? (Escribe su ID)");	
							System.out.println("Nota: Digite -1 para no alquilar una casa");	
							id = scan.nextInt();	

							if (id != -1) {	
								for (int i = 0; i < lista_casas.size(); i++) {	
									if (inmuebles.get(i).getId() == id) {	
										inmuebles.remove(i);	
										validoA = 1;	

										System.out.println("La casa ha sido alquilado\n");	
									}
								}

								if (validoA == 0) {	
									System.out.println("Este ID no se corresponde con ninguna casa\nEscribelo de nuevo\n");
								}
							} else {	
								validoA = 1;	
							}
							break;
						case "0":
							//System.out.println("\nFin del programa para alquilar/vender pisos");	
							break;	
						default:	
							System.out.println("ERROR! Ese dato no es válido");	
							break;
						}
					} else {	
						System.out.println("No queda ningún inmueble para alquilar\n");	
						validoA = 1;	
					}
				} while (validoA == 0);	
				break;	
			case "2":	
				int validoV = 0;	

				do {
					if (inmuebles.size() != 0) {	
						System.out.println("¿Que tipo de inmueble quieres vender?");
						System.out.println("  1. Piso\n  2. Casa\n  0. Ninguno(Salir)");
						System.out.println("\nElige una opción: ");	
						opcInm = scan.next();	
						
						lista_pisos.clear();
						lista_casas.clear();
						
						for (Inmueble Inmuebles : inmuebles) {
							if (Inmuebles.isAlquilado() == false) {
								if(Inmuebles instanceof Piso) {
									lista_pisos.add((Piso) Inmuebles);
								} else {
									lista_casas.add((Casa) Inmuebles);
								}
							}
						}

						switch (opcInm) {
						case "1":
							listarPisosAlquiler();	

							System.out.println("¿Que piso quieres vender? (Escribe su ID)");	
							System.out.println("Nota: Digite -1 para no vender un piso");	
							id = scan.nextInt();	

							if (id != -1) {	
								for (int i = 0; i < lista_pisos.size(); i++) {	
									if (inmuebles.get(i).getId() == id) {	
										inmuebles.remove(i);	
										validoV = 1;	

										System.out.println("El piso ha sido vendido\n");	
									}
								}

								if (validoV == 0) {	
									System.out.println("Este ID no se corresponde con ningún piso\nEscribelo de nuevo\n");
								}
							} else {	
								validoV = 1;	
							}
							break;
						case "2":
							listarCasasAlquiler();	

							System.out.println("¿Que casa quieres vender? (Escribe su ID)");	
							System.out.println("Nota: Digite -1 para no vender una casa");	
							id = scan.nextInt();	

							if (id != -1) {	
								for (int i = 0; i < lista_casas.size(); i++) {	
									if (inmuebles.get(i).getId() == id) {	
										inmuebles.remove(i);	
										validoV = 1;	

										System.out.println("La casa ha sido vendida\n");	
									}
								}

								if (validoV == 0) {	
									System.out.println("Este ID no se corresponde con ninguna casa\nEscribelo de nuevo\n");
								}
							} else {	
								validoV = 1;	
							}
							break;
						case "0":
							//System.out.println("\nFin del programa para alquilar/vender pisos");	
							break;	
						default:	
							System.out.println("ERROR! Ese dato no es válido");	
							break;
						}
					} else {	
						System.out.println("No queda ningún inmueble para vender\n");	
						validoV = 1;	
					}
				} while (validoV == 0);	
				break;	
			case "0":	
				System.out.println("\nFin del programa para alquilar/vender pisos");	
				break;	
			default:	
				System.out.println("ERROR! Ese dato no es válido");	
				break;	
			}
		} while (!opcAoV.contentEquals("0"));	
	}
	
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		String opc = "g";

		do {
			System.out.println("\nBienvenido al menú virtual " + Agencia.getNombre() + " \n");

			System.out.println("Este menú virtual cuenta con las siguientes opciones: ");

			System.out.println("  0. Salir.");
			System.out.println("  1. Añadir un nuevo inmueble a la venta o en alquiler a la lista.");
			System.out.println("  2. Modificar un inmueble existente en la lista.");
			System.out.println("  3. Listar los inmuebles disponibles.");
			System.out.println("  4. Listar los inmuebles en un rango de precios.");
			System.out.println("  5. Listar los inmuebles en un rango de metros cuadrados.");
			System.out.println("  6. Eliminar un inmueble de la lista tras este ser alquilado o vendido.");

			System.out.println("\nIntroduzca una opción para el menú: ");
			opc = scan.next();
			switch (opc) {
//case "1": añadirPisos(); break;
//case "2": modificarPisos(); break;
			case "3": mostrarPisos();	break;
			case "4": listarPorPrecio(); break;
			case "5": listarPorMetrosCuadrados(); break;
			case "6": eliminarPisos(); break;
			case "0": System.out.println("\n\nFin del programa");	break;
			default: System.out.println("ERROR! Ese dato no es válido");	break;
			}
		} while (!opc.contentEquals("0"));
		scan.close();
	}

	public static void main(String[] args) {
		Agencia agenciaD11 = new Agencia("La inmobiliaria del Distrito 11");

		Piso piso1 = new Piso(605, 130, "Calle", "Rúa das Meidades", 11, 36600, 3, 2, 'B', true, true);
		Piso piso2 = new Piso(802, 160, "Avenida", "Rúa Xogo da Ola", 43, 36560, 4, 1, 'A', false, true);
		Piso piso3 = new Piso(935, 155, "Plaza", "Rúa O Lugar de Breogán", 27, 36760, 1, 4, 'C', false, true);
		Casa Casa1 = new Casa(634, 143, "Camino", "Rúa Naiterra Miña", 55, 36500, 8, true, false, true);
		Casa Casa2 = new Casa(799, 139, "Carretera", "Rúa Plaza España", 18, 36555, 6, false, false, true);

		Piso piso4 = new Piso(300455, 100, "Paseo", "Rúa Mercantil de Zafan", 39, 36660, 1, 6, 'G', true, false);
		Piso piso5 = new Piso(350000, 127, "Avenida", "Rúa Barbeitos", 6, 36450, 4, 4, 'D', false, false);
		Casa Casa3 = new Casa(405000, 172, "Plaza", "Rúa da Programación", 87, 36800, 7, true, false, false);
		Casa Casa4 = new Casa(535000, 232, "Calle", "Rúa Cleanance Azul", 34, 36120, 9, false, true, false);
		Casa Casa5 = new Casa(635000, 350, "Carretera", "Rúa do Distrito 11", 21, 36240, 11, false, false, false);

		inmuebles.add(piso1);
		inmuebles.add(piso2);
		inmuebles.add(piso3);
		inmuebles.add(Casa1);
		inmuebles.add(Casa2);

		inmuebles.add(piso4);
		inmuebles.add(piso5);
		inmuebles.add(Casa3);
		inmuebles.add(Casa4);
		inmuebles.add(Casa5);

		agenciaD11.setInmueble(inmuebles);

		menu();
	}
}