public class Main {
	public static void main(String[] args) {
		Comercial[] comerciales = new Comercial[3];
		
		comerciales[0] = new Comercial("María Antonieta", 56, 1200);
		comerciales[1] = new Comercial("Manuel Gutierrez", 23, 950, 199);
		comerciales[2] = new Comercial("Hugo Rodriguez", 39, 2100, 201);
		
		Repartidor[] repartidores = new Repartidor[3];
		
		repartidores[0] = new Repartidor("Juan Luis", 34, 999.9);
		repartidores[1] = new Repartidor("Marcos Pondal", 19, 1150, "zona 3");
		repartidores[2] = new Repartidor("Patricio Estrella", 47, 1355, "zona 3");
		
		for (Comercial comercial : comerciales) {
			comercial.plus();
			System.out.println(comercial.toString() + "\n");
		}
		
		for (Repartidor repartidor : repartidores) {
			repartidor.plus();
			System.out.println(repartidor.toString() + "\n");
		}
	}
}