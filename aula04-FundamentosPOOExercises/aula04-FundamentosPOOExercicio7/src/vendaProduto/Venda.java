// 09/03/2023
package vendaProduto;
// import vendaProduto.Produto;

public class Venda {
    Produto product;
    private String data;
    private String nome;
    private int quantidade;
    private double valorVenda;
    private double precoUnico;

    public Venda(String data, Produto produto, int quant) {
        this.data = data;
        this.quantidade = quant;
        this.nome = produto.getNome();
        this.valorVenda = produto.getPreco() * quant;
        this.precoUnico = produto.getPreco();
        produto.venderProduto(quant);
    }

    @Override
    public String toString() {
        return "Venda [Data=" + data + ", Nome=" + nome + ", Quantidade=" + quantidade + ", ValorVenda=" + valorVenda + ", PrecoUnico=" + precoUnico + "]";
    } 
}
