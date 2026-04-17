package HerenciaEjercicios;

public class CuentaCorriente extends Cuenta {

	private int sobregiro;

	public CuentaCorriente(double saldo, int sobregiro) {
		super(saldo);
		this.sobregiro = sobregiro;
	}

	@Override
	public double retirar(double monto) {
		return super.retirar(monto);
	}

	@Override
	public void mostrar() {
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Retiro: "+retirar(saldo));
		System.out.println("SobreSgiro: "+this.sobregiro);
	}

	


	
	
}
