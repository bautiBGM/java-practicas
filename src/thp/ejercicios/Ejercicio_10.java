package thp.ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
	public static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {

	String nombre1;
	String nombre2;
	String nombre3;
	
	double aporte1; 
	double aporte2; 
	double aporte3; 
	double totalAporte;	
	double porcentaje1; 
	double porcentaje2; 
	double porcentaje3;
	
	System.out.println("Ingrese el primer nombre: ");
	nombre1 = entrada.nextLine();	
	System.out.println("Ingrese lo aportado de la primera persona: ");
	aporte1 = Double.parseDouble(entrada.nextLine());
	
	System.out.println("Ingrese el segundo nombre: ");
	nombre2 = entrada.nextLine();
	System.out.println("Ingrese lo aportado de la segunda persona: ");
	aporte2 = Double.parseDouble(entrada.nextLine());
	
	System.out.println("Ingrese el tercer nombre: ");
	nombre3 = entrada.nextLine();
	System.out.println("Ingrese lo aportado de la tercera persona: ");
	aporte3 = Double.parseDouble(entrada.nextLine());
	
	totalAporte = aporte1 + aporte2 + aporte3;
	porcentaje1 = 100 *(aporte1 / totalAporte);
	porcentaje2 = 100 *(aporte2 / totalAporte);
	porcentaje3 = 100 *(aporte3 / totalAporte);
	
	System.out.println("el total aportado es de: $" + totalAporte);
	System.out.println("lo aportado por " + nombre1 + " es de: " + porcentaje1 + "%");
	System.out.println("lo aportado por " + nombre2 + " es de: " + porcentaje2 + "%");
	System.out.println("lo aportado por " + nombre3 + " es de: " + porcentaje3 + "%");

	
	}

}
