package es.cursojava.inicio.bucles;

public class EjemploBucleFor {

	public static void main(String[] args) {
		//1ª parte: inicialización de las variables
		//2ª parte: condición que se debe cumplir para que se ejecute el bloque de esntencias asociado
		//3ª parte: como modificamos la variable por cada iteración
		for (int i=0 ; i<100 ; i++ )  {
			if (i%2==0) {
				continue;//Mandar a la siguiente iteración sin ejecutar el codigo posterior
			}
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
			if (i>=10) {
				break;//Rompe la ejecución del bucle
			}
				
		}
		System.out.println("FIN");

	}

}
