
/*
 * SI - POO - Fausto Ayres
 */

  public class Teste {
	public static void main(String[] args)	{	
		Conta conta1 = new Conta(1,"111"); 	//id, cpf
		ContaEspecial conta2 = new ContaEspecial(2, "222", 500.0); 
		
		conta1.creditar(500.0);					
		try{
			conta1.debitar(100.0);				//saldo 400
			conta1.transferir(400.0, conta2);	//saldo 0
			conta2.transferir(500.0, conta1);	//saldo -100
			conta2.transferir(500.0, conta1);	//exce��o
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); 
		}
		System.out.println(conta1);		//saldo -100
		System.out.println(conta2);		//saldo 500
	}
}
  