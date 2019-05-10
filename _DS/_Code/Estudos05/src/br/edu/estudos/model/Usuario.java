package br.edu.estudos.model;

import java.util.ArrayList;

public class Usuario {
	private String Nome;
	private String Tipo;
	private String Email;
	private String Telefone;
	private String Login;
	private String Senha;
	private ArrayList<Curso> cursos;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(Curso cursos) {
		this.cursos.add(cursos);
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos.addAll(cursos);
	}
	public Usuario(String nome, String tipo, String email, String telefone, String login, String senha,
			ArrayList<Curso> cursos) {
		super();
		Nome = nome;
		Tipo = tipo;
		Email = email;
		Telefone = telefone;
		Login = login;
		Senha = senha;
		this.cursos = cursos;
	}
	public Usuario() {
		super();
		Nome = "";
		Tipo = "";
		Email = "";
		Telefone = "";
		Login = "";
		Senha = "";
		this.cursos = new ArrayList<Curso>();
	}
	
	public String identificar() {
		String valor = "";
		for(Curso Curso : cursos) {
			valor += "\n"+Curso.getDescricao();
		}
		return "Nome: "+this.Nome+"\nTipo: "+this.Tipo+"\nCursos: "+valor;
		
	}
}
