package Ejercicio_2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		 // Crear algunos empleados
        Empleado empleado1 = new Empleado("Juan", "Perez", "001");
        Empleado empleado2 = new Empleado("María", "García", "002");
        Empleado empleado3 = new Empleado("Pedro", "Martínez", "003");

        // Crear algunas oficinas y agregar empleados a ellas
        Oficina oficina1 = new Oficina("001", new ArrayList<>());
        oficina1.agregarEmpleado(empleado1);
        Oficina oficina2 = new Oficina("002", new ArrayList<>());
        oficina2.agregarEmpleado(empleado2);
        oficina2.agregarEmpleado(empleado3);

        // Crear un área y agregar oficinas a ella
        Area area = new Area("Ventas", new ArrayList<>());
        area.agregarOficina(oficina1);
        area.agregarOficina(oficina2);

        // Mostrar información de los empleados por área y oficina
        System.out.println("=== Empleados por Área ===");
        System.out.println("Área: " + area.getNombreArea());
        for (Oficina oficina : area.getOficinas()) {
            System.out.println("Oficina: " + oficina.getNumOficina());
            for (Empleado empleado : oficina.getEmpleados()) {
                System.out.println(empleado);
            }
        }
		
	}

}
