public class PisoVenta {
	private float precio;
	private float metrosCuadrados;
	private int id;
	private String direccion;
	
	public PisoVenta() {
		
	}
	
	public PisoVenta(float precio, float metrosCuadrados, String direccion, int id) {
		this.precio = precio;
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.id = id;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(float metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
		return "El piso en venta: " + getId() + "(ID)" + "\nPrecio: " + getPrecio() + "\nLos metros cuadrados: " + getMetrosCuadrados() + "\nLa dirección es: " + getDireccion();
	}
}