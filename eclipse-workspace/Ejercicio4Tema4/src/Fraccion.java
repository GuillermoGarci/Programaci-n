public class Fraccion { 
     private int num; 
     private int den;  
      
     public Fraccion() { 
	   
     } 
     
     public Fraccion(int num) { 
    	 this.num = num; 
     }
   
     public Fraccion(int num, int den) { 
    	 this.num = num;  
	   
    	 if(den != 0) {  
    		 this.den = den;  
     		} else {  
     			this.den = 1;  
     		}  
     		 
    	 //simplificar(getNum(), getDen()); 
     } 
     
     public int getNum() { 
		return this.num; 
    } 
     
    public int getDen() { 
		return this.den; 
    } 
    
    public void setNum(int num) { 
	   this.num = num;  
    } 
     
    public void setDen(int den) { 
	   this.den = den;  
    } 
     
     public Fraccion suma(Fraccion frac1, Fraccion frac2){ 
    	 Fraccion frac3 = new Fraccion(); 
      
    	 frac3.num = frac1.num * frac2.den + frac2.num * frac1.den; 
    	 frac3.den = frac1.den * frac2.den; 
    	  
    	 frac3.simplificar(frac3.num, frac3.den);  
    	  
    	 return frac3; 
     } 
     public Fraccion resta(Fraccion frac1, Fraccion frac2){ 
    	 Fraccion frac3 = new Fraccion(); 
      
    	 frac3.num = frac1.num * frac2.den - frac2.num * frac1.den; 
    	 frac3.den = frac1.den * frac2.den; 
    	  
    	 frac3.simplificar(frac3.num, frac3.den);  
      
    	 return frac3; 
     } 
   
     public Fraccion multiplicacion(Fraccion frac1, Fraccion frac2){ 
    	 Fraccion frac3 = new Fraccion(); 
          
    	 frac3.num = frac1.num * frac2.num; 
    	 frac3.den = frac1.den * frac2.den; 
    	  
    	 frac3.simplificar(frac3.num, frac3.den);  
      
    	 return frac3; 
     } 
   
     public Fraccion division(Fraccion frac1, Fraccion frac2){ 
    	 Fraccion frac3 = new Fraccion(); 
          
    	 frac3.num = frac1.num * frac2.den; 
    	 frac3.den = frac1.den * frac2.num; 
    	  
    	 frac3.simplificar(frac3.num, frac3.den);  
    	  
    	 return frac3; 
     } 
     
     public Fraccion suma(int n){ 
    	 Fraccion frac3 = new Fraccion(n, 1); 
    	  
    	 return suma(frac3); 
     } 
     
     public Fraccion resta(int n){  
    	 return suma(n*-1); 
     } 
     
     public Fraccion multiplicacion(int n){ 
    	 Fraccion frac3 = new Fraccion(n, 1); 
    	  
    	 return multiplicacion(frac3); 
     } 
     
     public Fraccion division(int n){ 
    	 Fraccion frac3 = new Fraccion(n, 1); 
    	  
    	 return division(frac3); 
     } 
     
     public Fraccion suma(Fraccion frac1){ 
    	 Fraccion frac3 = new Fraccion(); 
    	 
    	 frac3.num = this.num + frac1.num; 
    	  
    	 return frac3; 
     } 
     public Fraccion resta(Fraccion frac1){ 
    	 Fraccion frac3 = new Fraccion(); 
    	 
    	 frac3.num = this.num - frac1.num; 
      
    	 return frac3; 
     } 
   
     public Fraccion multiplicacion(Fraccion frac1){ 
    	 Fraccion frac3 = new Fraccion(); 
         
    	 frac3.num = this.num * frac1.num;
      
    	 return frac3; 
     } 
   
     public Fraccion division(Fraccion frac1){ 
    	 Fraccion frac3 = new Fraccion(); 
         
    	 frac3.num = this.num / frac1.num;
    	  
    	 return frac3; 
     } 
   
     public int mcd(int x, int y){ 
    	 int mcd = 0;  
    	  
    		 while (x != 0) { 
        		 mcd = x; 
        		 x = y % x; 
        	 }   
       
    	 return mcd;  
     } 
      
     public void simplificar(int x, int y){ 
    	 num = num / mcd(x, y); 
    	 den = den / mcd(x, y); 
     } 
   
     public String toString(){ 
    	 String texto = getNum() + "/" + getDen(); 
    	 return texto; 
     } 
} 