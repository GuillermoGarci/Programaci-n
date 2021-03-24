public class Direccion {
	private String tipoVia;
	private String nombre;
	private int numero;
	private int cp;
	
	public Direccion() {
		
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}
	
	public String toString() {
		return tipoVia + " " + nombre + " " + numero + " " + cp;
	}
}