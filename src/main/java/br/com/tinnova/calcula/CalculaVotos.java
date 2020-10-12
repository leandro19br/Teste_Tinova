package br.com.tinnova.calcula;

import java.math.BigDecimal;

/** 
 * 
 * @author Santiago, Leandro
 * Classe utilizada para calcular percentual de eleitores
 * 
 * */

public class CalculaVotos {

	private BigDecimal totalEleitores;
	private BigDecimal votosValidos;
	private BigDecimal votosBrancos;
	private BigDecimal votosNulos;
	

	public CalculaVotos(BigDecimal totalEleitores, BigDecimal votosValidos, BigDecimal votosBrancos,
			BigDecimal votosNulos) {

		this.totalEleitores = totalEleitores;
		this.votosValidos = votosValidos;
		this.votosBrancos = votosBrancos;
		this.votosNulos = votosNulos;

	}

	public BigDecimal percentualVotosValidos() {
		
		return votosValidos.divide(totalEleitores);
	}

	public BigDecimal percentualVotosBrancos() {

		return votosBrancos.divide(totalEleitores);
	}

	public BigDecimal percentualVotosNulos() {

		return votosNulos.divide(totalEleitores);
	}

	public BigDecimal getTotalEleitores() {
		return totalEleitores;
	}

	public void setTotalEleitores(BigDecimal totalEleitores) {
		this.totalEleitores = totalEleitores;
	}

	public BigDecimal getVotosValidos() {
		return votosValidos;
	}

	public void setVotosValidos(BigDecimal votosValidos) {
		this.votosValidos = votosValidos;
	}

	public BigDecimal getVotosBrancos() {
		return votosBrancos;
	}

	public void setVotosBrancos(BigDecimal votosBrancos) {
		this.votosBrancos = votosBrancos;
	}

	public BigDecimal getVotosNulos() {
		return votosNulos;
	}

	public void setVotosNulos(BigDecimal votosNulos) {
		this.votosNulos = votosNulos;
	}

}
