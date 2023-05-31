package carro_motor_motorista;

public class Motorista {
	private String cnh;
	
	public Motorista(String cnh) {
		super();
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	@Override
	public String toString() {
		return "Motorista [cnh=" + cnh + "]";
	}
}
