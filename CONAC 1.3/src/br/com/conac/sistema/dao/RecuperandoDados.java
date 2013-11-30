package br.com.conac.sistema.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import br.com.conac.sistema.model.Aluno;
import br.com.conac.sistema.model.Diciplina;

public class RecuperandoDados {
	
	//metodo para recuperar todas as diciplinas especificadas
	public Diciplina[] procurarDiciplinas(String tipoCurso) throws IOException {
		File files = new File("bd\\diciplinas\\" + tipoCurso + "\\");

		//listando os nomes das diciplinas
		String arquivos[] = files.list();

		//recebendo informações de todas as diciplinas
		Diciplina diciplinas[] = new Diciplina[arquivos.length];

		//lendo arquivos e atribuindo ao array para retornar
		for(int x = 0; x < arquivos.length;x++)	{
			BufferedReader arq = new BufferedReader(new FileReader("bd\\diciplinas\\" + tipoCurso + "\\" + arquivos[x]));
			
			diciplinas[x] = new Diciplina();
			
			diciplinas[x].setCodigo(arq.readLine());
			diciplinas[x].setNomeDiciplina(arq.readLine());
			diciplinas[x].setCurso(arq.readLine());
			diciplinas[x].setCargaHoraria(arq.readLine());
			diciplinas[x].setDescricaoDaEmenta(arq.readLine());
			arq.close();
		}

		return diciplinas;
	}
	
	public Aluno recuperandoDadosAluno(String email) throws IOException	{
		//lendo arquivo
		BufferedReader arq = new BufferedReader(new FileReader("bd\\academicos\\" + email + ".txt"));
		String emailAluno = arq.readLine();
		String senha = arq.readLine();
		String tipoCadastro = arq.readLine();
		String nome = arq.readLine();
		String dataNasc = arq.readLine();
		String cpf = arq.readLine();
		String nomeMae = arq.readLine();
		String endereco = arq.readLine();
		String anoEntrada = arq.readLine();
		arq.readLine();
		String tipoPagamento = arq.readLine();
		String curso = arq.readLine();
		String situacaoAtual = arq.readLine();
		
		arq.close();//fechando arquivo
		
		//setando informações do aluno
		Aluno a = new Aluno(nome,cpf);
		a.setEmail(emailAluno);
		a.setNome(nome);
		a.setCpf(cpf);
		a.setDataDeNascimento(dataNasc);
		a.setNomeDaMae(nomeMae);
		a.setEndereco(endereco);
		a.setAnoEntrada(anoEntrada);
		a.setTipoPagamento(tipoPagamento);
		a.setCursoDesejado(curso);
		a.setSituacaoAtual(situacaoAtual);
		
		return a;
	}
	
	
	//testando a classe
	public static void main(String args[]) throws IOException	{
		RecuperandoDados r = new RecuperandoDados();
		Diciplina[] d = r.procurarDiciplinas("Computação");
		
		for (int x = 0; x < d.length; x++) {
			System.out.println(d[x].getCargaHoraria());
		}
		
	}
	
}
