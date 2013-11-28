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
	
	private Diciplina diciplinasGeradas[];
	
	private String codigos[];
	private String diciplinas[];
	private String cargaHorarias[];
	
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
		
		for(int x = 0;x < diciplinasGeradas.length;x++)	{
			
			codigos[x] = new String();
			diciplinas[x] = new String();
			cargaHorarias[x] = new String();
			
			codigos[x] = this.diciplinasGeradas[x].getCodigo();
			diciplinas[x] = this.diciplinasGeradas[x].getNomeDiciplina();
			cargaHorarias[x] = this.diciplinasGeradas[x].getCargaHoraria();
		}	
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		for(int x = 0;x < diciplinasGeradas.length;x++)	{
			model.addRow(new Object[] {codigos[x],diciplinas[x],cargaHorarias[x]});
		}
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][]	{
				},
				colunas
				));
		
		
		
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
	
	
	//tratamentos de eventos do botao
	public class TratadorEventos implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String args[]) 	{
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
		}
		
		new EscolherDiciplinasJF().setVisible(true);
	}

	//recuperando lista de disciplinas
	public void setDiciplinas(Diciplina[] diciplinas) {
		this.diciplinasGeradas = diciplinas;
	}
}
