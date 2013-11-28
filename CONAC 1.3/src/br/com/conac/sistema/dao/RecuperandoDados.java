package br.com.conac.sistema.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import br.com.conac.sistema.model.Diciplina;

public class RecuperandoDados {

	public Diciplina[] procurarDiciplinas(String tipoCurso) throws IOException {
		File files = new File("bd\\diciplinas\\" + tipoCurso + "\\");
		
		//listando os nomes das diciplinas
		String arquivos[] = files.list();
		
		//recebendo informações de todas as diciplinas
		Diciplina diciplinas[] = new Diciplina[arquivos.length];
		
		//lendo arquivos e atribuindo ao array para retornar
		for(int x = 0; x < arquivos.length;x++)	{
			BufferedReader arq = new BufferedReader(new FileReader("bd\\diciplinas\\" + tipoCurso + "\\" + arquivos[x]));
			
			diciplinas[x].setCodigo(arq.readLine());
			diciplinas[x].setNomeDiciplina(arq.readLine());
			diciplinas[x].setCurso(arq.readLine());
			diciplinas[x].setCargaHoraria(arq.readLine());
			diciplinas[x].setDescricaoDaEmenta(arq.readLine());
			arq.close();
		}
		
		return diciplinas;
	}
	
	
	//testando as funções
	public static void main(String args[])	{
		File files = new File("bd\\diciplinas\\" + "Computação" + "\\");
		
	
	}
	

}
