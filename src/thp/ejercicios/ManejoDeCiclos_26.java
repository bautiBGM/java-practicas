package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCiclos_26 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		int numero;
		int multiploTres;
		int multiploCinco;
		System.out.println("ingrese un numero: ");
		numero = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= numero; i++) {
			multiploTres = i % 3;
			multiploCinco = i % 5;
			if (multiploTres == 0 ) {
			}else
				if(multiploCinco != 0) {
				System.out.println(i);
				multiploTres = 0;
				multiploCinco = 0;
			}
		}
	}

}
