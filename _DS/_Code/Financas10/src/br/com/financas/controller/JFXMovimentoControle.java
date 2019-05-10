package br.com.financas.controller;

import br.com.financas.model.ContaCorrente;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class JFXMovimentoControle {

	// Cria��o dos objetos
	ContaCorrente contaCorrente = new ContaCorrente();
	
	private Stage palcoMovimento;
	
	@FXML TextField tfValor;
	@FXML Button bDeposito;
	@FXML Button bSacar;
	@FXML TextField tfSaldo;
	@FXML Button bFechar;
	@FXML DatePicker dpData;
	
	public Stage getPalcoMovimento() {
		return palcoMovimento;
	}

	public void setPalcoMovimento(Stage palcoMovimento) {
		this.palcoMovimento = palcoMovimento;
	}

	@FXML public void depositar() {
		
		Alert alertDeposito = new Alert(AlertType.INFORMATION);
		alertDeposito.setTitle("Dep�sito");
		// Apresenta o retorno do m�todo depositar
		alertDeposito.setHeaderText(contaCorrente.depositar(Double.parseDouble( tfValor.getText())));
		alertDeposito.showAndWait();
	
		// Apresenta o saldo atual
		tfSaldo.setText( String.valueOf(contaCorrente.getSaldo()));
		
		// Limpa e posiciona o cursor para o pr�ximo o lan�amento
		tfValor.clear();
		tfValor.requestFocus();
	}
	
	@FXML public void sacar() {
			
		Alert alertDeposito = new Alert(AlertType.INFORMATION);
		alertDeposito.setTitle("Saque");
		// Apresenta o retorno do m�todo sacar
		alertDeposito.setHeaderText(contaCorrente.sacar(Double.parseDouble( tfValor.getText())));
		alertDeposito.showAndWait();
	
		// Apresenta o saldo atual
		tfSaldo.setText( String.valueOf(contaCorrente.getSaldo()));
		
		// Limpa e posiciona o cursor para o pr�ximo o lan�amento
		tfValor.clear();
		tfValor.requestFocus();
	}
		
	
	@FXML public void fechar() {
		this.getPalcoMovimento().close();
	}

}
