package loja_produto;
import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String endereco;
    private List<Produto> produtos;

    public Loja(String endereco) {
        this.endereco = endereco;
        this.produtos = new ArrayList<>();
    }

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public void remover(Produto produto) {
        produtos.remove(produto);
    }

    public Produto localizar(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public double obterPrecoMedio() {
        if (produtos.isEmpty()) {
            return 0;
        }

        double somaPrecos = 0;
        for (Produto produto : produtos) {
            somaPrecos += produto.getPreco();
        }

        return somaPrecos / produtos.size();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Loja [endereco=" + endereco + ", produtos=" + produtos + "]";
    }
}
