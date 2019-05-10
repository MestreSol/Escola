package br.edu.estudos.model.tableView;

import java.time.LocalDate;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class DisciplinasTableViewModel {
	
	private SimpleStringProperty pDescricao;
	private SimpleDoubleProperty pCargaHoraria;
	private SimpleStringProperty pNomeDocente;
	private SimpleStringProperty pModalidade;
	private SimpleObjectProperty<LocalDate> pInicio;
	private SimpleObjectProperty<LocalDate> pTermino;
	
	public DisciplinasTableViewModel(){
		this.pDescricao = new SimpleStringProperty("");
		this.pCargaHoraria = new SimpleDoubleProperty(0);
		this.pNomeDocente = new SimpleStringProperty("");
		this.pModalidade = new SimpleStringProperty("");
		this.pInicio = new SimpleObjectProperty<LocalDate>(null);
		this.pTermino = new SimpleObjectProperty<LocalDate>(null);
	}
	public DisciplinasTableViewModel(SimpleStringProperty Descricao,SimpleDoubleProperty CargaHoraria,SimpleStringProperty NomeDocente,SimpleStringProperty Modalidade,SimpleObjectProperty<LocalDate> Inicio,SimpleObjectProperty<LocalDate> Termino) {
		this.pDescricao = Descricao;
		this.pCargaHoraria = CargaHoraria;
		this.pNomeDocente = NomeDocente;
		this.pModalidade = Modalidade;
		this.pInicio = Inicio;
		this.pTermino = Termino;
	}
	public String getDescricao() {
		return pDescricao.get();
	}
	public SimpleStringProperty getpDescricao() {
		return pDescricao;
	}
	public void setpDescricao(SimpleStringProperty pDescricao) {
		this.pDescricao = pDescricao;
	}
	public Double getCargaHoraria(){
		return pCargaHoraria.get();
	}
	public SimpleDoubleProperty getpCargaHoraria() {
		return pCargaHoraria;
	}
	public void setpCargaHoraria(SimpleDoubleProperty pCargaHoraria) {
		this.pCargaHoraria = pCargaHoraria;
	}
	public String getNomeDocente() {
		return pNomeDocente.get();
	}
	public SimpleStringProperty getpNomeDocente() {
		return pNomeDocente;
	}
	public void setpNomeDocente(SimpleStringProperty pNomeDocente) {
		this.pNomeDocente = pNomeDocente;
	}
	public String getModalidade() {
		return pModalidade.get();
	}
	public SimpleStringProperty getpModalidade() {
		return pModalidade;
	}
	public void setpModalidade(SimpleStringProperty pModalidade) {
		this.pModalidade = pModalidade;
	}
	public LocalDate getInicio() {
		return pInicio.get();
	}
	public SimpleObjectProperty<LocalDate> getpInicio() {
		return pInicio;
	}
	public void setpInicio(SimpleObjectProperty<LocalDate> pInicio) {
		this.pInicio = pInicio;
	}
	public LocalDate getTermino() {
		return pTermino.get();
	}
	public SimpleObjectProperty<LocalDate> getpTermino() {
		return pTermino;
	}
	public void setpTermino(SimpleObjectProperty<LocalDate> pTermino) {
		this.pTermino = pTermino;
	}
	
}
