/*import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
	private int dia;
	private int mes;
	private int a�o;

	public Fecha() {
	}

	public Fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public void setDia(int d) {
		dia = d;
	}

	public void setMes(int m) {
		mes = m;
	}

	public void setA�o(int a) {
		a�o = a;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getA�o() {
		return a�o;
	}

	public boolean fechacorrecta() {
		boolean diacorrecto, mescorrecto, a�ocorrecto;
		a�ocorrecto = a�o > 0;
		mescorrecto = mes >= 1 && mes <= 12;
		switch (mes) {
		case 2:
			if (esbisiesto()) {
				diacorrecto = dia >= 1 && dia <= 29;
			} else {
				diacorrecto = dia >= 1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diacorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diacorrecto = dia >= 1 && dia <= 31;
		}
		return diacorrecto && mescorrecto && a�ocorrecto;
	}

	private boolean esbisiesto() {
		return (a�o % 4 == 0 && a�o % 100 != 0 || a�o % 400 == 0);
	}

	public void diaSiguiente() {
		dia++;
		if (!fechacorrecta()) {
			dia = 1;
			mes++;
			if (!fechacorrecta()) {
				mes = 1;
				a�o++;
			}
		}
	}
	
	public boolean esMayorQue(Fecha f) {
        boolean toret = true;
		if(getA�o() >= f.a�o) {
			if(getMes() >= f.mes) {
				if(getDia() >= f.dia) {
					if(getDia() > f.dia) {
						toret = true;
					} else if(getDia() == f.dia){
						toret = false;
					}
				} else {
					toret = false;
				}
			} else {
				toret = false;
			}
		} else {
			toret = false;
		}
        
		return toret;
	}

	public String toString() {
		return getDia() + "/" + getMes() + "/"+ getA�o();
	}

}*/
public class Fecha {
    private int dia;
    private int mes;
    private int a�o;
    
    public Fecha() {
    }
 
    public Fecha(int dia, int mes, int a�o) {
        this.dia = dia;
        this.mes = mes;
        this.a�o = a�o;
    }
 
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
 
    public void setA�o(int a�o) {
        this.a�o = a�o;
    } 

    public int getDia() {
        return this.dia;
    }
 
    public int getMes() {
        return this.mes;
    }
    
    public int getA�o() {
        return this.a�o;
    }
 
    private boolean bisiesto(int a�o) {
        if (a�o == 0) {
            return false;
        } 
 
        if (a�o % 4 == 0) {
 
            if (a�o % 100 == 0) {
                if (a�o % 400 == 0) {
                    return true;
                } 
                else {
                    return false;
                } 
            } else {
                return true;
            } 
 
        } else {
            return false;
        }
 
    }
 
    // 1,3,5,7,8,10,12-31--31 di�s
    // 4,6,9,11 -----------30 dias
 
    public boolean correcto() {
 
        if ((getDia() < 0) || (getA�o() > 9999))
            return false;
 
        if ((getMes() == 1) || (getMes() == 3) || (getMes() == 5) || (getMes() == 7) || (getMes() == 8)
                || (getMes() == 10) || (getMes() == 12)) {
 
            if (getDia() > 31) {
                return false;
            } else {
                return true;
            }
        } 
 
        else if (getMes() == 2) {
            if (bisiesto(getA�o())) {
                if (getDia() > 29) {
                    return false;
                } else {
                    return true;
                }
            } 
            else {
                if (getDia() > 28) {
                    return false;
                } else {
                    return false;
                }
            } 
        } 
 
        else {
            if (getDia() > 30) {
                return false;
            } else {
                return true;
            }
        } 
    }
    
    public boolean esMayorQue(Fecha fecha) {
    	
    	if(fecha.getA�o() < getA�o()) {
    		return false;//false //true
    	} else if(fecha.getA�o() > getA�o()) {
    		return true;
    	} else if(fecha.getMes() < getMes()) {
    		return false;
    	} else if(fecha.getMes() > getMes()) {
    		return true;
    	} else if(fecha.getDia() > getDia()) {
    		return true;
    	} 
    	
    	return false;
    }
 
    public String toString() {
        if ((getDia() < 10) && (getDia() < 10)) {
            return "La fecha de hoy es 0" + getDia() + "-0" + getMes() + "-" + getA�o();
 
        } else if (getDia() > 10) {
            return "La fecha de hoy es 0" + getDia() + "-" + getMes() + "-" + getA�o();
        } else if (getMes() > 10) {
            return "La fecha de hoy es " + getDia() + "-0" + getMes() + "-" + getA�o();
 
        } else {
            return "La fecha de hoy es " + getDia() + "-" + getMes() + "-" + getA�o();
        }
    }
}