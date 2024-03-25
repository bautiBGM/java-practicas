package Ejercicio_14;

public class Promedio {

	private Contador contador;
	private Acumulador acumulador;
	
	 public Promedio() {
	        this.acumulador = new Acumulador();
	        this.contador = new Contador();
	    }
	 
	public void incrementar(double valor) {
		this.acumulador.incrementarValor(valor);
		this.contador.incrementarValor();
		}
	
	public double obtenerValor() {
		double cantidadNotas = this.contador.obtenerValor();
		if (cantidadNotas == 0) {
			cantidadNotas=0;
		}else {
			cantidadNotas = this.acumulador.obtenerValor() / cantidadNotas;
		}
		return cantidadNotas;
	}
}
