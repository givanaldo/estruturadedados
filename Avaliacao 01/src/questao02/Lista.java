package questao02;

public class Lista {

    private int tamMax;
    private int indice = 0;
    private Livro[] lista;

    public Lista() {
        tamMax = 100;
        lista = new Livro[tamMax];
    }

    public Lista(int tamanho) {
        tamMax = tamanho;
        lista = new Livro[tamMax];
    }

    public void inserir(Livro livro) {
        if (indice < tamMax) {
            lista[indice] = livro;
            indice++;
        } else {
            System.out.println("Lista cheia.");
        }
    }

    public int tamanho() {
        return indice;
    }

    public void listarTodos() {
        for (int i = 0; i < indice; i++) {
            System.out.println(lista[i].toString());
        }
    }

    public boolean contem(String titulo) {
        for (int i = 0; i < indice; i++) {
            if (lista[i].getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }

    public Livro recuperar(String titulo) {
        for (int i = 0; i < indice; i++) {
            if (lista[i].getTitulo().equalsIgnoreCase(titulo)) {
                return lista[i];
            }
        }
        return null;
    }

    public void remover(String titulo) {
        int posicao = -1;
        for (int i = 0; i < indice; i++) {
            if (lista[i].getTitulo().equalsIgnoreCase(titulo)) {
                posicao = i;
                break;
            }
        }
        if (posicao != -1) {
            for (int i = posicao; i < indice - 1; i++) {
                lista[i] = lista[i + 1];
            }
            indice--;
            lista[indice] = null;
        }
    }
}
