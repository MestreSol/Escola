package br.resistencia.controller;

import br.resistencia.model.Migrante;

/**
 * @author Prof. Ralfe
 * @version Última atualização: 18/07/2017
 */

public class Transicao {

	public static String acessarPlataforma(Migrante migrante, String destino){
		
		String status = "";
		
		if(destino.equals("Matrix")){
			status = migrante.conectarMatrix();
		}else{
			status = migrante.conectarZion();
		}
		
		return status;
	}
}


















