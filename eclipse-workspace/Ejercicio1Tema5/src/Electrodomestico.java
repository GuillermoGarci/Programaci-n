public class Electrodomestico {
	//precio  base,  color,  consumo  energético  (letras  entre  A  y  F)  y peso
	private float precioBase;
	private String color;
	private char consumoE;
	private float peso;
	
	private final float CIEN = 100;
	private final String BLANCO = "blanco";
	private final char EFE = 'f';
	private final float CINCO = 5;
	
	public Electrodomestico() {
		
	}
	
	public Electrodomestico(float precioBase, String color, char consumoE, float peso) {
		this.precioBase = CIEN;
		this.color = BLANCO;
		this.consumoE = EFE;
		this.peso = CINCO;
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
		case 'A':
			
			break;
		case 'B':
			
			break;
		case 'C':
			
			break;
		case 'D':
			
			break;
		case 'E':
			
			break;
		case 'F':
			
			break;
		default:
			break;
		}
		
		return getConsumoE();
	}
}