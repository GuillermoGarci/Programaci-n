import java.util.ArrayList;

public class Sala {
	private static Asiento[][] asientos;
	private static Pelicula pelicula = new Pelicula();
	private static ArrayList<Espectador> espectadores = new ArrayList<Espectador>();
	
	private static final int NUM_FILAS = 8;
	private static final int NUM_COLS = 9;
	private static final char[] NOMBRECOLUMNAS = {'a','b','c','d','e','f','g','h','i'};
	private static final String[] DIRECTORES = {"Pedro Almodóvar", "Quentín Tarantino", "Cristopher Nolan", "Steven Spielberg", "Isabel Coixet"};
	private static final String[] TITULOS = {"Dolor y Gloria", "Pull Fiction", "Tenet", "E.T.", "Mi vida sin mi"};
	private static final double PRECIOENTRADA = 12.0;
	
	public static void generarAsientos() {
		asientos = new Asiento[NUM_FILAS][NUM_COLS];
		
		for(int i = 0; i < NUM_FILAS; i++) {
			for(int j = 0; j < NUM_COLS; j++) {
				Asiento asiento = new Asiento(i + 1, NOMBRECOLUMNAS[j], false);
				asientos[i][j] = asiento; 
			}
		}
	}
	
	public static void generarPelicula() {
		pelicula.setEdad_minima((int)(Math.random()*19));
		pelicula.setDuracion((int)(Math.random()*(200-15))+15);
		int aux = (int) Math.random()*6;
		pelicula.setDirector(DIRECTORES[aux]);
		pelicula.setTitulo(TITULOS[aux]);
	}
	
	public static void generarEspectador() {
		Espectador espec = new Espectador();
		String nombre = "Espectador " + (Math.random()*100);
		espec.setNombre(nombre);
		espec.setEdad((int)(Math.random()*120));
		espec.setDinero((int)(Math.random()*80));
		
		espectadores.add(espec);
		
	}
	
	public static void sentarEspectadores() {
		int numEspec = 0;
		int asientosOcupados = 0;
		boolean sentado;
		
		while(numEspec < 100) {
			generarEspectador();
			Espectador aux = espectadores.get(numEspec);
			System.out.println("Intentando sentar a " + aux.getNombre());
			numEspec++;
			sentado = false;
			if(aux.getEdad() >= pelicula.getEdad_minima() && aux.getDinero() >= PRECIOENTRADA) {
				if(asientosOcupados <= 72) {
					do {
						int fila = (int)(Math.random()*8);
						int col = (int)(Math.random()*9);
						
						if(!asientos[fila][col].isOcupado()) {
							asientos[fila][col].setOcupado(true);
							asientos[fila][col].setEspectador(aux);
							System.out.println(aux.getNombre() + " esta sentado en " + asientos[fila][col].toString());
							sentado = true;
							asientosOcupados++;
						} else {
							System.out.println(asientos[fila][col].toString() + " esta ocupado");
							
						}
					} while(!sentado);
				}
			} else {
				System.out.println(aux.getNombre() + "no ha podido entrar por edad insuficiente o dinero insuficiente");
			}
		}
	}
	
	public static void comprobarSala() {
		System.out.println("Espectadores generados: ");
		
		for(Espectador espectador: espectadores){
			System.out.println(espectador.getNombre());
		}
		System.out.println();
		System.out.println("Estado de los asientos: ");
		
		for(int i = 0; i < NUM_FILAS; i++) {
			for(int j = 0; j < NUM_COLS; j++) {
				System.out.println(asientos[i][j].toString() + ": ");
				
				if(asientos[i][j].isOcupado()) {//if(asientos[i][j].getEspectador() != null) {
					System.out.println(asientos[i][j].getEspectador().getNombre());
				} else {
					System.out.println(" Asiento vacío");
				}
			}
		}
	}
	
 	public static void main(String[] args) {
 		generarAsientos();
 		generarPelicula();
 		
 		sentarEspectadores();
 		comprobarSala();
 		
	}
}