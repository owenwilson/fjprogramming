package fundamentalsjava;

public class AutomovilElectrico extends Automovil {
	private int nivelCarga;
	
	public AutomovilElectrico() {
		super();
		nivelCarga = 50;
	}
	
	public void recargar() {
		nivelCarga = 100;
	}
	
	public void mostrarCarga() {
		System.out.println("El nivel de carga es: "+nivelCarga);
	}
}
