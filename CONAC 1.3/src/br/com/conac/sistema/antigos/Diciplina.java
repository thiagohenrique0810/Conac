package br.com.conac.sistema.antigos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Diciplina {
	
	//atributos
	private String nomeDiciplina;
	private String cargaHoraria;
	private String descri��oDaEmenta;
	private Codigo codigo;//cria um novo codigo aleatorio
	
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
	public String getDescri��oDaEmenta() throws IOException {
		String arquivo = "";//endere�o do arquivo txt
		InputStream is = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		
		while(s != null)	{
			this.descri��oDaEmenta += s + "\n";
			s = br.readLine();
		}
		br.close();
		return descri��oDaEmenta;
	}

	/**
	 * @description metodo para escrever o arquivo txt
	 * */
	public void setDescri��oDaEmenta(String descri��oDaEmenta) {
		this.descri��oDaEmenta = descri��oDaEmenta;
	}
	
}
