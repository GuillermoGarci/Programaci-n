public class Casa extends Inmueble {
	private boolean jardin;
	private boolean garaje;

	public Casa() {

	}

	public Casa(float precio, float metrosCuadrados, String tipoVia, String nombre, int numero, int cp,
			int numHabitaciones, boolean jardin, boolean garaje, boolean alquilado) {
		super(precio, metrosCuadrados, tipoVia, nombre, numero, cp, numHabitaciones, alquilado);
		this.jardin = jardin;
		this.garaje = garaje;
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

	//Este toString muestra todos los datos de la casa
	@Override
	public String toString() {
		return "Casa en " + alquilados() + " : " + getId() + "(ID)" + super.toString() + "\nJardin: " + jardin() + "\nGaraje: " + garaje();
	}
}