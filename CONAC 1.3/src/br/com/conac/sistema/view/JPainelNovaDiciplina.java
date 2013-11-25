package br.com.conac.sistema.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.conac.sistema.controler.Codigo;
import br.com.conac.sistema.dao.SalvarDados;
import br.com.conac.sistema.model.Diciplina;

public class JPainelNovaDiciplina extends JPanel	{


	private JPanel panel;
	private JTextField tfNome;
	private JTextField tfCurso;
	private JTextField tfCargaHoraria;
	private JTextField tfCodigo;

	private TratadorEventos eventos;
	private TextArea textArea;
	private JButton btnCancelar;
	private JButton btnLimparCampos;
	private JButton btnSalvar;

	public JPainelNovaDiciplina()	{
		panel = new JPanel();
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Cadastro de novas diciplinas"));
		panel.setBounds(2, 11, 755, 394);
		add(panel);
		panel.setLayout(null);

		eventos = new TratadorEventos();

		JLabel lblNomeDaDiciplina = new JLabel("Nome da diciplina:");
		lblNomeDaDiciplina.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeDaDiciplina.setBounds(10, 48, 123, 25);
		panel.add(lblNomeDaDiciplina);

		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfNome.setBounds(139, 48, 328, 25);
		panel.add(tfNome);
		tfNome.setColumns(10);		

		JLabel lblCursoDiciplinar = new JLabel("Curso diciplinar:");
		lblCursoDiciplinar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCursoDiciplinar.setBounds(10, 152, 123, 25);
		panel.add(lblCursoDiciplinar);

		tfCurso = new JTextField();
		tfCurso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfCurso.setBounds(139, 152, 328, 25);
		panel.add(tfCurso);
		tfCurso.setColumns(10);

		JLabel lblCargaHoraria = new JLabel("Carga horaria:");
		lblCargaHoraria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCargaHoraria.setBounds(10, 256, 123, 25);
		panel.add(lblCargaHoraria);

		tfCargaHoraria = new JTextField();
		tfCargaHoraria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfCargaHoraria.setBounds(139, 256, 77, 25);
		panel.add(tfCargaHoraria);
		tfCargaHoraria.setColumns(10);

		JLabel lblDescrioDaEmenta = new JLabel("Descri\u00E7\u00E3o da ementa:");
		lblDescrioDaEmenta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescrioDaEmenta.setBounds(542, 44, 138, 25);
		panel.add(lblDescrioDaEmenta);

		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(275, 256, 77, 25);
		panel.add(lblCodigo);

		tfCodigo = new JTextField();
		tfCodigo.setForeground(Color.BLUE);
		tfCodigo.setFont(new Font("Tahoma", Font.BOLD, 17));
		tfCodigo.setBackground(Color.WHITE);
		tfCodigo.setEnabled(false);
		tfCodigo.setBounds(362, 256, 105, 25);
		panel.add(tfCodigo);
		tfCodigo.setColumns(10);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSalvar.setBounds(139, 340, 132, 43);
		panel.add(btnSalvar);
		btnSalvar.addActionListener(eventos);

		btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimparCampos.setBounds(300, 340, 148, 42);
		panel.add(btnLimparCampos);
		btnLimparCampos.addActionListener(eventos);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar.setBounds(479, 340, 132, 43);
		panel.add(btnCancelar);
		btnCancelar.addActionListener(eventos);

		textArea = new TextArea();
		textArea.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textArea.setBounds(489, 75, 256, 206);
		panel.add(textArea);
		
		
		String cod = "";
		try {
			cod = new Codigo().gerarCodigo("bd\\diciplinas\\", 100000);
			tfCodigo.setText(cod);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public class TratadorEventos implements ActionListener	{
		@Override
		public void actionPerformed(ActionEvent e) {
					
			if(e.getSource() == btnSalvar)	{
				//instruções para salvar as informações das diciplinas
				new SalvarDados().salvarDiciplina(getInfomacoes());			
			}

			//botao limpar campos
			if(e.getSource() == btnLimparCampos)	{
				tfNome.setText("");
				tfCurso.setText("");
				tfCargaHoraria.setText("");
			}

			//botão cancelar
			if(e.getSource() == btnCancelar)	{
				//instruções para fechar a janela
			}

		}		
	}
	
	//recuperando informações dos campos
	public Diciplina getInfomacoes()	{
		Diciplina d = new Diciplina();
		
		d.setNomeDiciplina(tfNome.getText());
		d.setCurso(tfCurso.getText());
		d.setCodigo(tfCodigo.getText());
		d.setCargaHoraria(tfCargaHoraria.getText());
		d.setDescricaoDaEmenta(textArea.getText());
		
		return d;
	}
}
