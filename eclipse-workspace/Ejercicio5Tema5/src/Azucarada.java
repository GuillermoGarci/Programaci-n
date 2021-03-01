public class Azucarada extends Bebida{
	private double porcentajeAzucar;
	private boolean promocion;
	
	public Azucarada(int id, double litros, double precio, String marca) {
		super(id, litros, precio, marca);
	}
	
	public Azucarada(int id, double litros, double precio, String marca, double porcentajeAzucar, boolean promocion) {
		super(id, litros, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
		
		if(promocion == true) {
			setPrecio(getPrecio() - (getPrecio()*0.1));
		}
	}
	
	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}
	
	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}
	
	public boolean isPromocion() {
		return promocion;
	}
	
	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	public String promocionado() {
		String texto;
		
		if(this.promocion == true) {
			texto = "Si";
		} else {
			texto = "No";
		}
		
		return texto;
	}
	
	@Override
	public String toString() {
		return "Bebida azucarada\nId: " + getId() + "\nCantidad en litros: " + getLitros() + "\nPrecio: " + getPrecio() + "\nMarca: " + getMarca() + "\nPorcentaje azucar: " + getPorcentajeAzucar() + "\nPromocionado: " + promocionado() ;
	}
}