package pessoa_casa_aluguel;

public class Aluguel {
	private Casa casa;
	private Pessoa inquilino;
	
	public Aluguel(Casa casa, Pessoa inquilino) {
		super();
		this.casa = casa;
		this.inquilino = inquilino;
	}
	
	public double getValorAluguel() {
		return 0.003 * casa.getPrecoVenda();
	}
	
	public Casa getCasa() {
		return casa;
	}
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	public Pessoa getInquilino() {
		return inquilino;
	}
	public void setInquilino(Pessoa inquilino) {
		this.inquilino = inquilino;
	}
	@Override
	public String toString() {
		return "Aluguel [casa=" + casa + ", inquilino=" + inquilino + "]";
	}
}
