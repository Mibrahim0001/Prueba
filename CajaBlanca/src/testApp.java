import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testApp {
	Tarjeta t = new Tarjeta();

	@Test
	void test1() {
		char cTipo = 'B';
		int iFil = 0;
		int iCols = 0;
		String nombre ="jose";
		
		String respuesta  = t.Fidelizacion(cTipo, iFil, iCols, nombre);
		String esperada = "La tarjeta de color bronce de jose tiene 0 posiciones";
		
		assertEquals(esperada, respuesta);
	}
	
	@Test
	void test2() {
		char cTipo = 'P';
		int iFil = 0;
		int iCols = 0;
		String nombre ="jose";
		
		String respuesta  = t.Fidelizacion(cTipo, iFil, iCols, nombre);
		String esperada = "La tarjeta de color plata de jose tiene 0 posiciones";
		
		assertEquals(esperada, respuesta);
	}
	
	@Test
	void test3() {
		char cTipo = 'O';
		int iFil = 0;
		int iCols = 0;
		String nombre ="jose";
		
		String respuesta  = t.Fidelizacion(cTipo, iFil, iCols, nombre);
		String esperada = "La tarjeta de color oro de jose tiene 0 posiciones";
		
		assertEquals(esperada, respuesta);
	}
	
	@Test
	void test4() {
		char cTipo = 'Q';
		int iFil = 0;
		int iCols = 0;
		String nombre ="jose";
		
		String respuesta  = t.Fidelizacion(cTipo, iFil, iCols, nombre);
		String esperada = "La tarjeta de color blanco de jose tiene 0 posiciones";
		
		assertEquals(esperada, respuesta);
	}
	
	@Test
	void test5() {
		char cTipo = 'B';
		int iFil = 1;
		int iCols = 0;
		String nombre ="jose";
		
		String respuesta  = t.Fidelizacion(cTipo, iFil, iCols, nombre);
		String esperada = "La tarjeta de color bronce de jose tiene 0 posiciones";
		
		assertEquals(esperada, respuesta);
	}
	
	@Test
	void test6() {
		char cTipo = 'B';
		int iFil = 1;
		int iCols = 1;
		String nombre ="jose";
		
		String respuesta  = t.Fidelizacion(cTipo, iFil, iCols, nombre);
		String esperada = "La tarjeta de color bronce de jose tiene 1 posiciones";
		
		assertEquals(esperada, respuesta);
	}






}
