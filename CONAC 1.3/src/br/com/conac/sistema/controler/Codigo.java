package br.com.conac.sistema.controler;

import java.io.FileReader;
import java.io.IOException;

/**
 * @description gerador de codigos
 * */
public class Codigo {
	
	private int codigo;
	
	/* metodos */	
	private int getCodigo() {
		return codigo;
	}
	
	public int criarCodigo(int numMax) {
		this.codigo = 1 + (int)(Math.random()* numMax);
		
		return getCodigo();
	}
	
	//verifica se codigo ja existe
	public boolean verificar(String pasta,String cod) throws IOException  {
		boolean retorno = false;

		//verifica o codigo na base de dados
		FileReader arq = new FileReader(pasta + cod + ".txt");
		boolean s = arq.ready();
		arq.close();
		
		if(s == true)	{
			retorno = true;
		}
		else 	{
			retorno = false;
		}		

		return retorno;//retorna a validação do usuario
	}
	
}
