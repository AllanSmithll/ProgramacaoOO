// 01/02/2023
// Classe triangulo criada em sala de aula
import java.util.Objects;

public class Retangulo {
	private int id; // TODOS OS VALORES COMEÇAM COM 0
	private double largura;
	private double comprimento;
	
	public Retangulo(int id, double largura, double comprimento) {
		super();
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public Retangulo() {  }
	
	public double calcularArea() {
		return largura * comprimento;
	}

	// métodos get e set	
	public double getId() { return this.id; }
	public double getLargura() { return this.largura; }
	public double getComprimento() { return this.comprimento; }
	public void setId(int id) { this.id = id;}
	public void setLargura(double largura) { this.largura = largura;}
	public void setComprimento(double comprimento) { this.comprimento = comprimento;}

	// Método void não tem retorno
	public void enquadrar() {
		double media = (largura+comprimento) / 2;
		largura = media;
		comprimento = media;
	}
	
	public boolean isQuadrado() {
		if (largura == comprimento)
			return true;
		else
			return false;
	}

	public boolean isEquivalente(Retangulo outro) {
		if (this.calcularArea() == outro.calcularArea())
			return true;
		else
			return false;
	}

	// multiplicar o tamanho do retangulo
	public void resimensionar(double valor) {
		largura *= valor;
		comprimento *= valor;
	} 

	public void resimensionar(Retangulo retangulo) {
		largura = retangulo.largura;
		comprimento = retangulo.comprimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comprimento, id, largura);
	}

	// String das propriedades
	public String toString() {
		return "Retangulo [id = " + id + ", largura = " + largura + ", comprimento = " + comprimento + "]";
	}
	

 }


