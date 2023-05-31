import pessoa_casa_aluguel.Aluguel;
import pessoa_casa_aluguel.Casa;
import pessoa_casa_aluguel.Pessoa;

public class TesteAluguel {
	public static void main(String[] args) {
	Pessoa joao = new Pessoa("joao da silva", "123.000.555-88");
	//nome cpf
	Pessoa maria = new Pessoa("maria de sousa", "222.101.666-32");
	//nome cpf
	Casa casa = new Casa(joao,"rua primeiro de maio, 45", "jaguaribe",
	800000.0); //proprietario, endereco, bairro, preco

	Aluguel alug1 = new Aluguel(casa, maria); //imovel, inquilino
	double valor = alug1.getValorAluguel(); //0.003 x preco
	System.out.println(valor); //2400.0 = 0.003*800000.0
	}
}
