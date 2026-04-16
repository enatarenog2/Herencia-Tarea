package EjemploPractico;

public class Main {

	public static void main(String[] args) {
		
		Cuenta c1=new Cuenta (1299.9);
		c1.retirar(1000);
		System.out.println(c1);
		Cuenta c2=new Cuenta(1200);
		c2.retirar(1300);
		System.out.println(c2);
	}

}
