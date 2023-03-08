package Exercicio3;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public Aluno(String nome, int nota1, int nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return this.nome;
    }
    public int getMedia() {
        return ((int)nota1 + (int)nota2) / 2;
    }

    public String getSituacao() {
		int media = getMedia();
		if (media >= 70) {
			return "aprovado";
		}
		
		else if (media >= 40) {
			return "final";
			
		} else {
			return "reprovado";
		}
		
	}
}
