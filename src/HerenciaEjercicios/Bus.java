package HerenciaEjercicios;

public class Bus extends Transporte {
	
	private String ruta;

	
	public Bus(int capacidad, String ruta) {
		super(capacidad);
		this.ruta = ruta;
	}


	@Override
	public void descripcion() {
		System.out.println("Capacidad:"+this.capacidad);
		System.out.println("Ruta:"+this.ruta);
	}
	

}
