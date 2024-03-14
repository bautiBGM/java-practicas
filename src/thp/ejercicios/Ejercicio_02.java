package thp.ejercicios;

import java.util.Scanner;
public class Ejercicio_02 {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		double primerTrim;
		double segundoTrim;
		double tercerTrim;
		double sumaNotas;
		double promedio;
						
		
		System.out.println("Ingrese la nota del primer trimestre: ");
		primerTrim = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Ingrese la nota del segundo trimestre: ");
		segundoTrim = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Ingrese la nota del tercero trimestre: ");
		tercerTrim = Double.parseDouble(entrada.nextLine());
		
		sumaNotas = primerTrim + segundoTrim + tercerTrim;
		promedio = sumaNotas / 3;
		
		System.out.println("El promedio de las tres notas es: " +  promedio);
		
	}

}
