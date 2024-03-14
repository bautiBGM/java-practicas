package thp.ejercicios;

import java.util.Scanner;

public class Ejercicio_03 {
	public static Scanner entero = new Scanner(System.in);
	public static void main(String[] args) {

	int numero;
	int multi;
	double divi = 0.0;
	
	System.out.println("Ingrese un numero: ");
	numero = Integer.parseInt(entero.nextLine());
	
	multi = numero * 5;
	divi  = numero / 2;
	System.out.println("El resultado de la multiplicacion es: " + multi);
	System.out.println("El resultado de la division es: " + divi);
	
	}

}
