// 17/02/2023: sobre estrutura de repetição FOR
import java.util.Random;
/* sorteio.nextInt(59) + 1; Isso faz com que o npumero nunca seja 0*/
public class For {

	public static void main(String[] args) {
		Random sorteio =new Random();
		int numero;
		for (int i=1; i<=6; i++) {
			numero = sorteio.nextInt(60);
			System.out.println(numero);
		}

	}

}
