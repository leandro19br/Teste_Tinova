package br.com.tinnova.fatorial;

/**
 * 
 * @author Santiago, Leandro Classe para calcular o Fatorial de um determinado
 *         número
 * 
 */

public class CalculaFatorial {

	public static int calculaFatorial(int x) {

		int f = x;

		while (x > 1) {
			f = f * (x - 1);
			x--;
		}
				 
		return f;

	}

}
