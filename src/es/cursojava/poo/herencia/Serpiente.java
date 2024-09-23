package es.cursojava.poo.herencia;

public class Serpiente extends Animal {
	private boolean venenosa;
	
	
	public Serpiente(long id, String nombre, String fechNacimiento, double peso) {
		super(id, nombre, fechNacimiento, peso);
		// TODO Auto-generated constructor stub
	}

	
	public Serpiente(long id, String nombre, String fechNacimiento, double peso, boolean venenosa) {
		super(id, nombre, fechNacimiento, peso);
		this.venenosa = venenosa;
	}

	public boolean isVenenosa() {
		return venenosa;
	}
	public void setVenenosa(boolean venenosa) {
		this.venenosa = venenosa;
	}


	@Override
	public void comer() {
		System.out.println("La serpiente "+ getNombre()
		+ " se está tragando la presa");
		
	}

	
}
