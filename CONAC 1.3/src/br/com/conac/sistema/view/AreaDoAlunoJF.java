package br.com.conac.sistema.view;

import java.awt.Container;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import br.com.conac.sistema.dao.RecuperandoDados;
import br.com.conac.sistema.model.Aluno;

public class AreaDoAlunoJF extends JFrame {
	
	private JButton btnEntrar_2;
	private JButton btnEntrar_1;
	private JButton btnEntrar;
	private Container container;
	private TratadorEventos evento;
	private String email;
	
	private Aluno a;
	
	public AreaDoAlunoJF()	{
		
		super("Area do aluno");
		
		evento = new TratadorEventos();
		
		container = getContentPane();
		container.setBackground(new Color(102, 205, 170));
		container.setLayout(null);
		
		setLocation(500, 200);
		setSize(590,450);
		
		JLabel label = new JLabel("(SISTEMA DE CONTROLE ACADEMICO)");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 9));
		label.setBounds(10, 36, 208, 37);
		container.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(AreaDoAlunoJF.class.getResource("/imgs/logo.fw.png")));
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		label_1.setBounds(10, 0, 195, 53);
		container.add(label_1);
		
		JLabel label_2 = new JLabel("CONAC\r\n");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Apple Butter", Font.BOLD | Font.ITALIC, 15));
		label_2.setBounds(511, 388, 63, 23);
		container.add(label_2);
		
		JLabel label_3 = new JLabel("Bem-vindo!");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 33));
		label_3.setBounds(202, 84, 199, 55);
		container.add(label_3);
		
		JLabel lblSituaoENotas = new JLabel("Situa\u00E7\u00E3o e notas");
		lblSituaoENotas.setForeground(Color.WHITE);
		lblSituaoENotas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSituaoENotas.setBounds(22, 187, 121, 30);
		container.add(lblSituaoENotas);
		
		JLabel lblD = new JLabel("Dados cadastrais");
		lblD.setForeground(Color.WHITE);
		lblD.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblD.setBounds(231, 192, 130, 20);
		container.add(lblD);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setIcon(new ImageIcon(AreaDoAlunoJF.class.getResource("/imgs/iconok.fw.png")));
		btnEntrar.setForeground(new Color(102, 205, 170));
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnEntrar.setBounds(22, 268, 136, 37);
		container.add(btnEntrar);
		btnEntrar.addActionListener(evento);
		
		btnEntrar_1 = new JButton("Entrar");
		btnEntrar_1.setIcon(new ImageIcon(AreaDoAlunoJF.class.getResource("/imgs/iconbook.fw.png")));
		btnEntrar_1.setForeground(new Color(102, 205, 170));
		btnEntrar_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnEntrar_1.setBounds(231, 268, 136, 37);
		container.add(btnEntrar_1);
		btnEntrar_1.addActionListener(evento);
		
		JLabel lblInformaesCurso = new JLabel("Informa\u00E7\u00F5es curso");
		lblInformaesCurso.setForeground(Color.WHITE);
		lblInformaesCurso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInformaesCurso.setBounds(416, 193, 137, 23);
		container.add(lblInformaesCurso);
		
		btnEntrar_2 = new JButton("Entrar");
		btnEntrar_2.setIcon(new ImageIcon(AreaDoAlunoJF.class.getResource("/imgs/iconfolderuser.fw.png")));
		btnEntrar_2.setForeground(new Color(102, 205, 170));
		btnEntrar_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnEntrar_2.setBounds(416, 268, 136, 37);
		container.add(btnEntrar_2);
		btnEntrar_2.addActionListener(evento);
	}
	
	public class TratadorEventos implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			RecuperandoDados r = new RecuperandoDados();
			PainelDoAluno panel = new PainelDoAluno();
			
			try {
				a = new Aluno(r.recuperandoDadosAluno(getEmail()).getNome(),r.recuperandoDadosAluno(getEmail()).getCpf());
				a = r.recuperandoDadosAluno(getEmail());
				panel.setAluno(a);
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}
			
			if(e.getSource() == btnEntrar)	{
				//instruções para situação e notas
				panel.setVisible(true);
			}
			
			if(e.getSource() == btnEntrar_1)	{
				//instruções para dados cadastras
			}
			
			if(e.getSource() == btnEntrar_2)	{
				//instruções para informações sobre o curso
			}
		}	
	}
	
	//recebendo o email para fazer buscas de informações
	public void setEmail(String email)	{
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	//metodo main para testar a janela, deve-se ser removido na versão final
	public static void main(String args[])	{
		AreaDoAlunoJF a = new AreaDoAlunoJF();
		a.setEmail("fulanodetal@hotmail.com");
		a.setVisible(true);
	}
}
