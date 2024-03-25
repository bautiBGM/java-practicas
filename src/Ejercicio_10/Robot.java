package Ejercicio_10;

public class Robot {

	
	private String nombreRobot;
	
	public Robot(String nombreRobot) {
		this.nombreRobot = nombreRobot;
	}

	
	
	public void saludarSinNombre() {
		System.out.println("Hola, mi nombre es " + nombreRobot + " ¿En qué puedo ayudarte?");
	}
	
	public void saludarConNombre(Persona persona) {
		System.out.println("Hola " + persona.getNombreCompleto() + ", mi nombre es " + nombreRobot + " ¿En qué puedo ayudarte?");
	}
}
