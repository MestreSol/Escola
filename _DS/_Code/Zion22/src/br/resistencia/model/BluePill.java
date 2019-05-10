package br.resistencia.model;

import java.time.LocalDate;

/**
 * @author Prof. Ralfe
 * @version �ltima atualiza��o: 20/08/2017
 */

public class BluePill extends Pessoa {

	// Atributo
	private String profissao;

	// Construtores
	public BluePill() {
		// Invoca��o do construtor da superclasse
		super();
		// Inicializa��o do atributo da subclasse
		this.profissao = "";
	}

	public BluePill(String nome) {
		// Invoca��o do construtor da superclasse
		super(nome);
		// Inicializa��o do atributo da subclasse
		this.profissao = "";
	}

	public BluePill(String nome, String contato, LocalDate nascimento, String senha,
			        boolean programacao, boolean lutas, boolean armas,
			        String profissao) {
		// Invoca��o do construtor da superclasse
		super(nome, contato, nascimento, senha, programacao, lutas, armas);
		// Inicializa��o do atributo da subclasse
		this.profissao = profissao;
	}

	
	// M�todos de acesso
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	// Funcionalidades dos objetos
	// Sobrescrita obrigat�ria do m�todo identificar
	public String identificar(){
		return "Nome: " + this.getNome() + 
			   "\nPerfil:" + 
			   "\n" + this.getPerfil().habilidades();
	}
	
}
