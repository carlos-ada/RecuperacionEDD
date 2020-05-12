package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Prueba2 extends Prueba0{

	/**
	 * CAJA NEGRA
	 */

	@DisplayName(value = "Aleatorio con equivalentes prueba 1")
	@Test
	//En esta prueba se mira si mi nombre tiene mas consonantes que el de Alberto
	void test1funcion2() {
		assertEquals("Carlos Manuel Villar Mendez", Funciones.funcion2("Carlos Manuel Villar Mendez", "Alberto Ruiz Contreras"));
	}

	@DisplayName(value = "Aleatorio con equivalentes prueba 2")
	@Test
	//En esta prueba se mira si Alberto tiene mas consonantes que mi nombre con un solo apellido
	void test2funcion2() {
		assertEquals("Alberto Ruiz Contreras", Funciones.funcion2("Carlos Manuel Villar", "Alberto Ruiz Contreras"));
	}

	@DisplayName(value = "Con Valor nulo")
	@Test
	//En esta prueba se mira si los dos nombres tienen las mismas consonantes
	void test3funcion2() {
		assertEquals(null, Funciones.funcion2("Carlos Villar", "Domingo Villar"));
	}

	@DisplayName(value = "Con Valor vacio")
	@Test
	//En esta prueba se mira si las dos cadenas no tienen valor ya que hay escrito nada
	void test4funcion2() {
		assertEquals(null, Funciones.funcion2("", ""));
	}


	/**
	 * CAJA BLANCA
	 */

	@DisplayName(value = "Con Cobertura de caminos prueba 1")
	@Test
	//En esta prueba la primera palabra tiene menos consonantes que la segunda
	void test6funcion2() {
		assertEquals("Techo", Funciones.funcion2("Suelo", "Techo"));
	}

	@DisplayName(value = "Con Cobertura de caminos prueba 2")
	@Test
	//En esta prueba la segunda palabra tiene mas consonantes que la primera
	void test7funcion2() {
		assertEquals("Esternocleidomastoideo", Funciones.funcion2("Billar", "Esternocleidomastoideo"));
	}

	@DisplayName(value = "Con Cobertura de caminos prueba 3")
	@Test
	//En esta prueba la primera palabra tiene las mismas consonantes que la segunda por lo cual devuelve null
	void test8funcion2() {
		assertEquals(null, Funciones.funcion2("hola", "adios"));
	}
	
	@DisplayName(value = "Con Cobertura de decisiones")
	@Test
	//En esta prueba la primera palabra tiene mas consonantes que la segunda
	void test5funcion2() {
		assertEquals("Puchero", Funciones.funcion2("Puchero", "Pasta"));
	}

}
