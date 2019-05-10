package br.resistencia.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.resistencia.model.Nativo;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class JFXNativoControle implements Initializable {
	
	// Cria��o de um objeto Nativo
	Nativo nativo = new Nativo();
	
	// Atributo
	private Stage palcoNativo;
	
	// Metodos de acesso ao atributo			
	public Stage getPalcoNativo() {
		return palcoNativo;
	}

	public void setPalcoNativo(Stage palcoNativo) {
		this.palcoNativo = palcoNativo;
	}

	// Componentes FXML
	@FXML TextField tfRegistro;
	@FXML TextField tfNome;
	@FXML TextField tfContato;
	@FXML PasswordField pfSenha;	
	@FXML TextField tfFuncao;
	@FXML CheckBox chbProgramacao;
	@FXML CheckBox chbLutas;
	@FXML CheckBox chbArmas;
	@FXML Button bInserir;
	@FXML Button bLimpar;
	@FXML Button bCarregar;
	@FXML Button bIdentificar;
	@FXML Button bFechar;
	@FXML ListView<String> lvFuncoes;	
	@FXML Button bAdicionarFuncao;
	@FXML Button bRemoverFuncao;	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		tfRegistro.setText(String.valueOf( nativo.getRegistro()));
	}	
	
	public void preencheLvFuncoes() {
			
		// Relaciona o ListView lvFuncoes com a fonte de dados (um ArrayList), 
		// neste caso, o conte�do do atributo funcao do objeto nativo   
		lvFuncoes.setItems(FXCollections.observableArrayList(nativo.getFuncao()));
	}

	
	@FXML public void adicionarFuncao() {
	
		// Se o tfFuncao estiver vazio n�o realiza a inser��o
		if(tfFuncao.getText().isEmpty()) {
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Alerta");
			alert.setHeaderText("Inser��o n�o realizada");
			alert.setContentText("Preencha a descri��o da fun��o a ser inserida");
			alert.showAndWait();
		
		}else {
			
			// Armazena a fun��o lida pelo formul�rio no objeto nativo
			// (lembrando que o atributo funcao � um ArrayList)
			nativo.setFuncao(tfFuncao.getText());
			
			// Limpa e posiciona o cursor no TextField
			tfFuncao.setText("");
			tfFuncao.requestFocus();
			
			// Executa o m�todo preencheLvFuncoes() atualizando a nova inser��o na fonte de dados (ArrayList)
			preencheLvFuncoes();	
		}		
	}
	
		
	@FXML public void removerFuncao() {	
		
		// Os m�todos getSelectionModel().getSelectedIndex() retornam o indice selecionado.
		// Se nenhum item estiver selecionado retorna -1, ou seja, realiza a remo��o se 
		// for retornado um indice v�lido (igual ou acima de zero)
		if(lvFuncoes.getSelectionModel().getSelectedIndex() >= 0) {
			
			// Recupera o indice selecionado
			int indice = lvFuncoes.getSelectionModel().getSelectedIndex();
			
			// E remove a posi��o indicada do atributo funcao
			nativo.getFuncao().remove(indice);
			
			// Executa o m�todo preencheLvFuncoes() atualizando a remo��o na fonte de dados (ArrayList)
			preencheLvFuncoes();			
			
		}else {
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Alerta");
			alert.setHeaderText("Remo��o n�o realizada");
			alert.setContentText("Selecione uma fun��o para ser removida");
			alert.showAndWait();
		}
	}
	
	
	// M�todos para eventos FXML
	@FXML public void inserir() {
		
		nativo.setNome(tfNome.getText());
		nativo.setContato(tfContato.getText());
		nativo.setSenha(pfSenha.getText().toString());
		
		if(chbProgramacao.isSelected()) {
			nativo.getPerfil().setProgramacao(true);	
		}else {
			nativo.getPerfil().setProgramacao(false);
		}
		
		if(chbArmas.isSelected()) {
			nativo.getPerfil().setArmas(true);
		}else {
			nativo.getPerfil().setArmas(false);
		}
		
		if(chbLutas.isSelected()) {
			nativo.getPerfil().setLutas(true);	
		}else {
			nativo.getPerfil().setLutas(false);
		}
		
	}

	@FXML public void limpar() {
		tfNome.setText("");
		tfContato.setText("");
		pfSenha.setText("");
		tfFuncao.setText("");
		chbProgramacao.setSelected(false);
		chbArmas.setSelected(false);
		chbLutas.setSelected(false);	
		
		lvFuncoes.getItems().clear();
	}

	@FXML public void carregar() {
		tfNome.setText(nativo.getNome());
		tfContato.setText(nativo.getContato());
		pfSenha.setText(nativo.getSenha());
		
		if(nativo.getPerfil().isProgramacao()) {
			chbProgramacao.setSelected(true);		
		}else {
			chbProgramacao.setSelected(false);
		}
		
		if(nativo.getPerfil().isArmas()) {
			chbArmas.setSelected(true);		
		}else {
			chbArmas.setSelected(false);
		}
		
		if(nativo.getPerfil().isLutas()) {
			chbLutas.setSelected(true);		
		}else {
			chbLutas.setSelected(false);
		}	
		
		preencheLvFuncoes();
	}

	
	@FXML public void identificar() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Nativo");
		alert.setHeaderText("Identifica��o");
		alert.setContentText(nativo.identificar());
		alert.showAndWait();
	}	
	
	@FXML public void fechar() {
		this.getPalcoNativo().close();
	}
}







































