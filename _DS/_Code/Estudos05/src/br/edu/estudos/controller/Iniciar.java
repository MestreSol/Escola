package br.edu.estudos.controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Iniciar extends Application {
	@Override
	public void start(Stage PrimaryStage) throws IOException {
	FXMLLoader loader = new FXMLLoader();
	loader.setLocation(getClass().getResource("/br/edu/estudos/view/JFXDiciplinasLayout.fxml"));
	Pane NodeRoot = loader.load();
	Scene Scene = new Scene(NodeRoot);
	PrimaryStage.setScene(Scene);
	
	JFXDiciplinasControle DiciplinaControle = loader.getController(); 
	DiciplinaControle.setDiciplinas(PrimaryStage);
	
	PrimaryStage.initStyle(StageStyle.UNDECORATED);
	PrimaryStage.setResizable(false);
	PrimaryStage.centerOnScreen();
	PrimaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);	
	}
	}
