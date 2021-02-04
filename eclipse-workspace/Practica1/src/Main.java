import java.util.Scanner; 
public class Main {
	
	public static boolean numero_Perfecto(int numero) {
		int suma = 0, w = 0;
		
		if(numero < 0) { 
			w = 1; 
			numero *= -1;
		}
		
		for (int i = 1; i < numero; i++) {    
	    	if (numero % i == 0) { 
	            suma += i;    
	        }
	    }
		
		if (suma == numero) {
			if(w == 1) numero *= -1; 
            System.out.println("El número " + numero + " es perfecto"); 
            return true;
		} else { 
        if(w == 1) numero *= -1; 
            System.out.println("El número " + numero + " no es perfecto"); 
            return false; 
        } 
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);    
        String opc = "g";
        
        do {
        	System.out.println("\nBienvenido a este menú virtual ");    
            System.out.println("Este menú cuenta con las siguientes opciones: ");    
            System.out.println("  1. Calcular si un número es perfecto o no.");    
            System.out.println("  2. Mostrar que número es mayor de dos números.");    
            System.out.println("  3. Calcular la desviación estándar.");    
            System.out.println("  4. Salir ");   
  
            System.out.println("\nIntroduzca una opción para el menú: ");    
            opc = scan.next();   
  
            switch(opc) {
                case "1":   
                	int numero; 
                    
                    System.out.println("Introduce un número: "); 
                    numero = scan.nextInt(); 
                     
                    numero_Perfecto(numero); 
                     
                    System.out.println("El programa del algoritmo 1 ha finalizado"); 
                    break;    
  
                case "2":  
                	int t, q = 1; 
                    
                    System.out.println("Pulsa cero para finalizar el programa"); 
                    System.out.println("Ingrese un valor de un número entero positivo: "); 
                    t = scan.nextInt();
                    
                    while(t < 0) { 
                    	System.out.println("Error! Ese dato no es válido (El número tiene que ser entero positivo)\n\nPulsa cero para finalizar el programa\nIngrese otro valor de un número entero positivo: "); 
                        t = scan.nextInt(); 
                    }
                    
                    while (t != 0 && q != 0) { 
                    	System.out.println("\nPulsa cero para finalizar el programa"); 
                        System.out.println("Ingrese otro valor de un número entero positivo: "); 
                        q = scan.nextInt(); 
                        
                        while(q < 0) { 
                        	System.out.println("Error! Ese dato no es válido (El número tiene que ser entero positivo)\n\nPulsa cero para finalizar el programa\nIngrese otro valor de un número entero positivo: "); 
                            q = scan.nextInt();
                        }
                        
                        if(q != 0) {
                        	if( t < q) { 
                        		System.out.println("El número mayor entre " + t + " y " + q + " es " + q);
                        	} else if( q < t) { 
                        		System.out.println("El número menor entre " + t + " y " + q + " es " + q);
                        	} else if( t == q) { 
                        		System.out.println("Los dos números tienen el mismo valor"); 
                        	}
                        	t = q;
                        }
                    }
                    
                    System.out.println("El programa del algoritmo 2 ha finalizado"); 
                    break;  
                 
                case "3":
                    float valor[] = new float[4]; 
                    int sumatorio = 0; 
                    double varianza = 0.0, desviacion = 0.0, media = 0.0;  
                     
                    System.out.println("Nota: La desviación estándar se realizará a cuatra números"); 
                     
                    for(int i = 0; i < 4; i++) { 
                    	System.out.println("Pulsa cero para terminar el programa"); 
                        System.out.println("Ingrese el valor " + (i + 1) + ": "); 
                        valor[i] = scan.nextFloat(); 
                         
                        sumatorio += valor[i]; 
                        if(valor[i] == 0) { 
                        	i = 4; 
                            media = 1; 
                        }
                    }
                    
                    if(media != 1) {
                    	media = sumatorio / 4.0; 
                        
                        for(int i = 0; i < 4; i++) { 
                        	double rango; 
                            
                            rango = Math.pow(valor[i] -  media, 2f); 
                            varianza += rango; 
                        }
                        varianza /= 4f; 
                        desviacion = Math.sqrt(varianza); 
                         
                        System.out.println("La desviacion estándar es: " + desviacion); 
                    }
                    System.out.println("El programa del algoritmo 3 ha finalizado"); 
                    break; 
                    
                case "4":    
                    System.out.println("\n\nVuelva Pronto!!");   
                    break;    
  
                default:    
                    System.out.println("ERROR! Ese dato no es válido");   
                    break;     
            }
        } while (!opc.contentEquals("4"));  
        scan.close();
	}
}