import java.util.HashMap;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaMapas {

	public static void main(String[] args) {
		HashMap<String,Alumno> mapaAlumnos = new HashMap();
		
		mapaAlumnos.put("1111A",new Alumno("N1","1111A"));
		mapaAlumnos.put("2222B",new Alumno("N2","2222B"));
		mapaAlumnos.put("3333C",new Alumno("N3","3333C"));
		mapaAlumnos.put("4444D",new Alumno("N4","4444D"));
		mapaAlumnos.put("5555E",new Alumno("N5","5555E"));

		String dni = "3333C";
		Alumno a = mapaAlumnos.get(dni);
		System.out.println(a.getNombre());
		
	}

}
