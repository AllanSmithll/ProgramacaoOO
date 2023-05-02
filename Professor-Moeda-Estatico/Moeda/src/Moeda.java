/*
 * IFPB - SI - POO 
 * Prof. Fausto
 */

public class Moeda {

	//cotação
	public static double cotacaoDolar = 5.0;
	public static double cotacaoEuro = 6.0;
	
	//conversao
	//---------- DOLAR ---------------
	public static double realToDolar(double real) {
		return real / cotacaoDolar;
	}
	public static double dolarToReal(double dolar) {
		return dolar * cotacaoDolar;
	}

	//---------- EURO ---------------
	public static double realToEuro(double real) {
		return real / cotacaoEuro;
	}
	public static double euroToReal(double euro) {
		return euro * cotacaoEuro;
	}
}
