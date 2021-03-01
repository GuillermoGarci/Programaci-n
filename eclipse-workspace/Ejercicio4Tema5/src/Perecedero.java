public class Perecedero extends Producto{
	private int diasCaducar;

	public Perecedero(String nombre, double precio){
		super(nombre, precio);
	}
	
	public Perecedero(String nombre, double precio, int diasCaducar){
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}
	
	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}
	
	public double calcular(int productos) {
		setPrecio(getPrecio() * productos);
		
		switch (getDiasCaducar()) {
		case 1:
			setPrecio(getPrecio()/4);
			break;
		case 2:
			setPrecio(getPrecio()/3);
			break;
		case 3:
			setPrecio(getPrecio()/2);
			break;
		default:
			break;
		}
		return getPrecio();
	}
	
	public String toString() {
		return super.toString() + "\nDias a caducar: " + getDiasCaducar();
	}
}