// 01/02/2023
// Classe retangulo criada em sala de aula
package Exercicio1e2;

public class Retangulo {
	public double largura;
	public double comprimento;
	
	public Retangulo(double medidas) {
		super();
        this.comprimento = medidas;
		this.largura = medidas;
	}

	public String toString() {
		return "Retangulo [Largura=" + largura + "Comprimento=" + comprimento + "]";
	}
	
	public double calcularArea() {
		return largura * comprimento;
	}

	// public void enquadrar() {
	// 	double media = (Medidas) / 2;
	// }
	
	public boolean isQuadrado() {
		return true;
	}
	
    public double calcularPerimetro() {
        return (2*largura) + (2*comprimento);
    }

 }
