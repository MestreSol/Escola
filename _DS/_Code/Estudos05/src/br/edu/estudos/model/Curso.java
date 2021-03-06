package br.edu.estudos.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Curso {
	private String Descricao;
	private String Modalidade;
	private LocalDate Inicio;
	private LocalDate Termino;
	private ArrayList<Disciplina> listaDiciplinas;
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getModalidade() {
		return Modalidade;
	}
	public void setModalidade(String modalidade) {
		Modalidade = modalidade;
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
	public ArrayList<Disciplina> getListaDiciplinas() {
		return listaDiciplinas;
	}
	public void setListaDiciplinas(Disciplina listaDiciplinas) {
		this.listaDiciplinas.add(listaDiciplinas);
	}
	public void setListaDiciplinas(ArrayList<Disciplina> listaDiciplinas) {
		this.listaDiciplinas.addAll(listaDiciplinas);
	}
	public Curso(String descricao, String modalidade, LocalDate inicio, LocalDate termino,
			ArrayList<Disciplina> listaDiciplinas) {
		super();
		Descricao = descricao;
		Modalidade = modalidade;
		Inicio = inicio;
		Termino = termino;
		this.listaDiciplinas = listaDiciplinas;
	}
	public Curso() {
		super();
		Descricao = "";
		Modalidade = "";
		Inicio = null;
		Termino = null;
		this.listaDiciplinas = new ArrayList<Disciplina>();
	}
	public String Detalhar() {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valor = "";
		int AnoInicio = Inicio.getYear();
		int MesInicio = Inicio.getMonthValue();
		int DiaInicio = Inicio.getDayOfMonth();
		int AnoFim = Termino.getYear();
		int MesFim = Termino.getMonthValue();
		int DiaFim = Termino.getDayOfMonth();
		int Ano = AnoInicio - AnoFim;
		int Mes = MesInicio - MesFim;
		int Dia = DiaInicio - DiaFim;
		for(Disciplina a : listaDiciplinas) {
			valor += "\n"+a.getDescricao();
		}
		return "Descricao: "+this.Descricao+"\nModalidade: "+this.Modalidade+"\nInicio: "+Inicio.format(formatador)+"; Termino: "+Termino.format(formatador)+
				"\nDuracao: "+Dia+"/"+Mes+"/"+Ano+"\nDiciplinas: "+valor;
	}
	
}
