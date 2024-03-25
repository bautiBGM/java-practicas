package Ejercicio_11;

public class Test {

	public static void main(String[] args) {

		Turnera turno1 = new Turnera();
		
		System.out.println(turno1.otorgarProximoNumero());
		System.out.println(turno1.otorgarProximoNumero());
		System.out.println(turno1.otorgarProximoNumero());
		
		System.out.println("Ultimo turno " + turno1.obtenerUltimoNumeroOtorgado());
		
		turno1.resetearContador();
		System.out.println(turno1.otorgarProximoNumero());
		System.out.println(turno1.otorgarProximoNumero());
		
		
		
	}

}
