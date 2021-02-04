/*import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);//CREAMOS EL OBBJETO SCANNER
    public static final int MAX_EMPLEADOS = 20;
    public static Empleado total[];

 

    public static void nuevo() {
        
        //estas variables las vamos a pasar a traves de los setters
        int base, irpf, hijos, totalem, hextra;
        String casado;
        String nombre, nif;
                
        System.out.println("Cuantos empleados nuevos vas a registrar (máximo 20)");
        totalem = sc.nextInt();
            
        for (int i = 0; i < totalem; i++) {
            
            //pedimos nif para paserselo al constructor    
            System.out.println("Dime el nif(DNI sin LETRA) del nuevo empleado");
            nif = sc.next();
            
            //creamos empleado con el nif
            Empleado nuevoempleado = new Empleado(nif);
            
            total[i] = nuevoempleado;
            
            //pasasmos variables a atributos con setters
            System.out.println("Nombre:");
            nombre = sc.next();
            nuevoempleado.setNombre(nombre);
            
            System.out.println("Sueldo base");
            base = sc.nextInt();
            nuevoempleado.setSalariobase(base);
            
            System.out.println("Horas extra realizadas");
            hextra = sc.nextInt();
            nuevoempleado.setHorasextra(hextra);
            
            System.out.println("% del IRPF");
            irpf = sc.nextInt();
            nuevoempleado.setIRPF(irpf);
            
            System.out.println("Casado?  (true/false)");
            casado = sc.next();
            nuevoempleado.setCasado(true);
            
            System.out.println("nº de hijos?");
            hijos = sc.nextInt();
            nuevoempleado.setNumerohijos(hijos);
                        
        }//END FOR    
        
    }//END NUEVO
    
    public static Empleado masDinero(Empleado total[]) {    
        int mayor;
        int pos = 0;
        
        mayor = total[0].getSalariobase();
        
        for (int i = 0; i < total.length; i++) {
            if (total[i].getSalariobase() > mayor) {
                mayor = total[i].getSalariobase();
                pos = i;
            }//END IF
        }//END FOR    
        
        return total[pos];        
    }//END FUNCTION
    
    public static Empleado masTrabajo(Empleado p_total[]) {    
        int mayor;
        int sueldoextra;
        int pos = 0;
                    
        sueldoextra =((int) (total[0].getHorasExtras()*Empleado.getImpextra()));
        
        mayor = sueldoextra;
    
            for (int i = 0; i < total.length; i++) {
                if (total[i].getSueldoBase() > mayor) {
                    mayor = total[i].getSueldoBase();
                    pos = i;
                }//END IF
                sueldoextra =((int) (total[i].getHorasExtras()*Empleado.getImpextra()));
            }//END FOR    
            
            System.out.println("El empleado que mas cobra en función de sus horas extra es"
                    + " " + total[pos].getNombre());
            
            public static void main(String[] args) {
                // TODO Auto-generated method stub
                    
                nuevo();
                
                masDinero(total);
                masTrabajo(total);
                
         
            }
         
        }*/

//import java.util.Scanner;

/*public class Main {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//Empleado f1 = new Empleado("33333", "Pablo Baños", 1200, 4, 8, "Si", 2, 10);
int num_empleados,horasextra,numerohijos;
double salariobase, IRPF, pagohorasextra;
String nif, nombre, casado;

System.out.println("Digite el numero de empleados: ");
num_empleados = scan.nextInt();

int vector[] = new int[num_empleados];  

for(int i = 1; i <= vector.length; i++) {
System.out.println("Intruzca la información del empleado " + i);
System.out.println("Escriba su nif");
nif = scan.nextLine();
System.out.println("Escriba su nombre");
nombre = scan.nextLine();
System.out.println("Escriba su salariobase");
salariobase = scan.nextDouble();
System.out.println("Escriba su IRPF");
IRPF = scan.nextDouble();
System.out.println("Escriba su horasextra");
horasextra = scan.nextInt();
System.out.println("Escriba su casado");
casado = scan.nextLine();
System.out.println("Escriba su numerohijos");
numerohijos = scan.nextInt();

Empleado f1 = new Empleado(nif, nombre, salariobase, IRPF, horasextra, casado, numerohijos, 0);
   //System.out.println(nif+ "\n" + nombre+ "\n" + salariobase+ "\n" + IRPF+ "\n" + horasextra+ "\n" + casado+"\n" + numerohijos;);
}

//System.out.println(f1.toString());
}

}*/

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);// CREAMOS EL OBBJETO SCANNER
	public static final int maxEmpleados = 20;
	public static Empleado total[];

	public static void nuevo() {

		// estas variables las vamos a pasar a traves de los setters
		int base, irpf, hijos, totalem, hextra;
		String casado;
		String nombre;// , nif;

		System.out.println("Cuantos empleados nuevos vas a registrar (máximo 20)");
		totalem = sc.nextInt();

		while (totalem > maxEmpleados || totalem < 1) {
			System.out.println(
					"Error!! No pueden ser mas de 20 empleados o menos de 1 empleado\nTe lo pregunto de nuevo ¿Cuantos empleados nuevos vas a registrar? (máximo 20)");
			totalem = sc.nextInt();
		}

		total = new Empleado[totalem];

		for (int i = 0; i < totalem; i++) {

			// pedimos nif para paserselo al constructor
			Nif nif1 = new Nif();
			// nif1.leer();
			// nif = sc.nextLine();

			// creamos empleado con el nif
			Empleado nuevoempleado = new Empleado(nif1.leer());
			total[i] = nuevoempleado;

			// pasamos variables a atributos con setters
			System.out.println("Nombre:");
			nombre = sc.next();
			nuevoempleado.setNombre(nombre);

			System.out.println("Sueldo base");
			base = sc.nextInt();
			nuevoempleado.setSalariobase(base);

			System.out.println("Horas extra realizadas");
			hextra = sc.nextInt();
			nuevoempleado.setHorasextra(hextra);

			System.out.println("% del IRPF");
			irpf = sc.nextInt();
			nuevoempleado.setIRPF(irpf);

			System.out.println("Casado? (si o no)");
			casado = sc.next();

			if (casado == "si") {
				nuevoempleado.setCasado(true);
			} else {
				nuevoempleado.setCasado(false);
			}

			System.out.println("nº de hijos?");
			hijos = sc.nextInt();
			nuevoempleado.setNumerohijos(hijos);

			if (i == totalem) {
				double pagoextra;
				System.out.println("Introduzca el importe al pago por hora extra: ");
				pagoextra = sc.nextDouble();
				Empleado.setPagohorasextra(pagoextra);
			}
		}
	}

	/*
	 * private static String getNif() { return null; }
	 */

	public static Empleado masDinero(Empleado total[]) {
		int mayor, menor;
		int posmay = 0, posmen = 0, pos = 0, aux = 0, aux_menor = 10000000;

		mayor = (int) total[0].getSalariobase();
		menor = (int) total[0].getSalariobase();

		for (int i = 0; i < total.length; i++) {
			if (total[i].getSalariobase() > mayor) {
				mayor = (int) total[i].getSalariobase();

				if (mayor > aux) {
					posmay = i;
				}
				pos = i;

				/*
				 * if(mayor < aux) { posmen = i; }
				 */

				aux = mayor;
			}

			if (total[i].getSalariobase() < menor) {
				menor = (int) total[i].getSalariobase();

				/*
				 * if(mayor > aux) { posmay = i; } pos = i;
				 */

				if (menor < aux_menor) {
					posmen = i;
				}

				aux_menor = menor;
			}
		}

		System.out.println("El empleado que mas cobra es" + " " + total[posmay].getNombre());
		System.out.println("El empleado que menos cobra es" + " " + total[posmen].getNombre());

		return total[pos];
	}

	public static Empleado masTrabajo(Empleado p_total[]) {
		int mayor, menor;
		int sueldoextra;
		int pos = 0, aux = 0, posmay = 0, posmen = 0, aux_menor = 100000;

		sueldoextra = ((int) (total[0].getHorasextra() * Empleado.getPagohorasextra()));

		mayor = sueldoextra;
		menor = sueldoextra;

		for (int i = 0; i < total.length; i++) {
			if (total[i].getHorasextra() > mayor) {
				mayor = (int) total[i].getHorasextra();

				if (mayor > aux) {
					posmay = i;
				}

				pos = i;
			}

			if (total[i].getHorasextra() < menor) {
				menor = (int) total[i].getHorasextra();

				if (menor < aux_menor) {
					posmen = i;
				}
			}

			sueldoextra = ((int) (total[i].getHorasextra() * Empleado.getPagohorasextra()));
		}

		System.out.println(
				"El empleado que mas cobra en función de sus horas extra es" + " " + total[posmay].getNombre());
		System.out.println(
				"El empleado que menos cobra en función de sus horas extra es" + " " + total[posmen].getNombre());

		return total[pos];
	}

	public static void ordenar() {
		int aux;

		for (int i = 0; i < total.length - 1; i++) {
			for (int j = 0; j < total.length - 1; j++) {
				if (total[j].getSalariobase() < total[j + 1].getSalariobase()) {
					aux = (int) total[j].getSalariobase();
					total[j].setSalariobase(total[j + 1].getSalariobase());
					total[j + 1].setSalariobase(aux);
				}
			}
		}

		System.out.println("Los empleados ordenados de menor a mayor sueldo:");

		for (int i = total.length - 1; i >= 0; i--) {
			System.out.println(total[i].getNombre() + " con un sueldo total de " + total[i].getSalariobase());
		}
		/*
		 * for(int i = 0; i < total.length; i++) {
		 * System.out.println(total[i].getNombre() + " con un sueldo total de " +
		 * total[i].getSalariobase()); }
		 */
	}

	public static void main(String[] args) {

		nuevo();

		masDinero(total);
		masTrabajo(total);
		ordenar();

	}

}