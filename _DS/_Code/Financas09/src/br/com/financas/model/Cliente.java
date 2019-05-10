package br.com.financas.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente {

	private LocalDate dataInsercao;
	private String nome;
	private String cpf;
	private String endereco;
	private double rendaMedia;
	private LocalDate dataNascimento;
	
	
	public Cliente() {
		this.dataInsercao = LocalDate.now();
		this.nome = "";
		this.cpf = "";
		this.endereco = "";
		this.rendaMedia = 0;
		this.dataNascimento = null;

	}
	
	public Cliente(String nome, String cpf, String endereco, double rendaMedia, LocalDate dataNascimento) {
		this.dataInsercao = LocalDate.now();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.rendaMedia = rendaMedia;
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataInsercao() {
		return dataInsercao;
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
	
		// Calcula a diferença entre a data de nascimento e a data de hoje
		Period idade = Period.between(this.getDataNascimento(), LocalDate.now());		
		
		// Formatação para a data de inserção somente com o mês/ano
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("MM/yyyy");
		
		// Apresenta os anos (getYears()) dessa diferença
		return "Nome: " + this.getNome() + 
				"\nIdade: " + String.valueOf( idade.getYears() ) + 
				"\nCliente desde: " + this.getDataInsercao().format(formatador);
	}
	
}
