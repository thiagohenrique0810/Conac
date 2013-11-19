package br.com.conac.sistema.view;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import br.com.conac.sistema.controler.EventoLogin;

public class LoginJF extends JFrame	{
	//atributos
	private JTextField textField;
	private JPasswordField passwordField;
	private EventoLogin evento;
	private JButton btnNewButton ;

	public LoginJF() {
       super("Area de acesso");
		//configuração do layout
		Container container =  getContentPane();
		container.setLayout(null);

		//tratador de eventos
		evento = new EventoLogin();

		setSize(350, 300);
		setLocation(500, 200);

		JLabel lblAreaDeAcesso = new JLabel("Faça seu login.");
		lblAreaDeAcesso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAreaDeAcesso.setBounds(108, 11, 134, 42);

		JLabel lblNewLabel = new JLabel("E-mail:");
		lblNewLabel.setBounds(22, 97, 46, 14);

		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(22, 147, 46, 14);

		textField = new JTextField();
		textField.setBounds(78, 90, 208, 29);

		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(78, 140, 208, 29);

		btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(90, 197, 156, 42);
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
	}
}
