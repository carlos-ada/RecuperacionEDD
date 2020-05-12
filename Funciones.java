package Pruebas;

public class Funciones {
	public static Boolean funcion1(String cadena) {

		Boolean resp = null;
		int contador = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i')
					|| (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u')) {

				contador++;

				if (contador >= 20) {

					resp = true;

				} else if (contador < 20) {

					resp = false;
				}
			}
		}
		return resp;
	}

}
