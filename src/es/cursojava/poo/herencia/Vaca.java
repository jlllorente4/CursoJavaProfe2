package es.cursojava.poo.herencia;

public class Vaca extends Animal{
	private int numCuernos;

	public Vaca(long id, String nombre, String fechNacimiento, 
			double peso, int numCuernos) {
		super(id, nombre, fechNacimiento, peso);
		this.numCuernos = numCuernos;
	}

	
	public void mugir() {
		System.out.println("La vaca con nombre "+ getNombre() + " está mugiendo" );
	}
	
	@Override
	public void comer() {
		System.out.println("La Vaca "+ getNombre() + " está pastando");
	}
	
	@Override
	public void beber() {
		System.out.println("La Vaca "+ getNombre() + " está bebiendp");
	}
}
