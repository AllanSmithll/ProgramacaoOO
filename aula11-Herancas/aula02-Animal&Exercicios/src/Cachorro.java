
public class Cachorro extends Animal{
	public Cachorro(String nome, double peso) {
		super(nome, peso);
	}
	
	@Override
	public String emitirSom() {
		return "au au";
	}
}
