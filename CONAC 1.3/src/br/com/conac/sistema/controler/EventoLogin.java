package br.com.conac.sistema.controler;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.conac.sistema.dao.LoginDB;

public class EventoLogin implements ActionListener	{
	//atributos
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton ;
	
	LoginDB c = new LoginDB();
	
	public void eventos(JTextField textField, JPasswordField passwordField,JButton btnNewButton) {
		this.textField = textField;
		this.passwordField = passwordField;
		this.btnNewButton = btnNewButton;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//botao Entrar
		if(e.getSource() == btnNewButton)	{
			try {
				if(c.Logar(textField.getText(),passwordField.getPassword()) == true)	{
					//codigo para abrir informações do mesmo
					c.mostrarJanelaDeAcesso(textField.getText(),passwordField.getPassword());
				}
				else	{
					// caso erro
					JOptionPane.showMessageDialog(null, "Senha ou login invalidos");
				}
			} catch (HeadlessException e1) {
				// caso erro
				JOptionPane.showMessageDialog(null, "Senha ou login invalidos");
			} catch (IOException e1) {
				// caso erro
				JOptionPane.showMessageDialog(null, "Senha ou login invalidos");
			}
		}

	}
}
