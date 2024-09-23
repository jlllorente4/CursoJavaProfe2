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
		System.out.println("El Le�n "+ getNombre() + " est� mordiendo la presa");
	}

	@Override
	public String toString() {
		return "Leon [colorMelena=" + colorMelena + 
				", id=" + getId() + 
				", nombre=" + getNombre() + "]";
	}
	
	@Override
	public void beber() {
		System.out.println("El le�n "+ getNombre() + " est� bebiendo");
	}
	
}
