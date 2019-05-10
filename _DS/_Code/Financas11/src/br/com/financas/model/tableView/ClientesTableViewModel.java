package br.com.financas.model.tableView;

import java.time.LocalDate;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class ClientesTableViewModel {
	private SimpleIntegerProperty PID;
	private SimpleStringProperty pNome;
	private SimpleStringProperty pEndereco;
	private SimpleStringProperty pCPF;
	private SimpleObjectProperty<LocalDate> pNacimento;
	private SimpleStringProperty pContato;

	public LocalDate getpNacimento() {
		return pNacimento.get();
	}
	public SimpleObjectProperty<LocalDate> pNacimentoProperty(){
		return pNacimento;
	}
	public void setpNacimento(LocalDate pNacimento) {
		this.pNacimento.set(pNacimento);
	}
	public Integer getpID() {
		return PID.get();
	}
	public SimpleIntegerProperty pIDProperty() {
		return PID;
	}
	public void setpID(Integer PID) {
			this.PID.set(PID);
	}
	public String getpNome() {
		return pNome.get();
	}
	public SimpleStringProperty pNomeProperty() {
		return pNome;
	}
	public void setpNome(String pNome) {
		this.pNome.set(pNome);
	}
	public String getpEndereco() {
		return pEndereco.get();
	}
	public SimpleStringProperty pEnderecoProperty() {
		return pEndereco;
	}
	public void setpEndereco(String pEndereco) {
		this.pEndereco.set(pEndereco);
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
	public String getpCPF() {
		return pCPF.get();
	}
	public SimpleStringProperty pCPFProperty() {
		return pCPF;
	}
	public void setpCPF(String pCPF) {
		this.pCPF.set(pCPF);
	}
	
	
	public ClientesTableViewModel(SimpleIntegerProperty pID, SimpleStringProperty pNome, SimpleStringProperty pEndereco,
			SimpleStringProperty pCPF, SimpleObjectProperty<LocalDate> pNacimento, SimpleStringProperty pContato) {
		super();
		PID = pID;
		this.pNome = pNome;
		this.pEndereco = pEndereco;
		this.pCPF = pCPF;
		this.pNacimento = pNacimento;
		this.pContato = pContato;
	}
	public ClientesTableViewModel() {
		super();
		PID = new SimpleIntegerProperty(0);
		this.pNome = new SimpleStringProperty("");
		this.pEndereco = new SimpleStringProperty("");
		this.pCPF = new SimpleStringProperty("");
		this.pNacimento = new SimpleObjectProperty<LocalDate>();
		this.pContato = new SimpleStringProperty("");
	}
	
	
}
