public class Cuenta { 
	private String numeroCuenta;  
	private double tipoInteres;  
	private double saldo;
	private String nombre;  
 
	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {  
		this.nombre = nombre; 
		this.numeroCuenta = numeroCuenta;  
		this.tipoInteres = tipoInteres;  
		this.saldo = saldo;  
	}  
 
	public Cuenta() {  
		this.nombre = ""; 
		this.numeroCuenta = "";  
	}  
 
	public Cuenta(Cuenta cuenta) {  
		this.nombre = cuenta.getNombre(); 
		this.numeroCuenta = cuenta.getNumeroCuenta();  
		this.tipoInteres = cuenta.getTipoInteres();  
		this.saldo = cuenta.getSaldo();  
	} 

	public String getNombre() {  
		return this.nombre;  
	} 

	public String getNumeroCuenta() {  
		return this.numeroCuenta;  
	} 
 
	public double getSaldo() {  
		return this.saldo;  
	} 
 
	public double getTipoInteres() {  
		return this.tipoInteres;  
	} 
 
	public void setNombre(String nombre) {  
		this.nombre = nombre; 
	} 

	public void setNumeroCuenta(String numCuenta) {  
		this.numeroCuenta = numeroCuenta; 
	} 

	public void setTipoInteres(double tipoInteres) {  
		this.tipoInteres = tipoInteres; 
	} 
 
	public void setSaldo(double saldo) {  
		this.saldo = saldo; 
	} 
 
	/*public boolean ingreso(double ingreso) { 
		if(ingreso >= 0) { 
			saldo += ingreso; 
			return true; 
		} else { 
			return false; 
		} 
	} */
	
	 public boolean ingreso(double ingreso) { 
		if(ingreso <= 0) { 
			System.out.println("La cantidad debe ser positiva ");               
			saldo += ingreso; 
			return false; 
		} else { 
			setSaldo(getSaldo() + 1);
			return true; 
		} 
	} 
	 
	 public boolean reintegro(double ingreso) { 
			if(ingreso <= 0) { 
				System.out.println("La cantidad debe ser positiva ");               
				saldo += ingreso; 
				return false; 
			} else { 
				if(getSaldo() >= 0) {
					setSaldo(getSaldo() - 1);
					return true; 
				} else {
					System.out.println("No hay suficiente saldo ");
					return false;
				}
			} 
		} 
	 
 
	/*public boolean reintegro(double x) { 
 
		if(x > 0) { 
			if(saldo >= x) { 
				saldo -= x; 
				return true; 
			} else { 
				return false; 
			} 
		} else { 
			return false; 
		} 
	} */
	 
	 public boolean transferencia(Cuenta cuent, double ingreso) { 
		 if(ingreso <= 0) { 
				System.out.println("La cantidad debe ser positiva ");               
				saldo += ingreso; 
				return false; 
			} else { 
				if(getSaldo() >= 0) {
					//setSaldo(getSaldo() - 1);
					//cuent.setSaldo(cuent.getSaldo() + 1);
					
					reintegro(ingreso);
					
					cuent.ingreso(ingreso);
					
					return true; 
				} else {
					System.out.println("No hay suficiente saldo ");
					return false;
				}
			} 
	    } 
 
	/*public boolean transferencia(Cuenta cuent, double x) { 
        boolean toret = true; 
        if (x < 0) { 
        	toret = false; 
        } else if (saldo >= x) { 
            reintegro(x); 
            cuent.ingreso(x); 
        } else { 
        	toret = false; 
        } 
        return toret; 
    } */
 
/*public String toString() {  
return "El libro con ISBN " + getIsbn() + " creado por el autor " + getAutor() + " tiene " + getNumPags() + " páginas.";  
} */ 
}