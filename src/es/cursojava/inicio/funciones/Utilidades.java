package es.cursojava.inicio.funciones;

public class Utilidades {
	
	static boolean validarEmail (String email) {
		System.out.println("Validando email "+email);
		
		return true;
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
}
