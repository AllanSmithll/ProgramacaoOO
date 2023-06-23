package modelo;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/
import java.util.ArrayList;


public class Prateleira {
	private int id;
	private double tamanho;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	public Prateleira(int id, double t) {
		this.id = id;
		this.tamanho = t;
	}
	public void adicionar(Produto p){
		produtos.add(p);
		p.setPrateleira(this);
	}
	public void remover(Produto p){
		produtos.remove(p);
		p.setPrateleira(null);
	}
	public Produto localizar(String nome){
		for(Produto p : produtos){
			if(p.getNome().equals(nome))
				return p;
		}
		return null;
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public int getTotalProdutos(){
		return produtos.size();
	}

	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	@Override
	public String toString() {
		String texto = "id=" + id + ", tamanho=" + tamanho ;
		texto += ", produtos:";
		if (produtos.isEmpty())
			texto += " vazia";
		else 	
			for(Produto p: produtos) 
				texto += " " + p.getNome() ;

		return texto ;
	}


}
	


