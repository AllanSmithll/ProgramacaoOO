/*
 * Allan Alves Amancio
 * Classe Q
 */
public class Q extends P {
	public int d;
	
	public Q(int a, int b, int c, int d) {
		super(a,b,c);
		this.d = d;
	}
	public int somar() {
		return super.somar()+d;
	}
}
