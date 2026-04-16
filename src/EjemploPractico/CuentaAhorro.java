package EjemploPractico;

public class CuentaAhorro extends Cuenta{

	private double tasa;
	
	
	public CuentaAhorro(double saldo) {
		super(saldo);

	}


	@Override
	public void retirar(double monto) {
		if (saldo-monto>=0) {
			super.retirar(monto);
		}else {
			
		System.out.println("Saldo Insuficiente ");
		}
	}


}
