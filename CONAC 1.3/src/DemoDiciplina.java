

import java.io.IOException;

import br.com.conac.sistema.controler.Codigo;
import br.com.conac.sistema.model.Diciplina;

public class DemoDiciplina {
	//testando a classe
		public static void main(String args[])	{
			Diciplina a = new Diciplina();
			a.setNomeDiciplina("Computação"); 
			a.setCargaHoraria("36");
			a.setDescricaoDaEmenta("esse é um teste de ementa");
			a.notas.setTipoMedia("Aritmetica");
			a.notas.setNota01(10);
			a.notas.setNota02(10);
			
			System.out.println(
				a.getCodigo() + "\n"
				+ a.getDescricaoDaEmenta() + "\n"
				+ a.getCargaHoraria() + "\n"
				+ a.getNomeDiciplina() + "\n"
				+ a.notas.getMedia() + "\n"
				+ a.notas.getSituacao()
			);

		}

}
