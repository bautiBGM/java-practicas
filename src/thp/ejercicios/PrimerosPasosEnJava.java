package thp.ejercicios;

import java.util.Scanner;

public class PrimerosPasosEnJava {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		String nombre;
		
		System.out.println("Ingrese su nombre: ");
		nombre = entrada.nextLine();
		
		System.out.println("bienvenido/a" + nombre);
		
	}

}
