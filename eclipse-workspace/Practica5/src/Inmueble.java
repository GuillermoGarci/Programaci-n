/*Diseñar un programa en Java que permita consultar los inmuebles que una agencia inmobiliaria tiene a la venta o
en alquiler.La Agencia será una clase con un ArrayList de objetos tipo Inmueble que pueden ser tanto pisos como casas.
Dicha agencia también debe tener un nombre. Deben crearse al menos dos constructores para esta clase,
uno que reciba el nombre de la agencia y otro que reciba tanto el nombre como la lista de los inmuebles de los que
dispone. La Dirección de los Inmuebles debería almacenar el tipo de vía(calle , avenida, plaza, camino, carretera o paseo),
el nombre, el número y el CP. De los inmuebles nos interesa conocer el código identificativo (id),
la dirección del mismo, el número de habitaciones, los metros cuadrados y el precio. Para los pisos se debe almacenar
también el número del piso y la letra de la puerta. También interesa saber si el piso es un estudio, si lo fuese,
el número de habitaciones debería ser siempre 1. Las casas tendrán también una dirección, metros cuadrados y precio,
además de esto, deberá almacenarse la información de si tienen o no jardín y si tienen o no garaje.
Es necesario implementar una interfaz Impuestos, que declare un método que sume los impuestos al precio de los inmuebles
y una constante para cada impuesto que contenga el porcentaje de impuestos que se debe aplicar al implementar dicho método
para hallar el precio final del alquiler o de la venta. A la hora de calcular el precio final debe aplicarse este impuesto
definido en la interfaz implementando el método declarado en la misma. A tener en cuenta que los dos impuestos que habrá
que declarar y aplicar son el IVA de un 10 % (Impuesto sobre el Valor Añadido) y el ITP de un 8 %
(Impuesto de Transmisiones Patrimoniales). El IVA no corresponde al inquilino en un alquiler, por lo tanto no debería
sumarse al precio final. Hay que resolver el ejercicio aplicando herencia, polimorfismo y la implementación de esta
interfaz previamente definida correctamente. También hay que diagramar esto correctamente en el diagrama de clases
correspondiente. 1
Para resolver el ejercicio será necesario implementar las clases, con sus atributos y métodos adecuados, sus constructores,
getters y setters, etc., que resuelvan las necesidades antes citadas y además se deberá crear una clase principal
que genere un menú interactivo con el que ejecutarlas. Desde ese menú será necesario tener la posibilidad de realizar
lo siguiente:
❖Añadir un nuevo inmueble a la venta o en alquiler a la lista.
❖Modificar un inmueble existente en la lista.
❖Listar los inmuebles disponibles.
❖Listar los inmuebles de un rango de precios.
❖Listar los inmuebles de un rango de metros.
❖Eliminar un inmueble de la lista tras este ser alquilado o vendido.
Nota: A la hora de listar los inmuebles se debe mostrar el precio con y sin los impuestos aplicados para que el usuario
pueda ver la diferencia en todo momento (Aunque el precio final no es necesario almacenarlo en el objeto).
Así como el tipo de inmueble que es cada uno de ellos. Es indispensable que el programa principal genere
una serie de inmuebles ya existentes al ejecutarse por primera vez, como mínimo cinco inmuebles en alquiler y
otros cinco en venta. Es indispensable también entregar el diagrama de clases correspondiente al programa realizado.
Cuidar el feedback con el usuario y comentar el código.*/
public abstract class Inmueble {
	private float precio;
//private float precioFinal;
	private float metrosCuadrados;
	private int id;
	private static int idActual = 1;
	private String direccion;
	private String tipoVia;
	private String nombre;
	private int numero;
	private int cp;
	private int numHabitaciones;
	private boolean alquilado;

	public Inmueble() {
		this.id = idActual++;
	}

	public Inmueble(float precio, float metrosCuadrados, String tipoVia, String nombre, int numero, int cp,
			int numHabitaciones, boolean alquilado) {
		this.precio = precio;
		this.metrosCuadrados = metrosCuadrados;
		this.id = idActual++;
		direccion(tipoVia, nombre, numero, cp);
		this.tipoVia = tipoVia;
		this.nombre = nombre;
		this.numero = numero;
		this.cp = cp;
		this.numHabitaciones = numHabitaciones;
		this.alquilado = alquilado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/*
	 * public float getPrecioFinal() { return precioFinal; }
	 *
	 * public void setPrecioFinal(float precioFinal) { this.precioFinal =
	 * precioFinal; }
	 */

	public float getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(float metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	public String direccion(String tipoVia, String nombre, int numero, int cp) {
		return this.direccion = tipoVia + " " + nombre + " " + numero + " " + cp;
	}

	public String alquilados() {
		String texto = "Venta";

		if (alquilado) {
			texto = "Alquiler";
		}

		return texto;
	}

	@Override
	public String toString() {
		return "\nLos metros cuadrados: " + getMetrosCuadrados() + "\nLa dirección es: " + getDireccion()
				+ "\nEl número de habitaciones es: " + getNumHabitaciones();
	}
}