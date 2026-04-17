package HerenciaEjercicios;

public class Vehiculo {
	
	protected String marca;
	protected String velocidad;
	
	
	public Vehiculo(String marca, String velocidad) {
		super();
		this.marca = marca;
		this.velocidad = velocidad;
	}

	
	public void mostrarInfo(){
		System.out.println("Marca: "+this.marca);
		System.out.println("Velocidad: "+this.velocidad);
		
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", velocidad=" + velocidad + "]";
	}
	
	

}
