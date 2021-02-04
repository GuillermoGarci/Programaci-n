public class Pelicula {
	private String titulo;
	private float duracion;
	private int edad_minima;
	private String director;
	
	public Pelicula(String titulo, float duracion, int edad_minima, String director) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad_minima = edad_minima;
		this.director = director;
	}
	
	public Pelicula() {
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	public int getEdad_minima() {
		return edad_minima;
	}
	public void setEdad_minima(int edad_minima) {
		this.edad_minima = edad_minima;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
}
