package thp.ejercicios;

import java.util.Scanner;

public class ManejoDeCiclos_34 {

	public static Scanner input = new Scanner(System.in);
	static final double SALIDA = 0;

	public static void main(String[] args) {

		double estatura;
		double promedio = 0;
		double contador = 0;
		double suma = 0;
		
		System.out.println("ingrese la estatura: ");
		estatura = Double.parseDouble(input.nextLine());

		while (estatura != SALIDA) {
			suma = suma + estatura;
			contador += 1;
			System.out.println("ingrese otra estatura: ");
			estatura = Double.parseDouble(input.nextLine());
		}
		promedio = suma / contador;
		System.out.println("el promedio de las estaturas de los jugadores es: " + promedio + " metros.");
	}

}
