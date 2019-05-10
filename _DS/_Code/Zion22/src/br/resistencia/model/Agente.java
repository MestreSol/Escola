package br.resistencia.model;

/**
 * @author Prof. Ralfe
 * @version Última atualização: 18/07/2017
 */

public class Agente implements Migrante {

	private String nome;
	
	public Agente(String nome){
		this.nome = nome;
	}
	
	@Override
	public String conectarMatrix() {
		return "Conectado a Matrix v." + Migrante.versao;	
	}
	
	@Override
	public String conectarZion() {
		return "Conectado a Zion v." + Migrante.versao;
	}
}




























