package br.com.conac.sistema.model;

public class Secretario extends Pessoa	{
	
	public Secretario(String nome, String cpf) {
		super(nome, cpf);
	}
	
	private String anoEntrada;

	public String getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(String anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
	
}
