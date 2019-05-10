package br.resistencia.model;

import java.time.LocalDate;

/**
 * @author Prof. Ralfe
 * @version Última atualização: 20/08/2017
 */

public class BluePill extends Pessoa {

	// Atributo
	private String profissao;

	// Construtores
	public BluePill() {
		// Invocação do construtor da superclasse
		super();
		// Inicialização do atributo da subclasse
		this.profissao = "";
	}

	public BluePill(String nome) {
		// Invocação do construtor da superclasse
		super(nome);
		// Inicialização do atributo da subclasse
		this.profissao = "";
	}

	public BluePill(String nome, String contato, LocalDate nascimento, String senha,
			        boolean programacao, boolean lutas, boolean armas,
			        String profissao) {
		// Invocação do construtor da superclasse
		super(nome, contato, nascimento, senha, programacao, lutas, armas);
		// Inicialização do atributo da subclasse
		this.profissao = profissao;
	}

	
	// Métodos de acesso
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	// Funcionalidades dos objetos
	// Sobrescrita obrigatória do método identificar
	public String identificar(){
		return "Nome: " + this.getNome() + 
			   "\nPerfil:" + 
			   "\n" + this.getPerfil().habilidades();
	}
	
}
