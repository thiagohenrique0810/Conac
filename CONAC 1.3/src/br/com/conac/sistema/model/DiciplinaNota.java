package br.com.conac.sistema.model;

public class DiciplinaNota {

	private String nota01;
	private String nota02;
	private double nota03;
	private double media;
	private String situacao;
	private String tipoMedia;

	//recebendo notas
	public String getNota01() {
		return nota01;
	}

	public void setNota01(String nota01) {
		this.nota01 = nota01;
	}

	public String getNota02() {
		return nota02;
	}

	public void setNota02(String nota02) {
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
		return ((Integer.parseInt(getNota01()) + Integer.parseInt(getNota02())) / 2);
	}

	private double getMediaFinal()	{
		return getNota03();
	}

	public void setMedia(double string) {
		this.media = string;
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
