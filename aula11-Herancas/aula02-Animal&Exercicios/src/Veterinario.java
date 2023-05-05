
public class Veterinario {
	private String nome;
	
	public Veterinario(String nome) {
		super();
		this.nome = nome;
	}

	public String aplicarInjecao(Animal a) {
		return
				"Dr." + nome +
				" aplicou injecao em " + a.getNome() +
				" que fez " + a.emitirSom();
	}
}
