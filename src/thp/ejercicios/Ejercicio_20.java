package thp.ejercicios;

import java.util.Scanner;
public class Ejercicio_20 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		int num1;
		int num2;
		int suma; 
		int resta;
		int multi;
		double divi;
		char operacion= ' ';
		
		System.out.println("ingrese el primer numero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("ingrese el segundo numero: ");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("ingrese una operacion a realizar : '+' para suma, '-' para resta, '*' para multiplicar, '/' para dividir");
		operacion = input.next().charAt(0);
		
		switch (operacion) {
		case '+':
			 suma = num1 + num2;
			 System.out.println("la suma de los numeros es: " + suma);
			break;
		case '-':
			resta = num1 - num2;
			System.out.println("la resta de los numeros es: " + resta);
			break;
		case '*':
			multi = num1 * num2;
			System.out.println("la multiplicacion de los numeros es: " + multi);
			break;
		case '/':
			if (num2 != 0) {
				divi = num1/num2;
				System.out.println("la division de los numeros es: " + divi);
			}else {
				System.out.println("no se puede dividir por cero");
			}
			break;
		default:
			System.out.println("error");
			break;
		}
	}

}
