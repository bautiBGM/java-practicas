package Ejercicio_12;


public class Main {

	public static int NUM_CERO = 0;
	public static void main(String[] args) {

		Calculadora calcular = new Calculadora();
		int numA = 1;
		int numB = 2;
		System.out.println(calcular.Sumar(numA, numB));
		System.out.println(calcular.Restar(numA, numB));
		System.out.println(calcular.Restar(numB, numA));
		System.out.println(calcular.Multiplicar(numA, numB));
		System.out.println(calcular.Dividir(numA, numB));
		System.out.println(calcular.Dividir(numB, numA));
		System.out.println(calcular.Dividir(numA, NUM_CERO));
		System.out.println(calcular.Dividir(numB, NUM_CERO));
		System.out.println(calcular.Dividir(NUM_CERO, numA));
		System.out.println(calcular.Dividir(NUM_CERO, numB));
	}

}
