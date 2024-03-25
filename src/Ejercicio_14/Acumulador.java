package Ejercicio_14;

public class Acumulador {

	private double acumulador;
	
	public Acumulador() {
		this.acumulador = 0.0;
	}

	public void incrementarValor(double cantIncrementar) {
		this.acumulador = cantIncrementar;
	}
	
	public double obtenerValor() {
		return this.acumulador;
		
	}
}
