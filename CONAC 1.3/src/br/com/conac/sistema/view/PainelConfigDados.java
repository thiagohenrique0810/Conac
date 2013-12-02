package br.com.conac.sistema.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.conac.sistema.model.Aluno;

public class PainelConfigDados extends JPanel {


	private JPanel panel;
	private JTextField tfNome;
	private JTextField tfNomeMae;
	private JTextField tfEndereco;
	private JTextField tfEmail;
	private JTextField tfCpf;
	private JTextField tfDataNasc;
	private JTextField tfTelefone;

	private Aluno aluno;
	private JButton btnSalvar;
	private JButton btnAlterar;
	private JButton btnSair;
	
	private TratadorEventos evento;

	public PainelConfigDados()	{

		panel = new JPanel();		
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Informações do aluno"));
		panel.setBounds(10, 11, 761, 379);
		add(panel);
		panel.setLayout(null);
		
		evento = new TratadorEventos();
		
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

		tfTelefone = new JTextField();
		tfTelefone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfTelefone.setBackground(Color.WHITE);
		tfTelefone.setEditable(false);
		tfTelefone.setBounds(127, 274, 195, 32);
		panel.add(tfTelefone);
		tfTelefone.setColumns(10);

		btnSair = new JButton("Sair");
		btnSair.setForeground(new Color(0, 139, 139));
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSair.setBounds(487, 325, 145, 43);
		panel.add(btnSair);
		btnSair.addActionListener(evento);
		
		btnAlterar = new JButton("Alterar informa\u00E7\u00F5es");
		btnAlterar.setForeground(new Color(0, 139, 139));
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAlterar.setBounds(282, 326, 195, 42);
		panel.add(btnAlterar);
		btnAlterar.addActionListener(evento);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(new Color(0, 139, 139));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalvar.setBounds(130, 326, 142, 42);
		panel.add(btnSalvar);
		btnSalvar.addActionListener(evento);

		setSize(761, 390);

	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	//tratador de eventos
	public class TratadorEventos implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnSalvar){
				//instruções para salvar as alterações
			}
			
			if(e.getSource() == btnAlterar){
				//instruções para habilitar os campos
				tfCpf.setEditable(true);
				tfDataNasc.setEditable(true);
				tfEmail.setEditable(true);
				tfEndereco.setEditable(true);
				tfTelefone.setEditable(true);
				tfNomeMae.setEditable(true);
				tfNome.setEditable(true);
			}
			
			if(e.getSource() == btnSair)	{
				//instruções para fechar a janela
			}
		}
		
	}

	public void carregarInformacoes() {
		// TODO Auto-generated method stub
		//recuperando dados do aluno
		tfNome.setText(getAluno().getNome());
		tfEmail.setText(getAluno().getEmail());
		tfDataNasc.setText(getAluno().getDataDeNascimento());
		tfEndereco.setText(getAluno().getEndereco());
		tfNomeMae.setText(getAluno().getNomeDaMae());
		tfCpf.setText(getAluno().getCpf());
		tfTelefone.setText(getAluno().getTelefone());
	}
}
