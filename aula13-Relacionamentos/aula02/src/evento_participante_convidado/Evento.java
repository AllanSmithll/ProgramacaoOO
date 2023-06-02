package evento_participante_convidado;
/**
 * SI - POO - Prof. Fausto Ayres
 */


import java.util.ArrayList;

public class Evento {
	private int id;
	private String nome;
	private String data;
	private double preco;
	private ArrayList<Participante> participantes = new ArrayList<>();

	public Evento(int id, String nome, String data, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.preco = preco;
	}
	public void adicionar(Participante p){
		participantes.add(p);
	}
	public void remover(Participante p){
		participantes.remove(p);
	}
	public Participante localizar(String nome){
		for(Participante p : participantes){
			if(p.getNome().equals(nome))
				return p;
		}
		return null;
	}
	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome=" + nome + ", data=" + data + ", preco=" + preco + "]";
	}

	public double getTotalValorPago() {
		double totalFesta = 0.0;
		for(Participante par : this.participantes) {
			totalFesta += par.getValorPago(this.preco);
		}
		return totalFesta;
	}

	public double getIdadeMedia() {
		if(participantes.size() == 0) {
			return 0;
		}
		int somaIdades = 0;
		for(Participante par : this.participantes) {
			somaIdades += par.getIdade();
			somaIdades++;
		}
		return somaIdades/participantes.size();
	}

	public ArrayList<Participante> getParticipantesPorIdade(int idade) {
		ArrayList<Participante> participantesFesta = new ArrayList<>();
		for(Participante par : this.participantes) {
			if(par.getIdade() == idade) {
				participantesFesta.add(par);
			}
		}
		return participantesFesta;
	}
	
	public int contarConvidados() {
		int quantConvid = 0;
		for(Participante par : this.participantes) {
			if(par instanceof Convidado) {
				quantConvid++;
			}
		}
		return quantConvid;
	}
	
	public ArrayList<Convidado> getConvidados() {
		ArrayList<Convidado> convidadosFesta = new ArrayList<>();
		for(Participante par : this.participantes) {
			if(par instanceof Convidado c) {
				convidadosFesta.add(c);
			}
		}
		return convidadosFesta;
	}
	
	public ArrayList<Convidado> getConvidados(String empresa) {
		ArrayList<Convidado> convidadosFesta = new ArrayList<>();
		for(Participante par : this.participantes) {
			if(par instanceof Convidado c && c.getEmpresa().equals(empresa)) {
				convidadosFesta.add(c);
			}
		}
		return convidadosFesta;
	}

	public int contarGratuidades() {
		int gratuidades = 0;
		for(Participante par : this.participantes) {
			if(par.getValorPago(this.preco) == 0.0) {
				gratuidades++;
			}
		}
		return gratuidades;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}




}
