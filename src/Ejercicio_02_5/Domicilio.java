package Ejercicio_02_5;

public class Domicilio {

	private String calle;
	private int numero;
	private String ciudad;
	
	
	public Domicilio() {
		setCalle("");
		setNumero(0);
		setCiudad("");
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	//Para que tome los int y se printee normal
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}
	
	
	
	
}
