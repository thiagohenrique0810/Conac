package br.com.conac.sistema.model;

public class DiciplinaNota {

	private double nota01;
	private double nota02;
	private double nota03;
	private double media;
	private String situacao;
	private String tipoMedia;
	private String codigo;

	//construtor
	public DiciplinaNota(String codigo)	{
		setCodigo(codigo);
	}

	//codigo
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	//recebendo notas
	public double getNota01() {
		return nota01;
	}

	public void setNota01(double nota01) {
		this.nota01 = nota01;
	}

	public double getNota02() {
		return nota02;
	}

	public void setNota02(double nota02) {
		this.nota02 = nota02;
	}

	public double getNota03() {
		return nota03;
	}

	public void setNota03(double nota03) {
		this.nota03 = nota03;
	}


	//medias
	private double getMediaAritmetica()	{
		return ((getNota01() + getNota02()) / 2);
	}

	private double getMediaFinal()	{
		return getNota03();
	}

	public void setMedia(double media) {
		this.media = media;
	}

	private double calculo()	{
		//validando o tipo da media
		if(getTipoMedia().equals("Aritmetica"))	{
			setMedia(getMediaAritmetica());
		}
		else if(getTipoMedia().equals("Final"))	{
			setMedia(getMediaFinal());
		}
		return this.media;
	}

	public double getMedia()	{
		return calculo();
	}

	private String getTipoMedia() {
		return tipoMedia;
	}

	public void setTipoMedia(String tipoMedia) {
		this.tipoMedia = tipoMedia;
	}


	//situação do aluno
	private String setSituacao() {
		if(getTipoMedia().equals("Final"))	{
			if(getMedia() < 5)	{
				this.situacao = "Reprovado!";
			}
			else	{
				this.situacao = "Aprovado no exame Final!";
			}
		}
		else if(getTipoMedia().equals("Aritmetica"))	{
			if(getMedia() < 7)	{
				this.situacao = "Reprovado!";
			}
			else	{
				this.situacao = "Aprovado por media!";
			}
		}
		return this.situacao;
	}

	public String getSituacao()	{
		return setSituacao();
	}
}
