package br.resistencia.model;

/**
 * @author Prof. Ralfe
 * @version Última atualização: 18/07/2017
 */

public interface Migrante {

	// Todo atributo em uma Interface 
	// é uma constante pública e estática
	int versao = 6;
	
	// Todo método em uma Interface 
	// é público e abstrato
	String conectarMatrix();
	
	String conectarZion();
}






















