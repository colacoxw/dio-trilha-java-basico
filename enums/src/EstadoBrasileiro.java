/*
 * Esse enum é uma classe que representa os estados brasileiros de 
 * São Paulo, Rio de Janeiro, Piauí, Maranhão e Ceará. 
 * Cada estado tem três atributos: nome, sigla e código IBGE. O enum também tem 
 * um construtor privado que recebe esses três valores e os atribui aos campos correspondentes.
 *  Além disso, o enum tem quatro métodos públicos que retornam o código IBGE, a sigla, o nome e o nome em maiúsculo de cada estado. 
 * Esse enum pode ser usado para armazenar e manipular informações sobre os estados brasileiros de forma padronizada e eficiente.
 */

public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo", 11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
	PIAUI ("PI", "Piauí",13),
	MARANHAO ("MA","Maranhão",14),
	CEARA("CE", "Ceará",15) ;
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}

	public int getIbge() {
		return ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
