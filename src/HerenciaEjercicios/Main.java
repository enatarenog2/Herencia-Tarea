package HerenciaEjercicios;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();
		ejercicio7();
		ejercicio8();
		ejercicio9();
		ejercicio10();
	

	}
	
	public static void ejercicio1() {
		Docente d1 =new Docente("Juan",24,"Ingeniero en sistemas");
		d1.mostrar();
		Estudiante e1=new Estudiante("Luis",17,3334);
		e1.mostrar();
	}
	
	public static void ejercicio2() {
		CuentaCorriente cr1 = new CuentaCorriente(100,50);
		cr1.retirar(160);
		cr1.mostrar();
	}
	
	
	public static void ejercicio3() {
		
		ProductoPerecedero pp1=new ProductoPerecedero(1111,"Leche",23,5,LocalDate.of(2026,11, 30));
		if (pp1.estaVencido()) {
            System.out.println("El producto está vencido");
        } else {
            System.out.println("El producto NO está vencido");
        }
		
	}
	
	public static void ejercicio4() {
		Bus b1=new Bus(16,"Asuncion Mita: Jutiapa");
		b1.descripcion();
		
	}
	
	public static void ejercicio5() {
		Gerente g1=new Gerente("Luis",8500,1200);
		System.out.println(g1);
		System.out.println("Salario Total: ");
		System.out.println(g1.calcularSalario());
	
		
	}
	public static void ejercicio6() {
		Perro p1=new Perro("Mailo","Pitbull");
		System.out.println(p1);
		p1.hacerSonido();
	}
	
	public static void ejercicio7() {
		Moto m1=new Moto("Suzuki","100 km/h",150);
		m1.mostrarInfo();
	}
	
	public static void ejercicio8() {
		Figura f1 = new Rectangulo(5, 3);
        Figura f2 = new Circulo(2);
		
        System.out.println("Área rectángulo: " + f1.CalcularArea());
        System.out.println("Área círculo: " + f2.CalcularArea());
		
	}
	
	public static void ejercicio9() {
		
		LibroDigital l1= new LibroDigital("Harry Potter y la piedra filosofal","J. K. Rowling",3);
		l1.mostrarInfo();
	}
	
	public static void ejercicio10() {
		
		Cliente c1=new Cliente("Juan","128433546-4554");
		FacturaContado f1=new FacturaContado(12353635,"Luis",300,50);
		System.out.println("Total al Contado: "+f1.calcularTotal());
		
		
		FacturaCredito fc1=new FacturaCredito(112233224,"Lucia",400.40,6,8);
		System.out.println("Total a credito: "+fc1.calcularTotal());
		System.out.println("Cuota: "+fc1.calcularCuota());
	}

}
