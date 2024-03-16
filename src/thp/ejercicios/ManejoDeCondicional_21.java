package thp.ejercicios;

import java.util.Scanner; 
public class ManejoDeCondicional_21 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		
	int numSemana;
	
	System.out.println("ingrese un numero del 1 al 7: ");
	numSemana = Integer.parseInt(input.nextLine());
	
	switch (numSemana) {
	case 1:
		System.out.println("el dia de la semana elegido es domingo");
		break;
	case 2:
		System.out.println("el dia de la semana elegido es Lunes");
		break;
	case 3:
		System.out.println("el dia de la semana elegido es martes");
		break;
	case 4:
		System.out.println("el dia de la semana elgido es miercoles");
		break;
	case 5:
		System.out.println("el dia de la semana elegido es jueves");
		break;
	case 6:
		System.out.println("el dia de la semana elegido es viernes");
		break;
	case 7:
		System.out.println("el dia de la semana elegido es sabado");
		break;
	default:
		System.out.println("error al elegir el numero");
		break;
	}
	}

}
