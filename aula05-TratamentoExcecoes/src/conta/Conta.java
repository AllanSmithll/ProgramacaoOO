//20/03/2023
package conta;
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
        return saldo==0;
    }

    public void creditar(double valor) {
        // Apenas para sobrecarga
        saldo += valor;
    }

    public void creditar(double... lista) { // para receber vários valores como argumento, colocar "tipo..."
        for(double valor : lista) // valor recebe uma lista de valores do argumento
            saldo = saldo + valor;
    }

    public void debitar(double valor) throws Exception {
    	if(valor > saldo)
    		// System.out.println("Saldo não pode ficar negativo.");
    		throw new Exception("Saldo não pode ficar negativo.");
    	saldo = saldo - valor;
    }

    public void transferir(double valor, Conta destino) throws Exception {
        try {
        	this.debitar(valor);
        	destino.creditar(valor);
        }
        
        catch (Exception erro) {
        	throw new Exception("Saldo não pode ficar negativo ao transferir");
        }
    }
    
    public Conta clonar() {
        Conta novaconta = new Conta(this.numero, this.cpf);
        novaconta.creditar(this.getSaldo());
        return novaconta;
    }
}

