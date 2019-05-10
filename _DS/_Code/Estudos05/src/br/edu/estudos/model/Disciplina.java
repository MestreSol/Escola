package br.edu.estudos.model;

import java.time.LocalDate;

public class Disciplina {
	private String Descricao;
	private Professor Docente;
	private String Modalidade;
	private Double CargaHoraria;
	private LocalDate Inicio;
	private LocalDate Termino;
	private Historico Historico;
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public Professor getDocente() {
		return Docente;
	}
	public void setDocente(Professor docente) {
		Docente = docente;
	}
	public String getModalidade() {
		return Modalidade;
	}
	public void setModalidade(String modalidade) {
		Modalidade = modalidade;
	}
	public Double getCargaHoraria() {
		return CargaHoraria;
	}
	public void setCargaHoraria(Double cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}
	public LocalDate getInicio() {
		return Inicio;
	}
	public void setInicio(LocalDate inicio) {
		Inicio = inicio;
	}
	public LocalDate getTermino() {
		return Termino;
	}
	public void setTermino(LocalDate termino) {
		Termino = termino;
	}
	public Historico getHistorico() {
		return Historico;
	}
	public void setHistorico(Historico historico) {
		Historico = historico;
	}
	public Disciplina(String descricao, Professor docente, String modalidade, Double cargaHoraria, LocalDate inicio,
			LocalDate termino, Historico historico) {
		super();
		Descricao = descricao;
		Docente = docente;
		Modalidade = modalidade;
		CargaHoraria = cargaHoraria;
		Inicio = inicio;
		Termino = termino;
		Historico = historico;
	}
	public Disciplina() {
		super();
		Descricao = "";
		Docente = new Professor();
		Modalidade = "";
		CargaHoraria= null;
		Inicio = null;
		Termino = null;
		Historico = new Historico();
	}
	
}
