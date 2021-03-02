public class Repartidor extends Empleado{
	private String zona;

	public Repartidor(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.zona = "zona 0";
	}
	
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}
	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	@Override
	public void plus(){
		if(getEdad() < 25 && getZona().contains("zona 3")) {
			setSalario(getSalario() + getPLUS());
		}
	}

	@Override
	public String toString() {
		return "Repartidor\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nSalario: " + getSalario() + "\nZona: " + getZona();
	}
}