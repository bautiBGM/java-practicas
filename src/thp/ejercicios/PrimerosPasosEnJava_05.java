package thp.ejercicios;

import java.util.Scanner;
public class PrimerosPasosEnJava_05 {
	
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		int num1; 
		int num2;
		int aux;
		System.out.println("Ingrese un numero: ");
		num1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Ingrese un numero: ");
		num2 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("el primer numero ingresado es: " + num1 + " y el segundo es: " + num2);
		
		aux = num1; 
		num1 = num2;
		num2 = aux;
		
		System.out.println("el primer numero actual es: " + num1 + " y el segundo actual es: " + num2);
	}

}
