package modelo;

public class Cliente {
	private String nombre, apellidos, email;
	private Direccion d;
	private double puntos;
	
	public Cliente(String nombre, String apellidos, String email, Direccion d, double puntos, double comision) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.d = d;
		this.puntos = puntos;
	}
	
	public Cliente() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Direccion getD() {
		return d;
	}

	public void setD(Direccion d) {
		this.d = d;
	}

	public double getPuntos() {
		return puntos;
	}

	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Cliente:\n Nombre: " + getNombre() + "\nApellidos: " + getApellidos() + "\nEmail: " + getEmail() + "\nPuntos: " + getPuntos();
	}

	public String toStringSimple() {
		return "Cliente:\n Nombre: " + getNombre() + "\nApellidos: " + getApellidos();
	}
}