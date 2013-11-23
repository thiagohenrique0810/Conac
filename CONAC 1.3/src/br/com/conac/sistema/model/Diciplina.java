package br.com.conac.sistema.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import br.com.conac.sistema.dao.SalvarDados;


public class Diciplina {
	
	//atributos
	private String nomeDiciplina;
	private String cargaHoraria;
	private String descriçãoDaEmenta;
	private String codigo;
	
	//metodos
	public String getNomeDiciplina() {
		return nomeDiciplina;
	}
	public void setNomeDiciplina(String nomeDiciplina) {
		this.nomeDiciplina = nomeDiciplina;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	/**
	 * @description metodo para ler o arquivo txt
	 * */
	public String getDescricaoDaEmenta() throws IOException {
		
		String arquivo = "bd\\diciplinas\\ementas\\" + this.codigo + ".txt";//endereço do arquivo txt para ementa, que é verificada pelo codigo
		
		InputStream is = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(isr);
		
		String s = br.readLine();
		
		while(s != null)	{
			this.descriçãoDaEmenta += s + "\n";
			s = br.readLine();
		}
		br.close();
		
		return descriçãoDaEmenta;
	}

	/**
	 * @description metodo para escrever o arquivo txt
	 * */
	public void setDescricaoDaEmenta(String descricaoDaEmenta) {
		
		SalvarDados s = new SalvarDados();
		
		s.salvarEmenta(descricaoDaEmenta, this.codigo);
	}
	
}
