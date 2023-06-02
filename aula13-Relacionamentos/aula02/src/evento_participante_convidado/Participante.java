package evento_participante_convidado;
/**
 * SI - POO - Prof. Fausto Ayres
 */


import java.util.ArrayList;

public class Participante {
	protected String email;
	protected String nome;
	protected int idade;
	private ArrayList<Evento> eventos = new ArrayList<>();
	
	public Participante(String email, String nome, int idade) {
		super();
		this.email = email;
		this.nome = nome;
		this.idade = idade;
	}

	public void adicionar(Evento e){
		eventos.add(e);
	}
	public void remover(Evento e){
		eventos.remove(e);
	}
	public Evento localizar(int id){
		for(Evento e : eventos){
			if(e.getId() == id)
				return e;
		}
		return null;
	}
	
	public int getPercentual() {
		if(idade<18)
			return 50;
		else
			if(idade>=60)
				return 20;
			else
				return 0;
	}

	public double getValorPago(double preco) {
		return preco - preco * getPercentual()/100;
	}
	
	public Evento getEventoMaiorPreco() {
		Evento eventoMaiorPreco = null;
		double max = 0;
		for(Evento e : eventos) {
			if(e.getPreco() > max) {
				max = e.getPreco();
				eventoMaiorPreco = e;
			}
		}
		return eventoMaiorPreco;
	}

	@Override
	public String toString() {
		String texto =  "email=" + email + ", nome=" + nome + ", idade=" + idade + ", percentual="+getPercentual() ;
		texto += ", eventos:";
		for(Evento e : eventos)
			texto += e.getId() + ",";
		return texto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


}
