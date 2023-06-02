package livro_autor;

import java.util.ArrayList;

public class Autor {
	private String nome;
	private ArrayList<Livro> livros = new ArrayList<>();
	
	public Autor(String nome) {
		super();
		this.nome = nome;
	}

	public void adicionar(Livro liv) {
        livros.add(liv);
    }
    
    public void remover(Livro liv) {
        livros.remove(liv);
    }
	
	public Livro localizar(String titulo) {
		for(Livro liv: livros)
			if(liv.getTitulo().equals(titulo)) {return liv;}
	return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", livros=" + this.getLivros() + "]";
	}
}
