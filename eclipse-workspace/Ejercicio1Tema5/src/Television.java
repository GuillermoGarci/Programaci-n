public class Television extends Electrodomestico{
	private float pulgada;
	private boolean sintonizadorTdt;
	
	public Television() {
		this.pulgada = 20;
		this.sintonizadorTdt = false;
	}
	
	public Television(float precioBase, float peso) {
		super(precioBase, peso);
	}
	
	public Television(float pulgada, boolean sintonizadorTdt) {
		super();
		this.pulgada = pulgada;
		this.sintonizadorTdt = sintonizadorTdt;
	}

	public float getPulgada() {
		return pulgada;
	}

	public boolean getSintonizadorTdt() {
		return sintonizadorTdt;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if(getPulgada() > 40) {
			setPrecioBase((getPrecioBase()/100)*30);
		}
		
		if(getSintonizadorTdt() == true) {
			setPrecioBase(getPrecioBase() + 50);
		}
	}
}
