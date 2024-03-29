package Ejercicio_09;

public class Domicilio {

	private String calle;
	private int altura;
	private String barrio;
	
	
	
	public Domicilio(String calle, int altura, String barrio) {
		this.calle = calle;
		this.altura = altura;
		this.barrio = barrio;
	}
	
	public String getCalle() {
		return calle;
	}
	private void setCalle(String calle) {
		this.calle = calle;
	}
	public int getAltura() {
		return altura;
	}
	private void setAltura(int altura) {
		this.altura = altura;
	}
	public String getBarrio() {
		return barrio;
	}
	private void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	@Override
	public String toString() {
		return ", calle: " + calle + ", altura: " + altura + ", barrio: " + barrio;
	}
	
	
}
