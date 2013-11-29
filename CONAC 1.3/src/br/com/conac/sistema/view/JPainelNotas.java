package br.com.conac.sistema.view;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.table.TableCellRenderer;

public class JPainelNotas extends JPanel	{
	
	private JPanel panel;
	
	private TratadorEventos evento;
	private JTable table;
	private JTextField tfnota01;
	private JTextField tfnota02;
	private JTextField tfnotafinal;
	private JTextField tfmedia;

	private JScrollPane scroll;

	private String colunas[];

	private String[][] dados;

	public JPainelNotas()	{
		
		panel = new JPanel();		
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Situação do semestre"));
		panel.setBounds(10, 11, 761, 390);
		add(panel);
		panel.setLayout(null);
		
		
		JLabel lblDiciplinas = new JLabel("Diciplinas:");
		lblDiciplinas.setForeground(new Color(0, 128, 128));
		lblDiciplinas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiciplinas.setBounds(26, 22, 86, 31);
		panel .add(lblDiciplinas);
		
		
		/* trabalhando a tabela */
		colunas = new String[] {
			"Codigo",
			"Diciplina",
			"Situação"
		};
		dados = new String[][] {
				{
					"00001","Programação orientada a objetos","APROVADO"
				},
				{
					"00002","Filosofia e etica","APROVADO"
				},
				{
					"00003","Matematica I","RECUPERAÇÃO"
				},
				{
					"00004","Laboratorio de programação","REPROVADO"
				},
				{
					"00005","Programação orientada a objetos","APROVADO"
				},
				{
					"00006","Filosofia e etica","APROVADO"
				},
				{
					"00007","Matematica II","RECUPERAÇÃO"
				},
				{
					"00008","Comportamento organizacional","REPROVADO"
				},
				{
					"00009","Estatistica","APROVADO"
				},
				{
					"00010","Ciências sociais e politicas","APROVADO"
				},
				{
					"00011","Matematica II","RECUPERAÇÃO"
				},
				{
					"00012","Laboratorio de programação","REPROVADO"
				}
		};
		
		
		table = new JTable(dados,colunas)	{
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
		//metodos para compreenção
		//table.setPreferredScrollableViewportSize(new Dimension(296, 184));//configurando suas dimenções da tabela
		//table.setFillsViewportHeight(true);//adapta-se ao scroll
		
		scroll = new JScrollPane(table);
		scroll.setBounds(26, 76, 362, 184);
		panel.add(scroll);

		JLabel lblNewLabel = new JLabel("Nota 01:");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(412, 105, 103, 31);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nota 02:");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(412, 158, 103, 31);
		panel.add(lblNewLabel_1);

		JLabel lblNotaDaFinal = new JLabel("Nota da Final:");
		lblNotaDaFinal.setForeground(new Color(255, 140, 0));
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

		JButton btnVerNotas = new JButton("Ver notas");
		btnVerNotas.setIcon(new ImageIcon(JPainelNotas.class.getResource("/imgs/iconbook.fw.png")));
		btnVerNotas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVerNotas.setBounds(230, 334, 312, 45);
		panel.add(btnVerNotas);
		
		JLabel lblSelecioneUmaDiciplina = new JLabel("Selecione uma diciplina e veja sua nota");
		lblSelecioneUmaDiciplina.setBounds(26, 60, 199, 14);
		panel.add(lblSelecioneUmaDiciplina);
		
	}
	
	public class TratadorEventos implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}