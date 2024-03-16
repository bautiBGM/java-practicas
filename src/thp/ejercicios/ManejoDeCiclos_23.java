package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCiclos_23 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		
		int num;
		int multi;
		System.out.println("ingrese un numero");
		num = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= 10; i++) {
			multi = i * num;
			System.out.println(multi);
		}
		
	}

}
