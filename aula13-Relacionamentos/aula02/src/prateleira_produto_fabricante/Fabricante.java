package prateleira_produto_fabricante;

import java.util.ArrayList;

public class Fabricante {
	private String nome;
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}
	
	public void adicionar(Produto p) {produtos.add(p);}
	
	public void remover(Produto p) {produtos.remove(p);}
	
	public Produto localizar(String nome) {
		for(Produto p : produtos)
			if(p.getNome().equals(nome)) return p;
		return null; 
	} 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Fabricante [nome=" + nome + ", produtos=" + produtos + "]";
	}
}
