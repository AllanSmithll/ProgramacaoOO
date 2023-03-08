public class Matricula {
    private String matricula;
    
    public Matricula(String matric) {
        this.matricula = matric;
    }

    public String getAnoString() {
        // Retorna a substring Ano da matrícula
        return this.matricula.substring(0, 4); 
    }

    public String getPeriodoString() {
        return this.matricula.substring(4, 5);
    }

    public String getCodidoCursoString() {
        return this.matricula.substring(5, 7);
    }

    public String getSequenciaString() {
        return this.matricula.substring(7);
    }

}
