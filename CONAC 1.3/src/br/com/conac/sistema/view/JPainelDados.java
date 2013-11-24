package br.com.conac.sistema.view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPainelDados extends JPanel {
	
	private JPanel panel;
	
	public JPainelDados()	{
		
		panel = new JPanel();		
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Informações do aluno"));
		panel.setBounds(10, 11, 761, 390);
		add(panel);
		panel.setLayout(null);
		
	}

}
