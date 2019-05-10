package br.com.financas.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Inicial extends Application {


	@Override
	public void start(Stage primaryStage) throws Exception {

		// Cria��o de um objeto FMXLLoader para carregar o arquivo fxml (layout)
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/com/financas/view/JFXPrincipalLayout.fxml"));
		// Cria��o do Layout Pane (gerenciador de layout) que ser� o node root (n� ou componente raiz)
		// recebendo o layout (arquivo fxml)
		BorderPane nodeRoot =  loader.load();
		// Atribui��o do componente raiz (e do layout) a cena
		Scene scene = new Scene(nodeRoot);
		// Atribui��o da cena ao palco prim�rio
		primaryStage.setScene(scene);

		// O objeto loader possui a refer�ncia da classe JFXPrincipalControle 
		JFXPrincipalControle principalControle = loader.getController();	
		// E acesso a seus m�todos.
		// A refer�ncia do palco criado � passada para posterior acesso
		principalControle.setPalcoPrincipal(primaryStage);
		// O objeto do usuario logado � passado para o JFXPrincipalControle
		
		// Retira a barra superior da janela (icone, titulo, minimizar, maximizar e fechar)
		primaryStage.initStyle(StageStyle.UNDECORATED);
		// N�o permite o redimensionamento
		primaryStage.setResizable(false);
		// Centraliza a apresenta��o
		primaryStage.centerOnScreen();
		
		// Apresenta o formul�rio
		primaryStage.show();		
	}

	
	public static void main(String[] args) {

		launch(args);
	}

	
}
