package br.com.conac.sistema.controler;

import br.com.conac.sistema.view.CadastroAlunoJF;
import br.com.conac.sistema.view.CadastroProfessorJF;
import br.com.conac.sistema.view.CadastroSecretarioJF;

public class NovoCadastro {
	//atributos
	private String tipoDeCadastro;
	
	//metodos
	public void setTipoDeCadastro(String tipoDeCadastro) {
		this.tipoDeCadastro = tipoDeCadastro;
	}
	public String getTipoDeCadastro() {
		return tipoDeCadastro;
	}
	
	public void mostrarJanelaCadastro(String tipoCadastro)	{
		//recebe o tipo de cadastro
		this.setTipoDeCadastro(tipoCadastro);
		
		if(this.getTipoDeCadastro().equals("Secretario"))	{
			//mostra a janela de cadastro do Secretario
			CadastroSecretarioJF t = new CadastroSecretarioJF();
			t.setVisible(true);
		}
		else if(this.getTipoDeCadastro().equals("Professor"))	{
			//mostra a janela de cadastro do Professor
			CadastroProfessorJF t = new CadastroProfessorJF();
			t.setVisible(true);
		}
		else if(this.getTipoDeCadastro().equals("Aluno"))	{
			//mostra a janela de cadastro do Aluno
			CadastroAlunoJF a = new CadastroAlunoJF();
			a.setVisible(true);
		}
		
	}

}
