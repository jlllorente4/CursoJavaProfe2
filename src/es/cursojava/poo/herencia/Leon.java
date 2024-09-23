package es.cursojava.poo.herencia;

public class Leon extends Animal {
	private String colorMelena;
	
	public Leon(long id, String nombre, String fechNacimiento, double peso) {
		super(id, nombre, fechNacimiento, peso);
		// TODO Auto-generated constructor stub
	}

	public Leon(long id, String nombre, String fechNacimiento, double peso, String colorMelena) {
		super(id, nombre, fechNacimiento, peso);
		this.colorMelena = colorMelena;
	}

	@Override
	public void comer() {
		System.out.println("El León "+ getNombre() + " está mordiendo la presa");
	}

	@Override
	public String toString() {
		return "Leon [colorMelena=" + colorMelena + 
				", id=" + getId() + 
				", nombre=" + getNombre() + "]";
	}
	
	@Override
	public void beber() {
		System.out.println("El león "+ getNombre() + " está bebiendo");
	}
	
}
