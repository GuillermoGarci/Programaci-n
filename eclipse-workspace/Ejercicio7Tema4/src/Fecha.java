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

	public String toString() {
		//return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
		return getDia() + "/" + getMes() + "/"+ getAño();
	}
}