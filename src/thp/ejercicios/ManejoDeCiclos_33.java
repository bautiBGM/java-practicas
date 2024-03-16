package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCiclos_33 {

	public static Scanner input = new Scanner (System.in);
	static final int SALIDA = 0;
	public static void main(String[] args) {

		
		int numero;
		int max = 0;
		int min = 10000;
		System.out.println("ingrese un numero: ");
		numero = Integer.parseInt(input.nextLine());
		
		while (numero != SALIDA) {
			
			if (numero > max) {
				max = numero;
			}else 
				if (numero < min) {
				min = numero;
			}
			System.out.println("ingrese un numero: ");
			numero = Integer.parseInt(input.nextLine());
		}
		System.out.println("el numero maximo es:" + max + " y el numero minimo es: " + min);
	}

}
