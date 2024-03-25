package Ejercicio_06;

public class Test {

	public static void main(String[] args) {

		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		
		
		System.out.println(dado1.toString());
		System.out.println(dado2.toString());

		int valorDadosIguales;
		
		if (dado1.getValorDado() == dado2.getValorDado()) {
			
			valorDadosIguales = dado1.getValorDado();
			System.out.println(" el resultado del tiro es igual: " + valorDadosIguales);
		}else if (dado1.getValorDado() > dado2.getValorDado()) {
			System.out.println("el resultado del dado uno es mayor: " + dado1.getValorDado());
		}else {
			System.out.println("el resultado del dado dos es mayor: " + dado2.getValorDado());
		}
		int acumulador1 = 0;
		int acumulador2 = 0;
		final int CANTIDAD = 100;
		for (int i = 1; i<= CANTIDAD; i++) {
			dado1.tirar();
			dado2.tirar();
			acumulador1 += dado1.getValorDado();
			acumulador2 += dado2.getValorDado();
		}
		double promedio1 = (double) acumulador1 / CANTIDAD;
		double promedio2 = (double) acumulador2 / CANTIDAD;
		System.out.println("promedio " + promedio1);
		System.out.println("promedio " + promedio2);
			
		
		
	}

}
