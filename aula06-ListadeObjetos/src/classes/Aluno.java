// 22/03/2023

package classes;

public class Aluno {
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public Aluno(int matricula, String nome) {
    	this.matricula = String.valueOf(matricula);
    	this.nome = nome;
    }
    
    public Aluno(String matricula, String nome) {
    	this.matricula = matricula;
    	this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String getMatricula() {
    	return this.matricula;
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

