// 09/03/2023
package vendaProduto;

public class Produto {
    public String nome;
    public int estoque;
    public double preco;

    public Produto(String nome, int estoque, double preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getEstoque() { return estoque; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public void aumentarEstoque(int quantidadeProduto) { this.estoque += quantidadeProduto; }

    public void diminuirEstoque(int quantidadeProduto) { this.estoque -= quantidadeProduto; }

    @Override
    public String toString() {
        return "Produto [Nome=" + nome + ", Estoque=" + estoque + ", Preço=" + preco + "]";
    }
}
