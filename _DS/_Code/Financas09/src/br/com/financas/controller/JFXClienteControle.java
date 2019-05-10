package br.com.financas.controller;

import java.time.LocalDate;

import br.com.financas.model.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class JFXClienteControle {

	
	Cliente cliente = new Cliente();
	
	private Stage palcoCliente;
	
	public Stage getPalcoCliente() {
		return palcoCliente;
	}

	public void setPalcoCliente(Stage palcoCliente) {
		this.palcoCliente = palcoCliente;
	}

	@FXML TextField tfNome;
	@FXML TextField tfCpf;
	@FXML TextField tfEndereco;
	@FXML DatePicker dpNascimento;
	@FXML Button bInserir;
	@FXML Button bCarregar;
	@FXML Button bIdentificar;
	@FXML Button bLimpar;
	@FXML Button bFechar;
	
	
	@FXML public void inserir() {
		
		cliente.setDataInsercao(LocalDate.now());
		cliente.setNome(tfNome.getText());
		cliente.setEndereco(tfEndereco.getText());
		cliente.setCpf(tfCpf.getText());
		cliente.setDataNascimento(dpNascimento.getValue());
	}
	
	
	@FXML public void carregar() {
		
		tfNome.setText(cliente.getNome());
		tfEndereco.setText(cliente.getEndereco());
		tfCpf.setText(cliente.getCpf());
		dpNascimento.setValue(cliente.getDataNascimento());
	}
	
	@FXML public void identificar() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Identificar");
		alert.setHeaderText( cliente.identificar());
		alert.showAndWait();
	}
	
	@FXML public void limpar() {
		
		tfNome.setText("");
		tfEndereco.setText("");
		tfCpf.setText("");
		dpNascimento.setValue(null);
	}
	
	@FXML public void fechar() {
		this.getPalcoCliente().close();
	}

}
