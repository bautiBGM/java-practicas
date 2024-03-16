package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCondicional_15 {

	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {

		final int EDAD_MIN = 6;
		final double ALTURA_MIN = 1.50;
		int edad;
		double altura;
		String nombre;
		
		System.out.println("Ingrese su nombre: ");
		nombre = entrada.nextLine();
		
		System.out.println("Ingrese su edad: ");
		edad = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Ingrese su altura: ");
		altura = Double.parseDouble(entrada.nextLine());
		
		if (edad >= EDAD_MIN || altura >= ALTURA_MIN) {
			System.out.println(nombre + "puede ingresar a la atraccion");
		}else {
			System.out.println(nombre + "no puede ingresar");
	}
	}
}

