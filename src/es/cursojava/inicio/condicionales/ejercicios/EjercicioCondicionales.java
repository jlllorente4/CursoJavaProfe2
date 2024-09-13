package es.cursojava.inicio.condicionales.ejercicios;

public class EjercicioCondicionales {

	public static void main(String[] args) {

		String mes = "EnerO";
		double temperatura = -10;
		
		if (mes.equals("Febrero") && esBajoCero(temperatura)) {
			System.out.println("Hace mucho frio");
		}
		
		
		if(mes.equalsIgnoreCase("enero") || mes.equals("Febrero") || mes.equals("Marzo")) {
			System.out.println("Invierno");
		}else if(mes.equals("Abril") || mes.equals("Mayo") || mes.equals("Junio")) {
			System.out.println("Primavera");
		}else if(mes.equals("Julio") || mes.equals("Agosto") || mes.equals("Septiembre")) {
			System.out.println("Verano");
		}else if(mes.equals("Octubre") || mes.equals("Noviembre") || mes.equals("Diciembre")) {
			System.out.println("Otoño");
		}else {
			System.out.println("Mes incorrecto");
		}

	}

	
	public static boolean esBajoCero(double temperatura) {
		System.out.println("Entrando en esBajoCero()");
		
		return temperatura<0;
	}
	
}
