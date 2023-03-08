// 01/02/2023. Rodar todas as outras classes criadas
//import Retangulo;
//import Matricula;
//import Conta

public class Main {

	public static void main(String[] args) {

		// Exemplo 1 com retângulo
		System.out.println("Teste com Retângulo:");
		Retangulo r = new Retangulo(1, 1.2, 1.5);
		System.out.println(r.calcularArea());
		
		Retangulo r2 = new Retangulo(1,2.5,5.3);
		System.out.println(r2.getComprimento());
		
		double r3 = new Retangulo(1, 2, 4).calcularArea();
		System.out.println(r3);
		
		Retangulo r4 = new Retangulo(1, 3, 5);
		System.out.println(r4.isQuadrado());

		System.out.println(r);
		System.out.println();

		// Outro exemplo, agora com Matrícula
		System.out.println("Teste com Matrícula");
		Matricula matricula = new Matricula("20221370030");

		System.out.println(matricula.getAnoString()); // Retorna a substring Ano da matrícula
		System.out.println(matricula.getPeriodoString()); // Período
		System.out.println(matricula.getCodidoCursoString()); // Código do curso

		System.out.println(matricula.getSequenciaString()); // Sequência

		// Outro exemplo, agora com Matrícula
		System.out.println("Teste com Matrícula");
		Conta conta1 = new Conta("101","123456");
		conta1.creditar(300.0);
		System.out.println("Saldo da conta 1 antes da transferência: " + conta1.getSaldo());

		Conta conta2 = new Conta("102", "654321");
		System.out.println("A conta está vazia? " + conta2.vazia());
		conta1.transferir(100, conta2);
		System.out.println("Depois da tranferência: " + conta1.getSaldo());
		System.out.println("Conta 2: " + conta2.getSaldo());
	}
}

