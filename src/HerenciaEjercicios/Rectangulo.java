package HerenciaEjercicios;

public class Rectangulo extends Figura{

	private double base;
	private double altura;
	
	

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}



	@Override
	public double CalcularArea() {
		return this.base*this.altura;
	}


	
	
	
}
