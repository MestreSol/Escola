package br.resistencia.model;

/**
 * @author Prof. Ralfe
 * @version �ltima atualiza��o: 18/07/2017
 */

public interface Migrante {

	// Todo atributo em uma Interface 
	// � uma constante p�blica e est�tica
	int versao = 6;
	
	// Todo m�todo em uma Interface 
	// � p�blico e abstrato
	String conectarMatrix();
	
	String conectarZion();
}






















