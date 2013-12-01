package br.com.conac.sistema.controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.conac.sistema.dao.RecuperandoDados;
import br.com.conac.sistema.dao.SalvarDados;
import br.com.conac.sistema.model.Aluno;
import br.com.conac.sistema.view.EscolherDiciplinasJF;

public class CJanelaDiciplina {

	private String tipoCurso;
	private EscolherDiciplinasJF janela;
	private RecuperandoDados busca;

	public CJanelaDiciplina(String tipoCurso) {
		setTipoCurso(tipoCurso);
	}

	public String getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public void  mostrarJanelaEscolha(Aluno aluno) throws IOException	{
		janela = new EscolherDiciplinasJF();
		busca = new RecuperandoDados();
		
		//if(getTipoCurso().equals("Computação"))	{
			//buscando todos as diciplinas cadastradas
			janela.setDiciplinas(busca.procurarDiciplinas(getTipoCurso()));//recebendo array de diciplinas
			janela.carregarInformacoes();
			janela.recuperandoAluno(aluno);
			janela.setVisible(true);
		//}		
	}

	public static void main(String args[]) throws IOException	{
		//new CJanelaDiciplina("Computação").mostrarJanelaEscolha();
	}

}
