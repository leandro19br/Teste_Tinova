package br.com.tinnova.soma;

import java.math.BigDecimal;

/**
 * 
 * @author Santiago, Leandro Classe feita para calcular a soma dos multiplos de
 *         3 ou 5
 */

public class SomaMultiplos {

	public static int somaNumerosMultiplos(int valor) {

		int x = 3;
		int z = 5;
		int res = 0;

		for (int i = 0; i < valor; i++) {

			if (i % x == 0 || i % z == 0) {
				res += i;
			}

		}
		return res;

	}
}