/*
 * @author Allan Amancio
 * Classe Participante
 */
public class Participante {
	protected String email;
	protected String nome;
	protected int idade;

	public Participante(String email, String nome, int idade) {
		this.email = email;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getPercentual() {
		if(this.idade<18) {return 50;}
		if(this.idade>=60) {return 20;}
		else {return 0;}
	}
	
	public double getValorPago(double preco) {
		return preco - (preco * (getPercentual()/100.0));
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
	
	@Override
	public String toString() {
		return  "email=" + email + ", nome=" + nome + ", idade=" + idade + ", percentual="+getPercentual()+'\n';
	}
}
