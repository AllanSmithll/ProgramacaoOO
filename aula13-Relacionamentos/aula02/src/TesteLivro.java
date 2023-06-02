import livro_autor.Autor;
import livro_autor.Livro;

public class TesteLivro {

	public static void main(String[] args) {
		Livro java = new Livro("ciência moderna");
		Livro php = new Livro("pratica");
		Autor joao = new Autor("joao");
		Autor maria = new Autor("maria");
		java.adicionar(joao); //rel Livro -> Autor
		java.adicionar(maria);
		php.adicionar(maria);
		
		//transferir autor “joao”
		Autor a = java.localizar("joao");
		if(a!=null){
			java.remover(a); 
			php.adicionar(a);
		}
		
		System.out.println(java);
		System.out.println(php);
	}

}
