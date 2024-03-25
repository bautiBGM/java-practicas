package Ejercicio_14;

public class Main {

	public static void main(String[] args) {
		
		Promedio promedio = new Promedio();
		
		promedio.incrementar(8);
		promedio.incrementar(8);
		promedio.incrementar(8);
		
		
		System.out.println(promedio.obtenerValor());
	}

}
