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

	static Scanner scan = new Scanner(System.in);	//Se crea un scanner global

	public static void rellenarPisos(Piso p) {
		int x;
		float z;
		String est = "0", texto;

		System.out.println("�El piso es un estudio? (si/no)");
		texto = scan.next();

		texto = texto.toLowerCase();

		do {
			if (texto.contentEquals("si")) {
				p.setEstudio(true);
				p.setNumHabitaciones(1);
				est = "1";
			} else if (texto.contentEquals("no")) {
				System.out.print("Introduce el n�mero de habitaciones del piso: ");
				x = scan.nextInt();
				
				while(x < 1) {
					System.out.println("Error! El n�mero de habitaciones no puede ser menor que uno");
					System.out.print("Introduce el n�mero de habitaciones del piso: ");
					x = scan.nextInt();
				}
				
				p.setNumHabitaciones(x);
				est = "0";
			} else {
				est = "2";
				System.out.println("Error! tienes que responder con un si o no");
				System.out.println("�El piso es un estudio? (si/no)");
				texto = scan.next();

				texto = texto.toLowerCase();
			}
		} while (est.contentEquals("2"));

		System.out.print("Introduce el precio del piso: ");
		z = scan.nextFloat();
		
		while(z < 0) {
			System.out.println("Error! El precio del piso no puede ser negativo");
			System.out.print("Introduce el precio del piso: ");
			z = scan.nextFloat();
		}
		
		p.setPrecio(z);
		System.out.print("Introduce los metros cuadrados del piso: ");
		z = scan.nextFloat();
		
		while(z < 0) {
			System.out.println("Error! Los metros cuadrados del piso no pueden tener un valor negativo");
			System.out.print("Introduce los metros cuadrados del piso: ");
			z = scan.nextFloat();
		}
		
		p.setMetrosCuadrados(z);
		System.out.print("Introduce la direcci�n del piso: \n");
		System.out.print("Introduce el tipo de v�a: ");
		scan.nextLine();
		p.setTipoVia(scan.nextLine());
		System.out.print("Introduce el nombre: ");
		p.setNombre(scan.nextLine());
		System.out.print("Introduce el n�mero: ");
		x = scan.nextInt();
		
		while(x < 0) {
			System.out.println("Error! El n�mero del piso no puede ser negativo");
			System.out.print("Introduce el n�mero: ");
			x = scan.nextInt();
		}
		
		p.setNumero(x);
		System.out.print("Introduce el c�digo postal: ");
		x = scan.nextInt();
		
		while(x < 0) {
			System.out.println("Error! El c�digo postal no puede ser negativo");
			System.out.print("Introduce el c�digo postal: ");
			x = scan.nextInt();
		}
		
		p.setCp(x);
		p.setDireccion(p.direccion(p.getTipoVia(), p.getNombre(), p.getNumero(), p.getCp()));
		System.out.print("Introduce el n�mero del piso: ");
		x = scan.nextInt();
		
		while(x < 0) {
			System.out.println("Error! El n�mero del piso no puede ser negativo");
			System.out.print("Introduce el n�mero del piso: ");
			x = scan.nextInt();
		}
		
		p.setNumeroPiso(x);
		System.out.print("Introduce la letra del piso: ");
		p.setLetraPuerta(scan.next().charAt(0));

		inmuebles.add(p);
	}

	public static void rellenarCasas(Casa c) {
		int x;
		float z = 0f;
		String toret = "0", texto;
		
		System.out.print("Introduce el precio de la casa: ");
		z = scan.nextFloat();
		
		while(z < 0) {
			System.out.println("Error! El precio de la casa no puede ser negativo");
			System.out.print("Introduce el precio de la casa: ");
			z = scan.nextFloat();
		}
		
		c.setPrecio(z);
		System.out.print("Introduce los metros cuadrados de la casa: ");
		z = scan.nextFloat();
		
		while(z < 0) {
			System.out.println("Error! Los metros cuadrados de la casa no pueden tener un valor negativo");
			System.out.print("Introduce los metros cuadrados de la casa: ");
			z = scan.nextFloat();
		}
		
		c.setMetrosCuadrados(z);
		System.out.print("Introduce la direcci�n de la casa: \n");
		System.out.print("Introduce el tipo de v�a: ");
		scan.nextLine();
		c.setTipoVia(scan.nextLine());
		System.out.print("Introduce el nombre: ");
		c.setNombre(scan.nextLine());
		System.out.print("Introduce el n�mero: ");
		x = scan.nextInt();
		
		while(x < 0) {
			System.out.println("Error! El n�mero de la casa no puede ser negativo");
			System.out.print("Introduce el n�mero: ");
			x = scan.nextInt();
		}
		
		c.setNumero(x);
		System.out.print("Introduce el c�digo postal: ");
		x = scan.nextInt();
		
		while(x < 0) {
			System.out.println("Error! El c�digo postal no puede ser negativo");
			System.out.print("Introduce el c�digo postal: ");
			x = scan.nextInt();
		}
		
		c.setCp(x);
		c.setDireccion(c.direccion(c.getTipoVia(), c.getNombre(), c.getNumero(), c.getCp()));
		System.out.print("Introduce el n�mero de habitaciones de la casa: ");
		x = scan.nextInt();
		
		while(x < 1) {
			System.out.println("Error! El n�mero de habitaciones no puede ser menor que uno");
			System.out.print("Introduce el n�mero de habitaciones de la casa: ");
			x = scan.nextInt();
		}
		
		c.setNumHabitaciones(x);

		System.out.print("�La casa tiene un jard�n? (si/no): ");
		texto = scan.next();

		texto = texto.toLowerCase();

		do {
			if (texto.contentEquals("si")) {
				c.setJardin(true);
				toret = "0";
			} else if (texto.contentEquals("no")) {
				c.setJardin(false);
				toret = "0";
			} else {
				toret = "2";
				System.out.println("Error! Tienes que responder con un si o no");
				System.out.print("�La casa tiene un jard�n? (si/no): ");
				texto = scan.next();

				texto = texto.toLowerCase();
			}
		} while (!toret.contentEquals("0"));

		System.out.print("�La casa tiene un garaje? (si/no): ");
		texto = scan.next();

		texto = texto.toLowerCase();

		do {
			if (texto.contentEquals("si")) {
				c.setGaraje(true);
				toret = "0";
			} else if (texto.contentEquals("no")) {
				c.setGaraje(false);
				toret = "0";
			} else {
				toret = "2";
				System.out.println("Error! Tienes que responder con un si o no");
				System.out.print("�La casa tiene un garaje? (si/no): ");
				texto = scan.next();

				texto = texto.toLowerCase();
			}
		} while (!toret.contentEquals("0"));

		inmuebles.add(c);
	}

	public static void a�adirInmuebles() {
		String opcInm = "g", opcAoV = "g";
		int numInm = 0;

		do {
			System.out.println("�Quieres a�adir un inmueble en alquiler o en venta?\n  1. Inmueble en Alquiler\n  2. Inmueble en Venta\n  0. No a�adir ning�n inmueble");
			System.out.println("\nElige una opci�n: ");
			opcInm = scan.next();
			switch (opcInm) {

			case "1":
				System.out.print("Introduce el n�mero de inmuebles en alquiler a introducir: ");
				numInm = scan.nextInt();

				while (numInm < 0) {
					System.out.println("\nEse no es un valor v�lido");
					System.out.print("Introduce de nuevo el n�mero de inmuebles en alquiler a introducir: ");
					numInm = scan.nextInt();
				}

				do {
					System.out.println("�Quieres a�adir un piso o una casa en alquiler?\n  1. Piso\n  2. Casa\n  0. No a�adir ning�n inmueble");
					System.out.println("\nElige una opci�n: ");
					opcAoV = scan.next();
					switch (opcAoV) {
					case "1":
						for (int i = 0; i < numInm; i++) {
							Piso p = new Piso();

							System.out.println("\nPara el Piso en Alquiler " + p.getId() + "(ID)");
							p.setAlquilado(true);
							rellenarPisos(p);
						}
						opcAoV = "0";
						break;
					case "2":
						for (int i = 0; i < numInm; i++) {
							Casa c = new Casa();

							System.out.println("\nPara la Casa en Alquiler " + c.getId() + "(ID)");
							c.setAlquilado(true);
							rellenarCasas(c);
						}
						opcAoV = "0";
						break;
					case "0":
						
						break;
					default:
						System.out.println("ERROR! Ese dato no es v�lido");
						break;
					}
				} while (!opcAoV.contentEquals("0"));
				break;
			case "2":
				System.out.print("Introduce el n�mero de inmuebles en venta a introducir: ");
				numInm = scan.nextInt();

				while (numInm < 0) {
					System.out.println("\nEse no es un valor v�lido");
					System.out.print("Introduce de nuevo el n�mero de inmuebles en venta a introducir: ");
					numInm = scan.nextInt();
				}

				do {
					System.out.println("�Quieres a�adir un piso o una casa en venta?\n  1. Piso\n  2. Casa\n  0. No a�adir ning�n inmueble");
					System.out.println("\nElige una opci�n: ");
					opcAoV = scan.next();

					switch (opcAoV) {
					case "1":
						for (int i = 0; i < numInm; i++) {
							Piso p = new Piso();

							System.out.println("\nPara el Piso en Venta " + p.getId() + "(ID)");
							p.setAlquilado(false);
							rellenarPisos(p);
						}
						opcAoV = "0";
						break;
					case "2":
						for (int i = 0; i < numInm; i++) {
							Casa c = new Casa();

							System.out.println("\nPara la Casa en Venta " + c.getId() + "(ID)");
							c.setAlquilado(false);
							rellenarCasas(c);
						}
						opcAoV = "0";
						break;
					case "0":
						
						break;
					default:
						System.out.println("ERROR! Ese dato no es v�lido");
						break;
					}
				} while (!opcAoV.contentEquals("0"));

				break;
			case "0":
				System.out.println("\nFin del programa para a�adir pisos");
				break;

			default:
				System.out.println("ERROR! Ese dato no es v�lido");
				break;
			}
		} while (!opcInm.contentEquals("0"));
	}

	public static void modificarDireccion(int pos_id) {
		int x;
		String opcDirec = "0";
		do {
			System.out.println("La direcci�n actual es: " + inmuebles.get(pos_id).getDireccion());
			System.out.println("Nota: Teclea el 0 para dejar de modificar el inmueble \n�Que es lo que quieres modificar de la direcci�n?");
			System.out.println("  1. El tipo de v�a\n  2. El nombre\n  3. El n�mero\n  4. El c�digo postal\n  5. Cambiar toda la direcci�n a la vez\n  0. No cambiar nada en la direcci�n");
			System.out.println("\nElige una opci�n: ");
			opcDirec = scan.next();
			
			switch (opcDirec) {
			case "1":
				System.out.println("El actual tipo de v�a es " + inmuebles.get(pos_id).getTipoVia());
				System.out.print("Introduce el tipo de v�a: ");
				scan.nextLine();
				inmuebles.get(pos_id).setTipoVia(scan.nextLine());
				inmuebles.get(pos_id).setDireccion(inmuebles.get(pos_id).direccion(inmuebles.get(pos_id).getTipoVia(), inmuebles.get(pos_id).getNombre(), inmuebles.get(pos_id).getNumero(), inmuebles.get(pos_id).getCp()));
				System.out.println();
				break;
			case "2":
				System.out.println("El actual nombre es " + inmuebles.get(pos_id).getNombre());
				System.out.print("Introduce el nombre: ");
				scan.nextLine();
				inmuebles.get(pos_id).setNombre(scan.nextLine());
				inmuebles.get(pos_id).setDireccion(inmuebles.get(pos_id).direccion(inmuebles.get(pos_id).getTipoVia(), inmuebles.get(pos_id).getNombre(), inmuebles.get(pos_id).getNumero(), inmuebles.get(pos_id).getCp()));
				System.out.println();
				break;
			case "3":
				System.out.println("El actual n�mero es " + inmuebles.get(pos_id).getNumero());
				System.out.print("Introduce el n�mero: ");
				
				x = scan.nextInt();
				
				while(x < 0) {
					System.out.println("Error! El n�mero no puede ser negativo");
					System.out.print("Introduce el n�mero: ");
					x = scan.nextInt();
				}
				inmuebles.get(pos_id).setNumero(x);
				inmuebles.get(pos_id).setDireccion(inmuebles.get(pos_id).direccion(inmuebles.get(pos_id).getTipoVia(), inmuebles.get(pos_id).getNombre(), inmuebles.get(pos_id).getNumero(), inmuebles.get(pos_id).getCp()));
				System.out.println();
				break;
			case "4":
				System.out.println("El actual c�digo postal es " + inmuebles.get(pos_id).getCp());
				System.out.print("Introduce el c�digo postal: ");
				x = scan.nextInt();
				
				while(x < 0) {
					System.out.println("Error! El c�digo postal no puede ser negativo");
					System.out.print("Introduce el c�digo postal: ");
					x = scan.nextInt();
				}
				inmuebles.get(pos_id).setCp(x);
				inmuebles.get(pos_id).setDireccion(inmuebles.get(pos_id).direccion(inmuebles.get(pos_id).getTipoVia(), inmuebles.get(pos_id).getNombre(), inmuebles.get(pos_id).getNumero(), inmuebles.get(pos_id).getCp()));
				System.out.println();
				break;
			case "5":
				System.out.println("La direcci�n actual es: " + inmuebles.get(pos_id).getDireccion());
				System.out.print("Introduce el tipo de v�a: ");
				scan.nextLine();
				inmuebles.get(pos_id).setTipoVia(scan.nextLine());
				System.out.print("Introduce el nombre: ");
				inmuebles.get(pos_id).setNombre(scan.nextLine());
				System.out.print("Introduce el n�mero: ");
				x = scan.nextInt();
				
				while(x < 0) {
					System.out.println("Error! El n�mero no puede ser negativo");
					System.out.print("Introduce el n�mero: ");
					x = scan.nextInt();
				}

				inmuebles.get(pos_id).setNumero(x);
				System.out.print("Introduce el c�digo postal: ");
				x = scan.nextInt();
				
				while(x < 0) {
					System.out.println("Error! El c�digo postal no puede ser negativo");
					System.out.print("Introduce el c�digo postal: ");
					x = scan.nextInt();
				}
				inmuebles.get(pos_id).setCp(x);
				inmuebles.get(pos_id).setDireccion(inmuebles.get(pos_id).direccion(inmuebles.get(pos_id).getTipoVia(), inmuebles.get(pos_id).getNombre(), inmuebles.get(pos_id).getNumero(), inmuebles.get(pos_id).getCp()));
				System.out.println();
				break;
			case "0":
				
				break;
			default:
				System.out.println("ERROR! Ese dato no es v�lido");
				break;
			}
		} while (!opcDirec.contentEquals("0"));
	}
	
	public static void modificarPisos(String opcModifcar, int pos_id) {
		int x;
		float z = 0f;
		
		do {
			System.out.println(inmuebles.get(pos_id).toString() + "\n");
			
			System.out.println("Nota: Teclea el 0 para dejar de modificar el piso \n�Que es lo que quieres modificar del piso?");
			System.out.println("  1. El precio\n  2. Los metros cuadrados\n  3. La direcci�n\n  4. El n�mero de habitaciones\n  5. El n�mero del piso\n  6. La letra de la puerta\n  0. Nada(Salir)");
			System.out.println("\nElige una opci�n: ");
			opcModifcar = scan.next();
			
			switch (opcModifcar) {
			case "1":
				System.out.println("El precio actual del piso es: " + inmuebles.get(pos_id).getPrecio());
				System.out.println("�A que precio quieres cambiarlo?");
				z = scan.nextFloat();
				
				while(z < 0) {
					System.out.println("Error! El precio del piso no puede ser negativo");
					System.out.print("Introduce el precio del piso: ");
					z = scan.nextFloat();
				}
				inmuebles.get(pos_id).setPrecio(z);
				System.out.println();
				break;
			case "2":
				System.out.println("Los metros cuadrados del piso es: " + inmuebles.get(pos_id).getMetrosCuadrados());
				System.out.println("�A cuantos metros cuadrados quieres cambiarlo?");
				z = scan.nextFloat();
				
				while(z < 0) {
					System.out.println("Error! Los metros cuadrados del piso no pueden tener un valor negativo");
					System.out.print("Introduce los metros cuadrados del piso: ");
					z = scan.nextFloat();
				}
				inmuebles.get(pos_id).setMetrosCuadrados(z);
				System.out.println();
				break;
			case "3":
				modificarDireccion(pos_id);
				System.out.println();
				break;
			case "4":
				int toret = 0;
				String texto;

				if ((((Piso) inmuebles.get(pos_id))).isEstudio() == true) {
					System.out.println("Actualmente el piso es un estudio\n�Va a dejar de ser un estudio? (si/no)");
					texto = scan.next();

					texto = texto.toLowerCase();
					do {
						if (texto.contentEquals("si")) {
							System.out.println("�A c�antas habitaciones quieres cambiarlo?");
							x = scan.nextInt();
							
							while(x < 1) {
								System.out.println("Error! El n�mero de habitaciones no puede ser menor que uno");
								System.out.print("Introduce el n�mero de habitaciones del piso: ");
								x = scan.nextInt();
							}
							inmuebles.get(pos_id).setNumHabitaciones(x);
							((Piso) inmuebles.get(pos_id)).setEstudio(false);
							toret = 2;
						} else if (texto.contentEquals("no")) {
							System.out.println("Actualmente el piso sigue siendo un estudio");
							toret = 2;
						} else {
							toret = 0;
							System.out.println("Error! Tienes que responder con un si o no");
							System.out.println("�El piso va a dejar de ser un estudio? (si/no)");
							texto = scan.next();

							texto = texto.toLowerCase();
						}
					} while (toret != 2);
				} else {
					System.out.println("Actualmente el piso no es un estudio\n�Va a ser un estudio? (si/no)");
					texto = scan.next();

					texto = texto.toLowerCase();
					do {
						if (texto.contentEquals("si")) {
							inmuebles.get(pos_id).setNumHabitaciones(1);
							((Piso) inmuebles.get(pos_id)).setEstudio(true);
							toret = 2;
							System.out.println("Actualmente el piso ya es un estudio");
						} else if (texto.contentEquals("no")) {
							System.out.println("Actualmente el piso sigue sin ser un estudio");
							toret = 2;
						} else {
							toret = 0;
							System.out.println("Error! Tienes que responder con un si o no");
							System.out.println("�El piso va a ser un estudio? (si/no)");
							texto = scan.next();

							texto = texto.toLowerCase();
						}
					} while (toret != 2);
				}
				System.out.println();
				break;
			case "5":
				System.out.println("El n�mero actual del piso es: " + ((Piso) inmuebles.get(pos_id)).getNumeroPiso());
				System.out.println("�A que n�mero quieres cambiarlo?");
				x = scan.nextInt();
				
				while(x < 0) {
					System.out.println("Error! El n�mero del piso no puede ser negativo");
					System.out.print("Introduce el n�mero del piso: ");
					x = scan.nextInt();
				}
				((Piso) inmuebles.get(pos_id)).setNumeroPiso(x);
				System.out.println();
				break;
			case "6":
				System.out.println("La letra actual de la puerta es: " + ((Piso) inmuebles.get(pos_id)).getLetraPuerta());
				System.out.println("�A que letra quieres cambiarlo?");
				((Piso) inmuebles.get(pos_id)).setLetraPuerta(scan.next().charAt(0));
				System.out.println();
				break;
			case "0":
				break;
			default:
				System.out.println("ERROR! Ese dato no es v�lido");
				break;
			}
		} while (!opcModifcar.contentEquals("0"));
	}

	public static void modificarCasas(String opcModifcar, int pos_id) {
		int toret = 0, x;
		float z = 0f;
		String texto;
		
		do {
			
			System.out.println(inmuebles.get(pos_id).toString() + "\n");
			
			System.out.println("Nota: Teclea el 0 para dejar de modificar la casa \n�Que es lo que quieres modificar de la casa?");
			System.out.println("  1. El precio\n  2. Los metros cuadrados\n  3. La direcci�n\n  4. El n�mero de habitaciones\n  5. Jard�n\n  6. Garaje\n  0. Nada(Salir)");
			System.out.println("\nElige una opci�n: ");
			opcModifcar = scan.next();

			switch (opcModifcar) {
			case "1":
				System.out.println("El precio actual de la casa es: " + inmuebles.get(pos_id).getPrecio());
				System.out.println("�A que precio quieres cambiarlo?");
				z = scan.nextFloat();
				
				while(z < 0) {
					System.out.println("Error! El precio de la casa no puede ser negativo");
					System.out.print("Introduce el precio de la casa: ");
					z = scan.nextFloat();
				}
				inmuebles.get(pos_id).setPrecio(z);
				System.out.println();
				break;
			case "2":
				System.out.println("Los metros cuadrados de la casa es: " + inmuebles.get(pos_id).getMetrosCuadrados());
				System.out.println("�A cuantos metros cuadrados quieres cambiarlo?");
				z = scan.nextFloat();
				
				while(z < 0) {
					System.out.println("Error! Los metros cuadrados de la casa no pueden tener un valor negativo");
					System.out.print("Introduce los metros cuadrados de la casa: ");
					z = scan.nextFloat();
				}
				inmuebles.get(pos_id).setMetrosCuadrados(z);
				System.out.println();
				break;
			case "3":
				modificarDireccion(pos_id);
				System.out.println();
				break;
			case "4":
				System.out.println("El n�mero de habitaciones es: " + inmuebles.get(pos_id).getNumHabitaciones());
				System.out.println("�A cuantos habitaciones quieres cambiarlo?");
				x = scan.nextInt();
				
				while(x < 1) {
					System.out.println("Error! El n�mero de habitaciones no puede ser menor que uno");
					System.out.print("Introduce el n�mero de habitaciones del piso: ");
					x = scan.nextInt();
				}
				inmuebles.get(pos_id).setNumHabitaciones(x);
				System.out.println();
				break;
			case "5":
				if ((((Casa) inmuebles.get(pos_id))).isJardin() == true) {
					System.out.println("Actualmente la casa tiene jard�n\n�Va a dejar de tener jard�n? (si/no)");
					texto = scan.next();

					texto = texto.toLowerCase();
					do {
						if (texto.contentEquals("si")) {
							System.out.println("Actualmente la casa ha dejado de tener jard�n");
							((Casa) inmuebles.get(pos_id)).setJardin(false);
							toret = 0;
						} else if (texto.contentEquals("no")) {
							System.out.println("Actualmente la casa sigue teniendo jard�n");
							toret = 0;
						} else {
							toret = 2;
							System.out.println("Error! Tienes que responder con un si o no");
							System.out.println("�Va a dejar de haber un jard�n? (si/no)");
							texto = scan.next();

							texto = texto.toLowerCase();
						}
					} while (toret != 2);
				} else {
					System.out.println("Actualmente la casa no tiene jard�n\n�Va a tener jard�n? (si/no)");
					texto = scan.next();

					texto = texto.toLowerCase();
					do {
						if (texto.contentEquals("si")) {
							System.out.println("Actualmente la casa tiene jard�n");
							((Casa) inmuebles.get(pos_id)).setJardin(true);
							toret = 0;
						} else if (texto.contentEquals("no")) {
							System.out.println("Actualmente la casa sigue sin tener jard�n");
							toret = 0;
						} else {
							toret = 2;
							System.out.println("Error! Tienes que responder con un si o no");
							System.out.println("�La casa va a tener jard�n? (si/no)");
							texto = scan.next();

							texto = texto.toLowerCase();
						}
					} while (toret != 2);
				}
				System.out.println();
				break;
			case "6":
				if ((((Casa) inmuebles.get(pos_id))).isGaraje() == true) {
					System.out.println("Actualmente la casa tiene garaje\n�Va a dejar de tener garaje? (si/no)");
					texto = scan.nextLine();

					do {
						if (texto.contentEquals("si")) {
							System.out.println("Actualmente la casa ha dejado de tener garaje");
							((Casa) inmuebles.get(pos_id)).setGaraje(false);
							toret = 0;
						} else if (texto.contentEquals("no")) {
							System.out.println("Actualmente la casa sigue teniendo garaje");
							toret = 0;
						} else {
							toret = 2;
							System.out.println("Error! Tienes que responder con un si o no");
							System.out.println("�La casa va a dejar de tener garaje? (si/no)");
							texto = scan.next();

							texto = texto.toLowerCase();
						}
					} while (toret != 2);
				} else {
					System.out.println("Actualmente la casa no tiene garaje\n�Va a tener garaje? (si/no)");
					texto = scan.nextLine();

					texto = texto.toLowerCase();
					do {
						if (texto.contentEquals("si")) {
							System.out.println("Actualmente la casa tiene garaje");
							((Casa) inmuebles.get(pos_id)).setGaraje(true);
							toret = 0;
						} else if (texto.contentEquals("no")) {
							System.out.println("Actualmente la casa sigue sin tener garaje");
							toret = 0;
						} else {
							toret = 2;
							System.out.println("Error! Tienes que responder con un si o no");
							System.out.println("�La casa va a tener garaje? (si/no)");
							texto = scan.next();

							texto = texto.toLowerCase();
						}
					} while (toret != 2);
				}
				System.out.println();
				break;
			case "0":
				break;
			default:
				System.out.println("ERROR! Ese dato no es v�lido");
				break;
			}
		} while (!opcModifcar.contentEquals("0"));
	}
	
	public static void modificarInmuebles() {
		String opcPiso = "g", opcPoC = "g";

		do {
			if(inmuebles.size() != 0) {
				System.out.println("�Quieres modificar un piso en alquiler o un piso en venta?\n  1. Piso en Alquiler\n  2. Piso en Venta\n  0. No modificar ning�n inmueble");
				System.out.println("\nElige una opci�n: ");
				opcPiso = scan.next();

				int pos_id = 0;
				
				lista_inmueblesalquiler.clear();
				lista_inmueblesventa.clear();
				
				for (int i = 0; i < inmuebles.size(); i++) {
					if (inmuebles.get(i).isAlquilado() == true) {
						lista_inmueblesalquiler.add(inmuebles.get(i));
					} else {
						lista_inmueblesventa.add(inmuebles.get(i));
					}
				}

				switch (opcPiso) {

				case "1":
					String opcModifcar = "g";
					int id;

					do {
						int validoA = 0;
						do {
							if (lista_inmueblesalquiler.size() != 0) {
								do {
									System.out.println("�Quieres modificar un piso o una casa?\n  1. Piso\n  2. Casa\n  0. No modificar ning�n piso o casa en alquiler");
									System.out.println("\nElige una opci�n: ");
									opcPoC = scan.next();
									
									lista_pisos.clear();
									lista_casas.clear();

									for (Inmueble Inmuebles : inmuebles) {
										if (Inmuebles.isAlquilado() == true) {
											if (Inmuebles instanceof Piso) {
												lista_pisos.add((Piso) Inmuebles);
											} else {
												lista_casas.add((Casa) Inmuebles);
											}
										}
									}
									
									switch (opcPoC) {
									case "1":
										do {
											listarPisosAlquiler();

											System.out.println("�Que piso en alquiler quieres modificar? (Escribe su ID)");
											System.out.println("Nota: Digite -1 para no modificar un piso");
											id = scan.nextInt();

											if (id != -1) {
												int j = 0;
												for (int i = 0; i < inmuebles.size(); i++) {
													if (inmuebles.get(i).getId() == id && lista_pisos.get(j).getId() == id) {
														validoA = 1;
														pos_id = i;
														i = inmuebles.size() - 1;
													}
													
													if(j != lista_pisos.size() - 1) j++;
												}
												if (validoA == 0) {
													System.out.println("Este ID no se corresponde con ning�n piso.\nEscribelo de nuevo\n");
												}
											} else {
												validoA = 2;
												opcModifcar = "0";
											}
											
											if (validoA == 1) {
												modificarPisos(opcModifcar, pos_id);
												validoA = 0;
											}
										} while(validoA == 0);
										break;
									case "2":
										do {
											listarCasasAlquiler();

											System.out.println("�Que casa en alquiler quieres modificar? (Escribe su ID)");
											System.out.println("Nota: Digite -1 para no modificar una casa");
											id = scan.nextInt();

											if (id != -1) {
												int j = 0;
												for (int i = 0; i < inmuebles.size(); i++) {
													if (inmuebles.get(i).getId() == id && lista_casas.get(j).getId() == id) {
														validoA = 1;
														pos_id = i;
													}
													
													if(j != lista_casas.size() - 1) j++;
												}
												if (validoA == 0) {
													System.out.println("Este ID no se corresponde con ninguna casa.\nEscribelo de nuevo\n");
												}
											} else {
												validoA = 2;
												opcModifcar = "0";
											}
											
											if (validoA == 1) {
												modificarCasas(opcModifcar, pos_id);
												validoA = 0;
											}
										} while(validoA == 0);
										break;
									case "0":
										
										opcModifcar = "0";
										break;
									default:
										System.out.println("ERROR! Ese dato no es v�lido");
										break;
									}
								} while (!opcPoC.contentEquals("0"));
								break;
							} else {
								System.out.println("No hay ning�n inmueble en alquiler para modificar\n");
								validoA = 2;
								opcModifcar = "0";
							}
						} while (validoA == 0);
					} while (!opcModifcar.contentEquals("0"));
					break;

				case "2":
					opcModifcar = "g";
					do {
						int validoV = 0;
						do {
							if (lista_inmueblesventa.size() != 0) {
								do {
									System.out.println("�Quieres modificar un piso o una casa?\n  1. Piso\n  2. Casa\n  0. No modificar ning�n piso o casa en venta");
									System.out.println("\nElige una opci�n: ");
									opcPoC = scan.next();
									
									lista_pisos.clear();
									lista_casas.clear();

									for (Inmueble Inmuebles : inmuebles) {
										if (Inmuebles.isAlquilado() == false) {
											if (Inmuebles instanceof Piso) {
												lista_pisos.add((Piso) Inmuebles);
											} else {
												lista_casas.add((Casa) Inmuebles);
											}
										}
									}
									
									switch (opcPoC) {
									case "1":
										do {
											listarPisosVenta();

											System.out.println("�Que piso quieres modificar? (Escribe su ID)");
											System.out.println("Nota: Digite -1 para no modificar un piso\n");
											id = scan.nextInt();

											if (id != -1) {
												int j = 0;
												for (int i = 0; i < inmuebles.size(); i++) {
													if (inmuebles.get(i).getId() == id && lista_pisos.get(j).getId() == id) {
														validoV = 1;
														pos_id = i;
													}
													
													if(j != lista_pisos.size() - 1) j++;
												}

												if (validoV == 0) {
													System.out.println("Este ID no se corresponde con ning�n piso.\nEscribelo de nuevo\n");
												}
											} else {
												validoV = 2;
												opcModifcar = "0";
											}
											
											if (validoV == 1) {
												modificarPisos(opcModifcar, pos_id);
												validoV = 0;
											}
										} while(validoV == 0);
										break;
									case "2":
										do {
											listarCasasVenta();

											System.out.println("�Que casa quieres modificar? (Escribe su ID)");
											System.out.println("Nota: Digite -1 para no modificar una casa\n");
											id = scan.nextInt();

											if (id != -1) {
												int j = 0;
												for (int i = 0; i < inmuebles.size(); i++) {
													if (inmuebles.get(i).getId() == id && lista_casas.get(j).getId() == id) {
														validoV = 1;
														pos_id = i;
													}
													
													if(j != lista_casas.size() - 1) j++;
												}

												if (validoV == 0) {
													System.out.println("Este ID no se corresponde con ninguna casa.\nEscribelo de nuevo\n");
												}
											} else {
												validoV = 2;
												opcModifcar = "0";
											}
											
											if (validoV == 1) {
												modificarCasas(opcModifcar, pos_id);
												validoV = 0;
											}
										} while(validoV == 0);
										break;
									case "0":
										
										opcModifcar = "0";
										break;
									default:
										System.out.println("ERROR! Ese dato no es v�lido");
										break;
									}
									break;
								} while (!opcPoC.contentEquals("0"));
							} else {
								System.out.println("No hay ning�n inmueble en venta para modificar\n");
								validoV = 2;
								opcModifcar = "0";
							}
						} while (validoV == 0);
						
					} while (!opcModifcar.contentEquals("0"));
					break;
				case "0":
					System.out.println("\nFin del programa para modificar inmuebles");
					break;
				default:
					System.out.println("ERROR! Ese dato no es v�lido");
					break;
				}
			} else {
				System.out.println("No queda ning�n inmueble para modificar");
				System.out.println("\nFin del programa para modificar inmuebles");
				opcPiso = "0";
			}
		} while (!opcPiso.contentEquals("0"));
	}
	
	//Este m�todo muestra solo los pisos en alquiler
	public static void listarPisosAlquiler() {
		System.out.println("Inmuebles en Alquiler");
		System.out.println("Pisos en Alquiler\n");

		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == true) {
				if (Inmuebles instanceof Piso) {
					System.out.println(Inmuebles.toString() + "\n");
				}
			}
		}
	}

	//Este m�todo muestra solo las casas en alquiler
	public static void listarCasasAlquiler() {
		System.out.println("Casas en Alquiler\n");

		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == true) {
				if (Inmuebles instanceof Casa) {
					System.out.println(Inmuebles.toString() + "\n");
				}
			}
		}
	}

	//Este m�todo muestra solo los pisos en venta
	public static void listarPisosVenta() {
		System.out.println("Inmuebles en Venta");
		System.out.println("Pisos en Venta\n");

		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == false) {
				if (Inmuebles instanceof Piso) {
					System.out.println(Inmuebles.toString() + "\n");
				}
			}
		}
	}

	//Este m�todo muestra solo las casas en venta
	public static void listarCasasVenta() {
		System.out.println("Casas en Venta\n");

		for (Inmueble Inmuebles : inmuebles) {
			if (Inmuebles.isAlquilado() == false) {
				if (Inmuebles instanceof Casa) {
					System.out.println(Inmuebles.toString() + "\n");
				}
			}
		}
	}

	/*Este m�todo es basicamente un men�. Seg�n lo que teclee el usuario tendr� la opci�n de salir del men�, 
	mostrar los inmuebles en alquiler,mostrar los inmuebles en venta o mostrar todos los inmuebles,
	para ello dentro de las diferentes opciones se llamar� a los m�todos oportunos*/
	public static void mostrarInmuebles() {
		String opcInm = "g";

		do {
			System.out.println("�Como quieres visualizar los inmuebles?\n  1. Visualizar los Inmuebles en Alquiler\n  2. Visualizar los Inmuebles en Venta\n  3. Visualizar todos los Inmuebles\n  0. No visualizar ning�n inmueble");
			System.out.println("\nElige una opci�n: ");
			opcInm = scan.next();
			switch (opcInm) {

			case "1":
				if (inmuebles.size() != 0) {
					listarPisosAlquiler();
					listarCasasAlquiler();
				} else {
					System.out.println("No hay ning�n inmueble en alquiler\n");
				}

				break;
			case "2":
				if (inmuebles.size() != 0) {
					listarPisosVenta();
					listarCasasVenta();
				} else {
					System.out.println("No hay ning�n inmueble en venta\n");
				}

				break;
			case "3":
				if (inmuebles.size() != 0) {
					listarPisosAlquiler();
					listarCasasAlquiler();
				} else {
					System.out.println("No hay ning�n inmueble en alquiler\n");
				}

				if (inmuebles.size() != 0) {
					listarPisosVenta();
					listarCasasVenta();
				} else {
					System.out.println("No hay ning�n inmueble en venta\n");
				}

				break;
			case "0":
				System.out.println("\nFin del programa para listar los inmuebles");
				break;
			default:
				System.out.println("ERROR! Ese dato no es v�lido");
				break;
			}
		} while (!opcInm.contentEquals("0"));
	}

	public static ArrayList<Piso> lista_pisos = new ArrayList<Piso>();
	public static ArrayList<Casa> lista_casas = new ArrayList<Casa>();

	public static ArrayList<Inmueble> lista_inmueblesalquiler = new ArrayList<Inmueble>();
	public static ArrayList<Inmueble> lista_inmueblesventa = new ArrayList<Inmueble>();

	public static void ordenarPorPrecio(ArrayList<Inmueble> lista_inmueblesalquiler,
			ArrayList<Inmueble> lista_inmueblesventa) {
		int tama�o, tama�oP, tama�oC;

		tama�o = lista_inmueblesalquiler.size();

		if (tama�o != 0) {
			for (Inmueble Inmuebles : lista_inmueblesalquiler) {
				if (Inmuebles.isAlquilado() == true) {
					if (Inmuebles instanceof Piso) {
						lista_pisos.add((Piso) Inmuebles);
					} else {
						lista_casas.add((Casa) Inmuebles);
					}
				}
			}

			Piso auxAP = new Piso();
			Casa auxAC = new Casa();
			tama�oP = lista_pisos.size();
			tama�oC = lista_casas.size();

			if (tama�oP != 0) {
				auxAP = lista_pisos.get(0);
				for (int i = 0; i < tama�oP - 1; i++) {
					for (int j = 0; j < tama�oP - 1; j++) {
						if (lista_pisos.get(j).getPrecio() < lista_pisos.get(j + 1).getPrecio()) {
							auxAP = lista_pisos.get(j);
							lista_pisos.set(j, lista_pisos.get(j + 1));
							lista_pisos.set(j + 1, (Piso) auxAP);
						}
					}
				}
			} else {
				System.out.println("No hay ning�n piso en alquiler entre esos valores");
			}

			if (tama�oC != 0) {
				auxAC = lista_casas.get(0);
				for (int i = 0; i < tama�oC - 1; i++) {
					for (int j = 0; j < tama�oC - 1; j++) {
						if (lista_casas.get(j).getPrecio() < lista_casas.get(j + 1).getPrecio()) {
							auxAC = lista_casas.get(j);
							lista_casas.set(j, lista_casas.get(j + 1));
							lista_casas.set(j + 1, (Casa) auxAC);
						}
					}
				}
			} else {
				System.out.println("No hay ninguna casa en alquiler entre esos valores");
			}

			if (tama�o != 1) {
				System.out.println("\nInmuebles en Alquiler");
			}

			if (tama�oP == 1) {
				System.out.println("Piso en Alquiler\n");
				System.out.println(lista_pisos.get(0).toString() + "\n");
			} else if (tama�oP != 0){
				System.out.println("Pisos en Alquiler de mayor a menor precio:\n");
				for (int i = 0; i < tama�oP; i++) {
					System.out.println(lista_pisos.get(i).toString() + "\n");
				} 
			}
			
			if (tama�oC == 1) {
				System.out.println("Casa en Alquiler\n");
				System.out.println(lista_casas.get(0).toString() + "\n");
			} else if (tama�oC != 0){
				System.out.println("Casas en Alquiler de mayor a menor precio:\n");
				for (int i = 0; i < tama�oC; i++) {
					System.out.println(lista_casas.get(i).toString() + "\n");
				}
			}

		} else {
			System.out.println("No hay ning�n inmueble en alquiler entre esos valores");
		}

		lista_pisos.clear();
		lista_casas.clear();

		tama�o = lista_inmueblesventa.size();

		if (tama�o != 0) {
			for (Inmueble Inmuebles : lista_inmueblesventa) {
				if (Inmuebles.isAlquilado() == false) {
					if (Inmuebles instanceof Piso) {
						lista_pisos.add((Piso) Inmuebles);
					} else {
						lista_casas.add((Casa) Inmuebles);
					}
				}
			}

			Piso auxVP = new Piso();
			Casa auxVC = new Casa();
			tama�oP = lista_pisos.size();
			tama�oC = lista_casas.size();

			if (tama�oP != 0) {
				auxVP = lista_pisos.get(0);
				for (int i = 0; i < tama�oP - 1; i++) {
					for (int j = 0; j < tama�oP - 1; j++) {
						if (lista_pisos.get(j).getPrecio() < lista_pisos.get(j + 1).getPrecio()) {
							auxVP = lista_pisos.get(j);
							lista_pisos.set(j, lista_pisos.get(j + 1));
							lista_pisos.set(j + 1, (Piso) auxVP);
						}
					}
				}
			} else {
				System.out.println("No hay ning�n piso en venta entre esos valores");
			}

			if (tama�oC != 0) {
				auxVC = lista_casas.get(0);
				for (int i = 0; i < tama�oC - 1; i++) {
					for (int j = 0; j < tama�oC - 1; j++) {
						if (lista_casas.get(j).getPrecio() < lista_casas.get(j + 1).getPrecio()) {
							auxVC = lista_casas.get(j);
							lista_casas.set(j, lista_casas.get(j + 1));
							lista_casas.set(j + 1, (Casa) auxVC);
						}
					}
				}
			} else {
				System.out.println("No hay ninguna casa en venta entre esos valores");
			}

			if (tama�o != 1) {
				System.out.println("\nInmuebles en Venta");
			}

			if (tama�oP == 1) {
				System.out.println("Piso en Venta\n");
				System.out.println(lista_pisos.get(0).toString() + "\n");
			} else if (tama�oP != 0){
				System.out.println("Pisos en Venta de mayor a menor precio:\n");
				for (int i = 0; i < tama�oP; i++) {
					System.out.println(lista_pisos.get(i).toString() + "\n");
				} 
			}
			
			if (tama�oC == 1) {
				System.out.println("Casa en Venta\n");
				System.out.println(lista_casas.get(0).toString() + "\n");
			} else if (tama�oC != 0){
				System.out.println("Casas en Venta de mayor a menor precio:\n");
				for (int i = 0; i < tama�oC; i++) {
					System.out.println(lista_casas.get(i).toString() + "\n");
				}
			}
		} else {
			System.out.println("No hay ning�n inmueble en venta entre esos valores");
		}
		lista_pisos.clear();
		lista_casas.clear();

		System.out.println("\nFin del programa para listar los pisos por precio");
	}

	/*M�todo que se encarga de mostrar los inmuebles entre un rango de precios. Para tener un rango de precios pide  
	el precio minimo y el precio maximo. Adem�s se encarga de ordenar los inmuebles de mayor a menor precio que esten 
	en ese rango de precios. Para ordenarlos llama al m�todo ordenarPorPrecio donde le pasa dos argumentos: 
	un argumento es un ArrayList de inmuebles en alquiler que estan en el rango de precios y el otro argumento 
	es un ArrayList de los inmuebles en venta que tambi�n estan en ese rango de precios*/
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

	public static void ordenarPorMetrosCuadrados(ArrayList<Inmueble> lista_inmueblesalquiler,
			ArrayList<Inmueble> lista_inmueblesventa) {
		int tama�o, tama�oP, tama�oC;

		tama�o = lista_inmueblesalquiler.size();

		if (tama�o != 0) {
			for (Inmueble Inmuebles : lista_inmueblesalquiler) {
				if (Inmuebles.isAlquilado() == true) {
					if (Inmuebles instanceof Piso) {
						lista_pisos.add((Piso) Inmuebles);
					} else {
						lista_casas.add((Casa) Inmuebles);
					}
				}
			}

			Piso auxAP = new Piso();
			Casa auxAC = new Casa();
			tama�oP = lista_pisos.size();
			tama�oC = lista_casas.size();

			if (tama�oP != 0) {
				auxAP = lista_pisos.get(0);
				for (int i = 0; i < tama�oP - 1; i++) {
					for (int j = 0; j < tama�oP - 1; j++) {
						if (lista_pisos.get(j).getMetrosCuadrados() < lista_pisos.get(j + 1).getMetrosCuadrados()) {
							auxAP = lista_pisos.get(j);
							lista_pisos.set(j, lista_pisos.get(j + 1));
							lista_pisos.set(j + 1, (Piso) auxAP);
						}
					}
				}
			} else {
				System.out.println("No hay ning�n piso en alquiler entre esos valores");
			}

			if (tama�oC != 0) {
				auxAC = lista_casas.get(0);
				for (int i = 0; i < tama�oC - 1; i++) {
					for (int j = 0; j < tama�oC - 1; j++) {
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

			if (tama�o != 1) {
				System.out.println("\nInmuebles en Alquiler");
			}

			if (tama�oP == 1) {
				System.out.println("Piso en Alquiler\n");
				System.out.println(lista_pisos.get(0).toString() + "\n");
			} else if (tama�oP != 0){
				System.out.println("Pisos en Alquiler de m�s a menos metros cuadrados:\n");
				for (int i = 0; i < tama�oP; i++) {
					System.out.println(lista_pisos.get(i).toString() + "\n");
				} 
			}
			
			if (tama�oC == 1) {
				System.out.println("Casa en Alquiler\n");
				System.out.println(lista_casas.get(0).toString() + "\n");
			} else if (tama�oC != 0){
				System.out.println("Casas en Alquiler de m�s a menos metros cuadrados:\n");
				for (int i = 0; i < tama�oC; i++) {
					System.out.println(lista_casas.get(i).toString() + "\n");
				}
			}

		} else {
			System.out.println("No hay ning�n inmueble en alquiler entre esos valores");
		}

		lista_pisos.clear();
		lista_casas.clear();

		tama�o = lista_inmueblesventa.size();

		if (tama�o != 0) {
			for (Inmueble Inmuebles : lista_inmueblesventa) {
				if (Inmuebles.isAlquilado() == false) {
					if (Inmuebles instanceof Piso) {
						lista_pisos.add((Piso) Inmuebles);
					} else {
						lista_casas.add((Casa) Inmuebles);
					}
				}
			}

			Piso auxVP = new Piso();
			Casa auxVC = new Casa();
			tama�oP = lista_pisos.size();
			tama�oC = lista_casas.size();

			if (tama�oP != 0) {
				auxVP = lista_pisos.get(0);
				for (int i = 0; i < tama�oP - 1; i++) {
					for (int j = 0; j < tama�oP - 1; j++) {
						if (lista_pisos.get(j).getMetrosCuadrados() < lista_pisos.get(j + 1).getMetrosCuadrados()) {
							auxVP = lista_pisos.get(j);
							lista_pisos.set(j, lista_pisos.get(j + 1));
							lista_pisos.set(j + 1, (Piso) auxVP);
						}
					}
				}
			} else {
				System.out.println("No hay ning�n piso en venta entre esos valores");
			}

			if (tama�oC != 0) {
				auxVC = lista_casas.get(0);
				for (int i = 0; i < tama�oC - 1; i++) {
					for (int j = 0; j < tama�oC - 1; j++) {
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

			if (tama�o != 1) {
				System.out.println("\nInmuebles en Venta");
			}

			if (tama�oP == 1) {
				System.out.println("Piso en Venta\n");
				System.out.println(lista_pisos.get(0).toString() + "\n");
			} else if (tama�oP != 0){
				System.out.println("Pisos en Venta de m�s a menos metros cuadrados:\n");
				for (int i = 0; i < tama�oP; i++) {
					System.out.println(lista_pisos.get(i).toString() + "\n");
				} 
			}
			
			if (tama�oC == 1) {
				System.out.println("Casa en Venta\n");
				System.out.println(lista_casas.get(0).toString() + "\n");
			} else if (tama�oC != 0){
				System.out.println("Casas en Venta de m�s a menos metros cuadrados:\n");
				for (int i = 0; i < tama�oC; i++) {
					System.out.println(lista_casas.get(i).toString() + "\n");
				}
			}
		} else {
			System.out.println("No hay ning�n inmueble en venta entre esos valores");
		}
		lista_pisos.clear();
		lista_casas.clear();

		System.out.println("\nFin del programa para listar los pisos por metros cuadrados");
	}

	/*M�todo que se encarga de mostrar los inmuebles entre un rango de metros cuadrados. Tambi�n se encarga de ordenar 
	los inmuebles seg�n ese rango. Para ordenarlos llama al m�todo ordenarPorMetrosCuadrados donde le pasa dos argumentos: 
	un argumento es un ArrayList de inmuebles en alquiler que estan en el rango de metros cuadrados y el otro argumento 
	es un ArrayList de los inmuebles en venta que tambi�n estan en ese rango*/
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
	
	public static void eliminarInmuebles() {
		String opcAoV = "g";
		String opcInm = "g";
		int id;

		do {
			System.out.println("�Quieres alquilar o vender un inmueble?\n  1. Inmueble en Alquiler\n  2. Inmueble en Venta\n  0. No alquilar/vender ninguno");
			System.out.println("\nElige una opci�n: ");
			opcAoV = scan.next();

			lista_inmueblesalquiler.clear();
			lista_inmueblesventa.clear();
			
			for (int i = 0; i < inmuebles.size(); i++) {
				if (inmuebles.get(i).isAlquilado() == true) {
					lista_inmueblesalquiler.add(inmuebles.get(i));
				} else {
					lista_inmueblesventa.add(inmuebles.get(i));
				}
			}

			switch (opcAoV) {
			case "1":
				int validoA = 0;

				do {
					if (lista_inmueblesalquiler.size() != 0) {
						do {
							lista_inmueblesalquiler.clear();
							
							for (int i = 0; i < inmuebles.size(); i++) {
								if (inmuebles.get(i).isAlquilado() == true) {
									lista_inmueblesalquiler.add(inmuebles.get(i));
								} 
							}
							
							System.out.println("�Que tipo de inmueble quieres alquilar?");
							System.out.println("  1. Piso\n  2. Casa\n  0. Ninguno(Salir)");
							System.out.println("\nElige una opci�n: ");
							opcInm = scan.next();

							lista_pisos.clear();
							lista_casas.clear();

							for (Inmueble Inmuebles : lista_inmueblesalquiler) {
								if (Inmuebles.isAlquilado() == true) {
									if (Inmuebles instanceof Piso) {
										lista_pisos.add((Piso) Inmuebles);
									} else {
										lista_casas.add((Casa) Inmuebles);
									}
								}
							}

							validoA = 0;
							switch (opcInm) {
							case "1":
								do {
									if (lista_pisos.size() != 0){
										listarPisosAlquiler();

										System.out.println("�Que piso quieres alquilar? (Escribe su ID)");
										System.out.println("Nota: Digite -1 para no alquilar un piso");
										id = scan.nextInt();

										if (id != -1) {
											for (int i = 0; i < inmuebles.size(); i++) {
												if (inmuebles.get(i).getId() == id) {
													for (int j = 0; j < lista_inmueblesalquiler.size(); j++) {
														if (lista_inmueblesalquiler.get(j).getId() == id) {
															for (int k = 0; k < lista_pisos.size(); k++) {
																if (lista_pisos.get(k).getId() == id) {
																	inmuebles.remove(i);
																	validoA = 1;

																	System.out.println("El piso ha sido alquilado\n");
																}
															}
														}
													}
												}
											}

											if (validoA == 0) {
												System.out.println("Este ID no se corresponde con ning�n piso\nEscribelo de nuevo\n");
											}
										} else {
											validoA = 1;
										}
									} else {
										System.out.println("No queda ning�n piso para alquilar");
										validoA = 1;
									}
								} while(validoA == 0);
								break;
							case "2":
								do {
									if (lista_casas.size() != 0){
										listarCasasAlquiler();

										System.out.println("�Que casa quieres alquilar? (Escribe su ID)");
										System.out.println("Nota: Digite -1 para no alquilar una casa");
										id = scan.nextInt();

										if (id != -1) {
											for (int i = 0; i < inmuebles.size(); i++) {
												if (inmuebles.get(i).getId() == id) {
													for (int j = 0; j < lista_inmueblesalquiler.size(); j++) {
														if (lista_inmueblesalquiler.get(j).getId() == id) {
															for (int k = 0; k < lista_casas.size(); k++) {
																if (lista_casas.get(k).getId() == id) {
																	inmuebles.remove(i);
																	validoA = 1;

																	System.out.println("La casa ha sido alquilada\n");
																}
															}
														}
													}
												}
											}

											if (validoA == 0) {
												System.out.println("Este ID no se corresponde con ninguna casa\nEscribelo de nuevo\n");
											}
										} else {
											validoA = 1;
										}
									} else {
										System.out.println("No queda ninguna casa para alquilar");
										validoA = 1;
									}
								} while(validoA == 0);
								break;
							case "0":
								opcInm = "0";
								validoA = 1;
								break;
							default:
								System.out.println("ERROR! Ese dato no es v�lido");
								break;
							}
						} while (!opcInm.contentEquals("0"));

					} else {
						System.out.println("No queda ning�n inmueble para alquilar\n");
						validoA = 1;
					}
				} while (validoA == 0);
				break;
			case "2":
				int validoV = 0;

				do {
					if (lista_inmueblesventa.size() != 0) {
						opcInm = "g";
						do {
							lista_inmueblesventa.clear();
							
							for (int i = 0; i < inmuebles.size(); i++) {
								if (inmuebles.get(i).isAlquilado() == false) {
									lista_inmueblesventa.add(inmuebles.get(i));
								} 
							}
							
							System.out.println("�Que tipo de inmueble quieres vender?");
							System.out.println("  1. Piso\n  2. Casa\n  0. Ninguno(Salir)");
							System.out.println("\nElige una opci�n: ");
							opcInm = scan.next();

							lista_pisos.clear();
							lista_casas.clear();

							for (Inmueble Inmuebles : lista_inmueblesventa) {
								if (Inmuebles.isAlquilado() == false) {
									if (Inmuebles instanceof Piso) {
										lista_pisos.add((Piso) Inmuebles);
									} else {
										lista_casas.add((Casa) Inmuebles);
									}
								}
							}

							validoV = 0;
							switch (opcInm) {
							case "1":
								do {
									if (lista_pisos.size() != 0){
										listarPisosVenta();

										System.out.println("�Que piso quieres vender? (Escribe su ID)");
										System.out.println("Nota: Digite -1 para no vender un piso");
										id = scan.nextInt();

										if (id != -1) {
											for (int i = 0; i < inmuebles.size(); i++) {
												if (inmuebles.get(i).getId() == id) {
													for (int j = 0; j < lista_inmueblesventa.size(); j++) {
														if (lista_inmueblesventa.get(j).getId() == id) {
															for (int k = 0; k < lista_pisos.size(); k++) {
																if (lista_pisos.get(k).getId() == id) {
																	inmuebles.remove(i);
																	validoV = 1;

																	System.out.println("El piso ha sido alquilado\n");
																}
															}
														}
													}
												}
											}

											if (validoV == 0) {
												System.out.println("Este ID no se corresponde con ning�n piso\nEscribelo de nuevo\n");
											}
										} else {
											validoV = 1;
										}
									} else {
										System.out.println("No queda ning�n piso para alquilar");
										validoV = 1;
									}
								} while(validoV == 0);
								
								break;
							case "2":
								do {
									if (lista_casas.size() != 0){
										listarCasasVenta();

										System.out.println("�Que casa quieres vender? (Escribe su ID)");
										System.out.println("Nota: Digite -1 para no vender una casa");
										id = scan.nextInt();

										if (id != -1) {
											for (int i = 0; i < inmuebles.size(); i++) {
												if (inmuebles.get(i).getId() == id) {
													for (int j = 0; j < lista_inmueblesventa.size(); j++) {
														if (lista_inmueblesventa.get(j).getId() == id) {
															for (int k = 0; k < lista_casas.size(); k++) {
																if (lista_casas.get(k).getId() == id) {
																	inmuebles.remove(i);
																	validoV = 1;

																	System.out.println("La casa ha sido alquilada\n");
																}
															}
														}
													}
												}
											}

											if (validoV == 0) {
												System.out.println("Este ID no se corresponde con ninguna casa\nEscribelo de nuevo\n");
											}
										} else {
											validoV = 1;
										}
									} else {
										System.out.println("No queda ninguna casa para alquilar");
										validoV = 1;
									}
								} while(validoV == 0);
								
								break;
							case "0":
								opcInm = "0";
								validoV = 1;
								break;
							default:
								System.out.println("ERROR! Ese dato no es v�lido");
								break;
							}
						} while (!opcInm.contentEquals("0"));

					} else {
						System.out.println("No queda ning�n inmueble para vender\n");
						validoV = 1;
					}
				} while (validoV == 0);
				break;
			case "0":
				System.out.println("\nFin del programa para alquilar/vender pisos");
				break;
			default:
				System.out.println("ERROR! Ese dato no es v�lido");
				break;
			}
		} while (!opcAoV.contentEquals("0"));

		lista_pisos.clear();
		lista_casas.clear();
		lista_inmueblesalquiler.clear();
		lista_inmueblesventa.clear();
	}

	//Este m�todo es el men� principal. Se encarga de mostrar al usuario las opciones para gestionar los inmuebles
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		String opc = "g";

		do {
			System.out.println("\nBienvenido al men� virtual " + Agencia.getNombre() + " \n");

			System.out.println("Este men� virtual cuenta con las siguientes opciones: ");

			System.out.println("  0. Salir.");
			System.out.println("  1. A�adir un nuevo inmueble a la venta o en alquiler a la lista.");
			System.out.println("  2. Modificar un inmueble existente en la lista.");
			System.out.println("  3. Listar los inmuebles disponibles.");
			System.out.println("  4. Listar los inmuebles en un rango de precios.");
			System.out.println("  5. Listar los inmuebles en un rango de metros cuadrados.");
			System.out.println("  6. Eliminar un inmueble de la lista tras este ser alquilado o vendido.");

			System.out.println("\nIntroduzca una opci�n para el men�: ");
			opc = scan.next();
			switch (opc) {
			case "1": 	a�adirInmuebles(); break;
			case "2":	modificarInmuebles(); break;
			case "3":	mostrarInmuebles(); break;
			case "4":	listarPorPrecio(); break;
			case "5":	listarPorMetrosCuadrados(); break;
			case "6":	eliminarInmuebles(); break;
			case "0":	System.out.println("\n\nFin del programa"); break;
			default:	System.out.println("ERROR! Ese dato no es v�lido"); break;
			}
		} while (!opc.contentEquals("0"));
		scan.close();
	}

	/*En este m�todo se crea un objeto con un nombre de la clase Agencia, tambi�n se crea diferentes objetos de las clases
	Piso y Casa con unos valores impuestos y estos objetos se a�aden todos en un ArrayList llamado inmuebles.
	Por �ltimo se llama al men� principal*/
	public static void main(String[] args) {
		Agencia agenciaD11 = new Agencia("La inmobiliaria del Distrito 11");

		Piso piso1 = new Piso(605, 130, "Calle", "das Meidades", 11, 36600, 3, 2, 'B', true, true);
		Piso piso2 = new Piso(802, 160, "Avenida", "Xogo da Ola", 43, 36560, 4, 1, 'A', false, true);
		Piso piso3 = new Piso(935, 155, "Plaza", "O Lugar de Breog�n", 27, 36760, 1, 4, 'C', false, true);
		Casa Casa1 = new Casa(634, 143, "Camino", "Naiterra Mi�a", 55, 36500, 8, true, false, true);
		Casa Casa2 = new Casa(799, 139, "Carretera", "Plaza Espa�a", 18, 36555, 6, false, false, true);

		Piso piso4 = new Piso(300455, 100, "Paseo", "Mercantil de Zafan", 39, 36660, 1, 6, 'G', true, false);
		Piso piso5 = new Piso(350000, 127, "Avenida", "Barbeitos", 6, 36450, 4, 4, 'D', false, false);
		Casa Casa3 = new Casa(405000, 172, "Plaza", "da Programaci�n", 87, 36800, 7, true, false, false);
		Casa Casa4 = new Casa(535000, 232, "Calle", "Cleanance Azul", 34, 36120, 9, false, true, false);
		Casa Casa5 = new Casa(635000, 350, "Carretera", "do Distrito 11", 21, 36240, 11, false, false, false);

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
} //2.172