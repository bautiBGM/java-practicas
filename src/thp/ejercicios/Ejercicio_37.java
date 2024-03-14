package thp.ejercicios;

import java.util.Scanner;

public class Ejercicio_37 {

	public static Scanner input = new Scanner(System.in);
	static final int VALORES_PERMITIDOS = 12;
	static final int MES_NO_PAGO = -1;
	public static void main(String[] args) {

		int sueldo;
		int sumaSueldo = 0;
		int contMeses = 0;
		do {
			System.out.println("ingrese los sueldos mensuales: ");
			sueldo = Integer.parseInt(input.nextLine());
			
			if (sueldo > 0) {
				sumaSueldo = sumaSueldo + sueldo;
				contMeses++;
			}
		} while ((contMeses < VALORES_PERMITIDOS) && (sueldo > MES_NO_PAGO));

		System.out.println("el sueldo percibido por el empleado en " +contMeses + " mes/ses, es de: $" + sumaSueldo);
	}

}