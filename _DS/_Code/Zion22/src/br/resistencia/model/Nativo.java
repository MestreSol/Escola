package br.resistencia.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Prof. Ralfe
 * @version �ltima atualiza��o: 20/08/2017
 */
public class Nativo extends Pessoa implements Usuario {

	// Atributo
	private ArrayList<String> funcao = new ArrayList<String>();
	
	// Construtores
	public Nativo() {
		super();
		this.funcao = new ArrayList<String>();
	}

	// Inicializa o atributo funcao com uma String e adiciona no atributo
	public Nativo(String nome, String contato, LocalDate nascimento, String senha, 
			      boolean programacao, boolean lutas, boolean armas,
			      ArrayList<String> funcao) {
		super(nome, contato, nascimento, senha, programacao, lutas, armas);

		this.funcao.addAll(funcao);
	}

	// Inicializa o atributo funcao com um Arraylist e sobrep�e o conte�do do atributo
	public Nativo(String nome, String contato, LocalDate nascimento, String senha, 
		      boolean programacao, boolean lutas, boolean armas,
		      String funcao) {
	super(nome, contato, nascimento, senha, programacao, lutas, armas);

	this.funcao.add(funcao);
}

	
	
	// M�todos de acesso
	public ArrayList<String> getFuncao() {
		return funcao;
	}

	// Recebe uma String e adiciona no atributo
	public void setFuncao(String funcao) {
		this.funcao.add(funcao);
	}

	// Recebe um Arraylist e sobrep�e o conte�do do atributo 
	public void setFuncao(ArrayList<String> funcao) {
		this.funcao.addAll(funcao);
	}

	
	// Funcionalidades dos objetos

	// Sobrescrita obrigat�ria do m�todo identificar
	@Override	
	public String identificar() {
		
		String listaFuncoes = "";
		
		for(String funcao : this.getFuncao()) {

			listaFuncoes = listaFuncoes + funcao.toString() + "\n";
		}
		
		return "Perfil:\n" + this.getPerfil().habilidades() +
			   "\n\nFun��es:\n" + listaFuncoes;
	}


}













