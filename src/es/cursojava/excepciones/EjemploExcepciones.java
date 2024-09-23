package es.cursojava.excepciones;

import es.cursojava.poo.ejercicios.Alumno;

public class EjemploExcepciones {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		int[] numeros = {10,20,30};
		
		try {
			metodo1();
		} catch (MiExcepcion e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			System.out.println("entra");
			
			//System.out.println(alumno.getNombre().toUpperCase());
			//System.out.println(numeros[3]);
			int resultado = 7/0;
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Se ha intentado acceder a una posición de un array que no existe" + aiobe.getMessage());
		}catch(NullPointerException npe) {
			System.out.println("Se ha intentado acceder a un atributo que no existe" +npe.getMessage() );
		}catch(Exception e) {
			System.out.println("Se ha producido un error" + e.getMessage());
		}finally {
			System.out.println("continua");
		}

		System.out.println("FIN");

	}

	private static void metodo1 () throws MiExcepcion{
		if (Math.random()>0.5) {
			MiExcepcion me  = new MiExcepcion("Error propio crerado por mi");
			
			throw me;
			
		}else {
			System.out.println("Todo va bien");
		}
		
		
		
	}
	
	
}
