package br.com.quickstarmavn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
	@Test
	void validaCenarioDeExcecaoNaTransferencia() {
		Conta contaOrigem =  new Conta("1234", 0);
		Conta contaDestino =  new Conta("5678", 100);
		
		TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
		
		//verifica se a exceção vai ser lançada
		Assertions.assertThrows(IllegalArgumentException.class, ()->
			transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
		
		//verifica se não vai ser lançado exceção nesse caso
		Assertions.assertDoesNotThrow(()-> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
	}
}
