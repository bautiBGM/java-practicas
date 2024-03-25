package Ejercicio_13;

public class SuperHeroe {

	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;

	private final int VALOR_MINIMO = 0;
	private final int VALOR_MAXIMO = 100;

	public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		super();
		this.setNombre(nombre);
		this.setFuerza(fuerza);
		this.setResistencia(resistencia);
		this.setSuperpoderes(superpoderes);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setFuerza(int fuerza) {
		if (fuerza < VALOR_MINIMO) {
			fuerza = VALOR_MINIMO;
		} else if (fuerza > VALOR_MAXIMO) {
			fuerza = VALOR_MAXIMO;
		}
		this.fuerza = fuerza;
	}

	private void setResistencia(int resistencia) {
		if (resistencia < VALOR_MINIMO) {
			resistencia = VALOR_MINIMO;
		} else if (resistencia > VALOR_MAXIMO) {
			resistencia = VALOR_MAXIMO;
		}
		this.resistencia = resistencia;
	}

	private void setSuperpoderes(int superpoderes) {
		if (superpoderes < VALOR_MINIMO) {
			superpoderes = VALOR_MINIMO;
		} else if (superpoderes > VALOR_MAXIMO) {
			superpoderes = VALOR_MAXIMO;
		}
		this.superpoderes = superpoderes;
	}

	public void Competir(SuperHeroe superheroe2) {
		int cont = 0;
		Resultado resultadoBatalla = Resultado.EMPATE;
		if (this.fuerza > superheroe2.fuerza) {
			cont++;
		} else if (this.fuerza < superheroe2.fuerza) {
			cont--;
		}
		if (this.resistencia > superheroe2.resistencia) {
			cont++;
		} else if (this.resistencia < superheroe2.resistencia) {
			cont--;
		}
		if (this.superpoderes > superheroe2.superpoderes) {
			cont++;
		} else if (this.superpoderes < superheroe2.superpoderes) {
			cont--;
		}
		if (cont > 0) {
			resultadoBatalla = Resultado.TRIUNFO;
			System.out.println(
					resultadoBatalla + " de " + this.nombre + " en el enfrentamiento con " + superheroe2.nombre);
		} else if (cont < 0) {
			resultadoBatalla = Resultado.DERROTA;
			System.out.println(
					resultadoBatalla + " de " + this.nombre + " en el enfrentamiento con " + superheroe2.nombre);

		} else {
			System.out.println("El resultado de la batalla entre: " + this.nombre + " vs " + superheroe2.nombre
					+ " fue " + resultadoBatalla);
		}

	}

	public String toString() {
		return nombre + ", fuerza: " + fuerza + ", resistencia: " + resistencia + ", superpoderes: " + superpoderes;
	}

}
