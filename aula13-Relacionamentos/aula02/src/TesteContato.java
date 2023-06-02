import agenda_contatos.Contato;
import agenda_contatos.Telefone;

public class TesteContato {
    public static void main(String[] args) {
        // Criando contatos
        Contato contato1 = new Contato("João", "Rua ABC");
        Contato contato2 = new Contato("Maria", "Avenida XYZ");

        // Criando telefones
        Telefone telefone1 = new Telefone("11", "123456789");
        Telefone telefone2 = new Telefone("22", "987654321");

        // Associando telefones aos contatos
        contato1.adicionarTelefone(telefone1);
        contato2.adicionarTelefone(telefone1);
        contato2.adicionarTelefone(telefone2);

        // Exibindo informações dos contatos
        System.out.println(contato1);
        System.out.println(contato2);

        // Exibindo informações dos telefones
        System.out.println(telefone1);
        System.out.println(telefone2);

        // Removendo telefone do contato
        contato1.removerTelefone(telefone1);

        // Exibindo informações atualizadas do contato
        System.out.println(contato1);
    }
}
