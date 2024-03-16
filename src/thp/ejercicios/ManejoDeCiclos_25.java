package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCiclos_25 {
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		int ancho;
		int largo;
		System.out.println("ingrese el ancho:" );
		ancho = Integer.parseInt(input.nextLine());
		System.out.println("ingrese el largo:" );
		largo = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= largo; i++) {
			for (int j = 1; j <= ancho; j++) {
				System.out.print("x");
			}
			System.out.println("");
		}
		
	}

}
