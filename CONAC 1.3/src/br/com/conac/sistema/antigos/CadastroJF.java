package br.com.conac.sistema.antigos;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import java.awt.Toolkit;
import java.awt.Choice;
import javax.swing.ImageIcon;

public class CadastroJF extends JFrame {
	//componentes
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblFormulario;
	private JLabel lblNome;
	private JLabel lblNewLabel;
	private JLabel lblCpf;
	private JLabel lblDataDeNasc;
	private JLabel lblNomeDaMe;
	private JLabel lblDataDeEntrada;
	private JLabel lblDataDeSda;
	private JLabel lblTipoDePagamento;
	private JLabel lblSituaoAtual;
	private JLabel lblCursoDesejado;
	private JButton btnEnviar;
	private JButton btnLimparCampos;
	private JButton btnCancelar;
	private JLabel lblEndereo;
	private JLabel lblEmail;
	private JFormattedTextField formattedTextField;
	private Choice choice;
	private Choice choice_1;
	private JFormattedTextField formattedTextField_1;
	
	public CadastroJF() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\logo.fw.png"));
		setSize(534,656);
		
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		getContentPane().setLayout(null);
		
		lblFormulario = new JLabel("Formulario de cadastro aluno");
		lblFormulario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblFormulario.setBounds(104, 0, 345, 39);
		getContentPane().add(lblFormulario);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 78, 46, 14);
		getContentPane().add(lblNome);
		
		lblNewLabel = new JLabel("Idade:");
		lblNewLabel.setBounds(10, 204, 46, 14);
		getContentPane().add(lblNewLabel);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 267, 46, 14);
		getContentPane().add(lblCpf);
		
		lblDataDeNasc = new JLabel("Data de nasc.:");
		lblDataDeNasc.setBounds(249, 204, 83, 14);
		getContentPane().add(lblDataDeNasc);
		
		lblNomeDaMe = new JLabel("Nome da m\u00E3e:");
		lblNomeDaMe.setBounds(10, 330, 83, 14);
		getContentPane().add(lblNomeDaMe);
		
		lblDataDeEntrada = new JLabel("Ano de entrada:");
		lblDataDeEntrada.setBounds(10, 393, 96, 14);
		getContentPane().add(lblDataDeEntrada);
		
		lblDataDeSda = new JLabel("Ano de sa\u00EDda:");
		lblDataDeSda.setBounds(249, 267, 83, 14);
		getContentPane().add(lblDataDeSda);
		
		lblTipoDePagamento = new JLabel("Tipo de Pagamento:");
		lblTipoDePagamento.setBounds(10, 456, 123, 14);
		getContentPane().add(lblTipoDePagamento);
		
		lblSituaoAtual = new JLabel("Situa\u00E7\u00E3o atual:");
		lblSituaoAtual.setBounds(10, 519, 96, 14);
		getContentPane().add(lblSituaoAtual);
		
		lblCursoDesejado = new JLabel("Curso desejado:");
		lblCursoDesejado.setBounds(259, 456, 97, 14);
		getContentPane().add(lblCursoDesejado);
		
		textField = new JTextField();
		textField.setBounds(116, 79, 380, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 201, 46, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(116, 327, 380, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(116, 390, 60, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(330, 264, 86, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setIcon(new ImageIcon("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\icon_ok.fw.png"));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEnviar.setBounds(65, 576, 106, 34);
		getContentPane().add(btnEnviar);
		
		btnLimparCampos = new JButton("Limpar campos");
		btnLimparCampos.setIcon(new ImageIcon("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\icon_refresh.fw.png"));
		btnLimparCampos.setBounds(173, 576, 162, 34);
		getContentPane().add(btnLimparCampos);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\icon_cancel.fw.png"));
		btnCancelar.setBounds(337, 576, 117, 34);
		getContentPane().add(btnCancelar);
		
		lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 141, 71, 14);
		getContentPane().add(lblEndereo);
		
		textField_7 = new JTextField();
		textField_7.setBounds(116, 138, 380, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(217, 390, 46, 14);
		getContentPane().add(lblEmail);
		
		textField_8 = new JTextField();
		textField_8.setBounds(267, 390, 229, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(116, 264, 96, 20);
		getContentPane().add(formattedTextField);
		
		choice = new Choice();
		choice.setBounds(133, 456, 95, 20);
		getContentPane().add(choice);
		
		choice_1 = new Choice();
		choice_1.setBounds(362, 456, 134, 20);
		getContentPane().add(choice_1);
		
		formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(345, 201, 96, 20);
		getContentPane().add(formattedTextField_1);
	}
	
	//metodo main pra teste
		public static void main(String args[])	{
			CadastroJF t = new CadastroJF();
			t.setVisible(true);
		
		}
}
