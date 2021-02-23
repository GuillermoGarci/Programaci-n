public class Serie implements Entregable{
	//titulo, numero de temporadas, entregado, género y creador.
	private String titulo;
	private int num_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.num_temporadas = 3;
		this.entregado = false;
	}
	
	public Serie(String titulo, String creador) {
		this.num_temporadas = 3;
		this.entregado = false;
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int num_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.num_temporadas = num_temporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNum_temporadas() {
		return num_temporadas;
	}

	public void setNum_temporadas(int num_temporadas) {
		this.num_temporadas = num_temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
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
		if(getNum_temporadas() > ((Serie) a).getNum_temporadas()) {
			
		} else if(getNum_temporadas() < ((Serie) a).getNum_temporadas()) {
			
		} else {
			
		}
	}
}