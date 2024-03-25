package Ejercicio_02_5;

public class Persona {

	private int dni;
	private String nombre;
	private String apellido;
	private Domicilio direccion;
	
	
	public Persona(String nombre, String apellido) {
		setDni(dni);
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	private void setDni(int dni) {
		this.dni = dni;
	}
	public int getDni() {
		return dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}

	public Domicilio getDireccion() {
		return direccion;
	}

	public void setDireccion(Domicilio direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona dni=" + dni + "";
	}

	

	
	
}
