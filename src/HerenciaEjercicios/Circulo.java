package HerenciaEjercicios;

public class Circulo extends Figura{

	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double CalcularArea() {
		return Math.PI*radio*radio;
	}
	
	
	
	

}
