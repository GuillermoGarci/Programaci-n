public class Electrodomestico extends Object{
	//precio  base,  color,  consumo  energético  (letras  entre  A  y  F)  y peso
	private float precioBase;
	private String color;
	private char consumoE;
	private float peso;
	
	private final float CIEN = 100;
	private final String BLANCO = "blanco";
	private final char EFE = 'f';
	private final float CINCO = 5;
	
	/*public enum Color{
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}*/
	
	public float getCIEN() {
		return CIEN;
	}

	public String getBLANCO() {
		return BLANCO;
	}

	public char getEFE() {
		return EFE;
	}

	public float getCINCO() {
		return CINCO;
	}
	
	public Electrodomestico() {
		this.precioBase = CIEN;
		this.color = BLANCO;
		this.consumoE = EFE;
		this.peso = CINCO;
	}
	
	public Electrodomestico(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = BLANCO;
		this.consumoE = EFE;
	}
	
	public Electrodomestico(float precioBase, String color, char consumoE, float peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoE = consumoE;
		this.peso = peso;
	}

	public float getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoE() {
		return consumoE;
	}
	public void setConsumoE(char consumoE) {
		this.consumoE = consumoE;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public char comprobarConsumoEnergetico(char letra){
		switch (letra) {
		case 'A':	case 'a':
			setConsumoE(letra);
			break;
		case 'B':	case 'b':
			setConsumoE(letra);
			break;
		case 'C':	case 'c':
			setConsumoE(letra);
			break;
		case 'D':	case 'd':
			setConsumoE(letra);
			break;
		case 'E':	case 'e':
			setConsumoE(letra);
			break;
		case 'F':	case 'f':
			setConsumoE(letra);
			break;
		default:
			setConsumoE(EFE);
			break;
		}
		return getConsumoE();
	}
	
	public String comprobarColor(String color) {
		color.toLowerCase();
		
		switch (color) {
		case "blanco":
			setColor(color);
			break;
		case "negro":
			setColor(color);
			break;
		case "rojo":
			setColor(color);
			break;
		case "azul":
			setColor(color);
			break;
		case "gris":
			setColor(color);
			break;
		default:
			setColor(BLANCO);
			break;
		}
		return getColor();
	}
	
	public void precioFinal() {
		switch (getConsumoE()) {
		case 'A':	case 'a':
			setPrecioBase(getPrecioBase() + 100);
			break;
		case 'B':	case 'b':
			setPrecioBase(getPrecioBase() + 80);
			break;
		case 'C':	case 'c':
			setPrecioBase(getPrecioBase() + 60);
			break;
		case 'D':	case 'd':
			setPrecioBase(getPrecioBase() + 50);
			break;
		case 'E':	case 'e':
			setPrecioBase(getPrecioBase() + 30);
			break;
		case 'F':	case 'f':
			setPrecioBase(getPrecioBase() + 10);
			break;
		default:
			break;
		}
		
		if(getPeso() >= 0 && getPeso() <= 19) {
			setPrecioBase(getPrecioBase() + 10);
		} else if(getPeso() >= 20 && getPeso() <= 49) {
			setPrecioBase(getPrecioBase() + 50);
		} else if(getPeso() >= 50 && getPeso() <= 79) {
			setPrecioBase(getPrecioBase() + 80);
		} else if(getPeso() >= 80) {
			setPrecioBase(getPrecioBase() + 100);
		}
	}
}
