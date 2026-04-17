package HerenciaEjercicios;

public class Animal {
	protected String nombre;

	
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}


	public void hacerSonido() {
	System.out.println("El animal hace sonido");
	}


	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + "]";
	}


}
