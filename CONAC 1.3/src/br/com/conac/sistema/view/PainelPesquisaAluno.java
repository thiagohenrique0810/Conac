package br.com.conac.sistema.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.com.conac.sistema.model.Aluno;

public class PainelPesquisaAluno extends JPanel	{

	private JPanel panel;
	private JTextField tfPesquisaAluno;
	private JTable table;
	private JButton btnPesquisarAluno;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private TratadorEventos evento;
	private JButton btnAbrir;
	private Aluno alunos[];
	private String emails[];
	private String nomes[];
	private String cursos[];

	public PainelPesquisaAluno()	{
		panel = new JPanel();
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Consulta"));
		panel.setBounds(0, 0, 761, 405);
		add(panel);
		panel.setLayout(null);
		
		evento = new TratadorEventos();
		
		tfPesquisaAluno = new JTextField();
		tfPesquisaAluno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfPesquisaAluno.setBounds(118, 38, 424, 34);
		panel.add(tfPesquisaAluno);
		tfPesquisaAluno.setColumns(10);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(0, 139, 139));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(26, 38, 82, 34);
		panel.add(lblEmail);

		btnPesquisarAluno = new JButton("Pesquisar aluno");
		btnPesquisarAluno.setIcon(new ImageIcon(PainelPesquisaAluno.class.getResource("/imgs/iconsearch.fw.png")));
		btnPesquisarAluno.setForeground(new Color(0, 139, 139));
		btnPesquisarAluno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPesquisarAluno.setBounds(552, 38, 189, 34);
		panel.add(btnPesquisarAluno);
		btnPesquisarAluno.addActionListener(evento);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 93, 715, 241);
		panel.add(scrollPane);	

		String colunas[] = {
				"Email",
				"Nome",
				"Curso"
		};

		Object dados[][] ={};

		model = new DefaultTableModel(dados,colunas);

		table = new JTable(model);

		scrollPane.setViewportView(table);
		
		btnAbrir = new JButton("Abrir");
		btnAbrir.setForeground(new Color(0, 139, 139));
		btnAbrir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAbrir.setBounds(309, 360, 125, 34);
		panel.add(btnAbrir);
		btnAbrir.addActionListener(evento);

		setSize(761, 390);
	}
	
	//carregar informações
	/*public void carregarInformacoes()	{
		for (int x = 0; x < .length; x++) {
			model.addRow(new String[] {codigos[x],diciplinas[x],cargaHorarias[x]});
		}
	}*/

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public class TratadorEventos implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnPesquisarAluno)	{
				
				//instruções para pesquisar aluno
				
			}
			
			if(e.getSource() == btnAbrir)	{
				
				//instruções para abrir a janela de alterações
				
			}
			
		}
		
	}
	
	//recuperando todos os alunos
	public void setAlunos(Aluno[] alunos2) {
		this.alunos = new Aluno[alunos2.length];
		this.alunos = alunos2;
		
		this.emails = new String[alunos.length];
		this.nomes = new String[alunos.length];
		this.cursos = new String[alunos.length];
		
		for (int x = 0; x < alunos2.length; x++) {
			this.emails[x] = alunos[x].getEmail();
			this.nomes[x] = alunos[x].getNome();
			this.cursos[x] = alunos[x].getCursoDesejado();
		}
	}
	
	//carregando lista de alunos cadastrados
	public void carregarInformacoes() {
		for (int x = 0; x < getAlunos().length; x++) {
			model.addRow(new String[] {emails[x],nomes[x],cursos[x]});
		}
	}

}
