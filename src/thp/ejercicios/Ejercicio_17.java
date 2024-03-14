package thp.ejercicios;

import java.util.Scanner;
public class Ejercicio_17 {

	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {

		final int EDAD_MIN = 1;
		final int EDAD_MAX = 120;
		final int MUJER_JUBILAR = 60;
		final int HOMBRE_JUBILAR = 65;
		int edad;
		final String FEMENINO = "F";
		final String MASCULINO = "M";
		String genero = " ";
		
		System.out.println("Ingrese su edad: ");
		edad = Integer.parseInt(entrada.nextLine());

		if(edad >= EDAD_MIN && edad <= EDAD_MAX) {
			System.out.println("Ingrese su genero con 'F' para mujer y 'M' para hombre:");
			genero = entrada.nextLine();
		}else {
			System.out.println("edad fuera de rango");
		}if (genero == FEMENINO) {
			}else if(edad >= MUJER_JUBILAR){
				System.out.println("se puede jubilar");
				}else {
					System.out.println("no se puede jubilar");
		} if (genero == MASCULINO) {
				}else if (edad>=HOMBRE_JUBILAR) {
					System.out.println("se puede jubilar");
					}else {
						System.out.println("no se puede jubilar");
					}
			
	}

}
