package Ejercicio_11;

public class Turnera {

	static int turno = 0;
	
	public int otorgarProximoNumero() {
		return ++turno;
	}
	public int obtenerUltimoNumeroOtorgado() {
		
		return turno;
	}
	public void resetearContador() {
		resetearContador(0);
	}
	public void resetearContador(int i) {
		if (i>= 0) {
			turno = i;
		}
		
	}
}
