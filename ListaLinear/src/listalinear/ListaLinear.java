package listalinear;

public class ListaLinear {
    private int tamMax = 10;
    private int indice = 0;
    private Pessoa lista[] = new Pessoa[tamMax];
    
    public void inserir(Pessoa pessoa) {
        if (indice == tamMax) 
            System.out.println("Lista cheia");
        else {
            lista[indice] = pessoa;
            indice++;
        }
    }
    
    public void inserir(int posicao, Pessoa pessoa) {
        
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
        return 0;
    }
    
    public void listarTodos() {
        for (int i=0; i<tamMax; i++)
            System.out.println(lista[i].toString());
    }
}
