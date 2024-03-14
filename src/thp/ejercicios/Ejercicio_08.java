package thp.ejercicios;

import java.util.Scanner;

public class Ejercicio_08 {

	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {

		int num1; 
		int num2;
		int suma;
		int resta; 
		int multi; 
		int division;
		
		System.out.println("ingrese el primer numero:");
		num1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("ingrese el primer numero:");
		num2 = Integer.parseInt(entrada.nextLine());
		
		 suma = num1 + num2;
		 resta = num1 - num2;
		 multi = num1 * num2;
		 division = num1 / num2;
		 System.out.println("la suma de los dos numeros es: " + suma);
		 System.out.println("la resta de los dos numeros es: " + resta);
		 System.out.println("la multiplicacion de los dos numeros es: " + multi);
		 System.out.println("la division de los dos numeros es: " + division);

	}
}
