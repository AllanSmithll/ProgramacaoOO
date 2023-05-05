
public class Gato extends Animal{
	private int salto;
	
	public Gato(String nome, double peso, int salto) {
		super(nome, peso);
		this.salto = salto;
	}
	
	@Override
	public String emitirSom() {
		return "miau";
	}
	public int getSalto() {
		return salto;
	}
	public String toString() {
		return "nome= " + getNome() +
				", peso= " + getPeso() + 
				", som= "+ emitirSom() +
				", salto= "+ getSalto();
	}
}
