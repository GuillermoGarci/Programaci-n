public class Agua extends Bebida{
	private String origen;

	public Agua(int id, double litros, double precio, String marca) {
		super(id, litros, precio, marca);
	}
	
	public Agua(int id, double litros, double precio, String marca, String origen) {
		super(id, litros, precio, marca);
		this.origen = origen;
	}
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	@Override
	public String toString() {
		return "Bebida agua mineral\nId: " + getId() + "\nCantidad en litros: " + getLitros() + "\nPrecio: " + getPrecio() + "\nMarca: " + getMarca() + "\nOrigen: " + getOrigen();
	}
}