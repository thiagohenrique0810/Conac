package br.com.conac.sistema.view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPainelInfoCurso extends JPanel {
	
	private JPanel panel;
	
	public JPainelInfoCurso()	{
		
		panel = new JPanel();		
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Informações do Curso"));
		panel.setBounds(10, 11, 761, 390);
		add(panel);
		panel.setLayout(null);
		
	}
	
}
