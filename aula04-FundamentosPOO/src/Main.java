// 01/02/2023. Rodar todas as outras classes criadas
// import Retangulo;

public class Main {

	public static void main(String[] args) {
		Retangulo r = new Retangulo(1, 1.2, 1.5);
		r.id = 1;
		r.comprimento = 18;
		r.largura = 10;
		System.out.println(r.calcularArea());
		
		Retangulo r2 = new Retangulo(1,2.5,5.3);
		System.out.println(r2.comprimento);
		
		double r3 = new Retangulo(1, 2, 4).calcularArea();
		System.out.println(r3);
		
		Retangulo r4 = new Retangulo(1, 3, 5);
		System.out.println(r4.isQuadrado());
	}

}

