package br.com.financas.controller;
import br.com.financas.model.Conta;

abstract public class GerenciadorContas {

	// Atributo
	private static double saldoTotal;
			
	// Métodos de acesso
	public static double getSaldoTotal() {
		return saldoTotal;
	}

	public static void setSaldoTotal(double saldoTotal) {
		GerenciadorContas.saldoTotal = saldoTotal;
	}
	
	// Funcionalidades
	
	public static void lerSaldo(Conta conta){
		GerenciadorContas.setSaldoTotal(GerenciadorContas.getSaldoTotal() + conta.getSaldo());
	}

	public static String transferencia(Conta origem, Conta destino, double valor){
		
		String mensagem = "";
		
		if(origem.getSaldo() >= valor){
			
			origem.setSaldo(origem.getSaldo() - valor);
			destino.setSaldo(destino.getSaldo() + valor);
			
			mensagem = "Tranferência realizada com sucesso!";
			
		}else{
			mensagem = "Saldo insuficiente na conta origem! \n Saldo em: " 
		               + origem.getClass().getName() + " R$ " + origem.getSaldo();
		}
		
		return mensagem;
	}
	
}
