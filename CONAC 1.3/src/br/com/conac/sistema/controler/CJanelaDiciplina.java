package br.com.conac.sistema.controler;

import java.io.IOException;

import br.com.conac.sistema.dao.RecuperandoDados;
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

	public void mostrarJanelaEscolha() throws IOException	{
		janela = new EscolherDiciplinasJF();
		busca = new RecuperandoDados();
		
		if(getTipoCurso().equals("Computação"))	{
			//buscando todos as diciplinas cadastradas
			janela.setDiciplinas(busca.procurarDiciplinas(getTipoCurso()));//recebendo array de diciplinas
			janela.carregarInformacoes();
			janela.setVisible(true);
		}
		else if(getTipoCurso().equals("Administração"))	{
			//buscando todos as diciplinas cadastradas
		}
		else if(getTipoCurso().equals("Direito"))	{
			//buscando todos as diciplinas cadastradas
		}
	}
	
	public static void main(String args[]) throws IOException	{
		new CJanelaDiciplina("Computação").mostrarJanelaEscolha();
	}
	
}
