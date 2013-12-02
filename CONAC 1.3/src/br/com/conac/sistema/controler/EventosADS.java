package br.com.conac.sistema.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import br.com.conac.sistema.view.PainelGerenciamentoSecretario;


public class EventosADS implements ActionListener {
	private JRadioButton rdbtnProfessor;
	private JRadioButton rdbtnAluno;
	private JRadioButton rdbtnGerente;
	private JButton btnCadastrese;
	private JButton btnNewButton;
	private String tipoCadastro;
	private NovoCadastro cadastro;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//recebendo eventos
	public void eventos(JButton btnNewButton, JButton btnCadastrese,
			JRadioButton rdbtnAluno, JRadioButton rdbtnProfessor,
			JRadioButton rdbtnGerente) {
		this.btnNewButton = btnNewButton;
		this.btnCadastrese = btnCadastrese;
		this.rdbtnAluno = rdbtnAluno;
		this.rdbtnProfessor = rdbtnProfessor;
		this.rdbtnGerente = rdbtnGerente;
	}
	//criando um novo tipo de acesso para os eventos
	//AreaDoSecretarioJF tipoDeAcesso = new AreaDoSecretarioJF();

	@Override
	public void actionPerformed(ActionEvent e) {
		
		cadastro = new NovoCadastro();
		
		
		if(e.getSource() == btnNewButton)	{
			//instruções para gerenciamento dos academicos
			PainelGerenciamentoSecretario secretario;
			try {
				secretario = new PainelGerenciamentoSecretario();
				secretario.setEmail(getEmail());
				secretario.setVisible(true);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if(rdbtnAluno.isSelected() == true)	{
			//instrução para dizer o tipo de cadastro se for aluno
			this.tipoCadastro = "Aluno";
		}
		if(rdbtnProfessor.isSelected() == true)	{
			//instrução para dizer o tipo de cadastro se for professor
			this.tipoCadastro = "Professor";
		}
		if(rdbtnGerente.isSelected() == true)	{
			//instrução para dizer o tipo de cadastro se for secretario
			this.tipoCadastro = "Secretario";
		}
		if(e.getSource() == btnCadastrese)	{
			//instruções para abrir a janela de cadastro
			try {
				cadastro.mostrarJanelaCadastro(tipoCadastro);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
