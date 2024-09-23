package es.cursojava.poo.herencia;

public abstract class Animal {
	private long id;
	private String nombre;
	private String fechNacimiento;
	private double peso;
	
	public Animal(long id, String nombre, String fechNacimiento,
			double peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechNacimiento = fechNacimiento;
		this.peso = peso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechNacimiento() {
		return fechNacimiento;
	}

	public void setFechNacimiento(String fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void beber() {
		System.out.println("El animal "+ nombre + " está bebiendo");
	}

	public abstract void comer();
	
//	public void comer() {
//		System.out.println("El animal "+ nombre + " está comiendo");
//	}
}
