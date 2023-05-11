package exercicio01;

public class Teste {

	public static void main(String[] args) {
		Pai p = new Filho();
		Filho f = new Neto();
		p.quemsoueu();
		f.quemsoueu();
	}

}
