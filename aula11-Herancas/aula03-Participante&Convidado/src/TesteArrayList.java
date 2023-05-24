import java.util.ArrayList;
import java.util.function.Predicate;

public class TesteArrayList {

	public static void main(String[] args) {
		Participante joao = 	new Participante("joao@gmail.com", "joao", 17);
		Participante maria = 	new Participante("maria@gmail.com", "maria", 30);
		Participante pedro = 	new Participante("pedro@gmail.com", "pedro", 70);
		Convidado paulo = 		new Convidado("paulo@gmail.com", "paulo",  17, "empresa1");
		Convidado katia = 		new Convidado("katia@gmail.com", "katia",  30, "empresa2");
		Convidado antonio =		new Convidado("antonio@gmail.com", "antonio",  70, "empresa3");
		
		System.out.println("\n----participantes");
		System.out.println(joao);
		System.out.println(maria);
		System.out.println(pedro);

		System.out.println("\n----convidados");
		System.out.println(paulo);
		System.out.println(katia);
		System.out.println(antonio);
		
		// Com ArrayList
		ArrayList<Participante> lista = new ArrayList<>();
		lista.add(joao);
		lista.add(maria);
		lista.add(pedro);
		lista.add(paulo);
		lista.add(katia);
		lista.add(antonio);
		
		// Receita total
		final double  INGRESSO_INTEIRO = 1000.00;
		double receita_total = 0;
		for(Participante p : lista) {
			receita_total += p.getValorPago(INGRESSO_INTEIRO);
		}
		System.out.println("Receita total: " + receita_total);
		
		// Gratuidades
		int quantidade_participacoes_gratis = 0;
		for(Participante p : lista) {
			if(p.getValorPago(INGRESSO_INTEIRO) == 0.00) {
				quantidade_participacoes_gratis ++;
			}
		}
		System.out.println("Gratuidades: " + quantidade_participacoes_gratis);
		
		// Lista de participantes entre 17 e 30 anos
		ArrayList<Participante> lista_dezessete_trinta = new ArrayList<>();
		for(Participante p : lista) {
			if (p.getIdade() >= 17 && p.getIdade() < 31) {
				lista_dezessete_trinta.add(p);
			}
		}
		System.out.println("Lista de participantes entre 17 e 30 anos: " + lista_dezessete_trinta);
		
		// Convidados da empresa2
		ArrayList<Convidado> lista_empresa_2 = new ArrayList<>();
		for(Participante p : lista) {
			if(p instanceof Convidado c && c.getEmpresa().toLowerCase().equals("empresa2")) {
				lista_empresa_2.add(c);
			}
		}
		System.out.println("Convidados da empresa2: " + lista_empresa_2);
		
		// Remover da lista todos os objetos com idade > 60
		lista.removeIf(p -> p.getIdade()>60);
		lista.removeIf(new Predicate<Participante>() {
			public boolean test(Participante p) {
				if(p.getIdade()>60)
					return true;
				else
					return false;
			}
		});
		System.out.println("Removidos os maiores de 60 anos: "+lista);
	}

}
