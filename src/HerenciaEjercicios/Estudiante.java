package HerenciaEjercicios;

public class Estudiante extends Persona {

	private int carnet;

	public Estudiante(String nombre, int edad, int carnet) {
		super(nombre, edad);
		this.carnet = carnet;
	}

	@Override
	public void mostrar() {
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("Edad: "+ this.edad);
		System.out.println("Carnet: "+ this.carnet);
	
	}

	

}
