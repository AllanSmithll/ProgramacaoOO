// IFPB - POO 
// Prof. Fausto M Ayres
// Exemplo de uso da interface Comparable
//
public class Aluno implements Comparable<Aluno>	{	//interface Comparable<T>
	private int matricula;
	private String nome;

	public Aluno(int m, String n){
		matricula=m;
		nome=n;
	}

	public int getMatricula(){
		return matricula;
	}
	public String getNome(){
		return nome;
	}

	//	public int compareTo(Aluno outro) {
	//		System.out.println("==>compareTo(): "+this.matricula + "/"+outro.matricula);
	//		if (this.matricula < outro.matricula)  
	//			return  -1;
	//		else 
	//			if (this.matricula > outro.matricula)  
	//				return  1;
	//			else 
	//				return 0;
	//	}

	public int compareTo(Aluno outro) {
		System.out.println("==>compareTo:"+this.nome+ "/"+outro.nome);
		return  this.nome.compareTo(outro.nome);

	}



	public String toString(){
		return "matricula: " + matricula + ", nome: " + nome;
	}
}