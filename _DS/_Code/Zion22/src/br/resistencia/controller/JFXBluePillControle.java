package br.resistencia.controller;

import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import br.resistencia.model.tableView.BluePillTableViewModel;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;

public class JFXBluePillControle implements Initializable{

	// Atributos
	private Stage palcoBluePill;
	private ArrayList<BluePillTableViewModel> listaBluePilltvModel = new ArrayList<BluePillTableViewModel>();
	private String operacao;

	// Controles FXML
	@FXML TextField tfNome;
	@FXML TextField tfContato;
	@FXML TextField tfProfissao;
	@FXML CheckBox chbProgramacao;
	@FXML CheckBox chbLutas;
	@FXML CheckBox chbArmas;
	@FXML DatePicker dpNascimento;
	@FXML Button bInserir;
	@FXML Button bAlterar;
	@FXML Button bExcluir;
	@FXML Button bCancelar;
	@FXML Button bConfirmar;
	@FXML Button bFechar;
	@FXML TableView<BluePillTableViewModel> tvBluePills;
	@FXML TableColumn<BluePillTableViewModel, String> colNome;
	@FXML TableColumn<BluePillTableViewModel, String> colContato;
	@FXML TableColumn<BluePillTableViewModel, String> colProfissao;
	@FXML TableColumn<BluePillTableViewModel, String> colNascimento;
	@FXML TableColumn<BluePillTableViewModel, Boolean> colProgramacao;
	@FXML TableColumn<BluePillTableViewModel, Boolean> colLutas;
	@FXML TableColumn<BluePillTableViewModel, Boolean> colArmas;
	
	// M�todos de acesso
	public Stage getPalcoBluePill() {
		return palcoBluePill;
	}
	public void setPalcoBluePill(Stage palcoBluePill) {
		this.palcoBluePill = palcoBluePill;
	}	
	public ArrayList<BluePillTableViewModel> getListaBluePilltvModel() {
		return listaBluePilltvModel;
	}
	// Recebe um ArrayList e sobrep�e os valores anteriormente armazenados
	public void setListaBluePilltvModel(ArrayList<BluePillTableViewModel> listaBluePilltvModel) {
		this.listaBluePilltvModel.addAll(listaBluePilltvModel);
	}
	// Recebe um objeto BluePillTableViewModel e adiciona ao ArrayList
	public void setListaBluePilltvModel(BluePillTableViewModel bluePillTableViewModel) {
		this.listaBluePilltvModel.add(bluePillTableViewModel);
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	// Funcionalidades do formul�rio

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// Vincula o atributo da classe model com a coluna da TableView
		colNome.setCellValueFactory( new PropertyValueFactory<>("pNome"));
		colContato.setCellValueFactory( new PropertyValueFactory<>("pContato"));		
		colProfissao.setCellValueFactory( new PropertyValueFactory<>("pProfissao"));
		
		// Para formata��o da coluna colNascimento
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Cria a coluna colNascimento formatando o valor LocaDate armazenado no atributo pNascimento como dia/m�s/ano.
		colNascimento.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<BluePillTableViewModel,String>, ObservableValue<String>>() {
			
            public ObservableValue<String> call(CellDataFeatures<BluePillTableViewModel, String> cell) {
                final BluePillTableViewModel bluePillTableViewModel = cell.getValue();
                final SimpleObjectProperty<String> dataFormatada = new SimpleObjectProperty<String>(formatador.format(bluePillTableViewModel.getpNascimento()));
            return dataFormatada;
            }        
        });
		
		// Vincula o atributo da classe model com a coluna da TableView
		// e cria um componente CheckBox na coluna
		colProgramacao.setCellValueFactory( new PropertyValueFactory<>("pProgramacao"));
		colProgramacao.setCellFactory( CheckBoxTableCell.forTableColumn(colProgramacao));		
		colLutas.setCellValueFactory( new PropertyValueFactory<>("pLutas"));
		colLutas.setCellFactory( CheckBoxTableCell.forTableColumn(colLutas));
		colArmas.setCellValueFactory( new PropertyValueFactory<>("pArmas"));
		colArmas.setCellFactory( CheckBoxTableCell.forTableColumn(colArmas));
		
		bConfirmar.setVisible(false);
		bCancelar.setVisible(false);
	}
	
	
	@FXML public void inserir() {
		
		this.habilitarCampos();
		this.limparCampos();
		this.ajustarBotoesInserir();
		tfNome.requestFocus();
		
		// Identifica a opra��o e ajusta os bot�es
		this.setOperacao("inserir");
		this.ajustarBotoesInserir();
	}
	

	@FXML public void alterar() {
		
		try {
			
			// Verifica se nenhum bluePill foi selecionado
			if(tvBluePills.getSelectionModel().getSelectedIndex() < 0) {
				throw new IOException();
			}
			
			this.habilitarCampos();
			this.ajustarBotoesAlterar();
			tfNome.requestFocus();
			
			// Identifica a opera��o e ajusta os bot�es		
			this.setOperacao("alterar");
			this.ajustarBotoesAlterar();
			
		} catch (IOException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Ops!");
			alert.setHeaderText("Opera��o n�o pode ser realizada");
			alert.setContentText("Selecione um bluePill para altera��o");
			alert.showAndWait();				
		} catch (Exception e) {
			// A exce��o ocorre quando uma exception diferente das tratadas acima � gerada.
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Opera��o n�o realizada");
			alert.setHeaderText("Ocorreu um problema no processo de entrada");
			alert.setContentText("Favor entrar em contato com os desenvolvedores!");
			alert.showAndWait();
			// Detalhes do erro imprevisto
			e.printStackTrace();
		}				
	}
	
	
	@FXML public void excluir() {

		// Verifica se um bluePill foi selecionado
		if(tvBluePills.getSelectionModel().getSelectedIndex() >= 0) {

			// Identifica a opra��o e ajusta os bot�es		
			this.setOperacao("excluir");
			this.ajustarBotoesExcluir();

		}else {

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Alerta");
			alert.setHeaderText("Exclus�o n�o realizada");
			alert.setContentText("Selecione um monitorado para exclus�o");
			alert.showAndWait();
		}		
	}
	
	
	@FXML public void confirmar() {
	
		try {

			// Verifica se algum campo n�o foi preenchido (crit�rio obrigat�rio para Inser��o e Altera��o)
			if (tfNome.getText().isEmpty() ||
				tfContato.getText().isEmpty() ||   
				tfProfissao.getText().isEmpty() ||
				dpNascimento.getValue() == null) {

				throw new IOException();	
			}

			// Se a opera��o for inserir
			if(this.getOperacao().equals("inserir")) {

				// Cria um objeto BluePill para receber os dados lidos pelo formul�rio
				BluePillTableViewModel novoBluePilltvModel = new BluePillTableViewModel();

				novoBluePilltvModel.setpNome( tfNome.getText() );
				novoBluePilltvModel.setpContato( tfContato.getText() );
				novoBluePilltvModel.setpProfissao( tfProfissao.getText() );
				novoBluePilltvModel.setpNascimento( dpNascimento.getValue() );

				if(chbProgramacao.isSelected()) {
					novoBluePilltvModel.setpProgramacao(true);	
				}else {
					novoBluePilltvModel.setpProgramacao(false);
				}
				if(chbArmas.isSelected()) {
					novoBluePilltvModel.setpArmas(true);
				}else {
					novoBluePilltvModel.setpArmas(false);
				}
				if(chbLutas.isSelected()) {
					novoBluePilltvModel.setpLutas(true);	
				}else {
					novoBluePilltvModel.setpLutas(false);
				}

				// Insere o objeto no atributo (ArrayList) listaBluePill
				this.setListaBluePilltvModel(novoBluePilltvModel);

				// Atualiza a tabela
				this.atualizarTableView();
			}

			// Se a opera��o for alterar
			if(this.getOperacao().equals("alterar")) {

				// Cria um objeto BluePill para receber os dados lidos pelo formul�rio
				BluePillTableViewModel alteracaoBluePilltvModel = new BluePillTableViewModel();

				alteracaoBluePilltvModel.setpNome( tfNome.getText() );
				alteracaoBluePilltvModel.setpContato( tfContato.getText() );
				alteracaoBluePilltvModel.setpProfissao( tfProfissao.getText() );
				alteracaoBluePilltvModel.setpNascimento( dpNascimento.getValue() );

				if(chbProgramacao.isSelected()) {
					alteracaoBluePilltvModel.setpProgramacao(true);	
				}else {
					alteracaoBluePilltvModel.setpProgramacao(false);
				}
				if(chbArmas.isSelected()) {
					alteracaoBluePilltvModel.setpArmas(true);
				}else {
					alteracaoBluePilltvModel.setpArmas(false);
				}
				if(chbLutas.isSelected()) {
					alteracaoBluePilltvModel.setpLutas(true);	
				}else {
					alteracaoBluePilltvModel.setpLutas(false);
				}

				// Obt�m o indice (posi��o no ArrayList) do objeto selecionado na tabela
				int indice = tvBluePills.getSelectionModel().getSelectedIndex();

				// Insere o objeto alterado na posi��o selecionada (sobrepondo o objeto anterior)
				this.getListaBluePilltvModel().set(indice, alteracaoBluePilltvModel);

				// Atualiza a tabela
				this.atualizarTableView();
			}


		} catch (IOException e) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Ops!");
			alert.setHeaderText("Opera��o n�o pode ser realizada");
			alert.setContentText("Todos os campos s�o obrigat�rios.");
			alert.showAndWait();				

		} catch (Exception e) {
			// A exce��o ocorre quando uma exception diferente das tratadas acima � gerada.
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Opera��o n�o realizada");
			alert.setHeaderText("Ocorreu um problema no processo de entrada");
			alert.setContentText("Favor entrar em contato com os desenvolvedores!");
			alert.showAndWait();
			// Detalhes do erro imprevisto
			e.printStackTrace();
		}							

		
		if(this.getOperacao().equals("excluir")) {

			// Existe uma atualiza��o para JavaFX das caixa de di�logo (classes Dialogs e DialogResponse)
			// por�m, h� a necessidade de acrescentar essas classes na instala��o padr�o do Eclipse 
			int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclus�o?", "Aten��o!", JOptionPane.YES_NO_OPTION);

			if (resposta == JOptionPane.YES_OPTION) {


				// Obt�m o indice (posi��o no ArrayList) do objeto selecionado na tabela
				int indice = tvBluePills.getSelectionModel().getSelectedIndex();

				// Remove o objeto dessa posi��o
				this.getListaBluePilltvModel().remove(indice);

				// Atualiza a tabela
				this.atualizarTableView();
			}
		}
		
		// Ajusta os campos e bot�es para a pr�xima opera��o
		this.limparCampos();
		this.ajustarBotoesInicial();
		this.desabilitarCampos();
	}
	
	
	@FXML public void cancelar() {
		
		// Ajusta os bot�es para a pr�xima opera��o
		this.ajustarBotoesInicial();
	}
	
	// Fecha o formul�rio
	@FXML public void fechar() {
		this.getPalcoBluePill().close();
	}

	// M�todos internos para as funcionalidades do formul�rio
	
	// Carrega os dados do objeto selecionado na tabela nos campos do formul�rio
	// Este m�todo � invocado a cada clique do mouse e a cada movimenta��o pelo teclado na tabela
	@FXML public void carregarDados() {

		if(tvBluePills.getSelectionModel().getSelectedIndex() < 0) {
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Ops!");
			alert.setHeaderText("Opera��o inv�lida!");
			alert.setContentText( "Nenhum bluPill inserido" );
			alert.showAndWait();
			
		}else {
			
			// Cria um objeto BluePill para receber os dados da tabela
			BluePillTableViewModel bluePilltvModelSelecionado = new BluePillTableViewModel();

			// Obt�m o objeto selecionado na tabela
			bluePilltvModelSelecionado = tvBluePills.getSelectionModel().getSelectedItem();

			// Carrega os dados do objeto no formul�rio
			tfNome.setText( bluePilltvModelSelecionado.getpNome() );
			tfContato.setText(bluePilltvModelSelecionado.getpContato() );
			tfProfissao.setText(bluePilltvModelSelecionado.getpProfissao() );		
			dpNascimento.setValue(bluePilltvModelSelecionado.getpNascimento());
			
			if(bluePilltvModelSelecionado.getpProgramacao()) {
				chbProgramacao.setSelected(true);		
			}else {
				chbProgramacao.setSelected(false);
			}
			if(bluePilltvModelSelecionado.getpArmas()) {
				chbArmas.setSelected(true);		
			}else {
				chbArmas.setSelected(false);
			}
			if(bluePilltvModelSelecionado.getpLutas()) {
				chbLutas.setSelected(true);		
			}else {
				chbLutas.setSelected(false);
			}			
		}
	}

	
	public void atualizarTableView() {
		// Vincula o atributo listaBluePill como fonte de dados pata a tabela
		tvBluePills.setItems(FXCollections.observableArrayList(this.getListaBluePilltvModel()));
	}

	// Ajustes de bot�es e campos

	public void ajustarBotoesInicial() {	
		bInserir.setVisible(true);
		bAlterar.setVisible(true);
		bExcluir.setVisible(true);
		bConfirmar.setVisible(false);
		bCancelar.setVisible(false);
		bFechar.setVisible(true);
		bInserir.setDisable(false);
		bAlterar.setDisable(false);
		bExcluir.setDisable(false);
	}

	public void ajustarBotoesInserir() {
		bInserir.setVisible(true);
		bInserir.setDisable(true);
		bAlterar.setVisible(false);
		bExcluir.setVisible(false);
		bConfirmar.setVisible(true);
		bCancelar.setVisible(true);
		bFechar.setVisible(false);
	}

	public void ajustarBotoesAlterar() {
		bInserir.setVisible(false);
		bAlterar.setVisible(true);
		bAlterar.setDisable(true);
		bExcluir.setVisible(false);
		bConfirmar.setVisible(true);
		bCancelar.setVisible(true);
		bFechar.setVisible(false);
	}

	public void ajustarBotoesExcluir() {
		bInserir.setVisible(false);
		bAlterar.setVisible(false);
		bExcluir.setVisible(true);
		bExcluir.setDisable(true);
		bConfirmar.setVisible(true);
		bCancelar.setVisible(true);
		bFechar.setVisible(false);
	}

	public void habilitarCampos() {
		tfNome.setDisable(false);
		tfContato.setDisable(false);
		tfProfissao.setDisable(false);			
		dpNascimento.setDisable(false);
		chbProgramacao.setDisable(false);
		chbArmas.setDisable(false);
		chbLutas.setDisable(false);
		
		tfNome.setOpacity(1);
		tfContato.setOpacity(1);
		tfProfissao.setOpacity(1);
		dpNascimento.setOpacity(1);			
		chbProgramacao.setOpacity(1);
		chbArmas.setOpacity(1);
		chbLutas.setOpacity(1);
		
		tfNome.requestFocus();
	}
	
	public void desabilitarCampos() {
		tfNome.setDisable(true);
		tfContato.setDisable(true);
		tfProfissao.setDisable(true);			
		dpNascimento.setDisable(true);
		chbProgramacao.setDisable(true);
		chbArmas.setDisable(true);
		chbLutas.setDisable(true);
		
		tfNome.setOpacity(0.8);
		tfContato.setOpacity(0.8);
		tfProfissao.setOpacity(0.8);
		dpNascimento.setOpacity(0.8);			
		chbProgramacao.setOpacity(0.8);
		chbArmas.setOpacity(0.8);
		chbLutas.setOpacity(0.8);	
	}
	
	public void limparCampos() {
		tfNome.clear();
		tfContato.clear();
		tfProfissao.clear();			
		dpNascimento.setValue(null);
		chbProgramacao.setSelected(false);
		chbArmas.setSelected(false);
		chbLutas.setSelected(false);
		
		tfNome.requestFocus();
	}
	
}
