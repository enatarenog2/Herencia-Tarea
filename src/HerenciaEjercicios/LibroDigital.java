package HerenciaEjercicios;

public class LibroDigital extends Libro {

	private int tamañoMB;

	public LibroDigital(String titulo, String autor, int tamañoMB) {
		super(titulo, autor);
		this.tamañoMB = tamañoMB;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Titulo: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		System.out.println("Tamaño en MB: "+this.tamañoMB);
	}

	
	
}
