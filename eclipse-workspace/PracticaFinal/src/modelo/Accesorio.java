package modelo;

public class Accesorio extends Articulo{
	private String consola, tipo;
	
	public Accesorio(String consola, String tipo) {
		super();
		this.consola = consola;
		this.tipo = tipo;
	}
	
	public Accesorio() {
		super();
	}
	
	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		//return "Artículo:\n Stock: " + getStock() + "\nPrecio: " + getPrecio();
		//return "\n Stock: " + getStock() + "\nPrecio: " + getPrecio();
		return "Accesorio: " + super.toString() + "\nConsola: " + getConsola() + "\nTipo: " + getTipo();
	}
}