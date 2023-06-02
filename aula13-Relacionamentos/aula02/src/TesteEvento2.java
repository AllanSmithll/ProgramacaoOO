import evento_participante_convidado.Convidado;
import evento_participante_convidado.Evento;
import evento_participante_convidado.Participante;

/**
 * SI - POO - Prof. Fausto Ayres
 * Teste2 das classes Evento - Participante - Convidado
 *
 */
public class TesteEvento2 {
	public static void main(String[] args) {
		//valor pago = preco - desconto
		//desconto depende da idade e de ser participante ou convidado

		Participante joao = 	new Participante("joao@gmail.com", "joao", 17);
		Participante maria = 	new Participante("maria@gmail.com", "maria", 30);
		Participante pedro = 	new Participante("pedro@gmail.com", "pedro", 70);
		Convidado paulo = 		new Convidado("paulo@gmail.com", "paulo",  17, "empresa1");
		Convidado katia = 		new Convidado("katia@gmail.com", "katia",  30, "empresa2");
		Convidado antonio =		new Convidado("antonio@gmail.com", "antonio",  70, "empresa3");

		Evento festa = new Evento(1,"festa do chapolin","01/07/2022",1000.0);
		Evento show = new Evento(2,"show do piseiro","15/07/2022",2000.0);

		//	relacionamentos da festa	
		festa.adicionar(joao);
		joao.adicionar(festa);
		festa.adicionar(maria);
		maria.adicionar(festa);
		festa.adicionar(pedro);
		pedro.adicionar(festa);
		festa.adicionar(paulo);
		paulo.adicionar(festa);
		festa.adicionar(katia);
		katia.adicionar(festa);
		festa.adicionar(antonio);
		antonio.adicionar(festa);

		//	relacionamentos do show	
		show.adicionar(joao);
		joao.adicionar(show);
		show.adicionar(maria);
		maria.adicionar(show);
		show.adicionar(antonio);
		antonio.adicionar(show);

		System.out.println("\n---------- FESTA ---------");
		System.out.println(festa);
		System.out.println("valor total arrecadado da festa=" +festa.getTotalValorPago());
		System.out.println("idade media da festa=" +festa.getIdadeMedia());
		System.out.println("gratuidades da festa=" +festa.contarGratuidades());

		System.out.println("\nPARTICIPANTES DA FESTA ");
		for(Participante p : festa.getParticipantes())
			System.out.println(p + "  valor pago=" + p.getValorPago(festa.getPreco()));

		System.out.println("\nCONVIDADOS DA FESTA:");
		for(Convidado c : festa.getConvidados())
			System.out.println(c + "  valor pago=" + c.getValorPago(festa.getPreco()));

		System.out.println("\n---------- SHOW ---------");
		System.out.println(show);
		System.out.println("valor total arrecadado do show=" +show.getTotalValorPago());
		System.out.println("idade media do show=" +show.getIdadeMedia());
		System.out.println("gratuidades do show=" +show.contarGratuidades());

		System.out.println("\nPARTICIPANTES DO SHOW ");
		for(Participante p : show.getParticipantes())
			System.out.println(p + "  valor pago=" + p.getValorPago(show.getPreco()));

		System.out.println("\nCONVIDADOS DO SHOW:");
		for(Convidado c : show.getConvidados())
			System.out.println(c + "  valor pago=" + c.getValorPago(show.getPreco()));


		
		
		//joao participa do evento 1?
		System.out.println("\njoao participa do evento 1?");
		Evento evento = joao.localizar( 1 );
		if (evento != null) 
			System.out.println("sim");
		else
			System.out.println("nao");

		// Remover joao do show
		show.remover(joao);
		joao.remover(show);
		System.out.println("\njoao foi removido do show");
		System.out.println("\nPARTICIPANTES DO SHOW ");
		for(Participante p : show.getParticipantes())
			System.out.println(p.getNome());


		System.out.println("\ntotal de participantes da festa="+festa.getParticipantes().size());
		System.out.println("\ntotal de convidados da festa="+festa.contarConvidados());

		for(Convidado c : festa.getConvidados("empresa2"))
			System.out.println("\nconvidado para a festa da empresa2:"+c.getNome());
		
		System.out.println("Evento mais caro de Maria: "+maria.getEventoMaiorPreco());

	}

}
