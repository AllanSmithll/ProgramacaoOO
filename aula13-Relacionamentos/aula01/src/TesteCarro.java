import carro_motor_motorista.Carro;
import carro_motor_motorista.Motor;
import carro_motor_motorista.Motorista;

public class TesteCarro {

	public static void main(String[] args) {
		Motor motor = new Motor("Zetec", 1.0);
		Motorista motorista = new Motorista("1111");
		Carro carro1 = new Carro("AAA1234", motor, motorista);
		
		// Carro 1
		System.out.println("Carro 1: "+carro1);
		
		// setPotencia()
		carro1.getMotor().setPotencia(1.4);
		System.out.println(carro1.getMotor().getPotencia());
		
		// Carro 2
		Carro carro2 = new Carro("XYZ2000", new Motor("Fire",1.6), carro1.getMotorista());
		System.out.println("Carro 2: "+carro2);
		
		// setCnh()
		carro1.getMotorista().setCnh("3333");
		System.out.println(carro2.getMotorista().getCnh());
		
		// null nos motoristas
		carro1.setMotorista(null);
		carro2.setMotorista(null);
		
		// Novos Motoristas
		carro1.setMotorista(new Motorista("4444"));
		carro2.setMotorista(new Motorista("5555"));

		System.out.println("Carro 1: "+carro1);
		System.out.println("Carro 2: "+carro2);
	}
}
