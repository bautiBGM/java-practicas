package Ejercicio_10;

public class Principal {

	public static void main(String[] args) {

		Robot robot = new Robot ("Alfonso");
		
		Persona persona = new Persona("Juan" , "Alberto");
		
		
		robot.saludarSinNombre();
		robot.saludarConNombre(persona);
		

	}

}
