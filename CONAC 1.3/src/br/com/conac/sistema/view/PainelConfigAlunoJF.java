package br.com.conac.sistema.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import br.com.conac.sistema.dao.RecuperandoDados;
import br.com.conac.sistema.model.Aluno;
import br.com.conac.sistema.model.Diciplina;

public class PainelConfigAlunoJF  extends JFrame	{
	private Container container;
	private Aluno aluno;
	private JTabbedPane abas;
	private String email;
	private Diciplina[] diciplinas;
	private PainelConfigNotas pcn;
	private PainelConfigDados dados;
	
	public PainelConfigAlunoJF() throws Exception	{
		super("Gerenciamento do aluno");
		
		container = getContentPane();
		
		pcn = new PainelConfigNotas();
		
		dados = new PainelConfigDados();
		
		abas = new JTabbedPane();
		abas.add("Atualizar dados cadastrais",dados);
		abas.add("Atualização de notas",pcn);
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
	
	public Diciplina[] getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(Diciplina[] diciplinas2) {
		this.diciplinas = new Diciplina[diciplinas2.length];
		this.diciplinas = diciplinas2;
	}

	public void carregarInformacoes() throws IOException {
		// TODO Auto-generated method stub
		RecuperandoDados r = new RecuperandoDados();
		this.setAluno(r.recuperandoDadosAluno(getEmail()));
		this.setDiciplinas(r.procurarDiciplinas(getAluno().getCursoDesejado()));
		
		pcn.setEmail(getAluno().getEmail());
		pcn.setDiciplinas(getDiciplinas());
		pcn.carregarDiciplinas();
		
		dados.setAluno(getAluno());
		dados.carregarInformacoes();
	}

}
