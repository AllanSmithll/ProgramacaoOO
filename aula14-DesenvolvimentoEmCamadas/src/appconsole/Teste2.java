package appconsole;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POO
 * Prof. Fausto Maranh�o Ayres
 **********************************/

import regras_negocio.Fachada;

public class Teste2 {

	public static void main (String[] args)  {
		
		System.out.println("\n------------Teste das exce��es-----------------");
		try {
			Fachada.criarProduto("teste1", 10.0); //exce��o
			Fachada.criarProduto("teste1", 10.0); //exce��o
			System.out.println("teste 1: nao gerou exce��o");
		}catch (Exception e) {
			System.out.println("1ok==>"+ e.getMessage());
		}
		try {
			Fachada.criarProduto("teste2", 1.0);
			Fachada.inserirProdutoPrateleira(2, "teste2");	
			Fachada.inserirProdutoPrateleira(2, "teste2");	//exce��o
			System.out.println("teste 2:  nao gerou exce��o");
		}catch (Exception e) {
			System.out.println("2ok==>"+ e.getMessage());
		}
		try {
			Fachada.criarProduto("teste3", 5.0); 
			Fachada.inserirProdutoPrateleira(2, "teste3");	
			Fachada.removerProdutoPrateleira("teste3");	
			Fachada.removerProdutoPrateleira("teste3");	//exce��o
			System.out.println("teste 3:  nao gerou exce��o");
		}catch (Exception e) {
			System.out.println("3ok==>"+ e.getMessage());
		}
		try {
			Fachada.criarProduto("teste4", 5.0); 
			Fachada.apagarProduto("teste4");	
			Fachada.apagarProduto("teste4");	//exce��o
			System.out.println("teste 4:  nao gerou exce��o");
		}catch (Exception e) {
			System.out.println("4ok==>"+ e.getMessage());
		}
	}
}
