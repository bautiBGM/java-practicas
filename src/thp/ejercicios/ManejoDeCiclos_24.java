package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCiclos_24 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		
		int num1;
		int num2;
		
		do {
		System.out.println("ingrese el primer numero que debera ser menor o igual que el segundo numero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("ingrese el segundo numero: ");
		num2 = Integer.parseInt(input.nextLine());
		}while(num1 > num2);
		
		System.out.println("incluyendo los numeros");
		for (int incluyendo = num1; incluyendo <= num2; incluyendo++) {
			System.out.println(incluyendo);
		}
		System.out.println("excluyendo los numeros");
		for (int excluyendo = num1 + 1 ; excluyendo <= num2 -1; excluyendo++) {
			System.out.println(excluyendo);
		}
	}

}
