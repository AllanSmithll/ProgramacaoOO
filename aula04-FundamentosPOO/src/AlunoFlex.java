// 20/03/2023
import java.util.Arrays;

public class AlunoFlex {

	 private String nome;
	 private double[] notas;

	 @Override
	public String toString() {
		return "AlunoFlex [nome=" + nome + ", notas=" + Arrays.toString(notas) + "]";
	}

	public AlunoFlex(String nome, double... n) {
	    this.nome = nome;
	    this.notas = n;
	    if(notas.length==0)
	    	System.out.println("Erro: notas inexistentes para o aluno" + this.getNome());
	 }

	    public double[] getNotas() {
		return notas;
	}

	public void setNotas(int ordem, double valor) {
		if(ordem > notas.length)
			System.out.println("Ordem fora da faixa de notas do aluno");
		else {
		int posicao = ordem-1;
		notas[posicao] = valor;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

		public String getNome() {
	        return this.nome;
	    }
	    
	    public int getMedia() {
	    	int somaNotas = 0;
			for (double n : notas) {
	    		 somaNotas += n;
	    	}
	    	
	    	//return (int)somaNotas / notas.length;
			return (int)Math.round(somaNotas/notas.length);
	    }

	    public String getSituacao() {
			int media = getMedia();
			if (media >= 70)
				return "aprovado";
			
			else if (media >= 40) {
				return "final";
				
			} 
			
			else {
				return "reprovado";
			}

	    }
}
