package br.com.conac.sistema.model;

public class Diciplina {

	//atributos
	private String codigo;
	private String nomeDiciplina;
	private String cargaHoraria;
	private String descricaoDaEmenta;
	private String curso;

	public DiciplinaNota notas = new DiciplinaNota(this.getCodigo());	

	/**
	 * @description descrições da classe
	 * */
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
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

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void setDescricaoDaEmenta(String descricaoDaEmenta) {
		this.descricaoDaEmenta = descricaoDaEmenta;
	}
	
	public String getDescricaoDaEmenta() {
		return this.descricaoDaEmenta;
	}
}
