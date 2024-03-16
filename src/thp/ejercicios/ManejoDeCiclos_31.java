package thp.ejercicios;

import java.util.Scanner;

public class ManejoDeCiclos_31 {

	public static Scanner input = new Scanner(System.in);
	static final char SUMA = '+';
	static final char RESTA = '-';
	static final char MULTIPLICACION = '*';
	static final char DIVISION = '/';
	static final char FIN = 'F';
	static final char SI = 'S';
	static final char NO = 'N';

	public static void main(String[] args) {

		char continuar;
		char operador;
		int num1 = 0;
		int num2 = 0;
		int suma;
		int resta;
		int multi;
		double divi;
		do {
			System.out.println(
					"ingrese una operacion a realizar : '+' para suma, '-' para resta, '*' para multiplicar, '/' para dividir");
			operador = input.nextLine().toUpperCase().charAt(0);

			if (operador == SUMA || operador == RESTA || operador == MULTIPLICACION || operador == DIVISION) {
				System.out.println("ingrese el primer numero: ");
				num1 = Integer.parseInt(input.nextLine());
				System.out.println("ingrese el segundo numero: ");
				num2 = Integer.parseInt(input.nextLine());
			}

			switch (operador) {
			case SUMA:
				suma = num1 + num2;
				System.out.println("la suma de los numeros es: " + suma);
				break;
			case RESTA:
				resta = num1 - num2;
				System.out.println("la resta de los numeros es: " + resta);
				break;
			case MULTIPLICACION:
				multi = num1 * num2;
				System.out.println("la multiplicacion de los numeros es: " + multi);
				break;
			case DIVISION:
				if (num2 != 0) {
					divi = num1 / num2;
					System.out.println("la division de los numeros es: " + divi);
				} else {
					System.out.println("no se puede dividir por cero");
				}
				break;
			case FIN:
				break;
			default:
				System.out.println("error");
				break;
			}

			System.out.println("desea continuar? ('S' para [si], 'N' para [no])");
			continuar = input.nextLine().toUpperCase().charAt(0);
			// toUpperCase() convierte todo a mayusculas
		} while (continuar != NO);
		System.out.println("gracias por usar esta calculadora");
		input.close();
	}
	
}

