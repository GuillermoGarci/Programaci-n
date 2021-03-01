public class NoPerecedero extends Producto{
	private String tipo;

	public NoPerecedero(String nombre, double precio){
		super(nombre, precio);
		this.tipo = "Estandar";
	}
	
	public NoPerecedero(String nombre, double precio, String tipo){
		super(nombre, precio);
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double calcular(int productos) {
		return super.calcular(productos);
	}
	
	public String toString() {
		return super.toString() + "\nTipo: " + getTipo();
	}
}