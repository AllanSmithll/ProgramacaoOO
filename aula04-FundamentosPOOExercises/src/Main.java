import Exercicio1e2.Retangulo;
import Exercicio1e2.Triangulo;
import Exercicio3.Aluno;

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
    }
}
