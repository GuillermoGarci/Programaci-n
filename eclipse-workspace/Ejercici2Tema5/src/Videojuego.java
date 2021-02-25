public class Videojuego implements Entregable{
	//titulo, horas estimadas, entregado, g�nero y compa�ia.
	private String titulo;
	private float horas_estimadas;
	private boolean entregado;
	private String genero;
	private String compa�ia;
	
	public Videojuego() {
		this.titulo = "Desconocido";
		this.horas_estimadas = 3;
		this.entregado = false;
		this.genero = "Desconocido";
		this.compa�ia = "Desconocida";
	}
	
	public Videojuego(String titulo, float horas_estimadas) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.entregado = false;
		this.genero = "Desconocido";
		this.compa�ia = "Desconocida";
	}
	
	public Videojuego(String titulo, float horas_estimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.entregado = false;
		this.genero = genero;
		this.compa�ia = compa�ia;
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	public String entrega() {
		String texto;
		
		if(this.entregado == true) {
			texto = "Si";
		} else {
			texto = "No";
		}
		
		return texto;
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
	public boolean compareTo(Object a) {
		if(getHoras_estimadas() > ((Videojuego) a).getHoras_estimadas()) {
			return true;
		} else {
			return false;
		}
	}
	
	//titulo, horas estimadas, entregado, g�nero y compa�ia.
	@Override
	public String toString() {
		return "Videojuego:\n" + "T�tulo: " + getTitulo() + "\nHoras estimadas: " + getHoras_estimadas() + "\nEntregado: " + entrega() + "\nGenero: " + getGenero() + "\nCompa��a: " + getCompa�ia() + "\n";
	}
}