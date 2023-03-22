// 22/03/2023 - Sobre Lista de Objetos
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import classes.Aluno;
import classes.Pilha;

public class Testes {

	public static void main(String[] args) throws Exception {
		
		// ArrayList
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<String> nomes = new ArrayList<>() ;
		ArrayList<Aluno> alunos = new ArrayList<>() ;
		
		// Método add(object)
		numeros.add(15);
		numeros.add(42);
		
		nomes.add("João");
		nomes.add("Allan");
		nomes.add("Anderson");
		
		alunos.add(new Aluno("100", "ze"));
		alunos.add(new Aluno("200", "rui"));
		
		// Método size()
		System.out.println(numeros.size()); // 2
		
		// Método get(index)
		System.out.println(nomes.get(2));
		
		// Varredura com for tradicional e foreach
		/*for (int i=0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		} */
		
		for (String nom : nomes) {
			System.out.println(nom);
		}
		
		// Varredura do aluno com matrícula 100
		for (Aluno alu: alunos)
			if(alu.getMatricula() == "100") {
				System.out.println("Aluno com a matrícula interessada: " + alu.getNome());
			break;
		}
		
		// Método remove(objeto) ou (index)
		boolean resultado = nomes.remove("João");
		System.out.println("Removeu? " + resultado + "."); // João foi removido, e os outros elemento são deslocados para o começo da lista
		
		// Método set(index, objeto)
		nomes.add("pedro");
		nomes.set(1, "cléber");
		
		// Objeto referenciado por várias listas e addAll()
		ArrayList<String> pais = new ArrayList<>();
		pais.add("joao");
		pais.add("maria");
		ArrayList<String> filhos = new ArrayList<>();
		filhos.add("pedro");
		filhos.add("paulo");
		ArrayList<String> familia = new ArrayList<>();
		familia.addAll(pais) ; //copia as referências
		familia.addAll(filhos) ; //copia as referências
		System.out.println(familia.get(0)); //joao
		System.out.println(familia.get(3)); //paulo
		System.out.println("Antes do clear: "+ filhos);
		
		// Método clear()
		pais.clear();
		filhos.clear();
		System.out.println("Depois do clear: " + filhos);
		
		// LinkedList
		LinkedList<String> nomes2 = new LinkedList<>();
		nomes2.add("joao");
		nomes2.add("maria");
		nomes2.add("jose");
		System.out.println(nomes2.get(0));
		
		// Collections
		Collections.shuffle(nomes2); // embaralha lista
		// Collections.copy(filhos, familia); // copia lista
		Collections.sort(pais); // ordena a lista
		System.out.println(nomes2);
		
		// Pilha
		System.out.println("Teste com Pilha:");
		Pilha<String> p1 = new Pilha<>();
		p1.push("joao");
		p1.push("maria");
		p1.push("jose");
		System.out.println("topo="+p1.top()); //jose
		p1.pop(); //desempilha jose
		p1.pop(); //desempilha maria
		System.out.println("topo="+p1.top());//joao
		
		try {
			Pilha<String> p2 = new Pilha<>(); //pilha vazia
			p2.pop();
			} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		// TÓPICOS ESPECIAIS
		// Copiar Referências
		// ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10,5,20,-2));

		// ArrayList<String> nomes = new ArrayList<>(Arrays.asList(arraynomes));
	}

}
