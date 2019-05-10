package br.resistencia.model;

import java.util.ArrayList;

/**
 * @author Prof. Ralfe
 * @version Última atualização: 20/08/2017
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
	public Nativo(String nome, String contato, String senha, 
			boolean programacao, boolean lutas, boolean armas,
			ArrayList<String> funcao) {
		super(nome, contato, senha, programacao, lutas, armas);

		this.funcao.addAll(funcao);
	}

	// Inicializa o atributo funcao com um Arraylist e sobrepõe o conteúdo do atributo
	public Nativo(String nome, String contato, String senha, 
			boolean programacao, boolean lutas, boolean armas,
			String funcao) {
		super(nome, contato, senha, programacao, lutas, armas);

		this.funcao.add(funcao);
	}

	// Métodos de acesso
	public ArrayList<String> getFuncao() {
		return funcao;
	}

	// Recebe uma String e adiciona no atributo
	public void setFuncao(String funcao) {
		this.funcao.add(funcao);
	}

	// Recebe um Arraylist e sobrepõe o conteúdo do atributo 
	public void setFuncao(ArrayList<String> funcao) {
		this.funcao.addAll(funcao);
	}


	// Funcionalidades dos objetos

	// Sobrescrita obrigatória do método identificar
	@Override	
	public String identificar() {

		// Declaração da variável que conterá os valores do ArrayList 
		String listaFuncoes = "";

		// Rastreia o ArrayList
		for(String funcao : this.getFuncao()) {

			// Monta a String com os valores armazenados no ArrayList
			listaFuncoes = listaFuncoes + funcao.toString() + "\n";
		}

		// Retorna a memnsagem
		return "Perfil:\n" + this.getPerfil().habilidades() +
				"\n\nFunções:\n" + listaFuncoes;
	}


}



















