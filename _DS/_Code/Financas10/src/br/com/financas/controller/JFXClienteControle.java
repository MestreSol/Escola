package br.com.financas.controller;

import java.io.EOFException;
import java.time.LocalDate;

import br.com.financas.model.Cliente;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;

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

	@FXML ListView<String> lvContatos;

	@FXML Button btAdicionar;

	@FXML Button btRemover;

	@FXML TextField tfContato;

	@FXML Label Contato;
	
	
	@FXML public void inserir() {
		LocalDate B = LocalDate.parse(dpNascimento.getValue().toString());
		Alert alert = new Alert(AlertType.ERROR);
		if(tfNome.getText()== "") {
			alert.setTitle("Verifique");
			alert.setHeaderText("Voce esqueceu de algo");
			alert.showAndWait();
		}else if(tfCpf.getText() == "") {
			alert.setTitle("Verifique");
			alert.setHeaderText("Voce esqueceu de algo");
			alert.showAndWait();
		}else if(tfEndereco.getText()=="") {
			alert.setTitle("Verifique");
			alert.setHeaderText("Voce esqueceu de algo");
			alert.showAndWait();
		}else if(B.isBefore(LocalDate.now())){
		cliente.setDataInsercao(LocalDate.now());
		cliente.setNome(tfNome.getText());
		cliente.setEndereco(tfEndereco.getText());
		cliente.setCpf(tfCpf.getText());
		cliente.setDataNascimento(dpNascimento.getValue());
		}else {
			alert.setTitle("Man");
			alert.setHeaderText("Voce nasceu hoje?");
			alert.showAndWait();
		}
	}
	
	
	@FXML public void carregar() {
		
		tfNome.setText(cliente.getNome());
		tfEndereco.setText(cliente.getEndereco());
		tfCpf.setText(cliente.getCpf());
		dpNascimento.setValue(cliente.getDataNascimento());
		preencherLvContatos();
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
		lvContatos.getItems().clear();
	}
	
	@FXML public void fechar() {
		this.getPalcoCliente().close();
	}

	@FXML public void RemoverContato() {
		if(lvContatos.getSelectionModel().getSelectedIndex() >=0) {
			
			int A = lvContatos.getSelectionModel().getSelectedIndex();
			cliente.getContatos().remove(A);
			preencherLvContatos();
		}else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("O caramba");
			alert.setHeaderText("Se nao tem contatinho");
			alert.showAndWait();
			
		}
		try {
			
		}catch(Exception e) {}
	}

	@FXML public void AdicionerContato() {
		
		if(tfContato.getText().isEmpty()) {
			
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("OPS");
			alert.setHeaderText("Acho que você esqueceu de escrever o contato");
			alert.setContentText("Digite um valor da proxima vez!");
			alert.showAndWait();
			tfContato.requestFocus();
		}else{
			cliente.setContatos(tfContato.getText());
			tfContato.setText("");
			tfContato.requestFocus();
			preencherLvContatos();
			}
			}
		


	public void preencherLvContatos() {

		lvContatos.setItems(FXCollections.observableArrayList(cliente.getContatos()));
		
	}
}