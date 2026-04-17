package HerenciaEjercicios;

public class Producto {

	private int codigo;
	private String nombre;
	private double precio;
	private int stock;
	 
	
	public Producto(int codigo, String nombre, double precio, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	public void aplicarDescuento(double porcentaje) {
		precio = precio*porcentaje/100;
		
	}
	
	public void vender(int cantidad) throws Exception {
		if(cantidad>this.stock) {
			throw new Exception("No hay suficiente stock");
		}
		double totalVenta=this.precio*cantidad;
		System.out.println("EL total de la venta es: "+totalVenta);
		this.stock=this.stock-cantidad;
		
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}
}
