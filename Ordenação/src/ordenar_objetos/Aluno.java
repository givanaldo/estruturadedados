package ordenar_objetos;

public class Aluno {

    private String nome;
    private String curso;
    private int idade;

    public Aluno(String nome, String curso, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int compareByNome(Aluno a) {
        return this.getNome().compareTo(a.getNome());
    }

    public int compareByCurso(Aluno a) {
        return this.getCurso().compareTo(a.getCurso());
    }

    public int compareByIdade(Aluno a) {
        return this.idade - a.idade;
    }

    @Override
    public String toString() {
        return "- " + nome + "(" + curso + ") - " + idade;
    }

}
