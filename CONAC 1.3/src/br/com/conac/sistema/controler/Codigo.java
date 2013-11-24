package br.com.conac.sistema.controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description gerador de codigos
 * */
public class Codigo {
	
	//atributos
	private int codigo;
	
	//metodos	
	private int getCodigo() {
		return codigo;
	}
	public int criarCodigo(int numMax) {
		this.codigo = 1 + (int)(Math.random()* numMax);
		
		return getCodigo();
	}
	
	//verifica se codigo ja existe
	public boolean verificar(String pasta,String cod) throws IOException	{
		boolean retorno = false;

		//verifica o codigo na base de dados
		BufferedReader arq = new BufferedReader(new FileReader(pasta + cod + ".txt"));
		//verifica se há um arquivo existente
		if(arq.ready() == true)	{
			retorno = true;
		}
		else 	{
			retorno = false;
		}		
		arq.close();//fecha o arquivo para nova leitura pois os readLines seguem a sequencia

		return retorno;//retorna a validação do usuario
	}
	
}
