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
 * @version Última atualização: 06/09/2017
 */
public class JFXPrincipalControle {

	// Atributos
	private Usuario usuarioLogado;
	private Stage palcoPrincipal;

	// Métodos de acesso aos atributos
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
	
	// Métodos de acesso ao contéudo armazenado no menuUsuarioLogado (somente para identificação do usuário logado)
	public String getMenuUsuarioLogado() {
		return this.menuUsuarioLogado.getText();
	}
	public void setlMenuUsuarioLogado(String usuarioLogado) {
		this.menuUsuarioLogado.setText(usuarioLogado);
	}

	// Métodos para eventos FXML
	@FXML public void abrirBluePill() throws IOException {
		
		// Cria um novo palco
		Stage stage = new Stage();
		// Objeto FMXLLoader que carrega o arquivo fxml
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/resistencia/view/JFXBluePillLayout.fxml"));
		// Criação do Layout Pane (gerenciador de layout), que será o node/nó/componente raiz, e vinculo com o arquivo fxml
		BorderPane node =  loader.load();
		// Atribuição do componente a cena
		Scene scene = new Scene(node);
		// Atribuição da cena ao novo palco
		stage.setScene(scene);

		// O objeto loader possui a referência da classe JFXNativoControle 
		JFXBluePillControle bluePillControle = loader.getController();	
		// E acesso a seus métodos.
		// A referência do palco criado é passada para posterior acesso (fechamento)
		bluePillControle.setPalcoBluePill(stage);
		
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
	
	@FXML public void abrirNativo() throws IOException {
		
		// Cria um novo palco
		Stage stage = new Stage();
		// Objeto FMXLLoader que carrega o arquivo fxml
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/resistencia/view/JFXNativoLayout.fxml"));
		// Criação do Layout Pane (gerenciador de layout), que será o node/nó/componente raiz, e vinculo com o arquivo fxml
		BorderPane node =  loader.load();
		// Atribuição do componente a cena
		Scene scene = new Scene(node);
		// Atribuição da cena ao novo palco
		stage.setScene(scene);

		// O objeto loader possui a referência da classe JFXNativoControle 
		JFXNativoControle nativoControle = loader.getController();	
		// E acesso a seus métodos.
		// A referência do palco criado é passada para posterior acesso (fechamento)
		nativoControle.setPalcoNativo(stage);
		
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

	@FXML public void abrirRedPill() {}

	
	@FXML public void abrirDataHora() throws IOException {
		
		// Cria um novo palco
		Stage stage = new Stage();
		// Objeto FMXLLoader que carrega o arquivo fxml
		FXMLLoader loader = new FXMLLoader();
		// Carregamento o arquivo fxml
		loader.setLocation(getClass().getResource("/br/resistencia/view/JFXDataHoraLayout.fxml"));
		// Criação do Layout Pane (gerenciador de layout), que será o node/nó/componente raiz, e vinculo com o arquivo fxml
		Pane node =  loader.load();
		// Atribuição do componente a cena
		Scene scene = new Scene(node);
		// Atribuição da cena ao novo palco
		stage.setScene(scene);
		// O objeto loader possui a referência da classe JFXNativoControle 
		JFXDataHoraControle dataHoraControle = loader.getController();	
		// E acesso a seus métodos.
		// A referência do palco criado é passada para posterior acesso (fechamento)
		dataHoraControle.setPalcoDataHora(stage);		
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







