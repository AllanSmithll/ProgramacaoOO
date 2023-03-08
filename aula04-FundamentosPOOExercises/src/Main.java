import Exercicio1e2.Retangulo;
import Exercicio1e2.Triangulo;
import Exercicio3.Aluno;
import Exercicio4e5.Conta;

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
        Aluno a1 = new Aluno("Allan", 100, 70) ;
        System.out.println(a1.getNome()+ "\n" + a1.getMedia() + "\n" + a1.getSituacao());

        // Quarto Exercício
        Conta conta1 = new Conta("333","123456");
        conta1.creditar(300.0);
        conta1.debitar(200.0);
        conta1.debitar(100.0);
        System.out.println(conta1.vazia());
    }
}
