
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programa��o Orientada a Objetos
 * Prof. Fausto Maranh�o Ayres
 **********************************/
package repositorio;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Prateleira;
import modelo.Produto;

public class Repositorio {
	private ArrayList<Produto> produtos = new ArrayList<>();
	private ArrayList<Prateleira> prateleiras = new ArrayList<>();

	public Repositorio() {
		carregarObjetos();		//ler dados dos arquivos
	}
	public void adicionar(Produto p){
		produtos.add(p);
	}
	public void remover(Produto p){
		produtos.remove(p);
	}
	public Produto localizarProduto(String nome){
		for(Produto p : produtos){
			if(p.getNome().equals(nome))
				return p;
		}
		return null;
	}
	public void adicionar(Prateleira p){
		prateleiras.add(p);
	}
	public void remover(Prateleira p){
		prateleiras.remove(p);
	}
	public Prateleira localizarPrateleira(int id){
		for(Prateleira pt : prateleiras){
			if(pt.getId()==id)
				return pt;
		}
		return null;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public ArrayList<Prateleira> getPrateleiras() {
		return prateleiras;
	}
	public int getTotalProdutos(){
		return produtos.size();
	}
	public int getTotalPrateleiras(){
		return prateleiras.size();
	}
	public void apagarProdutos() {
		produtos.clear();
	}
	public void apagarPrateleiras() {
		prateleiras.clear();
	}
	public int gerarId() {
		if (prateleiras.isEmpty())
			return 1;
		else {
			Prateleira ultimo = prateleiras.get(prateleiras.size()-1);
			return ultimo.getId() + 1;
		}
	}

	public void carregarObjetos()  	{
		// carregar para o repositorio os objetos dos arquivos csv
		try {
			//caso os arquivos nao existam, serao criados vazios
			File f1 = new File( new File(".\\prateleiras.csv").getCanonicalPath() ) ; 
			File f2 = new File( new File(".\\produtos.csv").getCanonicalPath() ) ; 
			if (!f1.exists() || !f2.exists() ) {
				//System.out.println("criando arquivo .csv vazio");
				FileWriter arquivo1 = new FileWriter(f1); arquivo1.close();
				FileWriter arquivo2 = new FileWriter(f2); arquivo2.close();
				return;
			}
		}
		catch(Exception ex)		{
			throw new RuntimeException("criacao dos arquivos vazios:"+ex.getMessage());
		}

		String linha;	
		String[] partes;	
		String id,tamanho,nome,preco,idprat;
		Prateleira prateleira;
		Produto produto;

		Scanner arquivo=null;
		try	{
			File f = new File( new File(".\\prateleiras.csv").getCanonicalPath() )  ;
			arquivo = new Scanner(f);	 //  pasta do projeto
			while(arquivo.hasNextLine()) 	{
				linha = arquivo.nextLine().trim();		
				partes = linha.split(";");	
				//System.out.println(Arrays.toString(partes));
				id = partes[0];
				tamanho = partes[1];
				prateleira = new Prateleira(Integer.parseInt(id),Double.parseDouble(tamanho));
				this.adicionar(prateleira);
			} 
			arquivo.close();
		}
		catch(Exception ex)		{
			throw new RuntimeException("leitura arquivo de prateleiras:"+ex.getMessage());
		}

		try	{
			File f = new File( new File(".\\produtos.csv").getCanonicalPath())  ;
			arquivo = new Scanner(f);	 //  pasta do projeto
			while(arquivo.hasNextLine()) 	{
				linha = arquivo.nextLine().trim();	
				partes = linha.split(";");
				//System.out.println(Arrays.toString(partes));
				nome = partes[0];
				preco = partes[1];
				produto = new Produto(nome,Double.parseDouble(preco));
				this.adicionar(produto);
				if(partes.length==3) {
					idprat = partes[2];		//campo id
					prateleira = this.localizarPrateleira(Integer.parseInt(idprat));
					prateleira.adicionar(produto);
					produto.setPrateleira(prateleira);
				}
			}
			arquivo.close();
		}
		catch(Exception ex)		{
			throw new RuntimeException("leitura arquivo de participantes:"+ex.getMessage());
		}
	}
	public void	salvarObjetos()  {
		//gravar nos arquivos csv os objetos que est�o no reposit�rio
		FileWriter arquivo=null;
		try	{
			File f = new File( new File(".\\prateleiras.csv").getCanonicalPath())  ;
			arquivo = new FileWriter(f); 
			for(Prateleira e : prateleiras) 	{
				arquivo.write(e.getId()+";"+e.getTamanho()+"\n");	
			} 
			arquivo.close();
		}
		catch(Exception e){
			throw new RuntimeException("problema na cria��o do arquivo  prateleiras "+e.getMessage());
		}

		try	{
			File f = new File( new File(".\\produtos.csv").getCanonicalPath())  ;
			arquivo = new FileWriter(f) ; 
			for(Produto p : produtos) {
				if(p.getPrateleira() != null)
					arquivo.write(p.getNome() +";"+ p.getPreco() +";"+ p.getPrateleira().getId() +"\n");	
				else
					arquivo.write(p.getNome() +";"+ p.getPreco() +";" + "\n");	
			} 
			arquivo.close();
		}
		catch (Exception e) {
			throw new RuntimeException("problema na cria��o do arquivo  produtos "+e.getMessage());
		}

	}
}

