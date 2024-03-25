package Ejercicio_06;

public class Dado {

	private static final int DEFAULT_CARAS = 6;
	private int valorDado;
	private int caras;
	
	
	public Dado() {
		this(DEFAULT_CARAS);
	}
	
	public Dado(int caras) {
		this.caras = caras;
		tirar();
	}

	public void tirar() {
		valorDado = (int)(1 + Math.random() * caras);
	}

	public int getValorDado() {
		return valorDado;
	}

	@Override
	public String toString() {
		return "Dado [caras=" + caras + ", valor=" + valorDado + "]";
	}

	
	
}
