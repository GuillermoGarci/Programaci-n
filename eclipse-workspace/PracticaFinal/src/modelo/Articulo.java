package modelo;

public class Articulo {
	private int stock;
	private double precio;
	
	public Articulo(int stock, double precio) {
		super();
		this.stock = stock;
		this.precio = precio;
	}
	
	public Articulo() {
		super();
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		//return "Artículo:\n Stock: " + getStock() + "\nPrecio: " + getPrecio();
		return "\n Stock: " + getStock() + "\nPrecio: " + getPrecio();
	}
}