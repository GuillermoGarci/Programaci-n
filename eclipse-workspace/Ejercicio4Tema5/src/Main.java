public class Main {
	public static void main(String[] args) {
		Producto[] productos = new Producto[10];
		
		productos[0] = new Perecedero("Vino", 23);
		productos[1] = new NoPerecedero("Pizza", 2.5, "Barbacoa");
		productos[2] = new Perecedero("Chocolate", 3.5, 67);
		productos[3] = new Perecedero("Manzanas", 2.1, 3);
		productos[4] = new NoPerecedero("Galletas", 1.25, "Chocolate");
		productos[5] = new NoPerecedero("Yogur", 0.75, "Fresa");
		productos[6] = new Perecedero("Platanos", 3.33, 2);
		productos[7] = new NoPerecedero("Ketchup", 2.25);
		productos[8] = new NoPerecedero("Zumo", 2.5);
		productos[9] = new Perecedero("Melon", 2, 1);
		
		for (Producto producto : productos) {
			if(producto instanceof NoPerecedero) {
				System.out.println(producto.toString());
				System.out.println("El precio total de vender 5 es de: " + producto.calcular(5) + "\n");
			} else if(producto instanceof Perecedero){
				System.out.println(producto.toString());
				System.out.println("El precio total de vender 5 es de: " + producto.calcular(5) + "\n");
			} else {
				System.out.println(producto.toString());
				System.out.println("El precio total de vender 5 es de: " + producto.calcular(5) + "\n");
			}
		}
		
	}
}