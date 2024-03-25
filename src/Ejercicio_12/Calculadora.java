package Ejercicio_12;

public class Calculadora {

	
	
	public int Sumar(int num1, int num2) {
		
		return num1 + num2;
	}
	public int Restar(int num1, int num2) {
		
		return num1 - num2;
	}
	public int Multiplicar(int num1, int num2) {
		
		return num1 * num2;
	}
	
	public int Dividir (int num1, int num2) {
		int dividido = 0; 
		if (num2 != 0) {
			int dividiendo = num1 / num2;
			dividido = dividiendo;
		}
		
		return dividido;
	}
	
}
