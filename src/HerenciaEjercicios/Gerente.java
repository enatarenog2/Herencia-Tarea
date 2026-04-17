package HerenciaEjercicios;

public class Gerente extends Empleado {
	
	private int bonoAdicional;

	public Gerente(String nombre, int salario, int bonoAdicional) {
		super(nombre, salario);
		this.bonoAdicional = bonoAdicional;
	}

	@Override
	public int calcularSalario() {
	return bonoAdicional+salario;
	
	}
	
	

}
