public class Comercial extends Empleado{
	private double comision;
	
	public Comercial(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
	}
	
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	@Override
	public void plus(){
		if(getEdad() > 30 && getComision() > 200) {
			setSalario(getSalario() + getPLUS());
		}
	}
	
	@Override
	public String toString() {
		return "Comercial\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nSalario: " + getSalario() + "\nComisión: " + getComision();
	}
}