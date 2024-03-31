package Ejercicio_1;

public class Domicilio {

	
	private String calle;
	private int numero;
	private String ciudad;
	
	public Domicilio(String calle, int numero, String ciudad) {
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}
	public void setCalle(String nuevaCalle) {
		this.calle = nuevaCalle;
	}
	public void setNumero (int nuevoNumero) {
		this.numero = nuevoNumero;
	}
	public void setCiudad (String nuevaCiudad) {
		this.ciudad = nuevaCiudad;
	}
	public String getCalle() {
		return this.calle;
	}
	public int getNumero() {
		return this.numero;
	}
	public String getCiudad() {
		return this.ciudad;
	}
	@Override
	public String toString() {
		return "Domicilio: calle " + calle + ", numero " + numero + ", ciudad " + ciudad ;
	}
}