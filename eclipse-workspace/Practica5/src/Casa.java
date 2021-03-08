public class Casa extends Inmueble implements Impuestos {
	private boolean jardin;
	private boolean garaje;

	public Casa() {
		sumaImpuesto();
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

	public String jardin() {
		String texto = "No";

		if (isJardin()) {
			texto = "Si";
		}

		return texto;
	}

	public String garaje() {
		String texto = "No";

		if (isGaraje()) {
			texto = "Si";
		}

		return texto;
	}

	@Override
	public void sumaImpuesto() {
		if (isAlquilado() == false) {
			setPrecioFinal(getPrecio() + getPrecio() * IVA / 100);
		} 
		
		setPrecioFinal(getPrecio() + getPrecio() * ITP / 100);
	}

	@Override
	public String toString() {
		return "Casa en " + alquilados() + " : " + getId() + "(ID)" + "\nPrecio: " + getPrecio() + "\nPrecio final: " + getPrecioFinal() + super.toString() + "\nJardin: " + jardin() + "\nGaraje: " + garaje();
	}
}