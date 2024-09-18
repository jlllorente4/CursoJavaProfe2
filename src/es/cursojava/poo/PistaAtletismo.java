package es.cursojava.poo;

public class PistaAtletismo {

	public static void main(String[] args) {
		String texto = "Hola";
		
		Persona persona0 = new Persona("N1","A1","1111A",36);
		//System.out.println(persona0.getNombre());
		
		Persona persona1 = new Persona("Juan","A2","222B",24);
		//System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());
		persona1.setNombre("Juan");
		//persona1.setDni("123123D");
		System.out.println(persona1.getNombre());
		
		
		Persona persona2 = new Persona("Eva","A3","333C",48);
		//persona2.setNombre("Eva");
		
		
		Persona persona3 = new Persona("Loli","A4","444D",18);
		//persona3.setNombre("Loli");
		
		
		persona1.correr();
		persona2.correr();
		persona3.correr();
		
		Persona persona4 = persona1;
		persona4.setNombre("Jose");
		System.out.println(persona1.getNombre());//Jose
		System.out.println(persona4.getNombre());//Jose
		
		
		System.out.println("Fin");
	}

}
