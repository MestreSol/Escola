package br.edu.estudos.model;

public class Professor {
	private String Nome;
	private String Area;
	private String Contato;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getContato() {
		return Contato;
	}
	public void setContato(String contato) {
		Contato = contato;
	}
	public Professor(String nome, String area, String contato) {
		super();
		Nome = nome;
		Area = area;
		Contato = contato;
	}
	public Professor() {
		super();
		Nome = "";
		Area = "";
		Contato = "";
	}
	public String toString() {
		return "Nome: "+this.Nome+"\nArea: "+this.Area+"\nContato: "+this.Contato;
	}
}
