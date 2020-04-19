package fundamentalsjava;

public class QuintaClase {

	public static void main(String[] args) {
		double r = sumaDosNumeros(4,2);
		System.out.println(r);
		
		//Clase Automovil
		Automovil mazda = new Automovil();
		mazda.propiedades();
		Automovil honda = new Automovil("Honda", 150000,2,"Azul");
		honda.propiedades();
		
		System.out.println("\n");
		
		//Clase AutomovilElectrico herdamos propiedas y metodos de la Clase Automovil
		AutomovilElectrico movil = new AutomovilElectrico();
		movil.mostrarCarga();
		movil.recargar();
		movil.mostrarCarga();
	}
	
	public static double sumaDosNumeros(double a, double b) {
		double resultado = a + b;
		return resultado;
	}
}
