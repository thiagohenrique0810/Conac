package br.com.conac.sistema.model;

import javax.swing.JTextField;

/*
 * @descrição: classe para heranças de membros academicos
 * 
 * */
public abstract class Pessoa {
	
	//atributos
	private String nome;
	private String cpf;
	private String dataDeNascimento;
	private String endereco;
	private String email;
	private String senha;
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(char password[]) {
		//tranformando o array de caracteres em uma unidade tipo String
		String cont = "";
		for(int x = 0; x < password.length; x++)	{
			cont += password[x];
		}
		this.senha = cont;
	}

	//construtor
	public Pessoa(String tfNome,String tfFCpf)	{
		this.nome = tfNome;
		this.cpf = tfFCpf;
	}
	
	//metodos
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String string) {
		this.dataDeNascimento = string;
	}
}
