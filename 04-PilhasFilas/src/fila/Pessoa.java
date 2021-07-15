package fila;

public class Pessoa {

    private String nome;
    private String telefone;
    private String email;

    public Pessoa() {
        this.nome = "seu nome";
        this.telefone = "xxxx-xxxx";
        this.email = "seuemail@email.com.br";
    }

    public Pessoa(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", telefone=" + telefone + ", email=" + email;
    }

}
