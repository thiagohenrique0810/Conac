package br.com.conac.sistema.antigos;

import br.com.conac.sistema.model.Pessoa;


public class Aluno extends Pessoa	{
	
	private String nomeMae;
	private String statusPagamento;
	
	//construtor
	public Aluno(String nome, String cpf) {
		super(nome, cpf);
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	//metodos
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getStatusPagamento() {
		return statusPagamento;
	}
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

}
