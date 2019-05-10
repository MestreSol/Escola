package br.com.financas.model;

public class Aplicacao extends Conta {


	private double rentabilidade;


	public Aplicacao(String agencia, String numero, Cliente titular,
			             double rentabilidade) {
		super(agencia, numero, titular);
		this.rentabilidade = rentabilidade;
	}

	
	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}


	
	public String identificar(){
		
		return "Titular: " + this.getTitular().getNome() + 
			   "\nSaldo: " + this.getSaldo() + 
			   "\nSaldo reajustado: " + (this.getSaldo() + (this.getSaldo() * (this.getRentabilidade() / 100)));
	}

}
