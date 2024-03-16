package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCiclos_35 {

	public static Scanner input = new Scanner (System.in);
	static final String  TERMINAR = "*";
	public static void main(String[] args) {

		String nombre;
		String nombreMenor = "";
		int edad;
		int edadMenor = 1000;
		
		System.out.println("ingrese un nombre, si desea terminar ingrese '*': ");
		nombre = input.nextLine();
		while(!(nombre.equals(TERMINAR))) {
			
			System.out.println("ingrese su edad: ");
			edad = Integer.parseInt(input.nextLine());
			
			if (edad < edadMenor) {
				edadMenor = edad;
				nombreMenor = nombre;
			}
			System.out.println("ingrese un nombre, si desea terminar ingrese '*': ");
			nombre = input.nextLine();
		}	
		
		System.out.println("La persona mas joven es: " + nombreMenor);
	}

}
