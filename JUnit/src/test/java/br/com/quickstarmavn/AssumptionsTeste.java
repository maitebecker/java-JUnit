package br.com.quickstarmavn;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AssumptionsTeste {
	@Test
	void validarAlgoNoUsuario() {
		Assumptions.assumeTrue("M".equals(System.getenv("USER")));
		Assertions.assertEquals(10, 5+5);
	}
}
