package ejer1Tema4;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro("0002202020202", "Carlos", "Piratas del Caribe", 6);
		Libro libro2 = new Libro();
		
		libro2.setAutor("Miriam");
		libro2.setTitulo("Susurros de Laura");
		libro2.setIsbn("56084-590854");
		libro2.setNumPags(10);
		
		//System.out.println(libro1);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		if(libro1.getNumPags() > libro2.getNumPags()) {
			System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas que el libro " + libro2.getTitulo());
		} else if(libro1.getNumPags() < libro2.getNumPags()) {
			System.out.println("El libro " + libro2.getTitulo() + " tiene más páginas que el libro " + libro1.getTitulo());
		} else {
			System.out.println("El libro " + libro1.getTitulo() + " tiene las mismas que el libro " + libro2.getTitulo());
		}
	}

}
