package thp.ejercicios;

import java.util.Scanner;
public class Ejercicio_18 {

	public static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {

		int num1;
		int num2;
		
		
			System.out.println("ingrese el primer numero: ");
			num1 = Integer.parseInt(entrada.nextLine());
			System.out.println("ingrese el segundo numero: ");
			num2 = Integer.parseInt(entrada.nextLine());
			
		if (num1 > num2 && num1%num2 == 0) {
				System.out.println("el numero mayor: " + num1 + " es divisible por el menor: "+ num2);
				}
		
		else if (num2 > num1 && num2%num1 == 0) {
				System.out.println("el numero mayor: " + num2 + " es divisible por el menor: "+ num1);
				}else {
				System.out.println("el mayor y el menor no son divisibles");
			
		}
			
					
	}

}
