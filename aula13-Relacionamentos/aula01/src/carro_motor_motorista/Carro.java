package carro_motor_motorista;

public class Carro {
	private String placa;
	private Motor motor;
	private Motorista motorista;
	
	public Carro(String placa, Motor motor, Motorista motorista) {
		this.placa = placa;
		this.motor = motor;
		this.motorista = motorista;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", motor=" + motor + ", motorista=" + motorista + "]";
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
}
