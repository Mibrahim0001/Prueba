package cajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testsCaja {
	Caja c = new Caja();

	@Test
	void test1() {
		
		String operacion = "ingresar";
		int saldoInicial = 150;
		int cantidad = 50;
		
		
		String respuesta  = c.app(operacion, cantidad, saldoInicial);
		String esperada = "El saldo actual es de 200€";
		
		assertEquals(esperada, respuesta);
	}
	@Test
	void test2() {
		String operacion = "retirar";
		int saldoInicial = 150;
		int cantidad = 50;
		
		
		String respuesta  = c.app(operacion, cantidad,saldoInicial);
		String esperada = "Ya tiene disponible su dinero. Su saldo es de 100€";
		
		assertEquals(esperada, respuesta);
	}
	@Test
	void test3() {
		String operacion = "ingresar";
		int saldoInicial = 150;
		int cantidad = 50;
		
		
		String respuesta  = c.app(operacion, cantidad,saldoInicial);
		String esperada = "El saldo actual es de 200€";
		
		assertEquals(esperada, respuesta);
	}
	@Test
	void test4() {
		String operacion = "retirar";
		int saldoInicial = 150;
		int cantidad = 50;
		
		
		String respuesta  = c.app(operacion, cantidad,saldoInicial);
		String esperada = "Ya tiene disponible su dinero. Su saldo es de 100€";
		
		assertEquals(esperada, respuesta);
	}
	@Test
	void test5() {
		String operacion = "s";
		int saldoInicial = 150;
		int cantidad = 50;
		
		
		String respuesta  = c.app(operacion, cantidad,saldoInicial);
		String esperada = "Operacion no valida";
		
		assertEquals(esperada, respuesta);
	}
	@Test
	void test6() {
		String operacion = "ingresar";
		int saldoInicial = -5;
		int cantidad = 50;
		
		
		String respuesta  = c.app(operacion, cantidad,saldoInicial);
		String esperada = "El saldo inicial indicado no es posible";
		
		assertEquals(esperada, respuesta);
	}
	@Test
	void test7() {
		String operacion = "retirar";
		int saldoInicial = -5;
		int cantidad = 50;
		
		
		String respuesta  = c.app(operacion, cantidad,saldoInicial);
		String esperada = "El saldo inicial indicado no es posible";
		
		assertEquals(esperada, respuesta);
	}
	@Test
	void test8() {
		String operacion = "ingresar";
		int saldoInicial = 100;
		int cantidad = -5;
		
		
		String respuesta  = c.app(operacion, cantidad,saldoInicial);
		String esperada = "La cantidad ha de ser mayor que 0";
		
		assertEquals(esperada, respuesta);
	}
	@Test
	void test9() {
		String operacion = "retirar";
		int saldoInicial = 100;
		int cantidad = -5;
		
		
		String respuesta  = c.app(operacion, cantidad,saldoInicial);
		String esperada = "La cantidad ha de ser multiplo de 50 y mayor que 0";
		
		assertEquals(esperada, respuesta);
	}
	
	@Test
	void test11() {
		String operacion = "retirar";
		int saldoInicial = 1500;
		int cantidad = 59;
		
		
		String respuesta  = c.app(operacion, cantidad,saldoInicial);
		String esperada = "La cantidad ha de ser multiplo de 50 y mayor que 0";
		
		assertEquals(esperada, respuesta);
	}
	
	
	

}
