package br.com.financas.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cliente {

	private LocalDate dataInsercao;
	private String nome;
	private String cpf;
	private String endereco;
	private double rendaMedia;
	private LocalDate dataNascimento;
	private ArrayList<String> Contatos = new ArrayList<String>();
	
	public Cliente() {
	
		this.dataInsercao = LocalDate.now();
		this.nome = "";
		this.cpf = "";
		this.endereco = "";
		this.rendaMedia = 0;
		this.dataNascimento = null;
		this.Contatos = new ArrayList<String>();

	}
	
	public Cliente(String nome, String cpf, String endereco, double rendaMedia, LocalDate dataNascimento, ArrayList<String> contatos) {
		
		this.dataInsercao = LocalDate.now();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.rendaMedia = rendaMedia;
		this.dataNascimento = dataNascimento;
		Contatos.addAll(contatos);
	
	}
	
	public Cliente(String nome, String cpf, String endereco, double rendaMedia, LocalDate dataNascimento, String contatos) {
	
		this.dataInsercao = LocalDate.now();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.rendaMedia = rendaMedia;
		this.dataNascimento = dataNascimento;
		Contatos.add(contatos);
	
	}

	public LocalDate getDataInsercao() {
	
		return dataInsercao;
	
	}

	public ArrayList<String> getContatos() {
	
		return Contatos;
	
	}

	public void setContatos(ArrayList<String> contatos) {
	
		Contatos.addAll(contatos);
	
	}
	
	public void setContatos(String contatos) {
	
		Contatos.add(contatos);
	
	}

	public void setDataInsercao(LocalDate dataInsercao) {
	
		this.dataInsercao = dataInsercao;
	
	}

	public String getNome() {
	
		return nome;

	}

	public void setNome(String nome) {
	
		this.nome = nome;
	
	}

	public String getCpf() {
	
		return cpf;
	
	}

	public void setCpf(String cpf) {
	
		this.cpf = cpf;
	
	}

	public String getEndereco() {
	
		return endereco;
	
	}

	public void setEndereco(String endereco) {
	
		this.endereco = endereco;
	
	}

	public double getRendaMedia() {
	
		return rendaMedia;
	
	}

	public void setRendaMedia(double rendaMedia) {
	
		this.rendaMedia = rendaMedia;
	
	}

	public LocalDate getDataNascimento() {
	
		return dataNascimento;
	
	}

	public void setDataNascimento(LocalDate dataNascimento) {
	
		this.dataNascimento = dataNascimento;
	
	}
	
	public String identificar() {
		
		Period idade = Period.between(this.getDataNascimento(), LocalDate.now());		
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("MM/yyyy");
		
		String Contato = "";
		for(String contato : this.getContatos()) {
			
			Contato = Contato + contato+"\n";
			
		}
		return "Nome: " + this.getNome() + 
				"\nIdade: " + String.valueOf( idade.getYears() ) + 
				"\nCliente desde: " + this.getDataInsercao().format(formatador)+"\nContatos: "+Contato;
		
	
	}
	
}
