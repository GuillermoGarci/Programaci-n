public class Serie implements Entregable{
	//titulo, numero de temporadas, entregado, género y creador.
	private String titulo;
	private int num_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo = "Desconocido";
		this.num_temporadas = 3;
		this.entregado = false;
		this.genero = "Desconocido";
		this.creador = "Desconocida";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.num_temporadas = 3;
		this.entregado = false;
		this.genero = "Desconocido";
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
		if(getNum_temporadas() > ((Serie) a).getNum_temporadas()) {
			return true;
		} else{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Serie:\n" + "Título: " + getTitulo() + "\nNumero de temporadas: " + getNum_temporadas() + "\nEntregado: " + entrega() + "\nGenero: " + getGenero() + "\nCreador: " + getCreador() + "\n";
	}
}