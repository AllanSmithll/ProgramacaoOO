/*
 * @author Allan Amancio
 * Classe Conta Especial que herda de Conta
 * */

public class ContaEspecial extends Conta {
	private double limite=0;
	
	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}
	
	@Override
	public void debitar(double valor) throws Exception {
		if (valor > getSaldo() + limite) {
				throw new Exception("saldo da conta nao pode ficar menor que -"+limite);	//lan�amento de alerta
		}
		setSaldo(getSaldo() - valor);
	}
	
	public double getLimite(){
		return limite;
	}

	@Override
	public String toString() {
		return super.toString() + ", limite=" + getLimite();
	}
}
