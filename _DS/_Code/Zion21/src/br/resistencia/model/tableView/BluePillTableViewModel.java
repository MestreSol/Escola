package br.resistencia.model.tableView;

import java.time.LocalDate;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class BluePillTableViewModel {

	// Os atributos são declarados utilizando tipos específicos do JavaFX
	// definindo o conceito de Property (propriedade) bastante utilizado em JavaFX de melhor explorado posteriormente
	private final SimpleStringProperty pNome;
	private final SimpleStringProperty pContato;
	private final SimpleStringProperty pProfissao;
	private final SimpleObjectProperty<LocalDate> pNascimento;
	private final SimpleBooleanProperty pProgramacao;
	private final SimpleBooleanProperty pLutas;
	private final SimpleBooleanProperty pArmas;
	
	// Construtores
	public BluePillTableViewModel() {
		this.pNome = new SimpleStringProperty("");
		this.pContato = new SimpleStringProperty("");
		this.pProfissao = new SimpleStringProperty("");
		this.pNascimento = new SimpleObjectProperty<LocalDate>(null);
		this.pProgramacao = new SimpleBooleanProperty(false);
		this.pLutas = new SimpleBooleanProperty(false);
		this.pArmas = new SimpleBooleanProperty(false);
	}

	public BluePillTableViewModel(SimpleStringProperty pNome, 
			                      SimpleStringProperty pContato,
			                      SimpleStringProperty pProfissao, 
			                      SimpleObjectProperty<LocalDate> pNascimento,
			                      SimpleBooleanProperty pProgramacao, 
			                      SimpleBooleanProperty pLutas, 
			                      SimpleBooleanProperty pArmas) {
		this.pNome = pNome;
		this.pContato = pContato;
		this.pProfissao = pProfissao;
		this.pNascimento = pNascimento;
		this.pProgramacao = pProgramacao;
		this.pLutas = pLutas;
		this.pArmas = pArmas;
	}

	// Métodos de acesso
	
	// Um get retornando a classe wrapper do tipo primitivo do atributo
	public String getpNome() { 
		// Obtido pelo método get do Property
		return pNome.get();
	}
	
	// Um método nomeado com o identificar do atributo seguido de Property
	public SimpleStringProperty pNomeProperty() { 
		// Retornando o objeto Property
		return pNome;
	}

	// Um set recebendo um objeto da classe wrapper do tipo primitivo do atributo 
	public void setpNome(String pNome) {
		// Armazenando o valor pelo método set do Property
		this.pNome.set(pNome);
	}

	public String getpContato() {
		return pContato.get();
	}
	public SimpleStringProperty pContatoProperty() {
		return pContato;
	}

	public void setpContato(String pContato) {
		this.pContato.set(pContato);
	}

	public String getpProfissao() {
		return pProfissao.get();
	}
	public SimpleStringProperty pProfissaoProperty() {
		return pProfissao;
	}

	public void setpProfissao(String pProfissao) {
		this.pProfissao.set(pProfissao);
	}

	public LocalDate getpNascimento() {		
		return this.pNascimento.get();
	}

	public SimpleObjectProperty<LocalDate> pNascimentoProperty() {	
		return pNascimento;
	}
	
	public void setpNascimento(LocalDate pNascimento) {
		this.pNascimento.set(pNascimento);
	}

	public Boolean getpProgramacao() {
		return pProgramacao.get();
	}
	public SimpleBooleanProperty pProgramacaoProperty() {
		return pProgramacao;
	}

	public void setpProgramacao(Boolean pProgramacao) {
		this.pProgramacao.set(pProgramacao);
	}

	public Boolean getpLutas() {
		return pLutas.get();
	}
	public SimpleBooleanProperty pLutasProperty() {
		return pLutas;
	}

	public void setpLutas(Boolean pLutas) {
		this.pLutas.set(pLutas);
	}

	public Boolean getpArmas() {
		return pArmas.get();
	}
	public SimpleBooleanProperty pArmasProperty() {
		return pArmas;
	}

	public void setpArmas(Boolean pArmas) {
		this.pArmas.set(pArmas);
	}
	
}
