/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POO - Programação Orientada a Objetos
 * Prof. Fausto Ayres
 *
 */
package regras_negocio;
import java.util.ArrayList;

import modelo.Prateleira;
import modelo.Produto;
import repositorio.Repositorio;


public class Fachada {
	private static Repositorio repositorio = new Repositorio();
	private Fachada() {}		

	public static ArrayList<Produto> listarProdutos() {
		return repositorio.getProdutos();
	}
	public static ArrayList<Prateleira> listarPrateleiras() {
		return repositorio.getPrateleiras();
	}
	public static void criarProduto(String nome, double preco) throws  Exception{
		Produto p = repositorio.localizarProduto(nome);
		if (p!=null)
			throw new Exception("Nao criou produto - produto ja cadastrado:" + nome);

		p = new Produto(nome,preco);
		repositorio.adicionar(p);
		repositorio.salvarObjetos();
	}
	public static void criarPrateleira(double tam) throws  Exception{
		int id = repositorio.gerarId();
		Prateleira p = new Prateleira(id, tam);	
		repositorio.adicionar(p);
		repositorio.salvarObjetos();
	}
	public static void inserirProdutoPrateleira(int id, String nome) throws  Exception {	
		Prateleira pt = repositorio.localizarPrateleira (id);
		if(pt == null) 
			throw new Exception("Nao inseriu produto  - prateleira inexistente:" + id);

		Produto p = repositorio.localizarProduto(nome);
		if(p == null)
			throw new Exception("Nao inseriu produto  - produto inexistente:" + nome);

		if(p.getPrateleira() != null)
			throw new Exception("Nao inseriu produto  - produto "+nome + " ja tem prateleira:"+p.getPrateleira().getId());

		pt.adicionar(p); 	//bidirecional
		repositorio.salvarObjetos();
	}
	public static void removerProdutoPrateleira(String nome) throws Exception{
		nome = nome.trim();
		Produto p = repositorio.localizarProduto(nome);
		if(p == null)
			throw new Exception("Nao removeu produto  - produto inexistente:" + nome);

		Prateleira pt = p.getPrateleira(); //acessa a Prateleira do produto
		if(pt == null)
			throw new Exception("Nao removeu produto - produto nao tem prateleira:"+nome);

		pt.remover(p); 	//remove os dois lados
		repositorio.salvarObjetos();
	}
	public static void apagarProduto(String nome) throws Exception {
		nome = nome.trim();
		Produto p = repositorio.localizarProduto(nome);
		if (p==null)
			throw new Exception("Nao apagou produto - inexistente:"+nome);

		Prateleira pt = p.getPrateleira();
		if(pt!=null) 
			pt.remover(p); 	//remove os dois lados

		repositorio.remover(p);
		repositorio.salvarObjetos();
	}
	public static void apagarPrateleira(int id) throws Exception {
		Prateleira pt = repositorio.localizarPrateleira(id);
		if (pt==null)
			throw new Exception("Nao apagou prateleira -  inexistente:"+id);

		for (Produto p : pt.getProdutos()) {
			p.setPrateleira(null);
		}
		repositorio.remover(pt);
		repositorio.salvarObjetos();
	}
	

	/*******************************
	 *  CONSULTAS
	 *******************************/
	public static ArrayList<Prateleira> listarPrateleirasVazias(){			
		ArrayList<Prateleira> aux = new ArrayList<>();
		
		for(Prateleira pt : repositorio.getPrateleiras())
			if(pt.getTotalProdutos()==0)
				aux.add(pt);
		return aux;
	}
	public static ArrayList<Produto>  listarProdutosSemPrateleira(){		
		ArrayList<Produto> aux = new ArrayList<Produto>();
		
		for(Produto p : repositorio.getProdutos())
			if(p.getPrateleira()==null)
				aux.add(p);

		return aux;
	}

	public static ArrayList<Prateleira> listarPrateleirasNProdutos(int n) {	
		ArrayList<Prateleira> aux = new  ArrayList<Prateleira>();
		
		for(Prateleira pt : repositorio.getPrateleiras())
			if(pt.getTotalProdutos()==n)
				aux.add(pt);

		return aux;
	}

	public static Prateleira obterPrateleiraDoProduto(String nome) throws Exception{	
		Produto p = repositorio.localizarProduto(nome);
		if (p==null)
			throw new Exception("produto inexistente:"+nome);

		return p.getPrateleira();
	}

}//class
