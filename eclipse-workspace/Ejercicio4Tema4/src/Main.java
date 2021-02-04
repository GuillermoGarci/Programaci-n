import java.util.Scanner; 
  
public class Main { 
  
	public static void main(String[] args) {   
		 Fraccion f1 = new Fraccion(1,4); // 1/4 
	     Fraccion f2 = new Fraccion(1,2); // 1/2 
	     Fraccion f3 = new Fraccion(2,6); // 2/6 
	     Fraccion f4 = new Fraccion(4,12); // 4/12 
	     
	     Fraccion f5 = new Fraccion(4); 
	     Fraccion f6 = new Fraccion(2); 
	     Fraccion f7 = new Fraccion(6);  
	     Fraccion f8 = new Fraccion(12);  
	      
	     Fraccion suma = f1.suma(f1, f2); 
	     Fraccion resta = f2.resta(f2, f4); 
	     Fraccion producto = f3.multiplicacion(f3, f1); 
	     Fraccion cociente = f4.division(f4, f3); 
	     
	     Fraccion sumar = f5.suma(f8); 
	     Fraccion restar = f6.resta(f7); 
	     Fraccion multiplicacion = f7.multiplicacion(f6); 
	     Fraccion division = f8.division(f5);
	      
	     System.out.println(f1.toString() + " + " + f2.toString() + " = " + suma); 
	     System.out.println(f2.toString() + " - " + f4.toString() + " = " + resta); 
	     System.out.println(f3.toString() + " * " + f1.toString() + " = " + producto); 
	     System.out.println(f4.toString() + " / " + f3.toString() + " = " + cociente);   
	     
	     System.out.println();
	     
	     System.out.println(f5.getNum() + " + " + f8.getNum() + " = " + sumar.getNum()); 
	     System.out.println(f6.getNum() + " - " + f7.getNum() + " = " + restar.getNum()); 
	     System.out.println(f7.getNum() + " * " + f6.getNum() + " = " + multiplicacion.getNum()); 
	     System.out.println(f8.getNum() + " / " + f5.getNum() + " = " + division.getNum());
	} 
  
} 