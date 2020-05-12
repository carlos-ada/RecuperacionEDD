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

	public static String funcion2(String palabra, String palabra2) {

		int contVocales = 0;
		int contVocales2 = 0;
		int contConsonantes = 0;
		int contConsonantes2 = 0;
		int longitud = palabra.length();
		int longitud2 = palabra2.length();
		String result = null;

		for (int x = 0; x < longitud; x++) {
			if ((palabra.charAt(x) == 'a') || ((palabra.charAt(x) == 'e')) || ((palabra.charAt(x) == 'o'))
					|| ((palabra.charAt(x) == 'i')) || ((palabra.charAt(x) == 'u'))) {
				contVocales++;
			}
			contConsonantes = longitud - contVocales;
		}
		for (int y = 0; y < longitud2; y++) {
			if ((palabra2.charAt(y) == 'a') || ((palabra2.charAt(y) == 'e')) || ((palabra2.charAt(y) == 'o'))
					|| ((palabra2.charAt(y) == 'i')) || ((palabra2.charAt(y) == 'u'))) {
				contVocales2++;
			}
			contConsonantes2 = longitud2 - contVocales2;
		}

		if (contConsonantes > contConsonantes2) {

			result = palabra;

		} else if (contConsonantes < contConsonantes2) {

			result = palabra2;

		} else if (contConsonantes == contConsonantes2) {

			result = null;
		}
		return result;

	}

	public static Integer funcion3(int[] listaNumeros) {

		int edad = 20;
		int mitadEdad = 10;
		int resp = 0;

		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] <= edad && listaNumeros[i] >= mitadEdad) {
				resp = resp + listaNumeros[i];
			}
		}
		return resp;
	}

	public static String funcion4(int[] notas) {

		int sumaNotas = 0;
		int mediaNotas = 0;
		String resp = null;

		for (int i = 0; i < notas.length; i++) {
			sumaNotas = sumaNotas + notas[i];
		}

		mediaNotas = sumaNotas / notas.length;

		if (mediaNotas < 5 && mediaNotas > 0) {
			resp = "Insuficiente";
		} else if (mediaNotas >= 5 && mediaNotas < 6) {
			resp = "Suficiente";
		} else if (mediaNotas >= 6 && mediaNotas < 7) {
			resp = "Bien";
		} else if (mediaNotas >= 7 && mediaNotas < 9) {
			resp = "Notable";
		} else if (mediaNotas >= 9 && mediaNotas == 10) {
			resp = "Sobresaliente";
		}

		return resp;
	}

	public static Integer funcion5(String simbolo, int num1, int num2) {

		int resp = 0;
		String suma = "+";
		String resta = "-";
		String multiplicacion = "*";
		
		if (simbolo == suma) {
			resp = num1 + num2;
		} else if (simbolo == resta) {
			resp = num1 - num2;
		} else if (simbolo == multiplicacion) {
			resp = num1 * num2;
		} else {
			resp = 0;
		}
		return resp;
	}
}
