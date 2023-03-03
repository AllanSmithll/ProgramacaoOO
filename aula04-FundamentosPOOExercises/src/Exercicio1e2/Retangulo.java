// 01/02/2023
// Classe triangulo criada em sala de aula
package Exercicio1e2;

import java.util.Objects;

public class Retangulo {
	public double Medidas;
	
	public Retangulo(double medidas) {
		super();
        this.Medidas = medidas;
	}

    @Override
	public int hashCode() {
		return Objects.hash(Medidas);
	}

	public String toString() {
		return "Retangulo [Medidas=" + Medidas + "]";
	}
	
	public double calcularArea() {
		return Medidas*2;
	}

	// public void enquadrar() {
	// 	double media = (Medidas) / 2;
	// }
	
	public boolean isQuadrado() {
		return true;
	}
	
    public double calcularPerimetro() {
        return (4*Medidas);
    }

 }
