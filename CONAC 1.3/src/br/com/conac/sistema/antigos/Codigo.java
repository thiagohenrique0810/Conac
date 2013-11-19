package br.com.conac.sistema.antigos;
/**
 * @description gerador de codigos
 * */
public class Codigo {
	
	//atributos
	private int codigo;
	
	//metodos	
	public int getCodigo() {
		return codigo;
	}
	public void criarCodigo(int numMax) {
		this.codigo = 1 + (int)(Math.random()* numMax);;
	}
	
}
