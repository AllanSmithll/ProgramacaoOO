/**
 *  IFPB
 *  PROF. FAUSTO MARANHAO AYRES
 *  
 *  Os arquivos .csv  estao na pasta deste projeto
 *  
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerAlunos{
	public static void main(String[]args) {
		Scanner arquivo1=null;
		try{
			arquivo1 = new Scanner( new File("alunos.csv"));
		}
		catch(FileNotFoundException e){
			System.out.println("arquivo inexistente");
			System.exit(0);
		}

		String aluno, cabecalho;	//armazena um aluno lido do arquivo
		String[] partes;			//partes extraidas de um aluno
		String nome, sexo;
		int nota1, nota2;
		long media;

		cabecalho = arquivo1.nextLine();			//ler e descartar primeira linha do arquivo 

		while(arquivo1.hasNextLine()) {
			aluno = arquivo1.nextLine();			//ler dados de um aluno  
			partes = aluno.split(";");				//campo nome 
			nota1 = Integer.parseInt(partes[1]);				//extrair os campos do aluno que estao separados por ;
			nome = 	partes[0];		//conversao para inteiro
			nota2 = Integer.parseInt(partes[2]);		//conversao para inteiro
			sexo = 	partes[3];						//campo sexo 

			media = Math.round( ((double)nota1+nota2) /2);
			System.out.println("==> nome:"+nome+"  media:" + media) ;

		} //fim do while
		arquivo1.close();			//fechar arquivo

		System.out.println("ver arquivos gravados na pasta do projeto: aprovados.csv e reprovados.csv");
		System.out.println("fim de programa");

	}    
}