package Ejercicio_09;

public class Persona {

	private int dni;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	
	
	
	public Persona(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public int getDni() {
		return dni;
	}
	private void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}
	
	
	public String toString() {
		return " Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni + ", Direccion" + domicilio + ".";
	}
	
	
}
