package br.com.conac.sistema.view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import br.com.conac.sistema.model.Aluno;

import java.awt.Color;

public class JPainelDados extends JPanel {
	
	private JPanel panel;
	private JTextField tfNome;
	private JTextField tfNomeMae;
	private JTextField tfEndereco;
	private JTextField tfEmail;
	private JTextField tfCpf;
	private JTextField tfDataNasc;
	private JTextField textField;
	
	private Aluno aluno;
	
	public JPainelDados()	{
		
		panel = new JPanel();		
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Informações do aluno"));
		panel.setBounds(10, 11, 761, 390);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(0, 139, 139));
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(10, 45, 89, 32);
		panel.add(lblNome);
		
		JLabel lblNomeDaMe = new JLabel("Nome da m\u00E3e:");
		lblNomeDaMe.setForeground(new Color(0, 139, 139));
		lblNomeDaMe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDaMe.setBounds(10, 88, 115, 32);
		panel.add(lblNomeDaMe);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setForeground(new Color(0, 139, 139));
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEndereo.setBounds(10, 133, 84, 32);
		panel.add(lblEndereo);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(new Color(0, 139, 139));
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(10, 225, 72, 32);
		panel.add(lblCpf);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(0, 139, 139));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(10, 179, 72, 32);
		panel.add(lblEmail);
		
		tfNome = new JTextField();
		tfNome.setBackground(Color.WHITE);
		tfNome.setEditable(false);
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfNome.setBounds(127, 47, 594, 32);
		panel.add(tfNome);
		tfNome.setColumns(10);
		
		tfNomeMae = new JTextField();
		tfNomeMae.setBackground(Color.WHITE);
		tfNomeMae.setEditable(false);
		tfNomeMae.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfNomeMae.setBounds(127, 90, 594, 32);
		panel.add(tfNomeMae);
		tfNomeMae.setColumns(10);
		
		tfEndereco = new JTextField();
		tfEndereco.setBackground(Color.WHITE);
		tfEndereco.setEditable(false);
		tfEndereco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfEndereco.setBounds(127, 135, 594, 32);
		panel.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBackground(Color.WHITE);
		tfEmail.setEditable(false);
		tfEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfEmail.setBounds(127, 180, 361, 32);
		panel.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfCpf = new JTextField();
		tfCpf.setBackground(Color.WHITE);
		tfCpf.setEditable(false);
		tfCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfCpf.setBounds(127, 227, 218, 32);
		panel.add(tfCpf);
		tfCpf.setColumns(10);
		
		JLabel lblDataNasc = new JLabel("Data Nasc.:");
		lblDataNasc.setForeground(new Color(0, 139, 139));
		lblDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDataNasc.setBounds(373, 225, 89, 32);
		panel.add(lblDataNasc);
		
		tfDataNasc = new JTextField();
		tfDataNasc.setBackground(Color.WHITE);
		tfDataNasc.setEditable(false);
		tfDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfDataNasc.setBounds(490, 227, 142, 32);
		panel.add(tfDataNasc);
		tfDataNasc.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(new Color(0, 139, 139));
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTelefone.setBounds(10, 278, 89, 32);
		panel.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(127, 274, 195, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(new Color(0, 139, 139));
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSair.setBounds(299, 325, 145, 42);
		panel.add(btnSair);
		
		setSize(761, 390);
	}
	
	public void preencherDados()	{
		//recuperando dados do aluno
		tfNome.setText(getAluno().getNome());
		tfEmail.setText(getAluno().getEmail());
		tfDataNasc.setText(getAluno().getDataDeNascimento());
		tfEndereco.setText(getAluno().getEndereco());
		tfNomeMae.setText(getAluno().getNomeDaMae());
		tfCpf.setText(getAluno().getCpf());
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = new Aluno(aluno.getNome(),aluno.getCpf());
		this.aluno = aluno;
	}
	
}
