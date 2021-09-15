package lista03.q03;

public class Lista {
    private int tamMax;
    private int indice;
    private Produto lista[];

    public Lista() {
        this.tamMax = 100;
        this.indice = 0;
        this.lista = new Produto[this.tamMax];
    }

    public Lista(int tamMax) {
        this.tamMax = tamMax;
        this.indice = 0;
        this.lista = new Produto[this.tamMax];

    }
    
    public void inserir(Produto produto) {
        if (indice == tamMax) 
            System.out.println("Lista cheia");
        else {
            lista[indice] = produto;
            indice++;
        }
    }
    
    public void inserir(int posicao, Produto produto) {
        if (indice == tamMax) 
            System.out.println("Lista cheia");
        else {
            if (posicao < indice) {
                for (int i=indice-1; i>=posicao; i--)
                    lista[i+1] = lista[i];
                lista[posicao] = produto;
                indice++;
            }
        }
    }
    
    public Produto recuperar(int posicao) {
        return lista[posicao];
    }
    
    public void remover(int posicao) {
        if (posicao < indice) {
            for (int i=posicao; i<indice-1; i++)
                lista[i] = lista[i+1];
            indice--;
        }
    }
    
    public boolean contem(Produto produto) {
        for (int i=0; i<tamanho(); i++)
            if (produto.equals(lista[i]))
                return true;
        return false;
    }
    
    public int tamanho() {
        return indice;
    }
    
    public void listarTodos() {
    	System.out.println("Listagem");
        for (int i=0; i<tamanho(); i++)
            System.out.println(lista[i].toString());
        System.out.println();
    }    
}
