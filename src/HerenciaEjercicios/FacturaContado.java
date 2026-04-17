package HerenciaEjercicios;

public class FacturaContado extends Factura{

	private double descuento;

	public FacturaContado(int numero, String cliente, double total, double descuento) {
		super(numero, cliente, total);
		this.descuento = descuento;
	}

	@Override
	public double calcularTotal() {
		return this.total-this.descuento;
	}

	@Override
	public String toString() {
		return "FacturaContado [descuento=" + descuento + "]";
	}
	
	
}
