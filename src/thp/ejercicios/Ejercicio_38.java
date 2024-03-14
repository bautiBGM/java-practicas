package thp.ejercicios;

import java.util.Scanner;

public class Ejercicio_38 {

	public static Scanner input = new Scanner(System.in);
	static final int INTENTOS = 3;
	static final String USUARIO_CORRECTO = "admin";
	static final String CONTRASEÑA_CORRECTA = "123456";
	static final String CORRECTO = "Acceso concedido";
	static final String INCORRECTO = "Se ha bloqueado la cuenta";

	public static void main(String[] args) {

		String usuario;
		String contraseña;
		int contIntentos = 0;

		System.out.println("Ingrese su nombre de usuario: ");
		usuario = input.nextLine();

		System.out.println("Ingrese su contraseña: ");
		contraseña = input.nextLine();

		while (!(usuario.equals(USUARIO_CORRECTO)) && (contIntentos != INTENTOS)
				|| (!(contraseña.equals(CONTRASEÑA_CORRECTA))) && (contIntentos != INTENTOS)) {
			contIntentos = contIntentos + 1;

			System.out.println("Usuario o contraseña incorrecto.");
			System.out.println("Ingrese su nombre de usuario nuevamente: ");
			usuario = input.nextLine();

			System.out.println("Ingrese su contraseña nuevamente: ");
			contraseña = input.nextLine();
		}

		if (usuario.equals(USUARIO_CORRECTO) && (contraseña.equals(CONTRASEÑA_CORRECTA))) {
			System.out.println(CORRECTO);
		} else {
			System.out.println(INCORRECTO);
		}
	}

}
