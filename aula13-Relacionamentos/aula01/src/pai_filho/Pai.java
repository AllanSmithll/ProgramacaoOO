package pai_filho;

import java.util.ArrayList;

public class Pai {
	private String nome;
	private ArrayList<Filho> filhos = new ArrayList<>();
	
	public Pai(String nome) {
		super();
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pai [nome=" + nome + ", filhos=" + filhos + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Filho> getFilhos() {
		return filhos;
	}

	public void setFilhos(ArrayList<Filho> filhos) {
		this.filhos = filhos;
	}

	public void adicionar(Filho f) {filhos.add(f);}
	public void remover(Filho f) {filhos.remove(f);}
	
	public Filho localizar(String nome) {
		for(Filho f : filhos)
			if(f.getNome().equals(nome)) return f;
		return null; }
	
	public Filho obterCacula() {
		Filho maisNovo = filhos.get(0);
		for(Filho f : filhos) {
			if(f.getIdade() < maisNovo.getIdade())
				maisNovo = f;
		}
		return maisNovo;
	}

	public double obterIdadeMedia() {
		double somaIdade = 0;
		int contador = 0;
		for(Filho f : filhos) {
			if(f.getIdade() != 0) {
				somaIdade += f.getIdade();
				contador++;
			}
		}
		if(contador == 0) return 0;
		else {return somaIdade/contador;}
	}
}
