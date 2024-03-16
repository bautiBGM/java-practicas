package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCiclos_32 {

	public static Scanner input = new Scanner (System.in);
	
	static final int NOTA_MAX = 10;
	public static void main(String[] args) {
		
		int nota;
		
		do {
			System.out.println("Ingrese la nota a validar, recuerde que debe ser 2 o 4 a 10: ");
			nota = Integer.parseInt(input.nextLine());
			// } while (nota <= 1 || nota == 3 || nota > 10);
			// otra opcion.
		} while (nota != 2 && (nota < 4 || nota > NOTA_MAX));
		System.out.println("la nota: " +nota+ " esta entre 2 0 4 y 10");
	}

}
 
