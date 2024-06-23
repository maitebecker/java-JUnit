package br.com.quickstarmavn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {
	@Test
	@DisabledIfEnvironmentVariable(named = "USER", matches = "Maite")
	@EnabledOnOs(OS.WINDOWS)
	void validarAlgoNoUsuario() {
		Assumptions.assumeTrue("Maite".equals(System.getenv("USER")));
		Assertions.assertEquals(10, 5+5);
	}
}
