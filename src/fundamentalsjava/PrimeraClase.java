package fundamentalsjava;

public class PrimeraClase {

	public static void main(String[] args) {
		/*Detalles de que podemos usar con if
		 * operadores de comparacion por ejemplo:
		 * <,> , == , <= , >=
		 * operadoes logicos
		 * && el and == y  
		 * || el  or == o*/
		int edad = 19;
		String descripcionEdad = "";
		String nombre = "Juan";
		
		if((edad >= 18 && edad <= 40) || (nombre == "Miranda")) {
			descripcionEdad = "Tu si eres mayor de edad, puedes acceder al bar minitas";
			System.out.println(descripcionEdad);
		}else {
			descripcionEdad = "Tu eres menor de edad y no puedes acceder";
			System.out.println(descripcionEdad);
		}
	}

}
