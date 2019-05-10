package br.com.financas.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class JFXPrincipalControle {

	private Stage palcoPrincipal;
	
	public Stage getPalcoPrincipal() {
		return palcoPrincipal;
	}

	public void setPalcoPrincipal(Stage palcoPrincipal) {
		this.palcoPrincipal = palcoPrincipal;
	}


	@FXML MenuItem menuCliente;
	@FXML MenuItem menuMovimento;
	@FXML MenuItem menuSair;
	
	
	@FXML public void abrirCliente() throws IOException {
		// Cria um novo palco
		Stage stage = new Stage();
		// Objeto FMXLLoader que carrega o arquivo fxml
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/com/financas/view/JFXClienteLayout.fxml"));
		// Criação do Layout Pane (gerenciador de layout), que será o node/nó/componente raiz, e vinculo com o arquivo fxml
		Pane node =  loader.load();
		// Atribuição do componente a cena
		Scene scene = new Scene(node);
		// Atribuição da cena ao novo palco
		stage.setScene(scene);

		// O objeto loader possui a referência da classe JFXNativoControle 
		JFXClienteControle clienteControle = loader.getController();	
		// E acesso a seus métodos.
		// A referência do palco criado é passada para posterior acesso (fechamento)
		clienteControle.setPalcoCliente(stage);
		
		// Retira a barra superior da janela (icone, titulo, minimizar, maximizar e fechar)
		stage.initStyle(StageStyle.UNDECORATED);
		// Não permite o redimensionamento
		stage.setResizable(false);
		// Centraliza a apresentação
		stage.centerOnScreen();
		// Define o comportamento Modal (bloqueia os demais formulários enquanto ele estiver aberto)
		stage.initModality(Modality.WINDOW_MODAL);
		// Indica que esse formulário (principal) ficará bloqueado enquanto o formulário de nativos estiver ativo
		stage.initOwner(this.getPalcoPrincipal());
		// Apresenta o formulário
		stage.show();		

	}

	
	
	@FXML public void abrirMovimento() throws IOException {
		
		// Cria um novo palco
		Stage stage = new Stage();
		// Objeto FMXLLoader que carrega o arquivo fxml
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/com/financas/view/JFXMovimentoLayout.fxml"));
		// Criação do Layout Pane (gerenciador de layout), que será o node/nó/componente raiz, e vinculo com o arquivo fxml
		Pane node =  loader.load();
		// Atribuição do componente a cena
		Scene scene = new Scene(node);
		// Atribuição da cena ao novo palco
		stage.setScene(scene);

		// O objeto loader possui a referência da classe JFXNativoControle 
		JFXMovimentoControle movimentoControle = loader.getController();	
		// E acesso a seus métodos.
		// A referência do palco criado é passada para posterior acesso (fechamento)
		movimentoControle.setPalcoMovimento(stage);
		
		// Retira a barra superior da janela (icone, titulo, minimizar, maximizar e fechar)
		stage.initStyle(StageStyle.UNDECORATED);
		// Não permite o redimensionamento
		stage.setResizable(false);
		// Centraliza a apresentação
		stage.centerOnScreen();
		// Define o comportamento Modal (bloqueia os demais formulários enquanto ele estiver aberto)
		stage.initModality(Modality.WINDOW_MODAL);
		// Indica que esse formulário (principal) ficará bloqueado enquanto o formulário de nativos estiver ativo
		stage.initOwner(this.getPalcoPrincipal());
		// Apresenta o formulário
		stage.show();				
	}
	
	
	@FXML public void sair() {
		System.exit(0);
	}

}
