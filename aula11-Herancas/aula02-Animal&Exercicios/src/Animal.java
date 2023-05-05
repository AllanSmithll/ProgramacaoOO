
public abstract class Animal {
	private String nome;
	private double peso;
	
	public Animal(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	public abstract String emitirSom();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String toString() {
		return "nome= " + nome +
				", peso= " + peso + 
				", som= "+ emitirSom();
	}
}
