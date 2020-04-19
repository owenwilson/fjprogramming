package fundamentalsjava;

public class Automovil {
	public String marca;
	public int precio;
	public int numPuertas;
	public String color;
	
	public Automovil() {
		marca = "mazda";
		precio = 200000;
		numPuertas = 4;
		color = "Negro";
	}
	
	public Automovil(String m, int p, int nP, String c) {
		marca = m;
		precio = p;
		numPuertas = nP;
		color = c;
	}
	
	public void propiedades() {
		System.out.println("La marca de auto es "+marca+" su precio es "+precio+" pesos,tiene "+numPuertas+" puertas y su color es "+color);
	}
	
	public void encender() {
		System.out.println("El automovil encendio");
	}
	
	public void acelerar() {
		System.out.println("El automovil acelero");
	}
}
