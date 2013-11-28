package br.com.conac.sistema.controler;

import java.io.IOException;

import br.com.conac.sistema.dao.RecuperandoDados;

public class CJanelaDiciplina {
	
	private String tipoCurso;
	
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
		if(getTipoCurso().equals("Computação"))	{
			//buscando todos as diciplinas cadastradas
			RecuperandoDados busca = new RecuperandoDados();
			busca.procurarDiciplinas(getTipoCurso());
		}
		else if(getTipoCurso().equals("Administração"))	{
			//buscando todos as diciplinas cadastradas
		}
		else if(getTipoCurso().equals("Direito"))	{
			//buscando todos as diciplinas cadastradas
		}
	}
	
	

}
