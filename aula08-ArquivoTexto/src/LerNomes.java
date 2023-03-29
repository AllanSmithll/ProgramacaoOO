/**
 *  IFPB
 *  PROF. FAUSTO MARANHAO AYRES
 *
 *	o arquivo nomes.txt esta na pasta do projeto
 */
import java.io.File;
import java.util.Scanner;

public class LerNomes{

	public static void main(String[]args) {
		Scanner arquivo=null;
		try {
			//preparar arquivo para leitura
			arquivo = new Scanner( new File("nomes.txt"));		
		}
		catch(Exception e)  {
			System.out.println("arquivo inexistente");	
			System.exit(0);		//termina o programa
		}

		String nome;
		while(arquivo.hasNextLine()) {
			nome = arquivo.nextLine(); 	
			System.out.println("lendo..."+nome);
		} 
		arquivo.close();	//fechar arquivo
		System.out.println("fim de programa");
	}	
}

