// IFPB - POO 
// Prof. Fausto M Ayres
// Exemplo de uso de Interfaces e ordena��o
//


public class ComparaObjetos {
	public static void main(String[] args){
		Aluno a1 = new Aluno(100, "joao") ;
		Aluno a2 = new Aluno(300, "maria") ;

		// o metodo compareTo() da classe Aluno define a forma de comparar dois alunos
		System.out.println(a1.compareTo(a2) > 0);	//a1 � maior que a2 ?
		System.out.println(a1.compareTo(a2) < 0);	//a1 � menor que a2 ?
		System.out.println(a1.compareTo(a2) == 0);	//a1 � igual a2 ?

	}
}

