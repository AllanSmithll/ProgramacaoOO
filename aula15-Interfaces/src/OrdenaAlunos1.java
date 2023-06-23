import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// IFPB - POO 
// Prof. Fausto M Ayres
// Exemplo de uso de Interfaces e ordenação
// A classe Aluno implementa a interface Comparable<>
//


public class OrdenaAlunos1
{
	public static void main(String[] args){

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add( new Aluno(100, "joao") );
		alunos.add( new Aluno(300, "maria") );
		alunos.add( new Aluno(200, "ana") );
		alunos.add( new Aluno(400, "rui") );
		alunos.add( new Aluno(500, "paulo") );

		//embaralha
		Collections.shuffle(alunos);

		System.out.println("----antes da ordenação-----");
		for(Aluno a: alunos) 
			System.out.println(a);

		//a comparação dos objetos é feita pelo método compareTo() da classe Aluno
		Collections.sort(alunos);		//ver a classe Aluno

		
		System.out.println("\n----depois da ordenação -----");
		for(Aluno a: alunos) 
			System.out.println(a);
	}
}

