package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCondicional_19 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		int numero;
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbosGrupos = false;
		boolean noEstaEnNingunGrupo = false;
		
		System.out.println("ingrese un numero entero: ");
		numero = Integer.parseInt(input.nextLine());
		
		if((numero >= 0) && (numero <= 9)) {
			esDeUnSoloDigito = true;
		}
		if((numero % 2) != 0) {
			esImpar = true;
		}
		if((esDeUnSoloDigito == true) && (esImpar == true)) {
			estaEnAmbosGrupos = true; 
		}
		if ((esDeUnSoloDigito == false) && (esImpar == false)) {
			noEstaEnNingunGrupo = true;
		}
		
		System.out.println("el numero ingresado es: " + numero );
		
		
		if (esDeUnSoloDigito == true) {
			System.out.println("el numero es de un solo digito");
		}else {
			System.out.println("el numero es de dos o mas digitos");
		}
		if (esImpar == true) {
			System.out.println("el numero es impar");
		}else {
			System.out.println("el numero es par");
		}
		if (estaEnAmbosGrupos == true) {
			System.out.println("el numero esta en ambos grupos");
		}else {
			System.out.println("el numero no esta en ambos grupos");
		}
		if (noEstaEnNingunGrupo == true) {
			System.out.println("el numero no esta en ningun grupo");
		}else {
			System.out.println("el numero esta en uno de los grupos");
		}
	}

}
