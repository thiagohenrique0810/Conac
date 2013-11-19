package br.com.conac.sistema.view;

import java.awt.Choice;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import br.com.conac.sistema.DAO.LoginDB;
import br.com.conac.sistema.DAO.SalvarDados;
import br.com.conac.sistema.model.Professor;

public class CadastroProfessorJF extends JFrame	{
	//componentes
		private JLabel lblFormulario;
		private JLabel lblNome;
		private JLabel lblNewLabel;
		private JLabel lblCpf;
		private JLabel lblDataDeNasc;
		private JLabel lblDataDeEntrada;
		private JLabel lblCursoDesejado;
		private JLabel lblEndereo;
		private JLabel lblEmail;

		private JTextField tfNome;
		private JTextField tfAnoEntrada;
		private JTextField tfEndereco;
		private JTextField tfEmail;
		private JButton btnEnviar;
		private JButton btnLimparCampos;
		private JButton btnCancelar;
		private Choice choice_1;
		private JTextField tfFCpf;
		private JTextField tfDataNasc;
		private JPasswordField jpassword;

		private Professor novoProfessor;
		private TratadorEventos evento;


		public CadastroProfessorJF() {

			setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\logo.fw.png"));
			setSize(534,656);

			Container container =  getContentPane();

			setLocation(450, 50);

			container.setFont(new Font("Tahoma", Font.PLAIN, 11));
			container.setLayout(null);

			lblFormulario = new JLabel("Formulario de cadastro professor");
			lblFormulario.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lblFormulario.setBounds(85, 0, 384, 39);
			container.add(lblFormulario);

			lblNome = new JLabel("Nome:");
			lblNome.setBounds(10, 78, 46, 14);
			container.add(lblNome);

			lblNewLabel = new JLabel("Senha:");
			lblNewLabel.setBounds(10, 204, 46, 14);
			container.add(lblNewLabel);

			lblCpf = new JLabel("CPF:");
			lblCpf.setBounds(10, 267, 46, 14);
			container.add(lblCpf);

			lblDataDeNasc = new JLabel("Data de nasc.");
			lblDataDeNasc.setBounds(273, 204, 83, 14);
			container.add(lblDataDeNasc);

			lblDataDeEntrada = new JLabel("Ano de entrada:");
			lblDataDeEntrada.setBounds(273, 270, 96, 14);
			container.add(lblDataDeEntrada);

			lblCursoDesejado = new JLabel("Curso a ministrar:");
			lblCursoDesejado.setBounds(10, 381, 113, 14);
			container.add(lblCursoDesejado);

			tfNome = new JTextField();
			tfNome.setBounds(128, 79, 380, 20);
			container.add(tfNome);
			tfNome.setColumns(10);
			tfNome.addActionListener(evento);

			jpassword = new JPasswordField();
			jpassword.setBounds(128, 201, 112, 20);
			container.add(jpassword);
			jpassword.setColumns(10);
			jpassword.addActionListener(evento);

			tfAnoEntrada = new JTextField();
			tfAnoEntrada.setBounds(391, 267, 60, 20);
			container.add(tfAnoEntrada);
			tfAnoEntrada.setColumns(10);
			tfAnoEntrada.addActionListener(evento);

			btnEnviar = new JButton("Enviar");
			btnEnviar.setIcon(new ImageIcon("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\icon_ok.fw.png")); 
			btnEnviar.setBounds(65, 576, 106, 34);
			container.add(btnEnviar);
			btnEnviar.addActionListener(evento);

			btnLimparCampos = new JButton("Limpar campos");
			btnLimparCampos.setIcon(new ImageIcon("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\icon_refresh.fw.png"));
			btnLimparCampos.setBounds(173, 576, 162, 34);
			container.add(btnLimparCampos);
			btnLimparCampos.addActionListener(evento);

			btnCancelar = new JButton("Cancelar");
			btnCancelar.setIcon(new ImageIcon("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\icon_cancel.fw.png"));
			btnCancelar.setBounds(337, 576, 117, 34);
			container.add(btnCancelar);
			btnCancelar.addActionListener(evento);

			lblEndereo = new JLabel("Endere\u00E7o:");
			lblEndereo.setBounds(10, 141, 71, 14);
			container.add(lblEndereo);

			tfEndereco = new JTextField();
			tfEndereco.setBounds(128, 138, 380, 20);
			container.add(tfEndereco);
			tfEndereco.setColumns(10);
			tfEndereco.addActionListener(evento);

			lblEmail = new JLabel("E-mail:");
			lblEmail.setBounds(10, 323, 46, 14);
			container.add(lblEmail);

			tfEmail = new JTextField();
			tfEmail.setBounds(66, 320, 229, 20);
			container.add(tfEmail);
			tfEmail.setColumns(10);
			tfEmail.addActionListener(evento);

			tfFCpf = new JFormattedTextField();
			tfFCpf.setBounds(128, 264, 96, 20);
			container.add(tfFCpf);
			tfFCpf.addActionListener(evento);

			choice_1 = new Choice();
			choice_1.setBounds(129, 375, 134, 20);
			choice_1.addItem("Administração");
			choice_1.addItem("Computação");
			choice_1.addItem("Direito");
			container.add(choice_1);

			tfDataNasc = new JFormattedTextField();
			tfDataNasc.setBounds(373, 201, 96, 20);
			container.add(tfDataNasc);
			tfDataNasc.addActionListener(evento);

			JSeparator separator = new JSeparator();
			separator.setBounds(495, 374, -57, 2);
			getContentPane().add(separator);
			
		}
		public class TratadorEventos implements ActionListener	{
			public void actionPerformed(ActionEvent e) {
				//manipulando os botões
				LoginDB l = new LoginDB();
				SalvarDados salvar = new SalvarDados();

				if(e.getSource() == btnEnviar)	{
					//instruções para salvar dados
					try {
						if((l.verificar(tfEmail.getText())) == false)	{
							salvar.salvarInformacoesProfessor(getInformacoes());
							JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");
						}
						else	{
							JOptionPane.showMessageDialog(null, "Usuario Ja cadastrado! :/");		
						}
					} catch (HeadlessException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(e.getSource() == btnLimparCampos)	{
					//instruções para limpar os campos de texto
					tfNome.setText("");
					jpassword.setText("");
					tfAnoEntrada.setText("");
					tfEndereco.setText("");
					tfEmail.setText("");
					tfFCpf.setText("");
					tfDataNasc.setText("");
				}
				if(e.getSource() == btnCancelar)	{
					//instruções para fechar e cancelar a operação
				}
			}
		}

		public Professor getInformacoes()	{
			novoProfessor = new Professor(tfNome.getText(),tfFCpf.getText());

			novoProfessor.setEndereco(tfEndereco.getText());
			novoProfessor.setDataDeNascimento(tfDataNasc.getText());
			novoProfessor.setAnoEntrada(tfAnoEntrada.getText());
			novoProfessor.setEmail(tfEmail.getText());
			novoProfessor.setSenha(jpassword.getPassword());
			return novoProfessor;
		}

		//metodo main pra teste
		public static void main(String args[])	{
			CadastroProfessorJF t = new CadastroProfessorJF();
			t.setVisible(true);
		}
}
