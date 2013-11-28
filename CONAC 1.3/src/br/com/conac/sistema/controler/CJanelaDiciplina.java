package br.com.conac.sistema.controler;

import java.io.IOException;

import br.com.conac.sistema.dao.RecuperandoDados;
import br.com.conac.sistema.view.EscolherDiciplinasJF;
import br.com.conac.sistema.view.JPainelDados;
import br.com.conac.sistema.view.JPainelNovaDiciplina;

public class CJanelaDiciplina {
	
	private String tipoCurso;
	private EscolherDiciplinasJF janela;
	
	public CJanelaDiciplina(String tipoCurso) {
		setTipoCurso(tipoCurso);
	}
	
	public String getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public void mostrarJanelaEscolha() throws IOException 	{
		if(getTipoCurso().equals("Computação"))	{
			//buscando todos as diciplinas cadastradas
			RecuperandoDados busca = new RecuperandoDados();
			janela = new EscolherDiciplinasJF();
			janela.setDiciplinas(busca.procurarDiciplinas(getTipoCurso()));
			janela.setVisible(true);
		}
		else if(getTipoCurso().equals("Administração"))	{
			//buscando todos as diciplinas cadastradas
		}
		else if(getTipoCurso().equals("Direito"))	{
			//buscando todos as diciplinas cadastradas
		}
	}
	
	

}
