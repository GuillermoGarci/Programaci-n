public class Piso extends Inmueble implements Impuestos {
	private int numeroPiso;
	private char letraPiso;
	private boolean estudio;

	public Piso() {
		sumaImpuesto();
	}
	
	public Piso(float precio, float metrosCuadrados, String tipoVia, String nombre, int numero, int cp,
			int numHabitaciones, int numeroPiso, char letraPiso, boolean estudio, boolean alquilado) {
		super(precio, metrosCuadrados, tipoVia, nombre, numero, cp, numHabitaciones, alquilado);
		this.numeroPiso = numeroPiso;
		this.letraPiso = letraPiso;

		if (estudio == true) {
			setNumHabitaciones(1);
		}
		
		sumaImpuesto();
	}

	public int getNumeroPiso() {
		return numeroPiso;
	}

	public void setNumeroPiso(int numeroPiso) {
		this.numeroPiso = numeroPiso;
	}

	public char getLetraPiso() {
		return letraPiso;
	}

	public void setLetraPiso(char letraPiso) {
		this.letraPiso = letraPiso;
	}

	public boolean isEstudio() {
		return estudio;
	}

	public void setEstudio(boolean estudio) {
		this.estudio = estudio;
	}

	public String estudio() {
		String texto = "No";

		if (isEstudio() == true) {
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
		return "Piso en " + alquilados() + " : " + getId() + "(ID)" + "\nPrecio: " + getPrecio() + "\nPrecio final: " + getPrecioFinal() + super.toString() + "\nNumero del piso es: " + getNumeroPiso()
				+ "\nLetra del piso es: " + getLetraPiso() + "\nEstudio: " + estudio();
	}
}