package br.com.conac.sistema.antigos;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;

public class LoginJFantigo extends JFrame{
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private TratadorEventos evento;
	private JButton btnCadastrese;
	private JLabel label;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnProfessor;
	private JRadioButton rdbtnAluno;
	
	public LoginJFantigo() {
		setResizable(false);
		setTitle("Tela principal");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\logo_menor.fw.png"));
		evento = new TratadorEventos();
		
		setSize(590,450);
		
		Container container =  getContentPane();
		
		container.setLayout(null);
		container.setLocation(100, 100);
		container.setBackground(SystemColor.textHighlight);
		container.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("CONAC\r\n");
		lblNewLabel.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setFont(new Font("Apple Butter", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(512, 390, 63, 23);
		container.add(lblNewLabel);
		
		JLabel lblBemvindoAoConac = new JLabel("Bem-vindo!");
		lblBemvindoAoConac.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblBemvindoAoConac.setForeground(SystemColor.control);
		lblBemvindoAoConac.setBounds(197, 81, 199, 55);
		
		JLabel lblsistemaDeControle = new JLabel("(SISTEMA DE CONTROLE ACADEMICO)");
		lblsistemaDeControle.setForeground(SystemColor.inactiveCaptionBorder);
		lblsistemaDeControle.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblsistemaDeControle.setBounds(10, 33, 208, 37);
		
		JLabel lblConac = new JLabel("CONAC");
		lblConac.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblConac.setForeground(SystemColor.controlHighlight);
		lblConac.setBounds(33, 0, 195, 53);
		
		label = new JLabel("Portal de acesso");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(63, 182, 129, 14);
	
		lblNewLabel_1 = new JLabel("Novo cadastro");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(383, 182, 129, 14);
		
		btnNewButton = new JButton("Entrar");
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnNewButton.setBounds(63, 249, 129, 37);
		btnNewButton.addActionListener(evento);
		
		btnCadastrese = new JButton("Cadastre-se");
		btnCadastrese.setForeground(SystemColor.textHighlight);
		btnCadastrese.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnCadastrese.setBounds(383, 249, 129, 37);
		btnCadastrese.addActionListener(evento);
		
		rdbtnAluno = new JRadioButton("Aluno",true);
		buttonGroup.add(rdbtnAluno);
		rdbtnAluno.setBackground(SystemColor.textHighlight);
		rdbtnAluno.setForeground(SystemColor.inactiveCaptionBorder);
		rdbtnAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnAluno.setBounds(383, 216, 61, 23);
		rdbtnAluno.addActionListener(evento);
		
		rdbtnProfessor = new JRadioButton("Professor",false);
		buttonGroup.add(rdbtnProfessor);
		rdbtnProfessor.setForeground(SystemColor.text);
		rdbtnProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnProfessor.setBackground(SystemColor.textHighlight);
		rdbtnProfessor.setBounds(446, 216, 109, 23);
		rdbtnProfessor.addActionListener(evento);
		
		container.add(rdbtnAluno);
		container.add(rdbtnProfessor);
		container.add(lblBemvindoAoConac);
		container.add(lblsistemaDeControle);
		container.add(lblConac);
		container.add(label);
		container.add(lblNewLabel_1);
		container.add(btnNewButton);
		container.add(btnCadastrese);
		
	}
	/**
	 * @author Thiago Henrique
	 * @descrição: faz tratamento de eventos do clique
	 */
	private class TratadorEventos implements ActionListener	{
		
		//criando um novo tipo de acesso para os eventos
		LoginJFantigo tipoDeAcesso = new LoginJFantigo();
		
		@Override
		public void actionPerformed(ActionEvent e) {
			/*
			if(e.getSource() == btnNewButton)	{
				tipoDeAcesso.setTipoDeAcesso("Entrar");//se este botao for acionado vai ser atribuido um tipo de acesso
				tipoDeAcesso.motrarJanela();//logo em seguida abrirá uma janela com para acesso
			}
			if(rdbtnAluno.isSelected() == true)	{
				tipoDeAcesso.setMembroAcademico("Aluno");//se o tipo do botao for cadastro e for Aluno, abri um novo cadastro de aluno
			}
			if(rdbtnProfessor.isSelected() == true)	{
				tipoDeAcesso.setMembroAcademico("Professor");
			}
			if(e.getSource() == btnCadastrese)	{
				tipoDeAcesso.setTipoDeAcesso("Cadastrar");
				tipoDeAcesso.motrarJanela();
			}
			*/
			
		}
		
	}
}
