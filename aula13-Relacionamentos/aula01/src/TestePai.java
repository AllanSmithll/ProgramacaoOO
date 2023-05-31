import pai_filho.Filho;
import pai_filho.Pai;

public class TestePai {

	public static void main(String[] args) {
		Pai pai = new Pai("Donald");
		pai.adicionar(new Filho("Zezinho", 6));
		pai.adicionar(new Filho("Huguinho", 7));
		pai.adicionar(new Filho("Luisinho", 5));
		System.out.println("Pai: "+pai);

		// Localizar
		System.out.println("Filho encontrado: "+pai.localizar("Zezinho"));

		// Caçula
		System.out.println("Filho mais novo: "+pai.obterCacula());

		// obterIdadeMedia
		System.out.println(pai.obterIdadeMedia());
	}

}
