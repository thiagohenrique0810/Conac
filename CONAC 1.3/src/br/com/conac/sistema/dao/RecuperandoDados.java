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
	
	//metodo para recuperar todas as diciplinas especificadas
		public Aluno[] procurarAlunos() throws IOException {
			File files = new File("bd\\academicos\\");

			//listando os nomes dos alunos
			String arquivos[] = files.list();

			//recebendo informações de todos os alunos
			Aluno alunos[] = new Aluno[arquivos.length];

			//lendo arquivos e atribuindo ao array para retornar
			for(int x = 0; x < arquivos.length;x++)	{
				//lendo arquivo
				BufferedReader arq = new BufferedReader(new FileReader("bd\\academicos\\" + arquivos[x]));
				String emailAluno = arq.readLine();
				String senha = arq.readLine();
				String tipoCadastro = arq.readLine();
				String nome = arq.readLine();
				String dataNasc = arq.readLine();
				String cpf = arq.readLine();
				String nomeMae = arq.readLine();
				String endereco = arq.readLine();
				String telefone = arq.readLine();
				String anoEntrada = arq.readLine();
				arq.readLine();
				String tipoPagamento = arq.readLine();
				String curso = arq.readLine();
				String situacaoAtual = arq.readLine();
				
				arq.close();//fechando arquivo
				
				//setando informações do aluno
				alunos[x] = new Aluno(nome,cpf);
				alunos[x].setEmail(emailAluno);
				alunos[x].setNome(nome);
				alunos[x].setCpf(cpf);
				alunos[x].setDataDeNascimento(dataNasc);
				alunos[x].setNomeDaMae(nomeMae);
				alunos[x].setEndereco(endereco);
				alunos[x].setTelefone(telefone);
				alunos[x].setAnoEntrada(anoEntrada);
				alunos[x].setTipoPagamento(tipoPagamento);
				alunos[x].setCursoDesejado(curso);
				alunos[x].setSituacaoAtual(situacaoAtual);
			}
			//retornando informações dos alunos
			return alunos;
		}
	
	//recuperando informações do aluno
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
		String telefone = arq.readLine();
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
		a.setTelefone(telefone);
		a.setAnoEntrada(anoEntrada);
		a.setTipoPagamento(tipoPagamento);
		a.setCursoDesejado(curso);
		a.setSituacaoAtual(situacaoAtual);
		
		return a;//retornando objeto
	}
	
	
	//testando a classe
	public static void main(String args[]) throws IOException	{
		RecuperandoDados r = new RecuperandoDados();
		
		Aluno a = new Aluno(r.recuperandoDadosAluno("fulanodetal@hotmail.com").getNome(),r.recuperandoDadosAluno("fulanodetal@hotmail.com").getCpf());
		System.out.println(a.getNome() + "\n" + a.getCpf() + "\n" + a.getCursoDesejado());
	}
	
}
