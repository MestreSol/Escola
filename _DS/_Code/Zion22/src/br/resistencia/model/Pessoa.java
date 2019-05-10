package br.resistencia.model;

import java.time.LocalDate;

/**
 * @author Prof. Ralfe
 * @version Última atualização: 19/07/2017
 */

// Classe abstrata
abstract public class Pessoa {

	// Atributos
	private int registro;
	private String nome;
	private String contato;
	private LocalDate nascimento;
	private String senha;
	private Perfil perfil;
	
	private static int registroSequencial = 1;
		
	// Construtores
	public Pessoa() {
		this.registro = registroSequencial++;
		this.nome = "";
		this.contato = "";
		this.nascimento = null;
		this.senha = "";
		this.perfil = new Perfil();
	}
	public Pessoa(String nome) {
		this.registro = registroSequencial++;
		this.nome = nome;
		this.contato = "";
		this.nascimento = null;		
		this.senha = "";
		this.perfil = new Perfil();
	}
	public Pessoa(String nome, String contato, LocalDate nascimento, String senha,
			      boolean programacao, boolean lutas, boolean armas) {
		this.registro = registroSequencial++;
		this.nome = nome;
		this.contato = contato;
		this.nascimento = nascimento;
		this.senha = senha;
		this.perfil = new Perfil(programacao, lutas, armas);
	}
	
	// Métodos de acesso
	public int getRegistro() {
		return registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public LocalDate getNascimento() {	
		return this.nascimento;
	}	
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}	
	
	// Funcionalidades dos objetos
	
	/**
	 * Método obrigatório a todas as subclasses de Pessoa
	 * @return mensagem de identificação de acordo com as regras da subclasse
	 */
	abstract public String identificar();

}




























