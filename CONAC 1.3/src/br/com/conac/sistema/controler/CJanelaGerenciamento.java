package br.com.conac.sistema.controler;

import java.io.IOException;

import br.com.conac.sistema.dao.RecuperandoDados;
import br.com.conac.sistema.model.Aluno;

public class CJanelaGerenciamento {
	private Aluno alunos[];
	
	public Aluno[] carregarInformacoesAlunos() throws IOException	{
		RecuperandoDados r = new RecuperandoDados();
		return (r.procurarAlunos());
	}

}
