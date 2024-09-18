package es.cursojava.poo;

public class PistaAtletismo {

	public static void main(String[] args) {
		String texto = "Hola";
		
		Persona persona1 = new Persona();
		System.out.println(persona1.nombre);
		System.out.println(persona1.edad);
		persona1.nombre="Juan";
		System.out.println(persona1.nombre);
		
		
		Persona persona2 = new Persona();
		persona2.nombre="Eva";
		
		
		Persona persona3 = new Persona();
		persona3.nombre="Loli";
		
		
		persona1.correr();
		persona2.correr();
		persona3.correr();
		
		Persona persona4 = persona1;
		persona4.nombre = "Jose";
		System.out.println(persona1.nombre);//Jose
		System.out.println(persona4.nombre);//Jose
		
		
		System.out.println("Fin");
	}

}
