import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// IFPB - POO 
// Prof. Fausto M Ayres
// Exemplo de uso de classe anonima, a prtir da interface Comparator<>
//


public class OrdenaAlunos2
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

		//sort() chama compare() da interface Comparator, o qual é implementado na classe anonima,  
		Collections.sort(alunos, new Comparator<Aluno>() {
			public int compare(Aluno a1, Aluno a2) {
				int mat1 = a1.getMatricula();
				int mat2 = a2.getMatricula();
				return Integer.compare(mat1,mat2)  ;
			}
		});
//		Collections.sort(alunos, new Comparator<Aluno>() {
//			public int compare(Aluno a1, Aluno a2) {
//				return a1.getNome().compareTo(a2.getNome())  ;
//			}
//		});
		
		System.out.println("\n----depois da ordenação por matricula-----");
		for(Aluno a: alunos) 
			System.out.println(a);


		//outra implementação do compare()
		Collections.sort(alunos, new Comparator<Aluno>() {
			public int compare(Aluno a1, Aluno a2) {
				return a1.getNome().compareTo(a2.getNome())  ;
			}
		});

		System.out.println("\n----depois da ordenação por nome-----");
		for(Aluno a: alunos) 
			System.out.println(a);

	}
}

