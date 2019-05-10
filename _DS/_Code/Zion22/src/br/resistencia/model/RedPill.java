package br.resistencia.model;

import java.time.LocalDate;

/**
 * @author Prof. Ralfe
 * @version Última atualização: 20/08/2017
 */
public class RedPill extends Pessoa implements Migrante, Usuario {

	// Atributo
	private boolean conectado;
	
	// Construtores
	public RedPill() {
		// Invocação do construtor da superclasse
		super();
		// Inicialização do atributo da subclasse
		this.conectado = false;
	}
	
	public RedPill(String nome) {
		// Invocação do construtor da superclasse
		super(nome);
		// Inicialização do atributo da subclasse
		this.conectado = false;
	}

	public RedPill(String nome, String contato, LocalDate nascimento, String senha,
			       boolean programacao, boolean lutas, boolean armas,
			       boolean conectado) {
		// Invocação do construtor da superclasse
		super(nome, contato, nascimento, senha, programacao, lutas, armas);
		// Inicialização do atributo da subclasse
		this.conectado = conectado;
	}
	
	// Métodos de acesso
	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}
	
	// Funcionalidades dos objetos
	// Sobrescrita do método identificar herdado
	public String identificar(){
		return "Nome: " + this.getNome() + 
			   "\nRegistro: " + this.getRegistro() +
			   "\nContato: " + this.getContato() +
			   "\nConectado: " + (this.isConectado() ? "Sim" : "Não") +
			   "\nPerfil:" + 
			   "\n" + this.getPerfil().habilidades();
	}
	
	// Sobrecarga do método identificar
	public String identificar(boolean programador){	
		String mensagem = "";
		if(this.getPerfil().isProgramacao()){
			
			mensagem = "Nome: " + this.getNome() + 
					   "\nRegistro: " + this.getRegistro() +
					   "\nContato: " + this.getContato() +
					   "\nConectado: " + (this.isConectado() ? "Sim" : "Não") +
					   "\nPerfil:" + 
					   "\n" + this.getPerfil().habilidades();	
		}else{			
			mensagem = "Não é um programador!";
		}		
		return mensagem;
	}

	@Override
	public String conectarMatrix() {
		return "Conectado a Matrix v." + Migrante.versao;	}

	@Override
	public String conectarZion() {
		return "Conectado a Zion v." + Migrante.versao;	}
}






















