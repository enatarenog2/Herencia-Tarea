package HerenciaEjercicios;

public class Perro extends Animal{
	
	private String raza;

	

	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}



	@Override
	public void hacerSonido() {
		System.out.println("Ladra");

	}
		

}
