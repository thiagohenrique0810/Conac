package br.com.conac.sistema.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.conac.sistema.model.Aluno;
import br.com.conac.sistema.model.Professor;

public class SalvarDados {
	
	//metodo para salvar informações do aluno
	public void salvarInformacoesAluno(Aluno novoAluno) throws FileNotFoundException{
		FileWriter file;
		try {
			file = new FileWriter(new File("bd\\academicos\\" + novoAluno.getEmail() + ".txt"),true);
			PrintWriter arq = new PrintWriter(file);
			
			arq.println(novoAluno.getEmail());
			arq.println(novoAluno.getSenha());
			arq.println("Aluno");
			arq.println(novoAluno.getNome());
			arq.println(novoAluno.getDataDeNascimento());
			arq.println(novoAluno.getCpf());
			arq.println(novoAluno.getNomeDaMae());
			arq.println(novoAluno.getEndereco());
			arq.println(novoAluno.getAnoEntrada());
			arq.println(novoAluno.getAnoSaida());
			arq.println(novoAluno.getTipoPagamento());
			arq.println(novoAluno.getCursoDesejado());
			arq.println(novoAluno.getSituacaoAtual());
			arq.close();
		} catch (IOException e) {
			//ERRO
			e.printStackTrace();
		}
	}
	
	public void salvarInformacoesProfessor(Professor novoProfessor)	throws FileNotFoundException	{
		FileWriter file;
		try {
			file = new FileWriter(new File("bd\\academicos\\" + novoProfessor.getEmail() + ".txt"),true);
			PrintWriter arq = new PrintWriter(file);
			
			arq.println(novoProfessor.getEmail());
			arq.println(novoProfessor.getSenha());
			arq.println("Professor");
			arq.println(novoProfessor.getNome());
			arq.println(novoProfessor.getDataDeNascimento());
			arq.println(novoProfessor.getCpf());
			arq.println(novoProfessor.getEndereco());
			arq.println(novoProfessor.getAnoEntrada());
			//falta completar
			arq.close();
		} catch (IOException e) {
			//ERRO
			e.printStackTrace();
		}
	}
}
