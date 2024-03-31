package Ejercicio_2;

import java.util.ArrayList;

public class Area {

	
	private String nombreArea;
	private ArrayList<Oficina> listarOfis;
	
	
	public Area(String nombreArea, ArrayList<Oficina> listarOfis) {
		this.nombreArea = nombreArea;
		this.listarOfis = listarOfis;
	}
	
	
	public ArrayList<Oficina> getOficinas() {
		return listarOfis;
	}
	
	public void setOficinas(ArrayList<Oficina> listarOfis) {
		this.listarOfis = listarOfis;
	}
	
	public String getNombreArea() {
		return nombreArea;
	}
	
	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}
	
	public boolean agregarOficina(Oficina oficina) {
        return listarOfis.add(oficina);
    }

    public boolean eliminarOficina(Oficina oficina) {
        return listarOfis.remove(oficina);
    }
	
}
