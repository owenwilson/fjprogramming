package fundamentalsjava;

public class SegundaClase {

	public static void main(String[] args) {
		
		int mesNumero = 0;
		String mesTexto = "";
		/*
		if(mesNumero == 1) {
			mesTexto = "Enero";
		}else if(mesNumero == 2) {
			mesTexto = "Febrero";
		}else if(mesNumero == 3) {
			mesTexto = "Marzo";
		}else if(mesNumero == 4) {
			mesTexto = "Abril";
		}else if(mesNumero == 5) {
			mesTexto = "Mayo";
		}else if(mesNumero == 6) {
			mesTexto = "Junio";
		}else if(mesNumero == 7) {
			mesTexto = "Julio";
		}else if(mesNumero == 8) {
			mesTexto = "Agosto";
		}else if(mesNumero == 9) {
			mesTexto = "Septiembre";
		}else if(mesNumero == 10) {
			mesTexto = "Octubre";
		}else if(mesNumero == 11) {
			mesTexto = "Noviembre";
		}else if(mesNumero == 12) {
			mesTexto = "Diciembre";
		}else {
			mesTexto = "mesNumero es incorrecto";
		}*/
		
		
		//Estrucutra Switch 
		switch (mesNumero) {
		case 1: mesTexto = "Enero";
		break;
		case 2: mesTexto = "Febrero";
		break;
		case 3: mesTexto = "Marzo";
		break;
		case 4: mesTexto = "Abril";
		break;
		case 5: mesTexto = "Mayo";
		break;
		case 6: mesTexto = "Junio";
		break;
		case 7: mesTexto = "Julio";
		break;
		case 8: mesTexto = "Agosto";
		break;
		case 9: mesTexto = "Septiembre";
		break;
		case 10: mesTexto = "Octubre";
		break;
		case 11: mesTexto = "Noviembre";
		break;
		case 12: mesTexto = "Diciembre";
		break;
		default: mesTexto = "mesNumero es incorrecto";
		break;
		}
		System.out.println(mesTexto);
	}
}
