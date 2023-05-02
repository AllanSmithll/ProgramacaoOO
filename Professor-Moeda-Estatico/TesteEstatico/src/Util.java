import java.util.ArrayList;
import java.util.regex.Pattern;

public class Util {
	private Util() {}

	public static boolean validaNome(String nome) {
		// letras e espaços
		if(Pattern.matches("^[[ ]|\\p{L}*]+$", nome))
			return true;
		else
			return false;
	}

	public static boolean validaEmail(String email) {
		//"^([0-9a-zA-Z]+([_.-]?[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[0-9,a-z,A-Z]*(.){1}[a-zA-Z]{2,4})+$"
		if(Pattern.matches("^\\w*(\\.\\w*)?@\\w*\\.[a-z]+(\\.[a-z]+)?$", email))
			return true;
		else
			return false;
	}

	public static boolean verificaCPF(String cpf){
		ArrayList<Integer> icpf = new ArrayList<>();
		int i,r1,r2,d1,d2,s,v; 
		s = 0;
		for(i=0;i<11;i++){// Transformando char de cada array em int
			icpf.add(cpf.charAt(i)-48);
		} 
		//Pegando o primeiro dígito validador
		for(i=0;i<9;i++){
			s = s+(icpf.get(i)*(10-i));// pegando o somatorio dos produtos (pesos * digitos)
		} 
		r1 = s % 11;	//resto 
		if ((r1 == 1) || (r1 ==0))
			d1 = 0; //este será o validador
		else 
			d1 = 11-r1;// senao, será este
		
		// Pegando o segundo dígito validador
		s = 0; //zerando o somador, para fazer mais um somatorio           
		for(i=0;i<10;i++){//Já vamos usar o digito primeiro digito validador que foi FORNECIDO
			s = s+(icpf.get(i)*(11-i));
		}
		v = (s/11)*11;
		r2 = s - v;

		if((r2 == 1) || (r2 == 0))
			d2 = 0;  // Repetindo o esquema do primeiro digito validador
		else 
			d2 = 11-r2;     

		//Resultado Validacao dos dois digitos finais
		if((d1 == icpf.get(9)) && (d2 == icpf.get(10)))
			return true;  //CPF Valido   
		else
			return false;  //CPF Invalido
	}


	public static String tirarBrancosExtras(String s) {
		StringBuilder builder = new StringBuilder( s.trim() );
		int i=builder.indexOf("  "); 		// localiza 2 brancos
		while(i>=0){
			builder.delete(i, i+1);   // retira 1 branco
			// System.out.println(i);
			i=builder.indexOf("  ");
		}
		return builder.toString();
	}

}  
