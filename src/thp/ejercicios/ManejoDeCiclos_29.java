package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCiclos_29 {

	public static Scanner input = new Scanner (System.in);
		static final int NOTA_MIN = 0;
		static final int NOTA_MAX = 10;
	public static void main(String[] args) {
		
		
		int nota;
		int nota2;
		do {
			System.out.println("Ingrese la nota a validar, recuerde que debe ser entre 0 y 10: ");
			nota = Integer.parseInt(input.nextLine());
		} while (nota <= NOTA_MIN || nota >= NOTA_MAX);
		System.out.println("la nota: " +nota+ " esta entre 0 y 10");
		// do while
		
		
		
		// while
		System.out.println("Ingrese la nota a validar, recuerde que debe ser entre 0 y 10: ");
		nota2 = Integer.parseInt(input.nextLine());
		while (nota2 <= NOTA_MIN || nota2 >= NOTA_MAX) {
			System.out.println("Ingrese la nota a validar, recuerde que debe ser entre 0 y 10: ");
			nota2 = Integer.parseInt(input.nextLine());
		}
		System.out.println("la nota: " +nota2+ " esta entre 0 y 10");
	}
	

}
