package HerenciaEjercicios;

public class Libro {
	protected String titulo;
	protected String autor;
	
	
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	
	public void mostrarInfo() {
		
		System.out.println("Titulo: "+this.titulo);
		System.out.println("Autor: "+this.autor);
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	

}
