package modelo;

public class Vendedor {
	private String dni, nombre, apellidos;
	private int telefono;
	private double sueldoBase, comision;
	
	public Vendedor(String dni, String nombre, String apellidos, int telefono, double sueldoBase, double comision) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.sueldoBase = sueldoBase;
		this.comision = comision;
	}
	
	public Vendedor() {
		super();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	@Override
	public String toString() {
		return "Vendedor:\n DNI: " + getDni() + "\nNombre: " + getNombre() + "\nApellidos: " + getApellidos() + "\nTelefono: " + getTelefono() + "\nSueldo Base: " + getSueldoBase() + "\nComision: " + getComision();
	}

	public String toStringSimple() {
		return "Vendedor:\n DNI: " + getDni() + "\nNombre: " + getNombre() + "\nApellidos: " + getApellidos();
	}
}