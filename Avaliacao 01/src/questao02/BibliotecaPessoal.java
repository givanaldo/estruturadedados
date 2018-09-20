package questao02;

public class BibliotecaPessoal {

    public static void main(String[] args) {
        Livro l1 = new Livro("A culpa é das estrelas", "John Green", "Intrínseca");
        Livro l2 = new Livro("Fortaleza Digital", "Dan Brown", "Arqueiro");
        Livro l3 = new Livro("Cinquenta tons de cinza", "E. L. James", "Intrínseca");
        Livro l4 = new Livro("O pequeno príncipe", "Antoine de Saint-Exupéry", "L&PM");

        Lista lista = new Lista();
        lista.inserir(l1);
        lista.inserir(l2);
        lista.inserir(l3);
        lista.inserir(l4);

        String titulo = "Fortaleza Digital";
        if (lista.contem(titulo)) {
            System.out.println("O livro " + titulo + " está no meu acervo.");
        } else {
            System.out.println("O livro " + titulo + " náo está no meu acervo.");
        }

        titulo = "Os Maias";
        if (lista.contem(titulo)) {
            System.out.println("O livro " + titulo + " está no meu acervo.");
        } else {
            System.out.println("O livro " + titulo + " não está no meu acervo.");
        }

        System.out.println();
        lista.listarTodos();

        System.out.println();
        titulo = "Cinquenta tons de cinza";
        Livro cinza = lista.recuperar(titulo);
        if (cinza != null) {
            System.out.println(cinza.toString());
        } else {
            System.out.println("Livro não existe.");
        }

        lista.remover(titulo);
        System.out.println();
        lista.listarTodos();

        System.out.println("\nQuantidade: " + lista.tamanho());
    }

}
