package br.com.conac.sistema.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import br.com.conac.sistema.dao.RecuperandoDados;
import br.com.conac.sistema.model.Diciplina;
import br.com.conac.sistema.model.DiciplinaNota;

public class PainelConfigNotas extends JPanel {
	private JPanel panel;
	private JButton btnVerNotas;
	private JTextField tfmedia;
	private JTextField tfnotafinal;
	private JTextField tfnota02;
	private JTextField tfnota01;
	private JScrollPane scroll;
	private JTable table;
	private Object[][] dados;
	private String[] colunas;
	private String email;
	private Diciplina diciplinas[];
	private DefaultTableModel model;
	
	private String codigos[];
	private String nomeDiciplinas[];
	private String cargaHoraria[];
	private JButton btnAlterarNotas;
	private JButton btnSalvarAlteraes;

	/**
	 * Create the panel.
	 */
	public PainelConfigNotas() {
		panel = new JPanel();
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Atualização de notas"));
		panel.setBounds(0, 0, 761, 405);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblDiciplinas = new JLabel("Diciplinas:");
		lblDiciplinas.setForeground(new Color(255, 69, 0));
		lblDiciplinas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiciplinas.setBounds(26, 22, 86, 31);
		panel .add(lblDiciplinas);
		
		
		colunas = new String[] {
			"Codigo",
			"Diciplina",
			"Situação"
		};
		dados = new String[][] {
		};
		
		model = new DefaultTableModel(dados,colunas);
		table = new JTable(model)	{
			//desabilitando a edição
			public boolean isCellEditable(int dados,int colunas)	{
				return false;
			}
			
			//mudando as cores das colunas e linhas
			public Component prepareRenderer(TableCellRenderer r, int dados, int colunas)	{
				Component c = super.prepareRenderer(r, dados, colunas);
				
				//zebrando a tabela
				if(dados % 2 == 0)	{
					c.setBackground(Color.LIGHT_GRAY);
				}
				else	{
					c.setBackground(Color.WHITE);
				}
				
				if(isCellSelected(dados,colunas))	{
					c.setBackground(new Color(0, 128, 128));//cores em RGB
				}
				
				return c;
			}
		};
		
		scroll = new JScrollPane(table);
		scroll.setBounds(26, 76, 362, 184);
		panel.add(scroll);

		JLabel lblNewLabel = new JLabel("Nota 01:");
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(412, 105, 103, 31);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nota 02:");
		lblNewLabel_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(412, 158, 103, 31);
		panel.add(lblNewLabel_1);

		JLabel lblNotaDaFinal = new JLabel("Nota da Final:");
		lblNotaDaFinal.setForeground(new Color(255, 0, 0));
		lblNotaDaFinal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNotaDaFinal.setBounds(412, 211, 103, 31);
		panel.add(lblNotaDaFinal);

		tfnota01 = new JTextField();
		tfnota01.setBackground(Color.WHITE);
		tfnota01.setEditable(false);
		tfnota01.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfnota01.setBounds(531, 105, 86, 27);
		panel.add(tfnota01);
		tfnota01.setColumns(10);

		tfnota02 = new JTextField();
		tfnota02.setBackground(Color.WHITE);
		tfnota02.setEditable(false);
		tfnota02.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfnota02.setBounds(531, 158, 86, 27);
		panel.add(tfnota02);
		tfnota02.setColumns(10);

		tfnotafinal = new JTextField();
		tfnotafinal.setBackground(Color.WHITE);
		tfnotafinal.setEditable(false);
		tfnotafinal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfnotafinal.setBounds(531, 211, 86, 27);
		panel.add(tfnotafinal);
		tfnotafinal.setColumns(10);

		JLabel lblMdia = new JLabel("M\u00E9dia:");
		lblMdia.setForeground(new Color(0, 0, 255));
		lblMdia.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblMdia.setBounds(654, 117, 68, 31);
		panel.add(lblMdia);

		tfmedia = new JTextField();
		tfmedia.setBackground(Color.WHITE);
		tfmedia.setEditable(false);
		tfmedia.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tfmedia.setBounds(641, 159, 110, 45);
		panel.add(tfmedia);
		tfmedia.setColumns(10);

		btnVerNotas = new JButton("Ver notas");
		btnVerNotas.setIcon(new ImageIcon(JPainelNotas.class.getResource("/imgs/iconbook.fw.png")));
		btnVerNotas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVerNotas.setBounds(37, 335, 230, 45);
		panel.add(btnVerNotas);
		
		JLabel lblSelecioneUmaDiciplina = new JLabel("Selecione uma diciplina e veja sua nota");
		lblSelecioneUmaDiciplina.setBounds(26, 60, 199, 14);
		panel.add(lblSelecioneUmaDiciplina);
		
		btnAlterarNotas = new JButton("Alterar notas");
		btnAlterarNotas.setIcon(new ImageIcon(PainelConfigNotas.class.getResource("/imgs/iconedit.fw.png")));
		btnAlterarNotas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAlterarNotas.setBounds(288, 335, 199, 45);
		panel.add(btnAlterarNotas);
		
		btnSalvarAlteraes = new JButton("Salvar altera\u00E7\u00F5es");
		btnSalvarAlteraes.setIcon(new ImageIcon(PainelConfigNotas.class.getResource("/imgs/iconok.fw.png")));
		btnSalvarAlteraes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSalvarAlteraes.setBounds(510, 335, 199, 45);
		panel.add(btnSalvarAlteraes);
		
		setSize(761, 405);
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	//carregando diciplinas do aluno
	public void carregarDiciplinas() {
		//instruções para carregar as diciplinas
		for (int x = 0; x < getDiciplinas().length; x++) {
			model.addRow(new String[] {codigos[x],nomeDiciplinas[x],cargaHoraria[x]});
		}
	}

	public Diciplina[] getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(Diciplina[] diciplinas) {
		this.diciplinas = new Diciplina[diciplinas.length];
		this.diciplinas = diciplinas;
		
		codigos = new String[diciplinas.length];
		nomeDiciplinas = new String[diciplinas.length];
		cargaHoraria = new String[diciplinas.length];
		
		for (int x = 0; x < diciplinas.length; x++) {
			codigos[x] = diciplinas[x].getCodigo();
			nomeDiciplinas[x] = diciplinas[x].getNomeDiciplina();
			cargaHoraria[x] = diciplinas[x].getCargaHoraria();
		}
	}
	
	//tratamento de seleção
	public class TratadorEventos implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnAlterarNotas)	{
				//instruções para fazer alterações
				
			}
			
			if(e.getSource() == btnSalvarAlteraes)	{
				//instruções para salvar as alterações
			}
			
			if(e.getSource() == btnVerNotas)	{
				//instruções para abrir a janela de alterações
				int linhaSelecionada = table.getSelectedRow();
				String codigo = (String) model.getValueAt(linhaSelecionada, 0);
				RecuperandoDados r = new RecuperandoDados();
				DiciplinaNota nota = null;
				
			
					try {
						nota = r.recuperandoNotas(codigo, getEmail());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
				tfnota01.setText(nota.getNota01());
				tfnota02.setText(nota.getNota02());
			}
		}
	}
}
