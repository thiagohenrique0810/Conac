package br.com.conac.sistema.view;

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

import br.com.conac.sistema.controler.EventosADS;


import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class AreaDoSecretarioJF extends JFrame	{
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private EventosADS evento01;
	private JButton btnCadastrese;
	private JLabel lblGerenciamento;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnProfessor;
	private JRadioButton rdbtnAluno;
	private JRadioButton rdbtnGerente;

	public AreaDoSecretarioJF() {
		super("Painel do secretario");
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\logo_menor.fw.png"));
		evento01 = new EventosADS();

		setSize(590,450);

		Container container =  getContentPane();
		setLocation(500, 200);

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
		lblsistemaDeControle.setBounds(20, 56, 208, 37);

		JLabel lblConac = new JLabel("");
		lblConac.setIcon(new ImageIcon(AreaDoSecretarioJF.class.getResource("/imgs/logo.fw.png")));
		lblConac.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblConac.setForeground(SystemColor.controlHighlight);
		lblConac.setBounds(10, 0, 254, 89);

		lblGerenciamento = new JLabel("Gerenciamento");
		lblGerenciamento.setForeground(Color.WHITE);
		lblGerenciamento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGerenciamento.setBounds(63, 182, 129, 14);

		lblNewLabel_1 = new JLabel("Novo cadastro");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(383, 182, 129, 14);

		btnNewButton = new JButton("Entrar");
		btnNewButton.setIcon(new ImageIcon(AreaDoSecretarioJF.class.getResource("/imgs/iconsetup.fw.png")));
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnNewButton.setBounds(63, 290, 129, 37);
		btnNewButton.addActionListener(evento01);

		btnCadastrese = new JButton("Cadastrar");
		btnCadastrese.setIcon(new ImageIcon(AreaDoSecretarioJF.class.getResource("/imgs/iconadd.fw.png")));
		btnCadastrese.setForeground(SystemColor.textHighlight);
		btnCadastrese.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnCadastrese.setBounds(383, 290, 129, 37);
		btnCadastrese.addActionListener(evento01);

		rdbtnAluno = new JRadioButton("Aluno",true);
		buttonGroup.add(rdbtnAluno);
		rdbtnAluno.setBackground(SystemColor.textHighlight);
		rdbtnAluno.setForeground(SystemColor.inactiveCaptionBorder);
		rdbtnAluno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnAluno.setBounds(383, 203, 61, 23);
		rdbtnAluno.addActionListener(evento01);

		rdbtnProfessor = new JRadioButton("Professor",false);
		buttonGroup.add(rdbtnProfessor);
		rdbtnProfessor.setForeground(SystemColor.text);
		rdbtnProfessor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnProfessor.setBackground(SystemColor.textHighlight);
		rdbtnProfessor.setBounds(383, 260, 89, 23);
		rdbtnProfessor.addActionListener(evento01);

		rdbtnGerente = new JRadioButton("Secretario",false);
		buttonGroup.add(rdbtnGerente);
		rdbtnGerente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnGerente.setBackground(SystemColor.textHighlight);
		rdbtnGerente.setForeground(SystemColor.text);
		rdbtnGerente.setBounds(383, 232, 89, 23);
		rdbtnGerente.addActionListener(evento01);

		container.add(rdbtnGerente);
		container.add(rdbtnAluno);
		container.add(rdbtnProfessor);
		container.add(lblBemvindoAoConac);
		container.add(lblsistemaDeControle);
		container.add(lblConac);
		container.add(lblGerenciamento);
		container.add(lblNewLabel_1);
		container.add(btnNewButton);
		container.add(btnCadastrese);

		/**
		 * @author Thiago Henrique
		 * @descrição: faz tratamento de eventos do clique
		 */
		evento01.eventos(btnNewButton,btnCadastrese,rdbtnAluno,rdbtnProfessor,rdbtnGerente);
	}
}
