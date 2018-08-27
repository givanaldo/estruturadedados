package listalinear;

public class ListaContinua {
    private int tamMax;
    private int indice;
    private Pessoa lista[];

    public ListaContinua() {
        this.tamMax = 10;
        this.indice = 0;
        this.lista = new Pessoa[this.tamMax];
    }

    public ListaContinua(int tamMax) {
        this.tamMax = tamMax;
        this.indice = 0;
        this.lista = new Pessoa[this.tamMax];

    }
    
    public void inserir(Pessoa pessoa) {
        if (indice == tamMax) 
            System.out.println("Lista cheia");
        else {
            lista[indice] = pessoa;
            indice++;
        }
    }
    
    public void inserir(int posicao, Pessoa pessoa) {
        if (indice == tamMax) 
            System.out.println("Lista cheia");
        else {
            if (posicao < indice) {
                for (int i=indice-1; i>=posicao; i--)
                    lista[i+1] = lista[i];
                lista[posicao] = pessoa;
                indice++;
            }
        }
    }
    
    public Pessoa recuperar(int posicao) {
        return new Pessoa();
    }
    
    public void remover(int posicao) {
        
    }
    
    public boolean contem(Pessoa pessoa) {
        return false;
    }
    
    public int tamanho() {
        return indice;
    }
    
    public void listarTodos() {
        for (int i=0; i<tamanho(); i++)
            System.out.println(lista[i].toString());
    }    
}
