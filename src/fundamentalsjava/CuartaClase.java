package fundamentalsjava;

public class CuartaClase {

	public static void main(String[] args) {
		int i = 0;
		while(i <= 100) {
			System.out.println(i);
			i++;
		}
		System.out.println("\n");
		String[] arregloMeses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
                "Septiembre","Octubre","Noviembre","Diciembre"};
		int j = 0;
		while(j < arregloMeses.length) {
			System.out.println(arregloMeses[j]);
			j++;
		}
		System.out.println("\n");
		
		//do while ejemplo
		int k = 0;
		do {
			System.out.println(arregloMeses[k]);
			k++;
		}while(k < arregloMeses.length);
	}

}
