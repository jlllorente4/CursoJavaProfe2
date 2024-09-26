package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import es.cursojava.inicio.funciones.Utilidades;

public class UtilidadesTest {
	Utilidades utils;
	//Patrón AAA (Arrange, Act y Assert)
	
	@Test
	public void validarEmailCorrecto () {
		boolean emailValido = Utilidades.validarEmail("asdasd@hotmail.com");
		
		assertTrue(emailValido);
	}
	
	@Test
	public void validarEmailNoHotmail () {
		boolean emailValido = Utilidades.validarEmail("asdasd@gmail.com");
		
		assertFalse(emailValido);
	}
	
	@Test
	public void validarEmailInCorrecto () {
		boolean emailValido = Utilidades.validarEmail("asdasdeese.es");
		
		assertFalse(emailValido);
	}
	
	@Before
	public void preparaUtils () {
		utils = new Utilidades();
	}
	
	@Test(timeout = 2000)
	public void testSuma() {
		
		int resultado = utils.suma(5, 3);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		assertEquals(8, resultado);
		
	}
	
	@Test
	public void testResta() {
		
		int resultado = utils.resta(5, 3);
		
		assertEquals(2, resultado);
		
	}
	
	
	@Test
	public void testDivision() {
		int resultado = utils.division(8, 2);
		assertEquals(4, resultado);
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivisionPorCero() {
		int resultado = utils.division(8, 0);
	}
}
