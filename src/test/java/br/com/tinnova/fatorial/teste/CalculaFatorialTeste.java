package br.com.tinnova.fatorial.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.tinnova.fatorial.CalculaFatorial;
import br.com.tinnova.ordenacao.Ordenar;

public class CalculaFatorialTeste {

	

	@Test
	public void deveOrdenarNuemros() {
		
		int x = 5;
		
		int result = CalculaFatorial.calculaFatorial(x);
		
		Assert.assertNotNull(x);
		Assert.assertEquals(120, result );
		
	}
	
		
}
