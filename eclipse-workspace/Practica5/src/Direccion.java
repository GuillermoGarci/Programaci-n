public class Direccion {
	private String direccion;
	private String tipoVia;
	private String nombre;
	private int numero;
	private int cp;
	
	public Direccion() {
		
	}
	
	public Direccion(String tipoVia, String nombre, int numero, int cp) {
		this.tipoVia = tipoVia;
		this.nombre = nombre;
		this.numero = numero;
		this.cp = cp;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	
	public String direccionCompleta(String tipoVia, String nombre, int numero, int cp) {
		return this.direccion = tipoVia + " " + nombre + " " + numero + " " + cp;
	}
	
	public String toString() {
		return direccionCompleta(tipoVia, nombre, numero, cp);
	}
}