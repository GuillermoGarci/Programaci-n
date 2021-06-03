package modelo;

public class Consola extends Articulo{
	private String compañia, modelo, color;
	
	public Consola(String compañia, String modelo, String color) {
		super();
		this.compañia = compañia;
		this.modelo = modelo;
		this.color = color;
	}
	
	public Consola() {
		super();
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Consola: " + super.toString() + "\nCompañia: " + getCompañia() + "\nModelo: " + getModelo() + "\nColor: " + getColor();
	}
}