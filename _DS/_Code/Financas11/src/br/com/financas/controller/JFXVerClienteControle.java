package br.com.financas.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import br.com.financas.model.Cliente;
import br.com.financas.model.tableView.ClientesTableViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class JFXVerClienteControle {

	Cliente cliente = new Cliente();
	private ArrayList<ClientesTableViewModel> ListaDeClientes= new ArrayList<ClientesTableViewModel>();
	public ArrayList<ClientesTableViewModel> getListaDeClientes() {
		return ListaDeClientes;
	}
	
	public void setListaDeClientes(ArrayList<ClientesTableViewModel> listaDeClientes) {
		ListaDeClientes.addAll(listaDeClientes);
	}
	public void setListaDeClientes(ClientesTableViewModel ClientesTable) {
		this.ListaDeClientes.add(ClientesTable);
	}
	
	@FXML TableView<ClientesTableViewModel> tvCliente;
	@FXML TableColumn<ClientesTableViewModel, Integer> tcID;
	@FXML TableColumn<ClientesTableViewModel, String> tcNome;
	@FXML TableColumn<ClientesTableViewModel, String> tcEndereco;
	@FXML TableColumn<ClientesTableViewModel, String> tcCPF;
	@FXML TableColumn<ClientesTableViewModel, LocalDate> tcNascimento;
	@FXML TableColumn<ClientesTableViewModel, ArrayList<String>> tcContato;
	@FXML Button btExcluir;
	@FXML Button btModificar;
	@FXML Button btFechar;
	@FXML public void Fechar() {}
	@FXML public void Excluir() {
		if(tvCliente.getSelectionModel().getSelectedIndex() >= 0) {
			
		}
	}
	@FXML public void Modificar() {}

}
