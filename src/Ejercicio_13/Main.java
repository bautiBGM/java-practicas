package Ejercicio_13;

public class Main {

	public static void main(String[] args) {
		
		SuperHeroe superheroe1 = new SuperHeroe("Batman", 90, 70, 0);
		SuperHeroe superheroe2 = new SuperHeroe("Superman", 95, 60, 70);
		SuperHeroe superheroe3 = new SuperHeroe("thor" , 90, 0, 90);
		SuperHeroe superheroe4 = new SuperHeroe("Spiderman", 90, 90, 0);
		
		
		System.out.println(superheroe1);
		System.out.println(superheroe2);
		System.out.println(superheroe3);
		System.out.println(superheroe4);
		
		System.out.println("-------------------");
		superheroe1.Competir(superheroe2);
		System.out.println("-------------------");
		superheroe2.Competir(superheroe1);
		System.out.println("-------------------");
		superheroe3.Competir(superheroe4);
		System.out.println("-------------------");
		superheroe4.Competir(superheroe3);
	}

}
