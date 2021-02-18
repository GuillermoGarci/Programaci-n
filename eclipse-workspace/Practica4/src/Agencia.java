import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {	//Creación de la clase Agencia
	//Creación de un atributo privado de tipo ArrayList<PisoAlquiler>
	private static ArrayList<PisoAlquiler> pisosalquiler = new ArrayList<PisoAlquiler>();
	//Creación de un atributo privado de tipo ArrayList<PisoVenta>
	private static ArrayList<PisoVenta> pisosventa = new ArrayList<PisoVenta>();
	private static String nombre;	//Creación de un atributo privado de tipo String
	
	public Agencia(String nombre) {	//Creación de un constructor con un parametro de entrada de la clase Agencia
		this.nombre = nombre;	//Cambia el valor del atributo nombre de la clase Agencia por el parametro de entrada
	}
	
	//Creación de un constructor con tres parametros de entrada de la clase Agencia
	public Agencia(String nombre, ArrayList<PisoAlquiler> pisosalquiler, ArrayList<PisoVenta> pisosventa) {
		//Cambia los valores de los atributos de la clase Agencia por los parametros de entrada
		this.nombre = nombre;
		this.pisosalquiler = pisosalquiler;
		this.pisosventa = pisosventa;
	}

	//Creación del método get para el ArrayList de objetos tipo PisoAlquiler
	public ArrayList<PisoAlquiler> getPisosalquiler() {
		return pisosalquiler;	//Devuelve el ArrayList<PisoAlquiler>
	}

	//Creación del método set para el ArrayList de objetos tipo PisoAlquiler
	public void setPisosalquiler(ArrayList<PisoAlquiler> pisosalquiler) {
		this.pisosalquiler = pisosalquiler;	//Cambia el valor del atributo pisosalquiler por el parametro de entrada
	}

	//Creación del método get para el ArrayList de objetos tipo PisoVenta
	public ArrayList<PisoVenta> getPisosventa() {
		return pisosventa;	//Devuelve el ArrayList<PisoVenta>
	}

	//Creación del método set para el ArrayList de objetos tipo PisoVenta
	public void setPisosventa(ArrayList<PisoVenta> pisosventa) {
		this.pisosventa = pisosventa;	//Cambia el valor del atributo pisosventa por el parametro de entrada
	}

	public static String getNombre() {	//Creación del método get para el nombre
		return nombre;	//Devuelve el nombre
	}

	public void setNombre(String nombre) {	//Creación del método set para el nombre
		this.nombre = nombre;	//Cambia el valor del atributo nombre por el parametro de entrada
	}

	public static void añadirPisos() {	//Creación del procedimiento añadirPisos que sirve para añadir pisos
		Scanner scan = new Scanner(System.in);

		String opcPiso = "g";	//Inicializa la opción del menú a una al azar
		int numPisos = 0;	//Inicialia el numero de pisos a uno al azar

		do {
			//Muestra por la salida al usuario que opciones tiene el menú
			System.out.println("\n¿Quieres añadir un piso de alquiler o un piso en venta?\n  1. Piso de Alquiler\n  2. Piso en Venta\n  0. No añadir ningún piso");
			System.out.println("\nElige una opción: ");	//Indica al usuario que elija una opción
			opcPiso = scan.next(); //La variable opcPiso cambia a la tecleada por el usuario
			switch (opcPiso) {	//Se crea un switch con varias casos (se llevará la acción de un caso o otro dependiendo de la variable opcPiso) 

			case "1":	//Si la variable opcPiso tiene el valor de 1 se realizará el código desde esta línea hasta la 98
				System.out.print("Introduce el numero de pisos de alquiler a introducir: ");	//Indica al usuario que elija el número de pisos a añadir
				numPisos = scan.nextInt();	//Cambia el valor de la variable numPisos a la tecleada por el usuario
				
				 while (numPisos < 0) {	//Si el valor tecleado por el usuario es negativo entra en el bucle o continúa el bucle
					 System.out.println("\nEse no es un valor válido");	//Indica al usuario que no es un valor válido
					//Indica al usuario que elija el número de pisos a añadir otra vez
					 System.out.print("Introduce de nuevo el numero de pisos de alquiler a introducir: ");
					 numPisos = scan.nextInt();	//Cambia el valor de la variable numPisos a la tecleada por el usuario
				 }

				for (int i = 0; i < numPisos; i++) {	//Se repite el bucle hasta que i sea igual a la variable numPisos
					PisoAlquiler p = new PisoAlquiler();	//Se crea un objeto llamado p con la clase PisoAlquiler
					int auxA;	//Se crea una variable llamada auxA (la A es de Alquiler)
					
					if (pisosalquiler.size() != 0) {	//Si el ArrayList de pisos de alquiler tiene un tamaño distinto de cero entra en la condición
						auxA = pisosalquiler.size() - 1;	//La variable auxA se iguala al tamaño del ArrayList de pisos de alquiler menos uno
						//Se cambia el id por el valor del id que tiene el ultimo objeto del ArrayList mas uno
						p.setId(pisosalquiler.get(auxA).getId() + 1);	
					} else {	//Si el ArrayList de pisos de alquiler tiene un tamaño de cero entra en la condición
						p.setId(1);	//Se cambia el id a uno
					}

					System.out.println("\nPara el Piso en Alquiler " + p.getId() + "(ID)");	//Muestra que tipo de piso es y su id
					System.out.print("Introduce el precio del piso: ");	//Indica al usuario que introduzca el precio del piso
					p.setPrecio(scan.nextFloat());	//Cambia el valor de la variable precio a la tecleada por el usuario para eso se llama al set de precio
					System.out.print("Introduce los metros cuadrados del piso: ");	//Indica al usuario que introduzca los metros cuadrados del piso
					p.setMetrosCuadrados(scan.nextFloat());	//Cambia el valor de la variable metrosCuadrados a la tecleada por el usuario para eso se llama al set de metrosCuadrados
					System.out.print("Introduce la dirección del piso: ");	//Indica al usuario que introduzca la dirección del piso
					scan.nextLine();	//Crear un scan adicional
					p.setDireccion(scan.nextLine());	//Cambia el valor de la variable direccion a la tecleada por el usuario para eso se llama al set de direccion
						
					pisosalquiler.add(p);	//añade el objeto p al ArrayList pisosalquiler
				}
				break;	//Indica al programa donde termina el case "1" del switch

			case "2":	//Si la variable opcPiso tiene el valor de 2 se realizará el código desde esta línea hasta la 135
				System.out.print("Introduce el numero de pisos en venta a introducir: ");	//Indica al usuario que elija el número de pisos a añadir
				numPisos = scan.nextInt();	//Cambia el valor de la variable numPisos a la tecleada por el usuario
				
				 while (numPisos < 0) {	//Si el valor tecleado por el usuario es negativo entra en el bucle o continúa el bucle
					 System.out.println("\nEse no es un valor válido");	//Indica al usuario que no es un valor válido
					//Indica al usuario que elija el número de pisos a añadir otra vez
					 System.out.print("Introduce de nuevo el numero de pisos en venta a introducir: ");
					 numPisos = scan.nextInt();	//Cambia el valor de la variable numPisos a la tecleada por el usuario
				 }

				for (int i = 0; i < numPisos; i++) {	//Se repite el bucle hasta que i sea igual a la variable numPisos
					PisoVenta p = new PisoVenta();	//Se crea un objeto llamado p con la clase PisoVenta
					int auxV;	//Se crea una variable llamada auxA (la V es de Venta)
					
					if (pisosventa.size() != 0) {	//Si el ArrayList de pisos en venta tiene un tamaño distinto de cero entra en la condición
						auxV = pisosventa.size() - 1;	//La variable auxV se iguala al tamaño del ArrayList de pisos en venta menos uno
						//Se cambia el id por el valor del id que tiene el ultimo objeto del ArrayList mas uno
						p.setId(pisosventa.get(auxV).getId() + 1);	
					} else {	//Si el ArrayList de pisos de alquiler tiene un tamaño de cero entra en la condición
						p.setId(1);	//Se cambia el id a uno
					}

					System.out.println("\nPara el Piso en Venta " + p.getId() + "(ID)");	//Muestra que tipo de piso es y su id
					System.out.print("Introduce el precio del piso: ");	//Indica al usuario que introduzca el precio del piso
					p.setPrecio(scan.nextFloat());	//Cambia el valor de la variable precio a la tecleada por el usuario para eso se llama al set de precio
					System.out.print("Introduce los metros cuadrados del piso: ");	//Indica al usuario que introduzca los metros cuadrados del piso
					p.setMetrosCuadrados(scan.nextFloat());	//Cambia el valor de la variable metrosCuadrados a la tecleada por el usuario para eso se llama al set de metrosCuadrados
					System.out.print("Introduce la dirección del piso: ");	//Indica al usuario que introduzca la dirección del piso
					scan.nextLine();	//Crear un scan adicional
					p.setDireccion(scan.nextLine());	//Cambia el valor de la variable direccion a la tecleada por el usuario para eso se llama al set de direccion
					
					pisosventa.add(p);	//añade el objeto p al ArrayList pisosalquiler
				}

				break; //Indica al programa donde termina el case "2" del switch
			case "0":	//Si la variable opcPiso tiene el valor de 0 se realizará el código desde esta línea hasta la 138
				System.out.println("\nFin del programa para añadir pisos");	//Indica al usuario que el programa ha finalizado
				break;	//Indica al programa donde termina el case "0" del switch

			default:	//Si la variable opcPiso tiene un valor diferente de 0, 1 o 2 entra en el default
				System.out.println("ERROR! Ese dato no es válido");	//Muetra al usario que la opción que marco no es válida
				break;	//Indica al programa donde termina el default del switch
			}
		} while (!opcPiso.contentEquals("0"));	//Si la variable opcPiso es igual a cero sale del bucle
	}

	public static void modificarPisos() {	//Creación del procedimiento modificarPisos que sirve para modificar pisos
		Scanner scan = new Scanner(System.in);
		String opcPiso = "g";	//Inicializa la variable opcPiso a una al azar

		do {
			//Muestra por la salida al usuario que opciones tiene el menú
			System.out.println("¿Quieres modificar un piso de alquiler o un piso en venta?\n  1. Piso de Alquiler\n  2. Piso en Venta\n  0. No modificar ninguno");
			System.out.println("\nElige una opción: ");	//Indica al usuario que elija una opción
			opcPiso = scan.next();	//Cambia el valor de la variable opcPiso a la tecleada por el usuario
			
			int pos_id = 0;	//Inicializa la variable pos_id a cero
			
			switch (opcPiso) {	//Se crea un switch con varias casos (se llevará la acción de un caso o otro dependiendo de la variable opcPiso) 

			case "1":	//Si la variable opcPiso tiene el valor de 1 se realizará el código desde esta línea hasta la 234
				String opcModifcar = "g";	//Inicializa la variable opcPiso a una al azar
				int id;	//Se crea una variable llamada id

				do {
					int validoA = 0;	//Inicializa la variable validoA a cero
					do {
						if (pisosalquiler.size() != 0) {	//Si el ArrayList de pisos de alquiler tiene un tamaño distinto de cero entra en la condición
							listarPisosAlquiler();	//Se llama listarPisosAlquiler

							//Le pregunta al usuario que piso quiere modificar
							System.out.println("¿Que piso de alquiler quieres modificar? (Escribe su ID)");
							System.out.println("Nota: Digite -1 para no modificar un piso");	//Da la opción al usuario de no modificar ningún piso
							id = scan.nextInt();	//Cambia el valor de la variable id a la tecleada por el usuario

							if (id != -1) {	//Si la variable id es diferente a -1, entonces entra en el condición
								for (int i = 0; i < pisosalquiler.size(); i++) {	//Se repite el bucle hasta que i sea igual al tamaño de pisosalquiler
									if (pisosalquiler.get(i).getId() == id) {	//Si el id del objeto en la posición i de pisosalquiler es igual a la variable id entonces entra en la condición
										validoA = 1;	//Cambia el valor de la variable validoA a 1
										pos_id = i;	//Cambia el valor de la variable pos_id a la de i
									}
								}
								if (validoA == 0) {	//Si el valor de validoA es igual a 0, entonces entra en el bucle
									//Indica al usuario que se ha producido un error al detectar el piso que quiere modificar
									System.out.println("Este ID no se corresponde con ningún piso.\nEscribelo de nuevo\n");
								}
							} else {
								validoA = 2;	//Cambia el valor de la variable validoA a 2
								opcModifcar = "0";	//Cambia el valor de la variable opcModifcar a 0
							}
						} else {	//Si el ArrayList de pisos de alquiler no tiene un tamaño distinto de cero entra en la condición
							System.out.println("No hay ningún piso en alquiler para modificar\n");	//Indica al usario que hay ningún piso para modificar
							validoA = 2;	//Cambia el valor de la varable validoA a 1
							opcModifcar = "0";	//Cambia el valor de la variable opcModifcar a 0
						}
					} while (validoA == 0);	//Se repite el bucle mientras validoA tenga el valor de 0

					if (validoA != 2) {
						//Muestra por la salida al usuario que opciones tiene el menú
						System.out.println("¿Que es lo que quieres modificar del piso?");
						System.out.println("  1. El precio\n  2. Los metros cuadrados\n  3. La dirección\n  0. Nada(Salir)");
						System.out.println("\nElige una opción: ");	//Indica al usuario que elija una opción
						opcModifcar = scan.next();	//Cambia el valor de la variable opcModifcar a la tecleada por el usuario

						switch (opcModifcar) {	//Se crea un switch con varias casos (se llevará la acción de un caso o otro dependiendo de la variable opcModifcar) 

						case "1":	//Si la variable opcPiso tiene el valor de 1 se realizará el código desde esta línea hasta la 209
							//Muestra al usuario el precio del piso seleccionado
							System.out.println("El precio actual del piso es: " + pisosalquiler.get(pos_id).getPrecio());
							System.out.println("¿A que precio quieres cambiarlo?");	//Pregunta al usuario cual es el nuevo valor a cambiar
							//Cambia el precio del objeto de pisosalquiler en los posición pos_id por el introducido por pantalla
							pisosalquiler.get(pos_id).setPrecio(scan.nextFloat());
							System.out.println();	//Crear un salto de línea adicional
							break;	//Indica al programa donde termina el case "1" del switch
						case "2":	//Si la variable opcPiso tiene el valor de 2 se realizará el código desde esta línea hasta la 216
							//Muestra al usuario los metros cuadrados del piso seleccionado
							System.out.println("Los metros cuadrados del piso es: " + pisosalquiler.get(pos_id).getMetrosCuadrados());
							System.out.println("¿A cuantos metros cuadrados quieres cambiarlo?");	//Pregunta al usuario cual es el nuevo valor a cambiar
							//Cambia los metros cuadrados del objeto de pisosalquiler en los posición pos_id por el introducido por pantalla
							pisosalquiler.get(pos_id).setMetrosCuadrados(scan.nextFloat());	
							System.out.println();	//Crear un salto de línea adicional
							break;	//Indica al programa donde termina el case "2" del switch
						case "3":	//Si la variable opcPiso tiene el valor de 3 se realizará el código desde esta línea hasta la 224
							//Muestra al usuario la dirección del piso seleccionado
							System.out.println("La dirección actual del piso es: " + pisosalquiler.get(pos_id).getDireccion());
							System.out.println("¿A que dirección quieres cambiarlo?");	//Pregunta al usuario cual es el nuevo valor a cambiar
							scan.nextLine();	//Crear un scan adicional
							//Cambia la dirección del objeto de pisosalquiler en los posición pos_id por el introducido por pantalla
							pisosalquiler.get(pos_id).setDireccion(scan.nextLine());
							System.out.println();	//Crear un salto de línea adicional
							break;	//Indica al programa donde termina el case "3" del switch
						case "0":	//Si la variable opcPiso tiene el valor de 0 se realizará el código desde esta línea hasta la 227
							//System.out.println("\nFin del programa");	//Indica al usuario que el programa ha finalizado
							break;	//Indica al programa donde termina el case "0" del switch
						default:	//Si la variable opcPiso no tiene los valores de los anteriores casos se realizará el código desde esta línea hasta la 230
							System.out.println("ERROR! Ese dato no es válido");	//Muestra al usario que la opción que marco no es válida
							break;	//Indica al programa donde termina el default del switch
						}
					}
				} while (!opcModifcar.contentEquals("0"));	//Si la variable opcModifcar es igual a cero sale del bucle
				break;	//Indica al programa donde termina el case "1" del switch

			case "2":	//Si la variable opcPiso tiene el valor de 2 se realizará el código desde esta línea hasta la 308
				opcModifcar = "g";	//Inicializa la variable opcPiso a una al azar
				do {
					int validoV = 0;	//Inicializa la variable validoV a cero
					do {
						if (pisosventa.size() != 0) {	//Si el ArrayList de pisos en venta tiene un tamaño distinto de cero entra en la condición
							listarPisosVenta();	//Se llama listarPisosVenta

							//Le pregunta al usuario que piso quiere modificar
							System.out.println("¿Que piso quieres modificar? (Escribe su ID)");	
							System.out.println("Nota: Digite -1 para no modificar un piso\n");	//Da la opción al usuario de no modificar ningún piso
							id = scan.nextInt();	//Cambia el valor de la variable id a la tecleada por el usuario

							if (id != -1) {	//Si la variable id es diferente a -1, entonces entra en el condición
								for (int i = 0; i < pisosventa.size(); i++) {	//Se repite el bucle hasta que i sea igual al tamaño de pisosventa
									if (pisosventa.get(i).getId() == id) {	//Si el id del objeto en la posición i de pisosventa es igual a la variable id entonces entra en la condición
										validoV = 1;	//Cambia el valor de la variable validoV a 1
										pos_id = i;	//Cambia el valor de la variable pos_id a la de i
									}
								}

								if (validoV == 0) {	//Si el valor de validoA es igual a 0, entonces entra en el bucle
									//Indica al usuario que se ha producido un error al detectar el piso que quiere modificar
									System.out.println("Este ID no se corresponde con ningún piso.\nEscribelo de nuevo\n");
								}
							} else {
								validoV = 2;	//Cambia el valor de la variable validoV a 2
								opcModifcar = "0";	//Cambia el valor de la variable opcModifcar a 0
							}
						} else {	//Si el ArrayList de pisos en venta no tiene un tamaño distinto de cero entra en la condición
							System.out.println("No hay ningún piso en venta para modificar\n");	//Indica al usario que hay ningún piso para modificar
							validoV = 2;	//Cambia el valor de la varable validoA a 1
							opcModifcar = "0";	//Cambia el valor de la variable opcModifcar a 0
						}
					} while (validoV == 0);	//Se repite el bucle mientras validoV tenga el valor de 0

					if (validoV != 2) {
						//Le pregunta al usuario que es lo que quiere modificar
						System.out.println("¿Que es lo que quieres modificar del piso?");	
						System.out.println("  1. El precio\n  2. Los metros cuadrados\n  3. La dirección\n  0. Nada(Salir)");
						System.out.println("\nElige una opción: ");	//Indica al usuario que elija una opción
						opcModifcar = scan.next();	//Cambia el valor de la variable opcModifcar a la tecleada por el usuario

						switch (opcModifcar) {	//Se crea un switch con varias casos (se llevará la acción de un caso o otro dependiendo de la variable opcModificar) 

						case "1":	//Si la variable opcPiso tiene el valor de 1 se realizará el código desde esta línea hasta la 282
							//Muestra al usuario el precio del piso seleccionado
							System.out.println("El precio actual del piso es: " + pisosventa.get(pos_id).getPrecio());
							System.out.println("¿A que precio quieres cambiarlo?");	//Pregunta al usuario cual es el nuevo valor a cambiar
							//Cambia el precio del objeto de pisosventa en los posición pos_id por el introducido por pantalla
							pisosventa.get(pos_id).setPrecio(scan.nextFloat());
							System.out.println();	//Crear un salto de línea adicional
							break;	//Indica al programa donde termina el case "1" del switch
						case "2":	//Si la variable opcPiso tiene el valor de 2 se realizará el código desde esta línea hasta la 289
							//Muestra al usuario los metros cuadrados del piso seleccionado
							System.out.println("Los metros cuadrados del piso es: " + pisosventa.get(pos_id).getMetrosCuadrados());
							System.out.println("¿A cuantos metros cuadrados quieres cambiarlo?");	//Pregunta al usuario cual es el nuevo valor a cambiar
							//Cambia los metros cuadrados del objeto de pisosventa en los posición pos_id por el introducido por pantalla
							pisosventa.get(pos_id).setMetrosCuadrados(scan.nextFloat());
							System.out.println();	//Crear un salto de línea adicional
							break;	//Indica al programa donde termina el case "2" del switch
						case "3":	//Si la variable opcPiso tiene el valor de 3 se realizará el código desde esta línea hasta la 297
							//Muestra al usuario la dirección del piso seleccionado
							System.out.println("La dirección actual del piso es: " + pisosventa.get(pos_id).getDireccion());
							System.out.println("¿A que dirección quieres cambiarlo?");	//Pregunta al usuario cual es el nuevo valor a cambiar
							scan.nextLine();	//Crear un scan adicional
							//Cambia la dirección del objeto de pisosventa en los posición pos_id por el introducido por pantalla
							pisosventa.get(pos_id).setDireccion(scan.nextLine());
							System.out.println();	//Crear un salto de línea adicional
							break;	//Indica al programa donde termina el case "3" del switch
						case "0":	//Si la variable opcPiso tiene el valor de 0 se realizará el código desde esta línea hasta la 300
							//System.out.println("\nFin del programa");	//Indica al usuario que el programa ha finalizado
							break;	//Indica al programa donde termina el case "0" del switch
						default:	//Si la variable opcPiso no tiene los valores de los anteriores casos se realizará el código desde esta línea hasta la 303
							System.out.println("ERROR! Ese dato no es válido");	//Muestra al usario que la opción que marco no es válida
							break;	//Indica al programa donde termina el default del switch
						}
					}

				} while (!opcModifcar.contentEquals("0"));	//Si la variable opcModificar es igual a cero sale del bucle
				break;	//Indica al programa donde termina el case "2" del switch

			case "0":	//Si la variable opcPiso tiene el valor de 0 se realizará el código desde esta línea hasta la 310
				System.out.println("\nFin del programa para modificar pisos");	//Indica al usuario que el programa ha finalizado
				break;	//Indica al programa donde termina el case "0" del switch
			default:	//Si la variable opcPiso no tiene los valores de los anteriores casos se realizará el código desde esta línea hasta la 313
				System.out.println("ERROR! Ese dato no es válido");	//Muestra al usario que la opción que marco no es válida
				break;	//Indica al programa donde termina el default del switch
			}
		} while (!opcPiso.contentEquals("0"));	//Si la variable opcPiso es igual a cero sale del bucle
	}

	public static void listarPisosAlquiler() {	//Creación del procedimiento listarPisosAlquiler sirve para listar los pisos en alquiler
		System.out.println("Pisos de Alquiler");	//Muestra al usuario que los siguientes pisos son de alquiler

		for (PisoAlquiler pisoAlquiler : pisosalquiler) {	//Si el pisosalquiler tiene un objeto de PisoAlquiler se repite el bucle
			System.out.println(pisoAlquiler.toString() + "\n");	//Muestra los datos del piso en alquiler que contiene un objeto de pisosalquiler
		}
	}

	public static void listarPisosVenta() {	//Creación del procedimiento listarPisosVenta sirve para listar los pisos en venta
		System.out.println("Pisos en Venta");	//Muestra al usuario que los siguientes pisos estan en venta

		for (PisoVenta pisoVenta : pisosventa) {	//Si el pisosventa tiene un objeto de PisoVenta se repite el bucle
			System.out.println(pisoVenta.toString() + "\n");	//Muestra los datos del piso en venta que contiene un objeto de pisosventa
		}
	}

	public static void mostrarPisos() {	//Creación del procedimiento mostrarPisos sirve para listar los pisos
		Scanner scan = new Scanner(System.in);	
		String opcPiso = "g";	//Inicializa la opción del menú a una al azar

		do {
			//Muestra por la salida al usuario que opciones tiene el menú
			System.out.println("¿Como quieres visualizar los pisos?\n  1. Visualizar los Pisos de Alquiler\n  2. Visualizar los Pisos en Venta\n  3. Visualizar todos los pisos\n  0. No visualizar ningún piso");
			System.out.println("\nElige una opción: ");	//Indica al usuario que elija una opción
			opcPiso = scan.next();	//La variable opcPiso cambia a la tecleada por el usuario
			switch (opcPiso) {	//Se crea un switch con varias casos (se llevará la acción de un caso o otro dependiendo de la variable opcPiso)

			case "1":	//Si la variable opcPiso tiene el valor de 1 se realizará el código desde esta línea hasta la 355
				if (pisosalquiler.size() != 0) {	//Si el ArrayList de pisos de alquiler tiene un tamaño distinto de cero entra en la condición
					listarPisosAlquiler();	//Llama al procedimiento listarPisosAlquiler
				} else {	//Si el ArrayList de pisos de alquiler tiene un tamaño de cero entra en la condición
					System.out.println("No hay ningún piso en alquiler\n");	//Indica al usuario que no hay ningún piso en alquiler
				}

				break;	//Indica al programa donde termina el case "1" del switch
			case "2":	//Si la variable opcPiso tiene el valor de 2 se realizará el código desde esta línea hasta la 363
				if (pisosventa.size() != 0) {	//Si el ArrayList de pisos en venta tiene un tamaño distinto de cero entra en la condición
					listarPisosVenta();	//Llama al procedimiento listarPisosVenta
				} else {	//Si el ArrayList de pisos en venta tiene un tamaño de cero entra en la condición
					System.out.println("No hay ningún piso en venta\n");	//Indica al usuario que no hay ningún piso en venta
				}

				break;	//Indica al programa donde termina el case "2" del switch
			case "3":	//Si la variable opcPiso tiene el valor de 3 se realizará el código desde esta línea hasta la 375
				if (pisosalquiler.size() != 0) {	//Si el ArrayList de pisos de alquiler tiene un tamaño distinto de cero entra en la condición
					listarPisosAlquiler();	//Llama al procedimiento listarPisosAlquiler
				} else {	//Si el ArrayList de pisos de alquiler tiene un tamaño de cero entra en la condición
					System.out.println("No hay ningún piso en alquiler\n");	//Indica al usuario que no hay ningún piso en alquiler
				}

				if (pisosventa.size() != 0) {	//Si el ArrayList de pisos en venta tiene un tamaño distinto de cero entra en la condición
					listarPisosVenta();	//Llama al procedimiento listarPisosVenta
				} else {	//Si el ArrayList de pisos en venta tiene un tamaño de cero entra en la condición
					System.out.println("No hay ningún piso en venta\n");	//Indica al usuario que no hay ningún piso en venta
				}

				break;	//Indica al programa donde termina el case "3" del switch
			case "0":	//Si la variable opcPiso tiene el valor de 0 se realizará el código desde esta línea hasta la 380
				System.out.println("\nFin del programa para listar los pisos");	//Indica al usuario que el programa ha finalizado
				break;	//Indica al programa donde termina el case "0" del switch
			default:	//Si la variable opcPiso tiene un valor diferente de 0, 1, 2 o 3 entra en el default
				System.out.println("ERROR! Ese dato no es válido");	//Muetra al usario que la opción que marco no es válida
				break;	//Indica al programa donde termina el default del switch
			}
		} while (!opcPiso.contentEquals("0"));	//Si la variable opcPiso es igual a cero sale del bucle
	}

	//Se crea un ArrayList<PisoAlquiler> llamado lista_pisosalquiler
	public static ArrayList<PisoAlquiler> lista_pisosalquiler = new ArrayList<PisoAlquiler>();
	//Se crea un ArrayList<PisoVenta> llamado lista_pisosventa
	public static ArrayList<PisoVenta> lista_pisosventa = new ArrayList<PisoVenta>();

	//Creación del procedimiento ordenarPorPrecio sirve para ordenar los pisos por precio y tiene dos parametros de entrada
	public static void ordenarPorPrecio(ArrayList<PisoAlquiler> lista_pisosalquiler,ArrayList<PisoVenta> lista_pisosventa) {
		int tamaño;	//Se crea la variable tamaño, esta guardará el tamaño de los ArrayList lista_pisosalquiler y lista_pisosventa
		PisoAlquiler auxA = new PisoAlquiler();	//Se crea un objeto llamado auxA de la clase PisoAlquiler

		tamaño = lista_pisosalquiler.size();	//Se da el tamaño de lista_pisosalquiler a la variable tamaño 

		if (tamaño != 0) {	//Si tamaño es distinto de cero entra en la condición
			auxA = lista_pisosalquiler.get(0);	//El objeto auxA es igualado al objeto que este primera posición de lista_pisosalquiler

			for (int i = 0; i < tamaño - 1; i++) {	//Se repite el bucle hasta que i sea igual a tamaño menos 1
				for (int j = 0; j < tamaño - 1; j++) {	//Se repite el bucle hasta que j sea igual a tamaño menos 1
					//Si el precio del objeto de la actual posición del ArrayList es menor al precio del objeto de la siguiente posición del ArrayList, entonces entra en la condición
					if (lista_pisosalquiler.get(j).getPrecio() < lista_pisosalquiler.get(j + 1).getPrecio()) {
						auxA = lista_pisosalquiler.get(j);	//Se cambia el valor del objeto auxA al objeto en posición j del ArrayList
						//Se cambia en la posición j del ArrayList al objeto que esta en la siguiente posición
						lista_pisosalquiler.set(j, lista_pisosalquiler.get(j + 1));
						lista_pisosalquiler.set(j + 1, auxA);	//Se cambia en la posición j + 1 del ArrayList al objeto guardado en auxA
					}
				}
			}

			System.out.println("\nPisos de Alquiler");	//Muestra al usuario que los siguientes pisos son de alquiler

			if (tamaño != 1) {	//Si tamaño es diferente a 1 entra en la condición
				System.out.println("De mayor a menor precio:\n");	//Muestra al usuario que los siguientes pisos estan ordenados de mayor a menor precio
			}

			for (int i = 0; i < tamaño; i++) {	//Se repite el bucle hasta que i sea igual a tamaño
				System.out.println(lista_pisosalquiler.get(i).toString() + "\n");	//Muestra los datos del piso en alquiler que contiene un objeto de lista_pisosalquiler
			}
		} else {	//Si tamaño es cero entra en la condición
			System.out.println("No hay ningún piso en alquiler entre esos valores");	//Indica al usuario que no hay ningún piso en alquiler entre esos valores
		}

		PisoVenta auxV = new PisoVenta();	//Se crea un objeto llamado auxV de la clase PisoVenta

		tamaño = lista_pisosventa.size();	//Se da el tamaño de lista_pisosventa a la variable tamaño 

		if (tamaño != 0) {	//Si tamaño es distinto de cero entra en la condición
			auxV = lista_pisosventa.get(0);	//El objeto auxV es igualado al objeto que este primera posición de lista_pisosventa

			for (int i = 0; i < tamaño - 1; i++) {	//Se repite el bucle hasta que i sea igual a tamaño menos 1
				for (int j = 0; j < tamaño - 1; j++) {	//Se repite el bucle hasta que j sea igual a tamaño menos 1
					//Si el precio del objeto de la actual posición del ArrayList es menor al precio del objeto de la siguiente posición del ArrayList, entonces entra en la condición
					if (lista_pisosventa.get(j).getPrecio() < lista_pisosventa.get(j + 1).getPrecio()) {
						auxV = lista_pisosventa.get(j);	//Se cambia el valor del objeto auxV al objeto en posición j del ArrayList
						//Se cambia en la posición j del ArrayList al objeto que esta en la siguiente posición
						lista_pisosventa.set(j, lista_pisosventa.get(j + 1));
						lista_pisosventa.set(j + 1, auxV);	//Se cambia en la posición j + 1 del ArrayList al objeto guardado en auxV
					}
				}
			}

			System.out.println("\nPisos de Venta");	//Muestra al usuario que los siguientes pisos estan en venta

			if (tamaño != 1) {	//Si tamaño es diferente a 1 entra en la condición
				System.out.println("De mayor a menor precio:\n");	//Muestra al usuario que los siguientes pisos estan ordenados de mayor a menor precio
			}

			for (int i = 0; i < tamaño; i++) {	//Se repite el bucle hasta que i sea igual a tamaño
				System.out.println(lista_pisosventa.get(i).toString() + "\n");	//Muestra los datos del piso en venta que contiene un objeto de lista_pisosventa
			}
		} else {	//Si tamaño es cero entra en la condición
			System.out.println("No hay ningún piso en venta entre esos valores");	//Indica al usuario que no hay ningún piso en venta entre esos valores
		}

		System.out.println("\nFin del programa para listar los pisos por precio");	//Indica al usuario que el programa ha finalizado
	}

	public static void listarPorPrecio() { //Creación del procedimiento listarPorPrecio sirve para listar los pisos segun un rango de precios
		Scanner scan = new Scanner(System.in);
		float precioMin, precioMax;	//Se crea las variables precioMin y precioMax

		System.out.println("Introduzca el rango de precios que quieres buscar los pisos");	//Le pregunta al usuario el rango de precios para buscar los pisos
		System.out.println("Introduzca el precio minimo: ");	//Le pregunta al usuario el precio minimo
		precioMin = scan.nextFloat();	//Se cambia el valor de la variable precioMin por la introducida por el usuario
		System.out.println("Introduzca el precio maximo: ");	//Le pregunta al usuario el precio maximo
		precioMax = scan.nextFloat();	//Se cambia el valor de la variable precioMax por la introducida por el usuario
		
		while(precioMin > precioMax) {		//Si el valor precioMin es mayor precioMax entra en el bucle o continúa el bucle
			//Indica al usuario una condición que se debe cumplir en lo que respecta a los rangos
			System.out.println("El precio minimo no puede ser mayor que el precio maximo y el precio maximo no puede ser menor que el precio minimo");
			System.out.println("Introduzca el rango de precios que quieres buscar los pisos");		//Le pregunta al usuario el rango de precios para buscar los pisos
			System.out.println("Introduzca el precio minimo: ");	//Le pregunta al usuario el precio minimo
			precioMin = scan.nextFloat();	//Se cambia el valor de la variable precioMin por la introducida por el usuario
			System.out.println("Introduzca el precio maximo: ");	//Le pregunta al usuario el precio maximo
			precioMax = scan.nextFloat();	//Se cambia el valor de la variable precioMax por la introducida por el usuario
		}
		
		for (int i = 0; i < pisosalquiler.size(); i++) {	//Se repite el bucle hasta que i sea igual sl tamaño de pisosalquiler
			//Si en la posición i de pisosalquiler se cumple que su precio es mayor que precioMin y menor que precioMax entra en la condición
			if (pisosalquiler.get(i).getPrecio() > precioMin && pisosalquiler.get(i).getPrecio() < precioMax) {
				lista_pisosalquiler.add(pisosalquiler.get(i));	//Se añade a lista_pisosalquiler el objeto de pisosalquiler en la posición i
			}
		}

		for (int i = 0; i < pisosventa.size(); i++) {	//Se repite el bucle hasta que i sea igual sl tamaño de pisosventa
			//Si en la posición i de pisosventa se cumple que su precio es mayor que precioMin y menor que precioMax entra en la condición
			if (pisosventa.get(i).getPrecio() > precioMin && pisosventa.get(i).getPrecio() < precioMax) {
				lista_pisosventa.add(pisosventa.get(i));	//Se añade a lista_pisosventa el objeto de pisosventa en la posición i
			}
		}

		ordenarPorPrecio(lista_pisosalquiler, lista_pisosventa);	//Llama al procedimiento ordenarPorPrecio y le envía dos parametros
		lista_pisosalquiler.clear();	//Borra todos los elementos de lista_pisosalquiler
		lista_pisosventa.clear();	//Borra todos los elementos de lista_pisosventa
	}

	public static void listarPorMetrosCuadrados() {	//Creación del procedimiento listarPorPrecio sirve para listar los pisos segun un rango de metros
		Scanner scan = new Scanner(System.in);
		float metrosMin, metrosMax;	//Se crea las variables

		System.out.println("Introduzca el rango que quieres buscar los pisos");	//Le pregunta al usuario el rango de metros cuadrados para buscar los pisos
		System.out.println("Introduzca el minimo de metros cuadrados: ");	//Le pregunta al usuario el minimo de metros cuadrados
		metrosMin = scan.nextFloat();	//Se cambia el valor de la variable metrosMin por la introducida por el usuario
		System.out.println("Introduzca el maximo de metros cuadrados: ");	//Le pregunta al usuario el maximo de metros cuadrados
		metrosMax = scan.nextFloat();	//Se cambia el valor de la variable metrosMax por la introducida por el usuario
		
		while(metrosMin > metrosMax) {	//Si el valor metrosMin es mayor metrosMax entra en el bucle o continúa el bucle
			//Indica al usuario una condición que se debe cumplir en lo que respecta a los rangos
			System.out.println("El minimo de metros cuadrados no puede ser mayor que el maximo de metros cuadrados \ny el maximo de metros cuadrados no puede ser menor que el minimo de metros cuadrados");
			System.out.println("\nIntroduzca el rango que quieres buscar los pisos");	//Le pregunta al usuario el rango de metros cuadrados para buscar los pisos
			System.out.println("Introduzca el minimo de metros cuadrados: ");	//Le pregunta al usuario el minimo de metros cuadrados
			metrosMin = scan.nextFloat();	//Se cambia el valor de la variable metrosMin por la introducida por el usuario
			System.out.println("Introduzca el maximo de metros cuadrados: ");	//Le pregunta al usuario el maximo de metros cuadrados
			metrosMax = scan.nextFloat();	//Se cambia el valor de la variable metrosMax por la introducida por el usuario
		}

		for (int i = 0; i < pisosalquiler.size(); i++) {	//Se repite el bucle hasta que i sea igual al tamaño de pisosalquiler
			//Si en la posición i de pisosalquiler se cumple que sus metros cuadrados son mayores que precioMin y menores que precioMax entra en la condición
			if (pisosalquiler.get(i).getMetrosCuadrados() > metrosMin && pisosalquiler.get(i).getMetrosCuadrados() < metrosMax) {
				lista_pisosalquiler.add(pisosalquiler.get(i));	//Se añade a lista_pisosalquiler el objeto de pisosalquiler en la posición i
			}
		}

		for (int i = 0; i < pisosventa.size(); i++) {	//Se repite el bucle hasta que i sea igual al tamaño de pisosventa
			//Si en la posición i de pisosventa se cumple que sus metros cuadrados son mayores que metrosMin y menores que metrosMax entra en la condición
			if (pisosventa.get(i).getMetrosCuadrados() > metrosMin && pisosventa.get(i).getMetrosCuadrados() < metrosMax) {
				lista_pisosventa.add(pisosventa.get(i));	//Se añade a lista_pisosventa el objeto de pisosventa en la posición i
			}
		}

		ordenarPorMetrosCuadrados(lista_pisosalquiler, lista_pisosventa);	//Llama al procedimiento ordenarPorMetrosCuadrados y le envía dos parametros
		lista_pisosalquiler.clear();	//Borra todos los elementos de lista_pisosalquiler
		lista_pisosventa.clear();	//Borra todos los elementos de lista_pisosventa
	}

	//Creación del procedimiento ordenarPorMetrosCuadrados sirve para ordenar los pisos por metros cuadrados y tiene dos parametros de entrada
	public static void ordenarPorMetrosCuadrados(ArrayList<PisoAlquiler> lista_pisosalquiler,ArrayList<PisoVenta> lista_pisosventa) {
		int tamaño;	//Se crea la variable tamaño, esta guardará el tamaño de los ArrayList lista_pisosalquiler y lista_pisosventa
		PisoAlquiler auxA = new PisoAlquiler();	//Se crea un objeto llamado auxA de la clase PisoAlquiler

		tamaño = lista_pisosalquiler.size();	//Se da el tamaño de lista_pisosalquiler a la variable tamaño 

		if (tamaño != 0) {	//Si tamaño es distinto de cero entra en la condición
			auxA = lista_pisosalquiler.get(0);	//El objeto auxA es igualado al objeto que este primera posición de lista_pisosalquiler

			for (int i = 0; i < tamaño - 1; i++) {	//Se repite el bucle hasta que i sea igual a tamaño menos 1
				for (int j = 0; j < tamaño - 1; j++) {	//Se repite el bucle hasta que j sea igual a tamaño menos 1
					//Si los metros cuadrados del objeto de la actual posición del ArrayList son menores a los metros cuadrados del objeto de la siguiente posición del ArrayList, entonces entra en la condición
					if (lista_pisosalquiler.get(j).getMetrosCuadrados() < lista_pisosalquiler.get(j + 1).getMetrosCuadrados()) {
						auxA = lista_pisosalquiler.get(j);	//Se cambia el valor del objeto auxA al objeto en posición j del ArrayList
						//Se cambia en la posición j del ArrayList al objeto que esta en la siguiente posición
						lista_pisosalquiler.set(j, lista_pisosalquiler.get(j + 1));
						lista_pisosalquiler.set(j + 1, auxA);	//Se cambia en la posición j + 1 del ArrayList al objeto guardado en auxV
					}
				}
			}

			System.out.println("\nPisos de Alquiler");	//Muestra al usuario que los siguientes pisos estan en alquiler

			if (tamaño != 1) {	//Si tamaño es diferente a 1 entra en la condición
				System.out.println("De más a menos metros cuadrados:\n");	//Muestra al usuario que los siguientes pisos estan ordenadosmás a menos metros cuadrados
			}

			for (int i = 0; i < tamaño; i++) {	//Se repite el bucle hasta que i sea igual a tamaño
				System.out.println(lista_pisosalquiler.get(i).toString() + "\n");	//Muestra los datos del piso en alquiler que contiene un objeto de lista_pisosalquiler
			}
		} else {	//Si tamaño es cero entra en la condición
			System.out.println("No hay ningún piso en alquiler entre esos valores");	//Indica al usuario que no hay ningún piso en alquiler entre esos valores
		}

		PisoVenta auxV = new PisoVenta();	//Se crea un objeto llamado auxV de la clase PisoVenta

		tamaño = lista_pisosventa.size();	//Se da el tamaño de lista_pisosventa a la variable tamaño 

		if (tamaño != 0) {	//Si tamaño es distinto de cero entra en la condición
			auxV = lista_pisosventa.get(0);	//El objeto auxV es igualado al objeto que este primera posición de lista_pisosventa

			for (int i = 0; i < tamaño - 1; i++) {	//Se repite el bucle hasta que i sea igual a tamaño menos 1
				for (int j = 0; j < tamaño - 1; j++) {	//Se repite el bucle hasta que j sea igual a tamaño menos 1
					//Si los metros cuadrados del objeto de la actual posición del ArrayList son menores a los metros cuadrados del objeto de la siguiente posición del ArrayList, entonces entra en la condición
					if (lista_pisosventa.get(j).getMetrosCuadrados() < lista_pisosventa.get(j + 1).getMetrosCuadrados()) {
						auxV = lista_pisosventa.get(j);	//Se cambia el valor del objeto auxV al objeto en posición j del ArrayList
						//Se cambia en la posición j del ArrayList al objeto que esta en la siguiente posición
						lista_pisosventa.set(j, lista_pisosventa.get(j + 1));
						lista_pisosventa.set(j + 1, auxV);	//Se cambia en la posición j + 1 del ArrayList al objeto guardado en auxV
					}
				}
			}

			System.out.println("\nPisos de Venta");	//Muestra al usuario que los siguientes pisos estan en venta

			if (tamaño != 1) {	//Si tamaño es diferente a 1 entra en la condición
				System.out.println("De más a menos metros cuadrados:\n");	//Muestra al usuario que los siguientes pisos estan ordenadosmás a menos metros cuadrados
			}

			for (int i = 0; i < tamaño; i++) {	//Se repite el bucle hasta que i sea igual a tamaño
				System.out.println(lista_pisosventa.get(i).toString() + "\n");	//Muestra los datos del piso en venta que contiene un objeto de lista_pisosventa
			}
		} else {
			System.out.println("No hay ningún piso en venta entre esos valores");	//Indica al usuario que no hay ningún piso en venta entre esos valores
		}

		System.out.println("\nFin del programa para listar los pisos por metros cuadrados");	//Indica al usuario que el programa ha finalizado
	}

	//Creación del procedimiento eliminarPisos que sirve para eliminar pisos de los ArrayList
	public static void eliminarPisos() {
		Scanner scan = new Scanner(System.in);
		String opcPiso = "g";	//Inicializa la opción del menú a una al azar
		int id;	//Creación de la variable id

		do {
			//Muestra por la salida al usuario que opciones tiene el menú
			System.out.println("¿Quieres alquilar o vender un piso?\n  1. Piso de Alquiler\n  2. Piso en Venta\n  0. No alquilar/vender ninguno");
			System.out.println("\nElige una opción: ");	//Indica al usuario que elija una opción
			opcPiso = scan.next();	//Cambia el valor de la variable opcPiso por la tecleada por el usuario
			switch (opcPiso) {	//Se crea un switch con varias casos (se llevará la acción de un caso o otro dependiendo de la variable opcPiso)

			case "1":	//Si la variable opcPiso tiene el valor de 1 se realizará el código desde esta línea hasta la 662
				int validoA = 0;	//Se inicializa validoA a cero

				do {
					if (pisosalquiler.size() != 0) {	//Si el ArrayList de pisos de alquiler tiene un tamaño distinto de cero entra en la condición
						listarPisosAlquiler();	//Llama al procedimiento listarPisosAlquiler

						System.out.println("¿Que piso quieres alquilar? (Escribe su ID)");	//Le pregunta al usuario por el piso que quiere alquilar
						System.out.println("Nota: Digite -1 para no alquilar un piso");	//Si el usuario ha decidido que no quiere alquilar ningún piso tiene la opción de no alquilar ninguno tecleando -1
						id = scan.nextInt();	//Cambia el valor de la varable id por el tecleado por el usuario

						if (id != -1) {	//Si el valor de id es diferente a -1, entonces entra en la condición
							for (int i = 0; i < pisosalquiler.size(); i++) {	//Se repite el bucle hasta que i sea igual al tamaño de pisosalquiler
								if (pisosalquiler.get(i).getId() == id) {	//Si el id del objeto en la posición i de pisosalquiler es igual a la variable id entonces entra en la condición
									//pisosalquiler.remove(pisosalquiler.get(i));
									pisosalquiler.remove(i);	//Borra el objeto de pisosalquiler en la posición i de pisosalquiler
									validoA = 1;	//Cambia el valor de validoA a 1

									System.out.println("El piso ha sido alquilado\n");	//Indica al usuario que piso ya ha sido alquilado
								}
							}

							if (validoA == 0) {	//Si el valor de validoA es igual a cero entra en la condición
								//Indica al usuario que se ha producido un error al detectar el piso que quiere alquilar
								System.out.println("Este ID no se corresponde con ningún piso\nEscribelo de nuevo\n");
							}
						} else {	//Si el valor de id es igual a -1, entonces entra en la condición
							validoA = 1;	//Cambia el valor de la varable validoA a 1
						}
					} else {	//Si el ArrayList de pisos de alquiler no tiene un tamaño distinto de cero entra en la condición
						System.out.println("No queda ningún piso para alquilar\n");	//Indica al usario que no queda ningún piso para alquilar
						validoA = 1;	//Cambia el valor de la varable validoA a 1
					}
				} while (validoA == 0);	//Se repite el bucle mientras validoA tenga el valor de 0

				break;	//Indica al programa donde termina el case "1" del switch
			case "2":	//Si la variable opcPiso tiene el valor de 1 se realizará el código desde esta línea hasta la 698
				int validoV = 0;	//Se inicializa validoV a cero

				do {
					if (pisosventa.size() != 0) {	//Si el ArrayList de pisos en venta tiene un tamaño distinto de cero entra en la condición
						listarPisosVenta();	//Llama al procedimiento listarPisosVenta

						System.out.println("¿Que piso quieres vender? (Escribe su ID)");	//Le pregunta al usuario por el piso que quiere vender
						System.out.println("Nota: Digite -1 para no vender un piso\n");	//Si el usuario ha decidido que no quiere vender ningún piso tiene la opción de no vender ninguno tecleando -1
						id = scan.nextInt();	//Cambia el valor de la varable id por el tecleado por el usuario

						if (id != -1) {	//Si el valor de id es diferente a -1, entonces entra en la condición
							for (int i = 0; i < pisosventa.size(); i++) {	//Se repite el bucle hasta que i sea igual al tamaño de pisosventa
								if (pisosventa.get(i).getId() == id) {	//Si el id del objeto en la posición i de pisosventa es igual a la variable id entonces entra en la condición
									pisosventa.remove(i);	//Borra el objeto de pisosventa en la posición i de pisosventa
									//pisosventa.remove(pisosventa.get(i));
									validoV = 1;	//Cambia el valor de la varable validoV a 1

									System.out.println("El piso ha sido vendido\n");	//Indica al usuario que piso ya ha sido vendido
								}
							}

							if (validoV == 0) {	//Si el valor de validoV es igual a cero entra en la condición
								//Indica al usuario que se ha producido un error al detectar el piso que quiere vender
								System.out.println("Este ID no se corresponde con ningún piso\nEscribelo de nuevo\n");
							}
						} else {
							validoV = 1;	//Cambia el valor de la varable validoV a 1
						}
					} else {	//Si el valor de id es igual a -1, entonces entra en la condición
						System.out.println("No queda ningún piso para vender\n");	//Indica al usario que no queda ningún piso para vender
						validoV = 1;	//Cambia el valor de la varable validoV a 1
					}
				} while (validoV == 0);	//Se repite el bucle mientras validoV tenga el valor de 0

				break;	//Indica al programa donde termina el case "2" del switch
			case "0":	//Si la variable opcPiso tiene el valor de 1 se realizará el código desde esta línea hasta la 701
				System.out.println("\nFin del programa para alquilar/vender pisos");	//Indica al usuario que el programa ha finalizado
				break;	//Indica al programa donde termina el case "0" del switch
			default:	//Si la variable opcPiso tiene el valor de 1 se realizará el código desde esta línea hasta la 704
				System.out.println("ERROR! Ese dato no es válido");	//Muetra al usario que la opción que marco no es válida
				break;	//Indica al programa donde termina el default del switch
			}
		} while (!opcPiso.contentEquals("0"));	//Si la variable opcPiso es igual a cero sale del bucle
	}

	public static void menu() {	//Creación del procedimiento menu sirve para crear un menu
		Scanner scan = new Scanner(System.in);
		String opc = "g";	//Inicializa la opción del menú a una al azar
		do {
			//Muestra al usuario una bienvenida al menú, ademas de indicarle el nombre de la agencia inmobiliaria
			System.out.println("\nBienvenido al menú virtual "+ getNombre() +" \n");

			//Muestra al usuario las opciones que cuenta el menú
			System.out.println("Este menú virtual cuenta con las siguientes opciones: ");

			System.out.println("  0. Salir.");
			System.out.println("  1. Añadir un nuevo piso a la venta o en alquiler a la lista.");
			System.out.println("  2. Modificar un piso existente en la lista.");
			System.out.println("  3. Listar los pisos disponibles.");
			System.out.println("  4. Listar los pisos en un rango de precios.");
			System.out.println("  5. Listar los pisos en un rango de metros cuadrados.");
			System.out.println("  6. Eliminar un piso de la lista tras este ser alquilado o vendido.");

			System.out.println("\nIntroduzca una opción para el menú: ");	//Indica al usuario que elija una opción
			opc = scan.next();	//La variable opc cambia a la tecleada por el usuario
			switch (opc) { 	//Se crea un switch con varias casos (se llevará la acción de un caso o otro dependiendo de la variable opc) 
			case "1":	añadirPisos();	break; //Si la valiable opc es igual a 1 entonces se llama a añadirPisos
			case "2":	modificarPisos();	break;	//Si la valiable opc es igual a 2 entonces se llama a modificarPisos
			case "3":	mostrarPisos();	break;	//Si la valiable opc es igual a 3 entonces se llama a mostrarPisos
			case "4":	listarPorPrecio();	break;	//Si la valiable opc es igual a 4 entonces se llama a listarPorPrecio
			case "5":	listarPorMetrosCuadrados();	break;	//Si la valiable opc es igual a 5 entonces se llama a listarPorMetrosCuadrados
			case "6":	eliminarPisos();	break;	//Si la valiable opc es igual a 6 entonces se llama a eliminarPisos
			case "0":	System.out.println("\n\nFin del programa");	break;	//Si la valiable opc es igual a 0 entonces le indica al usuario que el programa ha finalizado
			default:	System.out.println("ERROR! Ese dato no es válido");	break;	//Si la valiable opc no es igual a ninguna de las anteriores casos entonces mustra al usuario que esa opción no es válida
			}
		} while (!opc.contentEquals("0"));	//Si la variable opcPiso es igual a cero sale del bucle
		scan.close();	//Se cierra el scanner
	}

	public static void main(String[] args) {	//Se crea el método main
		Agencia agenciaD11= new Agencia("La inmobiliaria del Distrito 11");	//Se crea un objeto de la clase Agencia llamado agenciaD11 con un parametro
		
		//Se crea varios objetos de la clase PisoAlquiler
		PisoAlquiler pisoA1 = new PisoAlquiler(605, 130, "Rúa das Meidades", 1);
		PisoAlquiler pisoA2 = new PisoAlquiler(802, 160, "Rúa Xogo da Ola", 2);
		PisoAlquiler pisoA3 = new PisoAlquiler(935, 155, "Rúa O Lugar de Breogán", 3);
		PisoAlquiler pisoA4 = new PisoAlquiler(634, 143, "Rúa Naiterra Miña", 4);
		PisoAlquiler pisoA5 = new PisoAlquiler(799, 139, "Rúa Plaza España", 5);
		//Se añade al ArrayList pisosalquiler los anteriores objetos creados  de la clase PisoAlquiler
		pisosalquiler.add(pisoA1);
		pisosalquiler.add(pisoA2);
		pisosalquiler.add(pisoA3);
		pisosalquiler.add(pisoA4);
		pisosalquiler.add(pisoA5);
		//Cambia el valor de pisosalquiler del objeto de AgenciaD11 al pisosalquiler acabado de añadir valores
		agenciaD11.setPisosalquiler(pisosalquiler);

		//Se crea varios objetos de la clase PisoVenta
		PisoVenta pisoV1 = new PisoVenta(300455, 100, "Rúa Mercantil de Zafan", 1);
		PisoVenta pisoV2 = new PisoVenta(350000, 127, "Rúa Barbeitos", 2);
		PisoVenta pisoV3 = new PisoVenta(405000, 172, "Rúa da Programación", 3);
		PisoVenta pisoV4 = new PisoVenta(535000, 232, "Rúa Cleanance Azul", 4);
		PisoVenta pisoV5 = new PisoVenta(635000, 350, "Rúa do Distrito 11", 5);
		//Se añade al ArrayList pisosventa los anteriores objetos creados  de la clase PisoVenta
		pisosventa.add(pisoV1);
		pisosventa.add(pisoV2);
		pisosventa.add(pisoV3);
		pisosventa.add(pisoV4);
		pisosventa.add(pisoV5);
		//Cambia el valor de pisosventa del objeto de AgenciaD11 al pisosventa acabado de añadir valores
		agenciaD11.setPisosventa(pisosventa);
		
		menu();	//Se llama al procedimiento del menu
	}
}
