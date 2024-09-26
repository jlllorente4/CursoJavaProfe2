package es.cursojava.poo.herencia;

public class Zoologico {

	public static void main(String[] args) {
		
		Vaca vaca1 = new Vaca(1,"Vaca1","",200,2);
		Vaca vaca2 = new Vaca(2,"Vaca2","",300,1);

		vaca1.mugir();
		vaca2.mugir();
		
		vaca1.comer();
		vaca2.beber();
		
		Leon leon1 = new Leon(3,"Leon1","",250, "Roja");
		leon1.comer();
		Serpiente serpiente1 = new Serpiente(4,"Serpiente1","",10,true);
		//Animal animal1 = new Animal(4,"Animal","",250);
		System.out.println("==========================");
		Animal [] animales = {vaca1,vaca2,leon1,serpiente1};
		for (Animal animal : animales) {
			animal.beber();
			animal.comer();
			
			if(animal instanceof Vaca) {
				//Hacer un cast
				Vaca v = (Vaca)animal;
				v.mugir();
			}
		}
		
		System.out.println("==========================");
		Animal animal = new Leon(5,"Leon2","",250, "Roja");
		animal.beber();
		
		System.out.println(vaca1);
	}

}
