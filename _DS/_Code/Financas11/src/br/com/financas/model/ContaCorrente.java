package br.com.financas.model;

public class ContaCorrente extends Conta {

	
	private double limiteEspecial;

	
	public ContaCorrente() {
		super();
		this.limiteEspecial = 0;
	}
	
	public ContaCorrente(String agencia, String numero, Cliente titular,
			             double limiteEspecial) {
		super(agencia, numero, titular);
		this.limiteEspecial = limiteEspecial;
	}

	
	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	
	
	public String sacar(double valor){
	
		String mensagem;
		double saldoComLimite = this.getSaldo() + this.getLimiteEspecial();		
		
		if(valor <= this.getSaldo()){
			this.setSaldo(this.getSaldo() - valor);
			mensagem = "Saque realizado com sucesso!";
		}else{
			
			if(valor <= saldoComLimite){
				this.setSaldo(this.getSaldo() - valor);
				mensagem = "Saque realizado com sucesso!\nObs.: Utilizando limite especial.";				
			}else{
				mensagem = "Saldo insuficiente!";	
			}
		}
		
		return mensagem;
	}
	
	
	public String identificar(){
		
		return "Titular: " + this.getTitular().getNome() + 
			   "\nSaldo: " + this.getSaldo() + 
			   "\nSaldo com limite especial: " + (this.getSaldo() + this.getLimiteEspecial());
	}

}
