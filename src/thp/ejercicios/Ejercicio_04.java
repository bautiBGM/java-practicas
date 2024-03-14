package thp.ejercicios;

import java.util.Scanner;

public class Ejercicio_04 {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		int valorHoraTrabajo;
		int cantHoras;
		int salario;
		int mitadHoraSabado;
		int horasTotal;
		System.out.println("Ingrese el valor monetario por hora de trabajo: ");
		valorHoraTrabajo = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Ingrese la cantidad de horas trabajadas en un dia: ");
		cantHoras = Integer.parseInt(entrada.nextLine());
		
		mitadHoraSabado = cantHoras / 2;
		horasTotal = (cantHoras * 5) + mitadHoraSabado;
		salario = valorHoraTrabajo * horasTotal;
		System.out.println("el salario total por semana de trabajo es:" + salario);
		
	}

}
