package br.com.conac.sistema.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import br.com.conac.sistema.model.Aluno;

public class PainelConfigAlunoJF  extends JFrame	{
	private Container container;
	private Aluno aluno;
	private JTabbedPane abas;
	private String email;
	
	public PainelConfigAlunoJF()	{
		super("Gerenciamento do aluno");
		
		container = getContentPane();
		
		abas = new JTabbedPane();
		container.add(abas);
		
		setLocation(500, 200);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Usuario");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon(PainelDoAluno.class.getResource("/imgs/iconpower.fw.png")));
		mnArquivo.add(mntmSair);
		
		setSize(800,500);
	}
	
	public class TratadorEventos implements ActionListener	{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		}	
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = new Aluno(aluno.getNome(),aluno.getCpf());
		this.aluno = aluno;
		
		//mostrando informações
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}
