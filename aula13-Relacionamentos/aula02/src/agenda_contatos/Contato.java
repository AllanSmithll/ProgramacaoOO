package agenda_contatos;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private String logradouro;
    private ArrayList<Telefone> telefones = new ArrayList<>();

    public Contato(String nome, String logradouro) {
        this.nome = nome;
        this.logradouro = logradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
        telefone.adicionarContato(this);
    }

    public void removerTelefone(Telefone telefone) {
        telefones.remove(telefone);
        telefone.removerContato(this);
    }

    public void listarTelefones() {
        for (Telefone telefone : telefones) {
            System.out.println(telefone);
        }
    }

    public String toString() {
        return "Contato [nome=" + nome + ", logradouro=" + logradouro + ", telefones=" + telefones + "]";
    }
}
