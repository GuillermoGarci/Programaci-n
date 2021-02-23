public class Videojuego implements Entregable{
	//titulo, horas estimadas, entregado, género y compañia.
	private String titulo;
	private float horas_estimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public Videojuego() {
		this.horas_estimadas = 3;
		this.entregado = false;
	}
	
	public Videojuego(String titulo, float horas_estimadas) {
		this.entregado = false;
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
	}
	
	public Videojuego(String titulo, float horas_estimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.entregado = false;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getHoras_estimadas() {
		return horas_estimadas;
	}

	public void setHoras_estimadas(float horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	@Override
	public String toString() {
		
		return "";
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public void compareTo(Object a) {
		if(getHoras_estimadas() > ((Videojuego) a).getHoras_estimadas()) {
			
		} else if(getHoras_estimadas() < ((Videojuego) a).getHoras_estimadas()) {
			
		} else {
			
		}
	}
}