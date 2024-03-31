package Ejercicio_2;

import java.util.ArrayList;

public class Oficina {

	
	
	private String numOficina;
	private ArrayList<Empleado> empleados;
	
	
	public Oficina( String numOficina, ArrayList<Empleado> listarEmpleados) {
		
		this.numOficina = numOficina;
		this.empleados = listarEmpleados;
	}
	public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
	public String getNumOficina() {
		return numOficina;
	}
	
	public void setNumOficina(String numOficina) {
		this.numOficina = numOficina;
	}
	
	 public boolean eliminarEmpleado(String codId) {
		 Empleado empleado = buscarEmpleado(codId);
	        boolean empleadoRemovido = false;
	        if(empleado != null) {
	        	empleadoRemovido = empleados.remove(empleado);
	        }
		 return empleadoRemovido;
	    }
	public boolean agregarEmpleado(Empleado empleado) {
		boolean resultado = false;
		if (this.buscarEmpleado(empleado.getCodId()) == null) {
			resultado = this.empleados.add(empleado);
		}
		return resultado;
	}
	
	public Empleado buscarEmpleado(String codId) {
		int index = 0;
		Empleado empleado;
		Empleado empleadoEncontrado = null;
		
		while (index < this.empleados.size() && empleadoEncontrado == null) {
			empleado = this.empleados.get(index);
			if (empleado.mismoCodId(codId)) {
				empleadoEncontrado = empleado;
			} else {
				index++;
			}
		}
		return empleadoEncontrado;
}
}
