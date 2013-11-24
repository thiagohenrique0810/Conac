package br.com.conac.sistema.view;

import java.awt.Choice;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.conac.sistema.dao.LoginDB;
import br.com.conac.sistema.dao.SalvarDados;
import br.com.conac.sistema.model.Secretario;
import java.awt.Color;
import java.awt.SystemColor;

public class CadastroSecretarioJF extends JFrame	{
	
	//componentes
		private JLabel lblFormulario;
		private JLabel lblNome;
		private JLabel lblNewLabel;
		private JLabel lblCpf;
		private JLabel lblDataDeNasc;
		private JLabel lblDataDeEntrada;
		private JLabel lblEndereo;
		private JLabel lblEmail;

		private JTextField tfNome;
		private JTextField tfEndereco;
		private JTextField tfEmail;
		private JButton btnEnviar;
		private JButton btnLimparCampos;
		private JButton btnCancelar;
		private JTextField tfFCpf;
		private JTextField tfDataNasc;
		private JPasswordField jpassword;

		private Secretario novoSecretario;
		private TratadorEventos evento;
		private Container container;
		private JLabel lblFone;
		private JTextField txtTel;
		private JTextField txtAnoEntrada;
		private JLabel label;

		public CadastroSecretarioJF() {

			setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\logo.fw.png"));
			setSize(571,467);

			container =  getContentPane();

			evento = new TratadorEventos();

			setLocation(450, 50);

			container.setFont(new Font("Tahoma", Font.PLAIN, 11));
			container.setLayout(null);

			lblFormulario = new JLabel("Formulario de cadastro secretario");
			lblFormulario.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lblFormulario.setBounds(85, 0, 384, 39);
			container.add(lblFormulario);

			lblNome = new JLabel("Nome:");
			lblNome.setBounds(26, 79, 46, 14);
			container.add(lblNome);

			lblNewLabel = new JLabel("Senha:");
			lblNewLabel.setBounds(26, 205, 46, 14);
			container.add(lblNewLabel);

			lblCpf = new JLabel("CPF:");
			lblCpf.setBounds(26, 268, 46, 14);
			container.add(lblCpf);

			lblDataDeNasc = new JLabel("Data de nasc.");
			lblDataDeNasc.setBounds(273, 204, 83, 14);
			container.add(lblDataDeNasc);

			lblDataDeEntrada = new JLabel("Ano de entrada:");
			lblDataDeEntrada.setBounds(273, 270, 96, 14);
			container.add(lblDataDeEntrada);

			tfNome = new JTextField();
			tfNome.setBounds(128, 79, 392, 20);
			container.add(tfNome);
			tfNome.setColumns(10);
			tfNome.addActionListener(evento);

			jpassword = new JPasswordField();
			jpassword.setBounds(128, 201, 112, 20);
			container.add(jpassword);
			jpassword.setColumns(10);
			jpassword.addActionListener(evento);

			btnEnviar = new JButton("Enviar");
			btnEnviar.setIcon(new ImageIcon(CadastroSecretarioJF.class.getResource("/imgs/iconok.fw.png"))); 
			btnEnviar.setBounds(67, 383, 106, 34);
			container.add(btnEnviar);
			btnEnviar.addActionListener(evento);

			btnLimparCampos = new JButton("Limpar campos");
			btnLimparCampos.setIcon(new ImageIcon(CadastroSecretarioJF.class.getResource("/imgs/iconrefresh.fw.png")));
			btnLimparCampos.setBounds(175, 383, 162, 34);
			btnLimparCampos.addActionListener(evento);
			container.add(btnLimparCampos);

			btnCancelar = new JButton("Cancelar");
			btnCancelar.setIcon(new ImageIcon(CadastroSecretarioJF.class.getResource("/imgs/iconcancel.fw.png")));
			btnCancelar.setBounds(339, 383, 130, 34);
			container.add(btnCancelar);
			btnCancelar.addActionListener(evento);

			lblEndereo = new JLabel("Endere\u00E7o:");
			lblEndereo.setBounds(26, 142, 71, 14);
			container.add(lblEndereo);

			tfEndereco = new JTextField();
			tfEndereco.setBounds(128, 138, 392, 20);
			container.add(tfEndereco);
			tfEndereco.setColumns(10);
			tfEndereco.addActionListener(evento);

			lblEmail = new JLabel("E-mail:");
			lblEmail.setBounds(26, 324, 46, 14);
			container.add(lblEmail);

			tfEmail = new JTextField();
			tfEmail.setBounds(128, 320, 229, 20);
			container.add(tfEmail);
			tfEmail.setColumns(10);
			tfEmail.addActionListener(evento);

			tfFCpf = new JFormattedTextField();
			tfFCpf.setBounds(128, 264, 96, 20);
			container.add(tfFCpf);
			tfFCpf.addActionListener(evento);

			tfDataNasc = new JFormattedTextField();
			tfDataNasc.setBounds(373, 201, 96, 20);
			container.add(tfDataNasc);
			tfDataNasc.addActionListener(evento);			

			lblFone = new JLabel("Fone:");
			lblFone.setBounds(379, 323, 46, 14);
			getContentPane().add(lblFone);

			txtTel = new JTextField();
			txtTel.setBounds(423, 320, 116, 20);
			getContentPane().add(txtTel);
			txtTel.setColumns(10);
			
			txtAnoEntrada = new JTextField();
			txtAnoEntrada.setBounds(373, 265, 86, 20);
			getContentPane().add(txtAnoEntrada);
			txtAnoEntrada.setColumns(10);
			
			label = new JLabel("CONAC\r\n");
			label.setForeground(SystemColor.textHighlight);
			label.setFont(new Font("Apple Butter", Font.BOLD | Font.ITALIC, 15));
			label.setBounds(492, 405, 63, 23);
			getContentPane().add(label);

		}

		/*
		 * tratamentos de eventos
		 */
		public class TratadorEventos implements ActionListener	{
			public void actionPerformed(ActionEvent e) {

				//manipulando os botões
				LoginDB l = new LoginDB();
				SalvarDados salvar = new SalvarDados();

				if(e.getSource() == btnEnviar)	{
					//instruções para salvar dados

					try {
						if((l.verificar(tfEmail.getText())) == false)	{
							salvar.salvarInformacoesSecretario(getInformacoes());
							JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");
						}
						else	{
							JOptionPane.showMessageDialog(null, "Usuario Ja cadastrado! :/");		
						}
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(e.getSource() == btnLimparCampos)	{
					//instruções para limpar os campos de texto

					limparCampos();
				}
				if(e.getSource() == btnCancelar)	{
					//instruções para fechar e cancelar a operação
				}
			}
		}
		
		//recuperando as informações dos campos
		public Secretario getInformacoes()	{
			novoSecretario = new Secretario(tfNome.getText(),tfFCpf.getText());

			novoSecretario.setEndereco(tfEndereco.getText());
			novoSecretario.setDataDeNascimento(tfDataNasc.getText());
			novoSecretario.setAnoEntrada(txtAnoEntrada.getText());
			novoSecretario.setEmail(tfEmail.getText());
			novoSecretario.setSenha(jpassword.getPassword());
			novoSecretario.setTelefone(txtTel.getText());

			return novoSecretario;
		}

		/**
		 * Limpa os JTextFields da janela.
		 * 
		 */
		public void limparCampos() {

			for (JTextField jtf : getTextFields()) {

				jtf.setText("");
			}
		}

		/**
		 * Pega todos os JTextFields do PAINEL_CENTRO, onde ficam os campos de
		 * cadastro do usuário.
		 * 
		 * @TODO não retorna o valor do combo box,
		 * 
		 * @return Array de JTextFields
		 */
		public JTextField[] getTextFields() {

			ArrayList<JTextField> fields = new ArrayList<JTextField>();

			for (Component C : container.getComponents()) {

				if (C instanceof JTextField) {
					fields.add(((JTextField) C));
				}
			}

			return fields.toArray(new JTextField[fields.size()]);
		}


		//metodo main pra teste
		public static void main(String args[])	{
			CadastroSecretarioJF t = new CadastroSecretarioJF();
			t.setVisible(true);
		}

}
