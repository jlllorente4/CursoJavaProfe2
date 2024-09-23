package es.cursojava.poo.ejercicios;

public class Aula {

	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println(arg);
		}
		//Crear 3 alumnos usando los 3 constructores disponibles (todos los datos)
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("A1");
		alumno1.setDni("1111A");
		alumno1.setNota(7);
		alumno1.setMayorEdad(true);
		
		Alumno alumno2 = new Alumno("A2","2222B");
		//alumno2.setNota(3);
		//alumno2.setMayorEdad(true);
		
		Alumno alumno3 = new Alumno("A3","3333C",10, true);
		
		alumno1.verNota();
		alumno2.verNota();
		alumno3.verNota();
		
		Alumno[] alumnos = {alumno1,alumno2,alumno3};
		System.out.println(alumnos[2].getNombre());
		
		Aula aula1 = new Aula();
		aula1.pintaDatosAlumnosAprobados(alumnos);
		
		System.out.println(alumnos[0]);
		
		
		Alumno.contador=6;
		System.out.println(alumno1.contador);//6
		alumno2.contador = 8;
		System.out.println(alumno1.contador);//8
		alumno3.contador = 10;
		System.out.println(alumno1.contador);//10
	}
	
	private void pintaDatosAlumnosAprobados (Alumno[] alumnosArray) {
		Math.random();
		//Bucle tradicional
		for (int i=0; i<alumnosArray.length; i++) {
			Alumno alumno = alumnosArray[i];
			if (alumno.getNota()>=5) {//El alumno ha aprobado
				System.out.println(alumno.getNombre() + " " + alumno.getDni());
			}
		}
		
		//Bucle foreach
		for ( Alumno alumno  :  alumnosArray ) {
			if (alumno.getNota()>=5) {//El alumno ha aprobado
				System.out.println(alumno.getNombre() + " " + alumno.getDni());
			}
		}
		
	}

}
	
