import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {
	private static ArrayList<PisoAlquiler> pisosalquiler = new ArrayList<PisoAlquiler>();
	private static ArrayList<PisoVenta> pisosventa = new ArrayList<PisoVenta>();
	private static String nombre;
	
	public Agencia(String nombre) {
		this.nombre = nombre;
	}
	
	public Agencia(String nombre, ArrayList<PisoAlquiler> pisosalquiler, ArrayList<PisoVenta> pisosventa) {
		this.nombre = nombre;
		this.pisosalquiler = pisosalquiler;
		this.pisosventa = pisosventa;
	}

	public ArrayList<PisoAlquiler> getPisosalquiler() {
		return pisosalquiler;
	}

	public void setPisosalquiler(ArrayList<PisoAlquiler> pisosalquiler) {
		this.pisosalquiler = pisosalquiler;
	}

	public ArrayList<PisoVenta> getPisosventa() {
		return pisosventa;
	}

	public void setPisosventa(ArrayList<PisoVenta> pisosventa) {
		this.pisosventa = pisosventa;
	}

	public static String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void añadirPisos() {
		Scanner scan = new Scanner(System.in);

		String opcPiso = "g";
		int numPisos = 0;

		do {
			System.out.println("\n¿Quieres añadir un piso de alquiler o un piso de venta?\n1.Piso de Alquiler\n2.Piso de Venta\n0.No añadir ningún piso");
			System.out.println("\nElige una opción: ");
			opcPiso = scan.next();
			switch (opcPiso) {

			case "1":
				System.out.print("Introduce el numero de pisos de alquiler a introducir: ");
				numPisos = scan.nextInt();
				
				 while (numPisos < 0) {
					 System.out.println("\nEse no es un valor válido");
					 System.out.print("Introduce de nuevo el numero de pisos de alquiler a introducir: ");
					 numPisos = scan.nextInt();
				 }

				for (int i = 0; i < numPisos; i++) {
					PisoAlquiler p = new PisoAlquiler();
					int auxA;
					
					if (pisosalquiler.size() != 0) {
						auxA = pisosalquiler.size() - 1;
						p.setId(pisosalquiler.get(auxA).getId() + 1);	
					} else {
						p.setId(1);
					}

					System.out.println("\nPara el Piso en Alquiler " + p.getId() + "(ID)");
					System.out.print("Introduce el precio del piso: ");
					p.setPrecio(scan.nextFloat());
					System.out.print("Introduce los metros cuadrados del piso: ");
					p.setMetrosCuadrados(scan.nextFloat());
					System.out.print("Introduce la dirección del piso: ");
					scan.nextLine();
					p.setDireccion(scan.nextLine());
						
					pisosalquiler.add(p);
				}
				break;

			case "2":
				System.out.print("Introduce el numero de pisos de alquiler a introducir: ");
				numPisos = scan.nextInt();
				
				 while (numPisos < 0) {
					 System.out.println("\nEse no es un valor válido");
					 System.out.print("Introduce de nuevo el numero de pisos de alquiler a introducir: ");
					 numPisos = scan.nextInt();
				 }

				for (int i = 0; i < numPisos; i++) {
					PisoVenta p = new PisoVenta();
					int auxV;
					
					if (pisosventa.size() != 0) {
						auxV = pisosventa.size() - 1;
						p.setId(pisosventa.get(auxV).getId() + 1);	
					} else {
						p.setId(1);
					}

					System.out.println("\nPara el Piso en Venta " + p.getId() + "(ID)");
					System.out.print("Introduce el precio del piso: ");
					p.setPrecio(scan.nextFloat());
					System.out.print("Introduce los metros cuadrados del piso: ");
					p.setMetrosCuadrados(scan.nextFloat());
					System.out.print("Introduce la dirección del piso: ");
					scan.nextLine();
					p.setDireccion(scan.nextLine());
					
					pisosventa.add(p);
				}

				break;
			case "0":
				System.out.println("\nFin del programa para añadir pisos");
				break;

			default:
				System.out.println("ERROR! Ese dato no es válido");
				break;
			}
		} while (!opcPiso.contentEquals("0"));
	}

	public static void modificarPisos() {
		Scanner scan = new Scanner(System.in);
		String opcPiso = "g";

		do {
			System.out.println("¿Quieres modificar un piso de alquiler o un piso de venta?\n  1. Piso de Alquiler\n  2. Piso de Venta\n  0. No modificar ninguno");
			System.out.println("\nElige una opción: ");
			opcPiso = scan.next();
			switch (opcPiso) {

			case "1":
				String opcModifcar = "g";
				int id;

				do {
					int validoA = 0;
					do {
						listarPisosAlquiler();

						System.out.println("¿Que piso alquilado quieres modificar? (Escribe su ID)");
						System.out.println("Nota: Digite -1 para no modificar un piso");
						id = scan.nextInt();

						if (id != -1) {
							for (int i = 0; i < pisosalquiler.size(); i++) {
								if (pisosalquiler.get(i).getId() == id) {
									validoA = 1;
								}
							}
							if (validoA == 0)
								System.out.println("Este ID no se corresponde con ningún piso.\nEscribelo de nuevo");
						} else {
							validoA = 2;
							opcModifcar = "0";
						}

					} while (validoA == 0);

					if (validoA != 2) {
						System.out.println("¿Que es lo que quieres modificar del piso?");
						System.out.println("  1. El precio\n  2. Los metros cuadrados\n  3. La dirección\n  0. Nada(Salir)");
						System.out.println("\nElige una opción: ");
						opcModifcar = scan.next();

						switch (opcModifcar) {

						case "1":
							System.out.println("El precio actual del piso es: " + pisosalquiler.get(id-1).getPrecio());
							System.out.println("¿A que precio quieres cambiarlo?");
							pisosalquiler.get(id-1).setPrecio(scan.nextFloat());
							break;
						case "2":
							System.out.println("Los metros cuadrados del piso es: " + pisosalquiler.get(id-1).getMetrosCuadrados());
							System.out.println("¿A cuantos metros cuadrados quieres cambiarlo?");
							pisosalquiler.get(id-1).setMetrosCuadrados(scan.nextFloat());
							break;
						case "3":
							System.out.println("La dirección actual del piso es: " + pisosalquiler.get(id-1).getDireccion());
							System.out.println("¿A que dirección quieres cambiarlo?");
							scan.nextLine();
							pisosalquiler.get(id-1).setDireccion(scan.nextLine());
							break;
						case "0":
							System.out.println("\n\nFin del programa!!");
							break;
						default:
							System.out.println("ERROR! Ese dato no es válido");
							break;
						}
					}
				} while (!opcModifcar.contentEquals("0"));
				break;

			case "2":
				opcModifcar = "g";
				do {
					int validoV = 0;
					do {
						listarPisosVenta();

						System.out.println("¿Que piso quieres modificar? (Escribe su ID)");
						System.out.println("Nota: Digite -1 para no vender un piso\n");
						id = scan.nextInt();

						if (id != -1) {
							for (int i = 0; i < pisosventa.size(); i++) {
								if (pisosventa.get(i).getId() == id) {
									validoV = 1;
								}
							}

							if (validoV == 0)
								System.out.println("Este ID no se corresponde con ningún piso.\nEscribelo de nuevo");
						} else {
							validoV = 2;
							opcModifcar = "0";
						}

					} while (validoV == 0);

					if (validoV != 2) {
						System.out.println("¿Que es lo que quieres modificar del piso?");
						System.out.println("  1. El precio\n  2. Los metros cuadrados\n  3. La dirección\n  0. Nada(Salir)");
						System.out.println("\nElige una opción: ");
						opcModifcar = scan.next();

						switch (opcModifcar) {

						case "1":
							System.out.println("El precio actual del piso es: " + pisosventa.get(id-1).getPrecio());
							System.out.println("¿A que precio quieres cambiarlo?");
							pisosventa.get(id-1).setPrecio(scan.nextFloat());
							break;
						case "2":
							System.out.println("Los metros cuadrados del piso es: " + pisosventa.get(id-1).getMetrosCuadrados());
							System.out.println("¿A cuantos metros cuadrados quieres cambiarlo?");
							pisosventa.get(id-1).setMetrosCuadrados(scan.nextFloat());
							break;
						case "3":
							System.out.println("La dirección actual del piso es: " + pisosventa.get(id-1).getDireccion());
							System.out.println("¿A que dirección quieres cambiarlo?");
							scan.nextLine();
							pisosventa.get(id-1).setDireccion(scan.nextLine());
							break;
						case "0":
							System.out.println("\n\nFin del programa!!");
							break;
						default:
							System.out.println("ERROR! Ese dato no es válido");
							break;
						}
					}

				} while (!opcModifcar.contentEquals("0"));
				break;

			case "0":
				System.out.println("\nFin del programa para modificar pisos");
				break;
			default:
				System.out.println("ERROR! Ese dato no es válido");
				break;
			}
		} while (!opcPiso.contentEquals("0"));
	}

	public static void listarPisosAlquiler() {
		System.out.println("Pisos de Alquiler");

		for (PisoAlquiler pisoAlquiler : pisosalquiler) {
			System.out.println(pisoAlquiler.toString() + "\n");
		}
	}

	public static void listarPisosVenta() {
		System.out.println("Pisos en Venta");

		for (PisoVenta pisoVenta : pisosventa) {
			System.out.println(pisoVenta.toString() + "\n");
		}
	}

	public static void mostrarPisos() {
		Scanner scan = new Scanner(System.in);
		String opcPiso = "g";

		do {
			System.out.println("¿Como quieres visualizar los pisos?\n  1. Visualizar los Pisos de Alquiler\n  2. Visualizar los Pisos en Venta\n  3. Visualizar todos los pisos\n  0. No visualizar ningún piso");
			System.out.println("\nElige una opción: ");
			opcPiso = scan.next();
			switch (opcPiso) {

			case "1":
				if (pisosalquiler.size() != 0) {
					listarPisosAlquiler();
				} else {
					System.out.println("No hay ningún piso en alquiler\n");
				}

				break;
			case "2":
				if (pisosventa.size() != 0) {
					listarPisosVenta();
				} else {
					System.out.println("No hay ningún piso en venta\n");
				}

				break;
			case "3":
				if (pisosalquiler.size() != 0) {
					listarPisosAlquiler();
				} else {
					System.out.println("No hay ningún piso en alquiler\n");
				}

				if (pisosventa.size() != 0) {
					listarPisosVenta();
				} else {
					System.out.println("No hay ningún piso en venta\n");
				}

				break;
			case "0":
				System.out.println("\nFin del programa para listar los pisos");
				break;
			default:
				System.out.println("ERROR! Ese dato no es válido");
				break;
			}
		} while (!opcPiso.contentEquals("0"));
	}

	public static ArrayList<PisoAlquiler> lista_pisosalquiler = new ArrayList<PisoAlquiler>();
	public static ArrayList<PisoVenta> lista_pisosventa = new ArrayList<PisoVenta>();

	public static void ordenarPorPrecio(ArrayList<PisoAlquiler> lista_pisosalquiler,
			ArrayList<PisoVenta> lista_pisosventa) {
		int tamaño;
		PisoAlquiler auxA = new PisoAlquiler();

		tamaño = lista_pisosalquiler.size();

		if (tamaño != 0) {
			auxA = lista_pisosalquiler.get(0);

			for (int i = 0; i < tamaño - 1; i++) {
				for (int j = 0; j < tamaño - 1; j++) {
					if (lista_pisosalquiler.get(j).getPrecio() < lista_pisosalquiler.get(j + 1).getPrecio()) {
						auxA = lista_pisosalquiler.get(j);
						lista_pisosalquiler.set(j, lista_pisosalquiler.get(j + 1));
						lista_pisosalquiler.set(j + 1, auxA);
					}
				}
			}

			System.out.println("\nPisos de Alquiler");

			if (tamaño != 1) {
				System.out.println("De mayor a menor precio:\n");
			}

			for (int i = 0; i < tamaño; i++) {
				System.out.println(lista_pisosalquiler.get(i).toString() + "\n");
			}
		} else {
			System.out.println("No hay ningún piso en alquiler entre esos valores");
		}

		PisoVenta auxV = new PisoVenta();

		tamaño = lista_pisosventa.size();

		if (tamaño != 0) {

			auxV = lista_pisosventa.get(0);

			for (int i = 0; i < tamaño - 1; i++) {
				for (int j = 0; j < tamaño - 1; j++) {
					if (lista_pisosventa.get(j).getPrecio() < lista_pisosventa.get(j + 1).getPrecio()) {
						auxV = lista_pisosventa.get(j);
						lista_pisosventa.set(j, lista_pisosventa.get(j + 1));
						lista_pisosventa.set(j + 1, auxV);
					}
				}
			}

			System.out.println("\nPisos de Venta");

			if (tamaño != 1) {
				System.out.println("De mayor a menor precio:\n");
			}

			for (int i = 0; i < tamaño; i++) {
				System.out.println(lista_pisosventa.get(i).toString() + "\n");
			}
		} else {
			System.out.println("No hay ningún piso en venta entre esos valores");
		}

		System.out.println("\nFin del programa para listar los pisos por precio");
	}

	public static void listarPorPrecio() {
		Scanner scan = new Scanner(System.in);
		int precioMin, precioMax;

		System.out.println("Introduzca el rango que quieres buscar los pisos");
		System.out.println("Introduzca el precio minimo: ");
		precioMin = scan.nextInt();
		System.out.println("Introduzca el precio maximo: ");
		precioMax = scan.nextInt();
		
		while(precioMin > precioMax) {
			System.out.println("El precio minimo no puede ser mayor que el precio maximo y el precio maximo no puede ser menor que el precio minimo");
			System.out.println("Introduzca el rango que quieres buscar los pisos");
			System.out.println("Introduzca el precio minimo: ");
			precioMin = scan.nextInt();
			System.out.println("Introduzca el precio maximo: ");
			precioMax = scan.nextInt();
		}
		
		for (int i = 0; i < pisosalquiler.size(); i++) {
			if (pisosalquiler.get(i).getPrecio() > precioMin && pisosalquiler.get(i).getPrecio() < precioMax) {
				lista_pisosalquiler.add(pisosalquiler.get(i));
			}
		}

		for (int i = 0; i < pisosventa.size(); i++) {
			if (pisosventa.get(i).getPrecio() > precioMin && pisosventa.get(i).getPrecio() < precioMax) {
				lista_pisosventa.add(pisosventa.get(i));
			}
		}

		ordenarPorPrecio(lista_pisosalquiler, lista_pisosventa);
		lista_pisosalquiler.clear();
		lista_pisosventa.clear();
	}

	public static void listarPorMetrosCuadrados() {
		Scanner scan = new Scanner(System.in);
		int min, max;

		System.out.println("Introduzca el rango que quieres buscar los pisos");
		System.out.println("Introduzca el minimo de metros cuadrados: ");
		min = scan.nextInt();
		System.out.println("Introduzca el maximo de metros cuadrados: ");
		max = scan.nextInt();
		
		while(min > max) {
			System.out.println("El minimo de metros cuadrados minimo no puede ser mayor que el precio maximo y el precio maximo no puede ser menor que el precio minimo");
			System.out.println("Introduzca el rango que quieres buscar los pisos");
			System.out.println("Introduzca el precio minimo: ");
			min = scan.nextInt();
			System.out.println("Introduzca el precio maximo: ");
			max = scan.nextInt();
		}

		for (int i = 0; i < pisosalquiler.size(); i++) {
			if (pisosalquiler.get(i).getMetrosCuadrados() > min && pisosalquiler.get(i).getMetrosCuadrados() < max) {
				lista_pisosalquiler.add(pisosalquiler.get(i));
			}
		}

		for (int i = 0; i < pisosventa.size(); i++) {
			if (pisosventa.get(i).getMetrosCuadrados() > min && pisosventa.get(i).getMetrosCuadrados() < max) {
				lista_pisosventa.add(pisosventa.get(i));
			}
		}

		ordenarPorMetrosCuadrado(lista_pisosalquiler, lista_pisosventa);
		lista_pisosalquiler.clear();
		lista_pisosventa.clear();
	}

	public static void ordenarPorMetrosCuadrado(ArrayList<PisoAlquiler> lista_pisosalquiler,
			ArrayList<PisoVenta> lista_pisosventa) {
		int tamaño;
		PisoAlquiler auxA = new PisoAlquiler();

		tamaño = lista_pisosalquiler.size();

		if (tamaño != 0) {
			auxA = lista_pisosalquiler.get(0);

			for (int i = 0; i < tamaño - 1; i++) {
				for (int j = 0; j < tamaño - 1; j++) {
					if (lista_pisosalquiler.get(j).getMetrosCuadrados() < lista_pisosalquiler.get(j + 1).getMetrosCuadrados()) {
						auxA = lista_pisosalquiler.get(j);
						lista_pisosalquiler.set(j, lista_pisosalquiler.get(j + 1));
						lista_pisosalquiler.set(j + 1, auxA);
					}
				}
			}

			System.out.println("\nPisos de Alquiler");

			if (tamaño != 1) {
				System.out.println("De más a menos metros cuadrados:\n");
			}

			for (int i = 0; i < tamaño; i++) {
				System.out.println(lista_pisosalquiler.get(i).toString() + "\n");
			}
		} else {
			System.out.println("No hay ningún piso en alquiler entre esos valores");
		}

		PisoVenta auxV = new PisoVenta();

		tamaño = lista_pisosventa.size();

		if (tamaño != 0) {

			auxV = lista_pisosventa.get(0);

			for (int i = 0; i < tamaño - 1; i++) {
				for (int j = 0; j < tamaño - 1; j++) {
					if (lista_pisosventa.get(j).getMetrosCuadrados() < lista_pisosventa.get(j + 1).getMetrosCuadrados()) {
						auxV = lista_pisosventa.get(j);
						lista_pisosventa.set(j, lista_pisosventa.get(j + 1));
						lista_pisosventa.set(j + 1, auxV);
					}
				}
			}

			System.out.println("\nPisos de Venta");

			if (tamaño != 1) {
				System.out.println("De más a menos metros cuadrados:\n");
			}

			for (int i = 0; i < tamaño; i++) {
				System.out.println(lista_pisosventa.get(i).toString() + "\n");
			}
		} else {
			System.out.println("No hay ningún piso en venta entre esos valores");
		}

		System.out.println("\nFin del programa para listar los pisos por metros cuadrados");
	}

	public static void eliminarPisos() {
		Scanner scan = new Scanner(System.in);
		String opcPiso = "g";
		int id;

		do {
			System.out.println("¿Quieres alquilar o vender un piso?\n1.Piso de Alquiler\n2.Piso de Venta\n0.No alquilar/vender ninguno");
			System.out.println("\nElige una opción: ");
			opcPiso = scan.next();
			switch (opcPiso) {

			case "1":
				int validoA = 0;

				do {
					if (pisosalquiler.size() != 0) {
						listarPisosAlquiler();

						System.out.println("¿Que piso quieres alquilar? (Escribe su ID)");
						System.out.println("Nota: Digite -1 para no alquilar un piso");
						id = scan.nextInt();

						if (id != -1) {
							for (int i = 0; i < pisosalquiler.size(); i++) {
								if (pisosalquiler.get(i).getId() == id) {
									//pisosalquiler.remove(pisosalquiler.get(i));
									pisosalquiler.remove(i);
									validoA = 1;

									System.out.println("El piso ha sido alquilado\n");
								}
							}

							if (validoA == 0)
								System.out.println("Este ID no se corresponde con ningún piso\nEscribelo de nuevo\n");
						} else {
							validoA = 1;
						}
					} else {
						System.out.println("No queda ningún piso para alquilar\n");
						validoA = 1;
					}
				} while (validoA == 0);

				break;
			case "2":
				int validoV = 0;

				do {
					if (pisosventa.size() != 0) {
						listarPisosVenta();

						System.out.println("¿Que piso quieres vender? (Escribe su ID)");
						System.out.println("Nota: Digite -1 para no vender un piso\n");
						id = scan.nextInt();

						if (id != -1) {
							for (int i = 0; i < pisosventa.size(); i++) {
								if (pisosventa.get(i).getId() == id) {
									pisosventa.remove(i);
									//pisosventa.remove(pisosventa.get(i));
									validoV = 1;

									System.out.println("El piso ha sido vendido\n");
								}
							}

							if (validoV == 0)
								System.out.println("Este ID no se corresponde con ningún piso\nEscribelo de nuevo\n");
						} else {
							validoV = 1;
						}
					} else {
						System.out.println("No queda ningún piso para vender\n");
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
		} while (!opcPiso.contentEquals("0"));
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		String opc = "g";
		do {
			System.out.println("\nBienvenido al menú virtual "+ getNombre() +" \n");

			System.out.println("Este menú virtual cuenta con las siguientes opciones: ");

			System.out.println("  0. Salir.");
			System.out.println("  1. Añadir un nuevo piso a la venta o en alquiler a la lista.");
			System.out.println("  2. Modificar un piso existente en la lista.");
			System.out.println("  3. Listar los pisos disponibles.");
			System.out.println("  4. Listar los pisos de un rango de precios.");
			System.out.println("  5. Listar los pisos de un rango de metros cuadrados.");
			System.out.println("  6. Eliminar un piso de la lista tras este ser alquilado o vendido.");

			System.out.println("\nIntroduzca una opción para el menú: ");
			opc = scan.next();
			switch (opc) {
			case "1":	añadirPisos();	break;
			case "2":	modificarPisos();	break;
			case "3":	mostrarPisos();	break;
			case "4":	listarPorPrecio();	break;
			case "5":	listarPorMetrosCuadrados();	break;
			case "6":	eliminarPisos();	break;
			case "0":	System.out.println("\n\nVuelva Pronto!!");	break;
			default:	System.out.println("ERROR! Ese dato no es válido");	break;
			}
		} while (!opc.contentEquals("0"));
		scan.close();
	}

	public static void main(String[] args) {
		Agencia agencia1= new Agencia("La inmobiliaria del Distrito 11");
		
		PisoAlquiler pisoA1 = new PisoAlquiler(605, 130, "Rúa das Meidades", 1);
		PisoAlquiler pisoA2 = new PisoAlquiler(802, 160, "Rúa Xogo da Ola", 2);
		PisoAlquiler pisoA3 = new PisoAlquiler(935, 155, "Rúa O lugar de Breogán", 3);
		PisoAlquiler pisoA4 = new PisoAlquiler(634, 143, "Rúa Naiterra miña", 4);
		PisoAlquiler pisoA5 = new PisoAlquiler(799, 139, "Rúa Plaza España", 5);
		pisosalquiler.add(pisoA1);
		pisosalquiler.add(pisoA2);
		pisosalquiler.add(pisoA3);
		pisosalquiler.add(pisoA4);
		pisosalquiler.add(pisoA5);
		agencia1.setPisosalquiler(pisosalquiler);

		PisoVenta pisoV1 = new PisoVenta(300455, 100, "Rúa Mercantil de Zafan", 1);
		PisoVenta pisoV2 = new PisoVenta(350000, 127, "Rúa de Madrid", 2);
		PisoVenta pisoV3 = new PisoVenta(405000, 172, "Rúa de Malaga", 3);
		PisoVenta pisoV4 = new PisoVenta(535000, 232, "Rúa de Vigo", 4);
		PisoVenta pisoV5 = new PisoVenta(635000, 350, "Rúa de Ourense", 5);
		pisosventa.add(pisoV1);
		pisosventa.add(pisoV2);
		pisosventa.add(pisoV3);
		pisosventa.add(pisoV4);
		pisosventa.add(pisoV5);
		agencia1.setPisosventa(pisosventa);
		
		menu();
	}
}