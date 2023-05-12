
public class Teste {

	public static void main(String[] args) {
		//instanciar os objetos
		Gato fifi = new Gato("fifi", 5, 3);
		Cachorro rex = new Cachorro("rex", 15);
		Bode juju = new Bode("juju", 30);
		Veterinario bob = new Veterinario("Bob");
		Veterinario amanda = new Veterinario("Amanda");
		
		//exibir nome, peso e som dos objetos
		System.out.println(rex.toString()); //”rex 15 au au”
		System.out.println(fifi.toString()); //”fifi 5 miau”
		System.out.println(juju.toString()); //"juju 30 beehhh
		
		// Teste veterinário
		System.out.println( bob.aplicarInjecao(fifi) ) ;
		System.out.println( bob.aplicarInjecao(rex) );
		System.out.println(amanda.aplicarInjecao(juju));
		
		// Teste com ArrayList<>
		ArrayList<Animal> animais = new ArrayList<>();
		animais.add(new Cachorro("rex",7));
		animais.add( new Gato("fifi",3, 5) );
		animais.add( new Cachorro("lessy", 4) );
		animais.add( new Gato("nino", 6, 2) );
		
		for (Animal a : animais){
			System.out.println( a );
		}
		
		//exibir o animal mais pesado
		double maxpeso = 0;
		Animal maispesado = null;
		for (Animal a : animais)
			if(a.getPeso() >= maxpeso){
				maxpeso = a.getPeso();
				maispesado = a;
		}
		System.out.println("\nAnimal mais pesado: "+ maispesado ); //nome=rex, peso=7.0, som= au au
		
		int cont=0;
		for (Animal a : animais){
			if(a instanceof Gato)
				cont++;
		}
		System.out.println( cont ); //2
	}

}
