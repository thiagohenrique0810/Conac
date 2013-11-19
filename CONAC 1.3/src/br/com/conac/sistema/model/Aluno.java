package br.com.conac.sistema.model;

public class Aluno extends Pessoa	{
	//atributos
	private String tipoPagamento;
	private String cursoDesejado;
	private String situacaoAtual;
	private String nomeDaMae;
	private String anoEntrada;
	private String anoSaida;

	//metodos
	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getCursoDesejado() {
		return cursoDesejado;
	}

	public void setCursoDesejado(String cursoDesejado) {
		this.cursoDesejado = cursoDesejado;
	}

	public String getSituacaoAtual() {
		return situacaoAtual;
	}

	public void setSituacaoAtual(String situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public String getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(String anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public String getAnoSaida() {
		return anoSaida;
	}

	public void setAnoSaida(String anoSaida) {
		this.anoSaida = anoSaida;
	}

	//construtor
	public Aluno(String tfNome, String tfFCpf) {
		super(tfNome, tfFCpf);
	}
}
