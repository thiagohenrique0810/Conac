package br.com.conac.sistema.DAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import br.com.conac.sistema.view.AreaDoSecretarioJF;


//***** VALIDAÇÕES QUE FALTAM *****
//instruções devem ser inseridas dentro do metodo: mostrarJanelaDeAcesso(), para verificar o tipo de usuario
//metodo verificar(), verifica se há alguem registrado com o mesmo email, logo tambem sera necessario verificar se tem o mesmo CPF



public class LoginDB {
	//atributos
	private String email;
	private String senha;

	//metodos
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getSenha() {
		return senha;
	}
	private void setSenha(char senha[]) {
		//tranformando o array de caracteres em uma unidades
		String cont = "";
		for(int x = 0; x < senha.length; x++)	{
			cont += senha[x];
		}
		this.senha = cont;
	}

	//verifica se ha ja algum usuario cadastrado
	public boolean Logar(String email,char senha[]) throws IOException	{
		boolean retorno = false;
		this.setEmail(email);
		this.setSenha(senha);

		//verifica o email na base de dados
		BufferedReader arq = new BufferedReader(new FileReader("bd\\academicos\\" + getEmail() + ".txt"));

		//valida o email e a senha na base de dados
		arq.readLine();
		if(arq.readLine().equals(this.getSenha()))	{
			retorno = true;
		}
		else 	{
			retorno = false;
		}		
		arq.close();//fecha o arquivo para nova leitura pois os readLines seguem a sequencia

		return retorno;//retorna a validação do usuario
	}
	
	//metodo para verificar se há alguem registrado com as mesmas informações
	public boolean verificar(String email)	{
		boolean retorno = false;
		this.setEmail(email);
		
		try {
			FileReader file = new FileReader("bd\\academicos\\" + this.getEmail() + ".txt");
			BufferedReader arq = new BufferedReader(file);
			
			if(arq.readLine().equals(email))	{
				retorno = true;
			}
			else	{
				retorno = false;
			}
			arq.close();
		} catch (FileNotFoundException e) {
		}catch(IOException er)	{
		}
		
		return retorno;
	}

	//mostrar janela da area de acesso do usuario
	public void mostrarJanelaDeAcesso(String email, char[] password) throws IOException {
		this.setSenha(password);
		//fazendo leitura de arquivos dentro da pasta especificada
		try {
			BufferedReader arq = new BufferedReader(new FileReader("bd/academicos/" + getEmail() + ".txt"));
			arq.readLine();
			arq.readLine();
			String tipoUsuario = arq.readLine();
			arq.close();
			//verificando o tipo de usuario
			if(tipoUsuario.equals("Secretario"))	{
				//codigo para abrir a janela do usuario secretario
				AreaDoSecretarioJF secretario = new AreaDoSecretarioJF();
				secretario.setVisible(true);
			}
			else if(tipoUsuario.equals("Professor"))	{
				//codigo para abrir a janela do usuario Professor
			}
			else if(tipoUsuario.equals("Aluno"))	{
				//codigo para abrir a janela do usuario Aluno
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Problema ao indentificar usuario");
		}
	}
}
