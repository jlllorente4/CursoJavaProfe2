package es.cursojava.inicio;

public class EjemplosString {

	public static void main(String[] args) {
		
		String mensaje = "Hola";
		String mensaje2 = "Hola";
		String mensaje3 = new String("Hola");
		
		System.out.println(mensaje==mensaje2);//true
		System.out.println(mensaje==mensaje3);//false
		System.out.println(mensaje.equals(mensaje3));//true
		
		mensaje = mensaje.toUpperCase();
		
		System.out.println(mensaje);//HOLA
		System.out.println(mensaje2);

		System.out.println(mensaje + ";" + mensaje2);
		//"dato1"+"|"+"dato2"+"|"+"dato3"+"|"+"dato4"
		
	}

}
