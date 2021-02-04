package ejer1Tema4;

public class Libro {
	private String isbn;
	private String autor;
	private String titulo;
	private int numPags;
	
	//Constructor
	public Libro(String isbn, String autor, String titulo, int numPags) {
		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
		this.numPags = numPags;
	}
	
	public Libro() {
		this.isbn = "";
		this.autor = "";
		this.titulo = "";
		//this.numPags = 0; Se puede hacer pero es innecesario porque los int se suelen ya inicializar a cero por si mismo
	}
	
	public Libro(Libro libro) {
		this.isbn = libro.getIsbn();
		this.autor = libro.getAutor();
		this.titulo = libro.getTitulo();
		this.numPags = libro.getNumPags();
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getNumPags() {
		return this.numPags;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}
	
	//@Override
	public String toString() {
		return "El libro con ISBN " + getIsbn() + " creado por el autor " + getAutor() + " tiene " + getNumPags() + " páginas.";
	}
}
