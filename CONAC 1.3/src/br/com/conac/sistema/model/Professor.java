package br.com.conac.sistema.model;

import java.util.ArrayList;

public final class Professor extends Pessoa	{
	//construtor
	public Professor(String nome, String cpf) {
		super(nome, cpf);
	}
	//atributos
	private String tituloDeCompetencia;
	private String anoEntrada;	
	private String cursoMinistrado;
	private boolean tituloGraduacao;
	private boolean tituloMestrado;
	private boolean tituloDoutorado;
	private String anoConclusaoGraduacao;
	private String anoConclusaoMestrado;
	private String anoConclusaoDoutorado;
	private ArrayList <String>diciplinas;
	
	/*
	 * nos tipos de graduação apenas tera uma String dizendo "Sim" ou "Não" para o mesmo
	 * */
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
	
	public boolean getTituloGraduacao() {
		return tituloGraduacao;
	}
	
	public void setTituloGraduacao(boolean tituloGraduacao) {
		this.tituloGraduacao = tituloGraduacao;
	}
	
	public boolean getTituloMestrado() {
		return tituloMestrado;
	}
	
	public void setTituloMestrado(boolean tituloMestrado) {
		this.tituloMestrado = tituloMestrado;
	}
	
	public boolean getTituloDoutorado() {
		return tituloDoutorado;
	}
	
	public void setTituloDoutorado(boolean tituloDoutorado) {
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
