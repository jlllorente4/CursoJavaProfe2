package es.cursojava.inicio;

/*
 Comentario de bloque 
  
 */

//Comentario de linea
public class Variables {
	//Variables de instancia
	public static void main(String[] args) {
		//Variables locales
		var peso = 80.5;
		
		//Tipos primivitivos
		byte num1 = 1;// -128 a 127
		short num2 = 2;// -32,768 a 32,767.
		int numero = 7;//-2,147,483,648 a 2,147,483,647.
		long num3 = 5;//-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
		
		//Para poder trabajar con una variable local antes hay que inicializarla
		//int edad;//No se podría usar porque no está inicializada
		//System.out.println("Edad: "+edad);
		
		double numeroDecimal1 = 7.5;
		float numeroDecimal2 = 7.5f;
		
		boolean esMayorEdad = true;
		
		char caracter = 's';
		
		
		//Tipos Objeto
		String nombre = "Jose Luis";
		int[] notas = {7,9,4,5,6,9};
		
		System.out.println(nombre + (numero + 3) * 3 );
		System.out.println(numero + notas[0]);
	}

}
