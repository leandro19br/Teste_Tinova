package br.com.tinnova.ordenacao;

import java.math.BigDecimal;

/**
 * 
 * @author Santiago, Leandro Classe para organizar vetor de numeros inteiros
 * 
 */

public class Ordenar {

	public static void ordenarNumeros(int[] vet) {

		int aux = 0;
		int i = 0;
			
		for (i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		
		/*for(i = 0; i< vet.length; i++){
			System.out.println(" "+vet[i]);
			
		}*/

	}

}
