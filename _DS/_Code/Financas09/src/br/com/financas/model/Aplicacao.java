package br.com.financas.model;

public class Aplicacao extends Conta {

	// Atributo
	private double rentabilidade;

	// Construtor
	public Aplicacao(String agencia, String numero, Cliente titular,
			             double rentabilidade) {
		super(agencia, numero, titular);
		this.rentabilidade = rentabilidade;
	}

	// Métodos de acesso
	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}

	// Funcionalidade
	
	public String identificar(){
		
		return "Titular: " + this.getTitular().getNome() + 
			   "\nSaldo: " + this.getSaldo() + 
			   "\nSaldo reajustado: " + (this.getSaldo() + (this.getSaldo() * (this.getRentabilidade() / 100)));
	}

}
