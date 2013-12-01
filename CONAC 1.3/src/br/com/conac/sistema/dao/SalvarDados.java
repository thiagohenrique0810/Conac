package br.com.conac.sistema.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.conac.sistema.model.Aluno;
import br.com.conac.sistema.model.Diciplina;
import br.com.conac.sistema.model.Professor;
import br.com.conac.sistema.model.Secretario;

public class SalvarDados {

	//metodo para salvar informações do aluno
	public void salvarInformacoesAluno(Aluno novoAluno, ArrayList<String> diciplinasSelecionadas) throws FileNotFoundException	{
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
			arq.println(novoAluno.getTelefone());
			arq.println(novoAluno.getAnoEntrada());
			arq.println(novoAluno.getAnoSaida());
			arq.println(novoAluno.getTipoPagamento());
			arq.println(novoAluno.getCursoDesejado());
			arq.println(novoAluno.getSituacaoAtual());
			//atribuindo diciplinas ao aluno
			for (int x = 0; x < diciplinasSelecionadas.size(); x++) {
				arq.println(diciplinasSelecionadas.get(x));
			}
			arq.close();
		} catch (IOException e) {
			//ERRO
		}
	}

	//metodo para salvar informações do professor
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
			arq.println(novoProfessor.getTelefone());
			arq.println(novoProfessor.getAnoEntrada());
			arq.println(novoProfessor.getCursoMinistrado());
			//falta completar
			arq.close();
		} catch (IOException e) {
			//ERRO
			e.printStackTrace();
		}
	}

	//metodo para salvar informações do secretario
	public void salvarInformacoesSecretario(Secretario novoSecretario) {

		FileWriter file;
		try {
			file = new FileWriter(new File("bd\\academicos\\" + novoSecretario.getEmail() + ".txt"),true);
			PrintWriter arq = new PrintWriter(file);

			arq.println(novoSecretario.getEmail());
			arq.println(novoSecretario.getSenha());
			arq.println("Secretario");
			arq.println(novoSecretario.getNome());
			arq.println(novoSecretario.getDataDeNascimento());
			arq.println(novoSecretario.getCpf());
			arq.println(novoSecretario.getEndereco());
			arq.println(novoSecretario.getTelefone());
			arq.println(novoSecretario.getAnoEntrada());
			//falta completar
			arq.close();
		} catch (IOException e) {
			//ERRO
			e.printStackTrace();
		}
	}

	//metodo para salvar informações do disciplina
	public void salvarDiciplina(Diciplina diciplina) {

		FileWriter file;
		try {
			file = new FileWriter(new File("bd\\diciplinas\\" + diciplina.getCurso() + "\\" + diciplina.getCodigo() + ".txt"),true);
			PrintWriter arq = new PrintWriter(file);

			arq.println(diciplina.getCodigo());
			arq.println(diciplina.getNomeDiciplina());
			arq.println(diciplina.getCurso());
			arq.println(diciplina.getCargaHoraria());
			arq.println(diciplina.getDescricaoDaEmenta());
			arq.close();

			JOptionPane.showMessageDialog(null, "Diciplina salva com sucesso!");
		} catch (IOException e) {
			//ERRO
			e.printStackTrace();
		}

	}


}