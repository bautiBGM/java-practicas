package thp.ejercicios;

import java.util.Scanner;
public class Ejercicio_07 {

	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		double ancho; 
		double largo; 
		double valorMetroCuadrado;
		double valorTotal; 
		double cantMetrosAlambre;
		double superficie; 
		double perimetro;
		
		System.out.println("Ingrese el ancho del terreno: ");
		ancho = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Ingrese el largo del terreno: ");
		largo = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Ingrese el valor del metro cuadrado del terreno: ");
		valorMetroCuadrado = Double.parseDouble(entrada.nextLine());
		
		superficie = ancho * largo;
		valorTotal = superficie * valorMetroCuadrado;
		perimetro = (ancho*2) + (largo*2);
		cantMetrosAlambre = perimetro * 3;
		
		System.out.println("El valor total del terreno es: " + valorTotal);
		System.out.println("la cantidad de metros de alambre que se necesitan son: " + cantMetrosAlambre);
		
	}

}
