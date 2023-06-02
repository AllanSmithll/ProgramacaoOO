package livro_autor;

import java.util.ArrayList;

public class Livro {
	private String titulo;
	private ArrayList<Autor> autores = new ArrayList<>();
	
	public Livro(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	public void adicionar(Autor aut) {
        autores.add(aut); 
        aut.adicionar(this);
    }
	
	public void remover(Autor aut) {
        autores.remove(aut);
        aut.remover(this);
    }
		
	public Autor localizar(String nome) {
		for(Autor aut: autores)
			if(aut.getNome().equals(nome)) {return aut;}
		return null;
	}
		
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Livro [titulo=").append(titulo).append(", autores=");
		
		// Adiciona o nome de cada autor na representação em string
		ArrayList<String> nomesAutores = new ArrayList<>();
		for (Autor autor : autores) {
			nomesAutores.add(autor.getNome());
		}
		sb.append(nomesAutores);
		
		sb.append("]");
		return sb.toString();
	}
}
