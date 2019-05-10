package br.resistencia.model;

import java.time.LocalDate;

/**
 * @author Prof. Ralfe
 * @version �ltima atualiza��o: 20/08/2017
 */
public class RedPill extends Pessoa implements Migrante, Usuario {

	// Atributo
	private boolean conectado;
	
	// Construtores
	public RedPill() {
		// Invoca��o do construtor da superclasse
		super();
		// Inicializa��o do atributo da subclasse
		this.conectado = false;
	}
	
	public RedPill(String nome) {
		// Invoca��o do construtor da superclasse
		super(nome);
		// Inicializa��o do atributo da subclasse
		this.conectado = false;
	}

	public RedPill(String nome, String contato, LocalDate nascimento, String senha,
			       boolean programacao, boolean lutas, boolean armas,
			       boolean conectado) {
		// Invoca��o do construtor da superclasse
		super(nome, contato, nascimento, senha, programacao, lutas, armas);
		// Inicializa��o do atributo da subclasse
		this.conectado = conectado;
	}
	
	// M�todos de acesso
	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}
	
	// Funcionalidades dos objetos
	// Sobrescrita do m�todo identificar herdado
	public String identificar(){
		return "Nome: " + this.getNome() + 
			   "\nRegistro: " + this.getRegistro() +
			   "\nContato: " + this.getContato() +
			   "\nConectado: " + (this.isConectado() ? "Sim" : "N�o") +
			   "\nPerfil:" + 
			   "\n" + this.getPerfil().habilidades();
	}
	
	// Sobrecarga do m�todo identificar
	public String identificar(boolean programador){	
		String mensagem = "";
		if(this.getPerfil().isProgramacao()){
			
			mensagem = "Nome: " + this.getNome() + 
					   "\nRegistro: " + this.getRegistro() +
					   "\nContato: " + this.getContato() +
					   "\nConectado: " + (this.isConectado() ? "Sim" : "N�o") +
					   "\nPerfil:" + 
					   "\n" + this.getPerfil().habilidades();	
		}else{			
			mensagem = "N�o � um programador!";
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






















