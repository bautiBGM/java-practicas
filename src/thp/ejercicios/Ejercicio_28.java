package thp.ejercicios;

import java.util.Scanner;
public class Ejercicio_28 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int numCant;
		int numero;
		int mayor = 0;
		int pos = 0;
		
		System.out.println("ingrese la cantidad de veces que quiera ingresar un numero: ");
		numCant = Integer.parseInt(input.nextLine());
		
		for(int i = 1; i <= numCant; i++) {
			System.out.println("ingrese un numero: ");
			numero = Integer.parseInt(input.nextLine());
			if(numero > mayor) {
			mayor = numero;
			pos = i;
			}
		}
		System.out.println("el mayor numero de los ingresados es: " + mayor + " y su posicion es: " + pos);
	}

}
