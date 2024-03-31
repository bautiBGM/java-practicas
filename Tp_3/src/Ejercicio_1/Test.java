package Ejercicio_1;

public class Test {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		Domicilio domicilio = new Domicilio("Baradero", 457, "vicente lopez");
		Domicilio domicilio1 = new Domicilio("sucre", 2950, "Belgrano");
		Persona persona1 = new Persona ("233","bauti","gayoso", domicilio);
		Persona persona2 = new Persona ("555","tomas","gayoso", domicilio);
		Persona persona3 = new Persona ("244","sofi","gayoso", domicilio);
		Persona persona4 = new Persona ("123","agus","gayoso", domicilio);
		
		
		
		System.out.println(agenda.agregarPersona(persona1));
		System.out.println(agenda.agregarPersona(persona2));
		System.out.println(agenda.agregarPersona(persona3));
		System.out.println(agenda.agregarPersona(persona4));
		
		
		agenda.removerPersona("555");

		
		
		System.out.println("-------------");
		agenda.listarPersonas();
		System.out.println("----------------");
		System.out.println(agenda.modificarDomicilio("233", domicilio1));
		
	}

	

}
