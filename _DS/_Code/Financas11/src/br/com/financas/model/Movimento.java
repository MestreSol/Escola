package br.com.financas.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movimento {

	private LocalDate data;
	private String operacao;
	private double valor;
	
	
	public Movimento() {
		this.data = null;
		this.operacao = "";
		this.valor = 0;
	}
	
	public Movimento(LocalDate data, String operacao, double valor) {
		this.data = data;
		this.operacao = operacao;
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public String confirmacao() {
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return "Data: " + this.getData().format(formatador) + "\nOperação: " + this.getOperacao() + "\nValor: " + this.getValor();
	}
	
}
