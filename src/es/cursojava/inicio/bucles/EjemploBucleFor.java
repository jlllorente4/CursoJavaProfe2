package es.cursojava.inicio.bucles;

public class EjemploBucleFor {

	public static void main(String[] args) {
		//1� parte: inicializaci�n de las variables
		//2� parte: condici�n que se debe cumplir para que se ejecute el bloque de esntencias asociado
		//3� parte: como modificamos la variable por cada iteraci�n
		for (int i=0 ; i<100 ; i++ )  {
			if (i%2==0) {
				continue;//Mandar a la siguiente iteraci�n sin ejecutar el codigo posterior
			}
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
			if (i>=10) {
				break;//Rompe la ejecuci�n del bucle
			}
				
		}
		System.out.println("FIN");

	}

}
