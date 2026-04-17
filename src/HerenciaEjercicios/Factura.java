package HerenciaEjercicios;

public class Factura {
	
	protected int numero;
	protected String cliente;
	protected double total;
	
	
	public Factura(int numero, String cliente, double total) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		if (total>=0) {this.total = total;}
		else {
			this.total=0;
		}
	}
	
	public double calcularTotal() {
		return this.total;
		
	}
	

}
