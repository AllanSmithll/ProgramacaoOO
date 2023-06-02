package prateleira_produto_fabricante;
import java.util.ArrayList;

public class Prateleira {
	private int id;
	private int tamanho;
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public Prateleira(int id, int tamanho) {
		super();
		this.id = id;
		this.tamanho = tamanho;
	}
	
	public void adicionar(Produto p) {
		produtos.add(p);
		p.setPrateleira(this);
	}
	
	public void remover(Produto p) {
		produtos.remove(p);
		p.setPrateleira(this);
	}
	
	public Produto localizar(String nome) {
		for(Produto p: produtos) {
			if(p.getNome().equals(nome))
				return p;
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public String toString() {
		String texto = "Prateleira:" + id;
		texto += ", tamanho:" + tamanho + ", preco medio="+getPrecoMedio();
		if (produtos.isEmpty())
			texto += " n�o tem produto";
		else 
		{	texto += " produtos da prateleira: ";
			for(Produto p: produtos) texto += " " + p.getNome(); 
		}
		return texto;
	}
	
	public double getPrecoMedio() {
		if (produtos.isEmpty())
			return 0;
		
		double soma=0;
		for(Produto p : produtos) {
			soma += p.getPreco();
		}
		return soma/produtos.size();
	} 
}
