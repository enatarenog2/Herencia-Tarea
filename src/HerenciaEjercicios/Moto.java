package HerenciaEjercicios;

public class Moto extends Vehiculo{
	
	private int cilindrada;

	public Moto(String marca, String velocidad, int cilindrada) {
		super(marca, velocidad);
		this.cilindrada = cilindrada;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Velocidad: "+this.velocidad);
		System.out.println("Cilindrada: "+this.cilindrada);
	
	}
	
	
	

}
