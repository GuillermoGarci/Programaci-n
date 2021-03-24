public abstract class Inmueble implements Impuestos{
	private float precio;
	private float metrosCuadrados;
	private int id;
	private static int idActual = 1;
	private Direccion d = new Direccion();
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
		this.d.setTipoVia(tipoVia);
		this.d.setNombre(nombre);
		this.d.setNumero(numero);
		this.d.setCp(cp);
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
	
	public Direccion getD() {
		return d;
	}

	public void setD(Direccion d) {
		this.d = d;
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

		if (isAlquilado() == true) {
			texto = "Alquiler";
		}

		return texto;
	}
	
	//Este método será llamado en el toString para mostrar el precio con los impuestos
		@Override
		public float sumaImpuesto() {
			float precioFinal;
			
			if (isAlquilado() == false) {
				precioFinal = (getPrecio() + getPrecio() * IVA / 100) + (getPrecio() + getPrecio() * ITP / 100);
			} else {
				precioFinal = getPrecio() + getPrecio() * ITP / 100;
			}
			
			return precioFinal;
		}

	/*Este método muestra algunos datos que tienen los pisos y las casas en común, será llamado en las clases Piso y 
	Casa en sus repectivos toString*/
	@Override
	public String toString() {
		return "\nPrecio: " + getPrecio() + "\nPrecio final: " + sumaImpuesto() + "\nLos metros cuadrados: " + getMetrosCuadrados() + "\nLa dirección es: " + this.d.toString()
				+ "\nEl número de habitaciones es: " + getNumHabitaciones();
	}
}