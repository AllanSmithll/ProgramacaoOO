package appconsole;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POO
 * Prof. Fausto Maranhão Ayres
 **********************************/

import regras_negocio.Fachada;

public class Teste2 {

	public static void main (String[] args)  {
		
		System.out.println("\n------------Teste das exceções-----------------");
		try {
			Fachada.criarProduto("teste1", 10.0); //exceção
			Fachada.criarProduto("teste1", 10.0); //exceção
			System.out.println("teste 1: nao gerou exceção");
		}catch (Exception e) {
			System.out.println("1ok==>"+ e.getMessage());
		}
		try {
			Fachada.criarProduto("teste2", 1.0);
			Fachada.inserirProdutoPrateleira(2, "teste2");	
			Fachada.inserirProdutoPrateleira(2, "teste2");	//exceção
			System.out.println("teste 2:  nao gerou exceção");
		}catch (Exception e) {
			System.out.println("2ok==>"+ e.getMessage());
		}
		try {
			Fachada.criarProduto("teste3", 5.0); 
			Fachada.inserirProdutoPrateleira(2, "teste3");	
			Fachada.removerProdutoPrateleira("teste3");	
			Fachada.removerProdutoPrateleira("teste3");	//exceção
			System.out.println("teste 3:  nao gerou exceção");
		}catch (Exception e) {
			System.out.println("3ok==>"+ e.getMessage());
		}
		try {
			Fachada.criarProduto("teste4", 5.0); 
			Fachada.apagarProduto("teste4");	
			Fachada.apagarProduto("teste4");	//exceção
			System.out.println("teste 4:  nao gerou exceção");
		}catch (Exception e) {
			System.out.println("4ok==>"+ e.getMessage());
		}
	}
}
