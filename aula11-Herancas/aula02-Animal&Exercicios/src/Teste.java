
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
	}

}
