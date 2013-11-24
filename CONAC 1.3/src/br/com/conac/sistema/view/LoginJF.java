package br.com.conac.sistema.view;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import br.com.conac.sistema.controler.EventoLogin;
import java.awt.Color;
import javax.swing.ImageIcon;

public class LoginJF extends JFrame	{
	//atributos
	private JTextField textField;
	private JPasswordField passwordField;
	private EventoLogin evento;
	private JButton btnNewButton ;

	public LoginJF() {
       super("Area de acesso");
       getContentPane().setBackground(new Color(240, 230, 140));
		//configuração do layout
		Container container =  getContentPane();
		container.setLayout(null);

		//tratador de eventos
		evento = new EventoLogin();

		setSize(498, 264);
		setLocation(500, 200);

		JLabel lblAreaDeAcesso = new JLabel("Faça seu login.");
		lblAreaDeAcesso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAreaDeAcesso.setBounds(10, 61, 134, 42);

		JLabel lblNewLabel = new JLabel("E-mail:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 114, 84, 24);

		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 164, 76, 24);

		textField = new JTextField();
		textField.setBounds(78, 114, 208, 29);

		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(78, 169, 208, 29);

		btnNewButton = new JButton("Entrar");
		btnNewButton.setIcon(new ImageIcon(LoginJF.class.getResource("/imgs/iconuser.fw.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(318, 130, 156, 42);
		btnNewButton.addActionListener(evento);

		container.add(lblAreaDeAcesso);
		container.add(lblNewLabel);
		container.add(textField);
		container.add(btnNewButton);
		container.add(passwordField);
		container.add(lblNewLabel_1);
		
		/**
		 * @author Thiago Henrique
		 * @descrição: faz tratamento de eventos do clique
		 */
		evento.eventos(textField,passwordField,btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(LoginJF.class.getResource("/imgs/logo.fw.png")));
		lblNewLabel_2.setBounds(154, 11, 190, 64);
		getContentPane().add(lblNewLabel_2);
	}
}
