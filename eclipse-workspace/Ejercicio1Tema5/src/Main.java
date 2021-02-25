import java.util.ArrayList;
/*Ahora crea una clase ejecutable que realice lo siguiente:
 * ●Crea un array de Electrodomesticos de 10 posiciones.
 * ●Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
 * ●Ahora, recorre este array y ejecuta el método precioFinal().
 * ●Deberás  mostrar  el  precio  de  cada  clase,  es  decir,  el  precio  de  todas  las  televisiones  por  un  lado,  
 * el  de  las lavadoras por otro y la suma de los Electrodomésticos (puedes crear objetos Electrodomestico, pero 
 * recuerda que Television y Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.
 * Por  ejemplo,  si  tenemos  un  Electrodomestico  con  un  precio  final  de  300,  una  lavadora  de  200  
 * y  una  televisión  de  500,  el resultado final será de 1000 (300+200+500) para electrodomésticos, 200 para lavadora 
 * y 500 para televisión.*/
public class Main {
	public static void main(String[] args) {
		//ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>(10);
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		electrodomesticos[0] = new Lavadora();
		electrodomesticos[1] = new Television(29, true);
		electrodomesticos[2] = new Television();
		electrodomesticos[3] = new Electrodomestico((float)1555.8, 20);
		electrodomesticos[4] = new Lavadora(800, 30);
		electrodomesticos[5] = new Television(699, 55);
		electrodomesticos[6] = new Lavadora(2900, 81);
		electrodomesticos[7] = new Electrodomestico();
		electrodomesticos[8] = new Electrodomestico(567, "rojo", 'a', 78);
		electrodomesticos[9] = new Lavadora(45);
		//electrodomesticos[10] = new Television(67, false);
		
		int precioT = 0, precioE = 0, precioL = 0;
		
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if(electrodomestico instanceof Television) {
				electrodomestico.precioFinal();
				System.out.println("Precio televisor: " + electrodomestico.getPrecioBase());
				precioT += electrodomestico.getPrecioBase();
			} else if(electrodomestico instanceof Lavadora){
				electrodomestico.precioFinal();
				System.out.println("Precio lavadora: "  + electrodomestico.getPrecioBase());
				precioL += electrodomestico.getPrecioBase();
			} else {
				electrodomestico.precioFinal();
				System.out.println("Precio electrodomestico: "  + electrodomestico.getPrecioBase());
				precioE += electrodomestico.getPrecioBase();
			}
		}
		
		System.out.println("\nTelevisores\nEl precio total de los televisores es de: " + precioT);
		System.out.println("\nLavadoras\nEl precio total de las lavadoras es de: " + precioL);
		System.out.println("\nElectrodomesticos\nEl precio total de los electrodomestricos es de: " + (precioT + precioL + precioE));
	}
}
