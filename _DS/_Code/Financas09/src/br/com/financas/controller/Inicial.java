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

		// Criação de um objeto FMXLLoader para carregar o arquivo fxml (layout)
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/com/financas/view/JFXPrincipalLayout.fxml"));
		// Criação do Layout Pane (gerenciador de layout) que será o node root (nó ou componente raiz)
		// recebendo o layout (arquivo fxml)
		BorderPane nodeRoot =  loader.load();
		// Atribuição do componente raiz (e do layout) a cena
		Scene scene = new Scene(nodeRoot);
		// Atribuição da cena ao palco primário
		primaryStage.setScene(scene);

		// O objeto loader possui a referência da classe JFXPrincipalControle 
		JFXPrincipalControle principalControle = loader.getController();	
		// E acesso a seus métodos.
		// A referência do palco criado é passada para posterior acesso
		principalControle.setPalcoPrincipal(primaryStage);
		// O objeto do usuario logado é passado para o JFXPrincipalControle
		
		// Retira a barra superior da janela (icone, titulo, minimizar, maximizar e fechar)
		primaryStage.initStyle(StageStyle.UNDECORATED);
		// Não permite o redimensionamento
		primaryStage.setResizable(false);
		// Centraliza a apresentação
		primaryStage.centerOnScreen();
		
		// Apresenta o formulário
		primaryStage.show();		
	}

	
	public static void main(String[] args) {

		launch(args);
	}

	
}
