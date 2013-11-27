package br.com.conac.sistema.view;

import java.awt.Container;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PainelGerenciamentoSecretario extends JFrame	{

	private Container container;
	private JTabbedPane abas;

	public PainelGerenciamentoSecretario() {

		super("Painel de gerenciamento");

		container = getContentPane();

		container.setBackground(new Color(255, 255, 240));

		abas = new JTabbedPane();
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

}
