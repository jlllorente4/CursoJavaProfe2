package es.cursojava.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaListas {

	public static void main(String[] args) {
		
		ArrayList<Alumno> listaAlumnos = new ArrayList();
		
		listaAlumnos.add(new Alumno("N1","1111A"));
		listaAlumnos.add(new Alumno("N2","2222B"));
		listaAlumnos.add(new Alumno("N3","3333C"));
		listaAlumnos.add(new Alumno("N4","4444D"));
		
		for ( Alumno alumno   : listaAlumnos ) {
			System.out.println(alumno.getNombre());
		}
		System.out.println("============================");
		Alumno alumnoNuevo = new Alumno("N5","5555E");
		listaAlumnos.add(0, alumnoNuevo);
		listaAlumnos.add(0, alumnoNuevo);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un dni");
		String dni = scan.nextLine();
		boolean alumnoEncontrado = false;
		for ( Alumno alumno   : listaAlumnos ) {
			if (alumno.getDni().equals(dni)) {
				System.out.println(alumno.getNombre());
				alumnoEncontrado = true;
				break;
			}
		}
		if(!alumnoEncontrado) {
			System.out.println("El alumno con dni"+dni+" no está en el colegio");
		}
		
		
		
	}

}
