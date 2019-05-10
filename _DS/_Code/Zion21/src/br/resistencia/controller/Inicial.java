package br.resistencia.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Prof. Ralfe
 * @version �ltima atualiza��o: 28/08/2017
 */
public class Inicial extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Cria��o de um objeto FMXLLoader para carregar o arquivo fxml (layout)
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/resistencia/view/JFXLoginLayout.fxml"));
		// Cria��o do Layout Pane (gerenciador de layout) que ser� o node root (n� ou componente raiz)
		// recebendo o layout (arquivo fxml)
		Pane nodeRoot =  loader.load();
		// Atribui��o do componente raiz (e do layout) a cena
		Scene scene = new Scene(nodeRoot);
		// Atribui��o da cena ao palco prim�rio
		primaryStage.setScene(scene);
		
		// O objeto loader possui a refer�ncia da classe JFXLoginControle 
		JFXLoginControle loginControle = loader.getController();	
		// E acesso a seus m�todos.
		// A refer�ncia do palco prim�rio � passada para posterior acesso (fechamento)
		loginControle.setPalcoLogin(primaryStage);
		
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

















