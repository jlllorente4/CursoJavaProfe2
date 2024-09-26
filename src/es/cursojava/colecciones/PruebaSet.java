package es.cursojava.colecciones;

import java.util.HashSet;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Alumno> setAlumnos = new HashSet();

		setAlumnos.add(new Alumno("N1","1111A"));
		setAlumnos.add(new Alumno("N2","2222B"));
		setAlumnos.add(new Alumno("N3","3333C"));
		setAlumnos.add(new Alumno("N4","4444D"));
		
		Alumno alumnoNuevo = new Alumno("N5","5555E");
		setAlumnos.add(alumnoNuevo);
		setAlumnos.add(alumnoNuevo);
		
		for (Alumno alumno : setAlumnos) {
			System.out.println(alumno.getNombre());
		}
		
	}

}
