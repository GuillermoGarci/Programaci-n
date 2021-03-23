import java.util.ArrayList;

public abstract class Inmueble {
	private float precio;
	private float metrosCuadrados;
	private int id;
	private static int idActual = 1;
	//private static ArrayList<Direccion> direccion = new ArrayList<Direccion>();
	Direccion direccion = new Direccion();
	private int numHabitaciones;
	private boolean alquilado;

	public Inmueble() {
		this.id = idActual++;
	}

	public Inmueble(float precio, float metrosCuadrados, String tipoVia, String nombre, int numero, int cp,
			int numHabitaciones, boolean alquilado) {
		this.precio = precio;
		this.metrosCuadrados = metrosCuadrados;
		this.id = idActual++;
		//Direccion direccion = new Direccion(tipoVia, nombre, numero, cp);
		direccion.setTipoVia(tipoVia);
		direccion.direccionCompleta(tipoVia, nombre, numero, cp);
		//this.tipoVia = tipoVia;
		//this.nombre = nombre;
		//this.numero = numero;
		//this.cp = cp;
		this.numHabitaciones = numHabitaciones;
		this.alquilado = alquilado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(float metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	//Este método será llamado por las subclases en sus toString para mostrar si el piso esta en venta o en alquiler
	public String alquilados() {
		String texto = "Venta";

		if (alquilado) {
			texto = "Alquiler";
		}

		return texto;
	}

	/*Este método muestra algunos datos que tienen los pisos y las casas en común, será llamado en las clases Piso y 
	Casa en sus repectivos toString*/
	//@Override
	//public String toString() {
		//return "\nLos metros cuadrados: " + getMetrosCuadrados() + "\nLa dirección es: " + direccion.direccionCompleta()
				//+ "\nEl número de habitaciones es: " + getNumHabitaciones();
	//}
}