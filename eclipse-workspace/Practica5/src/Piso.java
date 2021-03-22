public class Piso extends Inmueble implements Impuestos {
	private int numeroPiso;
	private char letraPuerta;
	private boolean estudio;

	public Piso() {
		this.estudio = false;
	}

	public Piso(float precio, float metrosCuadrados, String tipoVia, String nombre, int numero, int cp,
			int numHabitaciones, int numeroPiso, char letraPiso, boolean estudio, boolean alquilado) {
		super(precio, metrosCuadrados, tipoVia, nombre, numero, cp, numHabitaciones, alquilado);
		this.numeroPiso = numeroPiso;
		this.letraPuerta = letraPiso;
		this.estudio = estudio;
		
		if (estudio == true) {
			setNumHabitaciones(1);
		}
	}

	public int getNumeroPiso() {
		return numeroPiso;
	}

	public void setNumeroPiso(int numeroPiso) {
		this.numeroPiso = numeroPiso;
	}

	public char getLetraPuerta() {
		return letraPuerta;
	}

	public void setLetraPuerta(char letraPuerta) {
		this.letraPuerta = letraPuerta;
	}

	public boolean isEstudio() {
		return estudio;
	}

	public void setEstudio(boolean estudio) {
		this.estudio = estudio;
	}

	//Este método será llamado en el toString para mostrar si el piso es o no un estudio
	public String estudio() {
		String texto = "No";

		if (isEstudio() == true) {
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

	//Este toString muestra todos los datos del piso
	@Override
	public String toString() {
		return "Piso en " + alquilados() + " : " + getId() + "(ID)" + "\nPrecio: " + getPrecio() + "\nPrecio final: "
				+ sumaImpuesto() + super.toString() + "\nNumero del piso es: " + getNumeroPiso()
				+ "\nLetra de la puerta es: " + getLetraPuerta() + "\nEstudio: " + estudio();
	}
}