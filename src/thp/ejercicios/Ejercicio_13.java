package thp.ejercicios;

import java.util.Scanner;
public class Ejercicio_13 {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		int num1; 
		int num2;
		int num3;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Ingrese el segundo numero: ");
		num2 = Integer.parseInt(entrada.nextLine());
		System.out.println("Ingrese el tercer numero: ");
		num3 = Integer.parseInt(entrada.nextLine());
		
		if(num1 > num2 && num1 > num3 ) {
			System.out.println("el nuemro: " + num1 + " es el mayor");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("el numero: " + num2 + " es el mayor");
		}else if(num3 > num1 && num3 > num2){
			System.out.println("el numero: " + num3 + " es el mayor");
		}else {
			System.out.println("los numeros son iguales");
		}
	}

}
