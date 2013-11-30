package br.com.conac.sistema.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.com.conac.sistema.model.Aluno;

public class PainelDoAluno extends JFrame {
	private Container container;
	private Aluno aluno;
	
	private JPainelNotas notas = new JPainelNotas();
	private JPainelDados dados = new JPainelDados();
	private JPainelInfoCurso infoCurso = new JPainelInfoCurso();
	
	public PainelDoAluno()	{
		super("Painel do aluno");
		
		container = getContentPane();
		
		dados.setDados(getAluno());
		
		//cria um painel de abas
		JTabbedPane abas = new JTabbedPane();
		abas.add("Notas",notas);
		abas.add("Informações Cadastrais",dados);
		abas.add("Informações sobre o Curso",infoCurso);
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
	
	public static void main(String args[])	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			//LOG.error(e.getMessage());
		}
		new PainelDoAluno().setVisible(true);
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
