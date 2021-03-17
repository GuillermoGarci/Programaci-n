public class Casa extends Inmueble implements Impuestos {
	private boolean jardin;
	private boolean garaje;

	public Casa() {

	}

	public Casa(float precio, float metrosCuadrados, String tipoVia, String nombre, int numero, int cp,
			int numHabitaciones, boolean jardin, boolean garaje, boolean alquilado) {
		super(precio, metrosCuadrados, tipoVia, nombre, numero, cp, numHabitaciones, alquilado);
		this.jardin = jardin;
		this.garaje = garaje;
		sumaImpuesto();
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	public boolean isGaraje() {
		return garaje;
	}

	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}

	//Este método será llamado en el toString para mostrar si la casa tiene o no jardin
	public String jardin() {
		String texto = "No";

		if (isJardin() == true) {
			texto = "Si";
		}

		return texto;
	}

	//Este método será llamado en el toString para mostrar si la casa tiene o no garaje
	public String garaje() {
		String texto = "No";

		if (isGaraje() == true) {
			texto = "Si";
		}

		return texto;
	}

	//Este método será llamado en el toString para mostrar el precio con los impuestos
	@Override
	public float sumaImpuesto() {
		float precioFinal;
		if (isAlquilado() == false) {
			precioFinal = getPrecio() + getPrecio() * IVA / 100;
		}
		precioFinal = getPrecio() + getPrecio() * ITP / 100;
		return precioFinal;
	}

	//Este toString muestra todos los datos de la casa
	@Override
	public String toString() {
		return "Casa en " + alquilados() + " : " + getId() + "(ID)" + "\nPrecio: " + getPrecio() + "\nPrecio final: "
				+ sumaImpuesto() + super.toString() + "\nJardin: " + jardin() + "\nGaraje: " + garaje();
	}
}