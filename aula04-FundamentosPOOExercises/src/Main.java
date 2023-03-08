import Exercicio1e2.Retangulo;
import Exercicio1e2.Triangulo;
import Exercicio3.Aluno;
import Exercicio4e5.Conta;
import Exercicio6.AlunoFlex;

public class Main {
    public static void main(String[] args) {

        // Primeiro Exercício
        Retangulo r = new Retangulo(5);

        System.out.println(r.calcularPerimetro() + "m²");

        // Segundo Exercício
        Triangulo t = new Triangulo(10, 20);

        System.out.println(t.calcularArea() + "m²");
        System.out.println(t);

        // Terceiro Exercício
        Aluno a1 = new Aluno("Allan", 90.0, 70) ;
        System.out.println(a1.getNome()+ "\n" + a1.getMedia() + "\n" + a1.getSituacao());

        // Quarto Exercício
        Conta conta1 = new Conta("333","123456");
        System.out.println();
        conta1.creditar(300.0);
        conta1.debitar(200.0);
        conta1.debitar(100.0);
        System.out.println(conta1.vazia());

        // Sexto Exercício
        AlunoFlex aFlex1 = new AlunoFlex("Allan", 100, 70) ;
		AlunoFlex aFlex2 = new AlunoFlex("João", 90, 50, 70, 80) ;
		AlunoFlex aFlex3 = new AlunoFlex("Anderson");
		System.out.println(aFlex1.getNome() + ", " + aFlex1.getMedia() + ", " + aFlex1.getSituacao());
		System.out.println(aFlex2.getNome() + ", " + aFlex2.getMedia() + ", " + aFlex2.getSituacao());
		System.out.println(aFlex3);
    }
}
