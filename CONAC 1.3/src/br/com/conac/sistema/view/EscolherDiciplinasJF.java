package br.com.conac.sistema.view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import br.com.conac.sistema.model.Diciplina;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EscolherDiciplinasJF extends JFrame {

	private Container container;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnCancelar;
	private JButton btnSelecionar;
	private JButton btnSalvar;
	
	private Diciplina diciplinasRecuperadas[];
	
	private String codigos[];
	private String diciplinas[];
	private String cargaHorarias[];
	
	private DefaultTableModel model;

	public EscolherDiciplinasJF() {
		super("Escolher as diciplinas a cursar");
		container = getContentPane();
		container.setLayout(null);

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

		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 76, 430, 324);
		container.add(scrollPane);

		btnSelecionar = new JButton("Selecionar todas");
		btnSelecionar.setBounds(450, 94, 124, 34);
		container.add(btnSelecionar);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(450, 156, 124, 34);
		container.add(btnSalvar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(450, 216, 124, 34);
		container.add(btnCancelar);

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
	public class TratadorEventos implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub	
		}
	}

}
