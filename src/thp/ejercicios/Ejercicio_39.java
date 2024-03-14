package thp.ejercicios;

import java.util.Scanner;

public class Ejercicio_39 {

	public static Scanner input = new Scanner(System.in);
	static final int MIN_JUGADORES = 2;
	static final int TIROS_SEGUIDOS = 3;
	static final int PUNTAJE_MAX = 500;
	static final int PUNTAJE_MEDIO = 250;
	static final int PUNTAJE_MIN = 100;
	static final int CENTRO = 0;
	static final int MEDIO = 10;
	static final int MEDIO_LEJOS = 11;
	static final int LEJOS = 50;
	

	public static void main(String[] args) {

		String nombre;
		String ganador = "";
		int cantJugadores;
		int distanciaTiro = 0;
		int tiroCentro = 0;
		int sumaPuntaje = 0;
		int puntajeGanador = 0;
		int turno;
		int disparo;

		cantJugadores = pedirCantJugadores();

		for (turno = 0; turno < cantJugadores; turno++) {
			System.out.println("ingrese un nombre:");
			nombre = input.nextLine();
			sumaPuntaje = 0;
			for (disparo = 0; disparo < TIROS_SEGUIDOS; disparo++) {
				do {
					System.out.println("ingrese la distancia del tiro: ");
					distanciaTiro = Integer.parseInt(input.nextLine());
				} while (distanciaTiro < CENTRO);
				if (distanciaTiro == CENTRO) {
					tiroCentro++;
					sumaPuntaje = sumaPuntaje + PUNTAJE_MAX;
				}else 
					if(distanciaTiro <= MEDIO) {
						sumaPuntaje = sumaPuntaje + PUNTAJE_MEDIO;
					}else
						if(distanciaTiro >= MEDIO_LEJOS && distanciaTiro <= LEJOS) {
							sumaPuntaje = sumaPuntaje + PUNTAJE_MIN;
						}else {
							System.out.println("fuera del tablero");
						}
			}
			if (sumaPuntaje > puntajeGanador) {
				puntajeGanador = sumaPuntaje;
				ganador = nombre;
				
			}
			
		}
		System.out.println("el ganador es " + ganador + " y el puntaje que obtuvo es: " + puntajeGanador);
		System.out.println("la cantidad de tiros al centro en total son: " + tiroCentro);
		input.close();
	}
	private static int pedirCantJugadores() {
		int cantJugadores;
		do {
			System.out.println("ingresen la cantidad de jugadores, recuerden quedeben ser dos o mas: ");
			cantJugadores = Integer.parseInt(input.nextLine());
		} while (cantJugadores < MIN_JUGADORES);
		return cantJugadores;
	}
	

}
