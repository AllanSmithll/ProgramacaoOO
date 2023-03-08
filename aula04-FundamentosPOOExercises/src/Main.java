import Exercicio1e2.Retangulo;
import Exercicio1e2.Triangulo;

public class Main {
    public static void main(String[] args) {

        // Primeiro Exercício
        Retangulo r = new Retangulo(5);

        System.out.println(r.calcularPerimetro() + "m²");

        // Segundo Exercício
        Triangulo t = new Triangulo(10, 20);

        System.out.println(t.calcularArea() + "m²");
        System.out.println(t);
    }
}
