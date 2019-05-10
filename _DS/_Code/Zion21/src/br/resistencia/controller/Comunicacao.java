/**
 * @author Prof. Ralfe
 * @version Última atualização: 18/07/2017
 */

package br.resistencia.controller;

import br.resistencia.model.Pessoa;

public abstract class Comunicacao {

	// Atributo
	private String texto;
	private static int habitantesZion = 0;
	private static int habitantesMatrix = 0;

	// Construtores
	public Comunicacao() {
		this("");
	}

	public Comunicacao(String texto) {
		this.texto = texto;
	}
	
	// Métodos de acesso
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	
	public static int getHabitantesZion() {
		return habitantesZion;
	}
	public static int getHabitantesMatrix() {
		return habitantesMatrix;
	}


	
	// Funcionalidades
	public String enviarInstrucoes(Pessoa pessoa){		
		
		String mensagem = "Para: " + pessoa.getContato();		
		
		if(pessoa.getClass().getName().equals("BluePill")){
			mensagem += "\nA ignorância é uma benção.";
		}else{
			mensagem += "\nSr(a). " + pessoa.getNome();  
			mensagem += "\nInstrução: " + this.getTexto();
		}		
		mensagem += "\nOrigem: " + pessoa.getClass().getName();
		mensagem += "\nMais informações: " + pessoa.identificar();
		
		return mensagem;
	}
	
	
	public static String controleDemografico(Pessoa pessoa){
		
		if(pessoa.getClass().getName().equals("RedPill")){
			// Quando um RedPill "nasce"
			habitantesZion++;
			// Na verdade ele saiu da Matrix
			habitantesMatrix--;
		}else{			
			if(pessoa.getClass().getName().equals("BluePill")){
				// Nascido na Matrix
				habitantesMatrix++;
			}else{
				// Nascido em Zion				
				habitantesZion++;
			}
		}
		
		return "Habitantes em Matrix: " + getHabitantesMatrix() + 
			   "\nHabitantes em Zion: " + getHabitantesZion();
	}
	
}







	

























