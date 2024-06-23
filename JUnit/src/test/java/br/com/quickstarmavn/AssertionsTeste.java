package br.com.quickstarmavn;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {
	@Test
	void validarLancamentos() {
		int[]primeiroLancamento = {10,20,30,40,50};
		int[]segundoLancamento = {-1, 5, 2, 3, 10};
		
		Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
	}
	
	@Test
	void validarObjetoEstaNulo() {
		Pessoa pessoa = null;
		Assertions.assertNull(pessoa);
		
		Pessoa pessoa2 = new Pessoa("luciano", LocalDateTime.now());
		Assertions.assertNotNull(pessoa2);
	}
	
	@Test
	void validarNumerosDeTiposDiferentes() {
		double valor = 5.0;
		double outroValor = 5.0;
		
		Assertions.assertEquals(valor, outroValor);
	}
}
