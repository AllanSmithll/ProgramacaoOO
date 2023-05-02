/*
 * IFPB - SI - POO 
 * Prof. Fausto
 */

public class TesteConsole {

	public static void main(String[] args) {
		System.out.println("conversao de 100 reais para dolar= "+Moeda.realToDolar(100));
		System.out.println("conversao de 100 dolares para real= "+Moeda.dolarToReal(100));
		
		System.out.println("\n alterando cotacao dolar");
		Moeda.cotacaoDolar = 4.0;
		
		System.out.println("conversao de 100 reais para dolar= "+Moeda.realToDolar(100));
		System.out.println("conversao de 100 dolares para real= "+Moeda.dolarToReal(100));

	}

}
