import java.util.Scanner; 
  
public class Main {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in); 
		 
		/*Contador contador1 = new Contador(); 
		int n;
		
        System.out.println("Introduce valor para inicializar el contador: ");                                     
        n = scan.nextInt();
       
        //asignar un valor al contador
        contador1.setCont(n);
        //incrementar el contador
        contador1.incrementar();
        //mostrar el valor actual
        System.out.println(contador1.getCont());
       
        contador1.incrementar();
        contador1.incrementar();
       
        //mostrar el valor actual
        System.out.println(contador1.getCont());
       
        //restar 1 al valor del contador
        contador1.decrementar();
       
        //mostrar el valor actual
        System.out.println(contador1.getCont());

        //crear un nuevo objeto Contador con valor inicial 10
        Contador contador2 = new Contador(10);
       
        //incrementar y decrementar el contador2 y mostrar su valor                                               
        contador2.incrementar();
        System.out.println(contador2.getCont());
        contador2.decrementar();
        System.out.println(contador2.getCont());*/
        
		Contador contador1 = new Contador(); 
		contador1.setCont(10);
		
		Contador contador2 = new Contador(5); 
		
		while(contador1.getCont() != contador2.getCont()) {
			contador2.incrementar();
		}
		contador1.setCont(-5);
		
		do {
			contador2.decrementar();
		} while(contador1.getCont() != contador2.getCont());
		
        scan.close();
		 
		} 
} 