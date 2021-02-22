public class Lavadora extends Electrodomestico{
	private float carga;
	
	public Lavadora() {
		this.carga = getCINCO();
	}
	
	public Lavadora(float precioBase, float peso) {
		super(precioBase, peso);
	}
	
	public Lavadora(float carga) {
		super();
		this.carga = carga;
	}

	public float getCarga() {
		return carga;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if(getCarga() > 30) {
			setPrecioBase(getPrecioBase() + 50);
		}
	}
}
