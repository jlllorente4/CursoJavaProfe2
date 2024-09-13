package es.cursojava.inicio.condicionales;

public class EjemplosIf {

	public static void main(String[] args) {
		
		int numero = 5;
		int nota = 4;
		
		if (numero%2!=0) {
			System.out.println("Impar");
		}else {
			System.out.println("Par");
		}
		
		//++ es como hacer: numero = numero + 1;
		System.out.println(numero++);//6
		System.out.println(numero);
		System.out.println(++numero);//7
		System.out.println(numero+=3);//numero = numero + 3;//10
		System.out.println(numero);
		
		if (nota<5 ) {
			System.out.println("Suspenso");
		}else if (nota <7) {
			System.out.println("Aprobado");
		}else if (nota <9) {
			System.out.println("Notable");
		}else if (nota <=10) {
			System.out.println("Sobresaliente");
		}else {
			System.out.println("Nota incorrecta");
		}
		
		System.out.println("Fin");

	}

}
