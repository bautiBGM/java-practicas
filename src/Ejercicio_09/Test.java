package Ejercicio_09;

public class Test {

	public static void main(String[] args) {

		CuentaBancaria cuenta1 = new CuentaBancaria ("000111", "caja de ahorro", 10000.00);
		CuentaBancaria cuenta2 = new CuentaBancaria ("11", "cuenta corriente", 20000.00);
		Domicilio direccion1 = new Domicilio ("yatay",240,"Almagro");
		Persona persona1 = new Persona (12345678, "Fulano", "Gómez");
		Persona persona2 = new Persona (9123456,"Mengana", "Torres");
	
		persona1.setDomicilio(direccion1);
		persona2.setDomicilio(direccion1);
		
		System.out.println(persona1);
		System.out.println(cuenta1);
		System.out.println("----------------------------------------------------");
		cuenta1.depositar(15000.0);
		System.out.println(persona1);
		System.out.println(cuenta1);
		cuenta1.extraer(5000.0);
		System.out.println("pudo extraer?:" + cuenta1.extraer(0));
		System.out.println("saldo actual: " + cuenta1.obtenerSaldo(0));
		System.out.println("----------------------------------------------------");
		System.out.println(persona2);
		System.out.println(cuenta2);
	}

}
