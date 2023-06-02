package agenda_contatos;

import java.util.ArrayList;

public class Telefone {
    private String ddd;
    private String numero;
    private ArrayList<Contato> contatos = new ArrayList<>();

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    @Override
    public String toString() {
        return "Telefone [ddd=" + ddd + ", numero=" + numero + "]";
    }
}
