package br.com.tinnova.soma.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.tinnova.ordenacao.Ordenar;
import br.com.tinnova.soma.SomaMultiplos;

public class SomaMultiplosTeste {

	

	@Test
	public void deveSomarNumerosDivisivel() {
		
		int valor = 10;
		
		int soma = SomaMultiplos.somaNumerosMultiplos(valor);
		
		Assert.assertNotNull(soma);
		Assert.assertEquals(23,soma);
		
		
	}
	
		
}
