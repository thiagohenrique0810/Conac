package br.com.conac.sistema.view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import br.com.conac.sistema.dao.SalvarDados;
import br.com.conac.sistema.model.Aluno;
import br.com.conac.sistema.model.Diciplina;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class EscolherDiciplinasJF extends JFrame {

	private Container container;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnCancelar;
	private JButton btnSelecionar;
	private JButton btnSalvar;
	private boolean salvo;
	private Aluno aluno;

	public boolean getSalvo() {
		return salvo;
	}

	public void setSalvo(boolean salvo) {
		this.salvo = salvo;
	}
	private Diciplina diciplinasRecuperadas[];

	private String codigos[];
	private String diciplinas[];
	private String cargaHorarias[];

	private TratadorEventos evento;
	private ArrayList<String> linhas = new ArrayList<String>();
	private int selRows;
	private DefaultTableModel model;

	public EscolherDiciplinasJF() {
		super("Escolher as diciplinas a cursar");
		container = getContentPane();
		container.setLayout(null);

		evento = new TratadorEventos();

		JLabel lblEscolhaAsDiciplinas = new JLabel("Escolha as diciplinas a desejadas");
		lblEscolhaAsDiciplinas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEscolhaAsDiciplinas.setBounds(162, 11, 274, 34);
		container.add(lblEscolhaAsDiciplinas);		

		String colunas[] = {
				"Codigo",
				"Diciplina",
				"Carga horaria"
		};

		Object dados[][] ={};

		model = new DefaultTableModel(dados,colunas);

		table = new JTable(model);

		//tratamentos de seleção
		ListSelectionModel listMod = table.getSelectionModel();
		listMod.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		listMod.addListSelectionListener(new Selecao(table));

		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 76, 430, 324);
		container.add(scrollPane);

		btnSelecionar = new JButton("Selecionar todas");
		btnSelecionar.setBounds(450, 94, 124, 34);
		container.add(btnSelecionar);
		btnSelecionar.addActionListener(evento);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(450, 156, 124, 34);
		container.add(btnSalvar);
		btnSalvar.addActionListener(evento);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(450, 216, 124, 34);
		container.add(btnCancelar);
		btnCancelar.addActionListener(evento);

		setLocation(200, 100);
		setSize(600,450);
	}

	public void carregarInformacoes()	{
		for (int x = 0; x < diciplinasRecuperadas.length; x++) {
			model.addRow(new String[] {codigos[x],diciplinas[x],cargaHorarias[x]});
		}
	}

	//recuperando lista de disciplinas
	public void setDiciplinas(Diciplina[] d) {

		this.diciplinasRecuperadas = new Diciplina[d.length];
		this.diciplinasRecuperadas = d;

		this.codigos = new String[d.length];
		this.diciplinas = new String[d.length];
		this.cargaHorarias = new String[d.length];

		for(int x = 0;x < d.length;x++)	{
			this.codigos[x] = new String();
			this.diciplinas[x] = new String();
			this.cargaHorarias[x] = new String();

			this.codigos[x] = d[x].getCodigo();
			this.diciplinas[x] = d[x].getNomeDiciplina();
			this.cargaHorarias[x] = d[x].getCargaHoraria();
		}

	}


	//tratamentos de eventos do botao
	class Selecao implements ListSelectionListener	{
		private JTable table;

		public Selecao(JTable tb){
			this.table = tb;
		}

		public void valueChanged(ListSelectionEvent e)	{
			if(!e.getValueIsAdjusting()){        
				selRows = table.getSelectedRow();//recupera todos dados da linha

				if(selRows >= 0) {//verifica se ha mais de um dado
					model = (DefaultTableModel) table.getModel();
					//adicionando no arrayList
					linhas.add((String) model.getValueAt(selRows,0));//adicionando linha selecionada	
					//deletando linhas
					model.removeRow(selRows);	
				}				
			}			
		}
	}

	public boolean valid()	{		
		return getSalvo();
	}

	public ArrayList<String> diciplinasSelecionadas()	{
		return this.linhas;
	}

	public class TratadorEventos implements ActionListener	{
		SalvarDados salvar = new SalvarDados();
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnSalvar)	{
				try {
					salvar.salvarInformacoesAluno(getAluno(),diciplinasSelecionadas());
					salvar.notasAluno(getAluno().getCursoDesejado(),diciplinasSelecionadas(),getAluno().getEmail());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "salvo com sucesso!");
				EscolherDiciplinasJF.this.dispose();		
			}
		}
	}

	public void recuperandoAluno(Aluno aluno) {
		this.aluno = new Aluno(aluno.getNome(),aluno.getCpf());
		this.aluno = aluno;
	}
	
	public Aluno getAluno()	{
		return aluno;
	}

}