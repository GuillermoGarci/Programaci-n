package modelo;

public class Venta {
	private String fecha;
	private double precioTotal;//, puntosAcualizados;
	private Cliente c;
	private Vendedor d;
	private Articulo a;
	
	public Venta(String fecha, double precioTotal, Cliente c, Vendedor d, Articulo a) {
		super();
		this.fecha = fecha;
		this.precioTotal = precioTotal;
		this.c = c;
		this.d = d;
		this.a = a;
	}
	
	public Venta() {
		super();
	}

	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public Cliente getC() {
		return c;
	}
	
	public void setC(Cliente c) {
		this.c = c;
	}
	
	public Vendedor getD() {
		return d;
	}
	
	public void setD(Vendedor d) {
		this.d = d;
	}
	
	public Articulo getA() {
		return a;
	}
	
	public void setA(Articulo a) {
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "Venta: ";
	}
}