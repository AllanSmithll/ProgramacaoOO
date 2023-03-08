package Exercicio4Conta;

public class Conta {
    private String numero;
    private String cpf;
    private double saldo;

    public Conta(String numero, String cpf) {
        this.numero = numero;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public String getNumero() { return this.numero; }

    public double getSaldo() { return this.saldo; }

    public boolean vazia() {
        // A conta está vazia?
        if (this.saldo == 0)
            return true;
        else
            return false;
    }

    public void creditar(double... lista) { // para receber vários valores como argumento, colocar "tipo..."
        for(double valor : lista) // valor recebe uma lista de valores do argumento
            saldo = saldo + valor;
    }

    public void debitar(double valor) {
        saldo = saldo - valor;
    }

    public void transferir(double valor, Conta destino) {
        this.debitar(valor);
        destino.creditar(valor);
    }
}
