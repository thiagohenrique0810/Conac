package br.com.conac.sistema.controler;

import java.io.File;
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
	
	//gerando codigo e verificando se ele existe
	public String gerarCodigo(String pasta,int tamanho) throws IOException	{
		boolean retorno = true;
		String codigoGerado = "";
		
		//verifica o codigo na base de dados
		while(retorno)	{
			int cod =  1 + (int)(Math.random()* tamanho);
			String code = String.valueOf(cod);

			File arq = new File(pasta + code + ".txt");
			boolean s = arq.exists();
			if(s == true)	{
				retorno = true;
			}
			else 	{
				retorno = false;
			}
			codigoGerado = code;
		}

		return codigoGerado;//retorna a validação do usuario
	}
}
