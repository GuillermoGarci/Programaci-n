public class Asiento {
	private int fila;
	private char column;
	private boolean ocupado;
	private Espectador espectador;
	
	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Asiento(int fila, char column, boolean ocupado) {
		super();
		this.fila = fila;
		this.column = column;
		this.ocupado = ocupado;
		this.espectador = null;
	}
	
	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

	@Override
	public String toString() {
		return "Asiento [fila=" + fila + ", column=" + column;
	}
	
}