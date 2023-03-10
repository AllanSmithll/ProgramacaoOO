// 10/03/2023
import vendaProduto.Produto;
import vendaProduto.Venda;

public class TesteProduto {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Arroz", 10, 4.5);

        System.out.println("\nEstoque antes da venda:");
        System.out.println(p1.getEstoque());

        Venda v1 = new Venda("31/08/2022", p1, 2);
        System.out.println(v1);

        System.out.println("\nEstoque depois da venda:");
        System.out.println(p1.getEstoque());
    }
}
