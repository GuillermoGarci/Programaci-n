public class Contador { 
	private int cont; 
	 
	public Contador(int cont) { 
		this.cont = cont; 
	} 
	 
	public Contador() { 
		if(cont < 0) { 
			this.cont = 0; 
		} else {
			this.cont = cont;
		}
	} 
	 
	public int getCont() { 
		return this.cont; 
	} 
	 
	public void setCont(int cont) { 
		if(cont < 0) { 
			this.cont = 0; 
		} else {
			this.cont = cont;
		}
	} 
	 
	public void incrementar(){ 
		setCont(getCont() + 1);
	 
	} 
	 
	public void decrementar(){
		setCont(getCont() - 1);
	} 
} 