package br.com.conac.sistema.model;

import java.util.ArrayList;

public class Professor extends Pessoa	{
	//construtor
	public Professor(String nome, String cpf) {
		super(nome, cpf);
	}
	//atributos
	private String tituloDeCompetencia;
	private String anoEntrada;
	private String cursoMinistrado;
	private String tituloGraduacao;
	private String tituloMestrado;
	private String tituloDoutorado;
	private String anoConclusaoGraduacao;
	private String anoConclusaoMestrado;
	private String anoConclusaoDoutorado;
	private ArrayList <String>diciplinas;
	
	
	//metodos de config
	public String getTituloDeCompetencia() {
		return tituloDeCompetencia;
	}
	public void setTituloDeCompetencia(String tituloDeCompetencia) {
		this.tituloDeCompetencia = tituloDeCompetencia;
	}
	public String getAnoEntrada() {
		return anoEntrada;
	}
	public void setAnoEntrada(String anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
	public String getCursoMinistrado() {
		return cursoMinistrado;
	}
	public void setCursoMinistrado(String cursoMinistrado) {
		this.cursoMinistrado = cursoMinistrado;
	}
	public String getTituloGraduacao() {
		return tituloGraduacao;
	}
	public void setTituloGraduacao(String tituloGraduacao) {
		this.tituloGraduacao = tituloGraduacao;
	}
	public String getTituloMestrado() {
		return tituloMestrado;
	}
	public void setTituloMestrado(String tituloMestrado) {
		this.tituloMestrado = tituloMestrado;
	}
	public String getTituloDoutorado() {
		return tituloDoutorado;
	}
	public void setTituloDoutorado(String tituloDoutorado) {
		this.tituloDoutorado = tituloDoutorado;
	}
	public String getAnoConclusaoGraduacao() {
		return anoConclusaoGraduacao;
	}
	public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
		this.anoConclusaoGraduacao = anoConclusaoGraduacao;
	}
	public String getAnoConclusaoMestrado() {
		return anoConclusaoMestrado;
	}
	public void setAnoConclusaoMestrado(String anoConclusaoMestrado) {
		this.anoConclusaoMestrado = anoConclusaoMestrado;
	}
	public String getAnoConclusaoDoutorado() {
		return anoConclusaoDoutorado;
	}
	public void setAnoConclusaoDoutorado(String anoConclusaoDoutorado) {
		this.anoConclusaoDoutorado = anoConclusaoDoutorado;
	}
	public ArrayList<String> getDiciplinas() {
		return diciplinas;
	}
	public void setDiciplinas(ArrayList<String> diciplinas) {
		this.diciplinas = diciplinas;
	}
}
