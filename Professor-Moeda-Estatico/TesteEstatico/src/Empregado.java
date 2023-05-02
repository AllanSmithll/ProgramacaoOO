//IFPB - POO
//Fausto Ayres


public class Empregado {
	private int n;
	public static double minimo = 1000;
	
	public Empregado(int n) {
		this.n = n;
	}  
	public double getSalario() {
		return n * Empregado.minimo;	
	}

}
