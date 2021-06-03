package modelo;

public class Consola extends Articulo{
	private String compa�ia, modelo, color;
	
	public Consola(String compa�ia, String modelo, String color) {
		super();
		this.compa�ia = compa�ia;
		this.modelo = modelo;
		this.color = color;
	}
	
	public Consola() {
		super();
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
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
		return "Consola: " + super.toString() + "\nCompa�ia: " + getCompa�ia() + "\nModelo: " + getModelo() + "\nColor: " + getColor();
	}
}