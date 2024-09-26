package es.cursojava.inicio.funciones;

public class Utilidades {
	
	public static boolean validarEmail (String email) {
		System.out.println("Validando email "+email);
		boolean valido = email.contains("@");
		if (!email.endsWith("@hotmail.com")) {
			valido = false;
		}
		return valido;
	}
	
	public static void funcionTest() {
		System.out.println("Funcion Test");
		funcionPrivada();
	}
	
	private static void funcionPrivada() {
		System.out.println("Funcion Privada");
		pintaTablaMultiplicar(6);
	}
	
	public static void pintaTablaMultiplicar (int numero) {
		for (int i=1 ; i<=10 ; i++) {
			System.out.println(i + " X " + numero + " = " + (i*numero));
		}
	}
	
	public int suma (int num1, int num2) {
		return num1 + num2;
	}
	
	public int resta (int num1, int num2) {
		return num1 - num2;
	}
	
	public int division (int num1, int num2) {
		return num1 / num2;
	}
}
