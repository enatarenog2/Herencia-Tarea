package HerenciaEjercicios;

public class Transporte {
	
	protected int capacidad;

	
	
	public Transporte(int capacidad) {
		super();
		this.capacidad = capacidad;
	}
	
	public  void descripcion() {
		
		System.out.println("Capacidad: "+this.capacidad);
	}

}
