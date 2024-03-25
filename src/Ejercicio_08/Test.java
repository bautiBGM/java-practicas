package Ejercicio_08;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		TarjetaDeCredito tarjeta = new TarjetaDeCredito("4145-4141-2222-1111", " Juan Perez", 10000);
		
		double monto; 

		
			System.out.println("Ingrese el monto de la compra: ");
			monto = Double.parseDouble(input.nextLine());
		
		
		if (tarjeta.realizarCompra(monto)) {
			System.out.println("compra exitosa");
		}else {
			System.out.println("la compra fue denegada");
		}
		
		System.out.println(tarjeta.toString());
		
		input.close();
	}

}
