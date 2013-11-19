package br.com.conac.sistema.antigos;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import br.com.conac.sistema.view.CadastroAlunoJF;



public class Login {
	//atributos
	private String tipoDeAcesso;
	private String membroAcademico;

	//metodos
	//defini��o do tipo de acesso ao sistema
	public void setTipoDeAcesso(String tipoDeAcesso) {
		this.tipoDeAcesso = tipoDeAcesso;
	}

	public String getTipoDeAcesso() {
		return tipoDeAcesso;
	}
	//tipo de membro academico, se � professor ou aluno
	public void setMembroAcademico(String membroAcademico) {
		this.membroAcademico = membroAcademico;
	}
	public String getMembroAcademico() {
		return membroAcademico;
	}

	/**
	 * @descri��o: exibe uma janela de acordo com o evento do bot�o acionado
	 */
	public void motrarJanela()	{
		//acessa informa��es
		if(this.tipoDeAcesso.equals("Entrar"))	{
			//instru��es para acesso ao banco de dados com todos os cadastros
		}
		//cria novo cadastro
		if(this.tipoDeAcesso.equals("Cadastrar"))	{
			if(getMembroAcademico().equals("Aluno"))	{
				//instru��es para mostrar a janela de cadastro aluno
				CadastroAlunoJF novoC = new CadastroAlunoJF();
				novoC.setVisible(true);
			}
			else if(getMembroAcademico().equals("Professor"))	{
				//instru��es para mostrar a janela de cadastro professor
			}
		}
	}
}
