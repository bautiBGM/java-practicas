package thp.ejercicios;

import java.util.Scanner;
public class ManejoDeCiclos_27 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

	int edad; 
	int sumaEdad = 0;
	int promedio;
	int resto = 0;
	int cantImpares = 0;
	for (int i = 1; i <= 5; i++) {
		System.out.println("ingrese una edad: ");
		edad = Integer.parseInt(input.nextLine());
		sumaEdad = sumaEdad + edad;
		if(edad > 18) {
			resto = edad % 2;
		}else
			if(resto != 0) {
				cantImpares += 1;
			}
	}
	promedio =  (sumaEdad / 5);	
	 System.out.println("el promeido de las edades es: " +promedio +" y la cantidad de edades impares mayores a 18 son: "+ cantImpares);
	}

}
