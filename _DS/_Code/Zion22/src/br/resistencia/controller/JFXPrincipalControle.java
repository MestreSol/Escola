package br.resistencia.controller;

import java.io.IOException;

import br.resistencia.model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Prof. Ralfe
 * @version �ltima atualiza��o: 06/09/2017
 */
public class JFXPrincipalControle {

	// Atributos
	private Usuario usuarioLogado;
	private Stage palcoPrincipal;

	// M�todos de acesso aos atributos
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	public Stage getPalcoPrincipal() {
		return palcoPrincipal;
	}
	public void setPalcoPrincipal(Stage palcoPrincipal) {
		this.palcoPrincipal = palcoPrincipal;
	}

	// Componentes FXML
	@FXML MenuItem menuBluePill;
	@FXML MenuItem menuNativo;
	@FXML MenuItem menuRedPill;
	@FXML MenuItem menuSair;
	@FXML MenuItem menuDataHora;
	@FXML Menu menuUsuarioLogado;
	
	// M�todos de acesso ao cont�udo armazenado no menuUsuarioLogado (somente para identifica��o do usu�rio logado)
	public String getMenuUsuarioLogado() {
		return this.menuUsuarioLogado.getText();
	}
	public void setlMenuUsuarioLogado(String usuarioLogado) {
		this.menuUsuarioLogado.setText(usuarioLogado);
	}

	// M�todos para eventos FXML
	@FXML public void abrirBluePill() throws IOException {
		
		// Cria um novo palco
		Stage stage = new Stage();
		// Objeto FMXLLoader que carrega o arquivo fxml
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/resistencia/view/JFXBluePillLayout.fxml"));
		// Cria��o do Layout Pane (gerenciador de layout), que ser� o node/n�/componente raiz, e vinculo com o arquivo fxml
		BorderPane node =  loader.load();
		// Atribui��o do componente a cena
		Scene scene = new Scene(node);
		// Atribui��o da cena ao novo palco
		stage.setScene(scene);

		// O objeto loader possui a refer�ncia da classe JFXNativoControle 
		JFXBluePillControle bluePillControle = loader.getController();	
		// E acesso a seus m�todos.
		// A refer�ncia do palco criado � passada para posterior acesso (fechamento)
		bluePillControle.setPalcoBluePill(stage);
		
		// Retira a barra superior da janela (icone, titulo, minimizar, maximizar e fechar)
		stage.initStyle(StageStyle.UNDECORATED);
		// N�o permite o redimensionamento
		stage.setResizable(false);
		// Centraliza a apresenta��o
		stage.centerOnScreen();
		// Define o comportamento Modal (bloqueia os demais formul�rios enquanto ele estiver aberto)
		stage.initModality(Modality.WINDOW_MODAL);
		// Indica que esse formul�rio (principal) ficar� bloqueado enquanto o formul�rio de nativos estiver ativo
		stage.initOwner(this.getPalcoPrincipal());
		// Apresenta o formul�rio
		stage.show();		
	}
	
	@FXML public void abrirNativo() throws IOException {
		
		// Cria um novo palco
		Stage stage = new Stage();
		// Objeto FMXLLoader que carrega o arquivo fxml
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/resistencia/view/JFXNativoLayout.fxml"));
		// Cria��o do Layout Pane (gerenciador de layout), que ser� o node/n�/componente raiz, e vinculo com o arquivo fxml
		BorderPane node =  loader.load();
		// Atribui��o do componente a cena
		Scene scene = new Scene(node);
		// Atribui��o da cena ao novo palco
		stage.setScene(scene);

		// O objeto loader possui a refer�ncia da classe JFXNativoControle 
		JFXNativoControle nativoControle = loader.getController();	
		// E acesso a seus m�todos.
		// A refer�ncia do palco criado � passada para posterior acesso (fechamento)
		nativoControle.setPalcoNativo(stage);
		
		// Retira a barra superior da janela (icone, titulo, minimizar, maximizar e fechar)
		stage.initStyle(StageStyle.UNDECORATED);
		// N�o permite o redimensionamento
		stage.setResizable(false);
		// Centraliza a apresenta��o
		stage.centerOnScreen();
		// Define o comportamento Modal (bloqueia os demais formul�rios enquanto ele estiver aberto)
		stage.initModality(Modality.WINDOW_MODAL);
		// Indica que esse formul�rio (principal) ficar� bloqueado enquanto o formul�rio de nativos estiver ativo
		stage.initOwner(this.getPalcoPrincipal());
		// Apresenta o formul�rio
		stage.show();		
	}

	@FXML public void abrirRedPill() {}

	
	@FXML public void abrirDataHora() throws IOException {
		
		// Cria um novo palco
		Stage stage = new Stage();
		// Objeto FMXLLoader que carrega o arquivo fxml
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/resistencia/view/JFXDataHoraLayout.fxml"));
		// Cria��o do Layout Pane (gerenciador de layout), que ser� o node/n�/componente raiz, e vinculo com o arquivo fxml
		Pane node =  loader.load();
		// Atribui��o do componente a cena
		Scene scene = new Scene(node);
		// Atribui��o da cena ao novo palco
		stage.setScene(scene);
		// O objeto loader possui a refer�ncia da classe JFXNativoControle 
		JFXDataHoraControle dataHoraControle = loader.getController();	
		// E acesso a seus m�todos.
		// A refer�ncia do palco criado � passada para posterior acesso (fechamento)
		dataHoraControle.setPalcoDataHora(stage);		
		// Retira a barra superior da janela (icone, titulo, minimizar, maximizar e fechar)
		stage.initStyle(StageStyle.UNDECORATED);
		// N�o permite o redimensionamento
		stage.setResizable(false);
		// Centraliza a apresenta��o
		stage.centerOnScreen();
		// Define o comportamento Modal (bloqueia os demais formul�rios enquanto ele estiver aberto)
		stage.initModality(Modality.WINDOW_MODAL);
		// Indica que esse formul�rio (principal) ficar� bloqueado enquanto o formul�rio de nativos estiver ativo
		stage.initOwner(this.getPalcoPrincipal());
		// Apresenta o formul�rio
		stage.show();		
		
		
	}
	
	@FXML public void sair() {
		System.exit(0);
	}

}







