import java.util.ArrayList;

public class Almacen {
	private static ArrayList<Agua> aguamineral = new ArrayList<Agua>();
	private static ArrayList<Azucarada> bebidaazucarada = new ArrayList<Azucarada>();
	
	public void precioTotalBebidas() {
		
	}
	
	public void precioTotalMarca() {
		
	}
	
	public void precioTotalEstanteria() {
		
	}
	
	public void añadirProducto() {
		
	}
	
	public void eliminarProducto() {
		
	}
	
	public static void main(String[] args) {
		Agua agua1 = new Agua(1,1.5,2.4,"Bezolla");
		Agua agua2 = new Agua(1,1.5,2.4,"Bezolla");
		Agua agua3 = new Agua(1,1.5,2.4,"Bezolla");
		
		aguamineral.add(agua1);
		aguamineral.add(agua2);
		aguamineral.add(agua3);
		
		Azucarada azucarada1 = new Azucarada(1,1.5,2.4,"Bezolla");
		Azucarada azucarada2 = new Azucarada(1,1.5,2.4,"Bezolla");
		Azucarada azucarada3 = new Azucarada(1,1.5,2.4,"Bezolla");
		
		bebidaazucarada.add(azucarada1);
		bebidaazucarada.add(azucarada2);
		bebidaazucarada.add(azucarada3);
	}
}