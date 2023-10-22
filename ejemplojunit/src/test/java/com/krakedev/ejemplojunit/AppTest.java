package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test // convierte este metodo en un test de junit
	public void TestSumar() {
		Calculadora c = new Calculadora();
		int resultado = c.sumar(5, 10);
		assertTrue(resultado == 15); // la palabra assertTrue valida que la condicion dentro del parentesis sea
										// verdadera
	}

	@Test // convierte este metodo en un test de junit
	public void TestRestar() {
		Calculadora c = new Calculadora();
		int resultado = c.restar(12, 6);
		assertTrue(resultado == 6); // la palabra assertTrue valida que la condicion dentro del parentesis sea
										// verdadera
	}

}
