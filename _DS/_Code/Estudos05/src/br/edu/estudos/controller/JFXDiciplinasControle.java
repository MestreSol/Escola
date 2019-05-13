package br.edu.estudos.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import br.edu.estudos.model.Professor;
import br.edu.estudos.model.tableView.DisciplinasTableViewModel;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class JFXDiciplinasControle implements Initializable{
	
	Professor professor01 = new Professor("Raraiemar","Exatas","064998785552");
	Professor professor02 = new Professor("Meldresh","Exatas","087996422839");
	
	private Stage Diciplinas;

	public Stage getDiciplinas() {
		return Diciplinas;
	}

	public void setDiciplinas(Stage diciplinas) {
		Diciplinas = diciplinas;
	}
	private ArrayList<DisciplinasTableViewModel> ListaDiciplinas = new ArrayList<DisciplinasTableViewModel>();
	private ArrayList<Professor> ListaProfessores;
	
	private String operacao;
	
	@FXML TableView<DisciplinasTableViewModel> tvDiciplina;
	
	@FXML TableColumn<DisciplinasTableViewModel, String> tcDescricao;
	@FXML TableColumn<DisciplinasTableViewModel, Double> tcCargaHorario;
	@FXML TableColumn<DisciplinasTableViewModel, String> tcDocente;
	@FXML TableColumn<DisciplinasTableViewModel, String> tcModalidade;
	@FXML TableColumn<DisciplinasTableViewModel, Object> tcInicio;
	@FXML TableColumn<DisciplinasTableViewModel, Object> tcTermino;
	
	@FXML Button btInserir;
	@FXML Button btAlterar;
	@FXML Button btExcluir;
	@FXML Button btCancelar;
	@FXML Button btConfirmar;
	
	@FXML TextField tfDescricao;
	@FXML TextField tcCargaHoraria;
	
	@FXML ComboBox<String> cbDocente;
	@FXML ComboBox<String> cbModalidade;
	
	@FXML DatePicker dtIncio;
	@FXML DatePicker dtTermino;

	public ArrayList<DisciplinasTableViewModel> getListaDiciplinas() {
		return ListaDiciplinas;
	}
	public void setListaDiciplinas(ArrayList<DisciplinasTableViewModel> listaDiciplinas) {
		ListaDiciplinas.addAll(listaDiciplinas);
	}
	public void setListaDiciplinas(DisciplinasTableViewModel listaDiciplinas) {
		ListaDiciplinas.add(listaDiciplinas);
	}
	public ArrayList<Professor> getListaProfessores() {
		return ListaProfessores;
	}
	public void setListaProfessores(Professor listaProfessores) {
		ListaProfessores.add(listaProfessores);
	}
	public void setListaProfessores(ArrayList<Professor> listaProfessores) {
		ListaProfessores.addAll( listaProfessores );
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		
		cbDocente.getItems().addAll(professor01.getNome(), professor02.getNome());
		cbModalidade.getItems().addAll("Presencial", "Semi-presencial","A distancia");
	
		tcDescricao.setCellValueFactory(new PropertyValueFactory<>("pDescricao"));
		tcCargaHorario.setCellValueFactory(new PropertyValueFactory<>("pCargaHoraria"));
		tcDocente.setCellValueFactory(new PropertyValueFactory<>("pNomeDocente"));
		tcModalidade.setCellValueFactory(new PropertyValueFactory<>("pModalidade"));
		tcTermino.setCellValueFactory(new PropertyValueFactory<>("pTermino"));
		tcInicio.setCellValueFactory(new PropertyValueFactory<>("pInicio"));

		this.AjustarBotoesNull();
		this.AtualizarTableView();
	}
	@FXML public void Confirmar() {
		
		switch(this.getOperacao()) {
		
		case "Inserir":
		
			try {
				this.setOperacao(null);
				DisciplinasTableViewModel NovaDiciplina = new DisciplinasTableViewModel();
				
				NovaDiciplina.setpCargaHoraria(Double.parseDouble(tcCargaHoraria.getText()));
				NovaDiciplina.setpDescricao(tfDescricao.getText());
				NovaDiciplina.setpInicio(dtIncio.getValue());
				NovaDiciplina.setpTermino(dtTermino.getValue());
				NovaDiciplina.setpNomeDocente(cbDocente.getItems().toString());
				NovaDiciplina.setpModalidade(cbModalidade.getItems().toString()); 
			
				this.setListaDiciplinas(NovaDiciplina);
				this.LimparCampos();
				this.AjustarBotoesNull();
				this.AtualizarTableView();
			
			}catch(Exception e) {
				
				Alert alert = new Alert(AlertType.ERROR);
				
				alert.setTitle("ERRO");
				alert.setContentText("Valores invalidos");
				alert.showAndWait();
				
				this.tcCargaHoraria.requestFocus();

			}
			break;
		case "Excluir":
			this.setOperacao(null);
			try {
				
				int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Atenção!", JOptionPane.YES_NO_OPTION);
			
				if(resposta == JOptionPane.YES_OPTION) {
					
					int indice = tvDiciplina.getSelectionModel().getSelectedIndex();
				
					this.getListaDiciplinas().remove(indice);
					this.LimparCampos();
					this.AjustarBotoesNull();
					this.AtualizarTableView();
					this.ValidaValor();
			
				}
			}catch(Exception e) {
			
				Alert alert = new Alert(AlertType.ERROR);
				
				alert.setTitle("ERRO");
				alert.setContentText("Selecione um valor antes");
				alert.showAndWait();
				
				this.LimparCampos();
				this.AjustarBotoesNull();
			
			}
			break;
		case "Alterar":
			this.setOperacao(null);
			try {
				DisciplinasTableViewModel Alterada = new DisciplinasTableViewModel();
			
				Alterada.setpCargaHoraria(Double.parseDouble(tcCargaHoraria.getText()));
				Alterada.setpDescricao(tfDescricao.getText());
				Alterada.setpInicio(dtIncio.getValue());
				Alterada.setpTermino(dtTermino.getValue());
				Alterada.setpNomeDocente(cbDocente.getItems().toString());
				Alterada.setpModalidade(cbModalidade.getItems().toString()); 
				
				int indice = tvDiciplina.getSelectionModel().getSelectedIndex();
				
				this.getListaDiciplinas().set(indice, Alterada);
				this.AtualizarTableView();
				this.LimparCampos();
				this.AjustarBotoesNull();
			}catch(Exception e) {
				Alert alert = new Alert(AlertType.ERROR);
				
				alert.setTitle("ERRO");
				alert.setContentText("Selecione um valor antes");
				alert.showAndWait();
				
				this.LimparCampos();
				this.AjustarBotoesNull();
			}
			
			break;
			}
	}

	@FXML public void Cancelar() {
		this.setOperacao(null);
		this.LimparCampos();
		this.AjustarBotoesNull();
	}

	@FXML public void Excluir() {
	
		if(operacao != "Excluir") {
		
			if(tvDiciplina.getSelectionModel().getSelectedIndex() >= 0) {
			
				operacao = "Excluir";
			
				this.AjustarBotoesExcluir();
				this.LimparCampos();
			}else {
				
				Alert alert = new Alert(AlertType.INFORMATION);
				
				alert.setTitle("Alerta");
				alert.setHeaderText("Nao foi possivel realizar a operacao");
				alert.setContentText("Verifique se voce selecionou algo na tabela");
				alert.showAndWait();
			
			}
		}
	}

	@FXML public void Alterar() {
		
		if(operacao !="Alterar") {
			
			if(tvDiciplina.getSelectionModel().getSelectedIndex() >= 0) {
			
				operacao = "Alterar";
			
				this.AjustarBotoesAlterar();
				this.LimparCampos();
			
			}else {
				
				Alert alert = new Alert(AlertType.INFORMATION);
				
				alert.setTitle("Alerta");
				alert.setHeaderText("Nao foi possivel realizar a operacao");
				alert.setContentText("Verifique se voce selecionou algo na tabela");
				alert.showAndWait();
			
			}
		}
	}

	@FXML public void Inserir() {
		
		if(operacao != "Inserir") {
		
			operacao = "Inserir";
			
			AjustarBotoesInserir();
			LimparCampos();
		
		}
	}
	
	public boolean ValidaValor() {
		
		try {
		
			Pattern pattern = Pattern.compile("^[0-9]");
			Matcher matcher = pattern.matcher(tcCargaHoraria.getText());
		
			if(matcher.find()) {
			
				throw new Exception();
		
			}
		
			if(dtTermino.getValue().isBefore(dtIncio.getValue())) {
			
				throw new Exception();
			
			}
		
			if(tfDescricao.getText().isEmpty()) {
			
				throw new Exception();
			}
			
			if(cbDocente.getValue().isEmpty()) {
			
				throw new Exception();
			}
		
			if(cbModalidade.getValue().isEmpty()) {
				throw new Exception();
			}
		
			return true;
		}catch(Exception e) {
			
			Alert alert = new Alert(AlertType.ERROR);
			
			alert.setTitle("ERROR");
			alert.setContentText("Verifique os valores digitados");
			alert.showAndWait();
			
			return false;
		}	
	}

	public void LimparCampos() {
		
		tfDescricao.clear();
		tcCargaHoraria.clear();
		cbDocente.setValue(null);
		cbModalidade.setValue(null);
		dtIncio.setValue(null);
		dtTermino.setValue(null);
	
	}

	public void DesabilitarCampos() {
	
		tfDescricao.setDisable(true);
		tcCargaHoraria.setDisable(true);
		cbDocente.setDisable(true);
		cbModalidade.setDisable(true);
		dtIncio.setDisable(true);
		dtTermino.setDisable(true);
		
	}

	public void HabilitarCampos() {
		
		tfDescricao.setDisable(false);
		tcCargaHoraria.setDisable(false);
		cbDocente.setDisable(false);
		cbModalidade.setDisable(false);
		dtIncio.setDisable(false);
		dtTermino.setDisable(false);
	
	}

	public void AjustarBotoesExcluir() {
	
		btInserir.setVisible(false);
		btAlterar.setVisible(false);
		btExcluir.setVisible(true);
		btCancelar.setVisible(true);
		btConfirmar.setVisible(true);
		btInserir.setDisable(true);
		btAlterar.setDisable(false);
		btExcluir.setDisable(true);
	
	}

	public void AjustarBotoesAlterar() {
	
		btInserir.setVisible(false);
		btAlterar.setVisible(true);
		btExcluir.setVisible(false);
		btCancelar.setVisible(true);
		btConfirmar.setVisible(true);
		btInserir.setDisable(false);
		btAlterar.setDisable(true);
		btExcluir.setDisable(false);
	
	}

	public void AjustarBotoesInserir() {
	
		btInserir.setVisible(true);
		btAlterar.setVisible(false);
		btExcluir.setVisible(false);
		btCancelar.setVisible(true);
		btConfirmar.setVisible(true);
		btInserir.setDisable(true);
		btAlterar.setDisable(false);
		btExcluir.setDisable(false);
	
	}

	public void AtualizarTableView() {
	
		tvDiciplina.setItems(FXCollections.observableArrayList(this.getListaDiciplinas()));
	
	}
	
	public void AjustarBotoesNull() {
	
		btInserir.setVisible(true);
		btAlterar.setVisible(true);
		btExcluir.setVisible(true);
		btCancelar.setVisible(false);
		btConfirmar.setVisible(false);
		btInserir.setDisable(false);
		btAlterar.setDisable(false);
		btExcluir.setDisable(false);
	
	}

	@FXML public void CarregarDados() {
		
			if(tvDiciplina.getSelectionModel().getSelectedIndex() < 0) {
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Ops!");
				alert.setHeaderText("Operação inválida!");
				alert.setContentText( "Nenhum bluPill inserido" );
				alert.showAndWait();
				
			}else {
				
				DisciplinasTableViewModel disciplinasTableViewModel = new DisciplinasTableViewModel();

				// Obtém o objeto selecionado na tabela
				disciplinasTableViewModel = tvDiciplina.getSelectionModel().getSelectedItem();

				// Carrega os dados do objeto no formulário
				tfDescricao.setText( disciplinasTableViewModel.getDescricao().toString());
				tcCargaHoraria.setText(disciplinasTableViewModel.getCargaHoraria().toString());
				cbDocente.setValue(disciplinasTableViewModel.getNomeDocente().toString());		
				cbModalidade.setValue(disciplinasTableViewModel.getModalidade().toString());
				this.dtIncio.setValue(disciplinasTableViewModel.getInicio());
				this.dtTermino.setValue(disciplinasTableViewModel.getTermino());
				
				
			} 
	}
}
