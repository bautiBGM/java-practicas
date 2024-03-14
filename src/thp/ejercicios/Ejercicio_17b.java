package thp.ejercicios;

import java.util.Scanner;
public class Ejercicio_17b {

	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {

		final int EDAD_MIN = 1;
		final int EDAD_MAX = 120;
		final int MUJER_JUBILAR = 60;
		final int HOMBRE_JUBILAR = 65;
		int edad;
		//final char FEMENINO = 'F';
		//final char MASCULINO = 'M';
		char genero = ' ';
		
		System.out.println("Ingrese su edad: ");
		edad = Integer.parseInt(entrada.nextLine());

		if(edad < EDAD_MIN || edad > EDAD_MAX) {
			System.out.println("edad fuera de rango");
		}else{
			System.out.println("Ingrese su genero con 'F' para mujer y 'M' para hombre:");
			genero = entrada.next().charAt(0);		
		} 
		switch (genero) {
		case 'M':
			if (edad >= HOMBRE_JUBILAR) {
				System.out.println("puede jubilarse");	
			}else {
				System.out.println("no puede jubilarse");
			}
			break;
		case 'F':
			if (edad >= MUJER_JUBILAR) {
				System.out.println("puede jubilarse");	
			}else {
				System.out.println("no puede jubilarse");
			}
			break;
		default:
			System.out.println("genero ivalido");
		}
			
	}

}
