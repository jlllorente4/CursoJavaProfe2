package es.cursojava.inicio.funciones;

public class EjemplosFunciones { 

	public static void main(String[] args) {
		
		
//		int numero = 2;
//		System.out.println(numero);//2
//		funcion1(numero);
//		System.out.println(numero);//2
		
//		int[] numeros = {1,2,3,4};
//		System.out.println(numeros[0]);//1
//		funcion1(numeros);
//		System.out.println(numeros[0]);//6
		
		int anio = calculaAnioNacimiento(30);
		System.out.println(anio);
		
		Utilidades.validarEmail("asdasd@asdas.es");
		Utilidades.pintaTablaMultiplicar(10);
		//Utilidades.funcionPrivada();//No se puede porque la función es privada
		
		System.out.println(Math.random());
		
		String numero = "3";
		int num = Integer.parseInt(numero);
		
		
	}
	
	//Sobrecargar una funcion
	public static void funcion1 () {
		
		
		System.out.println("Llamando a la funcion1");
	}
	
	public static void funcion1 (String texto) {
		System.out.println("Llamando a la funcion1" + texto);
	}
	
	//Paso por valor (tipos primitivos)
	public static void funcion1 (int n) {
		n = 3;
		System.out.println("Llamando a la funcion1 " + n);//3
	}
	
	//Paso por referencia
	public static void funcion1 (int[] numerosArray) {
		numerosArray[0]=6;
		System.out.println(numerosArray[0]);//6
	}
	
	private static int calculaAnioNacimiento(int edad) {
		int anioNacimiento = 0;
		
		anioNacimiento = 2024-edad;
		
		return anioNacimiento;
	}

}
