package Exercicio1e2;

public class Triangulo {
    public double base;
    public double altura;

    public Triangulo(double Base, double Altura) {
        this.base = Base;
        this.altura = Altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public String toString() {
        return "Triangulo [Base=" + base + "; Altura=" + altura + "]"; 
    }
}
