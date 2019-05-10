package br.resistencia.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.resistencia.model.Nativo;
import br.resistencia.model.RedPill;
import br.resistencia.model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Prof. Ralfe
 * @version Última atualização: 06/09/2017
 */
public class JFXLoginControle implements Initializable {

	// (Por enquanto) Criação dos objetos que serão usuários
	Nativo nativo = new Nativo("Tank", "root", null, "123", true, false, true, "piloto");
	RedPill redPill = new RedPill("Trinity", "trinity@zion",  null, "trinity", false, true, true, true);
	// Declaração de um atributo que receberá o usuario logado
	// Atente para o polimorfismo por interface.
	private Usuario usuario;	
	
	// Atributo
	private Stage palcoLogin;
	
	// Métodos de acesso ao atributo
	public Stage getPalcoLogin() {
		return palcoLogin;
	}
	public void setPalcoLogin(Stage palcoLogin) {
		this.palcoLogin = palcoLogin;
	}

	// Componentes FXML
	@FXML ComboBox<String> cbUsuario;
	@FXML TextField tfLogin;
	@FXML PasswordField pfSenha;
	@FXML Button bOk;
	@FXML Button bCancelar;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Inicializa os items do ComboBox cbUsuario
		cbUsuario.getItems().addAll("Nativo","RedPill");
	}	
	
	// Métodos para eventos FXML
	@FXML public void ok() throws IOException {
		// Declaração de variáveis
		String contatoUsuario = "", senhaUsuario = "";
		String contatoInformado = "", senhaInformada = "";

		// Verifica o usuario selecionado e armazena o respectivo objeto em usuario
		if(cbUsuario.getSelectionModel().getSelectedItem().toString().equals("Nativo")) {
			usuario = nativo;
		}

		if(cbUsuario.getSelectionModel().getSelectedItem().toString().equals("RedPill")) {
			usuario = redPill;
		}

		// Obtém o contato e senha armazenados no usuario
		contatoUsuario = usuario.getContato();
		senhaUsuario = usuario.getSenha();
		
		// Obtém o contato e senha informados no formulário
		contatoInformado = tfLogin.getText(); 
		senhaInformada = pfSenha.getText();

		// Valida o contato e senha
		if(contatoInformado.equals(contatoUsuario) && senhaInformada.equals(senhaUsuario)) {
			// Se for válido, invoca o formulário principal

			// Cria um novo palco
			Stage stage = new Stage();
			// Criação de um objeto FMXLLoader para carregar o arquivo fxml (layout)
			FXMLLoader loader = new FXMLLoader();
			// Carregamento o arquivo fxml
			loader.setLocation(getClass().getResource("/br/resistencia/view/JFXPrincipalLayout.fxml"));
			// Criação do Layout Pane (gerenciador de layout) que será o node root (nó ou componente raiz)
			// recebendo o layout (arquivo fxml)
			BorderPane node =  loader.load();
			// Atribuição do componente raiz (e do layout) a cena
			Scene scene = new Scene(node);
			// Atribuição da cena ao palco
			stage.setScene(scene);

			// O objeto loader possui a referência da classe JFXPrincipalControle 
			JFXPrincipalControle principalControle = loader.getController();	
			// E acesso a seus métodos.
			// A referência do palco criado é passada para posterior acesso
			principalControle.setPalcoPrincipal(stage);
			// O objeto do usuario logado é passado para o JFXPrincipalControle
			principalControle.setUsuarioLogado(usuario);
			// O usuário logado é identificado pelo nome
			principalControle.setlMenuUsuarioLogado("Usuário: " + usuario.getNome());
			
			// Retira a barra superior da janela (icone, titulo, minimizar, maximizar e fechar)
			stage.initStyle(StageStyle.UNDECORATED);
			// Não permite o redimensionamento
			stage.setResizable(false);
			// Centraliza a apresentação
			stage.centerOnScreen();
			stage.setHeight(Screen.getPrimary().getVisualBounds().getHeight());
			stage.setWidth(Screen.getPrimary().getVisualBounds().getWidth()); 			
			// Apresenta o formulário
			stage.show();
			
			
			// Fecha esse formulário
			this.getPalcoLogin().close();

		
		}else {
			// Se o contato e/ou senha estiverem incorretos			
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Login");
			alert.setHeaderText("Validação de usuário.");
			alert.setContentText("Contato e/ou senha não encontrados!");
			alert.showAndWait();
		}
	}

	
	@FXML public void cancelar() {
		System.exit(0);
	}
}








































