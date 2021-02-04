import java.util.Scanner;
 
public class Main {
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int d, m, a;
            System.out.println("Introduce una fecha: ");
            System.out.print("Introduce un dia: ");
            d = sc.nextInt();
            System.out.print("Introduce un mes: ");
            m = sc.nextInt();
            System.out.print("Introduce un año: ");
            a = sc.nextInt();
            Fecha fecha = new Fecha(d,m,a);
            if (fecha.fechacorrecta()) { 
                System.out.println("La fecha introducida es: " + fecha);
                System.out.println("Los 10 días siguientes son:");
                for (int i = 1; i <= 10; i++) {
                    fecha.diaSiguiente();
                    System.out.println(fecha);
                }
            } else { 
                System.out.println("La fecha no valida");
            }
            sc.close();
        }
}