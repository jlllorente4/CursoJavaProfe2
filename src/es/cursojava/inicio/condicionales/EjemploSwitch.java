package es.cursojava.inicio.condicionales;

public class EjemploSwitch {

	public static void main(String[] args) {
		
		int nota=10;
		
		switch(nota) {
			case 1: 
			case 2: 
			case 3: 
			case 4: System.out.println("Suspenso");break;
			case 5: 
			case 6: System.out.println("Aprobado");break;
			case 7: 
			case 8: System.out.println("Notable");break;
			case 9: 
			case 10: System.out.println("Sobresaliente");break;
			default: System.out.println("Nota no valida");
		}

	}

}
