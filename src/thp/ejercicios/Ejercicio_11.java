package thp.ejercicios;

import java.util.Scanner;
public class Ejercicio_11 {
	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {

	int num; 
	int resto;
	
	System.out.println("ingrese un numero: ");
	num = Integer.parseInt(entrada.nextLine());
	resto = num % 2;
	
	if(resto == 0) {
		System.out.println("el numero es par");
	}else{
		System.out.println("el numero es impar");
	}
	
		
	}

}
