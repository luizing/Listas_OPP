package Q7_Alunos;

/*
 * Crie uma classe Aluno que possui os atributos matrícula, nome, ira e curso 
nessa mesma classe crie um construtor que receba valores como parâmetro para cada atributo da classe. 
 */

 public class Aluno {
    int matricula;
    String nome;
    double ira;
    String curso;

    public Aluno(int matricula, String nome, double ira, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.ira = ira;
        this.curso = curso;
    }

    // Getters
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getIra() {
        return ira;
    }

    public String getCurso() {
        return curso;
    }

    // Setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
