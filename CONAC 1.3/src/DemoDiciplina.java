

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
			
			
			//instruções para gerar codigo pra diciplina
			String codigoGerado = "0";
			boolean valid = true;

			while(valid)	{
				int cod = new Codigo().criarCodigo(10000);
				codigoGerado = String.valueOf(cod);
				
				try {
					if((new Codigo().verificar("bd\\diciplinas\\", codigoGerado)) == true)	{
						valid = true;
					}else	{
						valid = false;
					}
				} catch (IOException e) {
					a.setCodigo(codigoGerado);
				}
				
			}
			
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
