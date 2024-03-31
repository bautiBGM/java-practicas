package Ejercicio_2;

public class Empleado {

	private String nombre;
	private String apellido;
	private String codId;
	
	
	public Empleado(String nombre, String apellido, String codId) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codId = codId;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getCodId() {
		return codId;
	}
	
	public void setCodId(String codId) {
		this.codId = codId;
	}
	
	public boolean mismoCodId(String codId) {
		return this.codId.equals(codId);
	}

	@Override
	public String toString() {
		return "Empleado=  nombre: " + nombre + ", apellido: " + apellido + ", codId: " + codId + ".";
	}

	
	
}
