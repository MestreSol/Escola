package br.resistencia.model;

/**
 * @author Prof. Ralfe
 * @version Última atualização: 15/07/2017
 */

public class Perfil {

	// Atributos
	private boolean programacao;
	private boolean lutas;
	private boolean armas;
	
	// Construtores
	public Perfil() {
		this(false, false, false);
	}
	
	public Perfil(boolean programacao, boolean lutas, boolean armas) {
		this.programacao = programacao;
		this.lutas = lutas;
		this.armas = armas;
	}	
	
	// Métodos de acesso
	public boolean isProgramacao() {
		return programacao;
	}
	public void setProgramacao(boolean programacao) {
		this.programacao = programacao;
	}
	public boolean isLutas() {
		return lutas;
	}
	public void setLutas(boolean lutas) {
		this.lutas = lutas;
	}
	public boolean isArmas() {
		return armas;
	}
	public void setArmas(boolean armas) {
		this.armas = armas;
	}
	
	// Funcionalidade
	public String habilidades(){
		return "Programação: " + (this.isProgramacao() ? "Sim" : "Nao") +
			   "\nLutas: " + (this.isLutas() ? "Sim" : "Nao" )+
			   "\nArmas: " + (this.isArmas() ? "Sim" : "Nao" );
	}
}


























