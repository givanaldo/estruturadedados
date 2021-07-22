package lista02.q07;

public class Aluno {

    private String matrícula;
    private String nome;
    private float média;

    public Aluno() {

    }

    public Aluno(String matrícula, String nome, float média) {
        this.matrícula = matrícula;
        this.nome = nome;
        this.média = média;
    }

    public String getMatrícula() {
        return this.matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMédia() {
        return this.média;
    }

    public void setMédia(float média) {
        this.média = média;
    }

    public int comparePorMatrícula(Aluno a) {
        return this.getMatrícula().compareTo(a.getMatrícula());
    }

    public int comparePorNome(Aluno a) {
        return this.getNome().compareTo(a.getNome());
    }

    public float comparePorMédia(Aluno a) {
        return this.média - a.média;
    }

    @Override
    public String toString() {
        return "- " + nome + " (" + matrícula + ") - " + média;
    }
}
