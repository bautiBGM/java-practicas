package Ejercicio_1;

import java.util.ArrayList;


public class Agenda {

	
	private ArrayList<Persona> listaPersonas;
	
	public Agenda() {
		this.listaPersonas = new ArrayList<Persona>();
	}
	
	public boolean modificarDomicilio(String dni, Domicilio domicilio) {
		boolean domicilioModificado = false;
		Persona personaDomicilio = buscarPersona(dni);
		if (personaDomicilio != null) {
			personaDomicilio.setDomicilio(domicilio);
			domicilioModificado = true;
		}
		return domicilioModificado;
		
	}
	public void removerPersona (String dni) {
		/* Creamos una variable inicializada de Persona y con el metodo buscarPersona() 
		   le asignamos la persona que buscamos
		   con el DNI que pasamos por parametro*/
		Persona personaARemover = buscarPersona(dni);
		boolean personaRemovida = false;
		if (personaARemover != null) {
			personaRemovida = this.listaPersonas.remove(personaARemover);
			if (personaRemovida) {
				System.out.println("Persona eliminada correctamente. " + personaARemover);
			}
		}else {
			System.out.println("La persona no se encuentra en la agenda");
		}
		
	}
	
	public boolean agregarPersona(Persona persona) {
		boolean resultado = false;
		if (this.buscarPersona(persona.getDni()) == null) {
			resultado = this.listaPersonas.add(persona);
			if (resultado) {
	            System.out.println("Persona agregada correctamente.");
	        }
	    } else {
	        System.out.println("La persona ya está en la agenda.");
		}
		
		return resultado;
	}
	
	private Persona buscarPersona(String dni) {
		int index = 0;
		Persona persona;
		Persona personaEncontrada = null;
		
		while (index < this.listaPersonas.size() && personaEncontrada == null) {
			persona = this.listaPersonas.get(index);
			if (persona.mismoDni(dni)) {
				personaEncontrada = persona;
			} else {
				index++;
			}
		}
		return personaEncontrada;
}
	public void listarPersonas() {
		for(Persona persona : this.listaPersonas) {
			System.out.println(persona);
		}
	}
	
}
