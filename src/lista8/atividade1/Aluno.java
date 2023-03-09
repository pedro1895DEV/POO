package lista8.atividade1;

public class Aluno implements Comparable<Aluno>{
    private long matricula;
    private String nome;
    private String curso;

    public Aluno(long matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "\nMatrícula: " + matricula + "\nNome: " + nome + "\nCurso:" + curso;
    }

    @Override
    public int compareTo(Aluno o) {
        if(this.matricula > o.matricula){
            return 1;
        }
        if(this.matricula > o.matricula){
            return 0;
        }
        if(this.matricula < o.matricula){
            return -1;
        }
        return this.nome.compareTo(o.nome);
    }
}
