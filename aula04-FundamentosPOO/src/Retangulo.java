// 01/02/2023
// Classe triangulo criada em sala de aula
import java.util.Objects;

public class Retangulo {
	public int id; // TODOS OS VALORES COMEÇAM COM 0
	public double largura;
	public double comprimento;
	
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

	public String toString() {
		return "Retangulo [id = " + id + ", largura = " + largura + ", comprimento = " + comprimento + "]";
	}
	

 }


