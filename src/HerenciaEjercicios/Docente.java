package HerenciaEjercicios;

public class Docente extends Persona {
	
	private String especialidad;


	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}


	@Override
	public void mostrar() {
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("Edad: "+ this.edad);
		System.out.println("Especialidad: "+ this.especialidad);
	}

}
