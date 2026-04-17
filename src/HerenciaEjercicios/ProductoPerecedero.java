package HerenciaEjercicios;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{

	private LocalDate fechaVencimiento;

	
	public ProductoPerecedero(int codigo, String nombre, double precio, int stock, LocalDate fechaVencimiento) {
		super(codigo, nombre, precio, stock);
		this.fechaVencimiento = fechaVencimiento;
	}

	public boolean estaVencido() {
		LocalDate hoy =LocalDate.now();//LocalDate.now optiene la fecha actual e isAfter verifica si la fecha de vencimiento es despues de la fecha actual
		return hoy.isAfter(fechaVencimiento);
		
		
	}
}
