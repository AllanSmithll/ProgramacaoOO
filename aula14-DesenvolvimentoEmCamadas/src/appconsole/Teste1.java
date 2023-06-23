package appconsole;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POO
 * Prof. Fausto Maranhão Ayres
 **********************************/

import java.util.ArrayList;

import modelo.Prateleira;
import modelo.Produto;
import regras_negocio.Fachada;

public class Teste1 {
	
	public Teste1() {
		cadastrar();
		alterar();
		excluir();
		listar();
		consultar();
	}
	
	public void cadastrar(){
		System.out.println("\n------------CADASTRO-----------------");
		try {	
			Fachada.criarProduto("arroz", 3.0); 	
			Fachada.criarProduto("feijao", 5.0); 	
			Fachada.criarProduto("leite", 2.0); 	
			Fachada.criarProduto("carne", 30.0); 	
			Fachada.criarProduto("oleo", 10.0); 	
			Fachada.criarPrateleira(200);		
			Fachada.criarPrateleira(300);		
			Fachada.criarPrateleira(400);		
			System.out.println("cadastro concluido");
		}
		catch (Exception e) {
			System.out.println("==>"+ e.getMessage());
		}
	}

	public void alterar(){
		System.out.println("\n------------ALTERAÇÃO-----------------");
		try{
			Fachada.inserirProdutoPrateleira(1, "arroz");
			Fachada.inserirProdutoPrateleira(1, "feijao");
			Fachada.inserirProdutoPrateleira(2, "leite");	
			Fachada.inserirProdutoPrateleira(3, "carne");	
			Fachada.removerProdutoPrateleira("carne");
			System.out.println("alteração concluida");
		}
		catch (Exception e) {
			System.out.println("==>"+ e.getMessage());
		}
	}

	public  void excluir(){
		System.out.println("\n------------EXCLUSAO-----------------");
		try {
			Fachada.apagarProduto("arroz"); 
			System.out.println("arroz apagado");
		}
		catch (Exception e) {
			System.out.println("==>"+ e.getMessage());
		}
	}

	public void listar(){
		System.out.println("\n------------LISTAGEM-----------------");
		String texto;
		ArrayList<Produto> lista1 = Fachada.listarProdutos();
		texto = "\nListagem de produtos: \n";
		if (lista1.isEmpty())
			texto += "não tem produto cadastrado\n";
		else 	
			for(Produto p: lista1) 
				texto +=  p + "\n"; 
		System.out.println(texto);
		ArrayList<Prateleira> lista2 = Fachada.listarPrateleiras();
		texto = "Listagem de prateleiras: \n";
		if (lista2.isEmpty())
			texto += "não tem prateleira cadastrada\n";
		else 
			for(Prateleira p: lista2) 
				texto +=  p + "\n"; 
		System.out.println(texto);
	}


	public void consultar(){
		System.out.println("\n------------CONSULTAS-----------------");
		ArrayList<Prateleira> lista = Fachada.listarPrateleirasVazias();
		String texto = "\n>Listagem de prateleiras vazias: \n";
		if (lista.isEmpty())
			texto += "não tem Prateleira vazia\n";
		else 	
			for(Prateleira p: lista) 
				texto +=  "id="+ p.getId() + "\n"; 					
		System.out.println(texto);

		ArrayList<Prateleira> lista2 = Fachada.listarPrateleirasNProdutos(2);
		texto = "\n>Listagem de prateleiras com 2 produtos:  \n";
		if (lista2.isEmpty())
			texto += "não tem Prateleira\n";
		else 	
			for(Prateleira p: lista2) 
				texto +=  "id="+ p.getId() + "\n"; 					
		System.out.println(texto);

		ArrayList<Produto> produtos = Fachada.listarProdutosSemPrateleira();
		System.out.println("\n>Listagem de produtos sem prateleira");
		for(Produto p: produtos)
			System.out.println(p.getNome());
	}


	//  ***********************************************
	public static void main (String[] args)   
	//  ***********************************************
	{
		new Teste1();
		
	}

}
