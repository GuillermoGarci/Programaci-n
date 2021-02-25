public class Main {
	public static void main(String[] args) {
		Videojuego[] videojuegos = new Videojuego[5];
		Serie[] series = new Serie[5];
		
		videojuegos[0] = new Videojuego();
		videojuegos[1] = new Videojuego("Call of Duty", (float) 60.7);
		videojuegos[2] = new Videojuego("League of Legends",(float) 20.6, "Estrategia", "Riot games");
		videojuegos[3] = new Videojuego();
		videojuegos[4] = new Videojuego("Clash of clans", (float) 15.8);
		
		series[0] = new Serie("The Big Bang Theory", 13, "Comedia", "Bill Prady");
		series[1] = new Serie("Friends", "Marta Kauffman");
		series[2] = new Serie();
		series[3] = new Serie();
		series[4] = new Serie();
		
		videojuegos[1].entregar();
		videojuegos[4].entregar();
		videojuegos[3].entregar();
		videojuegos[0].entregar();
		
		series[3].entregar();
		series[4].entregar();
		
		int entregados = 0;
		
		for (Videojuego videojuego : videojuegos) {
			if(videojuego.isEntregado() == true) {
				System.out.println(videojuego.toString());
				entregados++;
			}
		}
		
		for (Serie serie : series) {
			if(serie.isEntregado() == true) {
				System.out.println(serie.toString());
				entregados++;
			}
		}
		
		System.out.println("El número total de series y videojuegos entregados es de: " + entregados);
		
		Videojuego videojuegoaux = new Videojuego();
		videojuegoaux = videojuegos[0];
		
		Serie serieaux = new Serie();
		serieaux = series[0];
		
		for(int i = 0; i < videojuegos.length; i++) {
			if(videojuegoaux.compareTo(videojuegos[i]) == false) {
				videojuegoaux = videojuegos[i];
			}
		}
		
		for(int i = 0; i < series.length; i++) {
			if(serieaux.compareTo(series[i]) == false) {
				serieaux = series[i];
			}
		}
		
		System.out.println("\nEl videojuego con más horas es: \n" + videojuegoaux.toString());
		System.out.println("La serie con más temporadas es: \n" + serieaux.toString());
	}//
}