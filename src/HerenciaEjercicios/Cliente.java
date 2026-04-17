package HerenciaEjercicios;

public class Cliente {
	
	protected String nombre;
	protected String nit;
	

	public Cliente(String nombre, String nit) {
		super();
		this.nombre = nombre;
		this.nit = nit;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", nit=" + nit + "]";
	}
	
	
	

}
