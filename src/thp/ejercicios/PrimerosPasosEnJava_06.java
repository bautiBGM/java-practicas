package thp.ejercicios;

import java.util.Scanner;
public class PrimerosPasosEnJava_06 {

	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {

		final double SUELDO_FIJO = 44000;
		double porcentaje2 = 0.16;
		double montoTotalVentas;
		double porcentaje;
		double sueldoTotal;
		
		System.out.println("Ingrese el monto total vendido durante el mes: ");
		montoTotalVentas = Float.parseFloat(entrada.nextLine());
		
		porcentaje = porcentaje2 * montoTotalVentas;
		sueldoTotal = porcentaje + SUELDO_FIJO;
		System.out.println("el importe total a cobrar por el vendedor es: " + sueldoTotal);
		
	}

}
