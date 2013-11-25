import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.com.conac.sistema.view.LoginJF;

/**
 * @author Thiago Henrique,  Ygor Johason
 * @description Sistema de gerenciamento de alunos, professores e secretarios.
 * */


public class Start {
	public static void main(String args[])	{
	 /*
	 * @descrição para verificar se ha algum secretario cadastrado
	 */
		//codigo aqui!!!

	  /*
	   @descrição abre janela de acesso 
	  */
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			//LOG.error(e.getMessage());
		}
		LoginJF l = new LoginJF();
		l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
