package br.com.tinnova.calcula.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.tinnova.ordenacao.Ordenar;

public class OrdenarTeste {

	

	@Test
	public void deveOrdenarNuemros() {
		
		int vet [] = {5,3,2,4,7,1,0,6};
		
		Ordenar.ordenarNumeros(vet);
		
		Assert.assertNotNull(vet);
		Assert.assertEquals(vet[0],0);
		Assert.assertEquals(vet[1],1);
		Assert.assertEquals(vet[2],2);
		Assert.assertEquals(vet[3],3);
		Assert.assertEquals(vet[4],4);
		Assert.assertEquals(vet[5],5);
		Assert.assertEquals(vet[6],6);
		Assert.assertEquals(vet[7],7);
		
	}
	
		
}
