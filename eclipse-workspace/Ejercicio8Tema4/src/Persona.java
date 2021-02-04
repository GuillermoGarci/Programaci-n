import java.util.*;
public class Persona {
	private String nombre;
	private String direccion;
	private int codigo_postal;
	private String ciudad;
	private int dia;
	private int mes;
	private int a�o;
	private Fecha fechaNacimiento;
	//private Fecha fechaNacimiento = new Fecha(dia, mes, a�o);
	public Persona() {
		
	}
	
	public Persona(String nombre, Fecha fechaNacimiento, String direccion, int codigo_postal, String ciudad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigo_postal = codigo_postal;
		this.ciudad = ciudad;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Fecha getfechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		
		//new Fecha (dia, mes, a�o);
		//this.dia = dia;
		//this.mes = mes;
		//this.a�o = a�o;
	}
	
	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public boolean esMayorDeEdad() {
		Calendar fecha = new GregorianCalendar();
		
		int a�oActual = fecha.get(Calendar.YEAR);
        int mesActual = fecha.get(Calendar.MONTH);
        int diaActual = fecha.get(Calendar.DAY_OF_MONTH);
        boolean toret = true;
        
        
        if (a�oActual - fechaNacimiento.getA�o() > 18) {
            return true;
        } else if (a�oActual - fechaNacimiento.getA�o() == 18 &&
                      mesActual > fechaNacimiento.getMes()) {
            return true;
        } else if (a�oActual - fechaNacimiento.getA�o() == 18 &&
                     mesActual == fechaNacimiento.getMes() &&
                     diaActual >= fechaNacimiento.getDia()) {
            return true;
        }
        return false;
        
		//return toret;
	}
		
	
	public String toString() {
		return "\nNombre: " + nombre + "\nFecha de nacimiento: "+ fechaNacimiento.toString() +"\nDirecci�n: " + getDireccion() + " " + getCodigo_postal() + " " + getCiudad();
	}
}