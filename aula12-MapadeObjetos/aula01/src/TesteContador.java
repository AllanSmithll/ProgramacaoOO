import contador.Contador;

public class TesteContador {
    public static void main(String[] args) throws Exception {
        Contador c1 = new Contador();
        c1.contar("joao");
        c1.contar("maria");
        c1.contar("maria");
        c1.contar("joao");
        c1.contar("joao");
        System.out.println("Total de joao: " + c1.totalizar("joao")); // 3
        System.out.println("Total de maria: " + c1.totalizar("maria")); // 2
        System.out.println("Total de jose: " + c1.totalizar("jose")); // 0
    }
}
