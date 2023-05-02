public class TesteUtil {
	public static void main(String[] args){
		System.out.println("validar nome:"+ Util.validaNome("joao da silva"));
		System.out.println("validar email:"+ Util.validaEmail("joao@gmail.com"));
		System.out.println("validar cpf:"+ Util.verificaCPF("23873483203"));	//https://www.geradordecpf.org/

		String frase = Util.tirarBrancosExtras( "    exemplo   de     sala  de aula  " ) ;
		System.out.println("\npalavras da frase:"+frase);
		String[] palavras = frase.split(" ");
		for(String p : palavras)
			System.out.println(p);
	}
}
