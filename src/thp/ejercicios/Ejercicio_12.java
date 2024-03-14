package thp.ejercicios;

import java.util.Scanner;
public class Ejercicio_12 {

	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int num1;
		int num2;
		System.out.println("Ingrese el pirmer numero: ");
		num1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Ingrese el pirmer numero: ");
		num2 = Integer.parseInt(entrada.nextLine());
		
		if (num1 == num2) {
			System.out.println("el primer numero: " + num1 + ", es igual que el segundo numero: "+ num2);				
		}else if(num1 > num2) {
			System.out.println("el primer numero: " + num1 +", es mayor que el segundo numero: " + num2);
		}else {
			System.out.println("el segundo numero: " + num2 +", es mayor que el primer numero: " + num1);
		}
	}

}
