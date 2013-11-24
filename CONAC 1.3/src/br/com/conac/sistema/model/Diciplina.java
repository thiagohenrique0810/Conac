package br.com.conac.sistema.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import br.com.conac.sistema.controler.Codigo;
import br.com.conac.sistema.dao.SalvarDados;


public class Diciplina {

	//atributos
	private String codigo;
	private String nomeDiciplina;
	private String cargaHoraria;
	private String descriçãoDaEmenta;

	//metodos
	/**
	 * @description metodo para ler o arquivo txt
	 * */
	public String getDescricaoDaEmenta() throws IOException {

		/*String arquivo = "bd\\diciplinas\\ementas\\" + getCodigo() + ".txt";//endereço do arquivo txt para ementa, que é verificada pelo codigo

		InputStream is = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(is);

		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine();

		while(s != null)	{
			this.descriçãoDaEmenta += s + "\n";
			s = br.readLine();
		}
		br.close();*/

		return descriçãoDaEmenta;
	}
	
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
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) throws IOException {
		
		//verifica se existe uma diciplina com o mesmo codigo
		if(!((new Codigo().verificar("bd\\diciplinas\\",codigo)) == true))	{
			this.codigo = codigo;
		}
	}
	
	/**
	 * @description metodo para escrever o arquivo txt
	 * */
	public void setDescricaoDaEmenta(String descricaoDaEmenta) {
		this.descriçãoDaEmenta = descricaoDaEmenta;
		
		/*SalvarDados s = new SalvarDados();
		s.salvarEmenta(descricaoDaEmenta, getCodigo());*/
	}

}
