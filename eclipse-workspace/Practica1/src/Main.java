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
            System.out.println("El n�mero " + numero + " es perfecto"); 
            return true;
		} else { 
        if(w == 1) numero *= -1; 
            System.out.println("El n�mero " + numero + " no es perfecto"); 
            return false; 
        } 
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);    
        String opc = "g";
        
        do {
        	System.out.println("\nBienvenido a este men� virtual ");    
            System.out.println("Este men� cuenta con las siguientes opciones: ");    
            System.out.println("  1. Calcular si un n�mero es perfecto o no.");    
            System.out.println("  2. Mostrar que n�mero es mayor de dos n�meros.");    
            System.out.println("  3. Calcular la desviaci�n est�ndar.");    
            System.out.println("  4. Salir ");   
  
            System.out.println("\nIntroduzca una opci�n para el men�: ");    
            opc = scan.next();   
  
            switch(opc) {
                case "1":   
                	int numero; 
                    
                    System.out.println("Introduce un n�mero: "); 
                    numero = scan.nextInt(); 
                     
                    numero_Perfecto(numero); 
                     
                    System.out.println("El programa del algoritmo 1 ha finalizado"); 
                    break;    
  
                case "2":  
                	int t, q = 1; 
                    
                    System.out.println("Pulsa cero para finalizar el programa"); 
                    System.out.println("Ingrese un valor de un n�mero entero positivo: "); 
                    t = scan.nextInt();
                    
                    while(t < 0) { 
                    	System.out.println("Error! Ese dato no es v�lido (El n�mero tiene que ser entero positivo)\n\nPulsa cero para finalizar el programa\nIngrese otro valor de un n�mero entero positivo: "); 
                        t = scan.nextInt(); 
                    }
                    
                    while (t != 0 && q != 0) { 
                    	System.out.println("\nPulsa cero para finalizar el programa"); 
                        System.out.println("Ingrese otro valor de un n�mero entero positivo: "); 
                        q = scan.nextInt(); 
                        
                        while(q < 0) { 
                        	System.out.println("Error! Ese dato no es v�lido (El n�mero tiene que ser entero positivo)\n\nPulsa cero para finalizar el programa\nIngrese otro valor de un n�mero entero positivo: "); 
                            q = scan.nextInt();
                        }
                        
                        if(q != 0) {
                        	if( t < q) { 
                        		System.out.println("El n�mero mayor entre " + t + " y " + q + " es " + q);
                        	} else if( q < t) { 
                        		System.out.println("El n�mero menor entre " + t + " y " + q + " es " + q);
                        	} else if( t == q) { 
                        		System.out.println("Los dos n�meros tienen el mismo valor"); 
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
                     
                    System.out.println("Nota: La desviaci�n est�ndar se realizar� a cuatra n�meros"); 
                     
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
                         
                        System.out.println("La desviacion est�ndar es: " + desviacion); 
                    }
                    System.out.println("El programa del algoritmo 3 ha finalizado"); 
                    break; 
                    
                case "4":    
                    System.out.println("\n\nVuelva Pronto!!");   
                    break;    
  
                default:    
                    System.out.println("ERROR! Ese dato no es v�lido");   
                    break;     
            }
        } while (!opc.contentEquals("4"));  
        scan.close();
	}
}