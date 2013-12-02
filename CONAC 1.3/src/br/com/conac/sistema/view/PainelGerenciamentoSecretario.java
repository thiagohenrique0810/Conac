package br.com.conac.sistema.view;

import java.awt.Color;
import java.awt.Container;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import br.com.conac.sistema.controler.CJanelaGerenciamento;

public class PainelGerenciamentoSecretario extends JFrame	{

	private Container container;
	private JTabbedPane abas;
	private String email;

	public PainelGerenciamentoSecretario() throws IOException {

		super("Painel de gerenciamento");
		
		CJanelaGerenciamento c = new CJanelaGerenciamento();

		container = getContentPane();

		container.setBackground(new Color(255, 255, 240));
		
		PainelPesquisaAluno painelP = new PainelPesquisaAluno();
		painelP.setAlunos(c.carregarInformacoesAlunos());
		painelP.carregarInformacoes();
		
		abas = new JTabbedPane();
		abas.add("Consulta alunos",painelP);
		abas.add("Nova diciplina",new JPainelNovaDiciplina());
		container.add(abas);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnUser = new JMenu("User");
		menuBar.add(mnUser);

		JMenuItem mntmSair = new JMenuItem("Sair");
		mnUser.add(mntmSair);

		setSize(780,497);
		setLocation(300,100);
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
}
