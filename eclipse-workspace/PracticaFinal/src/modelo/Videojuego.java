package modelo;

public class Videojuego extends Articulo{
	private String titulo, genero, consola, publisher;
	private double duracion;
	
	public Videojuego(String titulo, String genero, String consola, String publisher, double duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.consola = consola;
		this.publisher = publisher;
		this.duracion = duracion;
	}
	
	public Videojuego() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		return "Videojuego: " + super.toString() + "\nTitulo: " + getTitulo() + "\nGenero: " + getGenero() + "\nConsola: " + getConsola() + "\nPublisher: " + getPublisher() + "\nDuracion: " + getDuracion();
	}
}