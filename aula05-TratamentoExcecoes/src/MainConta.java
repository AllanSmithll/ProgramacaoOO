// 21/03/2023
import conta.Conta;
public class MainConta {

	public static void main(String[] args) {
		 Conta conta1 = new Conta("333","123456");
		 Conta conta2 = new Conta("334","123456");
		 
	        try {
	        	conta1.creditar(1000.0);
	        	conta1.debitar(300.0);
	        	System.out.println("Saldo atual da conta 1: " + conta1.getSaldo() + ".");
	        	System.out.println("Saldo atual da conta 2: " + conta2.getSaldo() + ".");
	        }
	        
	        catch (Exception erro){
	        	System.out.println(erro.getMessage());
	        }
	        
	        try {
	        	conta1.transferir(100.0, conta2);
	        	System.out.println("Saldo da conta 1 após a transferência: " + conta1.getSaldo() + ".");
	        	System.out.println("Saldo da conta 2 após a transferência: " + conta2.getSaldo() + ".");
	        }
	        
	        catch(Exception err) {
	        	System.out.println(err.getMessage());
	        }
	        
	        System.out.println("Vazio?" + conta1.vazia());
	        System.out.println("Vazio?" + conta1.vazia());
	        
	        // Erro de index para testar
	        String[] nomes = {"bala", "bola", "balão"};
	        System.out.println(nomes[5]); //aborta
	}
}
