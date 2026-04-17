package HerenciaEjercicios;

public class Empleado {
	protected String nombre;
	protected int salario;
	
	
	public Empleado(String nombre, int salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public int calcularSalario() {
		return salario;
		
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + "]";
	}
	

}
