package thp.ejercicios;

import java.util.Scanner;

public class Ejercicio_09 {

	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		double  angulo1;
		double  angulo2;
		final int ANGULO_TOTAL = 180;
		double sumaAngulos;
		System.out.println("ingrese el primer numero:");
		angulo1 = Double.parseDouble(entrada.nextLine());
		
		System.out.println("ingrese el segundo numero:");
		angulo2 = Double.parseDouble(entrada.nextLine());
		
		sumaAngulos = ANGULO_TOTAL - (angulo1 + angulo2);
		
		System.out.println("el valor del angulo restante es: " + sumaAngulos);
	}

}
