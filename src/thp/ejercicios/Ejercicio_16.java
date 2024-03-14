package thp.ejercicios;

import java.util.Scanner;

public class Ejercicio_16 {

	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {

	int cantInscriptos;
	int cantAsientosDisp;
	int asientosFal;
	System.out.println("Ingrese la cantidad de personas inscriptas: ");
	cantInscriptos = Integer.parseInt(entrada.nextLine());
	
	System.out.println("Ingrese la cantidad de asientos disponibles: ");
	cantAsientosDisp = Integer.parseInt(entrada.nextLine());
	
	if(cantInscriptos <= cantAsientosDisp) {
		System.out.println("los asientos alcanzan.");
	}else {
		asientosFal = cantInscriptos - cantAsientosDisp;
		System.out.println("los asientos no alcanzan, faltan: " + asientosFal);
	}
	}

}
