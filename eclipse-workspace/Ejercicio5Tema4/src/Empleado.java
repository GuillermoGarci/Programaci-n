public class Empleado {
    private String nif;
    private String nombre;
    private double salariobase;
    private double IRPF;
    private int horasextra;
    private boolean casado;
    private int numerohijos;
    private static double pagohorasextra;
   
    public Empleado() {
   
    }
    public Empleado(String nif) {
        this.nif=nif;
    }
    
    
    public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalariobase() {
		return salariobase;
	}
	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}
	public double getIRPF() {
		return IRPF;
	}
	public void setIRPF(double iRPF) {
		IRPF = iRPF;
	}
	public int getHorasextra() {
		return horasextra;
	}
	public void setHorasextra(int horasextra) {
		this.horasextra = horasextra;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public int getNumerohijos() {
		return numerohijos;
	}
	public void setNumerohijos(int numerohijos) {
		this.numerohijos = numerohijos;
	}
	public static double getPagohorasextra() {
		return pagohorasextra;
	}
	public static void setPagohorasextra(double pagohorasextra) {
		Empleado.pagohorasextra = pagohorasextra;
	}
	public double retencionIRPF() {
        double x=IRPF;
        if(isCasado()) {
            x=x-2;
        }
        x=x-numerohijos;
   
    return sueldoneto()*x/100;
    }
    public double sueldoneto() {
        return sueldoneto()-retencionIRPF();
    }
    public String toString() {
    	return nif+ "\n" + nombre+ "\n" + salariobase+ "\n" + IRPF+ "\n" + horasextra+ "\n" + casado+"\n" + numerohijos;
    }
}