package br.com.financas.model;

import java.text.NumberFormat;

public class Conta {

	// Atributos
	private String agencia;
	private String numero;
	private Cliente titular;
	private double saldo;
	
	// Construtores
	public Conta() {
		this.agencia = "";
		this.numero = "";
		this.titular = new Cliente();
		this.saldo = 0.0;
	}	
	public Conta(Cliente titular, double saldo) {
		this.agencia = "";
		this.numero = "";
		this.titular = titular;
		this.saldo = saldo;
	}	
	public Conta(String agencia, String numero, Cliente titular) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.0;
	}

	// M�todos de acesso
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// Funcionalidades
	public String identificar(){
		// declara��o de vari�vel
		String mensagem = "";
		double valorEmprestimo = 0;
				
		mensagem = "Titular: " + this.getTitular().getNome() + "\nSaldo: " + this.getSaldo();
		
		if(this.getSaldo() < 0) {
			
			valorEmprestimo = this.getTitular().getRendaMedia() * 3;
			
			// getCurrencyInstance() formata para moeda local
			mensagem = mensagem + "\nVoc� tem diretiro a um empr�stimo de " + NumberFormat.getCurrencyInstance().format(valorEmprestimo);
		}
		return mensagem;
	}

	
	public String depositar(double valor){
		this.setSaldo(this.getSaldo() + valor);
		return "Dep�sito realizado com sucesso!";
	}
	
	public String sacar(double valor){
		// Declara��o da vari�vel
		String mensagem;
		
		if(valor <= this.getSaldo()){
			this.setSaldo(this.getSaldo() - valor);
			mensagem = "Saque realizado com sucesso!";
		}else{
			mensagem = "Saldo insuficiente!";
		}
		
		return mensagem;
	}
	
	
}







