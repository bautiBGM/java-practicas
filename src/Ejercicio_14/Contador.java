package Ejercicio_14;

public class Contador {

	private int contador=0;
	
	
	public Contador() {
		
		this.contador = 0;
	}
	public int incrementarValor() {
		return this.contador++;
		
	}
	public int obtenerValor() {
		return this.contador;
	}
}
