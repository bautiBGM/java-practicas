package Ejercicio_02_5;

public class Test {

	public static void main(String[] args) {
		
		//crear la persona 
		Persona persona1 = new Persona("fulano","Gomez");
		
		//crear el domicilio
		Domicilio direccion1 = new Domicilio();
		
		// ponerle nombre y apellido al la persona1 
		//persona1.setNombre("Fulano");
		//persona1.setApellido("Gomez");
		// ponerle direccion a la persona1
		direccion1.setCalle("yatay");
		direccion1.setNumero(2323);
		direccion1.setCiudad("CABA");
		//asignarle la direccion a la persona 
		persona1.setDireccion(direccion1);
		
		System.out.println(persona1.getNombreCompleto() +" ,"+ persona1.getDireccion());
		
		
		//crear otra persona
		Persona persona2 = new Persona("maria","magdalena");
		//crear otro domicilio
		Domicilio direccion2 = new Domicilio();
		//ponerle nombre y apellido a la persona2
		//persona2.setNombre("Maria Marta");
		//persona2.setApellido("Magdalena");
		
		// ponerle direccion a la persona2 
		direccion2.setCalle("baradero");
		direccion2.setNumero(457);
		direccion2.setCiudad("Bs. As.");
		//asignarle la direccion a la persona
		persona2.setDireccion(direccion2);
		System.out.println(persona2.getNombreCompleto() + ", " + persona2.getDireccion());
	}


}
