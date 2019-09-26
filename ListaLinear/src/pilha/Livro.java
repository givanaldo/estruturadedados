package pilha;

public class Livro {
    private String titulo;
    private String editora;

    public Livro(String titulo, String editora) {
        this.titulo = titulo;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "- " + titulo + "(Ed. " + editora + ")";
    }  
   
}
