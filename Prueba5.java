package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Prueba5 extends Prueba0{
	
	/**
	 * CAJA NEGRA
	 */
		
	@DisplayName(value = "Con valor vacio")
	@Test
	//Si dejo el valor vacio nos deberia de devolver 0
	void test2funcion5() {
		assertEquals(0, Funciones.funcion5("", 3, 8));
	}
	
	@DisplayName(value = "Con un caracter")
	@Test
	//Si pongo un caracater nos devuelve 0 porque no es ni el signo de sumar, restar ni multiplicar
	void test1funcion5() {
		assertEquals(0, Funciones.funcion5("C", 2, 7));
	}

	
	@DisplayName(value = "Con valor aleatorio")
	@Test
	//He puesto dos numeros que yo he querido y los he multiplicado
	void test3funcion5() {
		assertEquals(434670870, Funciones.funcion5("*", 5, 86934174));
	}
	
	@DisplayName(value = "Con valor limite inferior")
	@Test
	//Sus valores limites son de -2147483648 al 2147483647
	void test4funcion5() {
		assertEquals(-1, Funciones.funcion5("+", -2147483648, 2147483647));
	}
	
	/**
	 * CAJA BLANCA
	 */
	
	@DisplayName(value = "Con cobertura de condicion")
	@Test
	//En esta prueba sumo el dia y el mes de mi cumpleaños
	void test5funcion5() {
		assertEquals(13, Funciones.funcion5("+", 11, 2));
	}
	
	@DisplayName(value = "Con cobertura de condicion 2")
	@Test
	//En esta prueba resto el dia y el mes de mi cumpleaños
	void test6funcion5() {
		assertEquals(9, Funciones.funcion5("-", 11, 2));
	}
	
	@DisplayName(value = "Cobertura de condicion 3")
	@Test
	//En esta prueba multiplico el dia y el mes de mi cumpleaños
	void test7funcion5() {
		assertEquals(22, Funciones.funcion5("*", 11, 2));
	}
	
	@DisplayName(value = "Cobertura de condicion 4")
	@Test
	//En esta prueba he puesto un signo que no sea ni el de sumar, restar ni multiplicar asi que nos deberia devolver 0
	void test8funcion5() {
		assertEquals(0, Funciones.funcion5(":", 11, 2));
	}

}
