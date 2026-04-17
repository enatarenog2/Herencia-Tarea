package HerenciaEjercicios;

public class Cuenta {

	protected double saldo;

	public Cuenta(double saldo) {
	this.saldo = saldo;
	}

	public void depositar(double monto) {
	saldo += monto;
	}

	public double retirar(double monto) {
	return saldo -= monto;
	}

	public void mostrar() {
		
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Retiro: "+retirar(saldo));
	}
	
	
}
