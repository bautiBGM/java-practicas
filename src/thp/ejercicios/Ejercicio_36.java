package thp.ejercicios;

import java.util.Scanner;

public class Ejercicio_36 {

	public static Scanner input = new Scanner(System.in);
	static final int MENOR_A_PROMEDIO = 20;

	public static void main(String[] args) {

		int numero;
		int sumaNumeros = 0;
		double promedio = 0;
		int contNumeros = 0;
		do {
			System.out.println("Ingrese un numero: ");
			numero = Integer.parseInt(input.nextLine());
			contNumeros++;

			sumaNumeros = sumaNumeros + numero;

			promedio = (double) sumaNumeros / contNumeros;

		} while (promedio < MENOR_A_PROMEDIO);

		System.out.println("se leyeron un total de: " + contNumeros);
	}

}
