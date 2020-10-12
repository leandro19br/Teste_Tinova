package br.com.tinnova.ordenacao.teste;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.tinnova.calcula.CalculaVotos;

public class CalculaVotosTeste {

	private CalculaVotos CalculaVotos;

	@Before
	public void popularVotos() {

		CalculaVotos = new CalculaVotos(new BigDecimal(1000), new BigDecimal(800), new BigDecimal(150),
				new BigDecimal(50));

	}

	@Test
	public void deveCalcularVotosValidos() {
		
				
		double valorEsperado = 0.8;
	
		Assert.assertEquals(valorEsperado , CalculaVotos.percentualVotosValidos().doubleValue(),0 );

	}
	
	
	@Test
	public void deveCalcularVotosBrancos() {
						
		double valorEsperado = 0.15;
	
		Assert.assertEquals(valorEsperado , CalculaVotos.percentualVotosBrancos().doubleValue(),0 );

	}
	
	@Test
	public void deveCalcularVotosNulos() {

		double valorEsperado = 0.05;
			
		Assert.assertEquals(valorEsperado, CalculaVotos.percentualVotosNulos().doubleValue(),0 );

	}

}
