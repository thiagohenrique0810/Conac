/**
 * @author Thiago Henrique,  Ygor Johason
 * @description Sistema de gerenciamento de alunos, professores e secretarios.
 * */

import javax.swing.JFrame;
import br.com.conac.sistema.view.LoginJF;

public class Start {
	public static void main(String args[])	{
		/**
		 * @descri��o para verificar se ha algum secretario cadastrado
		 * @demo
		 */
		//codigo aqui!!!
		
		/**
		 * @descri��o abre janela de acesso 
		 */
		LoginJF l = new LoginJF();
		l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
