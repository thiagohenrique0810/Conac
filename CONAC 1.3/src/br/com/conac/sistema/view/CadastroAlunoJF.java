package br.com.conac.sistema.view;

import java.awt.Choice;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.com.conac.sistema.dao.LoginDB;
import br.com.conac.sistema.dao.SalvarDados;
import br.com.conac.sistema.model.Aluno;
import java.awt.SystemColor;


public class CadastroAlunoJF extends JFrame {
	//componentes
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
	private JLabel lblEndereo;
	private JLabel lblEmail;

	private JTextField tfNome;
	private JTextField tfNomeMae;
	private JTextField tfAnoEntrada;
	private JTextField tfAnoSaida;
	private JTextField tfEndereco;
	private JTextField tfEmail;
	private JButton btnEnviar;
	private JButton btnLimparCampos;
	private JButton btnCancelar;
	private Choice choice;
	private Choice choice_1;
	private Choice choice_2;
	private JTextField tfFCpf;
	private JTextField tfDataNasc;
	private JPasswordField jpassword;
	
	private MaskFormatter maskcpf,maskemail,maskdata,masktelefone,maskano;
	
	private Container container;

	private Aluno novoAluno;
	private TratadorEventos evento;
	private JTextField txtFone;
	private JLabel label;


	public CadastroAlunoJF() throws ParseException  {
		evento = new TratadorEventos();

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thiago Henrique\\Documents\\workspace\\CONAC 1.2\\src\\poo\\conac\\sistema\\view\\imgs\\logo.fw.png"));
		setSize(534,656);

		container =  getContentPane();

		setLocation(450, 50);

		container.setFont(new Font("Tahoma", Font.PLAIN, 11));
		container.setLayout(null);
		
		masktelefone = new MaskFormatter("(##)####-####");
		maskano = new MaskFormatter("####");
		maskcpf = new MaskFormatter("###.###.###-##");
		maskdata = new MaskFormatter("##/##/####");

		lblFormulario = new JLabel("Formulario de cadastro aluno");
		lblFormulario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblFormulario.setBounds(104, 0, 345, 39);
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

		lblNomeDaMe = new JLabel("Nome da m\u00E3e:");
		lblNomeDaMe.setBounds(10, 330, 83, 14);
		container.add(lblNomeDaMe);

		lblDataDeEntrada = new JLabel("Ano de entrada:");
		lblDataDeEntrada.setBounds(10, 393, 96, 14);
		container.add(lblDataDeEntrada);

		lblDataDeSda = new JLabel("Ano de sa\u00EDda:");
		lblDataDeSda.setBounds(273, 267, 83, 14);
		container.add(lblDataDeSda);

		lblTipoDePagamento = new JLabel("Tipo de Pagamento:");
		lblTipoDePagamento.setBounds(10, 456, 112, 14);
		container.add(lblTipoDePagamento);

		lblSituaoAtual = new JLabel("Situa\u00E7\u00E3o atual:");
		lblSituaoAtual.setBounds(10, 519, 96, 14);
		container.add(lblSituaoAtual);

		lblCursoDesejado = new JLabel("Curso desejado:");
		lblCursoDesejado.setBounds(259, 456, 97, 14);
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

		tfNomeMae = new JTextField();
		tfNomeMae.setBounds(128, 327, 380, 20);
		container.add(tfNomeMae);
		tfNomeMae.setColumns(10);
		tfNomeMae.addActionListener(evento);
		
		tfAnoEntrada = new JFormattedTextField(maskano);
		tfAnoEntrada.setBounds(128, 390, 60, 20);
		container.add(tfAnoEntrada);
		tfAnoEntrada.setColumns(10);
		tfAnoEntrada.addActionListener(evento);
		
		tfAnoSaida = new JFormattedTextField(maskano);
		tfAnoSaida.setBounds(373, 264, 86, 20);
		container.add(tfAnoSaida);
		tfAnoSaida.setColumns(10);
		tfAnoSaida.addActionListener(evento);

		btnEnviar = new JButton("Enviar");
		btnEnviar.setIcon(new ImageIcon(CadastroAlunoJF.class.getResource("/imgs/iconok.fw.png"))); 
		btnEnviar.setBounds(55, 572, 106, 34);
		container.add(btnEnviar);
		btnEnviar.addActionListener(evento);

		btnLimparCampos = new JButton("Limpar campos");
		btnLimparCampos.setIcon(new ImageIcon(CadastroAlunoJF.class.getResource("/imgs/iconrefresh.fw.png")));
		btnLimparCampos.setBounds(163, 572, 162, 34);
		container.add(btnLimparCampos);
		btnLimparCampos.addActionListener(evento);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(CadastroAlunoJF.class.getResource("/imgs/iconcancel.fw.png")));
		btnCancelar.setBounds(327, 572, 122, 34);
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
		lblEmail.setBounds(217, 390, 46, 14);
		container.add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBounds(267, 390, 229, 20);
		container.add(tfEmail);
		tfEmail.setColumns(10);
		tfEmail.addActionListener(evento);
		
		tfFCpf = new JFormattedTextField(maskcpf);
		tfFCpf.setBounds(128, 264, 96, 20);
		container.add(tfFCpf);
		tfFCpf.addActionListener(evento);

		//procurar saber como funciona o choice
		choice = new Choice();
		choice.setBounds(128, 456, 112, 20);
		choice.addItem("Bolsista");
		choice.addItem("Convenio");
		choice.addItem("Normal");
		container.add(choice);

		choice_1 = new Choice();
		choice_1.setBounds(362, 456, 134, 20);
		choice_1.addItem("Administração");
		choice_1.addItem("Computação");
		choice_1.addItem("Direito");
		container.add(choice_1);
		
		tfDataNasc = new JFormattedTextField(maskdata);
		tfDataNasc.setBounds(373, 201, 96, 20);
		container.add(tfDataNasc);
		tfDataNasc.addActionListener(evento);

		choice_2 = new Choice();
		choice_2.setBounds(128, 513, 112, 20);
		choice_2.addItem("Trancado");
		choice_2.addItem("Cursando");
		choice_2.addItem("Formado");
		container.add(choice_2);

		JSeparator separator = new JSeparator();
		separator.setBounds(495, 374, -57, 2);
		getContentPane().add(separator);
		
		JLabel lblF = new JLabel("Fone:");
		lblF.setBounds(259, 519, 46, 14);
		getContentPane().add(lblF);
		
		txtFone = new JFormattedTextField(masktelefone);
		txtFone.setBounds(362, 516, 117, 20);
		getContentPane().add(txtFone);
		txtFone.setColumns(10);
		
		label = new JLabel("CONAC\r\n");
		label.setForeground(SystemColor.textHighlight);
		label.setFont(new Font("Apple Butter", Font.BOLD | Font.ITALIC, 15));
		label.setBounds(455, 594, 63, 23);
		getContentPane().add(label);
		
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
						salvar.salvarInformacoesAluno(getInformacoes());
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
	
	//recuperando as informações dos campos
	public Aluno getInformacoes()	{
		novoAluno = new Aluno(tfNome.getText(),tfFCpf.getText());

		novoAluno.setEndereco(tfEndereco.getText());
		novoAluno.setDataDeNascimento(tfDataNasc.getText());
		novoAluno.setAnoEntrada(tfAnoEntrada.getText());
		novoAluno.setAnoSaida(tfAnoSaida.getText());
		novoAluno.setNomeDaMae(tfNomeMae.getText());
		novoAluno.setEmail(tfEmail.getText());
		novoAluno.setSenha(jpassword.getPassword());
		novoAluno.setTipoPagamento(choice.getSelectedItem());
		novoAluno.setCursoDesejado(choice_1.getSelectedItem());
		novoAluno.setSituacaoAtual(choice_2.getSelectedItem());
		novoAluno.setTelefone(txtFone.getText());
		return novoAluno;
	}

	//metodo main pra teste
	public static void main(String args[]) throws ParseException 	{
		CadastroAlunoJF t = new CadastroAlunoJF();
		t.setVisible(true);
	}
}