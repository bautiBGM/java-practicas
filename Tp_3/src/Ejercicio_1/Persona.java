package Ejercicio_1;

public class Persona {

	private  String dni;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	
	
	public Persona(String dni,String nombre, String apellido, Domicilio domicilio) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
	}

	public String getDni() {
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

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public boolean mismoDni(String dni) {
		return this.dni.equals(dni);
	}

	@Override
	public String toString() {
		return "lista nombre: " + nombre + ", apellido " + apellido +  ", dni " + dni + ", " + domicilio;
				 
	}

	
}
