// 22/03/2023
package classes;
import java.util.ArrayList;

public class Pilha<T> {
	private ArrayList<T> dados = new ArrayList<>();
	
	public void push(T objeto) {
		dados.add(objeto);
	}
	
	public void pop() throws Exception {
			if(dados.isEmpty())
				throw new Exception("pop - pilha vazia ");

			int ultimo = dados.size()-1;
			dados.remove(ultimo);
		}
	
		public T top() throws Exception {
			if(dados.isEmpty())
				throw new Exception("top - pilha vazia ");

			int ultimo = dados.size()-1;
			return dados.get(ultimo);
		}
}
