package br.edu.estudos.model;

import java.util.ArrayList;

public class Historico {
	private ArrayList<Double> ListaNotas;
	private Double Frequencia;
	public ArrayList<Double> getListaNotas() {
		return ListaNotas;
	}
	public void setListaNota(Double listaNotas) {
		this.ListaNotas.add(listaNotas);
	}
	public void setListaNotas(ArrayList<Double> listaNotas) {
		this.ListaNotas.addAll(listaNotas);
	}
	public Double getFrequencia() {
		return Frequencia;
	}
	public void setFrequencia(Double frequencia) {
		Frequencia = frequencia;
	}
	
	public Double calcularNotaFinal() {
		int i =0;
		double nota = 0;
		for(double a: ListaNotas) {
			i++;
			nota += a;
		}
		return nota/i;
	}
}
