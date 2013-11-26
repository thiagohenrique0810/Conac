package br.com.conac.sistema.view;

import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.com.conac.sistema.dao.LoginDB;
import br.com.conac.sistema.dao.SalvarDados;
import br.com.conac.sistema.model.Professor;
import java.awt.SystemColor;

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

	private MaskFormatter maskcpf,maskemail,maskdata,masktelefone,maskano;
	
	private Professor novoProfessor;
	private TratadorEventos evento;
	private JTextField txtAnoG;
	private JTextField txtAnoM;
	private JTextField txtAnoD;
	private Container container;
	private Checkbox checkbox;
	private Checkbox checkbox_1;
	private Checkbox checkbox_2;
	private JLabel lblFone;
	private JTextField txtTel;
	private JLabel label;

	public CadastroProfessorJF() throws ParseException {

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\logo.fw.png"));
		setSize(585,597);

		container =  getContentPane();

		evento = new TratadorEventos();

		setLocation(450, 50);

		container.setFont(new Font("Tahoma", Font.PLAIN, 11));
		container.setLayout(null);
		
		masktelefone = new MaskFormatter("(##)####-####");
		maskano = new MaskFormatter("####");
		maskcpf = new MaskFormatter("###.###.###-##");
		maskdata = new MaskFormatter("##/##/####");

		lblFormulario = new JLabel("Formulario de cadastro professor");
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

		lblCursoDesejado = new JLabel("Curso a ministrar:");
		lblCursoDesejado.setBounds(26, 379, 106, 14);
		container.add(lblCursoDesejado);

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

		tfAnoEntrada = new JFormattedTextField(maskano);
		tfAnoEntrada.setBounds(373, 265, 60, 20);
		container.add(tfAnoEntrada);
		tfAnoEntrada.setColumns(10);
		tfAnoEntrada.addActionListener(evento);

		btnEnviar = new JButton("Enviar");
		btnEnviar.setIcon(new ImageIcon(CadastroProfessorJF.class.getResource("/imgs/iconok.fw.png"))); 
		btnEnviar.setBounds(85, 513, 106, 34);
		container.add(btnEnviar);
		btnEnviar.addActionListener(evento);

		btnLimparCampos = new JButton("Limpar campos");
		btnLimparCampos.setIcon(new ImageIcon(CadastroProfessorJF.class.getResource("/imgs/iconrefresh.fw.png")));
		btnLimparCampos.setBounds(193, 513, 162, 34);
		btnLimparCampos.addActionListener(evento);
		container.add(btnLimparCampos);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(CadastroProfessorJF.class.getResource("/imgs/iconcancel.fw.png")));
		btnCancelar.setBounds(357, 513, 130, 34);
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

		choice_1 = new Choice();
		choice_1.setBounds(26, 413, 130, 20);
		choice_1.addItem("Nenhum selecionado");
		choice_1.addItem("Administração");
		choice_1.addItem("Computação");
		choice_1.addItem("Direito");
		container.add(choice_1);

		tfDataNasc = new JFormattedTextField(maskdata);
		tfDataNasc.setBounds(373, 201, 96, 20);
		container.add(tfDataNasc);
		tfDataNasc.addActionListener(evento);

		JLabel lblFormaoAcademica = new JLabel("Forma\u00E7\u00E3o academica:");
		lblFormaoAcademica.setBounds(243, 379, 134, 14);
		container.add(lblFormaoAcademica);

		checkbox = new Checkbox("Gradua\u00E7\u00E3o");
		checkbox.setBounds(243, 399, 95, 22);
		container.add(checkbox);
		checkbox.addItemListener(evento);

		checkbox_1 = new Checkbox("Mestrado");
		checkbox_1.setBounds(243, 427, 95, 22);
		container.add(checkbox_1);
		checkbox_1.addItemListener(evento);

		checkbox_2 = new Checkbox("Doutorado\r\n");
		checkbox_2.setBounds(243, 457, 95, 22);
		container.add(checkbox_2);
		checkbox_2.addItemListener(evento);

		JLabel lblNewLabel_1 = new JLabel("Ano conclus\u00E3o:");
		lblNewLabel_1.setBounds(344, 399, 96, 22);
		container.add(lblNewLabel_1);

		JLabel lblAnoConcluso = new JLabel("Ano conclus\u00E3o:");
		lblAnoConcluso.setBounds(344, 427, 96, 22);
		container.add(lblAnoConcluso);

		JLabel lblAnoConcluso_1 = new JLabel("Ano conclus\u00E3o:");
		lblAnoConcluso_1.setBounds(344, 457, 96, 22);
		container.add(lblAnoConcluso_1);

		txtAnoG = new JFormattedTextField(maskano);
		txtAnoG.setBounds(436, 399, 65, 20);
		container.add(txtAnoG);
		txtAnoG.setColumns(10);
		txtAnoG.setEditable(false);

		txtAnoM = new JFormattedTextField(maskano);
		txtAnoM.setBounds(436, 429, 65, 20);
		container.add(txtAnoM);
		txtAnoM.setColumns(10);
		txtAnoM.setEditable(false);

		txtAnoD = new JFormattedTextField(maskano);
		txtAnoD.setBounds(436, 459, 65, 20);
		container.add(txtAnoD);
		txtAnoD.setColumns(10);
		txtAnoD.setEditable(false);

		lblFone = new JLabel("Fone:");
		lblFone.setBounds(379, 323, 46, 14);
		getContentPane().add(lblFone);

		txtTel = new JFormattedTextField(masktelefone);
		txtTel.setBounds(423, 320, 116, 20);
		getContentPane().add(txtTel);
		txtTel.setColumns(10);
		
		label = new JLabel("CONAC\r\n");
		label.setForeground(SystemColor.textHighlight);
		label.setFont(new Font("Apple Butter", Font.BOLD | Font.ITALIC, 15));
		label.setBounds(506, 535, 63, 23);
		getContentPane().add(label);

	}

	/*
	 * tratamentos de eventos
	 */
	public class TratadorEventos implements ActionListener, ItemListener	{
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

				limparCampos();
			}
			if(e.getSource() == btnCancelar)	{
				//instruções para fechar e cancelar a operação
			}
		}

		//para tratamento das checkbox
		@Override
		public void itemStateChanged(ItemEvent i) {
			if(i.getSource() == checkbox)	{
				txtAnoG.setEditable(true);
			}
			if(i.getSource() == checkbox_1)	{
				txtAnoM.setEditable(true);
			}
			if(i.getSource() == checkbox_2)	{
				txtAnoD.setEditable(true);
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
		novoProfessor.setCursoMinistrado(choice_1.getSelectedItem());
		novoProfessor.setTelefone(txtTel.getText());
		if(checkbox.getState() == true)	{
			novoProfessor.setTituloGraduacao(true);
			novoProfessor.setAnoConclusaoGraduacao(txtAnoG.getText());
		}
		if(checkbox_1.getState() == true)	{
			novoProfessor.setTituloMestrado(true);
			novoProfessor.setAnoConclusaoMestrado(txtAnoM.getText());
		}
		if(checkbox_2.getState() == true)	{
			novoProfessor.setTituloDoutorado(true);
			novoProfessor.setAnoConclusaoDoutorado(txtAnoD.getText());
		}

		return novoProfessor;
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

		List<JTextField> fields = new ArrayList<JTextField>();

		for (Component C : container.getComponents()) {

			if (C instanceof JTextField) {
				fields.add(((JTextField) C));
			}
		}

		return fields.toArray(new JTextField[fields.size()]);
	}


	//metodo main pra teste
	public static void main(String args[]) throws ParseException	{
		CadastroProfessorJF t = new CadastroProfessorJF();
		t.setVisible(true);
	}
}