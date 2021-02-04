/*import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha() {
	}

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public void setDia(int d) {
		dia = d;
	}

	public void setMes(int m) {
		mes = m;
	}

	public void setAño(int a) {
		año = a;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAño() {
		return año;
	}

	public boolean fechacorrecta() {
		boolean diacorrecto, mescorrecto, añocorrecto;
		añocorrecto = año > 0;
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
		return diacorrecto && mescorrecto && añocorrecto;
	}

	private boolean esbisiesto() {
		return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
	}

	public void diaSiguiente() {
		dia++;
		if (!fechacorrecta()) {
			dia = 1;
			mes++;
			if (!fechacorrecta()) {
				mes = 1;
				año++;
			}
		}
	}
	
	public boolean esMayorQue(Fecha f) {
        boolean toret = true;
		if(getAño() >= f.año) {
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
		return getDia() + "/" + getMes() + "/"+ getAño();
	}

}*/
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha() {
    }
 
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
 
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
 
    public void setAño(int año) {
        this.año = año;
    } 

    public int getDia() {
        return this.dia;
    }
 
    public int getMes() {
        return this.mes;
    }
    
    public int getAño() {
        return this.año;
    }
 
    private boolean bisiesto(int año) {
        if (año == 0) {
            return false;
        } 
 
        if (año % 4 == 0) {
 
            if (año % 100 == 0) {
                if (año % 400 == 0) {
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
 
    // 1,3,5,7,8,10,12-31--31 diás
    // 4,6,9,11 -----------30 dias
 
    public boolean correcto() {
 
        if ((getDia() < 0) || (getAño() > 9999))
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
            if (bisiesto(getAño())) {
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
    	
    	if(fecha.getAño() < getAño()) {
    		return false;//false //true
    	} else if(fecha.getAño() > getAño()) {
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
            return "La fecha de hoy es 0" + getDia() + "-0" + getMes() + "-" + getAño();
 
        } else if (getDia() > 10) {
            return "La fecha de hoy es 0" + getDia() + "-" + getMes() + "-" + getAño();
        } else if (getMes() > 10) {
            return "La fecha de hoy es " + getDia() + "-0" + getMes() + "-" + getAño();
 
        } else {
            return "La fecha de hoy es " + getDia() + "-" + getMes() + "-" + getAño();
        }
    }
}