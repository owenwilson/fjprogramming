package fundamentalsjava;

public class TerceraClase {

	public static void main(String[] args) {
		                      // 0    1  2   3   4
		/*int[] arregloEnteros = {100,200,300,400,500};
		System.out.println(arregloEnteros[4]);
		
		String[] arregloTextos = {"uno","dos","tres","cuatro","cinco"};
		System.out.println(arregloTextos[2]);*/
		
		int [] arregloNumerico = new int[12];
		for(int i = 0; i <12; i++) {
			System.out.println(arregloNumerico[i]=i);
		}
		System.out.println("\n");
		
		String[] arregloMeses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
				                "Septiembre","Octubre","Noviembre","Diciembre"};
		for(int j = 0 ; j < arregloMeses.length ; j++) {
			System.out.println(arregloMeses[j]);
		}
	}
}
