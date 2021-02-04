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

	public String toString() {
		//return "Fecha [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
		return getDia() + "/" + getMes() + "/"+ getA�o();
	}
}